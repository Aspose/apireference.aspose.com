---
title: "طريقة System::Collections::Generic::operator=="
linktitle: "operator=="
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Collections::Generic::operator==. يقارن زوجي مفتاح-قيمة باستخدام دلالة ''equals''. يستخدم العامل == أو طريقة EqualsTo لكل من المفاتيح والقيم، أيًا كان معرفًا في C++."
type: docs
weight: 5600
url: /ar/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


يقارن زوجي مفتاح-قيمة باستخدام دلالة 'equals'. يستخدم العامل == أو طريقة EqualsTo لكل من المفاتيح والقيم، أيًا كان معرفًا.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| Parameter | الوصف |
| --- | --- |
| TKey | نوع المفتاح. |
| TValue | نوع القيمة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| يسار | const KeyValuePair\<TKey, TValue\>\& | المعامل LHS. |
| يمين | const KeyValuePair\<TKey, TValue\>\& | المعامل RHS. |

### ReturnValue

صحيح إذا تطابقت المفاتيح والقيم، خطأ خلاف ذلك.

## انظر أيضًا

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
