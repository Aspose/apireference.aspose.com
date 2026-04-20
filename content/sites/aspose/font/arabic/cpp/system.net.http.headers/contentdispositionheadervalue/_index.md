---
title: "System::Net::Http::Headers::ContentDispositionHeaderValue فئة"
linktitle: "ContentDispositionHeaderValue"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::Headers::ContentDispositionHeaderValue فئة. تمثّل قيمة رأس ''Content-Disposition''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً في وقت التشغيل أو أعطالًا في التحقق. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


تمثّل قيمة رأس 'Content-Disposition'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً في وقت التشغيل أو أعطالًا في التحقق. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | ينشئ نسخة جديدة. |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | ينشئ نسخة جديدة. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| [get_CreationDate](./get_creationdate/)() | يحصل على تاريخ إنشاء الملف. |
| [get_DispositionType](./get_dispositiontype/)() | معلومات RTTI. |
| [get_FileName](./get_filename/)() | يحصل على قيمة تحدد كيفية إنشاء اسم ملف لتخزين حمولة الرسالة. يُستخدم ذلك عندما يكون الكيان منفصلًا ويتم تخزينه في ملف منفصل. |
| [get_FileNameStar](./get_filenamestar/)() | يحصل على قيمة تحدد كيفية إنشاء أسماء الملفات لتخزين حمولة الرسالة. يُستخدم عندما تكون الكيانات منفصلة وتُخزن في ملفات منفصلة. |
| [get_ModificationDate](./get_modificationdate/)() | يحصل على تاريخ تعديل الملف. |
| [get_Name](./get_name/)() | يحصل على اسم لجزء من محتوى الجسم. |
| [get_Parameters](./get_parameters/)() | يرجع مجموعة المعلمات لرأس 'Content-Disposition'. |
| [get_ReadDate](./get_readdate/)() | يحصل على التاريخ الذي تم فيه قراءة الملف آخر مرة. |
| [get_Size](./get_size/)() | يحصل على حجم تقريبي للملف. |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | يحوّل سلسلة مُمرَّرة من الفهرس المحدد إلى نسخة من الفئة [ContentDispositionHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [Parse](./parse/)(String) | يحوّل سلسلة مُمرَّرة إلى نسخة من الفئة [ContentDispositionHeaderValue](./). |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | يضبط تاريخ إنشاء الملف. |
| [set_DispositionType](./set_dispositiontype/)(String) | يضبط نوع التوزيع. |
| [set_FileName](./set_filename/)(String) | يضبط قيمة تحدد كيفية إنشاء اسم ملف لتخزين حمولة الرسالة. يُستخدم عندما تكون الكيان منفصلًا ومخزنًا في ملف منفصل. |
| [set_FileNameStar](./set_filenamestar/)(String) | يضبط قيمة تحدد كيفية إنشاء أسماء الملفات لتخزين حمولة الرسالة. يُستخدم عندما تكون الكيانات منفصلة ومخزنة في ملفات منفصلة. |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | يضبط تاريخ تعديل الملف. |
| [set_Name](./set_name/)(String) | يضبط اسمًا لجزء من محتوى الجسم. |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | يضبط التاريخ الذي قرأ فيه الملف آخر مرة. |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | يضبط حجمًا تقريبيًا للملف. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | يحاول تحويل سلسلة مُمرَّرة إلى نسخة من الفئة [ContentDispositionHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
