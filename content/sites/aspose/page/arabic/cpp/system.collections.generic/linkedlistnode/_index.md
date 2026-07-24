---
title: "System::Collections::Generic::LinkedListNode فئة"
linktitle: "LinkedListNode"
second_title: "Aspose.Page لـ C++"
description: "System::Collections::Generic::LinkedListNode فئة. عقدة من القائمة المرتبطة. تنفّذ غلافًا فوق مُكرّر std::list الذي يُغلف في القائمة المرتبطة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل و/أو أعطال تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3200
url: /ar/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


عقدة من القائمة المرتبطة. تنفّذ غلافًا فوق مُكرّر std::list الذي يُغلف في القائمة المرتبطة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل و/أو أعطال تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة المخزنة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_List](./get_list/)() const | يحصل على القائمة المحتوية. |
| [get_Next](./get_next/)() const | يحصل على العقدة التالية. |
| [get_Previous](./get_previous/)() const | يحصل على العقدة السابقة. |
| [get_Value](./get_value/)() const | يحصل على القيمة المخزنة. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | منشئ. |
| [set_Value](./set_value/)(const T\&) | يضبط القيمة المخزنة. |

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
