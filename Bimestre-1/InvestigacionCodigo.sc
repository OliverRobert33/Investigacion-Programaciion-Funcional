
def integracion(f: Double => Double, a:Double, b:Double): Double =
  (b-a) * (( f(a) + (4 * f((a+b)/2)) + f(b) )/6)

//CALCULAR EL ERROR
def calError(valorEsperado: Double, valorObtenido:Double): Double =
  math.abs(valorEsperado- valorObtenido)

// Integral 1
val funcion1: Double => Double = (x: Double) => -math.pow(x,2) + 8*x - 12
val res1: Double = integracion(funcion1, 3, 5)
val valorEsperado1: Double = 7.33
val error1: Double = calError(valorEsperado1, res1)
//SALIDA: 7.33

// Integral 2
val funcion2: Double => Double  = (x: Double) => (3 * math.pow(x,2))
val res2: Double = integracion(funcion2, 0, 2)
val valorEsperado2: Double = 8
val error2: Double = calError(valorEsperado2, res2)
//Salida 8.0

//Integral 3
val funcion3: Double => Double  = (x:Double) => (x + (2 * math.pow(x,2)) - math.pow(x,3)  + ( 5 * math.pow(x, 4)))
val res3: Double =integracion(funcion3, -1, 1)
val valorEsperado3: Double = 3.333
val error3: Double = calError(valorEsperado3, res3)
//Salida: 4.666666666666667

//Integral 4
val funcion4: Double => Double  =(x:Double) => ((2*x) + 1) / ((math.pow(x, 2)) + x)
val res4: Double =integracion(funcion4,1,2)
val valorEsperado4: Double = 1.09861
val error4:  Double = calError(valorEsperado4, res4)
//Salida: 1.0999999999999999

//Integral 5
val funcion5: Double => Double  =(x:Double) => math.pow(Math.E, x)
val res5: Double =integracion(funcion5,0,1)
val valorEsperado5: Double = 1.71828
val error5 : Double = calError(valorEsperado5, res5)
//Salida: 1.7188611518765928

//Integral 6
val funcion6: Double => Double  =(x:Double) => 1 / math.sqrt(x -1)
val res6: Double =integracion(funcion6, 2,3)
val valorEsperado6: Double = 0.82842
val error6: Double = calError(valorEsperado6, res6)
//Salida:  0.8288488508162422

//Integral 7
val funcion7: Double => Double  = (x:Double) =>  1 / (1 + math.pow(x,2))
val res7: Double = integracion(funcion7, 0,1)
val valorEsperado7: Double = 0.785398
val error7 : Double = calError(valorEsperado7, res7)
// Salida: 0.7833333333333333






