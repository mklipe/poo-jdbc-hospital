
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import modelo.Endereco;
import modelo.Medico;
import modelo.Paciente;
import modelo.Plano;

/**
 *
 * @author mauricio
 */
public final class Console {

    private Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    public String lerTexto() {

        String texto = scanner.nextLine();

        return texto;
    }

    public Paciente lerNovoPaciente() {

        Paciente paciente = new Paciente();
        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();
        paciente.setCpf(cpf);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        paciente.setNome(nome);

        paciente.setEndereco(lerEndereco());

        System.out.println("Digite a data de nascimento(dd/mm/aaaa): ");

        paciente.setDataNascimento(lerData());

        paciente.setPlano(lerPlano());

        return paciente;
    }

    public Paciente lerPacienteAlteracao(String cpf) {

        Paciente paciente = new Paciente();
        paciente.setCpf(cpf);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        paciente.setNome(nome);

        paciente.setEndereco(lerEndereco());

        return paciente;
    }

    public Paciente nomeDataPaciente() {

        Paciente paciente = new Paciente();

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        paciente.setNome(nome);

        System.out.println("Digite a data de nascimento(dd/mm/aaaa): ");
       
        paciente.setDataNascimento(lerData());

        return paciente;
    }

    public Medico lerNovoMedico() {

        Medico medico = new Medico();
        System.out.println("Digite o CRM: ");
        String crm = scanner.nextLine();
        medico.setCrm(crm);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        medico.setNome(nome);

        medico.setEndereco(lerEndereco());

        System.out.println("Digite a data de nascimento(dd/mm/aaaa): ");
        medico.setDataNascimento(lerData());

        System.out.println("Digite o valor da hora(separado por ponto): ");
        String valor = scanner.nextLine();
        medico.setValorHora(Double.parseDouble(valor));

        /*System.out.println("Digite até 3 especialidades(somente o nome e separadas por virgula): ");
        String especialidades = scanner.nextLine();
        medico.setEspecialidades(ConversoraEspecialidade.converterEspecialidades(especialidades));
        */
        return medico;
    }

    public Medico lerMedicoAlteracao(String crm) {

        Medico medico = new Medico();
        medico.setCrm(crm);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        medico.setNome(nome);

        medico.setEndereco(lerEndereco());

        System.out.println("Digite o valor da hora(separado por ponto): ");
        String valor = scanner.nextLine();
        medico.setValorHora(Double.parseDouble(valor));

        return medico;
    }

    private Endereco lerEndereco() {
        Endereco endereco = new Endereco();

        System.out.println("Digite o endereço: ");
        System.out.println("Logradouro (nome da rua): ");
        endereco.setLogradouro(scanner.nextLine());

        System.out.println("Número da casa: ");
        endereco.setNumero(scanner.nextLine());

        System.out.println("Nome do bairro: ");
        endereco.setBairro(scanner.nextLine());

        System.out.println("CEP: ");
        endereco.setCep(scanner.nextLine());

        return endereco;
    }

    private Plano lerPlano() {
        Plano plano = new Plano();

        System.out.println("Digite o nome do plano: ");
        plano.setNome(scanner.nextLine());

        System.out.println("Digite o valor do plano: ");
        plano.setMensalidade(Float.parseFloat(scanner.nextLine()));

        return plano;
    }

    private Calendar lerData() {
        String entrada = scanner.nextLine();

        Calendar data = GregorianCalendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, Integer.parseInt(entrada.split("/")[0]));
        data.set(Calendar.MONTH, Integer.parseInt(entrada.split("/")[1])-1);
        data.set(Calendar.YEAR, Integer.parseInt(entrada.split("/")[2]));
        

        return data;
    }
}
