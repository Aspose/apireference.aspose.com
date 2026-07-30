---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderBy method"
linktitle: "LINQ_OrderBy"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام طريقة LINQ_OrderBy من فئة System::Collections::Generic::IEnumerable في C++."
type: docs
weight: 2300
url: /ar/cpp/system.collections.generic/ienumerable/linq_orderby/
---
## IEnumerable::LINQ_OrderBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<Source, Key> &keySelector)
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_OrderBy(const Func\<T, Key\>\&) method


يرتب عناصر التسلسل بترتيب تصاعدي وفقًا لقيم المفاتيح التي يختارها keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<T, Key> &keySelector)
```


| معامل | الوصف |
| --- | --- |
| keySelector | دالة لاستخراج المفتاح من عنصر. |

### ReturnValue

IOrderedEnumerable الذي يتم فرز عناصره وفقًا لمفتاح

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
