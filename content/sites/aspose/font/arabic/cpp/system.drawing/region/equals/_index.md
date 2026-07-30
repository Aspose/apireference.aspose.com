---
title: "طريقة System::Drawing::Region::Equals"
linktitle: "يساوي"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Drawing::Region::Equals. تحدد ما إذا كانت المنطقة المحددة مطابقة تمامًا للمنطقة التي يمثلها الكائن الحالي على سطح الرسم المحدد في C++."
type: docs
weight: 600
url: /ar/cpp/system.drawing/region/equals/
---
## Region::Equals method


يحدد ما إذا كانت المنطقة المحددة مطابقة للمنطقة التي يمثلها الكائن الحالي على سطح الرسم المحدد.

```cpp
bool System::Drawing::Region::Equals(const SharedPtr<Region> &r, const SharedPtr<Graphics> &g)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| r | const SharedPtr\<Region\>\& | المنطقة التي تُقارن بها هذه المنطقة |
| g | const SharedPtr\<Graphics\>\& | سطح رسم |

### ReturnValue

صحيح إذا كان داخل المنطقة المحددة مطابقًا لداخل المنطقة التي يمثلها الكائن الحالي عند تطبيق التحويل المرتبط بالمعامل **g**؛ وإلا - خطأ

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../)
* Class [Graphics](../../graphics/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
