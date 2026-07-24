---
title: "System::Uri::MakeRelativeUri method"
linktitle: "MakeRelativeUri"
second_title: "Aspose.Page لـ C++"
description: "System::Uri::MakeRelativeUri method. يحدد الفرق بين عناوين URI التي تمثلها الكائنات الحالية والمحددة من نوع Uri في C++."
type: docs
weight: 3100
url: /ar/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


يحدد الفرق بين عناوين URI التي تمثلها الكائنات الحالية والمحددة [Uri](../).

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| uri | const SharedPtr\\<Uri\\>\\& | المقارن |

### ReturnValue

إذا كان اسم المضيف والبروتوكول لعناوين URI التي تمثلها الكائن الحالي و **toUri** متطابقين، فإن هذه الطريقة تُرجع [Uri](../) نسبية، والتي عند إلحاقها بنسخة URI الحالية تُنتج **toUri**. إذا كان اسم المضيف أو البروتوكول مختلفًا، فإن هذه الطريقة تُرجع كائن [Uri](../) يمثل المعامل **uri**.

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
