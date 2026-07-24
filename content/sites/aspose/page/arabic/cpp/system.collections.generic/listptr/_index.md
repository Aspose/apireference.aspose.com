---
title: "فئة System::Collections::Generic::ListPtr"
linktitle: "ListPtr"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Generic::ListPtr. مؤشر قائمة مع عوامل الوصول. هذا النوع هو مؤشر لإدارة حذف الكائنات الأخرى. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت في C++."
type: docs
weight: 3500
url: /ar/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<List<T>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | يُهيئ مؤشرًا فارغًا. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | يُهيئ مؤشرًا إلى القائمة المحددة. |
| [operator==](./operator==/)(std::nullptr_t) const | يتحقق مما إذا كان مؤشر [List](../list/) فارغًا. |
| [operator[]](./operator[]/)(int) | مُستَخدِم. |
| [operator[]](./operator[]/)(int) const | مُستَخدِم. |
## انظر أيضًا

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
