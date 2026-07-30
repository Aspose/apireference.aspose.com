---
title: "Transformationsmatris"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar 3x3-matris  A   B   0   C   D   0   TX  TY  1 ."
type: docs
weight: 78
url: /sv/java/com.aspose.font/transformationmatrix/
---
**Inheritance:**
java.lang.Object
```
public class TransformationMatrix
```

Representerar 3x3-matris | A B 0 | | C D 0 | | TX TY 1 |. Transformerar koordinater på följande sätt: x1 = A\*x + C\*y + TX y1 = B\*x + D\*y + TY.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [TransformationMatrix()](#TransformationMatrix--) | Skapar standard 1 till 1-matris: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0] |
| [TransformationMatrix(double[] matrixArray)](#TransformationMatrix-double---) | Accepterar en transformationsmatris med följande arrayrepresentation: [ A B C D TX TY ] |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Tillhandahåller åtkomst till underliggande array. |
| [getA()](#getA--) | Hämtar värdet A i transformationsmatrisen. |
| [getB()](#getB--) | Hämtar värdet B i transformationsmatrisen. |
| [getC()](#getC--) | Hämtar värdet C i transformationsmatrisen. |
| [getClass()](#getClass--) |  |
| [getD()](#getD--) | Hämtar värdet D i transformationsmatrisen. |
| [getTX()](#getTX--) | Hämtar värdet TX i transformationsmatrisen. |
| [getTY()](#getTY--) | Hämtar värdet TY i transformationsmatrisen. |
| [hashCode()](#hashCode--) |  |
| [multiply(TransformationMatrix matrix)](#multiply-com.aspose.font.TransformationMatrix-) | Multiplicerar med en annan transformationsmatris. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [scale(double x, double y, double[] x1, double[] y1)](#scale-double-double-double---double---) | Skalar x och y med transformationsmatrisen: x1 = A\*x + C\*y; y1 = B\*x + D\*y. |
| [setA(double value)](#setA-double-) | Sätter värdet A i transformationsmatrisen. |
| [setB(double value)](#setB-double-) | Sätter värdet B i transformationsmatrisen. |
| [setC(double value)](#setC-double-) | Sätter värdet C i transformationsmatrisen. |
| [setD(double value)](#setD-double-) | Sätter värdet D i transformationsmatrisen. |
| [setTX(double value)](#setTX-double-) | Sätter värdet TX i transformationsmatrisen. |
| [setTY(double value)](#setTY-double-) | Sätter värdet TY i transformationsmatrisen. |
| [toArray()](#toArray--) | Allokerar ny array, kopierar transformationsmatrisen och returnerar den. |
| [toString()](#toString--) |  |
| [transform(double x, double y, double[] x1, double[] y1)](#transform-double-double-double---double---) | Transformerar x och y med transformationsmatrisen: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY. |
| [unScale(double x1, double y1, double[] x, double[] y)](#unScale-double-double-double---double---) | Skalar tillbaka x1 och y1 och returnerar x och y före transformationsmatrisen. |
| [unTransform(double x1, double y1, double[] x, double[] y)](#unTransform-double-double-double---double---) | Transformerar tillbaka x1 och y1 och returnerar x och y före transformationsmatrisen. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformationMatrix() {#TransformationMatrix--}
```
public TransformationMatrix()
```


Skapar standard 1 till 1-matris: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]

### TransformationMatrix(double[] matrixArray) {#TransformationMatrix-double---}
```
public TransformationMatrix(double[] matrixArray)
```


Accepterar en transformationsmatris med följande arrayrepresentation: [ A B C D TX TY ]

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| matrixArray | double[] | Array med transformationsmatrisvärden, måste ha 6 element. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public double get(int index)
```


Tillhandahåller åtkomst till underliggande array.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | int | Index i transformationsmatrisarray. |

**Returns:**
double - Elementet i underliggande array vid index.
### getA() {#getA--}
```
public double getA()
```


Hämtar värdet A i transformationsmatrisen.

**Returns:**
double - Ett transformationsmatrisvärde.
### getB() {#getB--}
```
public double getB()
```


Hämtar värdet B i transformationsmatrisen.

**Returns:**
double - B transformationsmatrisvärde.
### getC() {#getC--}
```
public double getC()
```


Hämtar värdet C i transformationsmatrisen.

**Returns:**
double - C transformationsmatrisvärde.
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


Hämtar värdet D i transformationsmatrisen.

**Returns:**
double - D transformationsmatrisvärde.
### getTX() {#getTX--}
```
public double getTX()
```


Hämtar värdet TX i transformationsmatrisen.

**Returns:**
double - TX transformationsmatrisvärde.
### getTY() {#getTY--}
```
public double getTY()
```


Hämtar värdet TY i transformationsmatrisen.

**Returns:**
double - TY transformationsmatrisvärde.
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


Multiplicerar med en annan transformationsmatris. Ändrar inte den ursprungliga transformationsmatrisen, returnerar ett nytt TransformationMatrix-objekt.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Transformationsmatris att multiplicera med. |

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


Skalar x och y med transformationsmatrisen: x1 = A\*x + C\*y; y1 = B\*x + D\*y.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | double | Ursprunglig x-koordinat |
| y | double | Ursprunglig y-koordinat. |
| x1 | double[] | Koordinat x skalad. |
| y1 | double[] | Koordinat y skalad. |

### setA(double value) {#setA-double-}
```
public void setA(double value)
```


Sätter värdet A i transformationsmatrisen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | double | A transformationsmatrisvärde. |

### setB(double value) {#setB-double-}
```
public void setB(double value)
```


Sätter värdet B i transformationsmatrisen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | double | B transformationsmatrisvärde. |

### setC(double value) {#setC-double-}
```
public void setC(double value)
```


Sätter värdet C i transformationsmatrisen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | double | C transformationsmatrisvärde. |

### setD(double value) {#setD-double-}
```
public void setD(double value)
```


Sätter värdet D i transformationsmatrisen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | double | D transformationsmatrisvärde. |

### setTX(double value) {#setTX-double-}
```
public void setTX(double value)
```


Sätter värdet TX i transformationsmatrisen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | double | TX transformationsmatrisvärde. |

### setTY(double value) {#setTY-double-}
```
public void setTY(double value)
```


Sätter värdet TY i transformationsmatrisen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| värde | double | TY transformationsmatrisvärde. |

### toArray() {#toArray--}
```
public double[] toArray()
```


Allokerar ny array, kopierar transformationsmatrisen och returnerar den.

**Returns:**
double[] - Transformationsmatris i arrayform.
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


Transformerar x och y med transformationsmatrisen: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | double | Ursprunglig x-koordinat. |
| y | double | Ursprunglig y-koordinat. |
| x1 | double[] | Transformerad x-koordinat. |
| y1 | double[] | Transformerad y-koordinat. |

### unScale(double x1, double y1, double[] x, double[] y) {#unScale-double-double-double---double---}
```
public void unScale(double x1, double y1, double[] x, double[] y)
```


Skalar tillbaka x1 och y1 och returnerar x och y före transformationsmatrisen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x1 | double | Koordinat x1 |
| y1 | double | Koordinat y1 |
| x | double[] | Koordinat x skalad tillbaka. |
| y | double[] | Koordinat y skalad tillbaka. |

### unTransform(double x1, double y1, double[] x, double[] y) {#unTransform-double-double-double---double---}
```
public void unTransform(double x1, double y1, double[] x, double[] y)
```


Transformerar tillbaka x1 och y1 och returnerar x och y före transformationsmatrisen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x1 | double | Koordinat x1. |
| y1 | double | Koordinat y1. |
| x | double[] | Koordinat x transformerad tillbaka. |
| y | double[] | Koordinat y transformerad tillbaka. |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

