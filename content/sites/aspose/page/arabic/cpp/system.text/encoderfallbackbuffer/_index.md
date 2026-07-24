---
title: "System::Text::EncoderFallbackBuffer فئة"
linktitle: "EncoderFallbackBuffer"
second_title: "Aspose.Page لـ C++"
description: "System::Text::EncoderFallbackBuffer فئة. يوفر مخزنًا مؤقتًا لتنفيذ fallback. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيسبب ذلك أخطاءً وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1300
url: /ar/cpp/system.text/encoderfallbackbuffer/
---
## EncoderFallbackBuffer class


يوفر مخزنًا مؤقتًا لتنفيذ fallback. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيسبب ذلك أخطاءً وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class EncoderFallbackBuffer : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Fallback](./fallback/)(char_t, int) | ينفّذ إجراء fallback الفعلي. |
| virtual [Fallback](./fallback/)(char_t, char_t, int) | ينفّذ إجراء fallback الفعلي. |
| virtual [get_Remaining](./get_remaining/)() const | يحصل على عدد الأحرف المتبقية التي ستُعالج. |
| virtual [GetNextChar](./getnextchar/)() | يستخرج الحرف التالي في مخزن fallback. |
| virtual [MovePrevious](./moveprevious/)() | ينقل موضع المخزن خطوة واحدة إلى الخلف إذا كان ذلك ممكنًا. |
| virtual [Reset](./reset/)() | يعيد تعيين المخزن إلى الحالة الأولية. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
