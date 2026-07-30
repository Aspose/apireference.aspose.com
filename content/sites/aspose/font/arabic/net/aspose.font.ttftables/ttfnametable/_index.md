---
title: "الفئة TtfNameTable"
second_title: "مرجع API لـ Aspose.Font لـ .NET"
description: "الفئة Aspose.Font.TtfTables.TtfNameTable. تمثل جدول الأسماء لملف الخط TTF."
type: docs
weight: 1180
url: /ar/net/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class

يمثل جدول "name" لملف خط TTF.

```csharp
public class TtfNameTable : TtfTableBase
```

## الخصائص

| الاسم | الوصف |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset/) { get; } | يحصل على الإزاحة من بداية sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables/) { get; } | إشارة إلى مستودع جدول TTF. |
| static [Tag](../../aspose.font.ttftables/ttfnametable/tag/) { get; } | يحصل على علامة الجدول. |

## الطرق

| الاسم | الوصف |
| --- | --- |
| [AddMultiLanguageNames](../../aspose.font.ttftables/ttfnametable/addmultilanguagenames/)(MultiLanguageString, PlatformId, ushort, NameId) | يستخرج جميع السلاسل متعددة اللغات من كائن *mlNames* المُمرَّر ويُنشئ بنية NameRecord المقابلة لكل سلسلة مستخرجة باستخدام المعلمات المُمرَّرة *platformId* و *platformSpecificId* و *nameId*. تُستخرج قيمة الحقل languageID من كائن *mlNames*. يُضاف السجل الجديد الذي تم إنشاؤه للتو إلى الجدول. إذا تم العثور على سجل يتطابق مع السجل الذي تم إنشاؤه للتو بحسب الحقول platformID و platformSpecificID و nameID و languageId، فلن يُضاف السجل الجديد وسيتم تحديث بيانات السلسلة فقط للسجل الموجود. |
| [AddName](../../aspose.font.ttftables/ttfnametable/addname/)(NameId, PlatformId, int, int, string) | يضيف مدخلاً إلى الجدول. فئة بيانات السلسلة التي ستُضاف تُحدد بواسطة المعامل *name*. |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords/#deleterecords)(PlatformId, ushort) | يحذف جميع السجلات المتعلقة بالمنصة المحددة. |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords/#deleterecords_1)(PlatformId, ushort, NameId) | يحذف جميع السجلات المتعلقة بالمعلمات المُمرَّرة. |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords/#deleterecords_2)(PlatformId, ushort, NameId, ushort) | يحذف السجل (السجلات) المتعلقة بالمعلمات المحددة. |
| [DeleteRecordsByNameId](../../aspose.font.ttftables/ttfnametable/deleterecordsbynameid/)(NameId) | يحذف جميع السجلات المتعلقة بمعامل nameId المُمرَّر. |
| [GetAllNameRecords](../../aspose.font.ttftables/ttfnametable/getallnamerecords/)() | يرجع جميع هياكل [`NameRecord`](../ttfnametable.namerecord/) من الجدول. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/#getmultilanguagenamebyid)(NameId) | يرجع اسمًا حسب nameId. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/#getmultilanguagenamebyid_1)(NameId, PlatformId) | يرجع اسمًا حسب nameId باستخدام معرف المنصة المُمرَّر. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid/#getmultilanguagenamebyid_2)(NameId, PlatformId, ushort) | يرجع اسمًا ككائن من النوع [`MultiLanguageString`](../../aspose.font/multilanguagestring/). تجمع الطريقة جميع هياكل NameRecord التي تتطابق مع المعلمات المُمرَّرة nameId و platformId و platformSpecificId ثم تُنشئ الكائن الناتج بناءً على قائمة هذه الهياكل. |
| [GetNameById](../../aspose.font.ttftables/ttfnametable/getnamebyid/)(NameId) | يرجع اسمًا حسب nameId إذا وجد، وإلا يُرجع null. |
| [GetNameRecordsByNameId](../../aspose.font.ttftables/ttfnametable/getnamerecordsbynameid/)(NameId) | يرجع جميع هياكل [`NameRecord`](../ttfnametable.namerecord/) التي يكون حقل NameId فيها مساويًا للقيمة *nameId* المُمرَّرة. إذا لم تُعثر على سجلات، سيتم إرجاع مصفوفة فارغة. |
| [UpdateName](../../aspose.font.ttftables/ttfnametable/updatename/)(PlatformId, ushort, NameId, ushort, string) | يُحدّث الاسم في السجل (السجلات) المتعلقة بالمنصة المحددة (مزيج من platformId و platformSpecificId)، الفئة (nameId) واللغة (languageId). |
| [UpdateNamesByNameId](../../aspose.font.ttftables/ttfnametable/updatenamesbynameid/)(NameId, string) | يختار جميع السجلات المتعلقة بفئة السلسلة المنطقية، المحددة بواسطة المعامل nameId، ويُحدّث حقل الاسم (بيانات السلسلة) في هذه السجلات. الحقول المتعلقة بالمنصة (platformID، Platform-specific encoding ID) واللغة (Language ID) لا تتأثر بهذه الطريقة. يتم استبدال بيانات السلسلة الاسمية فقط باسم جديد. استخدم هذه الطريقة بحذر، لأنها ستحلّ محل الأسماء الأصلية لجميع المنصات واللغات المرتبطة بـ nameId. قد يسبب ذلك تعارضات في الحالات التي كانت فيها الأسماء الأصلية ذات قيم مختلفة، لأن عملية الاستبدال تغير جميع هذه القيم إلى قيمة واحدة جديدة. وقد يكون لهذه القيمة الجديدة عدم توافق منطقي مع بعض المنصات واللغات. تُفيد هذه الطريقة في الحالات التي يكون فيها الاسم الأصلي تمثيلًا واحدًا لجميع المنصات واللغات، على سبيل المثال عندما تكون بيانات السلسلة الاسمية باللغة الإنجليزية. |

## الأعضاء الآخرون

| الاسم | الوصف |
| --- | --- |
| enum [MacLanguageId](../../aspose.font.ttftables/ttfnametable.maclanguageid) | تعداد معرف لغة منصة ماك. |
| enum [MacPlatformSpecificId](../../aspose.font.ttftables/ttfnametable.macplatformspecificid) | يمثل تعداد PlatformSpecificId لمنصة ماك. |
| enum [MSLanguageId](../../aspose.font.ttftables/ttfnametable.mslanguageid) | تعداد معرف لغة منصة مايكروسوفت. |
| enum [MSPlatformSpecificId](../../aspose.font.ttftables/ttfnametable.msplatformspecificid) | يمثل تعداد Microsoft platform PlatformSpecificId. |
| enum [NameId](../../aspose.font.ttftables/ttfnametable.nameid) | يمثل NameId. |
| class [NameRecord](../../aspose.font.ttftables/ttfnametable.namerecord) | تمثّل بنية NameRecord لجدول 'name' |
| enum [PlatformId](../../aspose.font.ttftables/ttfnametable.platformid) | يمثل تعداد PlatformId. |
| enum [UnicodePlatformSpecificId](../../aspose.font.ttftables/ttfnametable.unicodeplatformspecificid) | يمثل تعدادًا خاصًا بمنصة Unicode. |

### انظر أيضاً

* class [TtfTableBase](../ttftablebase/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


