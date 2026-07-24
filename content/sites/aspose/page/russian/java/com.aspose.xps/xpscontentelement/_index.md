---
title: "XpsContentElement"
second_title: "Справочник API Aspose.Page для Java"
description: "Инкапсулирует функции элементов XPS‑контента Canvas, Path и Glyphs."
type: docs
weight: 18
url: /ru/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

Инкапсулирует особенности элементов содержимого XPS: Canvas, Path и Glyphs.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Обеспечивает доступ к дочерним элементам по индексу i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Возвращает геометрию пути, ограничивающую отрисованную область элемента. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Возвращает объект цели гиперссылки. |
| [getOpacity()](#getOpacity--) | Возвращает значение, определяющее равномерную прозрачность элемента. |
| [getOpacityMask()](#getOpacityMask--) | Возвращает кисть, задающую маску альфа‑значений, применяемую к элементу так же, как атрибут Opacity, но позволяющую использовать разные альфа‑значения для разных областей элемента. |
| [getRenderTransform()](#getRenderTransform--) | Возвращает аффинную матрицу преобразования, устанавливающую новую систему координат для всех атрибутов элемента и всех его дочерних элементов (если есть). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Реализация интерфейса Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Устанавливает геометрию пути, ограничивающую отрисованную область элемента. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Устанавливает объект цели гиперссылки. |
| [setOpacity(float value)](#setOpacity-float-) | Устанавливает значение, определяющее равномерную прозрачность элемента. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Устанавливает кисть, задающую маску альфа‑значений, которая применяется к элементу так же, как атрибут Opacity, но позволяет использовать разные альфа‑значения для разных областей элемента. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Устанавливает аффинную матрицу преобразования, создающую новую систему координат для всех атрибутов элемента и всех дочерних элементов (если есть). |
| [size()](#size--) | Возвращает количество дочерних элементов. |
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


Обеспечивает доступ к дочерним элементам по индексу i.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| i | int | Индекс дочернего элемента. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


Возвращает геометрию пути, ограничивающую отрисованную область элемента.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Возвращает объект цели гиперссылки.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Возвращает значение, определяющее равномерную прозрачность элемента.

**Returns:**
float — значение, определяющее равномерную прозрачность элемента.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Возвращает кисть, задающую маску альфа‑значений, применяемую к элементу так же, как атрибут Opacity, но позволяющую использовать разные альфа‑значения для разных областей элемента.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Возвращает аффинную матрицу преобразования, устанавливающую новую систему координат для всех атрибутов элемента и всех его дочерних элементов (если есть).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Реализация интерфейса Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> — возвращает перечислитель для списка.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Устанавливает геометрию пути, ограничивающую отрисованную область элемента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Геометрия пути, ограничивающая отрисованную область элемента. |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Устанавливает объект цели гиперссылки.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Объект цели гиперссылки. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Устанавливает значение, определяющее равномерную прозрачность элемента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Значение, определяющее равномерную прозрачность элемента. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Устанавливает кисть, задающую маску альфа‑значений, которая применяется к элементу так же, как атрибут Opacity, но позволяет использовать разные альфа‑значения для разных областей элемента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Кисть, задающая маску. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Устанавливает аффинную матрицу преобразования, создающую новую систему координат для всех атрибутов элемента и всех дочерних элементов (если есть).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Аффинная матрица преобразования. |

### size() {#size--}
```
public int size()
```


Возвращает количество дочерних элементов.

**Returns:**
int — количество дочерних элементов.
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

