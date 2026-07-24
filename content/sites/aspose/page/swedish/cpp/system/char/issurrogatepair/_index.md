---
title: "System::Char::IsSurrogatePair‑metoden"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Page för C++"
description: "System::Char::IsSurrogatePair‑metoden. Avgör om de två angivna tecknen bildar ett UTF-16‑surrogatpar i C++."
type: docs
weight: 1700
url: /sv/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Bestämmer om de två angivna tecknen utgör ett UTF-16‑surrogat‑par.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| highSurrogate | char_t | Ett tecken som testas för att vara en hög surrogat |
| lowSurrogate | char_t | Ett tecken som testas för att vara en låg surrogat |

### ReturnValue

Sant om de angivna tecknen bildar ett surrogatpar, annars - falskt

## Se även

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


Bestämmer om två på varandra följande tecken i den angivna teckenbufferten bildar ett surrogat‑par.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | const String\& | En sträng |
| index | int | Ett nollbaserat index i den angivna bufferten där teckensekvensen som ska testas börjar |

### ReturnValue

Sant om de angivna tecknen är ett surrogatpar, annars - falskt

## Se även

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
