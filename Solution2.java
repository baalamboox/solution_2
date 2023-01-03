//Se crea una clase (class) publica (public), llamada "Solution".
public class Solution {
	//Se crea un field de tipo entero (int), estatico (static) y publico (public) llamado "obtenerUltimoElemento" y se inicializa en "0", aqui es donde se guardara el elemento de la ultima posicion de arreglo con cada iteracion.
	public static int obtenerUltimoElemento = 0;
	//Se define un metodo de tipo publico (public), de tipo estatico (static) y que retorna un objeto de tipo entero (int) que es un arreglo (array), el metodo se llama "solution" y va a tener como parametros un arreglo (array) de tipo entero y una varible de tipo entero (int) llamda k.
	public static int[] solution(int[] A, int K) {
		//Se genera una estructura de iteracion, el obetivo de esta es hacer la vuelta que indique el usuario.
		for(int i = 1; i <= K; i++) {
			obtenerUltimoElemento = A[A.length - 1]; //En la variable "obtenerUltimoElemento" se le asigna el ultimo elemento del arreglo (array), con cada iteracion el valor sera diferente.
			//Se crea un estructura de iteracion para ir recorriendo de derecha a izquierda los elementos del arreglo (array).
			for(int j = (A.length - 1); j >= 1; j--) {
				A[j] = A[j - 1]; //En la posicion "j" del arreglo A (array), se le asigna el elemento que se encuentre en el arreglo A (array) en la posicion "j - 1".
			}
			A[0] = obtenerUltimoElemento; //El la primera posicion del arreglo A (array), se le asigna el valor del ultimo elemento que se guardo con anterioridad.
		}
	}
	//Se crea el metodo principal que empezara la ejecucion del programa.
	public static void main(String[] args) {
		//Se crea un arreglo (array) con n elementos de tipo entero (int).
		int[] A = {1, 2, 3, 4};
		int K = 4; //Se crea una variable de tipo entero (int) llamda K, que repesenta el numero de vueltas o movimiento que debe de hacer el arreglo (array).
		A = solution(A, K); //Al arreglo A (array) se le asigna lo que devuelva el metodo "solution" pasandole como paramentros al arreglo A (array) y a K.
		//Con un estructura de iteracion, se emplea para leer cada elemento del arreglo A (array).
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " "); //Muestra en pantalla cada elemento del arreglo A (array).
		}
	}
}
/*
	public -> Ademas de ser una palabra reservada (keyword), es un modificador de acceso, esto quiere decir que la clase, metodo o field que lo contenga se va poder acceder dentro y fuera de la clase o desde otra entidad programatica.
	class -> Tambien es una palabra reservada (keyword), define un espacio de trabajo donde estaran metodos y variables (locales y fields).
	static -> Es un modificador de ambito, tambien es una palabra reservda (keyword) y sirve para hacer uso de quien lo contenga (fields y metodos) si necesidad de crar un objeto de la clase y sin hacer referencia a ningun otro.
	int -> Representa que es un valor primitivo de tipo entero, se trabaja en la memoria llamda "stack".
	= -> Es conocido como operador de asignacion, sirve para asignar lo que contenga a su lado derecho.
	; -> Se utiliza para identificar hasta a donde termina cada intrucion, conocido como fin de instruccion.
	for -> Es una estructura de iteracion y va repetir lo que contenga dentro de ella siempre y cuando en su apartado de condicion sea verdadera.
	<= -> Operador relacional, sirve para comparar entre dos valores numericos, si uno es menor o igual que otro.
	>= -> Operador relacional, sirve para comparar entre dos valores numericos, si uno es mayor o igual que otro.
	+ -> Operador aritmetico, tiene dos funciones, sirve tanto para realizar la operacion de suma o tambien es usado para realizar concatenaciones.
	- -> Operador aritmetico, tiene la funcion de realizar la operacion de resta.
	++ -> Operador incremental, esto sirve para ir incrementando en una unidad una variable numerica, es lo mismo que tener: (x = x + 1).
	-- -> Operador decremental, esto srive para ir decrementado en una unidad una variable numerica, es lo mismo que tener: (x = x - 1).
	[] -> Definen un objeto llamda arreglo (array).
	length -> Obtiene la longitud de un array de devuelve un valor de tipo entero (int).
	void -> Se utiliza para referirse que un metodo no devolvera ningun valor despues de concluir.
	main -> Es una palabra reservada (keyword) y denota que es el metodo principal, donde empezara la ejecución de todo el programa.
	String[] -> Denota un arreglo (array) de tipo String, al tratarse de un objeto se trabaja en la memoria "heap" y solo se almacena en la memoria "stack" la ruta en hexdecimal de la direccion de memoria heap donde se encuentre ese objeto.
	{ -> Identifica donde empieza cada bloque de codigo ya sea de una clase o un metodo (apertura de implemetacion).
	} -> Identifica donde finaliza cada bloque de codigo.
	, -> Separa una grupacion del mismo tipo.
	() -> Ya sea que se usen para denotar que es un metodo y dentro de ellas van su paramentros o para agrupar (agrupacion) operaciones aritmenticas para darle jerarquia de quien se empezara a resolver primero.
	"" -> Se usan para cadenas de texto.
	println -> Es un metodo para imprimir en pantalla, este metodo le pertenece a la field "out" que a su ves esta contiene un metodo de la clase "printStrem" y que a la vez la varible "out" pertenece a la clase "System".
	System -> Es una clase donde contiene diferentes fields y metodos que van a permitir interactuar con el sistema.
*/