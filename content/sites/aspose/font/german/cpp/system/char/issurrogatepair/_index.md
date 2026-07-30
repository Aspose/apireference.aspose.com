---
title: "System::Char::IsSurrogatePair Methode"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Font für C++"
description: "System::Char::IsSurrogatePair Methode. Bestimmt, ob die beiden angegebenen Zeichen ein UTF-16-Surrogate-Paar bilden in C++."
type: docs
weight: 1700
url: /de/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Bestimmt, ob die beiden angegebenen Zeichen für ein UTF-16 Surrogate-Paar.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| highSurrogate | char_t | Ein Zeichen, das darauf getestet wird, ein High Surrogate zu sein |
| lowSurrogate | char_t | Ein Zeichen, das darauf getestet wird, ein Low Surrogate zu sein |

### ReturnValue

True, wenn die angegebenen Zeichen ein Surrogatpaar bilden, sonst - false

## Siehe auch

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


Bestimmt, ob zwei aufeinanderfolgende Zeichen im angegebenen Zeichenpuffer ein Surrogate-Paar bilden.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | Ein String |
| Index | int | Ein nullbasierter Index im angegebenen Puffer, an dem die zu testende Zeichenfolge beginnt |

### ReturnValue

True, wenn die angegebenen Zeichen ein Surrogatpaar sind, sonst - false

## Siehe auch

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
