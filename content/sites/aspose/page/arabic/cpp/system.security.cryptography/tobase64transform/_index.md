---
title: "System::Security::Cryptography::ToBase64Transform فئة"
linktitle: "ToBase64Transform"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::ToBase64Transform فئة. يحول مثيل فئة CryptoStream إلى base 64. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 5000
url: /ar/cpp/system.security.cryptography/tobase64transform/
---
## ToBase64Transform class


يحول مثيل فئة [CryptoStream](../cryptostream/) إلى base 64. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ToBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clear](./clear/)() | يطلق جميع الموارد. |
| [Dispose](./dispose/)() | يطلق موارد نظام التشغيل التي حصل عليها الكائن الحالي. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | يحصل على قيمة تشير إلى ما إذا كان يمكن إعادة استخدام التحويل الحالي. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | يحصل على قيمة تشير إلى ما إذا كان يمكن تحويل كتل متعددة. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | حجم كتلة الإدخال. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | حجم كتلة الإخراج. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) | يعالج كتلة من البيانات وينسخ البيانات إلى مصفوفة الإخراج. |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | يعالج آخر كتلة من البيانات ويحسب قيمة الإخراج. |
| virtual [~ToBase64Transform](./~tobase64transform/)() | المدمر. |
## انظر أيضًا

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
