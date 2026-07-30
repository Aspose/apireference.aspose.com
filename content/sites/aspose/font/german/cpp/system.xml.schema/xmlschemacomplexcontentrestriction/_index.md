---
title: "System::Xml::Schema::XmlSchemaComplexContentRestriction Klasse"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaComplexContentRestriction Klasse. Stellt das restriction-Element aus XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse ist für komplexe Typen mit einem durch Einschränkung abgeleiteten komplexen Inhaltsmodell vorgesehen. Sie beschränkt den Inhalt des komplexen Typs auf eine Teilmenge des geerbten komplexen Typs in C++."
type: docs
weight: 2000
url: /de/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


Stellt das **restriction**-Element aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse ist für komplexe Typen mit einem durch Einschränkung abgeleiteten komplexen Inhaltsmodell vorgesehen. Sie beschränkt den Inhalt des komplexen Typs auf eine Teilmenge des geerbten komplexen Typs.

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Gibt die [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) Komponente des komplexen Inhaltsmodells zurück. |
| [get_Attributes](./get_attributes/)() | Gibt die Sammlung von Attributen für den komplexen Typ zurück. Enthält die Elemente [XmlSchemaAttribute](../xmlschemaattribute/) und [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Gibt den Namen eines komplexen Typs zurück, von dem dieser Typ durch Einschränkung abgeleitet ist. |
| [get_Particle](./get_particle/)() | Gibt eine der Klassen [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) oder [XmlSchemaSequence](../xmlschemasequence/) zurück. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Legt die Komponente [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) des komplexen Inhaltsmodells fest. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Setzt den Namen eines komplexen Typs, von dem dieser Typ durch Einschränkung abgeleitet ist. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Setzt eine der Klassen [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) oder [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaComplexContentRestriction](./). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
