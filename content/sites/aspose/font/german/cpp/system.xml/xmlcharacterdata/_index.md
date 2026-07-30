---
title: "System::Xml::XmlCharacterData Klasse"
linktitle: "XmlCharacterData"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlCharacterData Klasse. Stellt Textmanipulationsmethoden bereit, die von mehreren Klassen in C++ verwendet werden."
type: docs
weight: 900
url: /de/cpp/system.xml/xmlcharacterdata/
---
## XmlCharacterData class


Stellt Textmanipulationsmethoden bereit, die von mehreren Klassen verwendet werden.

```cpp
class XmlCharacterData : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [AppendData](./appenddata/)(String) | Fügt die angegebene Zeichenkette am Ende der Zeichendaten des Knotens an. |
| virtual [DeleteData](./deletedata/)(int32_t, int32_t) | Entfernt einen Bereich von Zeichen aus dem Knoten. |
| virtual [get_Data](./get_data/)() | Gibt die Daten des Knotens zurück. |
| [get_InnerText](./get_innertext/)() override | Gibt die zusammengefügten Werte des Knotens und aller seiner Kindknoten zurück. |
| virtual [get_Length](./get_length/)() | Gibt die Länge der Daten in Zeichen zurück. |
| [get_Value](./get_value/)() override | Gibt den Wert des Knotens zurück. |
| virtual [InsertData](./insertdata/)(int32_t, String) | Fügt die angegebene Zeichenkette an der angegebenen Zeichenposition ein. |
| virtual [ReplaceData](./replacedata/)(int32_t, int32_t, String) | Ersetzt die angegebene Anzahl von Zeichen, beginnend an der angegebenen Position, durch die angegebene Zeichenkette. |
| virtual [set_Data](./set_data/)(String) | Setzt die Daten des Knotens. |
| [set_InnerText](./set_innertext/)(String) override | Setzt die zusammengefügten Werte des Knotens und aller seiner Kindknoten. |
| [set_Value](./set_value/)(String) override | Setzt den Wert des Knotens. |
| virtual [Substring](./substring/)(int32_t, int32_t) | Ruft einen Teilstring der gesamten Zeichenkette aus dem angegebenen Bereich ab. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
