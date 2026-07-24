---
title: "فئة System::Collections::Generic::DictionaryPtr"
linktitle: "DictionaryPtr"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Generic::DictionaryPtr. فئة مؤشر القاموس مع تحميلات المشغل. هذا النوع هو مؤشر لإدارة حذف الكائنات الأخرى. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت في C++."
type: docs
weight: 1300
url: /ar/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| Parameter | الوصف |
| --- | --- |
| T | نوع المفتاح. |
| V | نوع القيمة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | يُهيئ مؤشرًا فارغًا. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | يحوّل نوع المؤشر. |
| [operator[]](./operator[]/)(const X\&) const | عامل الوصول للعمل مع تحويل نوع المفتاح. |
| [operator[]](./operator[]/)(const T\&) const | عامل الوصول. |

## انظر أيضًا

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
