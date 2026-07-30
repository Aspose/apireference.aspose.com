---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderByDescending طريقة"
linktitle: "LINQ_OrderByDescending"
second_title: "Aspose.Font لـ C++"
description: "كيفية استخدام طريقة LINQ_OrderByDescending لفئة System::Collections::Generic::IEnumerable في C++."
type: docs
weight: 2400
url: /ar/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


يرتب عناصر التسلسل بترتيب تنازلي وفقًا لقيم المفاتيح التي يختارها keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| معامل | الوصف |
| --- | --- |
| keySelector | دالة لاستخراج المفتاح من عنصر. |

### ReturnValue

IOrderedEnumerable التي تحتوي على عناصر مرتبة بترتيب تنازلي حسب المفتاح

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
