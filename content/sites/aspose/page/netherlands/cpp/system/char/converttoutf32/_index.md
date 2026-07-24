---
title: "System::Char::ConvertToUtf32-methode"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Page voor C++"
description: "System::Char::ConvertToUtf32-methode. Converteert het opgegeven UTF-16-surrogatenpaar naar een UTF-32-code-eenheid in C++."
type: docs
weight: 200
url: /nl/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


Converteert het opgegeven UTF-16-surrogatenpaar naar een UTF-32-code-eenheid.

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| highSurrogate | char_t | De hoge surrogaat van het te converteren UTF-16-surrogatenpaar |
| lowSurrogate | char_t | De lage surrogaat van het te converteren UTF-16-surrogatenpaar |

### ReturnValue

Een UTF-32-code-eenheid die voortkomt uit de conversie

## Zie ook

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


Converteert de waarde van een UTF-16-gecodeerd teken of surrogatenpaar op een opgegeven positie in een string naar een UTF-32-code-eenheid.

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| s | const String\& | Een tekenreeks die een teken of surrogatenpaar bevat |
| index | int | De indexpositie van het teken of surrogatenpaar in de opgegeven tekenreeks |

### ReturnValue

Een UTF-32-code-eenheid die voortkomt uit de conversie

## Zie ook

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
