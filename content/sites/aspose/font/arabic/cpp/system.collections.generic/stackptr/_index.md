---
title: "System::Collections::Generic::StackPtr فئة"
linktitle: "StackPtr"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::StackPtr فئة. مؤشر مكدس. هذا النوع هو مؤشر لإدارة حذف الكائن الآخر. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت في C++."
type: docs
weight: 4700
url: /ar/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<T0>
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [StackPtr](./stackptr/)() | ينشئ مؤشرًا فارغًا. |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | ينشئ مؤشرًا يشير إلى مكدس محدد. |

## انظر أيضًا

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
