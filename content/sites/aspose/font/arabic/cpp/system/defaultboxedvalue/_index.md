---
title: "فئة System::DefaultBoxedValue"
linktitle: "DefaultBoxedValue"
second_title: "Aspose.Font لـ C++"
description: "فئة System::DefaultBoxedValue. تنفيذ فئة BoxedValue. يسمح بتعريف تخصيصات BoxingValue دون تكرار الشيفرة المشتركة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 2000
url: /ar/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | ينشئ مثالًا جديدًا من فئة [DefaultBoxedValue](./) التي تمثل القيمة المحددة. |
| [Equals](./equals/)(ptr) override | يحدد مساواة القيم المُغَلَّفة التي تمثلها الكائنات الحالية والمحددة. |
| [GetHashCode](./gethashcode/)() const override | يعيد رمز تجزئة للكائن الحالي. |
| [GetType](./gettype/)() const override | يحصل على النوع الفعلي للكائن. |
| [is](./is/)() const | يحدد ما إذا كان نوع القيمة المُغَلَّفة التي يمثلها الكائن الحالي هو **V**. |
| [ToString](./tostring/)() const override | يعيد تمثيل السلسلة للقيمة المعبأة. |
| [unbox](./unbox/)() const | يفك تعبئة القيمة المعبأة. |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
