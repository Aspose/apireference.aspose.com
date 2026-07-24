---
title: "الفئة System::Collections::Generic::KeyValuePair"
linktitle: "KeyValuePair"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Generic::KeyValuePair. زوج من المفتاح والقيمة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 2900
url: /ar/cpp/system.collections.generic/keyvaluepair/
---
## KeyValuePair class


زوج من المفتاح والقيمة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](../../system/smartptr/) لإدارة كائنات هذا النوع.

```cpp
template<typename TKey,typename TValue>class KeyValuePair
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Key](./get_key/)() const | يحصل على المفتاح. |
| [get_Value](./get_value/)() const | يحصل على القيمة. |
| [GetHashCode](./gethashcode/)() const | يحسب تجزئة زوج المفتاح والقيمة عبر XOR تجزئات المفتاح والقيمة. |
| [IsNull](./isnull/)() const | دائمًا ما تُعيد false. |
| [KeyValuePair](./keyvaluepair/)() | مُهيئ زوج المفتاح والقيمة الفارغ. |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | منشئ. |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | منشئ تحويل النوع. |
| [operator<](./operator_/)(const KeyValuePair\&) const | تصحيح للفئات الموروثة من [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/)، لا يقارن شيئاً. |
| [ToString](./tostring/)() const | يحول زوج المفتاح والقيمة إلى سلسلة. |

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
