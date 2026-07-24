---
title: "System::IO::BasicSTDIStreamWrapper class"
linktitle: "BasicSTDIStreamWrapper"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::IO::BasicSTDIStreamWrapper. تمثل غلافًا شبيهًا بـ System.IO.Stream لـ std::basic_istream والكائنات المشتقة منه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.io/basicstdistreamwrapper/
---
## BasicSTDIStreamWrapper class


تمثل غلافًا شبيهًا بـ [System.IO.Stream](../stream/) لـ std::basic_istream والكائنات المشتقة منه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T,typename>class BasicSTDIStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | ينشئ نسخة جديدة من [BasicSTDIStreamWrapper](./). |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(const BasicSTDIStreamWrapper\&) | منشئ النسخ. محذوف. |
| [Flush](./flush/)() override | يمسح مخازن هذا التدفق ويكتب جميع البيانات المخزنة مؤقتًا إلى التخزين الأساسي. غير مدعوم! |
| [operator=](./operator=/)(const BasicSTDIStreamWrapper\&) | عامل إسناد النسخ. محذوف. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | إذا كان وضع التغليف ثنائيًا، يقرأ عدد البايتات المحدد من الدفق، وإلا يقرأ عدد الأحرف المحدد ويحوّله إلى نوع uint8_t. يكتب نتيجة القراءة إلى مصفوفة البايتات المحددة. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [ReadByte](./readbyte/)() override | إذا كان وضع التغليف ثنائيًا، يقرأ بايتًا واحدًا من مخزن الأحرف المفكوكة الأخيرة، وإلا يقرأ حرفًا واحدًا من الدفق ويحوّله إلى نوع uint8_t. |
| [SetLength](./setlength/)(int64_t) override | يضبط طول التدفق الممثل بواسطة الكائن الحالي. غير مدعوم! |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | إذا كان وضع التغليف ثنائيًا، يكتب إلى التدفق النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة، وإلا يحول النطاق الفرعي المحدد من البايتات من المصفوفة إلى نوع [char_type](./char_type/) ثم يكتب النتيجة إلى التدفق. غير مدعوم! |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| [WriteByte](./writebyte/)(uint8_t) override | إذا كان وضع التغليف ثنائيًا، يكتب إلى التدفق القيمة الصحيحة غير الموقعة ذات 8 بت المحددة، وإلا يحولها إلى نوع [char_type](./char_type/) ثم يكتب النتيجة إلى التدفق. غير مدعوم! |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](../stream/null/) | تدفق بدون تخزين أساسي. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | معلومات RTTI. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## انظر أيضًا

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
