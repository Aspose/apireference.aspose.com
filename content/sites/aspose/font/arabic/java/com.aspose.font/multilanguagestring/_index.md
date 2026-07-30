---
title: "MultiLanguageString"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل سلسلة متعددة اللغات."
type: docs
weight: 66
url: /ar/java/com.aspose.font/multilanguagestring/
---
**Inheritance:**
java.lang.Object
```
public class MultiLanguageString
```

يمثل سلسلة متعددة اللغات.
## المنشئات

| منشئ | الوصف |
| --- | --- |
| [MultiLanguageString()](#MultiLanguageString--) | ينشئ سلسلة متعددة اللغات فارغة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [addLanguageString(String str, int languageId)](#addLanguageString-java.lang.String-int-) | يضيف سلسلة بلغة محددة |
| [containsString(String str)](#containsString-java.lang.String-) | يرجع true إذا كانت السلسلة موجودة داخل جميع سلاسل اللغات. |
| [equals(Object objToCompare)](#equals-java.lang.Object-) | يرجع true إذا تم اعتبار الكائنات متساوية. |
| [getAllLanguageIds()](#getAllLanguageIds--) | يحصل على معرفات اللغة لجميع السلاسل أو مصفوفة فارغة إذا لم تكن هناك سلاسل. |
| [getAllStrings()](#getAllStrings--) | يرجع جميع السلاسل لجميع اللغات. |
| [getClass()](#getClass--) |  |
| [getEnglishString()](#getEnglishString--) | يرجع السلسلة الإنجليزية إذا وجدت. |
| [getStringForLanguageId(int languageId)](#getStringForLanguageId-int-) | يرجع السلسلة المتعلقة بمعرف اللغة الممرَّر، إذا وجدت. |
| [hashCode()](#hashCode--) | تنفيذ GetHashCode. |
| [isEmpty()](#isEmpty--) | True، إذا لم يكن لدى MultiLanguageString سلاسل للغات. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(MultiLanguageString obj1, String obj2)](#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-) | تنفيذ عامل المساواة. |
| [op_Equality(String obj1, MultiLanguageString obj2)](#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-) | تنفيذ عامل المساواة. |
| [op_Inequality(MultiLanguageString obj1, String obj2)](#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-) | تنفيذ عامل عدم المساواة. |
| [op_Inequality(String obj1, MultiLanguageString obj2)](#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-) | تنفيذ عامل عدم المساواة. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MultiLanguageString() {#MultiLanguageString--}
```
public MultiLanguageString()
```


ينشئ سلسلة متعددة اللغات فارغة.

### addLanguageString(String str, int languageId) {#addLanguageString-java.lang.String-int-}
```
public void addLanguageString(String str, int languageId)
```


يضيف سلسلة بلغة محددة

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| str | java.lang.String | السلسلة للإضافة |
| languageId | int | معرف اللغة |

### containsString(String str) {#containsString-java.lang.String-}
```
public boolean containsString(String str)
```


يرجع true إذا كانت السلسلة موجودة داخل جميع سلاسل اللغات.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| str | java.lang.String | السلسلة للتحقق. |

**Returns:**
منطقي - True إذا كانت السلسلة موجودة داخل جميع سلاسل اللغة.
### equals(Object objToCompare) {#equals-java.lang.Object-}
```
public boolean equals(Object objToCompare)
```


يرجع true إذا تم اعتبار الكائنات متساوية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| objToCompare | java.lang.Object | الكائن للمقارنة معه |

**Returns:**
منطقي - نتيجة المقارنة
### getAllLanguageIds() {#getAllLanguageIds--}
```
public int[] getAllLanguageIds()
```


يحصل على معرفات اللغة لجميع السلاسل أو مصفوفة فارغة إذا لم تكن هناك سلاسل.

**Returns:**
int[] - مصفوفة تحتوي على معرفات اللغة أو مصفوفة فارغة إذا لم تكن هناك سلاسل موجودة.
### getAllStrings() {#getAllStrings--}
```
public String[] getAllStrings()
```


يرجع جميع السلاسل لجميع اللغات.

**Returns:**
java.lang.String[] - مصفوفة جميع السلاسل لجميع اللغات.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEnglishString() {#getEnglishString--}
```
public String getEnglishString()
```


يرجع السلسلة الإنجليزية إذا وجدت. وإلا يرجع أول سلسلة غير إنجليزية.

**Returns:**
java.lang.String - سلسلة إنجليزية إذا وجدت، وإلا أول سلسلة غير إنجليزية.
### getStringForLanguageId(int languageId) {#getStringForLanguageId-int-}
```
public String getStringForLanguageId(int languageId)
```


يرجع السلسلة المتعلقة بمعرف اللغة الممرَّر، إذا وجدت. سلسلة فارغة وإلا.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| languageId | int | معرف اللغة. |

**Returns:**
java.lang.String - سلسلة مرتبطة بمعرف اللغة الممرَّر، إذا وجدت. سلسلة فارغة وإلا.
### hashCode() {#hashCode--}
```
public int hashCode()
```


تنفيذ GetHashCode.

**Returns:**
int - رمز التجزئة للكائن
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```


True، إذا لم يكن لدى MultiLanguageString سلاسل للغات.

**Returns:**
منطقي - صحيح إذا كان MultiLanguageString لا يحتوي على سلاسل للغات.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(MultiLanguageString obj1, String obj2) {#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Equality(MultiLanguageString obj1, String obj2)
```


تنفيذ عامل المساواة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | الكائن الأول للمقارنة |
| obj2 | java.lang.String | الكائن الثاني للمقارنة |

**Returns:**
منطقي - نتيجة المقارنة
### op_Equality(String obj1, MultiLanguageString obj2) {#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Equality(String obj1, MultiLanguageString obj2)
```


تنفيذ عامل المساواة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| obj1 | java.lang.String | السلسلة للمقارنة |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | سلسلة متعددة اللغات للمقارنة |

**Returns:**
منطقي - نتيجة المقارنة
### op_Inequality(MultiLanguageString obj1, String obj2) {#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Inequality(MultiLanguageString obj1, String obj2)
```


تنفيذ عامل عدم المساواة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | السلسلة للمقارنة |
| obj2 | java.lang.String | سلسلة متعددة اللغات للمقارنة |

**Returns:**
منطقي - نتيجة المقارنة
### op_Inequality(String obj1, MultiLanguageString obj2) {#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Inequality(String obj1, MultiLanguageString obj2)
```


تنفيذ عامل عدم المساواة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| obj1 | java.lang.String | السلسلة للمقارنة |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | سلسلة متعددة اللغات للمقارنة |

**Returns:**
منطقي - نتيجة المقارنة
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

