---
title: "System::Reflection::FieldAttributes enum"
linktitle: "FieldAttributes"
second_title: "Aspose.Page voor C++"
description: "System::Reflection::FieldAttributes enum. Gereflecteerde veldattributen in C++."
type: docs
weight: 1200
url: /nl/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


Gereflecteerde veldattributen.

```cpp
enum class FieldAttributes
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| FieldAccessMask | 7 | Toegangsmasker voor leden. Gebruik dit masker om toegangsinformatie op te halen. |
| PrivateScope | 0 | Niet-referentieerbare leden. |
| Private | 1 | Private leden. |
| FamANDAssem | 2 | Private en assembly-gescopeerde leden. |
| Assembly | 3 | Assembly-gescopeerde leden. |
| Family | 4 | Leden toegankelijk via type en subtypes. |
| FamORAssem | 5 | Leden toegankelijk via type, subtypes en assembly. |
| Public | 6 | Leden toegankelijk voor iedereen. |
| Static | 16 | Statische leden in tegenstelling tot instantieleden. |
| InitOnly | 32 | Constante leden die alleen kunnen worden geïnitialiseerd maar niet gewijzigd. |
| Literal | 64 | Compile-tijd constante leden. |
| NotSerialized | 128 | Niet-geserializeerde leden. |
| SpecialName | 512 | Speciaal veld van een van de onderstaande namen. |
| PinvokeImpl | 8192 | Interop doorgestuurde implementatie. |
| ReservedMask | 38144 | Gereserveerde vlaggen alleen voor runtime-gebruik. |
| RTSpecialName | 1024 | Runtime moet naamcodering controleren. |
| HasFieldMarshal | 4096 | Marshallingsinformatie is aanwezig. |
| HasDefault | 32768 | Standaardwaarde is aanwezig. |
| HasFieldRVA | 256 | RVA is aanwezig. |

## Zie ook

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
