---
title: "XpsCanvas"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий особенности элемента Canvas."
type: docs
weight: 16
url: /ru/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Класс, инкапсулирующий функции элемента Canvas. Этот элемент группирует элементы вместе. Например, элементы Glyphs и Path могут быть сгруппированы в canvas, чтобы быть идентифицированными как единица (как назначение гиперссылки) или чтобы применить составное значение свойства к каждому дочернему и предшествующему элементу.
## Методы

| Метод | Описание |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Добавляет элемент в список дочерних элементов этого canvas. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Вставляет элемент в список дочерних элементов этого canvas в позицию индекса. |
| [addCanvas()](#addCanvas--) | Добавляет новый canvas в список дочерних элементов этого canvas. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Добавляет новые glyphs в список дочерних элементов этого canvas. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Добавляет новый path в список дочерних элементов этого canvas. |
| [deepClone()](#deepClone--) | Клонирует этот canvas. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Обеспечивает доступ к дочерним элементам по индексу i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Возвращает геометрию пути, ограничивающую отрисованную область элемента. |
| [getEdgeMode()](#getEdgeMode--) | Возвращает значение, которое контролирует, как рендерятся края путей внутри canvas. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Возвращает объект цели гиперссылки. |
| [getOpacity()](#getOpacity--) | Возвращает значение, определяющее равномерную прозрачность элемента. |
| [getOpacityMask()](#getOpacityMask--) | Возвращает кисть, задающую маску альфа‑значений, применяемую к элементу так же, как атрибут Opacity, но позволяющую использовать разные альфа‑значения для разных областей элемента. |
| [getRenderTransform()](#getRenderTransform--) | Возвращает аффинную матрицу преобразования, устанавливающую новую систему координат для всех атрибутов элемента и всех его дочерних элементов (если есть). |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Вставляет новый canvas в список дочерних элементов этого canvas в позицию индекса. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Вставляет новые glyphs в список дочерних элементов этого canvas в позицию индекса. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Вставляет новый path в список дочерних элементов этого canvas в позицию индекса. |
| [iterator()](#iterator--) | Реализация интерфейса Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Устанавливает геометрию пути, ограничивающую отрисованную область элемента. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Устанавливает значение, которое контролирует, как рендерятся края путей внутри canvas. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Устанавливает объект цели гиперссылки. |
| [setOpacity(float value)](#setOpacity-float-) | Устанавливает значение, определяющее равномерную прозрачность элемента. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Устанавливает кисть, задающую маску альфа‑значений, которая применяется к элементу так же, как атрибут Opacity, но позволяет использовать разные альфа‑значения для разных областей элемента. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Устанавливает аффинную матрицу преобразования, создающую новую систему координат для всех атрибутов элемента и всех дочерних элементов (если есть). |
| [size()](#size--) | Возвращает количество дочерних элементов. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Добавляет элемент в список дочерних элементов этого canvas.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| элемент | T | Элемент для добавления. |

**Returns:**
T - Добавленный элемент.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Вставляет элемент в список дочерних элементов этого canvas в позицию индекса.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой элемент должен быть вставлен. |
| элемент | T | Элемент для вставки. |

**Returns:**
T - Вставленный элемент.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Добавляет новый canvas в список дочерних элементов этого canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Добавляет новые glyphs в список дочерних элементов этого canvas.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontFamily | java.lang.String | Семейство шрифтов. |
| fontSize | float | Размер шрифта. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Стиль шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата T начала glyphs. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Добавляет новый path в список дочерних элементов этого canvas.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Геометрия пути. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Клонирует этот canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Возвращает значение, которое контролирует, как рендерятся края путей внутри canvas.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Вставляет новый canvas в список дочерних элементов этого canvas в позицию индекса.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует вставить новый canvas. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Вставляет новые glyphs в список дочерних элементов этого canvas в позицию индекса.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует вставить новые glyphs. |
| fontFamily | java.lang.String | Семейство шрифтов. |
| fontSize | float | Размер шрифта. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Стиль шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата T начала glyphs. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Вставляет новый path в список дочерних элементов этого canvas в позицию индекса.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует вставить новый path. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Геометрия пути. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Устанавливает значение, которое контролирует, как рендерятся края путей внутри canvas.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | Режим рендеринга краёв. |

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

