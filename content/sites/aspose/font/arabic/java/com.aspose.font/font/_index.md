---
title: "الخط"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل الفئة الأساسية Font."
type: docs
weight: 32
url: /ar/java/com.aspose.font/font/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFont](../../com.aspose.font/ifont), [com.aspose.font.IGlyphAccessor](../../com.aspose.font/iglyphaccessor), [com.aspose.font.IFontSaver](../../com.aspose.font/ifontsaver)
```
public abstract class Font implements IFont, IGlyphAccessor, IFontSaver
```

يمثل الفئة الأساسية Font.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | يقوم بتحويل الخط إلى تنسيق آخر. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | يعيد جميع معرّفات glyph المتاحة في الخط. |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | يحصل على ترميز الخط. |
| [getFontDefinition()](#getFontDefinition--) | يحصل على تعريف الخط. |
| [getFontFamily()](#getFontFamily--) | يحصل على عائلة الخط. |
| [getFontName()](#getFontName--) | يحصل على اسم واجهة الخط. |
| [getFontNames()](#getFontNames--) | يحصل على أسماء الخط. |
| [getFontSaver()](#getFontSaver--) | يحصل على وظيفة حفظ الخط. |
| [getFontStyle()](#getFontStyle--) | يحصل على نمط الخط. |
| [getFontType()](#getFontType--) | يحصل على نوع الخط. |
| [getGlyphAccessor()](#getGlyphAccessor--) | الوصول إلى رموز الخط. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | يعيد الحرف حسب معرفه. |
| [getGlyphIdType()](#getGlyphIdType--) | مواصفات نوع معرف Glyph. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | يحصل على تمثيل الرموز للنص. |
| [getMetrics()](#getMetrics--) | يحصل على مقاييس الخط. |
| [getNumGlyphs()](#getNumGlyphs--) | يحصل على عدد الرموز في الخط. |
| [getPostscriptNames()](#getPostscriptNames--) | يحصل على أسماء خطوط PostScript. |
| [getStyle()](#getStyle--) | يحصل على نمط الخط. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | يفتح خطًا باستخدام كائن FontDefinition. |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | يفتح خطًا باستخدام نوع الخط ومصفوفة بايتات بيانات الخط. |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | يفتح خطًا باستخدام نوع الخط ومصدر الدفق. |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | يفتح خطًا باستخدام نوع الخط واسم ملف الخط. |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | يحفظ الخط بالتنسيق الأصلي. |
| [save(String fileName)](#save-java.lang.String-) | يحفظ الخط بالتنسيق الأصلي. |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | يحفظ الخط بالتنسيق المحدد. |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | يضبط عائلة الخط. |
| [setFontName(String value)](#setFontName-java.lang.String-) | يضبط اسم وجه الخط. |
| [setStyle(String value)](#setStyle-java.lang.String-) | يضبط نمط الخط. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public abstract Font convert(FontType fontType)
```


يقوم بتحويل الخط إلى تنسيق آخر.

--------------------

> ```
> Note: TTF Font type is now supported only.
> ```

fontType نوع تنسيق الخط للتحويل إليه.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) |  |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
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
### getAllGlyphIds() {#getAllGlyphIds--}
```
public abstract GlyphId[] getAllGlyphIds()
```


يعيد جميع معرّفات glyph المتاحة في الخط. معرّف glyph هو رقم فريد لحرف glyph، يعتمد على نوع الخط. على سبيل المثال: معرّف Type1 هو اسم glyph، وهو مثال على فئة (GlyphStringId). ومعرّف TTF هو فهرس عدد صحيح، وهو مثال على فئة (GlyphInt32Id).

**Returns:**
com.aspose.font.GlyphId[] - معرفات الرموز.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncoding() {#getEncoding--}
```
public abstract IFontEncoding getEncoding()
```


يحصل على ترميز الخط.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public abstract FontDefinition getFontDefinition()
```


يحصل على تعريف الخط.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public abstract String getFontFamily()
```


يحصل على عائلة الخط.

**Returns:**
java.lang.String - عائلة الخط.
### getFontName() {#getFontName--}
```
public abstract String getFontName()
```


يحصل على اسم واجهة الخط.

**Returns:**
java.lang.String - اسم وجه الخط.
### getFontNames() {#getFontNames--}
```
public abstract MultiLanguageString getFontNames()
```


يحصل على أسماء الخط.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names.
### getFontSaver() {#getFontSaver--}
```
public IFontSaver getFontSaver()
```


يحصل على وظيفة حفظ الخط.

**Returns:**
[IFontSaver](../../com.aspose.font/ifontsaver) - Font save functionality.
### getFontStyle() {#getFontStyle--}
```
public abstract int getFontStyle()
```


يحصل على نمط الخط. هذه قيمة محسوبة وممثلة بنوع عام.

**Returns:**
int - نمط الخط. عادةً، مزيج من قيم أعلام ثابتة لفئة FontStyle أو 0.
### getFontType() {#getFontType--}
```
public abstract FontType getFontType()
```


يحصل على نوع الخط.

--------------------

> ```
> Type1, TrueType etc.
> ```

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getGlyphAccessor() {#getGlyphAccessor--}
```
public IGlyphAccessor getGlyphAccessor()
```


مستخرج رموز الخط. يسترجع الرموز ومعرفات الرموز.

**Returns:**
[IGlyphAccessor](../../com.aspose.font/iglyphaccessor) - Font glyph accessor.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public abstract Glyph getGlyphById(GlyphId id)
```


يعيد glyph بناءً على معرّف glyph. معرّف glyph هو رقم فريد لحرف glyph، يعتمد على نوع الخط. GlyphId - كائن مشتق. على سبيل المثال: معرّف Type1 هو اسم glyph، وهو مثال على فئة (GlyphStringId). ومعرّف TTF هو فهرس عدد صحيح، وهو مثال على فئة (GlyphInt32Id).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | معرف الرمز. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public abstract GlyphIdType getGlyphIdType()
```


مواصفات نوع معرّف glyph. للمستهلكين الذين يحتاجون إلى معرفة النوع الحقيقي لـ 'bytes[]'.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Id type specification
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


يحصل على تمثيل الرموز للنص.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| text | java.lang.String | نص الإدخال. |

**Returns:**
com.aspose.font.GlyphId[] - مصفوفة GlyphId.
### getMetrics() {#getMetrics--}
```
public abstract IFontMetrics getMetrics()
```


يحصل على مقاييس الخط.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public abstract int getNumGlyphs()
```


يحصل على عدد الرموز في الخط.

**Returns:**
int - عدد الرموز في الخط.
### getPostscriptNames() {#getPostscriptNames--}
```
public abstract MultiLanguageString getPostscriptNames()
```


يحصل على أسماء خطوط PostScript.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public abstract String getStyle()
```


يحصل على نمط الخط. هذه قيمة سلسلة خام مقدمة من ملف الخط.

**Returns:**
java.lang.String - نمط الخط.
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




### open(FontDefinition fontDefinition) {#open-com.aspose.font.FontDefinition-}
```
public static Font open(FontDefinition fontDefinition)
```


يفتح خطًا باستخدام كائن FontDefinition.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontDefinition | [FontDefinition](../../com.aspose.font/fontdefinition) | كائن تعريف الخط. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, byte[] fontData) {#open-com.aspose.font.FontType-byte---}
```
public static Font open(FontType fontType, byte[] fontData)
```


يفتح خطًا باستخدام نوع الخط ومصفوفة بايتات بيانات الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fontData | byte[] | مصفوفة بايت لتحميل الخط منها. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, StreamSource fontStreamSource) {#open-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public static Font open(FontType fontType, StreamSource fontStreamSource)
```


يفتح خطًا باستخدام نوع الخط ومصدر الدفق.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fontStreamSource | [StreamSource](../../com.aspose.font/streamsource) | مصدر الدفق للخط. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, String fileName) {#open-com.aspose.font.FontType-java.lang.String-}
```
public static Font open(FontType fontType, String fileName)
```


يفتح خطًا باستخدام نوع الخط واسم ملف الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fileName | java.lang.String | اسم ملف الخط. |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


يحفظ الخط بالتنسيق الأصلي.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | java.io.OutputStream | دفق لحفظ الخط. |

### save(String fileName) {#save-java.lang.String-}
```
public void save(String fileName)
```


يحفظ الخط بالتنسيق الأصلي.

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fileName | java.lang.String | ملف لحفظ الخط. |

### saveToFormat(OutputStream stream, FontSavingFormats outFormat) {#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-}
```
public void saveToFormat(OutputStream stream, FontSavingFormats outFormat)
```


يحفظ الخط بالتنسيق المحدد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | java.io.OutputStream | دفق لحفظ الخط |
| outFormat | [FontSavingFormats](../../com.aspose.font/fontsavingformats) | الصيغة المطلوبة |

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public abstract void setFontFamily(String value)
```


يضبط عائلة الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | عائلة الخط الجديدة. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public abstract void setFontName(String value)
```


يضبط اسم وجه الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | اسم واجهة الخط الجديدة. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public abstract void setStyle(String value)
```


يضبط نمط الخط. هذه قيمة نصية خام مقدمة من ملف الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | نمط الخط الجديد. |

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

