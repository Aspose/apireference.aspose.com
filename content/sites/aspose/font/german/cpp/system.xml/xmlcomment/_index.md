---
title: "System::Xml::XmlComment Klasse"
linktitle: "XmlComment"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlComment Klasse. Stellt den Inhalt eines XML‑Kommentars in C++ dar."
type: docs
weight: 1100
url: /de/cpp/system.xml/xmlcomment/
---
## XmlComment class


Stellt den Inhalt eines XML-Kommentars dar.

```cpp
class XmlComment : public System::Xml::XmlCharacterData
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert alle Kindknoten des Knotens im angegebenen [XmlWriter](../xmlwriter/). Da Kommentar‑Knoten keine Kinder haben, hat diese Methode keine Wirkung. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert den Knoten im angegebenen [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
