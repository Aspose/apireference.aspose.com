---
title: "فئة System::DynamicWeakPtr::Reference"
linktitle: "Reference"
second_title: "Aspose.Font لـ C++"
description: "فئة System::DynamicWeakPtr::Reference. فئة مرجعية تضمن استدعاء DynamicWeakPtr::Apply. تُستخدم إذا تم تمرير DynamicWeakPtr كمعامل مرجع SmartPtr إلى دالة قد تُعيد تعيينه في C++."
type: docs
weight: 700
url: /ar/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | عامل التحويل. يسمح باستخدام [Reference](./) في السياقات التي يُحتاج فيها إلى [DynamicWeakPtr_](../dynamicweakptr_/). |
| [Reference](./reference/)(DynamicWeakPtr_\&) | ينشئ مرجع المؤشر الذكي. |
| [Reference](./reference/)(Reference\&&) | يبني مرجع المؤشر الذكي بنقل. |
| [~Reference](./~reference/)() | يدمر المرجع. يضمن استدعاء Apply() على المؤشر الذكي المشار إليه. |
## انظر أيضًا

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
