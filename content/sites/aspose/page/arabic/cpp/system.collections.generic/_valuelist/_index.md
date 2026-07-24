---
title: "الفئة System::Collections::Generic::_ValueList"
linktitle: "_ValueList"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Collections::Generic::_ValueList. تنفّذ قائمة قيم القاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


تنفّذ قائمة قيم القاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| Parameter | الوصف |
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
* Library [Aspose.Page for C++](../../)
