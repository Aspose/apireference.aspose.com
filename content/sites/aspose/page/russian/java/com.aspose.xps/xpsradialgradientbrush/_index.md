---
title: "XpsRadialGradientBrush"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий свойства элемента RadialGradientBrush."
type: docs
weight: 48
url: /ru/java/com.aspose.xps/xpsradialgradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsRadialGradientBrush extends XpsGradientBrush
```

Класс, инкапсулирующий особенности свойства элемента RadialGradientBrush. Этот элемент используется для указания радиальной градиентной кисти.
## Методы

| Метод | Описание |
| --- | --- |
| [deepClone()](#deepClone--) | Клонирует эту радиальную градиентную кисть. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCenter()](#getCenter--) | Возвращает центральную точку радиального градиента (то есть центр эллипса). |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Возвращает значение, определяющее гамма‑функцию для интерполяции цветов. |
| [getGradientOrigin()](#getGradientOrigin--) | Возвращает исходную точку радиального градиента. |
| [getGradientStops()](#getGradientStops--) | Возвращает список градиентных остановок, составляющих градиент. |
| [getOpacity()](#getOpacity--) | Возвращает значение, определяющее равномерную прозрачность заливки кисти. |
| [getRadiusX()](#getRadiusX--) | Возвращает радиус по оси x эллипса, определяющего радиальный градиент. |
| [getRadiusY()](#getRadiusY--) | Возвращает радиус по оси y эллипса, определяющего радиальный градиент. |
| [getSpreadMethod()](#getSpreadMethod--) | Возвращает значение, описывающее, как кисть должна заполнять область содержимого за пределами основной, начальной области градиента. |
| [getTransform()](#getTransform--) | Возвращает матричное преобразование, применяемое к координатному пространству кисти. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCenter(Point2D value)](#setCenter-java.awt.geom.Point2D-) | Устанавливает центральную точку радиального градиента (то есть центр эллипса). |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Устанавливает значение, определяющее гамма‑функцию для интерполяции цветов. |
| [setGradientOrigin(Point2D value)](#setGradientOrigin-java.awt.geom.Point2D-) | Устанавливает исходную точку радиального градиента. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Устанавливает список градиентных остановок, составляющих градиент. |
| [setOpacity(float value)](#setOpacity-float-) | Устанавливает значение, определяющее равномерную прозрачность заливки кисти. |
| [setRadiusX(float value)](#setRadiusX-float-) | Устанавливает радиус по оси x эллипса, определяющего радиальный градиент. |
| [setRadiusY(float value)](#setRadiusY-float-) | Устанавливает радиус по оси y эллипса, определяющего радиальный градиент. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Устанавливает значение, описывающее, как кисть должна заполнять область содержимого за пределами основной, начальной области градиента. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Устанавливает матричное преобразование, применяемое к координатному пространству кисти. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsRadialGradientBrush deepClone()
```


Клонирует эту радиальную градиентную кисть.

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - Clone of this radial gradient brush.
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
### getCenter() {#getCenter--}
```
public Point2D getCenter()
```


Возвращает центральную точку радиального градиента (то есть центр эллипса).

**Returns:**
java.awt.geom.Point2D — центральная точка радиального градиента.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


Возвращает значение, определяющее гамма‑функцию для интерполяции цветов. Регулировка гаммы не должна применяться к альфа‑компоненте, если она указана.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getGradientOrigin() {#getGradientOrigin--}
```
public Point2D getGradientOrigin()
```


Возвращает исходную точку радиального градиента.

**Returns:**
java.awt.geom.Point2D — исходная точка радиального градиента.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Возвращает список градиентных остановок, составляющих градиент.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> — список градиентных остановок, составляющих градиент.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Возвращает значение, определяющее равномерную прозрачность заливки кисти.

**Returns:**
float - Значение, определяющее равномерную прозрачность заливки кисти.
### getRadiusX() {#getRadiusX--}
```
public float getRadiusX()
```


Возвращает радиус по оси x эллипса, определяющего радиальный градиент.

**Returns:**
float — радиус по оси x эллипса, определяющего радиальный градиент.
### getRadiusY() {#getRadiusY--}
```
public float getRadiusY()
```


Возвращает радиус по оси y эллипса, определяющего радиальный градиент.

**Returns:**
float — радиус по оси y эллипса, определяющего радиальный градиент.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Возвращает значение, описывающее, как кисть должна заполнять область содержимого за пределами основной, начальной области градиента.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Возвращает матричное преобразование, применяемое к координатному пространству кисти. Свойство Transform конкатенируется с текущим эффективным преобразованием рендеринга, чтобы получить эффективное преобразование рендеринга, локальное для кисти. Вьюпорт кисти преобразуется с использованием локального эффективного преобразования рендеринга.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setCenter(Point2D value) {#setCenter-java.awt.geom.Point2D-}
```
public void setCenter(Point2D value)
```


Устанавливает центральную точку радиального градиента (то есть центр эллипса).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.awt.geom.Point2D | Центральная точка радиального градиента. |

### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Устанавливает значение, определяющее гамма‑функцию для интерполяции цветов. Коррекция гаммы не должна применяться к альфа‑компоненту, если он указан.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Значение, определяющее гамма‑функцию для интерполяции цветов. |

### setGradientOrigin(Point2D value) {#setGradientOrigin-java.awt.geom.Point2D-}
```
public void setGradientOrigin(Point2D value)
```


Устанавливает исходную точку радиального градиента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.awt.geom.Point2D | Исходная точка радиального градиента. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Устанавливает список градиентных остановок, составляющих градиент.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.util.List<com.aspose.xps.XpsGradientStop> | Список остановок градиента, составляющих градиент. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Устанавливает значение, определяющее равномерную прозрачность заливки кисти.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Значение, определяющее равномерную прозрачность заливки кисти. |

### setRadiusX(float value) {#setRadiusX-float-}
```
public void setRadiusX(float value)
```


Устанавливает радиус по оси x эллипса, определяющего радиальный градиент.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Радиус в измерении x эллипса, определяющего радиальный градиент. |

### setRadiusY(float value) {#setRadiusY-float-}
```
public void setRadiusY(float value)
```


Устанавливает радиус по оси y эллипса, определяющего радиальный градиент.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Радиус в измерении y эллипса, определяющего радиальный градиент. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Устанавливает значение, описывающее, как кисть должна заполнять область содержимого за пределами основной, начальной области градиента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Значение, описывающее, как кисть должна заполнять область содержимого за пределами основной, начальной области градиента. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Устанавливает матричное преобразование, применяемое к координатному пространству кисти. Свойство Transform конкатенируется с текущим эффективным преобразованием рендеринга, чтобы получить эффективное преобразование рендеринга, локальное для кисти. Вьюпорт кисти преобразуется с использованием локального эффективного преобразования рендеринга.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Матричное преобразование, применяемое к координатному пространству кисти. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
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

