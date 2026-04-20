---
title: "طريقة System::Collections::Generic::_net_binnary_search"
linktitle: "_net_binnary_search"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Collections::Generic::_net_binnary_search. تنفّذ بحثًا ثنائيًا في حاوية وصول عشوائي. تخصيص للمؤشرات الذكية. تستخدم طريقة System::Object::CompareTo في C++."
type: docs
weight: 4900
url: /ar/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


تنفّذ بحثًا ثنائيًا في حاوية وصول عشوائي. تخصيص للمؤشرات الذكية. تستخدم طريقة System::Object::CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| معامل | الوصف |
| --- | --- |
| containerT | نوع قالب حاوية على نمط STL مع معاملين قالب: نوع العنصر ونوع المخصص. |
| T | نوع العنصر. |
| المخصص | نوع المخصص. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| container | const containterT\<T, Allocator\>\& | الحاوية للبحث فيها. |
| الفهرس | int | فهرس بداية نطاق البحث. |
| count | int | طول نطاق البحث. |
| قيمة | T | القيمة المراد البحث عنها. |

### ReturnValue

إذا وُجدت، فهرس العنصر التالي؛ وإلا، مكمل الفهرس الذي توقّف عنده البحث.

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


تنفّذ بحثًا ثنائيًا في حاوية وصول عشوائي. تخصيص لأنواع القيم. تستخدم طريقة CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| معامل | الوصف |
| --- | --- |
| containerT | نوع قالب حاوية على نمط STL مع معاملين قالب: نوع العنصر ونوع المخصص. |
| T | نوع العنصر. |
| المخصص | نوع المخصص. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| container | const containterT\<T, Allocator\>\& | الحاوية للبحث فيها. |
| الفهرس | int | فهرس بداية نطاق البحث. |
| count | int | طول نطاق البحث. |
| قيمة | T | القيمة المراد البحث عنها. |

### ReturnValue

إذا وُجدت، فهرس العنصر التالي؛ وإلا، مكمل الفهرس الذي توقّف عنده البحث.

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


تنفّذ بحثًا ثنائيًا في حاوية وصول عشوائي. تخصيص لأنواع القيم العددية. تقارن العناصر باستخدام عوامل أكبر وأصغر.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| معامل | الوصف |
| --- | --- |
| containerT | نوع قالب حاوية على نمط STL مع معاملين قالب: نوع العنصر ونوع المخصص. |
| T | نوع العنصر. |
| المخصص | نوع المخصص. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| container | const containterT\<T, Allocator\>\& | الحاوية للبحث فيها. |
| الفهرس | int | فهرس بداية نطاق البحث. |
| count | int | طول نطاق البحث. |
| قيمة | T | القيمة المراد البحث عنها. |

### ReturnValue

إذا وُجدت، فهرس العنصر التالي؛ وإلا، مكمل الفهرس الذي توقّف عنده البحث.

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


تنفّذ بحثًا ثنائيًا في حاوية وصول عشوائي.

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| معامل | الوصف |
| --- | --- |
| containerT | نوع قالب حاوية على نمط STL مع معاملين قالب: نوع العنصر ونوع المخصص. |
| T | نوع العنصر. |
| المخصص | نوع المخصص. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| container | const containterT\<T, Allocator\>\& | الحاوية للبحث فيها. |
| الفهرس | int | فهرس بداية نطاق البحث. |
| count | int | طول نطاق البحث. |
| قيمة | T | القيمة المراد البحث عنها. |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | كائن [Comparer](../comparer/). |

### ReturnValue

إذا وُجدت، فهرس العنصر التالي؛ وإلا، مكمل الفهرس الذي توقّف عنده البحث.

## انظر أيضًا

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
