---
title: "System::Xml::Schema::XmlSchemaSimpleContentRestriction Klasse"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentRestriction Klasse. Stellt das Restriktionselement für einfachen Inhalt aus XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse kann verwendet werden, um einfache Typen durch Restriktion abzuleiten. Solche Ableitungen können verwendet werden, um den Wertebereich des Elements auf eine Teilmenge der im geerbten einfachen Typ angegebenen Werte in C++ zu beschränken."
type: docs
weight: 6100
url: /de/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


Stellt das **restriction**-Element für einfachen Inhalt aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse kann verwendet werden, um einfache Typen durch restriction abzuleiten. Solche Ableitungen können verwendet werden, um den Wertebereich des Elements auf eine Teilmenge der im geerbten einfachen Typ angegebenen Werte zu beschränken.

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Gibt ein [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) zurück, das für den Attributwert verwendet werden kann. |
| [get_Attributes](./get_attributes/)() | Gibt die [XmlSchemaAttribute](../xmlschemaattribute/) und [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) Sammlung von Attributen für den einfachen Typ zurück. |
| [get_BaseType](./get_basetype/)() | Gibt den Basiswert des einfachen Typs zurück. |
| [get_BaseTypeName](./get_basetypename/)() | Gibt den Namen des integrierten Datentyps oder einfachen Typs zurück, von dem dieser Typ abgeleitet ist. |
| [get_Facets](./get_facets/)() | Gibt ein [Xml](../../system.xml/)[Schema](../)-Facet zurück. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Legt ein [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) fest, das für den Attributwert verwendet wird. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Legt den Basiswert des einfachen Typs fest. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Legt den Namen des integrierten Datentyps oder einfachen Typs fest, von dem dieser Typ abgeleitet ist. |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaSimpleContentRestriction](./). |
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
