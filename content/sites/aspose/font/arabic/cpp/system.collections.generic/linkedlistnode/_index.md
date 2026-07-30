---
title: "فئة System::Collections::Generic::LinkedListNode"
linktitle: "LinkedListNode"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::LinkedListNode. عقدة من القائمة المرتبطة. تنفّذ غلافًا حول مكرّر std::list الذي يُغلف في القائمة المرتبطة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3200
url: /ar/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


عقدة من القائمة المرتبطة. تنفّذ غلافًا حول مكرّر std::list الذي يُغلف في القائمة المرتبطة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة المخزنة. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_List](./get_list/)() const | يحصل على القائمة المحتوية. |
| [get_Next](./get_next/)() const | يحصل على العقدة التالية. |
| [get_Previous](./get_previous/)() const | يحصل على العقدة السابقة. |
| [get_Value](./get_value/)() const | يحصل على القيمة المخزنة. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | المُنشئ. |
| [set_Value](./set_value/)(const T\&) | يضبط القيمة المخزنة. |

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
