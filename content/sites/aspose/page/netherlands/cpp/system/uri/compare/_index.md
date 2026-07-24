---
title: "System::Uri::Compare methode"
linktitle: "Compare"
second_title: "Aspose.Page voor C++"
description: "System::Uri::Compare methode. Vergelijkt de opgegeven Uri-objecten met behulp van de opgegeven vergelijkingsregels in C++."
type: docs
weight: 3500
url: /nl/cpp/system/uri/compare/
---
## Uri::Compare method


Vergelijkt de opgegeven [Uri](../) objecten met behulp van de opgegeven vergelijkingsregels.

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| uri1 | const SharedPtr\\<Uri\\>\\& | De eerste operand |
| uri2 | const SharedPtr\\<Uri\\>\\& | De tweede operand |
| partsToCompare | UriComponents | Specificeert de delen van **uri1** en **uri2** om te vergelijken |
| compareFormat | UriFormat | Specificeert de teken-escaping die wordt gebruikt wanneer componenten van URI's worden vergeleken |
| comparisonType | StringComparison | Een van de [StringComparison](../../stringcomparison/) waarden |

### ReturnValue

Een negatieve waarde als **uri1** kleiner is dan **uri2**; 0 als uri1 en uri2 gelijk zijn; een positieve waarde als **uri1** groter is dan **uri2**

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
