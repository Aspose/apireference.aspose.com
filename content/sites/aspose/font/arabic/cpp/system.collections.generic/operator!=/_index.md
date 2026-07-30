---
title: "طريقة System::Collections::Generic::operator!="
linktitle: "operator!="
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Collections::Generic::operator!=. يقارن زوجي مفتاح-قيمة باستخدام دلالة ''equals'' العكسية في C++."
type: docs
weight: 5300
url: /ar/cpp/system.collections.generic/operator!=/
---
## System::Collections::Generic::operator!= method


يقارن زوجي مفتاح-قيمة باستخدام دلالة 'equals' العكسية.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator!=(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
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

صحيح إذا لم تتطابق المفاتيح والقيم، خطأ بخلاف ذلك.

## انظر أيضًا

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
