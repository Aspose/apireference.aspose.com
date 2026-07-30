---
title: "System::Collections::Generic::_ValueList فئة"
linktitle: "_ValueList"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::_ValueList فئة. يُنفّذ قائمة قيم القاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


يُنفّذ قائمة قيم القاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| معامل | الوصف |
| --- | --- |
| Dict | [Dictionary](../dictionary/) نوع. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | يُهيئ مجموعة تُشير إلى القاموس المحدد. |
| virtual [idx_get](./idx_get/)(int) const | يحصل على القيمة في الموضع المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [TValue](./tvalue/) | نوع القيمة. |

## انظر أيضًا

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
