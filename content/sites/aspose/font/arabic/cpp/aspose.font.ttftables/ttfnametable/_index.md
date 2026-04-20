---
title: "Aspose::Font::TtfTables::TtfNameTable فئة"
linktitle: "TtfNameTable"
second_title: "Aspose.Font لـ C++"
description: "Aspose::Font::TtfTables::TtfNameTable فئة. تمثل جدول \"name\" لملف الخط TTF في C++."
type: docs
weight: 1300
url: /ar/cpp/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class


تمثل جدول "name" لملف [Font](../../aspose.font/font/) TTF.

```cpp
class TtfNameTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [NameRecord](./namerecord/)
## Enums

| تعداد | الوصف |
| --- | --- |
| [MacLanguageId](./maclanguageid/) | تعداد معرف لغة منصة ماك. |
| [MacPlatformSpecificId](./macplatformspecificid/) | تمثل تعداد PlatformSpecificId لمنصة ماك. |
| [MSLanguageId](./mslanguageid/) | تعداد معرف لغة منصة مايكروسوفت. |
| [MSPlatformSpecificId](./msplatformspecificid/) | تمثل تعداد PlatformSpecificId لمنصة مايكروسوفت. |
| [NameId](./nameid/) | تمثل [NameId](./nameid/). |
| [PlatformId](./platformid/) | تمثل تعداد [PlatformId](./platformid/). |
| [UnicodePlatformSpecificId](./unicodeplatformspecificid/) | تمثل تعداد منصة-محدد يونيكود. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [AddMultiLanguageNames](./addmultilanguagenames/)(System::SharedPtr\<MultiLanguageString\>, TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | يستخرج جميع السلاسل متعددة اللغات من الكائن *mlNames* الممرّر ويُنشئ بنية [NameRecord](./namerecord/) المقابلة لكل سلسلة مستخرجة باستخدام المعلمات الممرّرة *platformId* و *platformSpecificId* و *nameId*. يتم استخراج قيمة الحقل languageID من كائن *mlNames*. يُضاف السجل الجديد الذي تم إنشاؤه إلى الجدول. إذا تم العثور على سجل يتطابق مع السجل الذي تم إنشاؤه حديثًا بحسب الحقول platformID و platformSpecificID و nameID و languageId، فلن يُضاف السجل الجديد وسيتم تحديث بيانات السلسلة فقط للسجل الموجود. |
| [AddName](./addname/)(TtfNameTable::NameId, TtfNameTable::PlatformId, int32_t, int32_t, System::String) | يضيف مدخلاً إلى الجدول. فئة بيانات السلسلة التي ستُضاف محددة بواسطة المعامل *name*. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | يحذف جميع السجلات المتعلقة بالمعلمات الممرّرة. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t) | يحذف جميع السجلات المتعلقة بالمنصة المحددة. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t) | يحذف السجل(ات) المتعلقة بالمعلمات المحددة. |
| [DeleteRecordsByNameId](./deleterecordsbynameid/)(TtfNameTable::NameId) | يحذف جميع السجلات المتعلقة بمعامل nameId الممرّر. |
| static [get_Tag](./get_tag/)() | يحصل على علامة الجدول. |
| [GetAllNameRecords](./getallnamerecords/)() | يرجع جميع بنى [NameRecord](./namerecord/) من الجدول. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId) | يرجع اسمًا حسب nameId. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId) | يرجع اسمًا حسب nameId باستخدام معرف المنصة الممرّر. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId, uint16_t) | يرجع اسمًا ككائن من النوع [MultiLanguageString](../../aspose.font/multilanguagestring/). تجمع الطريقة جميع بنى [NameRecord](./namerecord/) التي تتطابق مع المعلمات الممرّرة nameId و platformId و platformSpecificId ثم تُنشئ الكائن الناتج بناءً على قائمة هذه البنى. |
| [GetNameById](./getnamebyid/)(TtfNameTable::NameId) | يرجع اسمًا حسب nameId إذا وجد، وإلا يُرجع null. |
| [GetNameRecordsByNameId](./getnamerecordsbynameid/)(TtfNameTable::NameId) | يرجع جميع بنى [NameRecord](./namerecord/) التي يكون حقل [NameId](./nameid/) فيها مساويًا للقيمة *nameId* الممرّرة. إذا لم تُعثر على سجلات، سيتم إرجاع مصفوفة فارغة. |
| [UpdateName](./updatename/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t, System::String) | يُحدّث الاسم في السجل(ات) المتعلقة بالمنصة المحددة (توليفة platformId و platformSpecificId)، الفئة (nameId) واللغة (languageId). |
| [UpdateNamesByNameId](./updatenamesbynameid/)(TtfNameTable::NameId, System::String) | يحدد جميع السجلات المتعلقة بفئة السلسلة المنطقية، المحددة بواسطة المعامل nameId، ويحدّث حقل الاسم (بيانات السلسلة) في هذه السجلات. الحقول المتعلقة بالمنصة (platformID، معرف الترميز الخاص بالمنصة) واللغة (معرف اللغة) لا تتأثر بهذه الطريقة. يتم استبدال بيانات اسم السلسلة فقط باسم جديد. استخدم هذه الطريقة بحذر، لأنها ستحل محل الأسماء الأصلية لجميع المنصات واللغات المرتبطة بـ nameId. قد يتسبب ذلك في حدوث تعارضات في الحالات التي كانت فيها الأسماء الأصلية ذات قيم مختلفة، لأن عملية الاستبدال تغير جميع هذه القيم إلى قيمة واحدة جديدة. وقد يكون لهذه القيمة الجديدة عدم اتساق منطقي مع بعض المنصات واللغات. هذه الطريقة مفيدة في الحالات التي يكون فيها الاسم الأصلي له تمثيل واحد لجميع المنصات واللغات، على سبيل المثال عندما تكون بيانات اسم السلسلة باللغة الإنجليزية. |
## انظر أيضًا

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
