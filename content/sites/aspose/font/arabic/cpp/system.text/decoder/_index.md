---
title: "فئة System::Text::Decoder class"
linktitle: "Decoder"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Text::Decoder. يضمّ فك ترميز تسلسل البايتات إلى تسلسل الأحرف. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.text/decoder/
---
## Decoder class


يضمّ فك ترميز تسلسل البايتات إلى تسلسل الأحرف. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
class Decoder : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | يحوّل البايتات إلى أحرف. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | يحوّل البايتات إلى أحرف. |
| [get_Fallback](./get_fallback/)() const | يحصل على الفشل الاحتياطي لمعالجة الأخطاء. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | يحصل على مخزن الفشل الاحتياطي. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | يحصل على عدد الأحرف المطلوبة لفك ترميز مخزن مؤقت. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | يحصل على عدد الأحرف المطلوبة لفك ترميز مخزن مؤقت. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | يحصل على عدد الأحرف المطلوبة لفك ترميز مخزن مؤقت. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | احصل على الأحرف الناتجة عن فك ترميز مخزن مؤقت. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | احصل على الأحرف الناتجة عن فك ترميز مخزن مؤقت. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | احصل على الأحرف الناتجة عن فك ترميز مخزن مؤقت. |
| virtual [Reset](./reset/)() | ينظف الحالة الداخلية للمُفكك. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | يضبط الفشل الاحتياطي لمعالجة الأخطاء. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
