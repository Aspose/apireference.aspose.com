---
title: "GlyphRendererBase"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет базовый класс для рендереров глифов."
type: docs
weight: 53
url: /ru/java/com.aspose.font/glyphrendererbase/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IGlyphRenderer](../../com.aspose.font/iglyphrenderer)
```
public abstract class GlyphRendererBase implements IGlyphRenderer
```

Представляет базовый класс для рендереров глифов.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [renderGlyph(IFont font, GlyphId glyphId)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-) | Отрисовывает глиф. |
| [renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | Отрисовывает глиф, цель этой перегруженной версии — использовать кэш для глифов. |
| [renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-) | Отрисовывает глиф. |
| [renderGlyph(IFont font, long glyphIndex)](#renderGlyph-com.aspose.font.IFont-long-) | Отрисовывает глиф |
| [renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-) | Отрисовывает глиф. |
| [renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | Отрисовывает глиф, используя независимый путь глифа. |
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




### renderGlyph(IFont font, GlyphId glyphId) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-}
```
public void renderGlyph(IFont font, GlyphId glyphId)
```


Отрисовывает глиф.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Шрифт, содержащий глиф. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Физический индекс глифа внутри шрифта. Обратите внимание, что это не юникод. |

### renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


Отрисовывает глиф, цель этой перегруженной версии — использовать кэш для глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Шрифт, содержащий глиф. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Физический индекс глифа внутри шрифта. Обратите внимание, что это не юникод. |
| glyph | [Glyph](../../com.aspose.font/glyph) | Глиф для отрисовки. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Матрица, применяемая к координатам глифа. |

### renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)
```


Отрисовывает глиф.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Шрифт, содержащий глиф. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Физический индекс глифа внутри шрифта. Обратите внимание, что это не юникод. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Матрица, применяемая к координатам глифа. |

### renderGlyph(IFont font, long glyphIndex) {#renderGlyph-com.aspose.font.IFont-long-}
```
public void renderGlyph(IFont font, long glyphIndex)
```


Отрисовывает глиф

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Шрифт, содержащий глиф. |
| glyphIndex | long | Физический индекс глифа внутри шрифта. Обратите внимание, что это не юникод. |

### renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)
```


Отрисовывает глиф.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Шрифт, содержащий глиф. |
| glyphIndex | long | Физический индекс глифа внутри шрифта. Обратите внимание, что это не юникод. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Матрица, применяемая к координатам глифа. |

### renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


Отрисовывает глиф, используя независимый путь глифа. Семейство функций RenderGlyph() изменяет путь глифа при отрисовке. Это приводит к необходимости повторно загружать этот глиф. Эта функция использует копию пути глифа и не изменяет оригинальный путь глифа, поэтому один и тот же глиф может быть использован многократно. Эта версия функции предназначена для использования с кешем глифов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | Шрифт, содержащий глиф. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | Физический индекс глифа внутри шрифта. Обратите внимание, что это не юникод. |
| glyph | [Glyph](../../com.aspose.font/glyph) | Глиф для отрисовки. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Матрица, применяемая к координатам глифа. |

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

