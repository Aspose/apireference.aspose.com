---
title: "System::Collections::Generic::IKVCollection فئة"
linktitle: "IKVCollection"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::IKVCollection فئة. واجهة الحاوية التي تحتوي على مفاتيح أو قيم الحاوية الشبيهة بالقاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2500
url: /ar/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


واجهة الحاوية التي تحتوي على مفاتيح أو قيم الحاوية الشبيهة بالقاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| معامل | الوصف |
| --- | --- |
| T | [KeyValuePair](../keyvaluepair/) نوع. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const T\&) override | يضيف عنصرًا إلى الحاوية. |
| [Clear](./clear/)() override | يحذف جميع العناصر من الحاوية. |
| [Contains](./contains/)(const T\&) const override | يتحقق مما إذا كان العنصر موجودًا في الحاوية. |
| virtual [get_Count](./get_count/)() const | يحصل على عدد العناصر في الحاوية. |
| [get_IsReadOnly](./get_isreadonly/)() const override | يتحقق مما إذا كانت الحاوية للقراءة فقط. |
| virtual [GetEnumerator](./getenumerator/)() | معلومات RTTI. |
| virtual [idx_get](./idx_get/)(int) const | دالة جلب. |
| [idx_set](./idx_set/)(int, T) override | دالة ضبط. |
| [IndexOf](./indexof/)(const T\&) const override | يحصل على فهرس العنصر في الحاوية. |
| [Insert](./insert/)(int, const T\&) override | يدرج العنصر في الموضع المحدد. |
| [Remove](./remove/)(const T\&) override | يزيل العنصر من الحاوية. |
| [RemoveAt](./removeat/)(int) override | يزيل العنصر في الموضع المحدد. |

## انظر أيضًا

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
