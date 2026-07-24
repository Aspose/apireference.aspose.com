---
title: "طريقة System::Linq::IOrderedEnumerable::LINQ_ThenBy"
linktitle: "LINQ_ThenBy"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام طريقة LINQ_ThenBy من فئة System::Linq::IOrderedEnumerable في C++."
type: docs
weight: 300
url: /ar/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


يقوم بترتيب لاحق لعناصر التسلسل بترتيب تصاعدي وفقاً لمفتاح.

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| Parameter | الوصف |
| --- | --- |
| المفتاح | نوع المفتاح الذي تُعيده الدالة keySelector. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | دالة لاستخراج مفتاح من كل عنصر. |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
