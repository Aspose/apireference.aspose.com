---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "Aspose.Font für C++"
description: "System::BoxedEnum class. Stellt einen verpackten Enumerationswert dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstelle niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickele diese Klasse immer in einen System::SmartPtr‑Pointer ein und verwende diesen Pointer, um sie als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 700
url: /de/cpp/system/boxedenum/
---
## BoxedEnum class


Stellt einen verpackten Enumerationswert dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erstelle niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickele diese Klasse immer in den [System::SmartPtr](../smartptr/)-Pointer ein und verwende diesen Pointer, um sie als Argument an Funktionen zu übergeben.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| Parameter | Beschreibung |
| --- | --- |
| E | Typ des Enumerationswerts |
| UT | Der zugrunde liegende Typ der Enumeration **E** |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | Erzeugt eine Instanz, die den angegebenen Enumerationswert darstellt. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Konvertiert den Wert der verpackten Enumerationskonstanten in einen 64‑Bit‑Ganzzahlwert. |
| [IsBoxedEnum](./isboxedenum/)() override | Bestimmt, ob das aktuelle Objekt einen verpackten Wert des Enum‑Typs darstellt. |
| [ToString](./tostring/)() const override | Konvertiert den vom aktuellen Objekt dargestellten verpackten Wert in einen String. |

## Siehe auch

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
