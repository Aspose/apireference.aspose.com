---
title: "System::Xml::XmlProcessingInstruction‑Klasse"
linktitle: "XmlProcessingInstruction"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlProcessingInstruction‑Klasse. Stellt eine Verarbeitungsanweisung dar, die XML definiert, um prozessorbezogene Informationen im Text des Dokuments in C++ zu speichern."
type: docs
weight: 3100
url: /de/cpp/system.xml/xmlprocessinginstruction/
---
## XmlProcessingInstruction class


Stellt eine Verarbeitungsanweisung dar, die XML definiert, um prozessorspezifische Informationen im Text des Dokuments zu speichern.

```cpp
class XmlProcessingInstruction : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. |
| [get_Data](./get_data/)() | Gibt den Inhalt der Verarbeitungsanweisung zurück, ohne das Ziel. |
| [get_InnerText](./get_innertext/)() override | Gibt die zusammengefügten Werte des Knotens und aller seiner Kindknoten zurück. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_Target](./get_target/)() | Gibt das Ziel der Verarbeitungsanweisung zurück. |
| [get_Value](./get_value/)() override | Gibt den Wert des Knotens zurück. |
| [set_Data](./set_data/)(const String\&) | Legt den Inhalt der Verarbeitungsanweisung fest, ohne das Ziel. |
| [set_InnerText](./set_innertext/)(String) override | Setzt die verketteten Werte des Knotens und aller seiner Kindknoten. |
| [set_Value](./set_value/)(String) override | Setzt den Wert des Knotens. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert alle Kindknoten des Knotens im angegebenen [XmlWriter](../xmlwriter/). Da ProcessingInstruction‑Knoten keine Kinder haben, hat diese Methode keine Wirkung. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert den Knoten im angegebenen [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
