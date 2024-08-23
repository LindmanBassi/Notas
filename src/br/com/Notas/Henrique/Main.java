package br.com.Notas.Henrique;

public class Main {
    public static void main(String[] args) {
        ListaDeNotas lista = new ListaDeNotas();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario(lista);
        while (true) {
            interfaceUsuario.menu();
            int opcao = interfaceUsuario.escolherOpcao();

            switch (opcao)
            {
                case 1:
                    interfaceUsuario.percorrerNotas();
                    break;
                case 2:
                    Notas novaNota = interfaceUsuario.criarNota();
                    lista.adicionarNota(novaNota);
                    break;

                case 3:
                   interfaceUsuario.percorrerNotas();
                   interfaceUsuario.excluirNota();
                    break;
                case 4:
                    interfaceUsuario.atualizarNotas();
                    break;
                case 5:
                    interfaceUsuario.exibirNota();
                    break;
                case 6:
                    interfaceUsuario.sairMenu();
                    return;
            }
        }
    }
}
