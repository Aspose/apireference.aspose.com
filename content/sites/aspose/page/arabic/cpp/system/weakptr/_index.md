---
title: "فئة System::WeakPtr"
linktitle: "WeakPtr"
second_title: "Aspose.Page لـ C++"
description: "فئة System::WeakPtr. فئة فرعية من System::SmartPtr التي تضبط نفسها على الوضع الضعيف عند الإنشاء. يرجى ملاحظة أن هذه الفئة لا تضمن أن مثيلها سيبقى دائمًا في الوضع الضعيف لأن set_Mode() لا يزال قابلًا للوصول. هذا النوع هو مؤشر لإدارة حذف الكائنات الأخرى. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت في C++."
type: docs
weight: 7500
url: /ar/cpp/system/weakptr/
---
## WeakPtr class


فئة فرعية من [System::SmartPtr](../smartptr/) التي تضبط نفسها على الوضع الضعيف عند الإنشاء. يرجى ملاحظة أن هذه الفئة لا تضمن أن مثيلها سيبقى دائمًا في الوضع الضعيف لأن [set_Mode()](../smartptr/set_mode/) لا يزال قابلًا للوصول. هذا النوع هو مؤشر لإدارة حذف الكائن الآخر. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت.

```cpp
template<class T>class WeakPtr : public System::SmartPtr<T>
```


| Parameter | الوصف |
| --- | --- |
| T | نوع المؤشر إليه. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [expired](./expired/)() const | يتحقق مما إذا كان الكائن المشار إليه قد تم حذفه بالفعل. |
| [get_weak](./get_weak/)() const | يحصل على الكائن المشار إليه. يؤكد أن المؤشر في الوضع الضعيف. |
| [operator=](./operator=/)(Q\&&) | يعين قيمة للمؤشر الضعيف. يستدعي عامل الإسناد المحدد في [SmartPtr_](./smartptr_/). |
| [operator==](./operator==/)(std::nullptr_t) const | يتحقق مما إذا كان المؤشر الضعيف فارغًا. |
| [WeakPtr](./weakptr/)(std::nullptr_t) | ينشئ مؤشرًا فارغًا. |
| [WeakPtr](./weakptr/)(Pointee_ *) | ينشئ مؤشرًا ضعيفًا إلى الكائن المعطى. |
| [WeakPtr](./weakptr/)(const SmartPtr_\&) | ينشئ مؤشرًا ضعيفًا يشير إلى نفس المؤشر الذي يشير إليه ptr. |
| [WeakPtr](./weakptr/)(const SmartPtr\<Q\>\&) | ينشئ مؤشرًا ضعيفًا يشير إلى نفس المؤشر الذي يشير إليه x. |
| [WeakPtr](./weakptr/)(const WeakPtr_\&) | ينشئ مؤشرًا ضعيفًا بنسخة بنائية. |
| [WeakPtr](./weakptr/)(const WeakPtr\<Q\>\&) | ينشئ مؤشرًا ضعيفًا بنسخة بنائية. |
| [WeakPtr](./weakptr/)(SmartPtr_\&&) | ينشئ مؤشرًا ضعيفًا بنقل بنائي. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Pointee_](./pointee_/) | نوع المؤشر إليه. |
| [SmartPtr_](./smartptr_/) | اسم مستعار للفئة [SmartPtr](../smartptr/) المقابلة. |
| [WeakPtr_](./weakptr_/) | اسم مستعار لنوع الذات. |

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
