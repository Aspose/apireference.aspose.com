---
title: "الفئة System::IO::BasicSTDIOStreamWrapper"
linktitle: "BasicSTDIOStreamWrapper"
second_title: "Aspose.Page لـ C++"
description: "فئة System::IO::BasicSTDIOStreamWrapper. تمثل غلافًا شبيهًا بـ System.IO.Stream لـ std::basic_iostream والكائنات المشتقة منه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.io/basicstdiostreamwrapper/
---
## BasicSTDIOStreamWrapper class


تمثل غلافًا شبيهًا بـ [System.IO.Stream](../stream/)- لـ std::basic_iostream والكائنات المشتقة منه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T,typename>class BasicSTDIOStreamWrapper : public System::IO::BasicSTDIStreamWrapper<T>,
                                                             public System::IO::BasicSTDOStreamWrapper<T>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/)(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) | ينشئ مثيلًا جديدًا من [BasicSTDIOStreamWrapper](./). |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/)(const BasicSTDIOStreamWrapper\&) | منشئ النسخ. محذوف. |
| [Flush](./flush/)() override | يمسح مخازن هذا التدفق ويكتب جميع البيانات المخزنة مؤقتاً إلى التخزين الأساسي. |
| [operator=](./operator=/)(const BasicSTDIOStreamWrapper\&) | عامل إسناد النسخ. محذوف. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | إذا كان وضع التغليف ثنائيًا، يقرأ عدد البايتات المحدد من الدفق، وإلا يقرأ عدد الأحرف المحدد ويحوّله إلى نوع uint8_t. يكتب نتيجة القراءة إلى مصفوفة البايتات المحددة. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [ReadByte](./readbyte/)() override | إذا كان وضع التغليف ثنائيًا، يقرأ بايتًا واحدًا من مخزن الأحرف المفكوكة الأخيرة، وإلا يقرأ حرفًا واحدًا من الدفق ويحوّله إلى نوع uint8_t. |
| [SetLength](./setlength/)(int64_t) override | يضبط طول التدفق الممثل بالكائن الحالي. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | إذا كان وضع التغليف ثنائيًا، يكتب إلى التدفق النطاق الفرعي المحدد من البايتات من المصفوفة البايتية المحددة، وإلا يحول النطاق الفرعي المحدد من البايتات من المصفوفة البايتية إلى نوع [char_type](./char_type/) ثم يكتب النتيجة إلى التدفق. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| [WriteByte](./writebyte/)(uint8_t) override | إذا كان وضع التغليف ثنائيًا، يكتب إلى التدفق القيمة المحددة للعدد الصحيح غير الموقع 8‑بت، وإلا يحولها إلى نوع [char_type](./char_type/) ثم يكتب النتيجة إلى التدفق. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Null](../stream/null/) | تدفق بدون تخزين أساسي. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseIType](./baseitype/) |  |
| [BaseOType](./baseotype/) |  |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | معلومات RTTI. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## انظر أيضًا

* Class [BasicSTDIStreamWrapper](../basicstdistreamwrapper/)
* Class [BasicSTDOStreamWrapper](../basicstdostreamwrapper/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
