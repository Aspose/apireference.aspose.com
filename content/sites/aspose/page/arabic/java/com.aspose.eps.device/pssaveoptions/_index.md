---
title: "PsSaveOptions"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "تحتوي هذه الفئة على الخيارات اللازمة لإدارة عملية التحويل."
type: docs
weight: 12
url: /ar/java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

تحتوي هذه الفئة على الخيارات اللازمة لإدارة عملية التحويل.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | إنشاء نسخة جديدة من الفئة PdfSaveOptions بالقيم الافتراضية للعلامات suppressErrors (true) و debug (false). |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | إنشاء نسخة جديدة من الفئة PdfSaveOptions بالقيم الافتراضية للعلامة debug (false). |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | إرجاع مجلدات خطوط إضافية حيث يجب على المحول العثور على الخطوط للمستند المدخل. |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | الحصول على العلامة التي تُظهر ما إذا كان من الضروري حفظ الخطوط غير TrueType إلى TTF. |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [getExceptions()](#getExceptions--) | إرجاع قائمة بالأخطاء غير الحرجة. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | يعيد القيمة التي تحدد مستوى الضغط لصورة. |
| [getMargins()](#getMargins--) |  |
| [getPageSize()](#getPageSize--) |  |
| [getSaveFormat()](#getSaveFormat--) |  |
| [getSize()](#getSize--) | الحصول على حجم الصفحة أو الصورة. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | الحصول على العلامة التي تسمح بإخراج التحذيرات والرسائل أثناء التحويل. |
| [isEmbedFonts()](#isEmbedFonts--) | يشير إلى ما إذا كان يجب تضمين الخطوط المستخدمة في مستند PS |
| [isSupressErrors()](#isSupressErrors--) | إرجاع قيمة تشير إلى ما إذا كانت الأخطاء ستُقمع أثناء التحويل. |
| [isTransparent()](#isTransparent--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | تحديد مجلدات خطوط إضافية حيث يجب على المحول العثور على الخطوط للمستند المدخل. |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | تحديد ما إذا كان يجب حفظ الخطوط غير TrueType إلى TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | تحديد العلامة التي تسمح بإخراج التحذيرات والرسائل أثناء التحويل. |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | يحدد ما إذا كان يجب تضمين الخطوط المستخدمة في مستند PS |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | حدد نوع الخط الذي سيتم تضمينه في مستند PS |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | يضبط القيمة التي تحدد مستوى الضغط للصورة. |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | حدد تنسيق حفظ الملف الناتج |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | تحديد حجم الصفحة أو الصورة. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | يحدد العلامة التي تشير إلى ما إذا كان سيتم قمع الأخطاء أثناء التحويل. |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


إنشاء نسخة جديدة من الفئة PdfSaveOptions بالقيم الافتراضية للعلامات suppressErrors (true) و debug (false).

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


إنشاء نسخة جديدة من الفئة PdfSaveOptions بالقيم الافتراضية للعلامة debug (false).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| supressErrors | منطقي | إذا كان صحيحًا، سيستمر التحويل على الرغم من الأخطاء غير الحرجة. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


يعيد مجلدات الخطوط الإضافية التي يجب على المحول العثور على الخطوط فيها للمستند المدخل. المجلد الافتراضي هو مجلد الخطوط القياسي حيث يجد نظام التشغيل الخطوط للاستخدامات الداخلية.

**Returns:**
java.lang.String[] - مصفوفة من مجلدات الخطوط.
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color - لون الخلفية
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


الحصول على العلامة التي تُظهر ما إذا كان من الضروري حفظ الخطوط غير TrueType إلى TTF.

**Returns:**
boolean - قيمة العلامة.
### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String - نوع الخط الذي سيتم تضمينه في مستند PS
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


إرجاع قائمة بالأخطاء غير الحرجة.

**Returns:**
java.util.List<java.lang.Exception> - قائمة الاستثناءات
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


يعيد القيمة التي تحدد مستوى الضغط للصورة. القيم المتاحة هي من 0 إلى 100. كلما كان الرقم المحدد أقل، زاد الضغط وبالتالي تكون جودة الصورة أقل. القيمة 0 تنتج صورة بأدنى جودة، بينما القيمة 100 تنتج أعلى جودة.

**Returns:**
int - القيمة التي تحدد مستوى الضغط للصورة.
### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets - هوامش الصفحة
### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension - حجم الصفحة
### getSaveFormat() {#getSaveFormat--}
```
public PsSaveFormat getSaveFormat()
```




**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat) - save format of resulting file
### getSize() {#getSize--}
```
public Dimension getSize()
```


الحصول على حجم الصفحة أو الصورة.

**Returns:**
java.awt.Dimension - حجم الصفحة أو الصورة.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


الحصول على العلامة التي تسمح بإخراج التحذيرات والرسائل أثناء التحويل.

**Returns:**
boolean - قيمة التصحيح.
### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


يشير إلى ما إذا كان يجب تضمين الخطوط المستخدمة في مستند PS

**Returns:**
boolean - قيمة علم embedFonts
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


إرجاع قيمة تشير إلى ما إذا كانت الأخطاء ستُقمع أثناء التحويل.

**Returns:**
منطقي - قيمة منطقية
### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean - يشير إلى ما إذا كانت الخلفية شفافة
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


يحدد مجلدات الخطوط الإضافية التي يجب على المحول العثور على الخطوط فيها للمستند المدخل. المجلد الافتراضي هو مجلد الخطوط القياسي حيث يجد نظام التشغيل الخطوط للاستخدامات الداخلية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | مصفوفة من مجلدات الخطوط. |

### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| backgroundColor | java.awt.Color | يحدد لون الخلفية |

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


يحدد ما إذا كان سيتم حفظ الخطوط غير TrueType إلى TTF. يقلل ذلك بشكل كبير من حجم المستند الناتج في تحويل PS إلى PDF ويزيد من سرعة تحويل ملفات PS التي تحتوي على كمية كبيرة من النص بخطوط غير TrueType إلى أي تنسيق إخراج. ومع ذلك، هناك إزاحة رأسية صغيرة للنص عند تحويل ملف PostSctipt إلى صورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | منطقي | قيمة العلامة. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


تحديد العلامة التي تسمح بإخراج التحذيرات والرسائل أثناء التحويل.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| debug | منطقي | قيمة منطقية. |

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


يحدد ما إذا كان يجب تضمين الخطوط المستخدمة في مستند PS

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| embedFonts | منطقي | علم embedFonts |

### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


حدد نوع الخط الذي سيتم تضمينه في مستند PS

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| embedFontsAs | java.lang.String | نوع الخط |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


يضبط القيمة التي تحدد مستوى الضغط للصورة. القيم المتاحة هي من 0 إلى 100. كلما كان الرقم المحدد أقل، زاد الضغط وبالتالي تكون جودة الصورة أقل. القيمة 0 تنتج صورة بأدنى جودة، بينما القيمة 100 تنتج أعلى جودة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | int | القيمة التي تحدد مستوى الضغط للصورة. |

### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| margins | java.awt.Insets | يحدد هوامش الصفحة |

### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| pageSize | java.awt.Dimension | يحدد حجم الصفحة |

### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


حدد تنسيق حفظ الملف الناتج

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | تنسيق الملف الناتج |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


تحديد حجم الصفحة أو الصورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الحجم | java.awt.Dimension | حجم الصفحة أو الصورة. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


يحدد العلامة التي تشير إلى ما إذا كان سيتم قمع الأخطاء أثناء التحويل.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| supressErrors | منطقي | قيمة منطقية. |

### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| شفاف | منطقي | يحدد ما إذا كان الخلفية شفافة |

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

