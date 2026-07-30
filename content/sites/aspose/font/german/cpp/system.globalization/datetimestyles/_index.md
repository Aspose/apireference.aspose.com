---
title: "System::Globalization::DateTimeStyles enum"
linktitle: "DateTimeStyles"
second_title: "Aspose.Font für C++"
description: "System::Globalization::DateTimeStyles enum. Definiert Optionen zur Datums- und Zeitformatierung. Bit‑Flags in C++."
type: docs
weight: 3500
url: /de/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


Definiert Optionen für Datums- und Zeitformatierung. Bit‑Flags.

```cpp
enum class DateTimeStyles : int32_t
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Keine | 0 | Standard. |
| AllowLeadingWhite | 1 | Ignoriere führende Leerzeichen. |
| AllowTrailingWhite | 2 | Ignoriere nachfolgende Leerzeichen. |
| AllowInnerWhite | 4 | Ignoriere innere Leerzeichen. |
| AllowWhiteSpaces | n/a | Ignoriere alle Leerzeichen. |
| NoCurrentDateDefault | 8 | Beim Parsen einer Datums-/Uhrzeitzeichenfolge, wenn Jahr/Monat/Tag alle fehlen, setze das Standarddatum auf 0001/1/1, anstatt des aktuellen Jahres/Monats/Tages. |
| AdjustToUniversal | 16 | Beim Parsen einer Datums-/Uhrzeitzeichenfolge, wenn ein Zeitzonenangabe (\"GMT\",\"Z\",\"+xxxx\",\"-xxxx\") vorhanden ist, passen wir die geparste Zeit an GMT an. |
| AssumeLocal | 32 | Wenn keine Zeitzone angegeben ist, verwende die lokale Zeitzone. |
| AssumeUniversal | 64 | Wenn keine Zeitzone angegeben ist, verwende UTC. |
| RoundtripKind | 128 | Versuche beizubehalten, ob die Eingabe nicht angegeben, lokal oder UTC ist. |

## Siehe auch

* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
