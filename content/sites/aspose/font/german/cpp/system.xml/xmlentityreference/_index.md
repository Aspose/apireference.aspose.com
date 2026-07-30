---
title: "System::Xml::XmlEntityReference‑Klasse"
linktitle: "XmlEntityReference"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlEntityReference Klasse. Stellt einen Entity-Referenzknoten in C++ dar."
type: docs
weight: 1900
url: /de/cpp/system.xml/xmlentityreference/
---
## XmlEntityReference class


Stellt einen Entity-Referenzknoten dar.

```cpp
class XmlEntityReference : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. |
| [get_BaseURI](./get_baseuri/)() override | Gibt den Basis-Uniform Resource Identifier (URI) des aktuellen Knotens zurück. |
| [get_IsReadOnly](./get_isreadonly/)() override | Gibt einen Wert zurück, der angibt, ob der Knoten schreibgeschützt ist. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den Namen des Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des Knotens zurück. |
| [get_Value](./get_value/)() override | Gibt den Wert des Knotens zurück. |
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

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
