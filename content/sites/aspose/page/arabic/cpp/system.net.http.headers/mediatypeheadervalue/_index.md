---
title: "الفئة System::Net::Http::Headers::MediaTypeHeaderValue"
linktitle: "MediaTypeHeaderValue"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Net::Http::Headers::MediaTypeHeaderValue. تمثل نوع MIME في قيمة رأس ''Content-Type''. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1200
url: /ar/cpp/system.net.http.headers/mediatypeheadervalue/
---
## MediaTypeHeaderValue class


تمثل نوع MIME في قيمة رأس 'Content-Type'. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class MediaTypeHeaderValue : public virtual System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| [get_CharSet](./get_charset/)() | معلومات RTTI. |
| [get_MediaType](./get_mediatype/)() | يحصل على قيمة رأس نوع الوسائط. |
| [get_Parameters](./get_parameters/)() | يرجع معلمات القيمة لرأس نوع الوسائط. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetMediaTypeLength](./getmediatypelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\>, System::SharedPtr\<MediaTypeHeaderValue\>\&) | يحوّل السلسلة المُمرَّرة من الفهرس المحدد إلى نسخة من الفئة [MediaTypeHeaderValue](./). |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)() | ينشئ نسخة جديدة. |
| [MediaTypeHeaderValue](./mediatypeheadervalue/)(String) | ينشئ نسخة جديدة. |
| static [Parse](./parse/)(String) | يحوّل السلسلة المُمرَّرة إلى نسخة من الفئة [MediaTypeHeaderValue](./). |
| [set_CharSet](./set_charset/)(String) | يضبط مجموعة الأحرف. |
| [set_MediaType](./set_mediatype/)(String) | يضبط قيمة رأس نوع الوسائط. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeHeaderValue\>\&) | يحاول تحويل السلسلة المُمرَّرة إلى نسخة من الفئة [MediaTypeHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
