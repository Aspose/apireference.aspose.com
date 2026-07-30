---
title: "System::Uri::Compare Methode"
linktitle: "Compare"
second_title: "Aspose.Font für C++"
description: "System::Uri::Compare Methode. Vergleicht die angegebenen Uri-Objekte anhand der angegebenen Vergleichsregeln in C++."
type: docs
weight: 3500
url: /de/cpp/system/uri/compare/
---
## Uri::Compare method


Vergleicht die angegebenen [Uri](../)-Objekte anhand der angegebenen Vergleichsregeln.

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Der erste Operand |
| uri2 | const SharedPtr\<Uri\>\& | Der zweite Operand |
| partsToCompare | UriComponents | Gibt die Teile von **uri1** und **uri2** an, die verglichen werden sollen |
| compareFormat | UriFormat | Gibt die Zeichenescape‑Sequenz an, die beim Vergleich von URI‑Komponenten verwendet wird |
| comparisonType | StringComparison | Einer der Werte von [StringComparison](../../stringcomparison/) |

### ReturnValue

Ein negativer Wert, wenn **uri1** kleiner als **uri2** ist; 0, wenn uri1 und uri2 gleich sind; ein positiver Wert, wenn **uri1** größer als **uri2** ist

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
