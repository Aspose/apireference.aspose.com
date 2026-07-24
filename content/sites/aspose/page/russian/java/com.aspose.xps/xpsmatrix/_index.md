---
title: "XpsMatrix"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий свойства элемента MatrixTransform."
type: docs
weight: 36
url: /ru/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

Класс, инкапсулирующий функции элемента свойства MatrixTransform. Этот элемент определяет произвольное аффинное преобразование матрицы, используемое для манипуляции системами координат элементов.
## Методы

| Метод | Описание |
| --- | --- |
| [deepClone()](#deepClone--) | Клонирует эту матрицу преобразования. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Фактическая реализация. |
| [equals(Object obj)](#equals-java.lang.Object-) | Определяет, равен ли указанный объект этому экземпляру. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | Получает элемент M11. |
| [getM12()](#getM12--) | Получает элемент M12. |
| [getM21()](#getM21--) | Получает элемент M21. |
| [getM22()](#getM22--) | Получает элемент M22. |
| [getM31()](#getM31--) | Получает элемент M31. |
| [getM32()](#getM32--) | Получает элемент M32. |
| [hashCode()](#hashCode--) | Возвращает хеш‑код для этого экземпляра. |
| [isIdentity()](#isIdentity--) | Получает значение, указывающее, является ли этот экземпляр единичной матрицей. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | Умножает эту матрицу на матрицу, указанную параметром  matrix  в порядке по умолчанию (Prepend). |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | Умножает эту матрицу на матрицу, указанную параметром  matrix  в порядке, указанном параметром  matrixOrder . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Реализует оператор ==. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Реализует оператор !. |
| [reset()](#reset--) | Сбрасывает эту Matrix к единичной матрице. |
| [rotate(float angle)](#rotate-float-) | Применяет вращение по часовой стрелке на  angle  к этой Matrix в порядке по умолчанию (Prepend). |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Применяет вращение по часовой стрелке на  angle  к этой Matrix в порядке, указанном параметром  matrixOrder . |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | Применяет вращение по часовой стрелке на  angle  вокруг  pivot  к этой Matrix в порядке по умолчанию (Prepend). |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | Применяет вращение по часовой стрелке на  angle  вокруг  pivot  к этой Matrix в порядке, указанном параметром  matrixOrder . |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Применяет указанный вектор масштабирования (scaleX и scaleY) к этой Matrix в порядке по умолчанию (Prepend). |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Применяет указанный вектор масштабирования (scaleX и scaleY) к этой Matrix в порядке, указанном параметром  matrixOrder . |
| [skew(double skewX, double skewY)](#skew-double-double-) | Применяет указанное преобразование наклона к этой Matrix. |
| [toString()](#toString--) | Возвращает строковое представление этого  XpsMatrix  экземпляра. |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | Применяет аффинное преобразование, представленное этой Matrix, к указанному прямоугольнику. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | Применяет аффинное преобразование, представленное этой Matrix, к указанной точке. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | Применяет аффинное преобразование, представленное этой Matrix, к указанному массиву точек. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | Применяет аффинное преобразование, представленное этой Matrix, к указанной части массива точек. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Применяет указанный вектор переноса к этой Matrix. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Применяет указанный вектор переноса к этой Matrix в порядке, указанном параметром  matrixOrder . |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


Клонирует эту матрицу преобразования.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


Фактическая реализация.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Первая матрица. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Вторая матрица. |

**Returns:**
boolean - [true] если матрицы равны
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Определяет, равен ли указанный объект этому экземпляру.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | java.lang.Object | Объект для сравнения с этим экземпляром. |

**Returns:**
boolean - true если указанный объект равен этому экземпляру; иначе false. Параметр obj равен null.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getM11() {#getM11--}
```
public float getM11()
```


Получает элемент M11.

**Returns:**
float - Элемент M11.
### getM12() {#getM12--}
```
public float getM12()
```


Получает элемент M12.

**Returns:**
float - Элемент M12.
### getM21() {#getM21--}
```
public float getM21()
```


Получает элемент M21.

**Returns:**
float - Элемент M21.
### getM22() {#getM22--}
```
public float getM22()
```


Получает элемент M22.

**Returns:**
float - Элемент M22.
### getM31() {#getM31--}
```
public float getM31()
```


Получает элемент M31.

**Returns:**
float - Элемент M31.
### getM32() {#getM32--}
```
public float getM32()
```


Получает элемент M32.

**Returns:**
float - Элемент M32.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Возвращает хеш‑код для этого экземпляра.

**Returns:**
int - Хеш-код этого экземпляра, подходящий для использования в алгоритмах хеширования и структурах данных, таких как хеш-таблица.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Получает значение, указывающее, является ли этот экземпляр единичной матрицей.

Значение: True если этот экземпляр является единичной матрицей; иначе false.

**Returns:**
boolean - Значение, указывающее, является ли этот экземпляр единичной матрицей.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


Умножает эту матрицу на матрицу, указанную параметром  matrix  в порядке по умолчанию (Prepend).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Матрица. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


Умножает эту матрицу на матрицу, указанную параметром  matrix  в порядке, указанном параметром  matrixOrder .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Матрица. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Порядок. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(XpsMatrix a, XpsMatrix b) {#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Equality(XpsMatrix a, XpsMatrix b)
```


Реализует оператор ==.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Первая матрица. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Вторая матрица. |

**Returns:**
boolean - Результат оператора.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


Реализует оператор !=.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Первая матрица. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Вторая матрица. |

**Returns:**
boolean - Результат оператора.
### reset() {#reset--}
```
public void reset()
```


Сбрасывает эту Matrix к единичной матрице.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Применяет вращение по часовой стрелке на  angle  к этой Matrix в порядке по умолчанию (Prepend).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| angle | float | Угол. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


Применяет вращение по часовой стрелке на  angle  к этой Matrix в порядке, указанном параметром  matrixOrder .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| angle | float | Угол. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Порядок. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


Применяет вращение по часовой стрелке на  angle  вокруг  pivot  к этой Matrix в порядке по умолчанию (Prepend).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| angle | float | Угол. |
| опорная точка | java.awt.geom.Point2D | Точка опоры. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


Применяет вращение по часовой стрелке на  angle  вокруг  pivot  к этой Matrix в порядке, указанном параметром  matrixOrder .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| angle | float | Угол. |
| опорная точка | java.awt.geom.Point2D | Точка опоры. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Порядок. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Применяет указанный вектор масштабирования (scaleX и scaleY) к этой Matrix в порядке по умолчанию (Prepend).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| scaleX | float | Масштаб x. |
| scaleY | float | Масштаб y. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


Применяет указанный вектор масштабирования (scaleX и scaleY) к этой Matrix в порядке, указанном параметром  matrixOrder .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| scaleX | float | Масштаб X. |
| scaleY | float | Масштаб Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Порядок. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


Применяет указанное преобразование наклона к этой Matrix.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| skewX | double | Скос x. |
| skewY | double | Скос y. |

### toString() {#toString--}
```
public String toString()
```


Возвращает строковое представление этого  XpsMatrix  экземпляра.

**Returns:**
java.lang.String - Представление строки
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


Применяет аффинное преобразование, представленное этой Matrix, к указанному прямоугольнику.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| прямоугольник | java.awt.geom.Rectangle2D | Прямоугольник. |

**Returns:**
java.awt.geom.Rectangle2D - Преобразованный прямоугольник
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


Применяет аффинное преобразование, представленное этой Matrix, к указанной точке.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| точка | java.awt.geom.Point2D | Точка. |

**Returns:**
java.awt.geom.Point2D - Преобразованная точка
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


Применяет аффинное преобразование, представленное этой Matrix, к указанному массиву точек.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Точки. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


Применяет аффинное преобразование, представленное этой Matrix, к указанной части массива точек.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Точки. |
| startIndex | int | Начальный индекс. |
| numberOfPoints | int | Количество точек. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Применяет указанный вектор переноса к этой Matrix.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| offsetX | float | Смещение X. |
| offsetY | float | Смещение Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


Применяет указанный вектор переноса к этой Matrix в порядке, указанном параметром  matrixOrder .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| offsetX | float | Смещение X. |
| offsetY | float | Смещение Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Порядок. |

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

