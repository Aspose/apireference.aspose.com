---
title: "فئة System::Collections::Generic::_KeyCollection"
linktitle: "_KeyCollection"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::_KeyCollection. مجموعة مفاتيح القاموس. تُشير إلى المجموعة دون نسخ أي شيء. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


مجموعة مفاتيح [Dictionary](../dictionary/). تُشير إلى المجموعة دون نسخ أي شيء. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | يُهيئ مجموعة تُشير إلى القاموس المحدد. |
| [Contains](./contains/)(const TKey\&) const override | يتحقق مما إذا كان العنصر موجودًا في الحاوية. |
| [GetEnumerator](./getenumerator/)() override | يحصل على المُعدِّد الذي يتنقل عبر المفاتيح. |
| [idx_get](./idx_get/)(int) const override | تنفّذ طريقة [IList](../ilist/). غير مدعومة. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [TKey](./tkey/) | نوع المفتاح. |

## انظر أيضًا

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
