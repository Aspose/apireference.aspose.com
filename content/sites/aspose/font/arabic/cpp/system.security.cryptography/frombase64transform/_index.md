---
title: "System::Security::Cryptography::FromBase64Transform فئة"
linktitle: "FromBase64Transform"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::FromBase64Transform فئة. يحول نسخة فئة CryptoStream من الترميز base 64. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التحقق. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1500
url: /ar/cpp/system.security.cryptography/frombase64transform/
---
## FromBase64Transform class


يحول نسخة فئة [CryptoStream](../cryptostream/) من الترميز base 64. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التحقق. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class FromBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clear](./clear/)() | يطلق جميع الموارد. |
| [Dispose](./dispose/)() | يطلق موارد نظام التشغيل التي حصل عليها الكائن الحالي. |
| [FromBase64Transform](./frombase64transform/)() | المُنشئ. |
| [FromBase64Transform](./frombase64transform/)(FromBase64TransformMode) | المُنشئ. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | يحصل على قيمة تشير إلى ما إذا كان التحويل الحالي يمكن إعادة استخدامه. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | يحصل على قيمة تشير إلى ما إذا كان يمكن تحويل كتل متعددة. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | حجم كتلة الإدخال. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | حجم كتلة الإخراج. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) |  |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) |  |
| virtual [~FromBase64Transform](./~frombase64transform/)() | المدمر. |
## انظر أيضًا

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
