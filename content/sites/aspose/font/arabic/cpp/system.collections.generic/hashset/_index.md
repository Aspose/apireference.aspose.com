---
title: "فئة System::Collections::Generic::HashSet"
linktitle: "HashSet"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::HashSet. إعلان مسبق لفئة HashSet في C++."
type: docs
weight: 1700
url: /ar/cpp/system.collections.generic/hashset/
---
## HashSet class


إعلان مسبق لفئة [HashSet](./).

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [HashSet](./hashset/)() | معلومات RTTI. |
| [HashSet](./hashset/)(int) | ينشئ مجموعة فارغة بسعة محددة. |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | ينشئ مجموعة فارغة تستخدم مُقارن المساواة المحدد. |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | ينشئ HashSet بناءً على قيم قابلة للتعداد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [BaseType](./basetype/) | النوع الأساسي. |
| [ThisPtr](./thisptr/) | نوع المؤشر. |
| [ThisType](./thistype/) | النوع الذاتي. |
## ملاحظات


تنفيذ مجموعة يعتمد على التجزئة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
