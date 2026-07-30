---
title: "System::BoxedValue-Klasse"
linktitle: "BoxedValue"
second_title: "Aspose.Font für C++"
description: "System::BoxedValue Klasse. Stellt einen verpackten Wert dar. Objekte dieser Klasse sollten nur mit der System::MakeObject()‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system/boxedvalue/
---
## BoxedValue class


Stellt einen verpackten Wert dar. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../makeobject/) Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ des verpackten Wertes, der von der Klasse dargestellt wird |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | Konstruiert ein Objekt, das den angegebenen verpackten Wert darstellt. |
| [Equals](./equals/)(ptr) override | Bestimmt die Gleichheit der von dem aktuellen und dem angegebenen Objekt dargestellten verpackten Werte. |
| [GetHashCode](./gethashcode/)() const override | Gibt einen Hashcode für das aktuelle Objekt zurück. |
| [GetType](./gettype/)() const override | Ermittelt den tatsächlichen Typ des Objekts. |
| [GetTypeCode](./gettypecode/)() const override | Gibt den Wert zurück, der den Typ des von dem aktuellen Objekt dargestellten verpackten Wertes repräsentiert. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Gibt den numerischen Wert des verpackten Objekts zurück, falls es konvertiert werden kann, sonst Null. |
| [is](./is/)() const | Bestimmt, ob der Typ des von dem aktuellen Objekt dargestellten verpackten Wertes **V** ist. |
| [IsBoxedEnum](./isboxedenum/)() override | Bestimmt, ob das aktuelle Objekt einen verpackten Wert eines Aufzählungstyps darstellt. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | Verpackt den Wert einer Aufzählungskonstanten der angegebenen Aufzählung mit dem angegebenen Namen. Ein Parameter gibt an, ob die Groß‑/Kleinschreibung beim Interpretieren der Zeichenkette, die den Namen der Aufzählungskonstanten angibt, ignoriert werden soll. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | Verpackt den Wert einer Aufzählungskonstanten der angegebenen Aufzählung mit dem angegebenen Namen. |
| [ToString](./tostring/)() const override | Konvertiert den von dem aktuellen Objekt dargestellten verpackten Wert in einen String. |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | Konvertiert das verpackte Objekt in einen String unter Verwendung der angegebenen Formatzeichenkette. |
| [unbox](./unbox/)() const | Entpackt den von dem aktuellen Objekt dargestellten Wert. |

## Siehe auch

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
