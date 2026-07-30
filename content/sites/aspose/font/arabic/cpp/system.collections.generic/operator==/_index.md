---
title: "System::Collections::Generic::operator== طريقة"
linktitle: "operator=="
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::operator== طريقة. يقارن زوجين من المفتاح والقيمة باستخدام دلالات ''equals''. يستخدم العامل == أو طريقة EqualsTo لكل من المفاتيح والقيم، أيًا كان معرفًا في C++."
type: docs
weight: 5600
url: /ar/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


يقارن زوجين من المفتاح والقيمة باستخدام دلالات 'equals'. يستخدم العامل == أو طريقة EqualsTo لكل من المفاتيح والقيم، أيًا كان معرفًا.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| معامل | الوصف |
| --- | --- |
| TKey | نوع المفتاح. |
| TValue | نوع القيمة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| يسار | const KeyValuePair\<TKey, TValue\>\& | المعامل LHS. |
| يمين | const KeyValuePair\<TKey, TValue\>\& | المعامل RHS. |

### ReturnValue

صحيح إذا تطابقت كل من المفاتيح والقيم، خطأ خلاف ذلك.

## انظر أيضًا

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
