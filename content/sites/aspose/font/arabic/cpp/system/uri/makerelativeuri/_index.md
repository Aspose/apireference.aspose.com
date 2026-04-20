---
title: "طريقة System::Uri::MakeRelativeUri"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Uri::MakeRelativeUri. تحدد الفرق بين عناوين URI الممثَّلة بواسطة الكائن الحالي والكائنات Uri المحددة في C++."
type: docs
weight: 3100
url: /ar/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


تحدد الفرق بين عناوين URI الممثَّلة بواسطة الكائن الحالي والكائنات [Uri](../) المحددة.

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | المقارن |

### ReturnValue

إذا كان اسم المضيف ومخطط (scheme) عناوين URI الممثَّلة بواسطة الكائن الحالي و **toUri** متطابقين، فإن هذه الطريقة تُعيد [Uri](../) نسبيًا، والذي عند إلحاقه بنسخة URI الحالية ينتج **toUri**. إذا كان اسم المضيف أو المخطط مختلفًا، فإن هذه الطريقة تُعيد كائن [Uri](../) يمثل المعامل **uri**.

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
