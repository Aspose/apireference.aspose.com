---
title: "System::Drawing::Imaging::EncoderParameter فئة"
linktitle: "EncoderParameter"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Imaging::EncoderParameter فئة. تعمل كحاوية تُستخدم لتمرير القيم إلى مُشفّر الصورة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


تعمل كحاوية تُستخدم لتمرير القيم إلى مُشفّر الصورة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class EncoderParameter : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | ينشئ نسخة جديدة من فئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | ينشئ نسخة جديدة من فئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | ينشئ نسخة جديدة من فئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | ينشئ نسخة جديدة من فئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | ينشئ نسخة جديدة من فئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | ينشئ نسخة جديدة من فئة [EncoderParameter](./) التي تمثل كسرًا. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | ينشئ نسخة جديدة من فئة [EncoderParameter](./) التي تمثل نطاقًا من القيم الصحيحة. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | ينشئ نسخة جديدة من فئة [EncoderParameter](./) التي تمثل نطاقًا من الكسور. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | ينشئ نسخة جديدة من فئة [EncoderParameter](./). |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | ينشئ نسخة جديدة من فئة [EncoderParameter](./) التي تمثل مصفوفة من القيم. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | ينشئ نسخة جديدة من فئة [EncoderParameter](./) التي تمثل مصفوفة من القيم. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | ينشئ نسخة جديدة من فئة [EncoderParameter](./) التي تمثل مصفوفة من القيم. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | ينشئ نسخة جديدة من فئة [EncoderParameter](./) التي تمثل مصفوفة من الكسور. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | ينشئ نسخة جديدة من فئة [EncoderParameter](./) التي تمثل مصفوفة من نطاقات القيم الصحيحة. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | ينشئ نسخة جديدة من فئة [EncoderParameter](./) التي تمثل مصفوفة من نطاقات الكسور. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | ينشئ نسخة جديدة من فئة [EncoderParameter](./) التي تمثل العدد المحدد من القيم من النوع المحدد والتي تُقرأ من المخزن المؤقت المحدد. |
| [get_Encoder](./get_encoder/)() const | يعيد كائن [Encoder](../encoder/) المرتبط بكائن [EncoderParameter](./) الحالي. |
| [get_NumberOfValues](./get_numberofvalues/)() const | يعيد عدد القيم الممثلة بواسطة الكائن الحالي. |
| [get_Type](./get_type/)() const | يعيد نوع القيم الممثلة بواسطة الكائن الحالي. |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | يربط الكائن [Encoder](../encoder/) المحدد بالكائن [EncoderParameter](./) الحالي. |
| [~EncoderParameter](./~encoderparameter/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
