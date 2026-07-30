---
title: "TransformationMatrix"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет 3x3 матрицу  A   B   0   C   D   0   TX  TY  1 ."
type: docs
weight: 78
url: /ru/java/com.aspose.font/transformationmatrix/
---
**Inheritance:**
java.lang.Object
```
public class TransformationMatrix
```

Представляет 3x3 матрицу | A B 0 | | C D 0 | | TX TY 1 |. Преобразует координаты следующим образом: x1 = A\*x + C\*y + TX y1 = B\*x + D\*y + TY.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [TransformationMatrix()](#TransformationMatrix--) | Создает стандартную матрицу 1 к 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0] |
| [TransformationMatrix(double[] matrixArray)](#TransformationMatrix-double---) | Принимает матрицу преобразования со следующим представлением массива: [ A B C D TX TY ] |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int index)](#get-int-) | Обеспечивает доступ к базовому массиву. |
| [getA()](#getA--) | Получает значение A матрицы преобразования. |
| [getB()](#getB--) | Получает значение B матрицы преобразования. |
| [getC()](#getC--) | Получает значение C матрицы преобразования. |
| [getClass()](#getClass--) |  |
| [getD()](#getD--) | Получает значение D матрицы преобразования. |
| [getTX()](#getTX--) | Получает значение TX матрицы преобразования. |
| [getTY()](#getTY--) | Получает значение TY матрицы преобразования. |
| [hashCode()](#hashCode--) |  |
| [multiply(TransformationMatrix matrix)](#multiply-com.aspose.font.TransformationMatrix-) | Умножает на другую матрицу преобразования. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [scale(double x, double y, double[] x1, double[] y1)](#scale-double-double-double---double---) | Масштабирует x и y с помощью матрицы преобразования: x1 = A\*x + C\*y; y1 = B\*x + D\*y. |
| [setA(double value)](#setA-double-) | Устанавливает значение A матрицы преобразования. |
| [setB(double value)](#setB-double-) | Устанавливает значение B матрицы преобразования. |
| [setC(double value)](#setC-double-) | Устанавливает значение C матрицы преобразования. |
| [setD(double value)](#setD-double-) | Устанавливает значение D матрицы преобразования. |
| [setTX(double value)](#setTX-double-) | Устанавливает значение TX матрицы преобразования. |
| [setTY(double value)](#setTY-double-) | Устанавливает значение TY матрицы преобразования. |
| [toArray()](#toArray--) | Выделяет новый массив, копирует матрицу преобразования и возвращает его. |
| [toString()](#toString--) |  |
| [transform(double x, double y, double[] x1, double[] y1)](#transform-double-double-double---double---) | Преобразует x и y с помощью матрицы преобразования: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY. |
| [unScale(double x1, double y1, double[] x, double[] y)](#unScale-double-double-double---double---) | Обратно масштабирует x1 и y1 и возвращает x и y до применения матрицы преобразования. |
| [unTransform(double x1, double y1, double[] x, double[] y)](#unTransform-double-double-double---double---) | Обратно преобразует x1 и y1 и возвращает x и y до применения матрицы преобразования. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformationMatrix() {#TransformationMatrix--}
```
public TransformationMatrix()
```


Создает стандартную матрицу 1 к 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]

### TransformationMatrix(double[] matrixArray) {#TransformationMatrix-double---}
```
public TransformationMatrix(double[] matrixArray)
```


Принимает матрицу преобразования со следующим представлением массива: [ A B C D TX TY ]

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| matrixArray | double[] | Массив со значениями матрицы преобразования, должен содержать 6 элементов. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int index) {#get-int-}
```
public double get(int index)
```


Обеспечивает доступ к базовому массиву.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Индекс в массиве матрицы преобразования. |

**Returns:**
double - Элемент базового массива по индексу.
### getA() {#getA--}
```
public double getA()
```


Получает значение A матрицы преобразования.

**Returns:**
double - Значение матрицы преобразования A.
### getB() {#getB--}
```
public double getB()
```


Получает значение B матрицы преобразования.

**Returns:**
double - Значение матрицы преобразования B.
### getC() {#getC--}
```
public double getC()
```


Получает значение C матрицы преобразования.

**Returns:**
double - Значение матрицы преобразования C.
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


Получает значение D матрицы преобразования.

**Returns:**
double - Значение матрицы преобразования D.
### getTX() {#getTX--}
```
public double getTX()
```


Получает значение TX матрицы преобразования.

**Returns:**
double - Значение матрицы преобразования TX.
### getTY() {#getTY--}
```
public double getTY()
```


Получает значение TY матрицы преобразования.

**Returns:**
double - Значение матрицы преобразования TY.
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


Умножает на другую матрицу преобразования. Не изменяет исходную матрицу преобразования, возвращает новый объект TransformationMatrix.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Матрица преобразования для умножения. |

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


Масштабирует x и y с помощью матрицы преобразования: x1 = A\*x + C\*y; y1 = B\*x + D\*y.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | double | Исходная координата x |
| y | double | Исходная координата y. |
| x1 | double[] | Координата x масштабирована. |
| y1 | double[] | Координата y масштабирована. |

### setA(double value) {#setA-double-}
```
public void setA(double value)
```


Устанавливает значение A матрицы преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | double | Значение матрицы преобразования A. |

### setB(double value) {#setB-double-}
```
public void setB(double value)
```


Устанавливает значение B матрицы преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | double | Значение матрицы преобразования B. |

### setC(double value) {#setC-double-}
```
public void setC(double value)
```


Устанавливает значение C матрицы преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | double | Значение матрицы преобразования C. |

### setD(double value) {#setD-double-}
```
public void setD(double value)
```


Устанавливает значение D матрицы преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | double | Значение матрицы преобразования D. |

### setTX(double value) {#setTX-double-}
```
public void setTX(double value)
```


Устанавливает значение TX матрицы преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | double | Значение матрицы трансформации TX. |

### setTY(double value) {#setTY-double-}
```
public void setTY(double value)
```


Устанавливает значение TY матрицы преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | double | Значение матрицы трансформации TY. |

### toArray() {#toArray--}
```
public double[] toArray()
```


Выделяет новый массив, копирует матрицу преобразования и возвращает его.

**Returns:**
double[] — TransformationMatrix в виде массива.
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


Преобразует x и y с помощью матрицы преобразования: x1 = A\*x + C\*y + TX; y1 = B\*x + D\*y + TY.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | double | Исходная координата x. |
| y | double | Исходная координата y. |
| x1 | double[] | Трансформированная координата x. |
| y1 | double[] | Трансформированная координата y. |

### unScale(double x1, double y1, double[] x, double[] y) {#unScale-double-double-double---double---}
```
public void unScale(double x1, double y1, double[] x, double[] y)
```


Обратно масштабирует x1 и y1 и возвращает x и y до применения матрицы преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x1 | double | Координата x1 |
| y1 | double | Координата y1 |
| x | double[] | Координата x, масштабированная обратно. |
| y | double[] | Координата y, масштабированная обратно. |

### unTransform(double x1, double y1, double[] x, double[] y) {#unTransform-double-double-double---double---}
```
public void unTransform(double x1, double y1, double[] x, double[] y)
```


Обратно преобразует x1 и y1 и возвращает x и y до применения матрицы преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x1 | double | Координата x1. |
| y1 | double | Координата y1. |
| x | double[] | Координата x, преобразованная обратно. |
| y | double[] | Координата y, преобразованная обратно. |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

