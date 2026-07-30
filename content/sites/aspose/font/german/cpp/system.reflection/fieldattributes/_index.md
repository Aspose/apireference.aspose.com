---
title: "System::Reflection::FieldAttributes-Enum"
linktitle: "FieldAttributes"
second_title: "Aspose.Font für C++"
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
| FieldAccessMask | 7 | Maskierung des Member-Zugriffs. Verwenden Sie diese Maske, um Zugänglichkeitsinformationen abzurufen. |
| PrivateScope | 0 | Nicht referenzierbare Member. |
| Private | 1 | Private Member. |
| FamANDAssem | 2 | Private und assembly-gebundene Member. |
| Assembly | 3 | Assembly-gebundene Member. |
| Family | 4 | Member, die vom Typ und von Untertypen zugänglich sind. |
| FamORAssem | 5 | Member, die vom Typ, von Untertypen und von Assembly zugänglich sind. |
| Public | 6 | Member, die für jeden zugänglich sind. |
| Static | 16 | Statische Member im Gegensatz zu Instanz-Membern. |
| InitOnly | 32 | Konstante Member, die nur initialisiert, aber nicht geändert werden können. |
| Literal | 64 | Zur Compile-Zeit konstante Member. |
| NotSerialized | 128 | Nicht serialisierte Member. |
| SpecialName | 512 | Spezialfeld eines der unten genannten Namen. |
| PinvokeImpl | 8192 | Interop weitergeleitete Implementierung. |
| ReservedMask | 38144 | Reservierte Flags nur für die Laufzeit. |
| RTSpecialName | 1024 | Runtim sollte die Namenskodierung prüfen. |
| HasFieldMarshal | 4096 | Marshalling-Informationen sind vorhanden. |
| HasDefault | 32768 | Standardwert ist vorhanden. |
| HasFieldRVA | 256 | RVA ist vorhanden. |

## Siehe auch

* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
