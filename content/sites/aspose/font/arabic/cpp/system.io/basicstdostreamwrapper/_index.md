---
title: "فئة System::IO::BasicSTDOStreamWrapper"
linktitle: "BasicSTDOStreamWrapper"
second_title: "Aspose.Font لـ C++"
description: "System::IO::BasicSTDOStreamWrapper class. يمثل غلافًا شبيهًا بـ System.IO.Stream لـ std::basic_ostream والكائنات المشتقة منه. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاءً وقت التشغيل أو أعطالًا في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.io/basicstdostreamwrapper/
---
## BasicSTDOStreamWrapper class


يمثل غلافًا شبيهًا بـ [System.IO.Stream](../stream/)-like wrapper for std::basic_ostream and its derived objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename T,typename>class BasicSTDOStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | ينشئ مثيلًا جديدًا من [BasicSTDOStreamWrapper](./). |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(const BasicSTDOStreamWrapper\&) | منشئ النسخ. محذوف. |
| [Flush](./flush/)() override | يمسح مخازن هذا التدفق ويكتب جميع البيانات المخزنة مؤقتًا إلى التخزين الأساسي. |
| [operator=](./operator=/)(const BasicSTDOStreamWrapper\&) | عامل إسناد النسخ. محذوف. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | إذا كان وضع التغليف ثنائيًا، يقرأ العدد المحدد من البايتات من الدفق، وإلا يقرأ العدد المحدد من الأحرف ويحولها إلى نوع uint8_t. يكتب نتيجة القراءة إلى مصفوفة البايتات المحددة. غير مدعوم! |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يقرأ عدد البايتات المحدد من التدفق ويكتبها إلى مصفوفة البايتات المحددة. |
| [ReadByte](./readbyte/)() override | إذا كان وضع التغليف ثنائيًا، يقرأ بايتًا واحدًا من مخزن الأحرف المفكوكة الأخيرة، وإلا يقرأ حرفًا واحدًا من الدفق ويحولها إلى نوع uint8_t. غير مدعوم! |
| [SetLength](./setlength/)(int64_t) override | يضبط طول التدفق الممثل بالكائن الحالي. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | إذا كان وضع التغليف ثنائيًا، يكتب إلى الدفق النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة، وإلا يحول النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى نوع [char_type](./char_type/) ثم يكتب النتيجة إلى الدفق. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | يكتب النطاق الفرعي المحدد من البايتات من مصفوفة البايتات المحددة إلى التدفق. |
| [WriteByte](./writebyte/)(uint8_t) override | إذا كان وضع التغليف ثنائيًا، يكتب إلى الدفق القيمة المحددة من عدد صحيح غير موقع 8-بت، وإلا يحولها إلى نوع [char_type](./char_type/) ثم يكتب النتيجة إلى الدفق. |
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
* Library [Aspose.Font for C++](../../)
