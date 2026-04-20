---
title: "طريقة System::Uri::MakeRelative"
linktitle: "MakeRelative"
second_title: "Aspose.Font لـ C++"
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


| معامل | نوع | الوصف |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | معرف URI للمقارنة مع الـ URI الحالي |

### ReturnValue

إذا كان اسم المضيف والمخطط للـ URIs التي يمثلها الكائن الحالي و **toUri** متطابقين، فإن هذه الطريقة تُرجع [String](../../string/) يمثل [Uri](../) نسبيًا، وعند إلحاقه بمثيل الـ URI الحالي ينتج **toUri**. إذا كان اسم المضيف أو المخطط مختلفًا، فإن هذه الطريقة تُرجع [String](../../string/) يمثل المعامل **uri**.

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
