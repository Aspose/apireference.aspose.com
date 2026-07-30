---
title: "System::Collections::Generic::KeyValuePair فئة"
linktitle: "KeyValuePair"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::KeyValuePair فئة. زوج من المفتاح والقيمة. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
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
| [GetHashCode](./gethashcode/)() const | يحسب تجزئة زوج المفتاح والقيمة عن طريق XOR لتجزئات المفتاح والقيمة. |
| [IsNull](./isnull/)() const | دائمًا تُعيد false. |
| [KeyValuePair](./keyvaluepair/)() | مُهيئ زوج المفتاح والقيمة الفارغ. |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | المُنشئ. |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | منشئ تحويل النوع. |
| [operator<](./operator_/)(const KeyValuePair\&) const | تصحيح للفئات الموروثة من [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/)، لا يقارن شيئًا. |
| [ToString](./tostring/)() const | يحوّل زوج المفتاح والقيمة إلى سلسلة. |

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
