---
title: "الفئة System::IO::STDIOStreamWrapperBase"
linktitle: "STDIOStreamWrapperBase"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::IO::STDIOStreamWrapperBase. تمثل فئة أساسية للمغلفات الشبيهة بـ System.IO.Stream. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2000
url: /ar/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


تمثل فئة أساسية للمغلفات الشبيهة بـ [System.IO.Stream](../stream/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | يحدد ما إذا كان الدفق يدعم القراءة. |
| [get_CanSeek](./get_canseek/)() const override | يحدد ما إذا كان التدفق يدعم البحث. |
| [get_CanWrite](./get_canwrite/)() const override | يحدد ما إذا كان الدفق يدعم الكتابة. |
| [get_Length](./get_length/)() const override | يعيد طول الدفق. |
| [get_Position](./get_position/)() const override | يعيد الموضع الحالي للدفق. |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | عامل إسناد النسخ. محذوف. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | يضبط موضع التدفق الممثل بالكائن الحالي. |
| [set_Position](./set_position/)(int64_t) override | يضبط موضع التدفق. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | منشئ النسخ. محذوف. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](../stream/null/) | تدفق بدون تخزين أساسي. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | معلومات RTTI. |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## انظر أيضًا

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
