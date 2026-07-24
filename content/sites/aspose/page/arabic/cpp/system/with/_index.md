---
title: "طريقة System::With"
linktitle: "مع"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::With. تنسخ سجل المرجع وتطبق دالة التهيئة عليه في C++."
type: docs
weight: 40100
url: /ar/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


تنسخ سجل المرجع وتطبق دالة التهيئة عليه.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع السجل المراد نسخه. |
| A | نوع دالة التهيئة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| record | const SharedPtr\<T\>\& | مؤشر مشترك إلى الكائن المراد نسخه وتهيئته. |
| المهيئ | const A\& | دالة التهيئة التي تُطبّق على نسخة السجل. |

### ReturnValue

مؤشر مشترك إلى سجل مستنسخ.

## انظر أيضًا

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


ينسخ سجل البنية ويطبق المُهيئ الدالي عليه.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع السجل للنسخ. |
| A | نوع دالة التهيئة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| record | const T\& | السجل للنسخ والتهيئة. |
| المهيئ | const A\& | يتم تطبيق المُهيئ الدالي على نسخة السجل. |

### ReturnValue

السجل المنسوخ.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
