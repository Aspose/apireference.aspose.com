---
title: "System::BitConverter::ToString method"
linktitle: "ToString"
second_title: "Aspose.Page för C++"
description: "System::BitConverter::ToString method. Konverterar alla värden i den angivna bytearrayen till deras hexadecimala strängrepresentation. Versal eller gemen bokstav att använda i den hexadecimala notationen samt separator som infogas mellan varje par av intilliggande bytes specificeras via motsvarande argument i C++."
type: docs
weight: 1200
url: /sv/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


Konverterar alla värden i den angivna bytearrayen till deras hexadecimala strängrepresentation. Versal-/gemener för bokstäver i den hexadecimala notationen samt separatorn som sätts in mellan varje par av intilliggande byte specificeras via motsvarande argument.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) som innehåller byte att konvertera |
| versaler | bool | Anger vilken bokstavsstil som ska användas i den resulterande hexadecimala representationen |
| avgränsare | const String\& | En sträng som används som separator och infogas mellan varje par av intilliggande bytes i den resulterande strängen |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## Se även

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


Konverterar värden i den angivna bytearrayen till deras hexadecimala strängrepresentation med start vid angivet index.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) som innehåller byte att konvertera |
| startIndex | int | Index i den angivna arrayen där konverteringen ska börja |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Se även

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


Konverterar ett intervall av värden i den angivna bytearrayen till deras hexadecimala strängrepresentation.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | [Array](../../array/) som innehåller byte att konvertera |
| startIndex | int | Index i den angivna arrayen där intervallet av bytearray‑element som ska konverteras börjar |
| längd | int | Längden på intervallet av bytearray‑element som ska konverteras |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Se även

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
