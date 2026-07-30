---
title: "Matrice di trasformazione"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta una matrice 3x3  A   B   0   C   D   0   TX  TY  1 ."
type: docs
weight: 78
url: /it/java/com.aspose.font/transformationmatrix/
---
**Inheritance:**
java.lang.Object
```
public class TransformationMatrix
```

Rappresenta una matrice 3x3 | A B 0 | | C D 0 | | TX TY 1 |. Trasforma le coordinate nel modo seguente: x1 = A\*x + C\*y + TX y1 = B\*x + D\*y + TY.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [TransformationMatrix()](#TransformationMatrix--) | Crea una matrice standard 1 a 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0] |
| [TransformationMatrix(double[] matrixArray)](#TransformationMatrix-double---) | Accetta una matrice di trasformazione con la seguente rappresentazione di array: [ A B C D TX TY ] |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Fornisce l'accesso all'array sottostante. |
| [getA()](#getA--) | Ottiene il valore A della matrice di trasformazione. |
| [getB()](#getB--) | Ottiene il valore B della matrice di trasformazione. |
| [getC()](#getC--) | Ottiene il valore C della matrice di trasformazione. |
| [getClass()](#getClass--) |  |
| [getD()](#getD--) | Ottiene il valore D della matrice di trasformazione. |
| [getTX()](#getTX--) | Ottiene il valore TX della matrice di trasformazione. |
| [getTY()](#getTY--) | Ottiene il valore TY della matrice di trasformazione. |
| [hashCode()](#hashCode--) |  |
| [multiply(TransformationMatrix matrix)](#multiply-com.aspose.font.TransformationMatrix-) | Moltiplica con un'altra matrice di trasformazione. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [scale(double x, double y, double[] x1, double[] y1)](#scale-double-double-double---double---) | Scala x e y con la matrice di trasformazione: x1 = A\*x + C\*y; y1 = B\*x + D\*y. |
| [setA(double value)](#setA-double-) | Imposta il valore A della matrice di trasformazione. |
| [setB(double value)](#setB-double-) | Imposta il valore B della matrice di trasformazione. |
| [setC(double value)](#setC-double-) | Imposta il valore C della matrice di trasformazione. |
| [setD(double value)](#setD-double-) | Imposta il valore D della matrice di trasformazione. |
| [setTX(double value)](#setTX-double-) | Imposta il valore TX della matrice di trasformazione. |
| [setTY(double value)](#setTY-double-) | Imposta il valore TY della matrice di trasformazione. |
| [toArray()](#toArray--) | Alloca un nuovo array, copia la matrice di trasformazione e la restituisce. |
| [toString()](#toString--) |  |
| [transform(double x, double y, double[] x1, double[] y1)](#transform-double-double-double---double---) | Trasforma x e y con la matrice di trasformazione: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY. |
| [unScale(double x1, double y1, double[] x, double[] y)](#unScale-double-double-double---double---) | Scala indietro x1 e y1 e restituisce x e y prima della matrice di trasformazione. |
| [unTransform(double x1, double y1, double[] x, double[] y)](#unTransform-double-double-double---double---) | Trasforma indietro x1 e y1 e restituisce x e y prima della matrice di trasformazione. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformationMatrix() {#TransformationMatrix--}
```
public TransformationMatrix()
```


Crea una matrice standard 1 a 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]

### TransformationMatrix(double[] matrixArray) {#TransformationMatrix-double---}
```
public TransformationMatrix(double[] matrixArray)
```


Accetta una matrice di trasformazione con la seguente rappresentazione di array: [ A B C D TX TY ]

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| matrixArray | double[] | Array con i valori della matrice di trasformazione, deve contenere 6 elementi. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public double get(int index)
```


Fornisce l'accesso all'array sottostante.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| indice | int | Indice nell'array della matrice di trasformazione. |

**Returns:**
double - L'elemento dell'array sottostante per indice.
### getA() {#getA--}
```
public double getA()
```


Ottiene il valore A della matrice di trasformazione.

**Returns:**
double - Un valore della matrice di trasformazione.
### getB() {#getB--}
```
public double getB()
```


Ottiene il valore B della matrice di trasformazione.

**Returns:**
double - Valore B della matrice di trasformazione.
### getC() {#getC--}
```
public double getC()
```


Ottiene il valore C della matrice di trasformazione.

**Returns:**
double - Valore C della matrice di trasformazione.
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


Ottiene il valore D della matrice di trasformazione.

**Returns:**
double - Valore D della matrice di trasformazione.
### getTX() {#getTX--}
```
public double getTX()
```


Ottiene il valore TX della matrice di trasformazione.

**Returns:**
double - Valore TX della matrice di trasformazione.
### getTY() {#getTY--}
```
public double getTY()
```


Ottiene il valore TY della matrice di trasformazione.

**Returns:**
double - Valore TY della matrice di trasformazione.
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


Moltiplica con un'altra matrice di trasformazione. Non modifica la matrice di trasformazione originale, restituisce un nuovo oggetto TransformationMatrix.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Matrice di trasformazione con cui moltiplicare. |

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


Scala x e y con la matrice di trasformazione: x1 = A\*x + C\*y; y1 = B\*x + D\*y.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | double | Coordinata x originale |
| y | double | Coordinata y originale. |
| x1 | double[] | Coordinata x scalata. |
| y1 | double[] | Coordinata y scalata. |

### setA(double value) {#setA-double-}
```
public void setA(double value)
```


Imposta il valore A della matrice di trasformazione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | double | Valore A della matrice di trasformazione. |

### setB(double value) {#setB-double-}
```
public void setB(double value)
```


Imposta il valore B della matrice di trasformazione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | double | Valore B della matrice di trasformazione. |

### setC(double value) {#setC-double-}
```
public void setC(double value)
```


Imposta il valore C della matrice di trasformazione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | double | Valore C della matrice di trasformazione. |

### setD(double value) {#setD-double-}
```
public void setD(double value)
```


Imposta il valore D della matrice di trasformazione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | double | Valore D della matrice di trasformazione. |

### setTX(double value) {#setTX-double-}
```
public void setTX(double value)
```


Imposta il valore TX della matrice di trasformazione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | double | Valore della matrice di trasformazione TX. |

### setTY(double value) {#setTY-double-}
```
public void setTY(double value)
```


Imposta il valore TY della matrice di trasformazione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | double | Valore della matrice di trasformazione TY. |

### toArray() {#toArray--}
```
public double[] toArray()
```


Alloca un nuovo array, copia la matrice di trasformazione e la restituisce.

**Returns:**
double[] - TransformationMatrix in forma di array.
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


Trasforma x e y con la matrice di trasformazione: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | double | Coordinata x originale. |
| y | double | Coordinata y originale. |
| x1 | double[] | Coordinata x trasformata. |
| y1 | double[] | Coordinata y trasformata. |

### unScale(double x1, double y1, double[] x, double[] y) {#unScale-double-double-double---double---}
```
public void unScale(double x1, double y1, double[] x, double[] y)
```


Scala indietro x1 e y1 e restituisce x e y prima della matrice di trasformazione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x1 | double | Coordinata x1 |
| y1 | double | Coordinata y1 |
| x | double[] | Coordinata x riportata. |
| y | double[] | Coordinata y riportata. |

### unTransform(double x1, double y1, double[] x, double[] y) {#unTransform-double-double-double---double---}
```
public void unTransform(double x1, double y1, double[] x, double[] y)
```


Trasforma indietro x1 e y1 e restituisce x e y prima della matrice di trasformazione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x1 | double | Coordinata x1. |
| y1 | double | Coordinata y1. |
| x | double[] | Coordinata x trasformata indietro. |
| y | double[] | Coordinata y trasformata indietro. |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

