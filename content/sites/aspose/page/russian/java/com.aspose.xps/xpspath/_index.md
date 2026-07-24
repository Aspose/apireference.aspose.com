---
title: "XpsPath"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий свойства элемента Path."
type: docs
weight: 40
url: /ru/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Класс, инкапсулирующий функции элемента Path. Этот элемент является единственным способом добавления векторной графики и изображений на фиксированную страницу. Он определяет одну векторную графику, которая будет отрисована на странице.
## Методы

| Метод | Описание |
| --- | --- |
| [deepClone()](#deepClone--) | Клонирует этот путь. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Обеспечивает доступ к дочерним элементам по индексу i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Возвращает геометрию пути, ограничивающую отрисованную область элемента. |
| [getData()](#getData--) | Возвращает геометрию пути. |
| [getFill()](#getFill--) | Возвращает кисть, используемую для закраски геометрии, указанной в свойстве Data пути. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Возвращает объект цели гиперссылки. |
| [getOpacity()](#getOpacity--) | Возвращает значение, определяющее равномерную прозрачность элемента. |
| [getOpacityMask()](#getOpacityMask--) | Возвращает кисть, задающую маску альфа‑значений, применяемую к элементу так же, как атрибут Opacity, но позволяющую использовать разные альфа‑значения для разных областей элемента. |
| [getRenderTransform()](#getRenderTransform--) | Возвращает аффинную матрицу преобразования, устанавливающую новую систему координат для всех атрибутов элемента и всех его дочерних элементов (если есть). |
| [getStroke()](#getStroke--) | Возвращает кисть, используемую для рисования обводки. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Возвращает массив, задающий длину тире и пробелов контура обводки. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Возвращает значение, определяющее, как рисуются концы каждого тире. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Возвращает начальную точку для повторения шаблона массива тире. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Возвращает значение, определяющее форму конца последнего тире в обводке. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Возвращает значение, определяющее форму начала первого тире в обводке. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Возвращает отношение между максимальной длиной среза и половиной толщины обводки. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Возвращает значение, определяющее форму начала первого тире в обводке. |
| [getStrokeThickness()](#getStrokeThickness--) | Возвращает толщину обводки в единицах эффективного координатного пространства (включает трансформацию рендеринга пути). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Реализация интерфейса Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Устанавливает геометрию пути, ограничивающую отрисованную область элемента. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Устанавливает геометрию пути. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Устанавливает кисть, используемую для закраски геометрии, указанной в свойстве Data пути. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Устанавливает объект цели гиперссылки. |
| [setOpacity(float value)](#setOpacity-float-) | Устанавливает значение, определяющее равномерную прозрачность элемента. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Устанавливает кисть, задающую маску альфа‑значений, которая применяется к элементу так же, как атрибут Opacity, но позволяет использовать разные альфа‑значения для разных областей элемента. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Устанавливает аффинную матрицу преобразования, создающую новую систему координат для всех атрибутов элемента и всех дочерних элементов (если есть). |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Устанавливает кисть, используемую для рисования обводки. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Устанавливает массив, задающий длину тире и пробелов контура обводки. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Устанавливает значение, определяющее, как рисуются концы каждого тире. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Устанавливает начальную точку для повторения шаблона массива тире. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Устанавливает значение, определяющее форму конца последнего тире в обводке. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Устанавливает значение, определяющее форму начала первого тире в обводке. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Устанавливает отношение между максимальной длиной среза и половиной толщины обводки. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Устанавливает значение, определяющее форму начала первого тире в обводке. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Устанавливает толщину обводки в единицах эффективного координатного пространства (включает трансформацию рендеринга пути). |
| [size()](#size--) | Возвращает количество дочерних элементов. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Клонирует этот путь.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Возвращает геометрию пути.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Возвращает кисть, используемую для закраски геометрии, указанной в свойстве Data пути.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
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
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Возвращает кисть, используемую для рисования обводки.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Возвращает массив, задающий длину тире и пробелов контура обводки.

**Returns:**
float[] - Массив, задающий длину тире и пробелов контура обводки.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Возвращает значение, определяющее, как рисуются концы каждого тире.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Возвращает начальную точку для повторения шаблона массива тире. Если это значение опущено, массив тире выравнивается с началом обводки.

**Returns:**
float - Начальная точка для повторения шаблона массива пунктиров.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Возвращает значение, определяющее форму конца последнего тире в обводке.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Возвращает значение, определяющее форму начала первого тире в обводке.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Возвращает отношение между максимальной длиной среза и половиной толщины штриха. Это значение имеет значение только если атрибут  StrokeLineJoin  указывает  Miter .

**Returns:**
float - Отношение между максимальной длиной среза и половиной толщины штриха.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Возвращает значение, определяющее форму начала первого тире в обводке.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Возвращает толщину штриха в единицах эффективного координатного пространства (включает преобразование рендеринга пути). Штрих рисуется поверх границы геометрии, указанной свойством Data элемента Path\\u2019s. Половина StrokeThickness выходит за пределы геометрии, указанной свойством Data, а другая половина находится внутри геометрии.

**Returns:**
float - Толщина штриха.
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

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Устанавливает геометрию пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Геометрия пути. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Устанавливает кисть, используемую для закраски геометрии, указанной в свойстве Data пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Кисть, используемая для закраски указанной геометрии |

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

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Устанавливает кисть, используемую для рисования обводки.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Кисть, используемая для рисования штриха. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Устанавливает массив, задающий длину тире и пробелов контура обводки.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float[] | Массив, определяющий длину пунктиров и промежутков контура штриха. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Устанавливает значение, определяющее, как рисуются концы каждого тире.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | Значение, определяющее, как рисуются концы каждого пунктирного отрезка. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Устанавливает начальную точку для повторения шаблона массива пунктиров. Если это значение опущено, массив пунктиров выравнивается с началом штриха.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Начальная точка для повторения шаблона массива пунктиров. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Устанавливает значение, определяющее форму конца последнего тире в обводке.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Значение, определяющее форму конца последнего пунктирного отрезка в штрихе. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Устанавливает значение, определяющее форму начала первого тире в обводке.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | Значение, определяющее форму начала первого пунктирного отрезка в штрихе. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Устанавливает отношение между максимальной длиной среза и половиной толщины штриха. Это значение имеет значение только если атрибут  StrokeLineJoin  указывает  Miter .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Отношение между максимальной длиной среза и половиной толщины штриха. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Устанавливает значение, определяющее форму начала первого тире в обводке.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Значение, определяющее форму начала первого пунктирного отрезка в штрихе. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Устанавливает толщину штриха в единицах эффективного координатного пространства (включает преобразование рендеринга пути). Штрих рисуется поверх границы геометрии, указанной свойством Data элемента Path\\u2019s. Половина StrokeThickness выходит за пределы геометрии, указанной свойством Data, а другая половина находится внутри геометрии.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Толщина штриха. |

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

