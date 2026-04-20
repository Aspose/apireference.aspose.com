---
title: "فئة System::Text::ICUEncoder class"
linktitle: "ICUEncoder"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Text::ICUEncoder. المشفر الذي يستخدم ICU للترميز. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 2100
url: /ar/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | يحوّل الأحرف إلى بايتات. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | يحوّل الأحرف إلى بايتات. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | يحصل على عدد البايتات المطلوبة لترميز مخزن مؤقت. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | يحصل على عدد البايتات المطلوبة لترميز مخزن مؤقت. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | احصل على البايتات الناتجة عن ترميز مخزن مؤقت. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | احصل على البايتات الناتجة عن ترميز مخزن مؤقت. |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | المُنشئ. |
| virtual [Reset](./reset/)() | يضبط المتغيرات الداخلية إلى الحالة الأولية. |
| [~ICUEncoder](./~icuencoder/)() | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Base](./base/) | نوع [Base](./base/). |
## انظر أيضًا

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
