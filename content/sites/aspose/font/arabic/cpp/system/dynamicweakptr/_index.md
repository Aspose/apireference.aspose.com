---
title: "الفئة System::DynamicWeakPtr"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::DynamicWeakPtr. فئة مؤشر ذكي تتعقب أوضاع المؤشرات لمعلمات القالب للكائن المخزن وتحدّثها بعد كل إسناد. هذا النوع هو مؤشر لإدارة حذف كائن آخر. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت في C++."
type: docs
weight: 2200
url: /ar/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


فئة مؤشر ذكي تتعقب أوضاع المؤشرات للمعاملات القالبية للكائن المخزن وتحدّثها بعد كل إسناد. هذا النوع هو مؤشر لإدارة حذف كائن آخر. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| معامل | الوصف |
| --- | --- |
| Pointee | النوع. |
| trunkMode | وضع المؤشر الذكي نفسه، مشترك أو ضعيف. |
| weakLeafs | فهارس معطيات القالب للنوع المخزن التي يجب تعيينها إلى وضع المؤشر الضعيف. |
## Nested classes

* Class [Reference](./reference/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | ينشئ مؤشرًا ذكيًا فارغًا. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | ينشئ مؤشرًا ذكيًا يشير إلى الكائن المعطى. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | ينشئ نسخة بنائية من المؤشر الذكي. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | ينشئ نسخة بنائية من المؤشر الذكي. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | ينشئ نسخة بنائية من المؤشر الذكي. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | ينشئ نسخة بنائية من المؤشر الذكي باستخدام النقل. |
| [operator=](./operator=/)(SmartPtr_\&&) | ينفّذ إسنادًا نقليًا للمؤشر الذكي. |
| [operator=](./operator=/)(const SmartPtr_\&) | ينفّذ إسنادًا نسخيًا للمؤشر الذكي. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | ينفّذ إسنادًا نسخيًا للمؤشر الذكي. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | يُسند المؤشر الذكي. |
| [operator=](./operator=/)(std::nullptr_t) | يضبط المؤشر الذكي إلى قيمة فارغة. |
| [operator==](./operator==/)(std::nullptr_t) const | يتحقق مما إذا كان المؤشر الذكي null. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | اسم مستعار للنوع نفسه. |
| [Pointee_](./pointee_/) | نوع المؤشر إليه. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) اسم مستعار للفئة الأساسية. |

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
