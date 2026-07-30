---
title: "TtfNameTable"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل جدول الأسماء لملف الخط TTF."
type: docs
weight: 105
url: /ar/java/com.aspose.font/ttfnametable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfNameTable extends TtfTableBase
```

يمثل جدول "name" لملف خط TTF.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)](#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | يستخرج جميع السلاسل متعددة اللغات من كائن  mlNames  الممرّر وينشئ بنية NameRecord المقابلة لكل سلسلة مستخرجة باستخدام المعلمات الممررة  platformId ,  platformSpecificId  و  nameId . |
| [addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)](#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-) | يضيف إدخالًا إلى الجدول. |
| [deleteRecords(PlatformId platformId, int platformSpecificId)](#deleteRecords-com.aspose.font.PlatformId-int-) | يحذف جميع السجلات المتعلقة بالمنصة المحددة |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | يحذف جميع السجلات المتعلقة بالمعلمات الممررة |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-) | يحذف السجل/السجلات المتعلقة بالمعلمات المحددة |
| [deleteRecordsByNameId(NameId nameId)](#deleteRecordsByNameId-com.aspose.font.NameId-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllNameRecords()](#getAllNameRecords--) | يرجع جميع هياكل  NameRecord  من الجدول. |
| [getClass()](#getClass--) |  |
| [getMultiLanguageNameById(NameId nameId)](#getMultiLanguageNameById-com.aspose.font.NameId-) | يرجع اسمًا حسب nameId |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-) | يرجع اسمًا حسب nameId باستخدام معرف المنصة الممرّر. |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-) | يرجع اسمًا ككائن من النوع  MultiLanguageString . |
| [getNameById(NameId nameId)](#getNameById-com.aspose.font.NameId-) | يرجع اسمًا حسب nameId إذا وجد، وإلا null. |
| [getNameRecordsByNameId(NameId nameId)](#getNameRecordsByNameId-com.aspose.font.NameId-) | يرجع جميع هياكل  NameRecord  التي يكون حقل NameId فيها مساويًا للقيمة الممررة  nameId . |
| [getOffset()](#getOffset--) | يحصل على الإزاحة من بداية sfnt. |
| [getTag()](#getTag--) | يحصل على علامة الجدول. |
| [getTtfTables()](#getTtfTables--) | مرجع إلى مستودع جدول TTF. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)](#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-) | يقوم بتحديث الاسم في السجل/السجلات المتعلقة بالمنصة المحددة (مجموعة platformId و platformSpecificId)، الفئة (nameId) واللغة (languageId). |
| [updateNamesByNameId(NameId nameId, String newName)](#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-) | يختار جميع السجلات المتعلقة بفئة السلسلة المنطقية، المحددة بواسطة المعامل nameId، ويُحدّث حقل الاسم (بيانات السلسلة) في هذه السجلات. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId) {#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)
```


يستخرج جميع السلاسل متعددة اللغات من كائن  mlNames  الممرّر وينشئ بنية NameRecord المقابلة لكل سلسلة مستخرجة باستخدام المعلمات الممررة  platformId ,  platformSpecificId  و  nameId . يتم استخراج قيمة الحقل languageID من كائن  mlNames . يتم إضافة السجل الذي تم إنشاؤه حديثًا إلى الجدول. إذا تم العثور على سجل يتطابق مع السجل الذي تم إنشاؤه حديثًا بواسطة الحقول platformID و platformSpecificID و nameID و languageId ، فلن يتم إضافة السجل الجديد وسيتم تحديث بيانات السلسلة فقط للسجل الموجود.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| mlNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | سلسلة متعددة اللغات |
| platformId | [PlatformId](../../com.aspose.font/platformid) | معرف المنصة |
| platformSpecificId | int | معرف الترميز الخاص بالمنصة |
| nameId | [NameId](../../com.aspose.font/nameid) | معرف الاسم، فئة السلسلة المنطقية، المحددة بواسطة تعداد  NameId . |

### addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name) {#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-}
```
public void addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)
```


يضيف إدخالًا إلى الجدول. فئة بيانات السلسلة التي سيتم إضافتها محددة بواسطة معامل الاسم.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | معرف الاسم، فئة السلسلة المنطقية، محدد بواسطة تعداد [NameId](../../com.aspose.font/nameid). |
| platformId | [PlatformId](../../com.aspose.font/platformid) | معرف النظام الأساسي. |
| platformSpecificId | int | معرف الترميز الخاص بالنظام الأساسي. يرجى استخدام قيمة من أحد هذه التعدادات - UnicodePlatformSpecificId ، MacPlatformSpecificId ، MSPlatformSpecificId. يتم تحديد أي تعداد يُستخدم بناءً على السياق (معامل platformId). |
| languageId | int | معرف اللغة. يرجى استخدام قيمة من تعداد MSLanguageId أو MacLanguageId حسب السياق، المحدد بواسطة معامل platformId. |
| الاسم | java.lang.String | بيانات السلسلة الفعلية. |

### deleteRecords(PlatformId platformId, int platformSpecificId) {#deleteRecords-com.aspose.font.PlatformId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId)
```


يحذف جميع السجلات المتعلقة بالمنصة المحددة

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | معرف المنصة |
| platformSpecificId | int | معرف الترميز الخاص بالمنصة |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)
```


