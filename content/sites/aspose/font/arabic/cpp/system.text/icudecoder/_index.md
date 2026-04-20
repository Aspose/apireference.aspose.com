---
title: "System::Text::ICUDecoder class"
linktitle: "ICUDecoder"
second_title: "Aspose.Font لـ C++"
description: "System::Text::ICUDecoder class. مُفكّك يستخدم ICU في عملية فك الترميز. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2000
url: /ar/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | يحوّل البايتات إلى أحرف. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | يحوّل البايتات إلى أحرف. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | يحصل على عدد الأحرف المطلوبة لفك ترميز مخزن مؤقت. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | يحصل على عدد الأحرف المطلوبة لفك ترميز مخزن مؤقت. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | يحصل على عدد الأحرف المطلوبة لفك ترميز مخزن مؤقت. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | احصل على الأحرف الناتجة عن فك ترميز مخزن مؤقت. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | احصل على الأحرف الناتجة عن فك ترميز مخزن مؤقت. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | احصل على الأحرف الناتجة عن فك ترميز مخزن مؤقت. |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | المُنشئ. |
| virtual [Reset](./reset/)() | يضبط المتغيرات الداخلية إلى الحالة الأولية. |
| virtual [~ICUDecoder](./~icudecoder/)() | المدمر. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Base](./base/) | نوع [Base](./base/). |
## انظر أيضًا

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
