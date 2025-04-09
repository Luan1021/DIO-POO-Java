import java.util.HashMap;
import java.util.Map;


public class AgendaContatos {
    
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }
     
    public Integer pesquisarPorNome(String nome){
       Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
       // agendaContatos.exibirContatos();
        
        agendaContatos.adicionarContato("Luan", 123456);
        agendaContatos.adicionarContato("Luan", 0);
        agendaContatos.adicionarContato("Luan Cardoso", 111111);
        agendaContatos.adicionarContato("Luan 010", 678998);
        agendaContatos.adicionarContato("Cintia", 111111);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Cintia");
        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Luan 010"));
    
    }
}

