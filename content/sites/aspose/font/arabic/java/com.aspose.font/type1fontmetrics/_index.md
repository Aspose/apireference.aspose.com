---
title: "Type1FontMetrics"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل قياسات خط Type1."
type: docs
weight: 116
url: /ar/java/com.aspose.font/type1fontmetrics/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontMetrics](../../com.aspose.font/fontmetrics)
```
public class Type1FontMetrics extends FontMetrics
```

يمثل قياسات خط Type1.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAscender()](#getAscender--) | يحصل على قيمة الصاعد. |
| [getAscender(double fontSize)](#getAscender-double-) | يعيد قيمة الصاعد لحجم الخط المحدد. |
| [getCapHeight()](#getCapHeight--) | يحصل على قيمة ارتفاع الحرف العلوي. |
| [getClass()](#getClass--) |  |
| [getDescender()](#getDescender--) | يحصل على قيمة النازل. |
| [getDescender(double fontSize)](#getDescender-double-) | يعيد قيمة النازل لحجم الخط المحدد. |
| [getFontBBox()](#getFontBBox--) | يحصل على قيمة FontBBox. |
| [getFontMatrix()](#getFontMatrix--) | يحصل على مصفوفة تحويل الخط. |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | يعيد Bbox للرمز. |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | يعيد عرض الرمز. |
| [getItalicAngle()](#getItalicAngle--) | يحصل على قيمة زاوية المائل. |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | يعيد قيمة التباعد للزوج من الرموز. |
| [getLineGap()](#getLineGap--) | يحصل على قيمة LineGap. |
| [getStdHW()](#getStdHW--) | يحصل على قيمة StdHW. |
| [getStdVW()](#getStdVW--) | يحصل على قيمة StdVW. |
| [getTypoAscender()](#getTypoAscender--) | يحصل على قيمة TypoAscender. |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | يعيد الصاعد الطباعي لحجم الخط المحدد. |
| [getTypoDescender()](#getTypoDescender--) | يحصل على قيمة TypoDescender. |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | يعيد النازل الطباعي لحجم الخط المحدد. |
| [getTypoLineGap()](#getTypoLineGap--) | يحصل على قيمة TypoLineGap. |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | يعيد الفجوة الخطية لحجم الخط المحدد. |
| [getUnderlinePosition()](#getUnderlinePosition--) | يحصل على قيمة موضع الخط السفلي. |
| [getUnderlineThickness()](#getUnderlineThickness--) | يحصل على قيمة سمك الخط السفلي. |
| [getUnitsPerEM()](#getUnitsPerEM--) | يحصل على قيمة UnitsPerEM للخط السفلي. |
| [getWeight()](#getWeight--) | يحصل على الوزن. |
| [getXHeight()](#getXHeight--) | يحصل على قيمة XHeight. |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | يحصل على قيمة IsFixedPitch. |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | يقيس السلسلة ويعيد عرض السلسلة. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAscender(double value)](#setAscender-double-) | يضبط قيمة Ascender. |
| [setDescender(double value)](#setDescender-double-) | يضبط قيمة Descender. |
| [setGlyphWidth(GlyphId glyphId, double value)](#setGlyphWidth-com.aspose.font.GlyphId-double-) | يضبط عرض الرمز. |
| [setTypoAscender(double value)](#setTypoAscender-double-) | يضبط قيمة TypoAscender. |
| [setTypoDescender(double value)](#setTypoDescender-double-) | يضبط قيمة TypoDescender. |
| [setUnitsPerEM(long value)](#setUnitsPerEM-long-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAscender() {#getAscender--}
```
public double getAscender()
```


يحصل على قيمة الصاعد.

**Returns:**
double - قيمة Ascender.
### getAscender(double fontSize) {#getAscender-double-}
```
public double getAscender(double fontSize)
```


يعيد قيمة الصاعد لحجم الخط المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontSize | double | حجم الخط. |

**Returns:**
double - قيمة Ascender.
### getCapHeight() {#getCapHeight--}
```
public double getCapHeight()
```


يحصل على قيمة ارتفاع الحرف العلوي.

**Returns:**
double - قيمة ارتفاع القمة.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDescender() {#getDescender--}
```
public double getDescender()
```


يحصل على قيمة النازل.

**Returns:**
double - قيمة Descender.
### getDescender(double fontSize) {#getDescender-double-}
```
public double getDescender(double fontSize)
```


يعيد قيمة النازل لحجم الخط المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontSize | double | حجم الخط. |

**Returns:**
double - قيمة Descender.
### getFontBBox() {#getFontBBox--}
```
public FontBBox getFontBBox()
```


يحصل على قيمة FontBBox.

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - FontBBox value.
### getFontMatrix() {#getFontMatrix--}
```
public TransformationMatrix getFontMatrix()
```


يحصل على مصفوفة تحويل الخط.

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - Font transformation matrix.
### getGlyphBBox(GlyphId glyphId) {#getGlyphBBox-com.aspose.font.GlyphId-}
```
public FontBBox getGlyphBBox(GlyphId glyphId)
```


يعيد Bbox للرمز. يعيد FontBBox إذا لم يتم تعريف BBox للرمز. قد يتم تجاوزها بواسطة وراثي ترميز الخط المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | معرف الرمز. |

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Glyph BBox.
### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public double getGlyphWidth(GlyphId glyphId)
```


يعيد عرض الحرف. قد يتم تجاوزها من قبل وراثي ترميز الخط المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | معرف الرمز. |

**Returns:**
double - عرض glyph.
### getItalicAngle() {#getItalicAngle--}
```
public double getItalicAngle()
```


يحصل على قيمة زاوية المائل.

**Returns:**
double - قيمة زاوية المائل.
### getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId) {#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-}
```
public double getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)
```


يعيد قيمة التباعد للزوج من الرموز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| prevGlyphId | [GlyphId](../../com.aspose.font/glyphid) | أول glyph في الزوج. |
| nextGlyphId | [GlyphId](../../com.aspose.font/glyphid) | حجم الخط. |

**Returns:**
double - قيمة Kerning.
### getLineGap() {#getLineGap--}
```
public double getLineGap()
```


يحصل على قيمة LineGap.

**Returns:**
double - قيمة LineGap.
### getStdHW() {#getStdHW--}
```
public double getStdHW()
```


يحصل على قيمة StdHW.

**Returns:**
double - قيمة StdHW.
### getStdVW() {#getStdVW--}
```
public double getStdVW()
```


يحصل على قيمة StdVW.

**Returns:**
double - قيمة StdVW.
### getTypoAscender() {#getTypoAscender--}
```
public double getTypoAscender()
```


يحصل على قيمة TypoAscender.

**Returns:**
double - قيمة TypoAscender.
### getTypoAscender(double fontSize) {#getTypoAscender-double-}
```
public double getTypoAscender(double fontSize)
```


يعيد الصاعد الطباعي لحجم الخط المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontSize | double | حجم الخط. |

**Returns:**
double - قيمة Typographic ascender.
### getTypoDescender() {#getTypoDescender--}
```
public double getTypoDescender()
```


يحصل على قيمة TypoDescender.

**Returns:**
double - قيمة TypoDescender.
### getTypoDescender(double fontSize) {#getTypoDescender-double-}
```
public double getTypoDescender(double fontSize)
```


يعيد النازل الطباعي لحجم الخط المحدد.

param fontSize حجم الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontSize | double |  |

**Returns:**
double - قيمة Typographic descender.
### getTypoLineGap() {#getTypoLineGap--}
```
public double getTypoLineGap()
```


يحصل على قيمة TypoLineGap.

**Returns:**
double - قيمة TypoLineGap.
### getTypoLineGap(double fontSize) {#getTypoLineGap-double-}
```
public double getTypoLineGap(double fontSize)
```


يعيد الفجوة الخطية لحجم الخط المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontSize | double | حجم الخط. |

**Returns:**
double - قيمة Line gap.
### getUnderlinePosition() {#getUnderlinePosition--}
```
public double getUnderlinePosition()
```


يحصل على قيمة موضع الخط السفلي.

**Returns:**
double - قيمة موضع الخط السفلي.
### getUnderlineThickness() {#getUnderlineThickness--}
```
public double getUnderlineThickness()
```


يحصل على قيمة سمك الخط السفلي.

**Returns:**
double - قيمة سمك الخط السفلي.
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


يحصل على قيمة UnitsPerEM للخط السفلي.

**Returns:**
long - قيمة UnitsPerEM للخط السفلي.
### getWeight() {#getWeight--}
```
public String getWeight()
```


يحصل على الوزن.

**Returns:**
java.lang.String - الوزن.
### getXHeight() {#getXHeight--}
```
public double getXHeight()
```


يحصل على قيمة XHeight.

**Returns:**
double - قيمة XHeight.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isFixedPitch() {#isFixedPitch--}
```
public boolean isFixedPitch()
```


يحصل على قيمة IsFixedPitch.

**Returns:**
boolean - قيمة IsFixedPitch.
### measureString(String unicode, double fontSize) {#measureString-java.lang.String-double-}
```
public double measureString(String unicode, double fontSize)
```


يقيس السلسلة ويعيد عرض السلسلة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| unicode | java.lang.String | سلسلة Unicode. |
| fontSize | double | حجم الخط. |

**Returns:**
double - عرض String.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAscender(double value) {#setAscender-double-}
```
public void setAscender(double value)
```


يضبط قيمة Ascender.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | double | قيمة Ascender. |

### setDescender(double value) {#setDescender-double-}
```
public void setDescender(double value)
```


يضبط قيمة Descender.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | double | قيمة Descender. |

### setGlyphWidth(GlyphId glyphId, double value) {#setGlyphWidth-com.aspose.font.GlyphId-double-}
```
public void setGlyphWidth(GlyphId glyphId, double value)
```


يضبط عرض الرمز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | معرف الرمز. |
| القيمة | double | العرض الجديد. |

### setTypoAscender(double value) {#setTypoAscender-double-}
```
public void setTypoAscender(double value)
```


يضبط قيمة TypoAscender.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | double | قيمة TypoAscender. |

### setTypoDescender(double value) {#setTypoDescender-double-}
```
public void setTypoDescender(double value)
```


يضبط قيمة TypoDescender.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | double | قيمة TypoDescender. |

### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public void setUnitsPerEM(long value)
```


يضبط قيمة UnitsPerEM.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | long |  |

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

