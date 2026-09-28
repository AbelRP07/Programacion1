Algoritmo AdivinaElNumero
	
    Definir numero, intento Como Entero
	
    numero <- Aleatorio(1, 100)
	
    Escribir "=== ADIVINA EL NUMERO ==="
    Escribir "He pensado un numero entre 1 y 100."
    Escribir "Intenta adivinarlo."
	
    Repetir
        Leer intento
		
        Si intento < numero Entonces
            Escribir "El numero es MAYOR."
        SiNo
            Si intento > numero Entonces
                Escribir "El numero es MENOR."
            SiNo
                Escribir "¡CORRECTO! Has ganado."
            FinSi
        FinSi
		
    Hasta Que intento = numero
	
FinAlgoritmo