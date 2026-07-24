---
title: "طريقة System::Uri::MakeRelative"
linktitle: "MakeRelative"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Uri::MakeRelative. تحدد الفرق بين مثالي Uri في C++."
type: docs
weight: 3000
url: /ar/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


تحدد الفرق بين مثالي [Uri](../).

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| toUri | const SharedPtr\\<Uri\\>\\& | معرف URI للمقارنة مع URI الحالي |

### ReturnValue

إذا كان اسم المضيف والبروتوكول للـ URIs التي يمثلها الكائن الحالي و **toUri** متطابقين، فإن هذه الطريقة تُرجع [String](../../string/) يمثل [Uri](../) نسبي، عند إلحاقه بمثيل URI الحالي، ينتج **toUri**. إذا كان اسم المضيف أو البروتوكول مختلفًا، فإن هذه الطريقة تُرجع [String](../../string/) يمثل المعامل **uri**.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
