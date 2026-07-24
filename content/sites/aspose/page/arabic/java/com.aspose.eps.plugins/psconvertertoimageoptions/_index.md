---
title: "PsConverterToImageOptions"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يمثل خيارات محول PS/EPS إلى صورة للإضافة."
type: docs
weight: 12
url: /ar/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

يمثل خيارات محول PS/EPS إلى صورة للإضافة [PsConverter](../../com.aspose.eps.plugins/psconverter).
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | يُنشئ مثيلاً جديدًا لكائن [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions). |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | يُنشئ مثيلاً جديدًا لكائن [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) مع تنسيق الصورة. |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | يُنشئ مثيلاً جديدًا لكائن [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) بحجم الصورة الناتجة. |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | يُنشئ مثيلاً جديدًا لكائن [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) مع تنسيق الصورة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | يضيف مصدر بيانات جديد إلى مجموعة بيانات إضافة PsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | يضيف مصدر بيانات جديد إلى مجموعة بيانات إضافة PsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | إرجاع مجلدات خطوط إضافية حيث يجب على المحول العثور على الخطوط للمستند المدخل. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | يعيد مجموعة بيانات إضافة PsConverterOptions. |
| [getExceptions()](#getExceptions--) | إرجاع قائمة بالأخطاء غير الحرجة. |
| [getImageFormat()](#getImageFormat--) | يحصل على تنسيق الصورة. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | يعيد القيمة التي تحدد مستوى الضغط لصورة. |
| [getOperationName()](#getOperationName--) | يعيد اسم العملية. |
| [getResolution()](#getResolution--) | يحصل على دقة الصورة. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | يحصل على مجموعة الأهداف المضافة لحفظ نتائج العملية. |
| [getSize()](#getSize--) | يحصل على حجم الصورة الناتجة. |
| [getSmoothingMode()](#getSmoothingMode--) | يحصل على وضع التنعيم لتصوير الصورة. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | الحصول على العلامة التي تسمح بإخراج التحذيرات والرسائل أثناء التحويل. |
| [isSupressErrors()](#isSupressErrors--) | إرجاع قيمة تشير إلى ما إذا كانت الأخطاء ستُقمع أثناء التحويل. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | تحديد مجلدات خطوط إضافية حيث يجب على المحول العثور على الخطوط للمستند المدخل. |
| [setDebug(boolean debug)](#setDebug-boolean-) | تحديد العلامة التي تسمح بإخراج التحذيرات والرسائل أثناء التحويل. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | يحصل على تنسيق الصورة. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | يضبط القيمة التي تحدد مستوى الضغط للصورة. |
| [setResolution(int resolution)](#setResolution-int-) | يضبط دقة الصورة. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | يضبط حجم الصورة الناتجة. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | يضبط وضع التنعيم لتصوير الصورة. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | يحدد العلامة التي تشير إلى ما إذا كان سيتم قمع الأخطاء أثناء التحويل. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


يُنشئ مثيلاً جديدًا لكائن [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions).

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


يُنشئ مثيلاً جديدًا لكائن [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) مع تنسيق الصورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | تنسيق الصورة الناتجة. |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


يُنشئ مثيلاً جديدًا لكائن [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) بحجم الصورة الناتجة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الحجم | java.awt.Dimension | حجم الصورة الناتجة. |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


يُنشئ مثيلاً جديدًا لكائن [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) مع تنسيق الصورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | تنسيق الصورة الناتجة. |
| الحجم | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


يضيف مصدر بيانات جديد إلى مجموعة بيانات إضافة PsConverter.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | مصدر البيانات للإضافة. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


يضيف مصدر بيانات جديد إلى مجموعة بيانات إضافة PsConverterOptions.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | مصدر البيانات (ملف أو تدفق) لحفظ نتائج العملية. |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


يعيد مجموعة بيانات إضافة PsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


إرجاع قائمة بالأخطاء غير الحرجة.

**Returns:**
java.util.List<java.lang.Exception> - قائمة الاستثناءات
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


يحصل على تنسيق الصورة.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


يعيد القيمة التي تحدد مستوى الضغط للصورة. القيم المتاحة هي من 0 إلى 100. كلما كان الرقم المحدد أقل، زاد الضغط وبالتالي تكون جودة الصورة أقل. القيمة 0 تنتج صورة بأدنى جودة، بينما القيمة 100 تنتج أعلى جودة.

**Returns:**
int - القيمة التي تحدد مستوى الضغط للصورة.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


يعيد اسم العملية.

**Returns:**
java.lang.String
### getResolution() {#getResolution--}
```
public int getResolution()
```


يحصل على دقة الصورة.

**Returns:**
int - دقة الصورة.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


يحصل على مجموعة الأهداف المضافة لحفظ نتائج العملية.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


يحصل على حجم الصورة الناتجة.

**Returns:**
java.awt.Dimension - حجم الصورة.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


يحصل على وضع التنعيم لتصوير الصورة.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - A smoothing mode.
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
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


إرجاع قيمة تشير إلى ما إذا كانت الأخطاء ستُقمع أثناء التحويل.

**Returns:**
منطقي - قيمة منطقية
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

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


تحديد العلامة التي تسمح بإخراج التحذيرات والرسائل أثناء التحويل.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| debug | منطقي | قيمة منطقية. |

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


يحصل على تنسيق الصورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | تنسيق الصورة الناتجة. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


يضبط القيمة التي تحدد مستوى الضغط للصورة. القيم المتاحة هي من 0 إلى 100. كلما كان الرقم المحدد أقل، زاد الضغط وبالتالي تكون جودة الصورة أقل. القيمة 0 تنتج صورة بأدنى جودة، بينما القيمة 100 تنتج أعلى جودة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | int | القيمة التي تحدد مستوى الضغط للصورة. |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


يضبط دقة الصورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الدقة | int | دقة الصورة الناتجة. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


يضبط حجم الصورة الناتجة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الحجم | java.awt.Dimension | حجم الصورة الناتجة. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


يضبط وضع التنعيم لتصوير الصورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | وضع التنعيم. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


يحدد العلامة التي تشير إلى ما إذا كان سيتم قمع الأخطاء أثناء التحويل.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| supressErrors | منطقي | قيمة منطقية. |

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

