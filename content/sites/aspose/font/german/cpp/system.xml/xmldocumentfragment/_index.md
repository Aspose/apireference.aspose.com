---
title: "System::Xml::XmlDocumentFragment Klasse"
linktitle: "XmlDocumentFragment"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlDocumentFragment Klasse. Stellt ein leichtgewichtiges Objekt dar, das für Baum-Einfügeoperationen in C++ nützlich ist."
type: docs
weight: 1500
url: /de/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


Stellt ein leichtgewichtiges Objekt dar, das für Baum‑Einfügeoperationen nützlich ist.

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. |
| [get_InnerXml](./get_innerxml/)() override | Gibt das Markup zurück, das die Kinder dieses Knotens darstellt. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Gibt das [XmlDocument](../xmldocument/) zurück, zu dem dieser Knoten gehört. |
| [set_InnerXml](./set_innerxml/)(String) override | Setzt das Markup, das die Kinder dieses Knotens darstellt. |
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
