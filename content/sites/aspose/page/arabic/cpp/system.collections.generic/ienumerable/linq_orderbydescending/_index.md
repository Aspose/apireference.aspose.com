---
title: "طريقة System::Collections::Generic::IEnumerable::LINQ_OrderByDescending"
linktitle: "LINQ_OrderByDescending"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام طريقة LINQ_OrderByDescending من فئة System::Collections::Generic::IEnumerable في C++."
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
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


يرتب عناصر التسلسل تنازليًا وفقًا لقيم المفاتيح التي يختارها keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| Parameter | الوصف |
| --- | --- |
| keySelector | دالة لاستخراج المفتاح من عنصر. |

### ReturnValue

IOrderedEnumerable يحتوي على عناصر مرتبة بترتيب تنازلي حسب المفتاح

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
