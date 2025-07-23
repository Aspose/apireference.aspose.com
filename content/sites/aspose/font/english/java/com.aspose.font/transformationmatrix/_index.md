---
title: TransformationMatrix
second_title: Aspose.Font for Java API Reference
description: Represents 3x3 matrix  A   B   0   C   D   0   TX  TY  1 .
type: docs
weight: 77
url: /java/com.aspose.font/transformationmatrix/
---
**Inheritance:**
java.lang.Object
```
public class TransformationMatrix
```

Represents 3x3 matrix | A B 0 | | C D 0 | | TX TY 1 |. Transforms coordinates in the following way: x1 = A\*x + C\*y + TX y1 = B\*x + D\*y + TY.
## Constructors

| Constructor | Description |
| --- | --- |
| [TransformationMatrix()](#TransformationMatrix--) | Creates standard 1 to 1 matrix: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0] |
| [TransformationMatrix(double[] matrixArray)](#TransformationMatrix-double---) | Accepts a transformation matrix with following array representation: [ A B C D TX TY ] |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Provides access to underlying array. |
| [getA()](#getA--) | Gets A transformation matrix value. |
| [getB()](#getB--) | Gets B transformation matrix value. |
| [getC()](#getC--) | Gets C transformation matrix value. |
| [getClass()](#getClass--) |  |
| [getD()](#getD--) | Gets D transformation matrix value. |
| [getTX()](#getTX--) | Gets TX transformation matrix value. |
| [getTY()](#getTY--) | Gets TY transformation matrix value. |
| [hashCode()](#hashCode--) |  |
| [multiply(TransformationMatrix matrix)](#multiply-com.aspose.font.TransformationMatrix-) | Multiplies with another transformation matrix. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [scale(double x, double y, double[] x1, double[] y1)](#scale-double-double-double---double---) | Scales x and y with the transformation matrix: x1 = A\*x + C\*y; y1 = B\*x + D\*y. |
| [setA(double value)](#setA-double-) | Sets A transformation matrix value. |
| [setB(double value)](#setB-double-) | Sets B transformation matrix value. |
| [setC(double value)](#setC-double-) | Sets C transformation matrix value. |
| [setD(double value)](#setD-double-) | Sets D transformation matrix value. |
| [setTX(double value)](#setTX-double-) | Sets TX transformation matrix value. |
| [setTY(double value)](#setTY-double-) | Sets TY transformation matrix value. |
| [toArray()](#toArray--) | Allocates new array, copies the transformation matrix and returns it. |
| [toString()](#toString--) |  |
| [transform(double x, double y, double[] x1, double[] y1)](#transform-double-double-double---double---) | Transforms x and y with the transformation matrix: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY. |
| [unScale(double x1, double y1, double[] x, double[] y)](#unScale-double-double-double---double---) | Scales back x1 and y1 and returns x and y before the transformation matrix. |
| [unTransform(double x1, double y1, double[] x, double[] y)](#unTransform-double-double-double---double---) | Transforms back x1 and y1 and returns x and y before the transformation matrix. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformationMatrix() {#TransformationMatrix--}
```
public TransformationMatrix()
```


Creates standard 1 to 1 matrix: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]

### TransformationMatrix(double[] matrixArray) {#TransformationMatrix-double---}
```
public TransformationMatrix(double[] matrixArray)
```


Accepts a transformation matrix with following array representation: [ A B C D TX TY ]

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrixArray | double[] | Array with transformation matrix values, must have 6 elements. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public double get(int index)
```


Provides access to underlying array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Index in transformation matrix array. |

**Returns:**
double - The element of underlying array by index.
### getA() {#getA--}
```
public double getA()
```


Gets A transformation matrix value.

**Returns:**
double - A transformation matrix value.
### getB() {#getB--}
```
public double getB()
```


Gets B transformation matrix value.

**Returns:**
double - B transformation matrix value.
### getC() {#getC--}
```
public double getC()
```


Gets C transformation matrix value.

**Returns:**
double - C transformation matrix value.
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


Gets D transformation matrix value.

**Returns:**
double - D transformation matrix value.
### getTX() {#getTX--}
```
public double getTX()
```


Gets TX transformation matrix value.

**Returns:**
double - TX transformation matrix value.
### getTY() {#getTY--}
```
public double getTY()
```


Gets TY transformation matrix value.

**Returns:**
double - TY transformation matrix value.
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


Multiplies with another transformation matrix. Doesn't change original transformation matrix, returns a new TransformationMatrix object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Transformation matrix to multiply with. |

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


Scales x and y with the transformation matrix: x1 = A\*x + C\*y; y1 = B\*x + D\*y.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double | Original x coordinate |
| y | double | Original y coordinate. |
| x1 | double[] | Coordinate x scaled. |
| y1 | double[] | Coordinate y scaled. |

### setA(double value) {#setA-double-}
```
public void setA(double value)
```


Sets A transformation matrix value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | A transformation matrix value. |

### setB(double value) {#setB-double-}
```
public void setB(double value)
```


Sets B transformation matrix value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | B transformation matrix value. |

### setC(double value) {#setC-double-}
```
public void setC(double value)
```


Sets C transformation matrix value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | C transformation matrix value. |

### setD(double value) {#setD-double-}
```
public void setD(double value)
```


Sets D transformation matrix value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | D transformation matrix value. |

### setTX(double value) {#setTX-double-}
```
public void setTX(double value)
```


Sets TX transformation matrix value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | TX transformation matrix value. |

### setTY(double value) {#setTY-double-}
```
public void setTY(double value)
```


Sets TY transformation matrix value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | TY transformation matrix value. |

### toArray() {#toArray--}
```
public double[] toArray()
```


Allocates new array, copies the transformation matrix and returns it.

**Returns:**
double[] - TransformationMatrix in array form.
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


Transforms x and y with the transformation matrix: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | double | Original x coordinate. |
| y | double | Original y coordinate. |
| x1 | double[] | Transformed x coordinate. |
| y1 | double[] | Transformed y coordinate. |

### unScale(double x1, double y1, double[] x, double[] y) {#unScale-double-double-double---double---}
```
public void unScale(double x1, double y1, double[] x, double[] y)
```


Scales back x1 and y1 and returns x and y before the transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x1 | double | Coordinate x1 |
| y1 | double | Coordinate y1 |
| x | double[] | Coordinate x scaled back. |
| y | double[] | Coordinate y scaled back. |

### unTransform(double x1, double y1, double[] x, double[] y) {#unTransform-double-double-double---double---}
```
public void unTransform(double x1, double y1, double[] x, double[] y)
```


Transforms back x1 and y1 and returns x and y before the transformation matrix.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x1 | double | Coordinate x1. |
| y1 | double | Coordinate y1. |
| x | double[] | Coordinate x transformed back. |
| y | double[] | Coordinate y transformed back. |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

