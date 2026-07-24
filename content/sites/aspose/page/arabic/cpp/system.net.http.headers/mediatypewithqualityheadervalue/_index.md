---
title: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue فئة"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue فئة. تمثّل نوع MIME مع عامل جودة إضافي في قيمة رأس ''Content-Type''. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1300
url: /ar/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


تمثّل نوع MIME مع عامل جودة إضافي في قيمة رأس 'Content-Type'. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class MediaTypeWithQualityHeaderValue : public System::Net::Http::Headers::MediaTypeHeaderValue
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Quality](./get_quality/)() | معلومات RTTI. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)() | ينشئ نسخة جديدة. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String) | ينشئ نسخة جديدة. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String, double) | ينشئ نسخة جديدة. |
| static [Parse](./parse/)(String) | يحوّل السلسلة الممرّرة إلى نسخة من الفئة [MediaTypeWithQualityHeaderValue](./). |
| [set_Quality](./set_quality/)(Nullable\<double\>) | يضبط قيمة الجودة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | يحاول تحويل السلسلة الممرّرة إلى نسخة من الفئة [MediaTypeWithQualityHeaderValue](./). |
## انظر أيضًا

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
