---
title: "فئة System::Text::DecoderFallbackBuffer"
linktitle: "DecoderFallbackBuffer"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Text::DecoderFallbackBuffer. توفر مخزنًا لتنفيذ الاحتياطي. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.text/decoderfallbackbuffer/
---
## DecoderFallbackBuffer class


يوفر مخزنًا مؤقتًا لتنفيذ fallback. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيسبب ذلك أخطاءً وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DecoderFallbackBuffer : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) | ينفّذ إجراء fallback الفعلي. |
| virtual [get_Remaining](./get_remaining/)() const | يحصل على عدد الأحرف المتبقية التي ستُعالج. |
| virtual [GetNextChar](./getnextchar/)() | يستخرج الحرف التالي في مخزن fallback. |
| virtual [MovePrevious](./moveprevious/)() | ينقل موضع المخزن خطوة واحدة إلى الخلف إذا كان ذلك ممكنًا. |
| virtual [Reset](./reset/)() | يعيد تعيين المخزن إلى الحالة الأولية. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
