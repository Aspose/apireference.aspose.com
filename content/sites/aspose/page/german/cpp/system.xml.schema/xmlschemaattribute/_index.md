---
title: "System::Xml::Schema::XmlSchemaAttribute Klasse"
linktitle: "XmlSchemaAttribute"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaAttribute Klasse. Stellt das attribute‑Element aus dem XML‑Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Attribute liefern zusätzliche Informationen für andere Dokumentelemente. Das Attribut‑Tag ist zwischen den Tags eines Dokument‑Elements für das Schema verschachtelt. Das XML‑Dokument zeigt Attribute als benannte Elemente im öffnenden Tag eines Elements in C++ an."
type: docs
weight: 1100
url: /de/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


Stellt das **attribute**‑Element aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Attribute liefern zusätzliche Informationen für andere Dokumentelemente. Das Attribut‑Tag ist zwischen den Tags eines Dokument‑Elements für das Schema verschachtelt. Das XML‑Dokument zeigt Attribute als benannte Elemente im öffnenden Tag eines Elements.

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | Gibt ein [XmlSchemaSimpleType](../xmlschemasimpletype/)‑Objekt zurück, das den Typ des Attributs basierend auf dem Wert von [XmlSchemaAttribute::get_SchemaType](./get_schematype/) oder [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) des Attributs darstellt. |
| [get_AttributeType](./get_attributetype/)() | Gibt das Objekt zurück, das auf dem Wert von [XmlSchemaAttribute::get_SchemaType](./get_schematype/) oder [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) des Attributs basiert und die nach der Kompilierung interpretierte **AttributeType**‑Wert enthält. |
| [get_DefaultValue](./get_defaultvalue/)() | Gibt den Standardwert für das Attribut zurück. |
| [get_FixedValue](./get_fixedvalue/)() | Gibt den festen Wert für das Attribut zurück. |
| [get_Form](./get_form/)() | Gibt die Form für das Attribut zurück. |
| [get_Name](./get_name/)() | Gibt den Namen des Attributs zurück. |
| [get_QualifiedName](./get_qualifiedname/)() | Gibt den qualifizierten Namen für das Attribut zurück. |
| [get_RefName](./get_refname/)() | Gibt den Namen eines im aktuellen Schema (oder einem anderen durch den angegebenen Namespace bezeichneten Schema) deklarierten Attributs zurück. |
| [get_SchemaType](./get_schematype/)() | Gibt den Attributtyp als einfachen Typ zurück. |
| [get_SchemaTypeName](./get_schematypename/)() | Gibt den Namen des in diesem Schema definierten einfachen Typs zurück (oder eines anderen Schemas, das durch den angegebenen Namespace angegeben wird). |
| [get_Use](./get_use/)() | Gibt Informationen darüber zurück, wie das Attribut verwendet wird. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Legt den Standardwert für das Attribut fest. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Legt den festen Wert für das Attribut fest. |
| [set_Form](./set_form/)(XmlSchemaForm) | Legt die Form für das Attribut fest. |
| [set_Name](./set_name/)(const String\&) | Legt den Namen des Attributs fest. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Legt den Namen eines im Schema deklarierten Attributs fest (oder eines anderen Schemas, das durch den angegebenen Namespace angegeben wird). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Legt den Attributtyp auf einen einfachen Typ fest. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Legt den Namen des in diesem Schema definierten einfachen Typs fest (oder eines anderen Schemas, das durch den angegebenen Namespace angegeben wird). |
| [set_Use](./set_use/)(XmlSchemaUse) | Legt Informationen darüber fest, wie das Attribut verwendet wird. |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaAttribute](./). |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
