---
title: "System::Uri::Compare metodo"
linktitle: "Compare"
second_title: "Aspose.Font per C++"
description: "System::Uri::Compare metodo. Confronta gli oggetti Uri specificati utilizzando le regole di confronto specificate in C++."
type: docs
weight: 3500
url: /it/cpp/system/uri/compare/
---
## Uri::Compare method


Confronta gli oggetti [Uri](../) specificati utilizzando le regole di confronto specificate.

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | Il primo comparando |
| uri2 | const SharedPtr\<Uri\>\& | Il secondo comparando |
| partsToCompare | UriComponents | Specifica le parti di **uri1** e **uri2** da confrontare |
| compareFormat | UriFormat | Specifica la codifica dei caratteri utilizzata quando i componenti degli URI vengono confrontati |
| comparisonType | StringComparison | Uno dei valori [StringComparison](../../stringcomparison/) |

### ReturnValue

Un valore negativo se **uri1** è minore di **uri2**; 0 se uri1 e uri2 sono uguali; un valore positivo se **uri1** è maggiore di **uri2**

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