يحذف جميع السجلات المتعلقة بالمعلمات الممررة

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | معرف المنصة |
| platformSpecificId | int | معرف الترميز الخاص بالمنصة |
| nameId | [NameId](../../com.aspose.font/nameid) | معرف الاسم، فئة السلسلة المنطقية، المحددة بواسطة تعداد  NameId . |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)
```


يحذف السجل/السجلات المتعلقة بالمعلمات المحددة

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | معرف المنصة |
| platformSpecificId | int | معرف الترميز الخاص بالمنصة |
| nameId | [NameId](../../com.aspose.font/nameid) | معرف الاسم، فئة السلسلة المنطقية، المحددة بواسطة تعداد  NameId . |
| languageId | int | معرف اللغة |

### deleteRecordsByNameId(NameId nameId) {#deleteRecordsByNameId-com.aspose.font.NameId-}
```
public void deleteRecordsByNameId(NameId nameId)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) |  |

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
### getAllNameRecords() {#getAllNameRecords--}
```
public NameRecord[] getAllNameRecords()
```


يرجع جميع هياكل  NameRecord  من الجدول.

**Returns:**
com.aspose.font.NameRecord[] - جميع هياكل NameRecord من الجدول.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMultiLanguageNameById(NameId nameId) {#getMultiLanguageNameById-com.aspose.font.NameId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId)
```


يرجع اسمًا حسب nameId

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | معرف الاسم. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - name
### getMultiLanguageNameById(NameId nameId, PlatformId platformId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId)
```


يرجع اسمًا حسب nameId باستخدام معرف المنصة الممرّر.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | معرف الاسم. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | معرف المنصة. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)
```


يعيد اسمًا ككائن من النوع MultiLanguageString. تجمع الطريقة جميع هياكل NameRecord التي تتطابق مع المعاملات nameId و platformId و platformSpecificId الممررة، ثم تُنشئ الكائن الناتج بناءً على قائمة هذه الهياكل.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | معرف الاسم. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | معرف المنصة. |
| platformSpecificId | int | معرف خاص بالنظام الأساسي. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getNameById(NameId nameId) {#getNameById-com.aspose.font.NameId-}
```
public String getNameById(NameId nameId)
```


يرجع اسمًا حسب nameId إذا وجد، وإلا null.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | معرف الاسم |

**Returns:**
java.lang.String - الاسم
### getNameRecordsByNameId(NameId nameId) {#getNameRecordsByNameId-com.aspose.font.NameId-}
```
public NameRecord[] getNameRecordsByNameId(NameId nameId)
```


يعيد جميع هياكل NameRecord التي يكون حقل NameId فيها مساويًا للقيمة nameId الممررة. إذا لم تُعثر على سجلات، سيتم إرجاع مصفوفة فارغة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | معرف الاسم |

**Returns:**
com.aspose.font.NameRecord[] - مصفوفة من هياكل NameRecord
### getOffset() {#getOffset--}
```
public long getOffset()
```


يحصل على الإزاحة من بداية sfnt.

**Returns:**
long - إزاحة من بداية sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


يحصل على علامة الجدول.

**Returns:**
java.lang.String - علامة الجدول.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


مرجع إلى مستودع جدول TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
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




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName) {#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-}
```
public void updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)
```


يقوم بتحديث الاسم في السجل/السجلات المتعلقة بالمنصة المحددة (مجموعة platformId و platformSpecificId)، الفئة (nameId) واللغة (languageId).

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | معرف المنصة |
| platformSpecificId | int | معرف الترميز الخاص بالمنصة |
| nameId | [NameId](../../com.aspose.font/nameid) | معرف الاسم، فئة السلسلة المنطقية، المحددة بواسطة تعداد  NameId . |
| languageId | int | معرف اللغة |
| newName | java.lang.String | اسم جديد أو بيانات سلسلة جديدة |

### updateNamesByNameId(NameId nameId, String newName) {#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-}
```
public void updateNamesByNameId(NameId nameId, String newName)
```


يختار جميع السجلات المرتبطة بفئة السلسلة المنطقية، المحددة بواسطة المعامل nameId، ويحدّث حقل الاسم (بيانات السلسلة) في هذه السجلات. الحقول المتعلقة بالنظام الأساسي (platformID، Platform-specific encoding ID) واللغة (Language ID) لا تتأثر بهذه الطريقة. يتم استبدال بيانات السلسلة الخاصة بالاسم فقط باسم جديد. استخدم هذه الطريقة بحذر، لأنها ستحل محل الأسماء الأصلية لجميع الأنظمة الأساسية واللغات المرتبطة بـ nameId. قد يسبب ذلك تعارضات في الحالات التي كان فيها للأسماء الأصلية قيم مختلفة، حيث إن عملية الاستبدال تغير جميع هذه القيم إلى قيمة واحدة جديدة. وقد يكون لهذه القيمة الجديدة عدم توافق منطقي مع بعض الأنظمة الأساسية واللغات. هذه الطريقة مفيدة في الحالات التي يكون فيها الاسم الأصلي له تمثيل واحد لجميع الأنظمة الأساسية واللغات، على سبيل المثال عندما تكون بيانات اسم السلسلة باللغة الإنجليزية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | معرف الاسم، فئة السلسلة المنطقية، المحددة بواسطة تعداد  NameId . |
| newName | java.lang.String | اسم جديد أو بيانات سلسلة جديدة |

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

