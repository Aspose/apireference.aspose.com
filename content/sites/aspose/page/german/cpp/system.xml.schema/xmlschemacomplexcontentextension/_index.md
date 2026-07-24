---
title: "System::Xml::Schema::XmlSchemaComplexContentExtension class"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaComplexContentExtension class. Stellt das extension-Element aus XML Schema dar, wie vom World Wide Web Consortium (W3C) spezifiziert. Diese Klasse ist für komplexe Typen mit komplexem Inhaltsmodell, das durch Erweiterung abgeleitet wird. Sie erweitert den komplexen Typ, indem sie Attribute oder Elemente in C++ hinzufügt."
type: docs
weight: 1900
url: /de/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


Stellt das **extension**-Element aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) spezifiziert. Diese Klasse ist für komplexe Typen mit komplexem Inhaltsmodell, das durch Erweiterung abgeleitet wird. Sie erweitert den komplexen Typ, indem sie Attribute oder Elemente hinzufügt.

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Gibt die [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)-Komponente des komplexen Inhaltsmodells zurück. |
| [get_Attributes](./get_attributes/)() | Gibt die Sammlung von Attributen für den komplexen Inhalt zurück. Enthält die Elemente [XmlSchemaAttribute](../xmlschemaattribute/) und [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Gibt den Namen des komplexen Typs zurück, von dem dieser Typ durch Erweiterung abgeleitet ist. |
| [get_Particle](./get_particle/)() | Gibt eine der Klassen [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) oder [XmlSchemaSequence](../xmlschemasequence/) zurück. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Setzt die [XmlSchemaAnyAttribute](../xmlschemaanyattribute/)-Komponente des komplexen Inhaltsmodells. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Setzt den Namen des komplexen Typs, von dem dieser Typ durch Erweiterung abgeleitet ist. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Setzt eine der Klassen [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) oder [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaComplexContentExtension](./). |
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
