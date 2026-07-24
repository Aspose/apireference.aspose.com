---
title: "فئة System::Collections::Generic::StackPtr"
linktitle: "StackPtr"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Generic::StackPtr. مؤشر المكدس. هذا النوع هو مؤشر لإدارة حذف الكائنات الأخرى. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت في C++."
type: docs
weight: 4700
url: /ar/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
```


| Parameter | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [StackPtr](./stackptr/)() | ينشئ مؤشرًا فارغًا. |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | ينشئ مؤشرًا يشير إلى مكدس معين. |

## انظر أيضًا

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
