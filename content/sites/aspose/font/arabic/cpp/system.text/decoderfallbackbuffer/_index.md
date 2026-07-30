---
title: "System::Text::DecoderFallbackBuffer فئة"
linktitle: "DecoderFallbackBuffer"
second_title: "Aspose.Font لـ C++"
description: "System::Text::DecoderFallbackBuffer فئة. يوفر مخزنًا لتنفيذ الاحتياطي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.text/decoderfallbackbuffer/
---
## DecoderFallbackBuffer class


توفر مخزنًا مؤقتًا لتنفيذ الفallback. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DecoderFallbackBuffer : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) | تنفذ إجراء الفallback الفعلي. |
| virtual [get_Remaining](./get_remaining/)() const | تحصل على عدد الأحرف المتبقية التي سيتم معالجتها. |
| virtual [GetNextChar](./getnextchar/)() | تستخرج الحرف التالي في مخزن الفallback. |
| virtual [MovePrevious](./moveprevious/)() | تحرك موضع المخزن خطوة واحدة إلى الخلف إذا كان ذلك ممكنًا. |
| virtual [Reset](./reset/)() | يعيد تعيين المخزن إلى الحالة الأولية. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
