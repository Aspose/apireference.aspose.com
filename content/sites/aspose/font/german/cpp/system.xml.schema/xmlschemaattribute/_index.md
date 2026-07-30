---
title: "System::Xml::Schema::XmlSchemaAttribute Klasse"
linktitle: "XmlSchemaAttribute"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaAttribute Klasse. Stellt das Attribut-Element aus dem XML Schema dar, wie vom World Wide Web Consortium (W3C) spezifiziert. Attribute liefern zusätzliche Informationen für andere Dokumentelemente. Das Attribut-Tag ist zwischen den Tags eines Dokument-Elements für das Schema verschachtelt. Das XML-Dokument zeigt Attribute als benannte Elemente im öffnenden Tag eines Elements in C++ an."
type: docs
weight: 1100
url: /de/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


Stellt das **attribute**-Element aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) spezifiziert. Attribute liefern zusätzliche Informationen für andere Dokumentelemente. Das Attribut-Tag ist zwischen den Tags eines Dokument-Elements für das Schema verschachtelt. Das XML-Dokument zeigt Attribute als benannte Elemente im öffnenden Tag eines Elements an.

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | Gibt ein [XmlSchemaSimpleType](../xmlschemasimpletype/) Objekt zurück, das den Typ des Attributs basierend auf dem Wert von [XmlSchemaAttribute::get_SchemaType](./get_schematype/) oder [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) des Attributs darstellt. |
| [get_AttributeType](./get_attributetype/)() | Gibt das Objekt zurück, das auf dem Wert von [XmlSchemaAttribute::get_SchemaType](./get_schematype/) oder [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) des Attributs basiert und die nach der Kompilierung erhaltene Interpretation des **AttributeType**-Werts enthält. |
| [get_DefaultValue](./get_defaultvalue/)() | Gibt den Standardwert für das Attribut zurück. |
| [get_FixedValue](./get_fixedvalue/)() | Gibt den festen Wert für das Attribut zurück. |
| [get_Form](./get_form/)() | Gibt die Form für das Attribut zurück. |
| [get_Name](./get_name/)() | Gibt den Namen des Attributs zurück. |
| [get_QualifiedName](./get_qualifiedname/)() | Gibt den qualifizierten Namen für das Attribut zurück. |
| [get_RefName](./get_refname/)() | Gibt den Namen eines im aktuellen Schema (oder einem anderen durch den angegebenen Namespace angegebenen Schema) deklarierten Attributs zurück. |
| [get_SchemaType](./get_schematype/)() | Gibt den Attributtyp als einfachen Typ zurück. |
| [get_SchemaTypeName](./get_schematypename/)() | Gibt den Namen des im aktuellen Schema (oder einem anderen durch den angegebenen Namespace angegebenen Schema) definierten einfachen Typs zurück. |
| [get_Use](./get_use/)() | Gibt Informationen darüber zurück, wie das Attribut verwendet wird. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Setzt den Standardwert für das Attribut. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Setzt den festen Wert für das Attribut. |
| [set_Form](./set_form/)(XmlSchemaForm) | Setzt die Form für das Attribut. |
| [set_Name](./set_name/)(const String\&) | Setzt den Namen des Attributs. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Setzt den Namen eines im aktuellen Schema (oder einem anderen durch den angegebenen Namespace angegebenen Schema) deklarierten Attributs. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Setzt den Attributtyp auf einen einfachen Typ. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Setzt den Namen des im aktuellen Schema (oder einem anderen durch den angegebenen Namespace angegebenen Schema) definierten einfachen Typs. |
| [set_Use](./set_use/)(XmlSchemaUse) | Legt Informationen darüber fest, wie das Attribut verwendet wird. |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaAttribute](./). |
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
