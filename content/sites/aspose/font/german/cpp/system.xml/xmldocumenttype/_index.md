---
title: "System::Xml::XmlDocumentType Klasse"
linktitle: "XmlDocumentType"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlDocumentType Klasse. Stellt die Dokumenttypdeklaration in C++ dar."
type: docs
weight: 1600
url: /de/cpp/system.xml/xmldocumenttype/
---
## XmlDocumentType class


Stellt die Dokumenttypdeklaration dar.

```cpp
class XmlDocumentType : public System::Xml::XmlLinkedNode
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. |
| [get_Entities](./get_entities/)() | Gibt die Sammlung von [XmlEntity](../xmlentity/) Knoten zurück, die in der Dokumenttypdeklaration deklariert sind. |
| [get_InternalSubset](./get_internalsubset/)() | Gibt den Wert des internen Teilbereichs der Dokumenttypdefinition (DTD) in der DOCTYPE-Deklaration zurück. |
| [get_IsReadOnly](./get_isreadonly/)() override | Gibt einen Wert zurück, der angibt, ob der Knoten schreibgeschützt ist. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des Knotens zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_Notations](./get_notations/)() | Gibt die Sammlung von [XmlNotation](../xmlnotation/) Knoten zurück, die in der Dokumenttypdeklaration vorhanden sind. |
| [get_PublicId](./get_publicid/)() | Gibt den Wert des öffentlichen Identifikators in der DOCTYPE-Deklaration zurück. |
| [get_SystemId](./get_systemid/)() | Gibt den Wert des Systemidentifikators in der DOCTYPE-Deklaration zurück. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert alle Kindknoten des Knotens in den angegebenen [XmlWriter](../xmlwriter/). Für [XmlDocumentType](./)-Knoten hat diese Methode keine Wirkung. |
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
