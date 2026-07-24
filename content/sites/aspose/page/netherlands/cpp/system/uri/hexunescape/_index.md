---
title: "System::Uri::HexUnescape methode"
linktitle: "HexUnescape"
second_title: "Aspose.Page voor C++"
description: "System::Uri::HexUnescape methode. Converteert de opgegeven hexadecimale representatie van een teken naar een teken in C++."
type: docs
weight: 4000
url: /nl/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


Converteert de opgegeven hexadecimale weergave van een teken naar een teken.

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| patroon | const String\& | Een tekenreeks die de hexadecimale representatie van een teken bevat |
| index | int32_t\& | De positie in **pattern** waar de hexadecimale representatie van een teken begint |

### ReturnValue

Het teken dat wordt weergegeven door de hexadecimale codering op positie **index**. Als het teken op **index** niet hexadecimaal gecodeerd is, wordt het teken op **index** geretourneerd. De waarde van **index** wordt verhoogd zodat deze naar het teken na het geretourneerde teken wijst.

## Zie ook

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
