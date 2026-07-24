---
title: "XpsLinearGradientBrush"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий особенности свойства элемента LinearGradientBrush."
type: docs
weight: 34
url: /ru/java/com.aspose.xps/xpslineargradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsLinearGradientBrush extends XpsGradientBrush
```

Класс, инкапсулирующий свойства элемента LinearGradientBrush. Этот элемент используется для задания линейной градиентной кисти вдоль вектора.
## Методы

| Метод | Описание |
| --- | --- |
| [deepClone()](#deepClone--) | Создаёт копию этой линейной градиентной кисти. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Возвращает значение, определяющее гамма‑функцию для интерполяции цветов. |
| [getEndPoint()](#getEndPoint--) | Возвращает конечную точку линейного градиента. |
| [getGradientStops()](#getGradientStops--) | Возвращает список градиентных остановок, составляющих градиент. |
| [getOpacity()](#getOpacity--) | Возвращает значение, определяющее равномерную прозрачность заливки кисти. |
| [getSpreadMethod()](#getSpreadMethod--) | Возвращает значение, описывающее, как кисть должна заполнять область содержимого за пределами основной, начальной области градиента. |
| [getStartPoint()](#getStartPoint--) | Возвращает начальную точку линейного градиента. |
| [getTransform()](#getTransform--) | Возвращает матричное преобразование, применяемое к координатному пространству кисти. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Устанавливает значение, определяющее гамма‑функцию для интерполяции цветов. |
| [setEndPoint(Point2D value)](#setEndPoint-java.awt.geom.Point2D-) | Возвращает/устанавливает конечную точку линейного градиента. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Устанавливает список градиентных остановок, составляющих градиент. |
| [setOpacity(float value)](#setOpacity-float-) | Устанавливает значение, определяющее равномерную прозрачность заливки кисти. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Устанавливает значение, описывающее, как кисть должна заполнять область содержимого за пределами основной, начальной области градиента. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Устанавливает начальную точку линейного градиента. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Устанавливает матричное преобразование, применяемое к координатному пространству кисти. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsLinearGradientBrush deepClone()
```


Создаёт копию этой линейной градиентной кисти.

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - Clone of this linear gradient brush.
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
### getEndPoint() {#getEndPoint--}
```
public Point2D getEndPoint()
```


Возвращает конечную точку линейного градиента.

**Returns:**
java.awt.geom.Point2D — конечная точка линейного градиента.
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
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Возвращает значение, описывающее, как кисть должна заполнять область содержимого за пределами основной, начальной области градиента.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Возвращает начальную точку линейного градиента.

**Returns:**
java.awt.geom.Point2D — начальная точка линейного градиента.
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Устанавливает значение, определяющее гамма‑функцию для интерполяции цветов. Коррекция гаммы не должна применяться к альфа‑компоненту, если он указан.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Значение, определяющее гамма‑функцию для интерполяции цветов. |

### setEndPoint(Point2D value) {#setEndPoint-java.awt.geom.Point2D-}
```
public void setEndPoint(Point2D value)
```


Возвращает/устанавливает конечную точку линейного градиента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.awt.geom.Point2D | Конечная точка линейного градиента. |

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

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Устанавливает значение, описывающее, как кисть должна заполнять область содержимого за пределами основной, начальной области градиента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Значение, описывающее, как кисть должна заполнять область содержимого за пределами основной, начальной области градиента. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Устанавливает начальную точку линейного градиента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.awt.geom.Point2D | Начальная точка линейного градиента. |

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

