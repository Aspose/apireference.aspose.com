---
title: "فئة System::Drawing::Imaging::EncoderParameter"
linktitle: "EncoderParameter"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Drawing::Imaging::EncoderParameter. تعمل كحاوية تُستخدم لتمرير القيم إلى مشفر الصورة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


تعمل كحاوية تُستخدم لتمرير القيم إلى مشفر الصورة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class EncoderParameter : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./) التي تمثل كسرًا. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./) التي تمثل نطاقًا من القيم الصحيحة. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./) التي تمثل نطاقًا من الكسور. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./) التي تمثل مصفوفة من القيم. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./) التي تمثل مصفوفة من القيم. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./) التي تمثل مصفوفة من القيم. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./) التي تمثل مصفوفة من الكسور. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | ينشئ مثلاً جديداً من الفئة [EncoderParameter](./) التي تمثل مصفوفة من نطاقات القيم الصحيحة. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | ينشئ مثيلاً جديدًا من فئة [EncoderParameter](./) التي تمثل مصفوفة من نطاقات الكسور. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | ينشئ مثيلاً جديدًا من فئة [EncoderParameter](./) التي تمثل العدد المحدد من القيم من النوع المحدد والتي تُقرأ من المخزن المؤقت المحدد. |
| [get_Encoder](./get_encoder/)() const | يعيد كائن [Encoder](../encoder/) المرتبط بكائن [EncoderParameter](./) الحالي. |
| [get_NumberOfValues](./get_numberofvalues/)() const | يعيد عدد القيم التي يمثلها الكائن الحالي. |
| [get_Type](./get_type/)() const | يعيد نوع القيم التي يمثلها الكائن الحالي. |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | يربط كائن [Encoder](../encoder/) المحدد بكائن [EncoderParameter](./) الحالي. |
| [~EncoderParameter](./~encoderparameter/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
