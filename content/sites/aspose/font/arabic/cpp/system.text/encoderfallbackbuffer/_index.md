---
title: "الفئة System::Text::EncoderFallbackBuffer"
linktitle: "EncoderFallbackBuffer"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Text::EncoderFallbackBuffer. توفر مخزنًا مؤقتًا لتنفيذ الفallback. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1300
url: /ar/cpp/system.text/encoderfallbackbuffer/
---
## EncoderFallbackBuffer class


توفر مخزنًا مؤقتًا لتنفيذ الفallback. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class EncoderFallbackBuffer : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Fallback](./fallback/)(char_t, int) | تنفذ إجراء الفallback الفعلي. |
| virtual [Fallback](./fallback/)(char_t, char_t, int) | تنفذ إجراء الفallback الفعلي. |
| virtual [get_Remaining](./get_remaining/)() const | تحصل على عدد الأحرف المتبقية التي سيتم معالجتها. |
| virtual [GetNextChar](./getnextchar/)() | تستخرج الحرف التالي في مخزن الفallback. |
| virtual [MovePrevious](./moveprevious/)() | تحرك موضع المخزن خطوة واحدة إلى الخلف إذا كان ذلك ممكنًا. |
| virtual [Reset](./reset/)() | يعيد تعيين المخزن إلى الحالة الأولية. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
