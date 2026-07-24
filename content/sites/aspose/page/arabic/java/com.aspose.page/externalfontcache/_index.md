---
title: "ExternalFontCache"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "استخدم هذه الفئة للحصول على تغليف الخط في شكل يتم قبوله بواسطة Device."
type: docs
weight: 13
url: /ar/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

استخدم هذه الفئة للحصول على تغليف الخط في شكل يتم قبوله بواسطة Device.
## المُنشئات

| المُنشئ | الوصف |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## الحقول

| حقل | الوصف |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | حجم الخط الافتراضي. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | نمط الخط الافتراضي. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | يجلب DrFont حسب اسم عائلة الخط، الحجم الافتراضي (1) والنمط الافتراضي (PLAIN). |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | يجلب DrFont حسب اسم عائلة الخط، الحجم الافتراضي (1) والنمط. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | يجلب DrFont حسب اسم عائلة الخط، الحجم والنمط. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | يجلب DrFont حسب اسم عائلة الخط، الحجم، النمط وحروف الخط الكبيرة. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | يجلب DrFont حسب اسم عائلة الخط، الحجم، النمط واسم عائلة الخط البديلة. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | يجلب DrFont حسب اسم عائلة الخط، الحجم، النمط، حروف الخط الكبيرة واسم عائلة الخط البديلة. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | يجلب TTFont حسب اسم عائلة الخط، النمط واسم عائلة الخط البديلة. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | يحدد مجلدات الخطوط الإضافية. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ExternalFontCache() {#ExternalFontCache--}
```
public ExternalFontCache()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final float DEFAULT_SIZE
```


حجم الخط الافتراضي.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


نمط الخط الافتراضي.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


يجلب DrFont حسب اسم عائلة الخط، الحجم الافتراضي (1) والنمط الافتراضي (PLAIN).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| familyName | java.lang.String | اسم عائلة الخط. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


يجلب DrFont حسب اسم عائلة الخط، الحجم الافتراضي (1) والنمط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| familyName | java.lang.String | اسم عائلة الخط. |
| نمط | int | نمط الخط. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
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
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


يجلب DrFont حسب اسم عائلة الخط، الحجم والنمط.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| familyName | java.lang.String | اسم عائلة الخط. |
| sizePoints | float | حجم الخط بالنقاط (نقطة واحدة هي 1/72 من البوصة). |
| نمط | int | نمط الخط. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


يجلب DrFont حسب اسم عائلة الخط، الحجم، النمط وحروف الخط الكبيرة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| familyName | java.lang.String | اسم عائلة الخط. |
| sizePoints | float | حجم الخط بالنقاط (نقطة واحدة هي 1/72 من البوصة). |
| نمط | int | نمط الخط. |
| fontCapitals | int | حروف الخط الكبيرة. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


يجلب DrFont حسب اسم عائلة الخط، الحجم، النمط واسم عائلة الخط البديلة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| familyName | java.lang.String | اسم عائلة الخط. |
| sizePoints | float | حجم الخط بالنقاط (نقطة واحدة هي 1/72 من البوصة). |
| نمط | int | نمط الخط. |
| altFamilyName | java.lang.String | اسم عائلة الخط البديلة. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


يجلب DrFont حسب اسم عائلة الخط، الحجم، النمط، حروف الخط الكبيرة واسم عائلة الخط البديلة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| familyName | java.lang.String | اسم عائلة الخط. |
| sizePoints | float | حجم الخط بالنقاط (نقطة واحدة هي 1/72 من البوصة). |
| نمط | int | نمط الخط. |
| altFamilyName | java.lang.String | اسم عائلة الخط البديلة. |
| fontCapitals | int | حروف الخط الكبيرة. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


يجلب TTFont حسب اسم عائلة الخط، النمط واسم عائلة الخط البديلة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| familyName | java.lang.String | اسم عائلة الخط. |
| نمط | int | نمط الخط. |
| altFamilyName | java.lang.String | اسم عائلة الخط البديلة. |

**Returns:**
com.aspose.foundation.truetype.TTFont - TTFont.
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




### setAdditionalFontsFolders(String[] additionalFontFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public static void setAdditionalFontsFolders(String[] additionalFontFolders)
```


يحدد مجلدات الخطوط الإضافية. مجلدات الخطوط التي يستخدمها نظام التشغيل تُستخدم بواسطة ذاكرة التخزين المؤقت للخطوط الخارجية افتراضيًا. لا توجد حاجة لتعريفها،

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | مصفوفة من مجلدات الخطوط الإضافية. |

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

