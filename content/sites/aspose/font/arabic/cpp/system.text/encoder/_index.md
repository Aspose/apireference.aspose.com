---
title: "System::Text::Encoder class"
linktitle: "Encoder"
second_title: "Aspose.Font لـ C++"
description: "System::Text::Encoder class. يَغلف تسلسل الأحرف المشفر إلى تسلسل بايتات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.text/encoder/
---
## Encoder class


يَغلف تسلسل الأحرف المشفر إلى تسلسل بايتات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Encoder : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | يحوّل الأحرف إلى بايتات. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | يحوّل الأحرف إلى بايتات. |
| [get_Fallback](./get_fallback/)() const | يحصل على الفشل الاحتياطي لمعالجة الأخطاء. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | يحصل على مخزن الفشل الاحتياطي. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | يحصل على عدد البايتات المطلوبة لترميز مخزن مؤقت. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | يحصل على عدد البايتات المطلوبة لترميز مخزن مؤقت. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | احصل على البايتات الناتجة عن ترميز مخزن مؤقت. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | احصل على البايتات الناتجة عن ترميز مخزن مؤقت. |
| virtual [Reset](./reset/)() | ينظف الحالة الداخلية للمشفّر. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | يضبط الفشل الاحتياطي لمعالجة الأخطاء. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
