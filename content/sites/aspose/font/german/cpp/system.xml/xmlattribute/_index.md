---
title: "System::Xml::XmlAttribute‑Klasse"
linktitle: "XmlAttribute"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlAttribute‑Klasse. Stellt ein Attribut dar. Gültige und Standardwerte für das Attribut werden in einer Dokumenttypdefinition (DTD) oder einem Schema in C++ definiert."
type: docs
weight: 600
url: /de/cpp/system.xml/xmlattribute/
---
## XmlAttribute class


Stellt ein Attribut dar. Gültige und Standardwerte für das Attribut werden in einer Dokumenttypdefinition (DTD) oder einem Schema definiert.

```cpp
class XmlAttribute : public System::Xml::XmlNode
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) override | Fügt den angegebenen Knoten am Ende der Liste von Kindknoten dieses Knotens hinzu. |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. |
| [get_BaseURI](./get_baseuri/)() override | Gibt den Basis‑Uniform‑Resource‑Identifier (URI) des Knotens zurück. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des Knotens zurück. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Gibt die Namespace-URI dieses Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Gibt das [XmlDocument](../xmldocument/) zurück, zu dem dieser Knoten gehört. |
| virtual [get_OwnerElement](./get_ownerelement/)() | Gibt das [XmlElement](../xmlelement/) zurück, zu dem das Attribut gehört. |
| [get_Prefix](./get_prefix/)() override | Gibt das Namespace-Präfix dieses Knotens zurück. |
| [get_SchemaInfo](./get_schemainfo/)() override | Gibt das post-schema-validation-infoset zurück, das diesem Knoten als Ergebnis der Schema‑Validierung zugewiesen wurde. |
| virtual [get_Specified](./get_specified/)() | Gibt einen Wert zurück, der angibt, ob der Attributwert explizit gesetzt wurde. |
| [get_Value](./get_value/)() override | Gibt den Wert des Knotens zurück. |
| [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Fügt den angegebenen Knoten unmittelbar nach dem angegebenen Referenzknoten ein. |
| [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Fügt den angegebenen Knoten unmittelbar vor dem angegebenen Referenzknoten ein. |
| [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) override | Fügt den angegebenen Knoten am Anfang der Liste von Kindknoten dieses Knotens hinzu. |
| [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) override | Entfernt den angegebenen Kindknoten. |
| [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Ersetzt den angegebenen Kindknoten durch den angegebenen neuen Kindknoten. |
| [set_InnerText](./set_innertext/)(String) override | Setzt die verketteten Werte des Knotens und aller seiner Kindknoten. |
| [set_InnerXml](./set_innerxml/)(String) override | Legt den Wert des Attributs fest. |
| [set_Prefix](./set_prefix/)(String) override | Setzt das Namespace-Präfix dieses Knotens. |
| [set_Value](./set_value/)(String) override | Setzt den Wert des Knotens. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert alle Kindknoten des Knotens im angegebenen [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert den Knoten im angegebenen [XmlWriter](../xmlwriter/). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
