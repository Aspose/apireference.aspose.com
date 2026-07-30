---
title: "طريقة System::With"
linktitle: "With"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::With. تستنسخ سجل الإشارة وتطبّق الدالة المبدئية عليه في C++."
type: docs
weight: 40200
url: /ar/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


تستنسخ سجل الإشارة وتطبّق الدالة المبدئية عليه.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| معامل | الوصف |
| --- | --- |
| T | نوع السجل لاستنساخه. |
| A | نوع الدالة المبدئية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| سجل | const SharedPtr\<T\>\& | مؤشر مشترك إلى الكائن المراد استنساخه وتهيئته. |
| المهيئ | const A\& | يتم تطبيق دالة التهيئة على نسخة السجل. |

### ReturnValue

مؤشر مشترك إلى السجل المستنسخ.

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::With(const T\&, const A\&) method


ينسخ هيكل السجل ويطبق دالة المهيئ عليه.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| معامل | الوصف |
| --- | --- |
| T | نوع السجل للنسخ. |
| A | نوع الدالة المبدئية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| سجل | const T\& | السجل للنسخ والتهيئة. |
| المهيئ | const A\& | يتم تطبيق دالة التهيئة على نسخة السجل. |

### ReturnValue

السجل المنسوخ.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
