---
title: "System::Xml::XmlDeclaration Klasse"
linktitle: "XmlDeclaration"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlDeclaration Klasse. Stellt den XML‑Deklarationsknoten <?xml version=''1.0''...?> in C++ dar."
type: docs
weight: 1300
url: /de/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


Stellt den XML-Deklarationsknoten **<?xml version='1.0'...?>** dar.

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. |
| [get_Encoding](./get_encoding/)() | Gibt die Kodierungsebene des XML‑Dokuments zurück. |
| [get_InnerText](./get_innertext/)() override | Gibt die zusammengefügten Werte der [XmlDeclaration](./) zurück. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_Standalone](./get_standalone/)() | Gibt den Wert des Attributs standalone zurück. |
| [get_Value](./get_value/)() override | Gibt den Wert der [XmlDeclaration](./) zurück. |
| [get_Version](./get_version/)() | Gibt die XML‑Version des Dokuments zurück. |
| [set_Encoding](./set_encoding/)(const String\&) | Setzt die Kodierungsebene des XML‑Dokuments. |
| [set_InnerText](./set_innertext/)(String) override | Setzt die zusammengefügten Werte der [XmlDeclaration](./). |
| [set_Standalone](./set_standalone/)(const String\&) | Setzt den Wert des Attributs standalone. |
| [set_Value](./set_value/)(String) override | Setzt den Wert der [XmlDeclaration](./). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert die Kinder des Knotens im angegebenen [XmlWriter](../xmlwriter/). Da [XmlDeclaration](./)-Knoten keine Kinder haben, hat diese Methode keine Wirkung. |
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
