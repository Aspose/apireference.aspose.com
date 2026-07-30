---
title: "Matriz de Transformación"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa una matriz 3x3  A   B   0   C   D   0   TX  TY  1 ."
type: docs
weight: 78
url: /es/java/com.aspose.font/transformationmatrix/
---
**Inheritance:**
java.lang.Object
```
public class TransformationMatrix
```

Representa una matriz 3x3 | A B 0 | | C D 0 | | TX TY 1 |. Transforma las coordenadas de la siguiente manera: x1 = A\*x + C\*y + TX y1 = B\*x + D\*y + TY.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [TransformationMatrix()](#TransformationMatrix--) | Crea una matriz estándar 1 a 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0] |
| [TransformationMatrix(double[] matrixArray)](#TransformationMatrix-double---) | Acepta una matriz de transformación con la siguiente representación de arreglo: [ A B C D TX TY ] |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Proporciona acceso al arreglo subyacente. |
| [getA()](#getA--) | Obtiene el valor A de la matriz de transformación. |
| [getB()](#getB--) | Obtiene el valor B de la matriz de transformación. |
| [getC()](#getC--) | Obtiene el valor C de la matriz de transformación. |
| [getClass()](#getClass--) |  |
| [getD()](#getD--) | Obtiene el valor D de la matriz de transformación. |
| [getTX()](#getTX--) | Obtiene el valor TX de la matriz de transformación. |
| [getTY()](#getTY--) | Obtiene el valor TY de la matriz de transformación. |
| [hashCode()](#hashCode--) |  |
| [multiply(TransformationMatrix matrix)](#multiply-com.aspose.font.TransformationMatrix-) | Multiplica con otra matriz de transformación. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [scale(double x, double y, double[] x1, double[] y1)](#scale-double-double-double---double---) | Escala x e y con la matriz de transformación: x1 = A\*x + C\*y; y1 = B\*x + D\*y. |
| [setA(double value)](#setA-double-) | Establece el valor A de la matriz de transformación. |
| [setB(double value)](#setB-double-) | Establece el valor B de la matriz de transformación. |
| [setC(double value)](#setC-double-) | Establece el valor C de la matriz de transformación. |
| [setD(double value)](#setD-double-) | Establece el valor D de la matriz de transformación. |
| [setTX(double value)](#setTX-double-) | Establece el valor TX de la matriz de transformación. |
| [setTY(double value)](#setTY-double-) | Establece el valor TY de la matriz de transformación. |
| [toArray()](#toArray--) | Asigna un nuevo arreglo, copia la matriz de transformación y lo devuelve. |
| [toString()](#toString--) |  |
| [transform(double x, double y, double[] x1, double[] y1)](#transform-double-double-double---double---) | Transforma x e y con la matriz de transformación: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY. |
| [unScale(double x1, double y1, double[] x, double[] y)](#unScale-double-double-double---double---) | Escala de vuelta x1 y y1 y devuelve x e y antes de la matriz de transformación. |
| [unTransform(double x1, double y1, double[] x, double[] y)](#unTransform-double-double-double---double---) | Transforma de vuelta x1 y y1 y devuelve x e y antes de la matriz de transformación. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformationMatrix() {#TransformationMatrix--}
```
public TransformationMatrix()
```


Crea una matriz estándar 1 a 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]

### TransformationMatrix(double[] matrixArray) {#TransformationMatrix-double---}
```
public TransformationMatrix(double[] matrixArray)
```


Acepta una matriz de transformación con la siguiente representación de arreglo: [ A B C D TX TY ]

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| matrixArray | double[] | Arreglo con valores de la matriz de transformación, debe tener 6 elementos. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public double get(int index)
```


Proporciona acceso al arreglo subyacente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| índice | int | Índice en el arreglo de la matriz de transformación. |

**Returns:**
double - El elemento del arreglo subyacente por índice.
### getA() {#getA--}
```
public double getA()
```


Obtiene el valor A de la matriz de transformación.

**Returns:**
double - Un valor de la matriz de transformación.
### getB() {#getB--}
```
public double getB()
```


Obtiene el valor B de la matriz de transformación.

**Returns:**
double - Valor de la matriz de transformación B.
### getC() {#getC--}
```
public double getC()
```


Obtiene el valor C de la matriz de transformación.

**Returns:**
double - Valor de la matriz de transformación C.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getD() {#getD--}
```
public double getD()
```


Obtiene el valor D de la matriz de transformación.

**Returns:**
double - Valor de la matriz de transformación D.
### getTX() {#getTX--}
```
public double getTX()
```


Obtiene el valor TX de la matriz de transformación.

**Returns:**
double - Valor de la matriz de transformación TX.
### getTY() {#getTY--}
```
public double getTY()
```


Obtiene el valor TY de la matriz de transformación.

**Returns:**
double - Valor de la matriz de transformación TY.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### multiply(TransformationMatrix matrix) {#multiply-com.aspose.font.TransformationMatrix-}
```
public TransformationMatrix multiply(TransformationMatrix matrix)
```


Multiplica con otra matriz de transformación. No cambia la matriz de transformación original, devuelve un nuevo objeto TransformationMatrix.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matriz de transformación con la que multiplicar. |

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - New TransformationMatrix object.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### scale(double x, double y, double[] x1, double[] y1) {#scale-double-double-double---double---}
```
public void scale(double x, double y, double[] x1, double[] y1)
```


Escala x e y con la matriz de transformación: x1 = A\*x + C\*y; y1 = B\*x + D\*y.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | double | Coordenada x original |
| y | double | Coordenada y original. |
| x1 | double[] | Coordenada x escalada. |
| y1 | double[] | Coordenada y escalada. |

### setA(double value) {#setA-double-}
```
public void setA(double value)
```


Establece el valor A de la matriz de transformación.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | double | Valor de la matriz de transformación A. |

### setB(double value) {#setB-double-}
```
public void setB(double value)
```


Establece el valor B de la matriz de transformación.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | double | Valor de la matriz de transformación B. |

### setC(double value) {#setC-double-}
```
public void setC(double value)
```


Establece el valor C de la matriz de transformación.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | double | Valor de la matriz de transformación C. |

### setD(double value) {#setD-double-}
```
public void setD(double value)
```


Establece el valor D de la matriz de transformación.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | double | Valor de la matriz de transformación D. |

### setTX(double value) {#setTX-double-}
```
public void setTX(double value)
```


Establece el valor TX de la matriz de transformación.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | double | Valor de la matriz de transformación TX. |

### setTY(double value) {#setTY-double-}
```
public void setTY(double value)
```


Establece el valor TY de la matriz de transformación.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | double | Valor de la matriz de transformación TY. |

### toArray() {#toArray--}
```
public double[] toArray()
```


Asigna un nuevo arreglo, copia la matriz de transformación y lo devuelve.

**Returns:**
double[] - TransformationMatrix en forma de arreglo.
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(double x, double y, double[] x1, double[] y1) {#transform-double-double-double---double---}
```
public void transform(double x, double y, double[] x1, double[] y1)
```


Transforma x e y con la matriz de transformación: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x | double | Coordenada x original. |
| y | double | Coordenada y original. |
| x1 | double[] | Coordenada x transformada. |
| y1 | double[] | Coordenada y transformada. |

### unScale(double x1, double y1, double[] x, double[] y) {#unScale-double-double-double---double---}
```
public void unScale(double x1, double y1, double[] x, double[] y)
```


Escala de vuelta x1 y y1 y devuelve x e y antes de la matriz de transformación.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x1 | double | Coordenada x1 |
| y1 | double | Coordenada y1 |
| x | double[] | Coordenada x reescalada. |
| y | double[] | Coordenada y reescalada. |

### unTransform(double x1, double y1, double[] x, double[] y) {#unTransform-double-double-double---double---}
```
public void unTransform(double x1, double y1, double[] x, double[] y)
```


Transforma de vuelta x1 y y1 y devuelve x e y antes de la matriz de transformación.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| x1 | double | Coordenada x1. |
| y1 | double | Coordenada y1. |
| x | double[] | Coordenada x transformada de nuevo. |
| y | double[] | Coordenada y transformada de nuevo. |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

