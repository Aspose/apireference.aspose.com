---
title: "Transformationsmatrix"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt eine 3x3-Matrix  A   B   0   C   D   0   TX  TY  1 ."
type: docs
weight: 78
url: /de/java/com.aspose.font/transformationmatrix/
---
**Inheritance:**
java.lang.Object
```
public class TransformationMatrix
```

Stellt eine 3x3-Matrix | A B 0 | | C D 0 | | TX TY 1 | dar. Transformiert Koordinaten auf folgende Weise: x1 = A\*x + C\*y + TX y1 = B\*x + D\*y + TY.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [TransformationMatrix()](#TransformationMatrix--) | Erstellt eine Standard‑1‑zu‑1‑Matrix: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0] |
| [TransformationMatrix(double[] matrixArray)](#TransformationMatrix-double---) | Akzeptiert eine Transformationsmatrix mit folgender Array‑Darstellung: [ A B C D TX TY ] |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Bietet Zugriff auf das zugrunde liegende Array. |
| [getA()](#getA--) | Liest den Wert A der Transformationsmatrix. |
| [getB()](#getB--) | Liest den Wert B der Transformationsmatrix. |
| [getC()](#getC--) | Liest den Wert C der Transformationsmatrix. |
| [getClass()](#getClass--) |  |
| [getD()](#getD--) | Liest den Wert D der Transformationsmatrix. |
| [getTX()](#getTX--) | Liest den Wert TX der Transformationsmatrix. |
| [getTY()](#getTY--) | Liest den Wert TY der Transformationsmatrix. |
| [hashCode()](#hashCode--) |  |
| [multiply(TransformationMatrix matrix)](#multiply-com.aspose.font.TransformationMatrix-) | Multipliziert mit einer anderen Transformationsmatrix. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [scale(double x, double y, double[] x1, double[] y1)](#scale-double-double-double---double---) | Skaliert x und y mit der Transformationsmatrix: x1 = A\*x + C\*y; y1 = B\*x + D\*y; |
| [setA(double value)](#setA-double-) | Setzt den Wert A der Transformationsmatrix. |
| [setB(double value)](#setB-double-) | Setzt den Wert B der Transformationsmatrix. |
| [setC(double value)](#setC-double-) | Setzt den Wert C der Transformationsmatrix. |
| [setD(double value)](#setD-double-) | Setzt den Wert D der Transformationsmatrix. |
| [setTX(double value)](#setTX-double-) | Setzt den Wert TX der Transformationsmatrix. |
| [setTY(double value)](#setTY-double-) | Setzt den Wert TY der Transformationsmatrix. |
| [toArray()](#toArray--) | Allokiert ein neues Array, kopiert die Transformationsmatrix und gibt es zurück. |
| [toString()](#toString--) |  |
| [transform(double x, double y, double[] x1, double[] y1)](#transform-double-double-double---double---) | Transformiert x und y mit der Transformationsmatrix: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY; |
| [unScale(double x1, double y1, double[] x, double[] y)](#unScale-double-double-double---double---) | Skaliert x1 und y1 zurück und gibt x und y vor der Transformationsmatrix zurück. |
| [unTransform(double x1, double y1, double[] x, double[] y)](#unTransform-double-double-double---double---) | Transformiert x1 und y1 zurück und gibt x und y vor der Transformationsmatrix zurück. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformationMatrix() {#TransformationMatrix--}
```
public TransformationMatrix()
```


Erstellt eine Standard‑1‑zu‑1‑Matrix: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]

### TransformationMatrix(double[] matrixArray) {#TransformationMatrix-double---}
```
public TransformationMatrix(double[] matrixArray)
```


Akzeptiert eine Transformationsmatrix mit folgender Array‑Darstellung: [ A B C D TX TY ]

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| matrixArray | double[] | Array mit Transformationsmatrixwerten, muss 6 Elemente enthalten. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public double get(int index)
```


Bietet Zugriff auf das zugrunde liegende Array.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Index im Transformationsmatrix-Array. |

**Returns:**
double - Das Element des zugrunde liegenden Arrays nach Index.
### getA() {#getA--}
```
public double getA()
```


Liest den Wert A der Transformationsmatrix.

**Returns:**
double - Ein Transformationsmatrixwert.
### getB() {#getB--}
```
public double getB()
```


Liest den Wert B der Transformationsmatrix.

**Returns:**
double - B Transformationsmatrixwert.
### getC() {#getC--}
```
public double getC()
```


Liest den Wert C der Transformationsmatrix.

**Returns:**
double - C Transformationsmatrixwert.
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


Liest den Wert D der Transformationsmatrix.

**Returns:**
double - D Transformationsmatrixwert.
### getTX() {#getTX--}
```
public double getTX()
```


Liest den Wert TX der Transformationsmatrix.

**Returns:**
double - TX Transformationsmatrixwert.
### getTY() {#getTY--}
```
public double getTY()
```


Liest den Wert TY der Transformationsmatrix.

**Returns:**
double - TY Transformationsmatrixwert.
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


Multipliziert mit einer anderen Transformationsmatrix. Ändert die ursprüngliche Transformationsmatrix nicht und gibt ein neues TransformationMatrix-Objekt zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Transformationsmatrix, mit der multipliziert werden soll. |

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


Skaliert x und y mit der Transformationsmatrix: x1 = A\*x + C\*y; y1 = B\*x + D\*y;

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Ursprüngliche x-Koordinate |
| y | double | Ursprüngliche y-Koordinate. |
| x1 | double[] | Koordinate x skaliert. |
| y1 | double[] | Koordinate y skaliert. |

### setA(double value) {#setA-double-}
```
public void setA(double value)
```


Setzt den Wert A der Transformationsmatrix.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | Ein Transformationsmatrixwert. |

### setB(double value) {#setB-double-}
```
public void setB(double value)
```


Setzt den Wert B der Transformationsmatrix.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | B Transformationsmatrixwert. |

### setC(double value) {#setC-double-}
```
public void setC(double value)
```


Setzt den Wert C der Transformationsmatrix.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | C Transformationsmatrixwert. |

### setD(double value) {#setD-double-}
```
public void setD(double value)
```


Setzt den Wert D der Transformationsmatrix.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | D Transformationsmatrixwert. |

### setTX(double value) {#setTX-double-}
```
public void setTX(double value)
```


Setzt den Wert TX der Transformationsmatrix.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | TX-Transformationsmatrixwert. |

### setTY(double value) {#setTY-double-}
```
public void setTY(double value)
```


Setzt den Wert TY der Transformationsmatrix.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | double | TY-Transformationsmatrixwert. |

### toArray() {#toArray--}
```
public double[] toArray()
```


Allokiert ein neues Array, kopiert die Transformationsmatrix und gibt es zurück.

**Returns:**
double[] - Transformationsmatrix in Arrayform.
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


Transformiert x und y mit der Transformationsmatrix: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY;

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Ursprüngliche x-Koordinate. |
| y | double | Ursprüngliche y-Koordinate. |
| x1 | double[] | Transformierte x-Koordinate. |
| y1 | double[] | Transformierte y-Koordinate. |

### unScale(double x1, double y1, double[] x, double[] y) {#unScale-double-double-double---double---}
```
public void unScale(double x1, double y1, double[] x, double[] y)
```


Skaliert x1 und y1 zurück und gibt x und y vor der Transformationsmatrix zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x1 | double | Koordinate x1 |
| y1 | double | Koordinate y1 |
| x | double[] | Koordinate x zurückskaliert. |
| y | double[] | Koordinate y zurückskaliert. |

### unTransform(double x1, double y1, double[] x, double[] y) {#unTransform-double-double-double---double---}
```
public void unTransform(double x1, double y1, double[] x, double[] y)
```


Transformiert x1 und y1 zurück und gibt x und y vor der Transformationsmatrix zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x1 | double | Koordinate x1. |
| y1 | double | Koordinate y1. |
| x | double[] | Koordinate x zurücktransformiert. |
| y | double[] | Koordinate y zurücktransformiert. |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

