---
title: "الفئة System::Linq::IOrderedEnumerable"
linktitle: "IOrderedEnumerable"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Linq::IOrderedEnumerable. تمثل تسلسلًا مرتّبًا في C++."
type: docs
weight: 300
url: /ar/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


يمثّل تسلسلًا مرتبًا.

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| معامل | الوصف |
| --- | --- |
| T | نوع عناصر التسلسل. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد. |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | يُجري ترتيبًا لاحقًا لعناصر التسلسل بترتيب تصاعدي وفقًا لمفتاح. |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Comparator](./comparator/) | معلومات RTTI. |

## انظر أيضًا

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Font for C++](../../)
