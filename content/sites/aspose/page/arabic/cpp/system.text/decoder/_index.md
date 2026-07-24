---
title: "فئة System::Text::Decoder"
linktitle: "Decoder"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Text::Decoder. تغلف عملية فك ترميز تسلسل البايتات إلى تسلسل الأحرف. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.text/decoder/
---
## Decoder class


تغلف عملية فك ترميز تسلسل البايتات إلى تسلسل الأحرف. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل المؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Decoder : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | يحول البايتات إلى أحرف. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | يحول البايتات إلى أحرف. |
| [get_Fallback](./get_fallback/)() const | يحصل على التحويل الاحتياطي لمعالجة الأخطاء. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | يحصل على مخزن التحويل الاحتياطي. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | يحصل على عدد الأحرف المطلوبة لفك ترميز المخزن المؤقت. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | يحصل على عدد الأحرف المطلوبة لفك ترميز المخزن المؤقت. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | يحصل على عدد الأحرف المطلوبة لفك ترميز المخزن المؤقت. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | احصل على الأحرف الناتجة عن فك ترميز المخزن المؤقت. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | احصل على الأحرف الناتجة عن فك ترميز المخزن المؤقت. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | احصل على الأحرف الناتجة عن فك ترميز المخزن المؤقت. |
| virtual [Reset](./reset/)() | ينظف الحالة الداخلية للمفكك. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | يضبط التحويل الاحتياطي لمعالجة الأخطاء. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
