---
title: "System::TypeInfo::IsDefined-Methode"
linktitle: "IsDefined"
second_title: "Aspose.Font für C++"
description: "System::TypeInfo::IsDefined-Methode. NICHT IMPLEMENTIERT. Gibt an, ob ein oder mehrere Attribute des angegebenen Typs oder seiner abgeleiteten Typen auf dieses Mitglied in C++ angewendet werden."
type: docs
weight: 4400
url: /de/cpp/system/typeinfo/isdefined/
---
## TypeInfo::IsDefined method


NICHT IMPLEMENTIERT. Gibt an, ob ein oder mehrere Attribute des angegebenen Typs oder seiner abgeleiteten Typen auf dieses Mitglied angewendet werden.

```cpp
bool System::TypeInfo::IsDefined(const TypeInfo &attributeType, bool inherit) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| attributeType | const TypeInfo\& | Der Typ des benutzerdefinierten Attributs, nach dem gesucht werden soll. Die Suche schließt abgeleitete Typen ein. |
| inherit | bool | true, um die Vererbungskette dieses Mitglieds zu durchsuchen und die Attribute zu finden; andernfalls false. Dieser Parameter wird für Eigenschaften und Ereignisse ignoriert. |

### ReturnValue

true, wenn ein oder mehrere Instanzen von attributeType oder einer seiner abgeleiteten Typen auf dieses Mitglied angewendet werden; andernfalls false.

## Siehe auch

* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
