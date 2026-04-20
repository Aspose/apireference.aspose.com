---
title: "طريقة System::Uri::Compare"
linktitle: "Compare"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Uri::Compare. تُقارن كائنات Uri المحددة باستخدام قواعد المقارنة المحددة في C++."
type: docs
weight: 3500
url: /ar/cpp/system/uri/compare/
---
## Uri::Compare method


تُقارن كائنات [Uri](../) المحددة باستخدام قواعد المقارنة المحددة.

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | المقارن الأول |
| uri2 | const SharedPtr\<Uri\>\& | المقارن الثاني |
| partsToCompare | UriComponents | يحدد أجزاء **uri1** و **uri2** للمقارنة |
| compareFormat | UriFormat | يحدد هروب الأحرف المستخدم عند مقارنة مكونات عناوين URI |
| comparisonType | StringComparison | واحد من قيم [StringComparison](../../stringcomparison/) |

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
* Library [Aspose.Font for C++](../../../)
