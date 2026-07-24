---
title: "System::Xml::Schema::XmlSchemaSimpleTypeList Klasse"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeList Klasse. Stellt das Listenelement aus XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse kann verwendet werden, um ein **simpleType**-Element als Liste von Werten eines angegebenen Datentyps in C++ zu definieren."
type: docs
weight: 6400
url: /de/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


Stellt das **list**-Element aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse kann verwendet werden, um ein **simpleType**-Element als Liste von Werten eines angegebenen Datentyps zu definieren.

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | Gibt das [XmlSchemaSimpleType](../xmlschemasimpletype/) zurück, das den Typ des **simpleType**-Elements basierend auf den Werten von [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) und [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) des einfachen Typs darstellt. |
| [get_ItemType](./get_itemtype/)() | Gibt das **simpleType**-Element zurück, das vom durch den Basiswert angegebenen Typ abgeleitet ist. |
| [get_ItemTypeName](./get_itemtypename/)() | Gibt den Namen eines integrierten Datentyps oder **simpleType**-Elements zurück, das in diesem Schema (oder einem anderen durch den angegebenen Namensraum bezeichneten Schema) definiert ist. |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Legt das [XmlSchemaSimpleType](../xmlschemasimpletype/) fest, das den Typ des **simpleType**-Elements basierend auf den Werten von [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) und [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) des einfachen Typs darstellt. |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Legt das **simpleType**-Element fest, das vom durch den Basiswert angegebenen Typ abgeleitet ist. |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Legt den Namen eines integrierten Datentyps oder **simpleType**-Elements fest, das in diesem Schema (oder einem anderen durch den angegebenen Namensraum bezeichneten Schema) definiert ist. |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaSimpleTypeList](./). |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
