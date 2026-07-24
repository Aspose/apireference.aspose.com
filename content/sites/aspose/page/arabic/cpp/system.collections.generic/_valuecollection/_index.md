---
title: "الفئة System::Collections::Generic::_ValueCollection"
linktitle: "_ValueCollection"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Collections::Generic::_ValueCollection. مجموعة قيم القاموس Dictionary. تُشير إلى مجموعة دون نسخ أي شيء. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.collections.generic/_valuecollection/
---
## _ValueCollection class


مجموعة قيم [Dictionary](../dictionary/). تُشير إلى مجموعة دون نسخ أي شيء. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename Dict>class _ValueCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::mapped_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [_ValueCollection](./_valuecollection/)(const typename Dict::Ptr\&) | يُهيئ مجموعة تُشير إلى القاموس المحدد. |
| [Contains](./contains/)(const TValue\&) const override | يتحقق مما إذا كان العنصر موجودًا في الحاوية. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المكرّر الذي يتنقل عبر القيم. |
| [idx_get](./idx_get/)(int) const override | ينفّذ طريقة [IList](../ilist/). غير مدعومة. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يسترجع تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يسترجع تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يسترجع تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يسترجع تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [TValue](./tvalue/) | نوع القيمة. |

## انظر أيضًا

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
