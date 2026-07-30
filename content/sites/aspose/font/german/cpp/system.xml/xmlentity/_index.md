---
title: "System::Xml::XmlEntity‑Klasse"
linktitle: "XmlEntity"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlEntity‑Klasse. Stellt eine Entity‑Deklaration dar, z. B. <!ENTITY...> in C++."
type: docs
weight: 1800
url: /de/cpp/system.xml/xmlentity/
---
## XmlEntity class


Stellt eine Entity-Deklaration dar, wie **<!ENTITY... >**.

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. Entity‑Knoten können nicht geklont werden. Der Aufruf dieser Methode auf einem [XmlEntity](./)-Objekt wirft eine Ausnahme. |
| [get_BaseURI](./get_baseuri/)() override | Gibt den Basis-Uniform Resource Identifier (URI) des aktuellen Knotens zurück. |
| [get_InnerText](./get_innertext/)() override | Gibt die zusammengefügten Werte des Entity‑Knotens und aller seiner Kinder zurück. |
| [get_InnerXml](./get_innerxml/)() override | Gibt das Markup zurück, das die Kinder dieses Knotens darstellt. |
| [get_IsReadOnly](./get_isreadonly/)() override | Gibt einen Wert zurück, der angibt, ob der Knoten schreibgeschützt ist. |
| [get_LocalName](./get_localname/)() override | Gibt den Namen des Knotens ohne das Namespace‑Präfix zurück. |
| [get_Name](./get_name/)() override | Gibt den Namen des Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des Knotens zurück. |
| [get_NotationName](./get_notationname/)() | Gibt den Namen des optionalen NDATA‑Attributs der Entity‑Deklaration zurück. |
| [get_OuterXml](./get_outerxml/)() override | Gibt das Markup zurück, das diesen Knoten und alle seine Kinder darstellt. |
| [get_PublicId](./get_publicid/)() | Gibt den Wert des öffentlichen Identifikators der Entity‑Deklaration zurück. |
| [get_SystemId](./get_systemid/)() | Gibt den Wert des System‑Identifikators der Entity‑Deklaration zurück. |
| [set_InnerText](./set_innertext/)(String) override | Setzt die zusammengefügten Werte des Entity‑Knotens und aller seiner Kinder. |
| [set_InnerXml](./set_innerxml/)(String) override | Setzt das Markup, das die Kinder dieses Knotens darstellt. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert alle Kinder des Knotens im angegebenen [XmlWriter](../xmlwriter/). Für [XmlEntity](./)-Knoten hat diese Methode keine Wirkung. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert den Knoten im angegebenen [XmlWriter](../xmlwriter/). Für [XmlEntity](./)-Knoten hat diese Methode keine Wirkung. |
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
