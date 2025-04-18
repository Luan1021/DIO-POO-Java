import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato (String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContato();
        
        agendaContato.adicionarContato("Luan", 123456);
        agendaContato.adicionarContato("Luan", 0);
        agendaContato.adicionarContato("Luan Cardoso", 111111);
        agendaContato.adicionarContato("Luan 010", 678998);
        agendaContato.adicionarContato("Cintia", 111111);

        agendaContato.exibirContato();
        System.out.println(agendaContato.pesquisarPorNome("Luan"));

        System.out.println("Contato atualizado: " + agendaContato.atualizarNumeroContato("Cintia", 5555555));
    }
}
    

