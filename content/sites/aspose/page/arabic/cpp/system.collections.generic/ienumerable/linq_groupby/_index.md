---
title: "طريقة System::Collections::Generic::IEnumerable::LINQ_GroupBy"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام طريقة LINQ_GroupBy من فئة System::Collections::Generic::IEnumerable في C++."
type: docs
weight: 1700
url: /ar/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


يجمع عناصر التسلسل في مجموعات.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| Parameter | الوصف |
| --- | --- |
| المفتاح | نوع المفتاح الذي تُعيده الدالة keyPredicate |

| Parameter | Type | الوصف |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | دالة لاستخراج المفتاح لكل عنصر. |

### ReturnValue

[IEnumerable](../) يحتوي على تسلسل من الكائنات ومفتاح.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
