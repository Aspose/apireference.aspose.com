---
title: "فئة System::Collections::Generic::SortedSet"
linktitle: "SortedSet"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::SortedSet. إعلان مسبق لفئة SortedSet في C++."
type: docs
weight: 4400
url: /ar/cpp/system.collections.generic/sortedset/
---
## SortedSet class


إعلان مسبق لفئة [SortedSet](./).

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Max](./get_max/)() const | يحصل على القيمة القصوى في [SortedSet](./). |
| [SortedSet](./sortedset/)() | معلومات RTTI. |
| [SortedSet](./sortedset/)(int) | ينشئ مجموعة فارغة بسعة محددة. |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | ينشئ مجموعة فارغة تستخدم مُقارن المساواة المحدد. |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | ينشئ [SortedSet](./) بناءً على قيم قابلة للتعداد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | نوع Vase. |
| [ThisPtr](./thisptr/) | نوع المؤشر. |
| [ThisType](./thistype/) | النوع الذاتي. |
## ملاحظات


تنفيذ مجموعة من الكائنات المرتبة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
