---
title: "فئة System::Net::Http::Headers::EntityTagHeaderValue"
linktitle: "EntityTagHeaderValue"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Net::Http::Headers::EntityTagHeaderValue. تمثل قيمة رأس ''Entity-Tag''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً في وقت التشغيل أو أعطالًا في التحقق. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


تمثل قيمة رأس 'Entity-Tag'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً في وقت التشغيل أو أعطالًا في التحقق. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | ينشئ نسخة جديدة. |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | ينشئ نسخة جديدة. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| static [get_Any](./get_any/)() | يحصل على قيمة رأس 'ETag'. |
| [get_IsWeak](./get_isweak/)() | يحصل على قيمة تشير إلى ما إذا كان الكائن الحالي مدققًا ضعيفًا. |
| [get_Tag](./get_tag/)() | معلومات RTTI. |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | يحوّل السلسلة المُمرَّرة من الفهرس المحدد إلى كائن من فئة [EntityTagHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [Parse](./parse/)(String) | يحوّل السلسلة المُمرَّرة إلى كائن من فئة [EntityTagHeaderValue](./). |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | يحاول تحويل السلسلة المُمرَّرة إلى كائن من فئة [EntityTagHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
