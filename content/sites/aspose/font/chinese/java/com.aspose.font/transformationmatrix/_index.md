---
title: "TransformationMatrix"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 3x3 矩阵  A   B   0   C   D   0   TX  TY  1 ."
type: docs
weight: 78
url: /zh/java/com.aspose.font/transformationmatrix/
---
**Inheritance:**
java.lang.Object
```
public class TransformationMatrix
```

表示 3x3 矩阵 | A B 0 | | C D 0 | | TX TY 1 |。以以下方式转换坐标：x1 = A\*x + C\*y + TX y1 = B\*x + D\*y + TY。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [TransformationMatrix()](#TransformationMatrix--) | 创建标准的 1 对 1 矩阵： [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0] |
| [TransformationMatrix(double[] matrixArray)](#TransformationMatrix-double---) | 接受具有以下数组表示形式的变换矩阵： [ A B C D TX TY ] |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | 提供对底层数组的访问。 |
| [getA()](#getA--) | 获取 A 变换矩阵的值。 |
| [getB()](#getB--) | 获取 B 变换矩阵的值。 |
| [getC()](#getC--) | 获取 C 变换矩阵的值。 |
| [getClass()](#getClass--) |  |
| [getD()](#getD--) | 获取 D 变换矩阵的值。 |
| [getTX()](#getTX--) | 获取 TX 变换矩阵的值。 |
| [getTY()](#getTY--) | 获取 TY 变换矩阵的值。 |
| [hashCode()](#hashCode--) |  |
| [multiply(TransformationMatrix matrix)](#multiply-com.aspose.font.TransformationMatrix-) | 与另一个变换矩阵相乘。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [scale(double x, double y, double[] x1, double[] y1)](#scale-double-double-double---double---) | 使用变换矩阵缩放 x 和 y：x1 = A\*x + C\*y; y1 = B\*x + D\*y。 |
| [setA(double value)](#setA-double-) | 设置 A 变换矩阵的值。 |
| [setB(double value)](#setB-double-) | 设置 B 变换矩阵的值。 |
| [setC(double value)](#setC-double-) | 设置 C 变换矩阵的值。 |
| [setD(double value)](#setD-double-) | 设置 D 变换矩阵的值。 |
| [setTX(double value)](#setTX-double-) | 设置 TX 变换矩阵的值。 |
| [setTY(double value)](#setTY-double-) | 设置 TY 变换矩阵的值。 |
| [toArray()](#toArray--) | 分配新数组，复制变换矩阵并返回它。 |
| [toString()](#toString--) |  |
| [transform(double x, double y, double[] x1, double[] y1)](#transform-double-double-double---double---) | 使用变换矩阵转换 x 和 y：x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY。 |
| [unScale(double x1, double y1, double[] x, double[] y)](#unScale-double-double-double---double---) | 将 x1 和 y1 缩放回去，并返回变换矩阵之前的 x 和 y。 |
| [unTransform(double x1, double y1, double[] x, double[] y)](#unTransform-double-double-double---double---) | 将 x1 和 y1 反向转换，并返回变换矩阵之前的 x 和 y。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformationMatrix() {#TransformationMatrix--}
```
public TransformationMatrix()
```


创建标准的 1 对 1 矩阵： [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]

### TransformationMatrix(double[] matrixArray) {#TransformationMatrix-double---}
```
public TransformationMatrix(double[] matrixArray)
```


接受具有以下数组表示形式的变换矩阵： [ A B C D TX TY ]

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| matrixArray | double[] | 包含变换矩阵值的数组，必须有 6 个元素。 |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public double get(int index)
```


提供对底层数组的访问。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int | 变换矩阵数组中的索引。 |

**Returns:**
double - 基础数组中索引对应的元素。
### getA() {#getA--}
```
public double getA()
```


获取 A 变换矩阵的值。

**Returns:**
double - A 变换矩阵的值。
### getB() {#getB--}
```
public double getB()
```


获取 B 变换矩阵的值。

**Returns:**
double - B 变换矩阵的值。
### getC() {#getC--}
```
public double getC()
```


获取 C 变换矩阵的值。

**Returns:**
double - C 变换矩阵的值。
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


获取 D 变换矩阵的值。

**Returns:**
double - D 变换矩阵的值。
### getTX() {#getTX--}
```
public double getTX()
```


获取 TX 变换矩阵的值。

**Returns:**
double - TX 变换矩阵的值。
### getTY() {#getTY--}
```
public double getTY()
```


获取 TY 变换矩阵的值。

**Returns:**
double - TY 变换矩阵的值。
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


与另一个变换矩阵相乘。不会更改原始变换矩阵，返回一个新的 TransformationMatrix 对象。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | 用于相乘的变换矩阵。 |

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


使用变换矩阵缩放 x 和 y：x1 = A\*x + C\*y; y1 = B\*x + D\*y。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | double | 原始 x 坐标 |
| y | double | 原始 y 坐标。 |
| x1 | double[] | 缩放后的 x 坐标。 |
| y1 | double[] | 缩放后的 y 坐标。 |

### setA(double value) {#setA-double-}
```
public void setA(double value)
```


设置 A 变换矩阵的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | A 变换矩阵的值。 |

### setB(double value) {#setB-double-}
```
public void setB(double value)
```


设置 B 变换矩阵的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | B 变换矩阵的值。 |

### setC(double value) {#setC-double-}
```
public void setC(double value)
```


设置 C 变换矩阵的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | C 变换矩阵的值。 |

### setD(double value) {#setD-double-}
```
public void setD(double value)
```


设置 D 变换矩阵的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | D 变换矩阵的值。 |

### setTX(double value) {#setTX-double-}
```
public void setTX(double value)
```


设置 TX 变换矩阵的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | TX 变换矩阵值。 |

### setTY(double value) {#setTY-double-}
```
public void setTY(double value)
```


设置 TY 变换矩阵的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | TY 变换矩阵值。 |

### toArray() {#toArray--}
```
public double[] toArray()
```


分配新数组，复制变换矩阵并返回它。

**Returns:**
double[] - 以数组形式的 TransformationMatrix。
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


使用变换矩阵转换 x 和 y：x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x | double | 原始 x 坐标。 |
| y | double | 原始 y 坐标。 |
| x1 | double[] | 变换后的 x 坐标。 |
| y1 | double[] | 变换后的 y 坐标。 |

### unScale(double x1, double y1, double[] x, double[] y) {#unScale-double-double-double---double---}
```
public void unScale(double x1, double y1, double[] x, double[] y)
```


将 x1 和 y1 缩放回去，并返回变换矩阵之前的 x 和 y。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x1 | double | 坐标 x1 |
| y1 | double | 坐标 y1 |
| x | double[] | 坐标 x 缩放回原始。 |
| y | double[] | 坐标 y 缩放回原始。 |

### unTransform(double x1, double y1, double[] x, double[] y) {#unTransform-double-double-double---double---}
```
public void unTransform(double x1, double y1, double[] x, double[] y)
```


将 x1 和 y1 反向转换，并返回变换矩阵之前的 x 和 y。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| x1 | double | 坐标 x1。 |
| y1 | double | 坐标 y1。 |
| x | double[] | 坐标 x 变换回原始。 |
| y | double[] | 坐标 y 变换回原始。 |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

