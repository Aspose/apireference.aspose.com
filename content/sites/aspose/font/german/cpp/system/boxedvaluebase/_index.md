---
title: "System::BoxedValueBase-Klasse"
linktitle: "BoxedValueBase"
second_title: "Aspose.Font für C++"
description: "System::BoxedValueBase-Klasse. Eine Basisklasse, die ein Interface definiert und einige grundlegende Methoden einer abgeleiteten Klasse implementiert, die einen verpackten Wert repräsentiert. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


Eine Basisklasse, die ein Interface definiert und einige grundlegende Methoden einer abgeleiteten Klasse implementiert, die einen verpackten Wert repräsentiert. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class BoxedValueBase : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | Gibt den Wert zurück, der den Typ des von dem aktuellen Objekt dargestellten verpackten Wertes repräsentiert. |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | Konvertiert den von dem aktuellen Objekt dargestellten verpackten Wert in einen 64‑Bit‑Ganzzahlwert. |
| virtual [IsBoxedEnum](./isboxedenum/)() | Bestimmt, ob das aktuelle Objekt einen verpackten Wert eines Aufzählungstyps darstellt. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | Verpackt den Wert einer Aufzählungskonstanten der angegebenen Aufzählung mit dem angegebenen Namen. Ein Parameter gibt an, ob die Groß‑/Kleinschreibung beim Interpretieren der Zeichenkette, die den Namen der Aufzählungskonstanten angibt, ignoriert werden soll. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | Verpackt den Wert einer Aufzählungskonstanten der angegebenen Aufzählung mit dem angegebenen Namen. |
| [ToString](./tostring/)(const System::String\&) const | Konvertiert das verpackte Objekt in einen String unter Verwendung der angegebenen Formatzeichenkette. |
| virtual [ToString](./tostring/)() const | Analog zur C#-Methode [Object.ToString()](../object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
