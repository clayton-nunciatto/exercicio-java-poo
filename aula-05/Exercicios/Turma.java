/*
Desafio 🌶️ Aluno.java + Turma.java — refaça o Desafio da Aula 04 (boletim de 3 alunos) 
usando a classe Aluno com construtor, um Aluno[] e um laço. No fim do arquivo, 
escreva num comentário quantas linhas cada versão tem e o que ficou mais fácil de mudar.
*/

public class Turma {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[] {
            new Aluno("Ana", 8.5, 7.0),
            new Aluno("Bruno", 5.0, 6.0),
            new Aluno("Carla", 9.0, 9.5)
        };

        System.out.println("--- BOLETIM DA TURMA ---");
        for (Aluno aluno : alunos) {
            aluno.exibirBoletim();
        }
    }
}

/*
 * COMPARAÇÃO DE LINHAS E MANUTENÇÃO:
 * 
 * - Versão Aula 04 (Estruturada com arrays paralelos/variáveis avulsas e prints manuais): ~45 linhas.
 * - Versão Aula 05 (POO com classe Aluno + Turma): ~35 linhas no total (somando Aluno.java e Turma.java).
 * 
 * O que ficou mais fácil de mudar com a orientação a objetos:
 * 1. Adicionar um novo aluno exige apenas instanciar um novo objeto (ou adicionar um item no array), 
 *    sem precisar criar variáveis soltas para cada nota.
 * 2. Se a regra de aprovação mudar (ex: média passar de 7.0 para 6.0), você altera apenas em um lugar 
 *    (método obterStatus na classe Aluno), em vez de alterar em múltiplos laços de repetição ou prints.
 * 3. A estrutura fica mais organizada e legível, eliminando a necessidade de manter múltiplos vetores paralelos
 *    (um para nomes, outro para nota1, outro para nota2).
 */