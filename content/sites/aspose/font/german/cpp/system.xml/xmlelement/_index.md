---
title: "System::Xml::XmlElement Klasse"
linktitle: "XmlElement"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlElement Klasse. Stellt ein Element in C++ dar."
type: docs
weight: 1700
url: /de/cpp/system.xml/xmlelement/
---
## XmlElement class


Stellt ein Element dar.

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Gibt einen **bool** Wert zurück, der angibt, ob der aktuelle Knoten Attribute hat. |
| [get_InnerText](./get_innertext/)() override | Gibt die zusammengefügten Werte des Knotens und aller seiner Kindknoten zurück. |
| [get_InnerXml](./get_innerxml/)() override | Gibt das Markup zurück, das nur die Kindknoten dieses Knotens darstellt. |
| [get_IsEmpty](./get_isempty/)() | Gibt das Tag-Format des Elements zurück. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des aktuellen Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des Knotens zurück. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Gibt die Namespace-URI dieses Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Gibt das [XmlDocument](../xmldocument/) zurück, zu dem dieser Knoten gehört. |
| [get_Prefix](./get_prefix/)() override | Gibt das Namespace-Präfix dieses Knotens zurück. |
| [get_SchemaInfo](./get_schemainfo/)() override | Gibt das nach der Schema-Validierung zugewiesene Infoset zurück, das diesem Knoten als Ergebnis der Schema-Validierung zugewiesen wurde. |
| virtual [GetAttribute](./getattribute/)(String) | Gibt den Wert des Attributs mit dem angegebenen Namen zurück. |
| virtual [GetAttribute](./getattribute/)(String, String) | Gibt den Wert des Attributs mit dem angegebenen lokalen Namen und Namespace-URI zurück. |
| virtual [GetAttributeNode](./getattributenode/)(String) | Gibt das [XmlAttribute](../xmlattribute/) mit dem angegebenen Namen zurück. |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | Gibt das [XmlAttribute](../xmlattribute/) mit dem angegebenen lokalen Namen und Namespace-URI zurück. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Gibt eine [XmlNodeList](../xmlnodelist/) zurück, die eine Liste aller Nachfahren-Elemente enthält, die dem angegebenen [XmlElement::get_Name](./get_name/) entsprechen. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Gibt eine [XmlNodeList](../xmlnodelist/) zurück, die eine Liste aller Nachfahren-Elemente enthält, die den angegebenen [XmlElement::get_LocalName](./get_localname/) und [XmlElement::get_NamespaceURI](./get_namespaceuri/)-Werten entsprechen. |
| virtual [HasAttribute](./hasattribute/)(String) | Bestimmt, ob der aktuelle Knoten ein Attribut mit dem angegebenen Namen hat. |
| virtual [HasAttribute](./hasattribute/)(String, String) | Bestimmt, ob der aktuelle Knoten ein Attribut mit dem angegebenen lokalen Namen und Namespace-URI hat. |
| [RemoveAll](./removeall/)() override | Entfernt alle angegebenen Attribute und Kindknoten des aktuellen Knotens. Standardattribute werden nicht entfernt. |
| virtual [RemoveAllAttributes](./removeallattributes/)() | Entfernt alle angegebenen Attribute vom Element. Standardattribute werden nicht entfernt. |
| virtual [RemoveAttribute](./removeattribute/)(String) | Entfernt ein Attribut nach Namen. |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | Entfernt ein Attribut mit dem angegebenen lokalen Namen und Namespace-URI. (Falls das entfernte Attribut einen Standardwert hat, wird dieser sofort ersetzt). |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | Entfernt den Attributknoten mit dem angegebenen Index vom Element. (Falls das entfernte Attribut einen Standardwert hat, wird dieser sofort ersetzt). |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | Entfernt das angegebene [XmlAttribute](../xmlattribute/). |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | Entfernt das [XmlAttribute](../xmlattribute/), das durch den lokalen Namen und Namespace-URI angegeben ist. (Falls das entfernte Attribut einen Standardwert hat, wird dieser sofort ersetzt). |
| [set_InnerText](./set_innertext/)(String) override | Setzt die verketteten Werte des Knotens und aller seiner Kindknoten. |
| [set_InnerXml](./set_innerxml/)(String) override | Setzt das Markup, das nur die Kindknoten dieses Knotens darstellt. |
| [set_IsEmpty](./set_isempty/)(bool) | Setzt das Tag-Format des Elements. |
| [set_Prefix](./set_prefix/)(String) override | Setzt das Namespace-Präfix dieses Knotens. |
| virtual [SetAttribute](./setattribute/)(String, String) | Setzt den Wert des Attributs mit dem angegebenen Namen. |
| virtual [SetAttribute](./setattribute/)(String, String, String) | Setzt den Wert des Attributs mit dem angegebenen lokalen Namen und Namespace-URI. |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | Fügt das angegebene [XmlAttribute](../xmlattribute/) hinzu. |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | Fügt das angegebene [XmlAttribute](../xmlattribute/) hinzu. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert alle Kindknoten des Knotens im angegebenen [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert den aktuellen Knoten in den angegebenen [XmlWriter](../xmlwriter/). |
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
