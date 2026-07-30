---
title: "System::Collections::Generic::ListPtr فئة"
linktitle: "ListPtr"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::ListPtr فئة. مؤشر قائمة مع عوامل الوصول. هذا النوع هو مؤشر لإدارة حذف الكائن الآخر. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت في C++."
type: docs
weight: 3500
url: /ar/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<T0>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | يُهيئ مؤشرًا فارغًا. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | يُهيئ مؤشرًا إلى القائمة المحددة. |
| [operator==](./operator==/)(std::nullptr_t) const | يتحقق مما إذا كان مؤشر [List](../list/) فارغًا. |
| [operator[]](./operator[]/)(int) | الوصول. |
| [operator[]](./operator[]/)(int) const | الوصول. |
## انظر أيضًا

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
