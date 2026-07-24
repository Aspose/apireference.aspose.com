---
title: "System::Xml::XmlSignificantWhitespace Klasse"
linktitle: "XmlSignificantWhitespace"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlSignificantWhitespace Klasse. Stellt Leerraum zwischen Markup in einem gemischten Inhaltsknoten oder Leerraum innerhalb eines xml:space=''preserve''-Bereichs dar. Dies wird in C++ auch als signifikanter Leerraum bezeichnet."
type: docs
weight: 3700
url: /de/cpp/system.xml/xmlsignificantwhitespace/
---
## XmlSignificantWhitespace class


Stellt Leerzeichen zwischen Markup in einem gemischten Inhaltsknoten oder Leerzeichen innerhalb eines **xml:space='preserve'**-Bereichs dar. Dies wird auch als signifikante Leerzeichen bezeichnet.

```cpp
class XmlSignificantWhitespace : public System::Xml::XmlCharacterData
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_PreviousText](./get_previoustext/)() override | Gibt den Textknoten zurück, der diesem Knoten unmittelbar vorausgeht. |
| [get_Value](./get_value/)() override | Gibt den Wert des Knotens zurück. |
| [set_Value](./set_value/)(String) override | Setzt den Wert des Knotens. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert alle Kindknoten des Knotens in den angegebenen [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert den Knoten in den angegebenen [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
