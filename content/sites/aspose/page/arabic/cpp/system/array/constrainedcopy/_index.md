---
title: "طريقة System::Array::ConstrainedCopy"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Array::ConstrainedCopy. تنسخ مجموعة من العناصر من System.Array بدءًا من المصدر المحدد في C++."
type: docs
weight: 4700
url: /ar/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


تنسخ مجموعة من العناصر من [System.Array](../) بدءًا من المصدر المحدد.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | الوصف |
| --- | --- |
| SrcType | نوع العناصر في مصفوفة المصدر |
| DstType | نوع العناصر في مصفوفة الوجهة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | مصفوفة المصدر |
| srcIndex | int64_t | الفهرس في مصفوفة المصدر الذي يحدد بداية مجموعة العناصر التي سيتم نسخها |
| dstArray | const ArrayPtr\<DstType\>\& | مصفوفة الوجهة |
| dstIndex | int64_t | الفهرس في مصفوفة الوجهة لبدء إدراج العناصر المنسوخة |
| count | int64_t | عدد العناصر التي سيتم نسخها |
## ملاحظات


تنفيذ أولي مؤقت دون أي تعديلات!
## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
