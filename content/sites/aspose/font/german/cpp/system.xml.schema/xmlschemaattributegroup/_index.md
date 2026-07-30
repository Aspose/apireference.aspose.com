---
title: "System::Xml::Schema::XmlSchemaAttributeGroup Klasse"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroup Klasse. Stellt das attributeGroup-Element aus dem XML‑Schema dar, wie vom World Wide Web Consortium (W3C) angegeben. AttributesGroups bietet einen Mechanismus, um eine Menge von Attributdeklarationen zu gruppieren, sodass sie als Gruppe in komplexe Typdefinitionen in C++ eingebunden werden können."
type: docs
weight: 1200
url: /de/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


Stellt das **attributeGroup**-Element aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) angegeben. AttributesGroups bietet einen Mechanismus, um eine Menge von Attributdeklarationen zu gruppieren, sodass sie als Gruppe in komplexe Typdefinitionen eingebunden werden können.

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Gibt die [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) Komponente der Attributgruppe zurück. |
| [get_Attributes](./get_attributes/)() | Gibt die Sammlung von Attributen für die Attributgruppe zurück. Enthält die Elemente [XmlSchemaAttribute](../xmlschemaattribute/) und [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_Name](./get_name/)() | Gibt den Namen der Attributgruppe zurück. |
| [get_QualifiedName](./get_qualifiedname/)() | Gibt den qualifizierten Namen der Attributgruppe zurück. |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | Gibt die neu definierte Attributgruppen‑Eigenschaft aus dem XML [Schema](../) zurück. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Setzt die [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) Komponente der Attributgruppe. |
| [set_Name](./set_name/)(const String\&) | Setzt den Namen der Attributgruppe. |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | Initialisiert eine neue Instanz der [XmlSchemaAttributeGroup](./) Klasse. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
