---
title: "System::Globalization::DateTimeStyles enum"
linktitle: "DateTimeStyles"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::DateTimeStyles enum. Definieert opties voor datum- en tijdopmaak. Bit-vlaggen in C++."
type: docs
weight: 3500
url: /nl/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


Definieert opties voor datum- en tijdopmaak. Bit‑vlaggen.

```cpp
enum class DateTimeStyles : int32_t
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| None | 0 | Standaard. |
| AllowLeadingWhite | 1 | Negeer leidende witruimtes. |
| AllowTrailingWhite | 2 | Negeer volgende witruimtes. |
| AllowInnerWhite | 4 | Negeer binnenste spaties. |
| AllowWhiteSpaces | n/a | Negeer alle spaties. |
| NoCurrentDateDefault | 8 | Bij het parseren van een datum/tijd‑string, als alle jaar/maand/dag ontbreken, stel de standaarddatum in op 0001/1/1, in plaats van het huidige jaar/maand/dag. |
| AdjustToUniversal | 16 | Bij het parseren van een datum/tijd‑string, als een tijdzone‑specificatie (\"GMT\",\"Z\",\"+xxxx\",\"-xxxx\" bestaat), passen we de geparseerde tijd aan op basis van GMT. |
| AssumeLocal | 32 | Als er geen tijdzone is opgegeven, gebruik dan de lokale tijdzone. |
| AssumeUniversal | 64 | Als er geen tijdzone is opgegeven, gebruik dan UTC. |
| RoundtripKind | 128 | Probeer te behouden of de invoer ongespecificeerd, lokaal of UTC is. |

## Zie ook

* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
