---
title: "System::EnumValuesBase::Parse-Methode"
linktitle: "Parsen"
second_title: "Aspose.Font für C++"
description: "System::EnumValuesBase::Parse-Methode. Gibt ein Objekt zurück, das einen Wert einer Aufzählungskonstanten des angegebenen Aufzählungstyps mit dem angegebenen Namen in C++ darstellt."
type: docs
weight: 400
url: /de/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


Gibt ein Objekt zurück, das einen Wert einer Aufzählungskonstanten des angegebenen Aufzählungstyps mit dem angegebenen Namen darstellt.

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | const TypeInfo\& | Das [TypeInfo](../../typeinfo/)-Objekt, das den Typ des zurückzugebenden Aufzählungswerts darstellt |
| str | const String\& | Der Name der Aufzählungskonstanten |
| ignoreCase | bool | Gibt an, ob die Groß-/Kleinschreibung beim Interpretieren des Namens der Aufzählungskonstanten ignoriert werden soll. |

### ReturnValue

Ein Objekt, das den Wert der Aufzählungskonstanten darstellt, deren Name in **str** angegeben ist.

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
