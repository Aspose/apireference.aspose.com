---
title: "الفئة System::Collections::Generic::_KeyList"
linktitle: "_KeyList"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Collections::Generic::_KeyList. تنفّذ قائمة مفاتيح القاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.collections.generic/_keylist/
---
## _KeyList class


تنفّذ قائمة مفاتيح القاموس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| Parameter | الوصف |
| --- | --- |
| Dict | [Dictionary](../dictionary/) نوع. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | يُهيئ مجموعة تُشير إلى القاموس المحدد. |
| [Contains](./contains/)(const TKey\&) const override | يتحقق مما إذا كان المفتاح المحدد موجودًا في المجموعة. |
| [idx_get](./idx_get/)(int) const override | يحصل على المفتاح في الموضع المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [TKey](./tkey/) | نوع المفتاح. |

## انظر أيضًا

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
