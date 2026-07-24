---
title: "System::Xml::Schema::XmlSchemaSimpleContentExtension Klasse"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentExtension Klasse. Stellt das extension-Element für einfachen Inhalt aus dem XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse kann verwendet werden, um einfache Typen durch Erweiterung abzuleiten. Solche Ableitungen werden genutzt, um den Inhalt des einfachen Typs des Elements durch Hinzufügen von Attributen in C++ zu erweitern."
type: docs
weight: 6000
url: /de/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


Stellt das **extension**-Element für einfachen Inhalt aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse kann verwendet werden, um einfache Typen durch Erweiterung abzuleiten. Solche Ableitungen werden genutzt, um den Inhalt des einfachen Typs des Elements durch Hinzufügen von Attributen zu erweitern.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Gibt das [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) zurück, das für den Attributwert verwendet werden soll. |
| [get_Attributes](./get_attributes/)() | Gibt die Sammlung von [XmlSchemaAttribute](../xmlschemaattribute/) und [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) zurück. |
| [get_BaseTypeName](./get_basetypename/)() | Gibt den Namen eines integrierten Datentyps oder einfachen Typs zurück, von dem dieser Typ erweitert wird. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Setzt das [XmlSchemaAnyAttribute](../xmlschemaanyattribute/), das für den Attributwert verwendet werden soll. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Setzt den Namen eines integrierten Datentyps oder einfachen Typs, von dem dieser Typ erweitert wird. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | Initialisiert eine neue Instanz der [XmlSchemaSimpleContentExtension](./) Klasse. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
