---
title: TtfNameTable
second_title: Aspose.Font لمرجع .NET API
description: يمثل جدول الاسم لملف خط TTF.
type: docs
weight: 900
url: /ar/net/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class

يمثل جدول "الاسم" لملف خط TTF.

```csharp
public class TtfNameTable : TtfTableBase
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset) { get; } | يحصل على تعويض من بداية sfnt . |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables) { get; } | مرجع إلى مستودع جدول TTF . |
| static [Tag](../../aspose.font.ttftables/ttfnametable/tag) { get; } | يحصل على علامة الجدول . |

## طُرق

| اسم | وصف |
| --- | --- |
| [AddMultiLanguageNames](../../aspose.font.ttftables/ttfnametable/addmultilanguagenames)(MultiLanguageString, PlatformId, ushort, NameId) | استخراج كافة السلاسل متعددة اللغات من تمرير*mlNames* الكائن و ينشئ بنية NameRecord متوافقة لكل سلسلة مستخرجة باستخدام معلمات التي تم تمريرها*platformId* و*platformSpecificId* و*nameId* . قيمة الحقل languageID مستخرجة من*mlNames* هدف. يتم إضافة سجل جديد تم إنشاؤه للتو إلى الجدول. إذا تم العثور على السجل الذي يتزامن مع الحقل الذي تم إنشاؤه للتو بواسطة معرف النظام الأساسي ، معرّف النظام الأساسي ، معرّف الاسم ، واللغة ID ، فلن تتم إضافة سجل جديد تم إنشاؤه وسيتم تحديث بيانات السلسلة فقط للسجل الحالي. |
| [AddName](../../aspose.font.ttftables/ttfnametable/addname)(NameId, PlatformId, int, int, string) | إضافة مُدخل إلى الجدول. تم تحديد فئة بيانات السلسلة المراد إضافتها بواسطة*name* المعلمة . |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords)(PlatformId, ushort) | حذف كافة السجلات المتعلقة بالمنصة المحددة |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_1)(PlatformId, ushort, NameId) | حذف كافة السجلات المتعلقة بالمعلمات التي تم تمريرها |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_2)(PlatformId, ushort, NameId, ushort) | حذف السجلات المتعلقة بالمعلمات المحددة |
| [DeleteRecordsByNameId](../../aspose.font.ttftables/ttfnametable/deleterecordsbynameid)(NameId) | حذف كافة السجلات المتعلقة بالاسم الذي تم تمريره معرف المعلمة |
| [GetAllNameRecords](../../aspose.font.ttftables/ttfnametable/getallnamerecords)() | إرجاع الكل[`NameRecord`](../ttfnametable.namerecord) هياكل من table |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid)(NameId) | إرجاع اسم بالاسم ID. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_1)(NameId, PlatformId) | إرجاع الاسم بالاسم معرف النظام الأساسي الذي تم تمريره. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_2)(NameId, PlatformId, ushort) | إرجاع اسم ككائن من النوع[`MultiLanguageString`](../../aspose.font/multilanguagestring) . تجمع الطريقة جميع هياكل NameRecord التي تتطابق مع مع المعلمات التي تم تمريرها nameId و platformId و platformSpecificId ثم تقوم بإنشاء كائن ناتج بناءً على قائمة الهياكل هذه. |
| [GetNameById](../../aspose.font.ttftables/ttfnametable/getnamebyid)(NameId) | تُرجع اسمًا بالاسم معرّفًا إذا وجد ، فارغًا وإلا |
| [GetNameRecordsByNameId](../../aspose.font.ttftables/ttfnametable/getnamerecordsbynameid)(NameId) | إرجاع الكل[`NameRecord`](../ttfnametable.namerecord) الهياكل التي يساوي حقل NameId تمريرها*nameId* القيمة. إذا لم يتم العثور على سجلات ، فسيتم إرجاع مصفوفة فارغة. |
| [UpdateName](../../aspose.font.ttftables/ttfnametable/updatename)(PlatformId, ushort, NameId, ushort, string) | تحديث الاسم في السجل (السجلات) الذي يتعلق بالمنصة المحددة (مجموعة من platformId و platformSpecificId) ، وفئة (nameId) واللغة (languageId). |
| [UpdateNamesByNameId](../../aspose.font.ttftables/ttfnametable/updatenamesbynameid)(NameId, string) | تحديد كافة السجلات ذات الصلة بفئة السلسلة المنطقية ، المحددة بواسطة معرف اسم المعلمة و تحديث حقل الاسم (بيانات السلسلة) في هذه السجلات. لا تتأثر الحقول المتعلقة بالمنصة (معرّف النظام الأساسي ومعرّف الترميز الخاص بالنظام الأساسي) واللغة (معرّف اللغة) بهذه الطريقة. يتم استبدال بيانات سلسلة الاسم فقط باسم جديد. استخدم هذه الطريقة بحذر ، لأنها ستحل محل الأسماء الأصلية لجميع الأنظمة الأساسية واللغات ، المرتبطة بـ nameId. يمكن أن تتعارض مع الحالات التي يكون فيها للأسماء الأصلية قيم مختلفة ، لأن عملية الاستبدال تغير كل هذه القيم بواحدة جديدة ، وقد يكون لهذه القيمة الجديدة تناقض منطقي مع بعض الأنظمة الأساسية واللغات. هذه الطريقة مفيدة للحالات التي يكون فيها الاسم الأصلي له تمثيل فردي لجميع الأنظمة الأساسية واللغات ، على سبيل المثال ، عندما تكون بيانات سلسلة الاسم باللغة الإنجليزية. |

## أعضاء آخرون

| اسم | وصف |
| --- | --- |
| enum [MacLanguageId](ttfnametable.maclanguageid) | تعداد معرف لغة النظام الأساسي لنظام التشغيل Macintosh . |
| enum [MacPlatformSpecificId](ttfnametable.macplatformspecificid) | يمثل تعداد منصة ماكنتوش PlatformSpecificId . |
| enum [MSLanguageId](ttfnametable.mslanguageid) | تعداد معرف لغة النظام الأساسي لـ Microsoft . |
| enum [MSPlatformSpecificId](ttfnametable.msplatformspecificid) | يمثل تعداد منصة Microsoft PlatformSpecificId. |
| enum [NameId](ttfnametable.nameid) | يمثل NameId. |
| class [NameRecord](ttfnametable.namerecord) | يمثل بنية سجل الاسم لجدول "الاسم " |
| enum [PlatformId](ttfnametable.platformid) | يمثل تعداد PlatformId . |
| enum [UnicodePlatformSpecificId](ttfnametable.unicodeplatformspecificid) | يمثل تعدادًا خاصًا بمنصة يونيكود. |

### أنظر أيضا

* class [TtfTableBase](../ttftablebase)
* مساحة الاسم [Aspose.Font.TtfTables](../../aspose.font.ttftables)
* المجسم [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
