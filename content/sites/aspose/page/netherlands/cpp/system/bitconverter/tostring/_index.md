---
title: "System::BitConverter::ToString methode"
linktitle: "ToString"
second_title: "Aspose.Page voor C++"
description: "System::BitConverter::ToString methode. Converteert alle waarden van de opgegeven byte-array naar hun hexadecimale tekenreeksrepresentatie. Hoofdlettergebruik voor letters in de hexadecimale notatie en scheidingsteken dat tussen elk paar aangrenzende bytes wordt ingevoegd, worden gespecificeerd via de overeenkomstige argumenten in C++."
type: docs
weight: 1200
url: /nl/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


Converteert alle waarden van de opgegeven byte-array naar hun hexadecimale tekenreeksrepresentatie. Hoofdlettergebruik voor letters in de hexadecimale notatie en de scheidingsteken dat tussen elk paar aangrenzende bytes wordt ingevoegd, worden gespecificeerd via de overeenkomstige argumenten.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) die bytes bevat om te converteren |
| hoofdletters | bool | Specificeert de hoofdlettervorm van letters die in de resulterende hexadecimale representatie worden gebruikt |
| separator | const String\& | Een tekenreeks die wordt gebruikt als scheidingsteken, ingevoegd tussen elk paar aangrenzende bytes in de resulterende tekenreeks |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## Zie ook

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


Converteert waarden van de opgegeven byte-array naar hun hexadecimale tekenreeksrepresentatie, beginnend op de opgegeven index.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) die bytes bevat om te converteren |
| startIndex | int | Index in de opgegeven array waarop de conversie moet beginnen |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Zie ook

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


Converteert een bereik van waarden van de opgegeven byte-array naar hun hexadecimale tekenreeksrepresentatie.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) die bytes bevat om te converteren |
| startIndex | int | Index in de opgegeven array waarop het bereik van de te converteren byte-array‑elementen begint |
| lengte | int | De lengte van het bereik van de byte-array‑elementen die moeten worden geconverteerd |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Zie ook

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
