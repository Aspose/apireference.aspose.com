---
title: "XpsConverterToImageOptions"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "يمثل خيارات محول XPS إلى صورة للإضافة."
type: docs
weight: 12
url: /ar/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

يمثل خيارات محول XPS إلى صورة لإضافة [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) plugin.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | ينشئ مثيلاً جديداً لكائن [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions). |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | ينشئ مثيلاً جديداً لكائن [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) مع تنسيق الصورة. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | ينشئ مثيلاً جديداً لكائن [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) بحجم الصورة الناتجة. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | ينشئ مثيلاً جديداً لكائن [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) مع تنسيق الصورة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | يضيف مصدر بيانات جديد إلى مجموعة بيانات إضافة XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | يضيف مصدر بيانات جديد إلى مجموعة بيانات إضافة XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | يعيد مجموعة بيانات إضافة XpsConverterOptions. |
| [getImageFormat()](#getImageFormat--) | يحصل على تنسيق الصورة. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | يعيد القيمة التي تحدد مستوى الضغط لصورة. |
| [getOperationName()](#getOperationName--) | يعيد اسم العملية. |
| [getPageNumbers()](#getPageNumbers--) | يحصل على مصفوفة أعداد الصفحات في مستند XPS للتحويل. |
| [getResolution()](#getResolution--) | يحصل على دقة الصورة. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | يحصل على مجموعة الأهداف المضافة لحفظ نتائج العملية. |
| [getSize()](#getSize--) | يحصل على حجم الصورة الناتجة. |
| [getSmoothingMode()](#getSmoothingMode--) | يحصل على وضع التنعيم لتصوير الصورة. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | يحصل على تنسيق الصورة. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | يضبط القيمة التي تحدد مستوى الضغط للصورة. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | يضبط مصفوفة أرقام الصفحات في مستند XPS للتحويل. |
| [setResolution(int resolution)](#setResolution-int-) | يضبط دقة الصورة. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | يضبط حجم الصورة الناتجة. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | يضبط وضع التنعيم لتصوير الصورة. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


ينشئ مثيلاً جديداً لكائن [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions).

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


ينشئ مثيلاً جديداً لكائن [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) مع تنسيق الصورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | تنسيق الصورة الناتجة. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


ينشئ مثيلاً جديداً لكائن [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) بحجم الصورة الناتجة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| الحجم | java.awt.Dimension | حجم الصورة الناتجة. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


ينشئ مثيلاً جديداً لكائن [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) مع تنسيق الصورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | تنسيق الصورة الناتجة. |
| الحجم | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


يضيف مصدر بيانات جديد إلى مجموعة بيانات إضافة XpsConverter.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | مصدر البيانات للإضافة. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


يضيف مصدر بيانات جديد إلى مجموعة بيانات إضافة XpsConverterOptions.

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


يعيد مجموعة بيانات إضافة XpsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


يحصل على مصفوفة أعداد الصفحات في مستند XPS للتحويل.

**Returns:**
int[] - مصفوفة أرقام الصفحات في مستند XPS.
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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - A smoothing mode.
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

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


يضبط مصفوفة أرقام الصفحات في مستند XPS للتحويل. إذا لم يتم الضبط، سيتم تحويل جميع الصفحات.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| pageNumbers | int[] | مصفوفة من أعداد الصفحات في مستند XPS. |

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

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


يضبط وضع التنعيم لتصوير الصورة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | وضع التنعيم. |

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

