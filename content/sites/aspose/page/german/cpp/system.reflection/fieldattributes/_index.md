---
title: "System::Reflection::FieldAttributes Enum"
linktitle: "Feldattribute"
second_title: "Aspose.Page für C++"
description: "System::Reflection::FieldAttributes-Enum. Reflektierte Feldattribute in C++."
type: docs
weight: 1200
url: /de/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


Reflektierte Feldattribute.

```cpp
enum class FieldAttributes
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Feldzugriffsmaske | 7 | Mitgliedszugriffsmaske. Verwenden Sie diese Maske, um Zugänglichkeitsinformationen abzurufen. |
| PrivaterBereich | 0 | Nicht referenzierbare Mitglieder. |
| Privat | 1 | Private Mitglieder. |
| FamANDAssem | 2 | Private und assembly-gebundene Mitglieder. |
| Assembly | 3 | Assembly-gebundene Mitglieder. |
| Family | 4 | Mitglieder, die über Typ und Untertypen zugänglich sind. |
| FamORAssem | 5 | Mitglieder, die über Typ, Untertypen und Assembly zugänglich sind. |
| Öffentlich | 6 | Mitglieder, die für jeden zugänglich sind. |
| Statisch | 16 | Statische Mitglieder im Gegensatz zu Instanzmitgliedern. |
| InitOnly | 32 | Konstante Mitglieder, die nur initialisiert, aber nicht geändert werden können. |
| Literal | 64 | Zur Compile-Zeit konstante Mitglieder. |
| NichtSerialisiert | 128 | Nicht serialisierte Mitglieder. |
| SpecialName | 512 | Spezialfeld eines der unten genannten Namen. |
| PinvokeImpl | 8192 | Interop weitergeleitete Implementierung. |
| ReservedMask | 38144 | Reservierte Flags nur für den Laufzeitgebrauch. |
| RTSpecialName | 1024 | Runtim sollte die Namenskodierung prüfen. |
| HasFieldMarshal | 4096 | Marshalling-Informationen sind vorhanden. |
| HasDefault | 32768 | Standardwert ist vorhanden. |
| HasFieldRVA | 256 | RVA ist vorhanden. |

## Siehe auch

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
