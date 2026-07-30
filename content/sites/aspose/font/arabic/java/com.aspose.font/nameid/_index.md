---
title: "NameId"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل تعداد NameId."
type: docs
weight: 67
url: /ar/java/com.aspose.font/nameid/
---
**Inheritance:**
java.lang.Object
```
public final class NameId
```

يمثل تعداد NameId.
## الحقول

| حقل | الوصف |
| --- | --- |
| [CompatibleFull](#CompatibleFull) | 18 متوافق كامل (Macintosh فقط)؛ على Macintosh، يتم إنشاء اسم القائمة باستخدام مورد Font. |
| [CopyrightNotice](#CopyrightNotice) | 0 إشعار حقوق النشر. |
| [DarkBackground](#DarkBackground) | هذا المعرف، إذا استُخدم في مصفوفة تسميات لوحة الألوان (Palette Labels Array) لجدول CPAL، يحدد أن لوحة الألوان المقابلة في جدول CPAL مناسبة للاستخدام مع الخط عند عرضه على خلفية داكنة مثل الأسود. |
| [Description](#Description) | 10 الوصف؛ وصف الخط. |
| [DesignerName](#DesignerName) | 9 المصمم؛ اسم المصمم للخط. |
| [FontFamily](#FontFamily) | 1 عائلة الخط. |
| [FontSubfamily](#FontSubfamily) | 2 الفئة الفرعية للخط. |
| [FullName](#FullName) | 4 الاسم الكامل للخط. |
| [LicenseDescription](#LicenseDescription) | 13 وصف الترخيص؛ وصف لكيفية الاستخدام القانوني للخط، أو سيناريوهات مثال مختلفة للاستخدام المرخص. |
| [LicenseInfoUrl](#LicenseInfoUrl) | 14 عنوان URL لمعلومات الترخيص، حيث يمكن العثور على معلومات ترخيص إضافية. |
| [LightBackground](#LightBackground) | هذا المعرف، إذا استُخدم في CPAL table\\u2019s Palette Labels Array، يحدد أن لوحة الألوان المقابلة في جدول CPAL مناسبة للاستخدام مع الخط عند عرضه على خلفية فاتحة مثل الأبيض. |
| [ManufacturerName](#ManufacturerName) | 8 اسم الشركة المصنعة. |
| [PostScriptCID](#PostScriptCID) | وجوده في الخط يعني أن nameID 6 يحتوي على اسم خط PostScript يُقصد استخدامه مع استدعاء \\u201ccomposefont\\u201d لتشغيل الخط في مفسر PostScript. |
| [PostScriptName](#PostScriptName) | 6 اسم PostScript للخط. |
| [PreferredFamily](#PreferredFamily) | 15 محجوز 16 العائلة المفضلة (Windows فقط)؛ في Windows، يُعرض اسم العائلة في قائمة الخط؛ يُقدم اسم الفئة الفرعية كاسم النمط. |
| [PreferredSubfamily](#PreferredSubfamily) | 17 الفئة الفرعية المفضلة (Windows فقط)؛ في Windows، يُعرض اسم العائلة في قائمة الخط؛ يُقدم اسم الفئة الفرعية كاسم النمط. |
| [SampleText](#SampleText) | 19 نص عينة. |
| [TrademarkNotice](#TrademarkNotice) | 7 إشعار العلامة التجارية. |
| [UniqueFontId](#UniqueFontId) | 3 مواصفة Apple: تعريف فريد للفئة الفرعية. 3 مواصفة MS: معرف فريد للخط. |
| [UrlDesigner](#UrlDesigner) | 12 عنوان URL لمصمم الخط (مع البروتوكول، مثل http://، ftp://) |
| [UrlVendor](#UrlVendor) | 11 عنوان URL لبائع الخط (مع البروتوكول، مثل http://، ftp://). |
| [VariationsPostScriptNamePrefix](#VariationsPostScriptNamePrefix) | إذا كان موجودًا في خط متغير، قد يُستخدم كبادئة للعائلة في خوارزمية توليد اسم PostScript للخطوط المتغيرة. |
| [Version](#Version) | 5 نسخة جدول الأسماء. |
| [WwsFamilyName](#WwsFamilyName) | يُستخدم لتوفير اسم عائلة متوافق مع WWS في حال عدم توافق الإدخالات للمعرفين 16 و17 مع نموذج WWS. |
| [WwsSubfamilyName](#WwsSubfamilyName) | يُستخدم بالاشتراك مع المعرف 21، هذا المعرف يوفر اسم فئة فرعية متوافق مع WWS (يعكس فقط خصائص الوزن والعرض والانحدار) في حال عدم توافق الإدخالات للمعرفين 16 و17 مع نموذج WWS. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromId(int id)](#fromId-int-) | ينشئ معرف اسم من قيمة عددية. |
| [getClass()](#getClass--) |  |
| [getId()](#getId--) | احصل على القيمة الصحيحة. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompatibleFull {#CompatibleFull}
```
public static final NameId CompatibleFull
```


18 الاسم الكامل المتوافق (Macintosh فقط)؛ على Macintosh، يُنشأ اسم القائمة باستخدام مورد الخط. عادةً ما يتطابق هذا مع الاسم الكامل. إذا رغبت في ظهور اسم الخط بشكل مختلف عن الاسم الكامل، يمكنك إدراج الاسم الكامل المتوافق في المعرف 18. هذا الاسم لا يستخدمه نظام Mac OS نفسه، لكنه قد يُستخدم من قبل مطوري التطبيقات (مثل Adobe).

### CopyrightNotice {#CopyrightNotice}
```
public static final NameId CopyrightNotice
```


0 إشعار حقوق النشر.

### DarkBackground {#DarkBackground}
```
public static final NameId DarkBackground
```


هذا المعرف، إذا استُخدم في مصفوفة تسميات لوحة الألوان (Palette Labels Array) لجدول CPAL، يحدد أن لوحة الألوان المقابلة في جدول CPAL مناسبة للاستخدام مع الخط عند عرضه على خلفية داكنة مثل الأسود.

### Description {#Description}
```
public static final NameId Description
```


10 الوصف؛ وصف للخط. يمكن أن يحتوي على معلومات مراجعة، توصيات الاستخدام، التاريخ، الميزات، وما إلى ذلك.

### DesignerName {#DesignerName}
```
public static final NameId DesignerName
```


9 المصمم؛ اسم المصمم للخط.

### FontFamily {#FontFamily}
```
public static final NameId FontFamily
```


1 عائلة الخط. هذه السلسلة هي اسم عائلة الخط الذي يراه المستخدم على منصات Macintosh.

### FontSubfamily {#FontSubfamily}
```
public static final NameId FontSubfamily
```


2 Font Subfamily. هذه السلسلة هي عائلة الخط التي يراها المستخدم على منصات ماك.

### FullName {#FullName}
```
public static final NameId FullName
```


4 الاسم الكامل للخط.

### LicenseDescription {#LicenseDescription}
```
public static final NameId LicenseDescription
```


13 License description; وصف لكيفية استخدام الخط قانونيًا، أو سيناريوهات مثال مختلفة للاستخدام المرخص. يجب كتابة هذا الحقل بلغة بسيطة، لا بلغة قانونية.

### LicenseInfoUrl {#LicenseInfoUrl}
```
public static final NameId LicenseInfoUrl
```


14 عنوان URL لمعلومات الترخيص، حيث يمكن العثور على معلومات ترخيص إضافية.

### LightBackground {#LightBackground}
```
public static final NameId LightBackground
```


هذا المعرف، إذا استُخدم في CPAL table\\u2019s Palette Labels Array، يحدد أن لوحة الألوان المقابلة في جدول CPAL مناسبة للاستخدام مع الخط عند عرضه على خلفية فاتحة مثل الأبيض.

### ManufacturerName {#ManufacturerName}
```
public static final NameId ManufacturerName
```


8 اسم الشركة المصنعة.

### PostScriptCID {#PostScriptCID}
```
public static final NameId PostScriptCID
```


وجوده في الخط يعني أن nameID 6 يحتوي على اسم خط PostScript يُقصد استخدامه مع استدعاء \\u201ccomposefont\\u201d لتشغيل الخط في مفسر PostScript.

### PostScriptName {#PostScriptName}
```
public static final NameId PostScriptName
```


6 PostScript name of the Font. ملاحظة: قد يحتوي الخط على اسم PostScript واحد فقط ويجب أن يكون هذا الاسم ASCII.

### PreferredFamily {#PreferredFamily}
```
public static final NameId PreferredFamily
```


15 Reserved 16 Preferred Family (Windows only); في نظام Windows، يتم عرض اسم العائلة في قائمة الخط؛ ويتم تقديم اسم الفئة الفرعية كاسم النمط. لأسباب تاريخية، احتوت عائلات الخطوط على حد أقصى من أربعة أنماط، لكن مصممي الخطوط قد يجمعون أكثر من أربعة خطوط في عائلة واحدة. تسمح معرفات Preferred Family و Preferred Subfamily للمصممين بتضمين تجميعات العائلة/الفئة الفرعية المفضلة. تكون هذه المعرفات موجودة فقط إذا كانت مختلفة عن المعرفين 1 و 2.

### PreferredSubfamily {#PreferredSubfamily}
```
public static final NameId PreferredSubfamily
```


17 Preferred Subfamily (Windows only); في نظام Windows، يتم عرض اسم العائلة في قائمة الخط؛ ويتم تقديم اسم الفئة الفرعية كاسم النمط. لأسباب تاريخية، احتوت عائلات الخطوط على حد أقصى من أربعة أنماط، لكن مصممي الخطوط قد يجمعون أكثر من أربعة خطوط في عائلة واحدة. تسمح معرفات Preferred Family و Preferred Subfamily للمصممين بتضمين تجميعات العائلة/الفئة الفرعية المفضلة. تكون هذه المعرفات موجودة فقط إذا كانت مختلفة عن المعرفين 1 و 2.

### SampleText {#SampleText}
```
public static final NameId SampleText
```


19 Sample text. يمكن أن يكون هذا اسم الخط، أو أي نص آخر يعتقد المصمم أنه أفضل نص عينة لعرض مظهر الخط.

### TrademarkNotice {#TrademarkNotice}
```
public static final NameId TrademarkNotice
```


7 إشعار العلامة التجارية.

### UniqueFontId {#UniqueFontId}
```
public static final NameId UniqueFontId
```


3 مواصفة Apple: تعريف فريد للفئة الفرعية. 3 مواصفة MS: معرف فريد للخط.

### UrlDesigner {#UrlDesigner}
```
public static final NameId UrlDesigner
```


12 عنوان URL لمصمم الخط (مع البروتوكول، مثل http://، ftp://)

### UrlVendor {#UrlVendor}
```
public static final NameId UrlVendor
```


11 URL of the Font vendor (with procotol, e.g., http://, ftp://). إذا تم تضمين رقم تسلسلي فريد في عنوان URL، يمكن استخدامه لتسجيل الخط.

### VariationsPostScriptNamePrefix {#VariationsPostScriptNamePrefix}
```
public static final NameId VariationsPostScriptNamePrefix
```


إذا كان موجودًا في خط متغير، قد يُستخدم كبادئة للعائلة في خوارزمية توليد اسم PostScript للخطوط المتغيرة.

### Version {#Version}
```
public static final NameId Version
```


5 نسخة جدول الأسماء.

### WwsFamilyName {#WwsFamilyName}
```
public static final NameId WwsFamilyName
```


يُستخدم لتوفير اسم عائلة متوافق مع WWS في حال عدم توافق الإدخالات للمعرفين 16 و17 مع نموذج WWS.

### WwsSubfamilyName {#WwsSubfamilyName}
```
public static final NameId WwsSubfamilyName
```


يُستخدم بالاشتراك مع المعرف 21، هذا المعرف يوفر اسم فئة فرعية متوافق مع WWS (يعكس فقط خصائص الوزن والعرض والانحدار) في حال عدم توافق الإدخالات للمعرفين 16 و17 مع نموذج WWS.

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
### fromId(int id) {#fromId-int-}
```
public static NameId fromId(int id)
```


ينشئ معرف اسم من قيمة عددية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| معرف | int | قيمة عددية صحيحة. |

**Returns:**
[NameId](../../com.aspose.font/nameid) - The name id.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getId() {#getId--}
```
public int getId()
```


احصل على القيمة الصحيحة.

**Returns:**
int - القيمة الصحيحة.
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

