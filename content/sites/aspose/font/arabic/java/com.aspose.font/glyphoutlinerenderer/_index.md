---
title: "GlyphOutlineRenderer"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل مُرَسِّم مخطط الحرف."
type: docs
weight: 52
url: /ar/java/com.aspose.font/glyphoutlinerenderer/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.GlyphRendererBase](../../com.aspose.font/glyphrendererbase)
```
public class GlyphOutlineRenderer extends GlyphRendererBase
```

يمثل مُرَسِّم مخطط الحرف.
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [GlyphOutlineRenderer(IGlyphOutlinePainter painter)](#GlyphOutlineRenderer-com.aspose.font.IGlyphOutlinePainter-) | يُنشئ كائن GlyphOutlineRenderer جديد. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [renderGlyph(IFont font, GlyphId glyphId)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-) | يعرض glyph. |
| [renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | يعرض glyph، هدف هذا الإصدار المحمل - للاستخدام مع ذاكرة التخزين المؤقت للglyphs. |
| [renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-) | يعرض glyph. |
| [renderGlyph(IFont font, long glyphIndex)](#renderGlyph-com.aspose.font.IFont-long-) | يعرض glyph |
| [renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)](#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-) | يعرض glyph. |
| [renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)](#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-) | يعرض glyph باستخدام مسار glyph مستقل. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### GlyphOutlineRenderer(IGlyphOutlinePainter painter) {#GlyphOutlineRenderer-com.aspose.font.IGlyphOutlinePainter-}
```
public GlyphOutlineRenderer(IGlyphOutlinePainter painter)
```


يُنشئ كائن GlyphOutlineRenderer جديد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| painter | [IGlyphOutlinePainter](../../com.aspose.font/iglyphoutlinepainter) | رسام الحرف. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
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


يعرض glyph.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | الخط الذي يحتوي على glyph. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | فهرس glyph الفيزيائي داخل الخط. لاحظ أن هذا ليس Unicode. |

### renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


يعرض glyph، هدف هذا الإصدار المحمل - للاستخدام مع ذاكرة التخزين المؤقت للglyphs.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | الخط الذي يحتوي على glyph. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | فهرس glyph الفيزيائي داخل الخط. لاحظ أن هذا ليس Unicode. |
| glyph | [Glyph](../../com.aspose.font/glyph) | glyph للتنفيذ. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | المصفوفة التي تُطبق على إحداثيات glyph. |

### renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, GlyphId glyphId, TransformationMatrix glyphPlacementMatrix)
```


يعرض glyph.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | الخط الذي يحتوي على glyph. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | فهرس glyph الفيزيائي داخل الخط. لاحظ أن هذا ليس Unicode. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | المصفوفة التي تُطبق على إحداثيات glyph. |

### renderGlyph(IFont font, long glyphIndex) {#renderGlyph-com.aspose.font.IFont-long-}
```
public void renderGlyph(IFont font, long glyphIndex)
```


يعرض glyph

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | الخط الذي يحتوي على glyph. |
| glyphIndex | long | فهرس glyph الفيزيائي داخل الخط. لاحظ أن هذا ليس Unicode. |

### renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix) {#renderGlyph-com.aspose.font.IFont-long-com.aspose.font.TransformationMatrix-}
```
public void renderGlyph(IFont font, long glyphIndex, TransformationMatrix glyphPlacementMatrix)
```


يعرض glyph.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | الخط الذي يحتوي على glyph. |
| glyphIndex | long | فهرس glyph الفيزيائي داخل الخط. لاحظ أن هذا ليس Unicode. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | المصفوفة التي تُطبق على إحداثيات glyph. |

### renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix) {#renderIndependentGlyphPath-com.aspose.font.IFont-com.aspose.font.GlyphId-com.aspose.font.Glyph-com.aspose.font.TransformationMatrix-}
```
public void renderIndependentGlyphPath(IFont font, GlyphId glyphId, Glyph glyph, TransformationMatrix glyphPlacementMatrix)
```


يقوم بعرض glyph باستخدام مسار glyph مستقل. عائلة الدالة RenderGlyph() تغير مسار glyph عند العرض. يؤدي ذلك إلى ضرورة إعادة تحميل هذا glyph مرة أخرى. تستخدم هذه الدالة نسخة من مسار glyph ولا تغير مسار glyph الأصلي، لذا يمكن إعادة استخدام نفس glyph عدة مرات. تم تصميم هذا الإصدار من الدالة للاستخدام مع ذاكرة تخزين مؤقتة لل glyphs.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| font | [IFont](../../com.aspose.font/ifont) | الخط الذي يحتوي على glyph. |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | فهرس glyph الفيزيائي داخل الخط. لاحظ أن هذا ليس Unicode. |
| glyph | [Glyph](../../com.aspose.font/glyph) | glyph للتنفيذ. |
| glyphPlacementMatrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | المصفوفة التي تُطبق على إحداثيات glyph. |

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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

