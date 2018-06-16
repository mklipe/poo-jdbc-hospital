
import modelo.Endereco;
import modelo.Paciente;
import modelo.Plano;
import modelo.enums.StatusPaciente;
import negocio.EnderecoNegocio;
import negocio.PacienteNegocio;
import negocio.PlanoNegocio;

public class TesteCadastroPaciente {
    
    public static void main(String[] args) {
        testeCadastroConsole();
    }
    
    public static void testeCadastro(){
        Endereco endereco = testeCadastrarEndereco();
        Plano plano = testeCadastrarPlano();
        System.out.println("Plano: " + plano.getCodigo());
        testeCadastrarPaciente(endereco, plano);
    }
    
    public static void testeCadastroConsole(){
        Console console = new Console();
        Paciente paciente = console.lerNovoPaciente();
        
        EnderecoNegocio en = new EnderecoNegocio();
        en.cadastrar(paciente.getEndereco());
        
        PlanoNegocio pn = new PlanoNegocio();
        pn.cadastrar(paciente.getPlano());
        
        PacienteNegocio p = new PacienteNegocio();
        p.cadastrar(paciente);
        
        System.out.println("Cadastrado com sucesso!");
        
    }
    
    public static void testeCadastrarPaciente (Endereco endereco, Plano plano) {
        PacienteNegocio pn = new PacienteNegocio();
        
        Paciente paciente = new Paciente();
        paciente.setNome("Peter Pan");
        paciente.setCpf("088.765.899-98");
        paciente.setDataNascimento(26, 07, 1990);
        
        paciente.setEndereco(endereco);
        paciente.setPlano(plano);
        paciente.setStatusPaciente(StatusPaciente.ATIVO);
        
        pn.cadastrar(paciente);
        
    }

    private static Endereco testeCadastrarEndereco() {
        EnderecoNegocio en = new EnderecoNegocio();
        Endereco endereco = new Endereco();
        
        endereco.setBairro("Centro");
        endereco.setNumero("104B");
        endereco.setCep("78050-050");
        endereco.setLogradouro("Rua R");
        
        en.cadastrar(endereco);
        
        return endereco;
    }

    private static Plano testeCadastrarPlano() {
        PlanoNegocio pn = new PlanoNegocio();
        Plano plano = new Plano();
        
        plano.setMensalidade(750.90F);
        plano.setNome("MEDIO");
        
        pn.cadastrar(plano);
        
        return plano;
    }
    
}
