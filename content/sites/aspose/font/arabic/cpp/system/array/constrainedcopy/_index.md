---
title: "طريقة System::Array::ConstrainedCopy"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Font لـ C++"
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


| معامل | الوصف |
| --- | --- |
| SrcType | نوع العناصر في المصفوفة المصدر |
| DstType | نوع العناصر في المصفوفة الوجهة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | المصفوفة المصدر |
| srcIndex | int64_t | الفهرس في المصفوفة المصدر الذي يحدد بداية نطاق العناصر التي سيتم نسخها |
| dstArray | const ArrayPtr\<DstType\>\& | المصفوفة الوجهة |
| dstIndex | int64_t | الفهرس في المصفوفة الوجهة لبدء إدراج العناصر المنسوخة |
| count | int64_t | عدد العناصر التي سيتم نسخها |
## ملاحظات


تنفيذ أولي مؤقت بدون أي تعديلات!
## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
