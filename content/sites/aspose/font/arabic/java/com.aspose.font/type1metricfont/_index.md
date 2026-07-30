---
title: "Type1MetricFont"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "تنفيذ خط Type1 للقياسات."
type: docs
weight: 117
url: /ar/java/com.aspose.font/type1metricfont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font), [com.aspose.font.Type1Font](../../com.aspose.font/type1font)
```
public class Type1MetricFont extends Type1Font
```

تنفيذ خط Type1 metric. تم إنشاء هذا الخط type1 باستخدام المقاييس فقط. وظائف استرجاع الحروف وبعض الوظائف الأخرى التي تتطلب خطًا حقيقيًا غير مسموح بها، الوظائف غير المسموح بها ترمي استثناء Type1NotSupportedException. الخصائص الأخرى (FontName، Weight، Metrics و Encoding) تُستخدم من ملف المقاييس.

--------------------

> ```
> Note: If metrics file defines Encoding as "FontSpecific", user should provide the specific encoding with following way:
>      string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
>      FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
>  ```
> 
>      System::ArrayPtr<System::String> zapfDingbatsEncoding = System::MakeArray<System::String>({nullptr, nullptr, ..., u"space", u"a1", ...});
>      FontEnvironment::get_Current()->get_FontSpecificEncodings()->RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);
>  
> ```
> ```
## الطرق

| طريقة | الوصف |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | يقوم بتحويل الخط إلى تنسيق آخر. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | يعيد جميع معرفات الحروف المتاحة في الخط. |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | الترميز معرف في ملف المقاييس. |
| [getFontDefinition()](#getFontDefinition--) | يحصل على تعريف الخط. |
| [getFontFamily()](#getFontFamily--) | يحصل على عائلة الخط. |
| [getFontName()](#getFontName--) | يحصل على اسم الخط. |
| [getFontNames()](#getFontNames--) | يحصل على أسماء الخط. |
| [getFontSaver()](#getFontSaver--) | يحصل على وظيفة حفظ الخط. |
| [getFontStyle()](#getFontStyle--) | يحصل على نمط الخط. |
| [getFontType()](#getFontType--) | يحصل على نوع الخط. |
| [getGlyphAccessor()](#getGlyphAccessor--) | الوصول إلى رموز الخط. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | يعيد الحرف حسب معرفه. |
| [getGlyphById(String id)](#getGlyphById-java.lang.String-) | يعيد الحرف حسب معرفه. |
| [getGlyphById(long id)](#getGlyphById-long-) | يعيد الرمز حسب معرّف الرمز. |
| [getGlyphIdType()](#getGlyphIdType--) | مواصفات نوع معرف Glyph. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | يحصل على تمثيل الرموز للنص. |
| [getMetrics()](#getMetrics--) | يحصل على مقاييس الخط. |
| [getNumGlyphs()](#getNumGlyphs--) | يحصل على عدد الرموز في الخط. |
| [getPostscriptNames()](#getPostscriptNames--) | يحصل على أسماء الخط Postscript. |
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
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | لم يتم تنفيذ مُعيّن عائلة الخط بعد. |
| [setFontName(String value)](#setFontName-java.lang.String-) | لم يتم تنفيذ مُعيّن اسم وجه الخط بعد. |
| [setStyle(String value)](#setStyle-java.lang.String-) | لم يتم تنفيذ مُعيّن النمط بعد. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public Font convert(FontType fontType)
```


يقوم بتحويل الخط إلى تنسيق آخر.

> ```
> Note: TTF Font type is now supported only.
> ```

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع تنسيق الخط للتحويل إليه. |

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
public GlyphId[] getAllGlyphIds()
```


يعيد جميع معرفات الحروف المتاحة في الخط. غير مدعوم لنوع Type1MetricFont.

**Returns:**
com.aspose.font.GlyphId[] - جميع معرفات الحروف المتاحة في الخط.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncoding() {#getEncoding--}
```
public IFontEncoding getEncoding()
```


الترميز معرف في ملف المقاييس. StandardAdobeEncoding: يتم تعبئة الترميز تلقائيًا.

--------------------

> ```
> FontSpecific:
>         user should provide the specific encoding with following way:
>      string[] zapfDingbatsEncoding = new string[256] {null, null, ... , "space", "a1", ...};
>      FontEnvironment.Current.FontSpecificEncodings.RegisterEncoding("ZapfDingbats", zapfDingbatsEncoding);
>  ```
> 
>      System::ArrayPtr<System::String> zapfDingbatsEncoding = System::MakeArray<System::String>({nullptr, nullptr, ..., u"space", u"a1", ...});
>      FontEnvironment::get_Current()->get_FontSpecificEncodings()->RegisterEncoding(u"ZapfDingbats", zapfDingbatsEncoding);
>  
> ```
> ```

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding)
### getFontDefinition() {#getFontDefinition--}
```
public FontDefinition getFontDefinition()
```


يحصل على تعريف الخط.

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public String getFontFamily()
```


يحصل على عائلة الخط.

**Returns:**
java.lang.String - عائلة الخط.
### getFontName() {#getFontName--}
```
public String getFontName()
```


يحصل على اسم الخط.

**Returns:**
java.lang.String - اسم الخط.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
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
public int getFontStyle()
```


يحصل على نمط الخط. هذه قيمة محسوبة وممثلة بنوع عام.

**Returns:**
int - يحصل على نمط الخط. عادةً، مزيج من قيم أعلام ثابتة في فئة FontStyle أو 0.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


يحصل على نوع الخط. يعيد القيمة FontType.Type1.

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
public Glyph getGlyphById(GlyphId id)
```


يعيد الحرف حسب معرفه. غير مدعوم لنوع (@code Type1MetricFont\}.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | معرف الرمز. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(String id) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String id)
```


يعيد الحرف حسب معرفه. غير مدعوم لنوع (@code Type1MetricFont\}.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| معرف | java.lang.String | معرف الرمز. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(long id) {#getGlyphById-long-}
```
public Glyph getGlyphById(long id)
```


يعيد الرمز حسب معرّف الرمز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| معرف | long | معرف الرمز. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


مواصفات نوع معرف Glyph.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype)
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
public IFontMetrics getMetrics()
```


يحصل على مقاييس الخط.

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


يحصل على عدد الرموز في الخط.

**Returns:**
int - عدد الرموز في الخط.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


يحصل على أسماء الخط Postscript.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names
### getStyle() {#getStyle--}
```
public String getStyle()
```


يحصل على نمط الخط.

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
public void setFontFamily(String value)
```


لم يتم تنفيذ مُعيّن عائلة الخط بعد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | عائلة الخط الجديدة. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


لم يتم تنفيذ مُعيّن اسم وجه الخط بعد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | اسم واجهة الخط الجديدة. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
```


لم يتم تنفيذ مُعيّن Style بعد. هذه قيمة سلسلة خام مقدمة من ملف الخط.

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

