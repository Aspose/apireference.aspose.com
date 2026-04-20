---
title: "فئة System::Array::Enumerator"
linktitle: "المُعدِّد"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Array::Enumerator. تنفّذ واجهة IEnumerator التي تمكّن من تعداد عناصر كائن Array. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبّب أخطاءً في وقت التشغيل أو أخطاءً في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 6800
url: /ar/cpp/system/array/enumerator/
---
## Enumerator class


تنفّذ واجهة IEnumerator التي تمكّن من تعداد عناصر كائن [Array](../). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبّب أخطاءً في وقت التشغيل أو أخطاءً في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | ينشئ كائنًا جديدًا من نوع [Enumerator](./) يمثل المصفوفة المحددة. |
| [get_Current](./get_current/)() const override | يعيد نسخة من العنصر الحالي. |
| [MoveNext](./movenext/)() override | يتحقق مما إذا كان فهرس العنصر الحالي لا يشير إلى العنصر الأخير في المصفوفة ويتقدمه إذا لم يكن كذلك. |
| [Reset](./reset/)() override | يعيد ضبط فهرس العنصر الحالي. |
| virtual [~Enumerator](./~enumerator/)() | المدمر. |
## انظر أيضًا

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
