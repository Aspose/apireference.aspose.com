---
title: "System::Uri::HexUnescape Methode"
linktitle: "HexUnescape"
second_title: "Aspose.Font für C++"
description: "System::Uri::HexUnescape Methode. Wandelt die angegebene hexadezimale Darstellung eines Zeichens in ein Zeichen um in C++."
type: docs
weight: 4000
url: /de/cpp/system/uri/hexunescape/
---
## Uri::HexUnescape method


Wandelt die angegebene hexadezimale Darstellung eines Zeichens in ein Zeichen um.

```cpp
static char16_t System::Uri::HexUnescape(const String &pattern, int32_t &index)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Muster | const String\& | Eine Zeichenkette, die die hexadezimale Darstellung eines Zeichens enthält |
| Index | int32_t\& | Die Position in **pattern**, an der die hexadezimale Darstellung eines Zeichens beginnt |

### ReturnValue

Das Zeichen, das durch die hexadezimale Kodierung an Position **index** dargestellt wird. Wenn das Zeichen an **index** nicht hexadezimal kodiert ist, wird das Zeichen an **index** zurückgegeben. Der Wert von **index** wird erhöht, um auf das Zeichen nach dem zurückgegebenen Zeichen zu zeigen.

## Siehe auch

* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
