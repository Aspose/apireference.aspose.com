---
title: "فئة System::Text::Encoder"
linktitle: "Encoder"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Text::Encoder. تغلف تسلسل الأحرف المشفرة إلى تسلسل بايتات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.text/encoder/
---
## Encoder class


تغلف تسلسل الأحرف المشفرة إلى تسلسل بايتات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Encoder : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | يحوّل الأحرف إلى بايتات. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | يحوّل الأحرف إلى بايتات. |
| [get_Fallback](./get_fallback/)() const | يحصل على التحويل الاحتياطي لمعالجة الأخطاء. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | يحصل على مخزن التحويل الاحتياطي. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | يحصل على عدد البايتات المطلوبة لترميز المخزن المؤقت. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | يحصل على عدد البايتات المطلوبة لترميز المخزن المؤقت. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | احصل على البايتات الناتجة عن ترميز المخزن المؤقت. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | احصل على البايتات الناتجة عن ترميز المخزن المؤقت. |
| virtual [Reset](./reset/)() | ينظف الحالة الداخلية للمشفّر. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | يضبط التحويل الاحتياطي لمعالجة الأخطاء. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
