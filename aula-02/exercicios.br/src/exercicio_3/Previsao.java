/*
 Previsao.java — antes de rodar, escreva num comentário o que cada linha imprime; depois execute e confira:
 */

// System.out.println(7 / 2); o resultado desta divisão é um número inteiro (3), devido ambos membros serem inteiros
// System.out.println(7 / 2.0); o resultado desta divisão é um número float (3.5), devido um dos menbros ser float
// System.out.println(7 % 2); o resultado desta operação é (1), devido o simbolo de % representar o resto da divisão
// System.out.println((int) 7.9); esta operação é um cast, resultado (7), transforma um tipo em outro tipo, neste caso de float para inteiro
// System.out.println(10 / 4 * 4); 10 / 4 = 2, pois ambos números são inteiros, então o resultado é inteiro, depois multiplica 2 por 4 e o resultado final é (8)

package exercicio_3;
public class Previsao {
	public static void main(String[] args) {
		System.out.println(7 / 2);
		System.out.println(7 / 2.0);
		System.out.println(7 % 2);
		System.out.println((int) 7.9);
		System.out.println(10 / 4 * 4);
	}
}
