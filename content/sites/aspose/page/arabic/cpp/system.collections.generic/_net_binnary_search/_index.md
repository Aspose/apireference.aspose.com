---
title: "دالة System::Collections::Generic::_net_binnary_search"
linktitle: "_net_binnary_search"
second_title: "Aspose.Page لـ C++"
description: "دالة System::Collections::Generic::_net_binnary_search. تنفّذ البحث الثنائي في حاوية ذات وصول عشوائي. تخصيص للمؤشرات الذكية. يستخدم دالة System::Object::CompareTo في C++."
type: docs
weight: 4900
url: /ar/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


ينفّذ البحث الثنائي في حاوية ذات وصول عشوائي. تخصيص للمؤشرات الذكية. يستخدم دالة System::Object::CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | الوصف |
| --- | --- |
| containerT | نوع قالب حاوية بنمط STL مع معاملين قالب: نوع العنصر ونوع المخصص. |
| T | نوع العنصر. |
| Allocator | نوع المخصص. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| حاوية | const containterT\<T, Allocator\>\& | الحاوية للبحث فيها. |
| الفهرس | int | فهرس بداية نطاق البحث. |
| count | int | طول نطاق البحث. |
| value | T | القيمة للبحث عنها. |

### ReturnValue

إذا تم العثور عليها، فمؤشر العنصر التالي؛ وإلا، مكملات المؤشر الذي توقفت عنده عملية البحث.

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


ينفّذ البحث الثنائي في حاوية وصول عشوائي. تخصيص لأنواع القيم. يستخدم طريقة CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | الوصف |
| --- | --- |
| containerT | نوع قالب حاوية بنمط STL مع معاملين قالب: نوع العنصر ونوع المخصص. |
| T | نوع العنصر. |
| Allocator | نوع المخصص. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| حاوية | const containterT\<T, Allocator\>\& | الحاوية للبحث فيها. |
| الفهرس | int | فهرس بداية نطاق البحث. |
| count | int | طول نطاق البحث. |
| value | T | القيمة للبحث عنها. |

### ReturnValue

إذا تم العثور عليها، فمؤشر العنصر التالي؛ وإلا، مكملات المؤشر الذي توقفت عنده عملية البحث.

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


ينفّذ البحث الثنائي في حاوية وصول عشوائي. تخصيص لأنواع القيم العددية. يقارن العناصر باستخدام عوامل أكبر وأصغر.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | الوصف |
| --- | --- |
| containerT | نوع قالب حاوية بنمط STL مع معاملين قالب: نوع العنصر ونوع المخصص. |
| T | نوع العنصر. |
| Allocator | نوع المخصص. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| حاوية | const containterT\<T, Allocator\>\& | الحاوية للبحث فيها. |
| الفهرس | int | فهرس بداية نطاق البحث. |
| count | int | طول نطاق البحث. |
| value | T | القيمة للبحث عنها. |

### ReturnValue

إذا تم العثور عليها، فمؤشر العنصر التالي؛ وإلا، مكملات المؤشر الذي توقفت عنده عملية البحث.

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


ينفّذ البحث الثنائي في حاوية وصول عشوائي.

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| Parameter | الوصف |
| --- | --- |
| containerT | نوع قالب حاوية بنمط STL مع معاملين قالب: نوع العنصر ونوع المخصص. |
| T | نوع العنصر. |
| Allocator | نوع المخصص. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| حاوية | const containterT\<T, Allocator\>\& | الحاوية للبحث فيها. |
| الفهرس | int | فهرس بداية نطاق البحث. |
| count | int | طول نطاق البحث. |
| value | T | القيمة للبحث عنها. |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | كائن [Comparer](../comparer/). |

### ReturnValue

إذا تم العثور عليها، فمؤشر العنصر التالي؛ وإلا، مكملات المؤشر الذي توقفت عنده عملية البحث.

## انظر أيضًا

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
