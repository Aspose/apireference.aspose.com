---
title: "XpsTilingBrush"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий общие свойства элементов кистей плитки VisualBrush и ImageBrush."
type: docs
weight: 51
url: /ru/java/com.aspose.xps/xpstilingbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush)
```
public abstract class XpsTilingBrush extends XpsTransformableBrush
```

Класс, инкапсулирующий общие свойства элементов кистей с мозаикой (VisualBrush и ImageBrush).
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Возвращает значение, определяющее равномерную прозрачность заливки кисти. |
| [getTileMode()](#getTileMode--) | Возвращает значение, указывающее, как выполняется чередование в заполненной геометрии. |
| [getTransform()](#getTransform--) | Возвращает матричное преобразование, применяемое к координатному пространству кисти. |
| [getViewbox()](#getViewbox--) | Возвращает область исходного содержимого кисти, которое будет отображено во вьюпорте. |
| [getViewport()](#getViewport--) | Возвращает позицию и размеры первой плитки кисти. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Устанавливает значение, определяющее равномерную прозрачность заливки кисти. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Устанавливает значение, указывающее, как выполняется чередование в заполненной геометрии. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Устанавливает матричное преобразование, применяемое к координатному пространству кисти. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Устанавливает область исходного содержимого кисти, которое будет отображено во вьюпорте. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Устанавливает позицию и размеры первой плитки кисти. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Возвращает значение, определяющее равномерную прозрачность заливки кисти.

**Returns:**
float - Значение, определяющее равномерную прозрачность заливки кисти.
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Возвращает значение, указывающее, как выполняется чередование в заполненной геометрии.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Возвращает матричное преобразование, применяемое к координатному пространству кисти. Свойство Transform конкатенируется с текущим эффективным преобразованием рендеринга, чтобы получить эффективное преобразование рендеринга, локальное для кисти. Вьюпорт кисти преобразуется с использованием локального эффективного преобразования рендеринга.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Возвращает область исходного содержимого кисти, которое будет отображено во вьюпорте.

**Returns:**
java.awt.geom.Rectangle2D - Область исходного содержимого кисти, которое будет отображено во вьюпорте.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


Возвращает позицию и размеры первой плитки кисти. Последующие плитки позиционируются относительно этой плитки, как указано в режиме чередования.

**Returns:**
java.awt.geom.Rectangle2D - Позиция и размеры первой плитки кисти.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Устанавливает значение, определяющее равномерную прозрачность заливки кисти.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Значение, определяющее равномерную прозрачность заливки кисти. |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Устанавливает значение, указывающее, как выполняется чередование в заполненной геометрии.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Значение, указывающее, как выполняется чередование в заполненной геометрии. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Устанавливает матричное преобразование, применяемое к координатному пространству кисти. Свойство Transform конкатенируется с текущим эффективным преобразованием рендеринга, чтобы получить эффективное преобразование рендеринга, локальное для кисти. Вьюпорт кисти преобразуется с использованием локального эффективного преобразования рендеринга.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Матричное преобразование, применяемое к координатному пространству кисти. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Устанавливает область исходного содержимого кисти, которое будет отображено во вьюпорте.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.awt.geom.Rectangle2D | Область исходного содержимого кисти, которое будет отображено во вьюпорте. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


Устанавливает позицию и размеры первой плитки кисти. Последующие плитки позиционируются относительно этой плитки, как указано в режиме чередования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.awt.geom.Rectangle2D | Позиция и размеры первой плитки кисти. |

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

