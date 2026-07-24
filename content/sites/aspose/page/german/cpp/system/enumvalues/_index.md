---
title: "System::EnumValues-Klasse"
linktitle: "EnumValues"
second_title: "Aspose.Page für C++"
description: "System::EnumValues-Klasse. Stellt Metainformationen über die Aufzählungskonstanten des Aufzählungstyps E in C++ bereit."
type: docs
weight: 2300
url: /de/cpp/system/enumvalues/
---
## EnumValues class


Bietet Metainformationen über die Enumerationskonstanten des Enum‑Typs **E**.

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| Parameter | Beschreibung |
| --- | --- |
| E | Der Typ der Aufzählung |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [EnumValues](./enumvalues/)() | Konstruiert eine Instanz. |
| [GetNames](./getnames/)() const override | Gibt ein Array zurück, das alle Namen der Aufzählung **E** enthält. |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | Ruft ein Array der Namen der Konstanten einer angegebenen Aufzählung ab. |
| [GetUnderlyingType](./getunderlyingtype/)() const override | Gibt den zugrunde liegenden Typ der angegebenen Aufzählung zurück. |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | Gibt den zugrunde liegenden Typ der angegebenen Aufzählung zurück. |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | Gibt den verpackten Wert der Aufzählungskonstanten mit dem angegebenen Namen zurück. |
| [GetValueOf](./getvalueof/)(long) const override | Gibt den geboxten Wert der Aufzählungskonstante mit dem angegebenen Wert zurück. |
| [GetValues](./getvalues/)() const override | Gibt ein Array zurück, das alle Werte der Aufzählung **E** enthält. |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | Gibt ein Array zurück, das alle Werte des angegebenen Aufzählungstyps enthält. |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | Gibt ein Objekt zurück, das einen Wert der Aufzählungskonstante des angegebenen Aufzählungstyps mit dem angegebenen Namen darstellt. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | Konvertiert den angegebenen 64‑Bit‑unsigned‑Integer‑Wert in ein Aufzählungsmitglied. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | Konvertiert das angegebene Objekt mit einem Integer‑Wert in ein Aufzählungsmitglied. |
| virtual [~EnumValues](./~enumvalues/)() | Destruktor. |

## Siehe auch

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
