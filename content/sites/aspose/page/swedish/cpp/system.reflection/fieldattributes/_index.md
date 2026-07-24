---
title: "System::Reflection::FieldAttributes‑enum"
linktitle: "FieldAttributes"
second_title: "Aspose.Page för C++"
description: "System::Reflection::FieldAttributes enum. Reflekterade fältattribut i C++."
type: docs
weight: 1200
url: /sv/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


Reflekterade fältattribut.

```cpp
enum class FieldAttributes
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| FieldAccessMask | 7 | Medlemsåtkomstmask. Använd den här masken för att hämta åtkomstinformation. |
| PrivateScope | 0 | Icke-refererbara medlemmar. |
| Private | 1 | Privata medlemmar. |
| FamANDAssem | 2 | Privata medlemmar med assembly-scope. |
| Assembly | 3 | Assembly-scope medlemmar. |
| Family | 4 | Medlemmar som är åtkomliga av typ och subtyper. |
| FamORAssem | 5 | Medlemmar som är åtkomliga av typ, subtyper och assembly. |
| Public | 6 | Medlemmar som är åtkomliga av alla. |
| Static | 16 | Statiska medlemmar som motsats till instansmedlemmar. |
| InitOnly | 32 | Const-medlemmar som bara kan initieras men inte ändras. |
| Literal | 64 | Kompileringstidkonstanta medlemmar. |
| NotSerialized | 128 | Ej serialiserade medlemmar. |
| SpecialName | 512 | Speciellt fält för ett av namnen nedan. |
| PinvokeImpl | 8192 | Interop vidarebefordrad implementation. |
| ReservedMask | 38144 | Reserverade flaggor endast för körningstidens användning. |
| RTSpecialName | 1024 | Runtime bör kontrollera namnkodning. |
| HasFieldMarshal | 4096 | Marshalinginformation finns. |
| HasDefault | 32768 | Standardvärde finns. |
| HasFieldRVA | 256 | RVA finns. |

## Se även

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
