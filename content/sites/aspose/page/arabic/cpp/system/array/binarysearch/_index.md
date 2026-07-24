---
title: "طريقة System::Array::BinarySearch"
linktitle: "BinarySearch"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Array::BinarySearch. تُجري بحثًا ثنائيًا في المصفوفة المرتبة في C++."
type: docs
weight: 4600
url: /ar/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


ينفّذ بحثًا ثنائيًا في المصفوفة المرتبة.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | المصفوفة المرتبة لإجراء البحث فيها |
| العنصر | const T\& | عنصر للبحث عنه |

### ReturnValue

فهرس العنصر المُبحث عنه إذا تم العثور عليه، وإلا عدد صحيح سالب هو المكمل الثنائي للفهرس للعنصر التالي الأكبر من العنصر المُبحث عنه أو، إذا لم يكن هناك عنصر أكبر، المكمل الثنائي لعدد العناصر في المصفوفة.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


غير مُنفَّذ.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
