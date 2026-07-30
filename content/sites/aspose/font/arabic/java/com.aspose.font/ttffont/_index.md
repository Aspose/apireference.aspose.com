---
title: "TtfFont"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل خط TrueType (TTF)."
type: docs
weight: 94
url: /ar/java/com.aspose.font/ttffont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font)
```
public class TtfFont extends Font
```

يمثل خط TrueType (TTF).
## الطرق

| طريقة | الوصف |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | يقوم بتحويل الخط إلى تنسيق آخر. |
| [convert(FontType fontType, Collection<Integer> limitingCharacterSet)](#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--) | يقوم بتحويل الخط إلى تنسيق آخر مع مجموعة أحرف محدودة  *ملاحظة: نوع خط TTF مدعوم الآن فقط.* |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | يعيد مصفوفة جميع معرّفات الرموز المتاحة في الخط. |
| [getCffFont()](#getCffFont--) | يحصل على خط CFF إذا كان موجودًا. |
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
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | يعيد الرمز حسب معرّف الرمز. |
| [getGlyphById(String glyphName)](#getGlyphById-java.lang.String-) | يعيد الرمز حسب اسم الرمز. |
| [getGlyphById(long id)](#getGlyphById-long-) | يعيد الرمز حسب معرّف الرمز. |
| [getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-) | يحصل على رمز وفقًا لمعرّف الرمز الممرّر ويملأ القائمة الممرّرة لمعرّفات الرموز بمكوّنات هذا الرمز. |
| [getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-) | يحصل على رمز وفقًا لاسم الرمز الممرّر ويملأ القائمة الممرّرة لمعرّفات الرموز بمكوّنات هذا الرمز. |
| [getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-) | يحصل على رمز وفقًا لفهرس الرمز الممرّر ويملأ القائمة الممرّرة لمعرّفات الرموز بمكوّنات هذا الرمز. |
| [getGlyphIdType()](#getGlyphIdType--) | يحصل على مواصفات نوع معرّف الرمز. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | احصل على تمثيل الرموز للنص. |
| [getMetrics()](#getMetrics--) | يحصل على مقاييس الخط. |
| [getNumGlyphs()](#getNumGlyphs--) | يحصل على عدد الرموز في الخط. |
| [getPostscriptNames()](#getPostscriptNames--) | يحصل على أسماء خطوط Postscript. |
| [getStyle()](#getStyle--) | يحصل على نمط الخط. |
| [getTtfTables()](#getTtfTables--) | يحصل على جداول TTF. |
| [hashCode()](#hashCode--) |  |
| [isSymbolic()](#isSymbolic--) | يرجع true في حالة كون الخط رمزيًا. |
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
public Font convert(FontType fontType)
```


يحوّل الخط إلى تنسيق آخر. ملاحظة: نوع خط TTF مدعوم الآن فقط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع تنسيق الخط للتحويل إليه. |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
### convert(FontType fontType, Collection<Integer> limitingCharacterSet) {#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--}
```
public Font convert(FontType fontType, Collection<Integer> limitingCharacterSet)
```


يقوم بتحويل الخط إلى تنسيق آخر مع مجموعة أحرف محدودة  *ملاحظة: نوع خط TTF مدعوم الآن فقط.*

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع تنسيق الخط للتحويل إليه. |
| limitingCharacterSet | java.util.Collection<java.lang.Integer> | مجموعة الأحرف المحدودة. |

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


يرجع مصفوفة من جميع معرفات الرموز المتاحة في الخط. معرف الرمز هو رقم فريد للرمز، يعتمد على نوع الخط. يمكن أن يكون معرف رمز خط TTF مثالًا على الفئة ( GlyphStringId ) أو الفئة ( GlyphUInt32Id ). دعم عنوان الرموز بالاسم (string) متاح لخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF داخل، تُستخدم هياكل CFF لتحديد الرموز بالاسم.

**Returns:**
com.aspose.font.GlyphId[] - معرفات الرموز.
### getCffFont() {#getCffFont--}
```
public Font getCffFont()
```


يحصل على خط CFF إذا كان موجودًا.

**Returns:**
[Font](../../com.aspose.font/font) - CFF Font.
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


يحصل على ترميز الخط.

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
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


يحصل على اسم واجهة الخط.

**Returns:**
java.lang.String - اسم وجه الخط.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


يحصل على أسماء الخط.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names
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
int - نمط الخط. عادةً، مزيج من قيم أعلام ثابتة لفئة FontStyle أو 0.
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


يحصل على نوع الخط. يرجع قيمة FontType.TTF.

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


يُعيد الرمز وفقًا لمعرف الرمز. معرف الرمز هو رقم فريد للرمز، يعتمد على نوع الخط. يمكن أن يكون معرف رمز خط TTF مثالًا على فئة ( GlyphStringId ) أو فئة ( GlyphUInt32Id ). يتم دعم عنونة الرموز بالاسم (string) لخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF، تُستخدم هياكل CFF لعناوين الرموز بالاسم.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) |  |

**Returns:**
[Glyph](../../com.aspose.font/glyph)
### getGlyphById(String glyphName) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String glyphName)
```


يُعيد الرمز وفقًا لاسم الرمز. يتم دعم عنونة الرموز بالاسم (string) لخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF، تُستخدم هياكل CFF لعناوين الرموز بالاسم.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphName | java.lang.String | معرف سلسلة الرمز. |

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
| معرف | long | فهرس الرمز. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)
```


يحصل على رمز وفقًا لمعرف الرمز الممرر ويملأ القائمة الممررة لمعرفات الرموز بمكونات هذا الرمز. معرف الرمز هو رقم فريد للرمز، يعتمد على نوع الخط. يمكن أن يكون معرف رمز خط TTF مثالًا على فئة ( GlyphStringId ) أو فئة ( GlyphUInt32Id ). يتم دعم عنونة الرموز بالاسم (string) لخطوط TTF عبر تعيين جدول Post. في حالة وجود خط CFF، تُستخدم هياكل CFF لعناوين الرموز بالاسم.

--------------------

يجب تمرير مجموعة فارغة componentsToPopulate التي ستحتوي على قائمة معرفات مكونات الرموز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | معرف الرمز. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | قائمة بمعرفات الرموز للتعبئة. |

### getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)
```


يحصل على رمز وفقًا لاسم الرمز الممرّر ويملأ القائمة الممرّرة لمعرّفات الرموز بمكوّنات هذا الرمز.

--------------------

يجب تمرير مجموعة فارغة componentsToPopulate التي ستحتوي على قائمة معرفات مكونات الرموز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| glyphName | java.lang.String | اسم الرمز. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | قائمة بمعرفات الرموز للتعبئة. |

### getGlyphComponentsById(long id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)
```


يحصل على رمز وفقًا لفهرس الرمز الممرّر ويملأ القائمة الممرّرة لمعرّفات الرموز بمكوّنات هذا الرمز.

--------------------

يجب تمرير مجموعة فارغة componentsToPopulate التي ستحتوي على قائمة معرفات مكونات الرموز.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| معرف | long | فهرس الرمز. |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | قائمة بمعرفات الرموز للتعبئة. |

### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


يحصل على مواصفات نوع معرّف الرمز.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Glyph id type specification.
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


احصل على تمثيل الرموز للنص.

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


يحصل على أسماء خطوط Postscript.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public String getStyle()
```


يحصل على نمط الخط. هذه قيمة سلسلة خام مقدمة من ملف الخط.

**Returns:**
java.lang.String - نمط الخط.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


يحصل على جداول TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - TTF tables.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSymbolic() {#isSymbolic--}
```
public boolean isSymbolic()
```


يرجع true في حالة كون الخط رمزيًا.

**Returns:**
boolean - صحيح في حالة كان الخط رمزيًا.
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


يضبط عائلة الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | عائلة الخط الجديدة. |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


يضبط اسم وجه الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | اسم واجهة الخط الجديدة. |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
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

