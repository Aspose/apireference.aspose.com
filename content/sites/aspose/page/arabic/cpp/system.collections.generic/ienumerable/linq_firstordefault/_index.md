---
title: "طريقة System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault"
linktitle: "LINQ_FirstOrDefault"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault. تُرجع العنصر الأول من تسلسل، أو قيمة افتراضية إذا كان التسلسل فارغًا في C++."
type: docs
weight: 1600
url: /ar/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


يعيد العنصر الأول في التسلسل، أو قيمة افتراضية إذا كان التسلسل فارغًا.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

العنصر الأول في التسلسل أو القيمة المُنشأة افتراضيًا إذا كان التسلسل فارغًا.

## انظر أيضًا

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


يعيد العنصر الأول في التسلسل الذي يلبي شرطًا أو قيمة افتراضية إذا لم يُعثر على مثل هذا العنصر.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دالة شرط | std::function\<bool(T)> | دالة لاختبار كل عنصر وفق شرط. |

### ReturnValue

default(T) إذا كان المصدر فارغًا أو إذا لم يمر أي عنصر بالاختبار المحدد بواسطة الدالة predicate؛ وإلا، العنصر الأول في المصدر الذي يمر بالاختبار المحدد بواسطة الدالة predicate.

## انظر أيضًا

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
