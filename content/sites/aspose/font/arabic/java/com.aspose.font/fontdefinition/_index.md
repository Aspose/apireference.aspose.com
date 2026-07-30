---
title: "FontDefinition"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل تعريف مجموعة ملفات Font."
type: docs
weight: 38
url: /ar/java/com.aspose.font/fontdefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontDefinition
```

يمثل تعريف مجموعة ملفات الخط. تحتوي هذه الفئة على حقول لا تتعلق ببيانات الخط الداخلية. تصف هذه الحقول موضع الخط وبيانات أخرى مطلوبة لتحميل الخط من مصدر الخط (ملف، ذاكرة، إلخ).
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition(FontType fontType, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition(FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | ينشئ تعريف خط بملف واحد. |
| [FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | ينشئ تعريف خط متعدد الملفات. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | ينشئ تعريف خط متعدد الملفات. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | ينشئ تعريف خط متعدد الملفات. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | ينشئ تعريف خط متعدد الملفات. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileDefinitions()](#getFileDefinitions--) | يحصل على مجموعة تعريفات الملفات. |
| [getFontName()](#getFontName--) | يعيد اسم الخط. |
| [getFontNames()](#getFontNames--) | يحصل على أسماء الخط كـ MultiLanguageString. |
| [getFontType()](#getFontType--) | يحصل على نوع الخط. |
| [getPostscriptName()](#getPostscriptName--) | يحصل على اسم خط Postscript. |
| [getPostscriptNames()](#getPostscriptNames--) | يحصل على أسماء خط Postscript كـ MultiLanguageString. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(StreamSource source, FontType fontType)](#open-com.aspose.font.StreamSource-com.aspose.font.FontType-) | يعيد FontDefinition لمصدر تدفق الخط ونوع الخط. |
| [open(String fileName, FontType fontType)](#open-java.lang.String-com.aspose.font.FontType-) | يعيد FontDefinition لملف الخط ونوع الخط. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)
```


ينشئ تعريف خط بملف واحد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fileExtension | java.lang.String | امتداد ملف الخط. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | مصدر تدفق الخط. |

### FontDefinition(FontType fontType, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, StreamSource streamSource)
```


ينشئ تعريف خط بملف واحد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | مصدر تدفق الخط. |

### FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)
```


ينشئ تعريف خط بملف واحد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontName | java.lang.String | اسم الخط. |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fileExtension | java.lang.String | امتداد ملف الخط. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | مصدر تدفق الخط. |

### FontDefinition(FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(FontType fontType, FontFileDefinition fileDefinition)
```


ينشئ تعريف خط بملف واحد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)
```


ينشئ تعريف خط بملف واحد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontName | java.lang.String | اسم الخط. |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)
```


ينشئ تعريف خط بملف واحد.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontName | java.lang.String | اسم الخط. |
| postscriptName | java.lang.String | اسم خط Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)
```


ينشئ تعريف خط متعدد الملفات.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | مصفوفة من كائنات FontFileDefinition. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)
```


ينشئ تعريف خط متعدد الملفات.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontName | java.lang.String | اسم الخط. |
| postscriptName | java.lang.String | اسم خط Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | مصفوفة من كائنات FontFileDefinition. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)
```


ينشئ تعريف خط متعدد الملفات.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | أسماء الخط. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | أسماء خط Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)
```


ينشئ تعريف خط متعدد الملفات.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | أسماء الخط. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | أسماء خط Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | مصفوفة من كائنات FontFileDefinition. |

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
### getFileDefinitions() {#getFileDefinitions--}
```
public FontFileDefinition[] getFileDefinitions()
```


يحصل على مجموعة تعريفات الملفات.

**Returns:**
com.aspose.font.FontFileDefinition[] - مجموعة تعريفات الملفات.
### getFontName() {#getFontName--}
```
public String getFontName()
```


يعيد اسم الخط.

**Returns:**
java.lang.String - اسم الخط.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


يحصل على أسماء الخط كـ MultiLanguageString.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names as a  MultiLanguageString .
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


يحصل على نوع الخط.

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getPostscriptName() {#getPostscriptName--}
```
public String getPostscriptName()
```


يحصل على اسم خط Postscript.

**Returns:**
java.lang.String - اسم خط Postscript.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


يحصل على أسماء خط Postscript كـ MultiLanguageString.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names as a  MultiLanguageString .
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




### open(StreamSource source, FontType fontType) {#open-com.aspose.font.StreamSource-com.aspose.font.FontType-}
```
public static FontDefinition open(StreamSource source, FontType fontType)
```


يعيد FontDefinition لمصدر تدفق الخط ونوع الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| source | [StreamSource](../../com.aspose.font/streamsource) | مصدر تدفق الخط. |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - FontDefinition.
### open(String fileName, FontType fontType) {#open-java.lang.String-com.aspose.font.FontType-}
```
public static FontDefinition open(String fileName, FontType fontType)
```


يعيد FontDefinition لملف الخط ونوع الخط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fileName | java.lang.String | اسم ملف الخط. |
| fontType | [FontType](../../com.aspose.font/fonttype) | نوع الخط. |

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - FontDefinition.
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

