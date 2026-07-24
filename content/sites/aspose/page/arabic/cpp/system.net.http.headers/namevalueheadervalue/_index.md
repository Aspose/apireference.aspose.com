---
title: "الفئة System::Net::Http::Headers::NameValueHeaderValue"
linktitle: "NameValueHeaderValue"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Net::Http::Headers::NameValueHeaderValue. تمثّل زوج مفتاح/قيمة للاستخدام في الرؤوس. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغّل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1400
url: /ar/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


تمثّل زوج مفتاح/قيمة للاستخدام في الرؤوس. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغّل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | يبحث عن نسخة الفئة NameValueHeaderValue-class في مجموعة حسب الاسم المحدد. |
| [get_Name](./get_name/)() | يرجع اسم النسخة الحالية. |
| [get_Value](./get_value/)() | يحصل على قيمة النسخة الحالية. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | يعيد رمز تجزئة لجميع عناصر المجموعة. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | يحوّل سلسلة مُمرَّرة من الفهرس المحدد إلى نسخة من الفئة [NameValueHeaderValue](./). |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | يحوّل سلسلة مُمرَّرة من الفهرس المحدد إلى نسخة من الفئة [NameValueHeaderValue](./). |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | يحوّل سلسلة مُمرَّرة من الفهرس المحدد إلى مجموعة من مثيلات NameValueHeaderValue-class ويعيد طول الجزء الفرعي المُحلَّل. |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | يعيد طول القيمة من الفهرس المحدد. |
| [NameValueHeaderValue](./namevalueheadervalue/)() | ينشئ نسخة جديدة. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | ينشئ نسخة جديدة. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | ينشئ نسخة جديدة. |
| static [Parse](./parse/)(String) | يحوّل سلسلة مُمرَّرة إلى نسخة من الفئة [NameValueHeaderValue](./). |
| [set_Value](./set_value/)(String) | يضبط قيمة النسخة الحالية. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | يعيد تمثيلًا نصيًا لمجموعة مثيلات NameValueHeaderValue-class. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | يعيد تمثيلًا نصيًا لمجموعة مثيلات NameValueHeaderValue-class. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | يحاول تحويل سلسلة مُمرَّرة إلى نسخة من الفئة [NameValueHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
