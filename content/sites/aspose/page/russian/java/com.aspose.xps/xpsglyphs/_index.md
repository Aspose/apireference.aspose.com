---
title: "XpsGlyphs"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий особенности элемента Glyphs."
type: docs
weight: 25
url: /ru/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Класс, инкапсулирующий свойства элемента Glyphs. Этот элемент представляет последовательность одинаково отформатированного текста из одного шрифта. Он предоставляет информацию, необходимую для точного рендеринга, и поддерживает функции поиска и выделения в потребителях просмотра.
## Методы

| Метод | Описание |
| --- | --- |
| [deepClone()](#deepClone--) | Клонировать эти глифы. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Обеспечивает доступ к дочерним элементам по индексу i. |
| [getBidiLevel()](#getBidiLevel--) | Возвращает значение, указывающее уровень вложенности двунаправленного алгоритма Unicode. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Возвращает геометрию пути, ограничивающую отрисованную область элемента. |
| [getFill()](#getFill--) | Возвращает кисть, используемую для заполнения формы отрисованных глифов. |
| [getFont()](#getFont--) | Возвращает ресурс шрифта TrueType, используемый для наборa текста элементов. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Возвращает размер шрифта в единицах поверхности рисования, представленный как число с плавающей точкой в единицах эффективного координатного пространства. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Возвращает объект цели гиперссылки. |
| [getOpacity()](#getOpacity--) | Возвращает значение, определяющее равномерную прозрачность элемента. |
| [getOpacityMask()](#getOpacityMask--) | Возвращает кисть, задающую маску альфа‑значений, применяемую к элементу так же, как атрибут Opacity, но позволяющую использовать разные альфа‑значения для разных областей элемента. |
| [getOriginX()](#getOriginX--) | Возвращает координату x первого глифа в последовательности, в единицах эффективного координатного пространства. |
| [getOriginY()](#getOriginY--) | Возвращает координату y первого глифа в последовательности, в единицах эффективного координатного пространства. |
| [getRenderTransform()](#getRenderTransform--) | Возвращает аффинную матрицу преобразования, устанавливающую новую систему координат для всех атрибутов элемента и всех его дочерних элементов (если есть). |
| [getStyleSimulations()](#getStyleSimulations--) | Возвращает значение, определяющее симуляцию стиля. |
| [getUnicodeString()](#getUnicodeString--) | Возвращает строку текста, отрисованную элементом Glyphs. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | Возвращает значение, указывающее, что глиф повернут боком, при этом начало определяется как верхний центр неповернутого глифа. |
| [iterator()](#iterator--) | Реализация интерфейса Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Устанавливает значение, определяющее уровень вложенности двунаправленного алгоритма Unicode. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Устанавливает геометрию пути, ограничивающую отрисованную область элемента. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Устанавливает кисть, используемую для заполнения формы отрисованных глифов. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Устанавливает размер шрифта в единицах поверхности рисования, представленный как число с плавающей точкой в единицах эффективного координатного пространства. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Устанавливает объект цели гиперссылки. |
| [setOpacity(float value)](#setOpacity-float-) | Устанавливает значение, определяющее равномерную прозрачность элемента. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Устанавливает кисть, задающую маску альфа‑значений, которая применяется к элементу так же, как атрибут Opacity, но позволяет использовать разные альфа‑значения для разных областей элемента. |
| [setOriginX(float value)](#setOriginX-float-) | Устанавливает координату x первого глифа в последовательности, в единицах эффективного координатного пространства. |
| [setOriginY(float value)](#setOriginY-float-) | Устанавливает координату y первого глифа в последовательности, в единицах эффективного координатного пространства. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Устанавливает аффинную матрицу преобразования, создающую новую систему координат для всех атрибутов элемента и всех дочерних элементов (если есть). |
| [setSideways(boolean value)](#setSideways-boolean-) | Устанавливает значение, указывающее, что глиф повернут боком, при этом начало определяется как верхний центр неповернутого глифа. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Устанавливает значение, определяющее симуляцию стиля. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Устанавливает строку текста, отрисованную элементом Glyphs. |
| [size()](#size--) | Возвращает количество дочерних элементов. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Клонировать эти глифы.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Возвращает значение, определяющее уровень вложенности двунаправленного алгоритма Unicode. Четные значения подразумевают раскладку слева направо, нечетные — раскладку справа налево. При раскладке справа налево начало последовательности размещается справа от первого глифа, а положительные ширины продвижения (обозначающие продвижение влево) размещают последующие глифы слева от предыдущего глифа.

**Returns:**
int — значение, определяющее уровень вложенности двунаправленного алгоритма Unicode.
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Возвращает кисть, используемую для заполнения формы отрисованных глифов.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


Возвращает ресурс шрифта TrueType, используемый для наборa текста элементов.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


Возвращает размер шрифта в единицах поверхности рисования, представленный как число с плавающей точкой в единицах эффективного координатного пространства.

**Returns:**
float - Размер шрифта.
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Возвращает координату x первого глифа в последовательности, в единицах эффективного координатного пространства.

**Returns:**
float - Координата x первого глифа в последовательности, в единицах эффективного координатного пространства.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Возвращает координату y первого глифа в последовательности, в единицах эффективного координатного пространства.

**Returns:**
float - Координата y первого глифа в последовательности, в единицах эффективного координатного пространства.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Возвращает аффинную матрицу преобразования, устанавливающую новую систему координат для всех атрибутов элемента и всех его дочерних элементов (если есть).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Возвращает значение, определяющее симуляцию стиля.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Возвращает строку текста, отрисованного элементом Glyphs. Текст задаётся в виде кодовых точек Unicode.

**Returns:**
java.lang.String - Строка текста, отрисованного элементом Glyphs.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


Возвращает значение, указывающее, что глиф повернут боком, при этом начало определяется как верхний центр неповернутого глифа.

**Returns:**
boolean - Значение, указывающее, что глиф повернут на бок.
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Устанавливает значение, определяющее уровень вложенности би‑направленного алгоритма Unicode. Чётные значения подразумевают расположение слева направо, нечётные — справа налево. При расположении справа налево начало последовательности размещается справа от первого глифа, а положительные ширины продвижения (обозначающие перемещение влево) размещают последующие глифы слева от предыдущего глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Значение, определяющее уровень вложенности би‑направленного алгоритма Unicode. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Устанавливает геометрию пути, ограничивающую отрисованную область элемента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Геометрия пути, ограничивающая отрисованную область элемента. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Устанавливает кисть, используемую для заполнения формы отрисованных глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Кисть, используемая для заполнения формы отрисованных глифов. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Устанавливает размер шрифта в единицах поверхности рисования, представленный как число с плавающей точкой в единицах эффективного координатного пространства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Размер шрифта. |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Устанавливает координату x первого глифа в последовательности, в единицах эффективного координатного пространства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Координата x первого глифа в последовательности, в единицах эффективного координатного пространства. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Устанавливает координату y первого глифа в последовательности, в единицах эффективного координатного пространства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Координата y первого глифа в последовательности, в единицах эффективного координатного пространства. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Устанавливает аффинную матрицу преобразования, создающую новую систему координат для всех атрибутов элемента и всех дочерних элементов (если есть).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Аффинная матрица преобразования. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Устанавливает значение, указывающее, что глиф повернут боком, при этом начало определяется как верхний центр неповернутого глифа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | boolean | Значение, указывающее, что глиф повернут на бок. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Устанавливает значение, определяющее симуляцию стиля.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | Значение, определяющее имитацию стиля. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Устанавливает строку текста, отрисованного элементом Glyphs. Текст задаётся в виде кодовых точек Unicode.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Строка текста, отрисованного элементом Glyphs. |

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

