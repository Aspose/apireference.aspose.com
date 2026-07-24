---
title: "System::Char::IsSurrogatePair methode"
linktitle: "IsSurrogatePair"
second_title: "Aspose.Page voor C++"
description: "System::Char::IsSurrogatePair-methode. Bepaalt of de twee opgegeven tekens een UTF-16-surrogatenpaar vormen in C++."
type: docs
weight: 1700
url: /nl/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


Bepaalt of de twee opgegeven tekens een UTF-16 surrogate-paar vormen.

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| highSurrogate | char_t | Een teken dat wordt getest op een hoge surrogaat |
| lowSurrogate | char_t | Een teken dat wordt getest op een lage surrogaat |

### ReturnValue

True als de opgegeven tekens een surrogatenpaar vormen, anders - false

## Zie ook

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


Bepaalt of twee opeenvolgende tekens in de opgegeven tekenbuffer een surrogate-paar vormen.

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const String\& | Een string |
| index | int | Een nulgebaseerde index in de opgegeven buffer waarop de te testen tekenreeks begint |

### ReturnValue

True als de opgegeven tekens een surrogatenpaar zijn, anders - false

## Zie ook

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
