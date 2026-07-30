---
title: "CompositeGlyph"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل حرف مركب للخط."
type: docs
weight: 25
url: /ar/java/com.aspose.font/compositeglyph/
---
**Inheritance:**
java.lang.Object, [com.aspose.font/Glyph](../../com.aspose.font/glyph)
```
public class CompositeGlyph extends Glyph
```

يمثل حرف مركب للخط.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [clone()](#clone--) | يعيد نسخة من glyph. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getComponents()](#getComponents--) | يحصل على قائمة المكونات. |
| [getGlyphBBox()](#getGlyphBBox--) | يحصل على BBox للglyph. |
| [getLeftSidebearingX()](#getLeftSidebearingX--) | يحصل على إحداثي x للجانب الجانبي للglyph. |
| [getLeftSidebearingY()](#getLeftSidebearingY--) | يحصل على إحداثي y للجانب الجانبي للglyph. |
| [getPath()](#getPath--) | يحصل على مسار الـ glyph. |
| [getSourceResolution()](#getSourceResolution--) | يحصل على دقة مجموعة الأوامر المصدر. |
| [getState()](#getState--) | يحصل على حالة الـ glyph. |
| [getWidthVectorX()](#getWidthVectorX--) | يحصل على متجه عرض الـ glyph. |
| [getWidthVectorY()](#getWidthVectorY--) | يحصل على متجه عرض الـ glyph. |
| [hashCode()](#hashCode--) |  |
| [isEmpty()](#isEmpty--) | صحيح إذا لم يحتوي الـ glyph على تعليمات الرسم. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clone() {#clone--}
```
public Object clone()
```


يعيد نسخة من glyph.

**Returns:**
java.lang.Object - نسخة من Glyph
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
### getComponents() {#getComponents--}
```
public CompositeGlyphComponentList getComponents()
```


يحصل على قائمة المكونات.

**Returns:**
[CompositeGlyphComponentList](../../com.aspose.font/compositeglyphcomponentlist) - Components list.
### getGlyphBBox() {#getGlyphBBox--}
```
public FontBBox getGlyphBBox()
```


يحصل على BBox للglyph.

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Glyph BBox
### getLeftSidebearingX() {#getLeftSidebearingX--}
```
public double getLeftSidebearingX()
```


يحصل على إحداثي x للجانب الجانبي للglyph.

**Returns:**
double - إحداثي x للجانب الجانبي للglyph.
### getLeftSidebearingY() {#getLeftSidebearingY--}
```
public double getLeftSidebearingY()
```


يحصل على إحداثي y للجانب الجانبي للglyph.

**Returns:**
double - إحداثي y للجانب الجانبي للglyph.
### getPath() {#getPath--}
```
public SegmentPath getPath()
```


يحصل على مسار الـ glyph.

**Returns:**
[SegmentPath](../../com.aspose.font/segmentpath) - Glyph path.
### getSourceResolution() {#getSourceResolution--}
```
public int getSourceResolution()
```


يحصل على دقة مجموعة الأوامر المصدر.

**Returns:**
int - دقة مجموعة الأوامر المصدر.
### getState() {#getState--}
```
public GlyphState getState()
```


يحصل على حالة الـ glyph.

**Returns:**
[GlyphState](../../com.aspose.font/glyphstate) - Glyph state.
### getWidthVectorX() {#getWidthVectorX--}
```
public double getWidthVectorX()
```


يحصل على متجه عرض الـ glyph. الإحداثي x.

**Returns:**
double - متجه عرض الـ glyph. الإحداثي x.
### getWidthVectorY() {#getWidthVectorY--}
```
public double getWidthVectorY()
```


يحصل على متجه عرض الـ glyph. الإحداثي y.

**Returns:**
double - متجه عرض الـ glyph. الإحداثي y.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```


صحيح إذا لم يحتوي الـ glyph على تعليمات الرسم.

**Returns:**
boolean - صحيح إذا لم يحتوي الـ glyph على تعليمات الرسم.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

