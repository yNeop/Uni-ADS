// Historia do Java
package Curso_Guanabara.Class;
// @author Cauã Sousa
public class Aula01 {
    public static void main(String[] args) {
        int ano = 1990;
        String empresa = "Sun microsystems";
        String time = "Green Team"; // Referencia ao Dream Team do Futebol
        String ProjetoJava = "Green Talk";

        System.out.print("\n");
        System.out.println("A " + empresa + " com seu time " + time + " criou a linguagem "
        + ProjetoJava + " que depois foi rebatizada ainda na epoca dos anos " + ano);

        String JavaRename1 = "Oak";

        System.out.println("O novo nome daquela lingaguem logo se tornou: " + JavaRename1);
        System.out.println();

        int ano2 = 1991;
        String ProjetoStar7 = "*7 ou Star Seven";
        String Ideia = "Interatividade com outros dispositivos";
        String Resultado = "Fracasso";

        System.out.println("No ano de " + ano2 + " o projeto " + ProjetoStar7 + " resultou em " + Resultado +
        " e seu objetivo era de trazer " + Ideia);
        System.out.println();
        // Eles se juntaram com o criador do HTML e criaram o primeiro navegador de internet: Webrunner
        // O nome Oak já estava registrado, mudaram o nome de ultima hora para Java (Java = Café Forte)
        String Java = "Java";

        System.out.println("Ao lançamento da linguagem, seu nome foi alterado para " + Java +
        " pois o nome " + JavaRename1 + " já estava em uso");
        System.out.println();
    }
}