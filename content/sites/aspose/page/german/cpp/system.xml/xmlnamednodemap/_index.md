---
title: "System::Xml::XmlNamedNodeMap Klasse"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlNamedNodeMap Klasse. Stellt eine Sammlung von Knoten dar, die in C++ über Namen oder Index zugänglich sind."
type: docs
weight: 2200
url: /de/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


Stellt eine Sammlung von Knoten dar, die nach Name oder Index zugänglich ist.

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [begin](./begin/)() const | Gibt den Iterator zum ersten Element der Sammlung zurück. |
| [cbegin](./cbegin/)() const | Gibt den Iterator zum ersten Element der Sammlung zurück. |
| [cend](./cend/)() const | Gibt den Iterator für ein nicht vorhandenes Element hinter dem letzten Element der Sammlung zurück. |
| [end](./end/)() const | Gibt den Iterator für ein nicht vorhandenes Element hinter dem letzten Element der Sammlung zurück. |
| virtual [get_Count](./get_count/)() | Gibt die Anzahl der Knoten im [XmlNamedNodeMap](./) zurück. |
| [GetEnumerator](./getenumerator/)() override | Bietet Unterstützung für die Iteration über die Knotensammlung im [XmlNamedNodeMap](./). |
| virtual [GetNamedItem](./getnameditem/)(String) | Ruft einen [XmlNode](../xmlnode/) anhand des Namens ab. |
| virtual [GetNamedItem](./getnameditem/)(String, String) | Ruft einen Knoten mit den passenden [XmlNode::get_LocalName](../xmlnode/get_localname/) und [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) Werten ab. |
| virtual [Item](./item/)(int32_t) | Ruft den Knoten am angegebenen Index in der [XmlNamedNodeMap](./) ab. |
| virtual [RemoveNamedItem](./removenameditem/)(String) | Entfernt den Knoten aus der [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | Entfernt einen Knoten mit den passenden [XmlNode::get_LocalName](../xmlnode/get_localname/) und [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) Werten. |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | Fügt einen [XmlNode](../xmlnode/) hinzu, indem sein [XmlNode::get_Name](../xmlnode/get_name/) Wert verwendet wird. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [iterator](./iterator/) | Iterator-Typ. |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
