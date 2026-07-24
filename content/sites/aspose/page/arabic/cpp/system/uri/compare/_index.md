---
title: "طريقة System::Uri::Compare"
linktitle: "Compare"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Uri::Compare. تقارن كائنات Uri المحددة باستخدام قواعد المقارنة المحددة في C++."
type: docs
weight: 3500
url: /ar/cpp/system/uri/compare/
---
## Uri::Compare method


تقارن كائنات [Uri](../) المحددة باستخدام قواعد المقارنة المحددة.

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| uri1 | const SharedPtr\\<Uri\\>\\& | المقارنة الأولى |
| uri2 | const SharedPtr\\<Uri\\>\\& | المقارنة الثانية |
| partsToCompare | UriComponents | يحدد الأجزاء من **uri1** و **uri2** للمقارنة |
| compareFormat | UriFormat | يحدد هروب الأحرف المستخدم عند مقارنة مكونات عناوين URI |
| comparisonType | StringComparison | إحدى قيم [StringComparison](../../stringcomparison/) |

### ReturnValue

قيمة سالبة إذا كان **uri1** أصغر من **uri2**؛ 0 إذا كان uri1 و uri2 متساويين؛ قيمة موجبة إذا كان **uri1** أكبر من **uri2**

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
