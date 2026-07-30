---
title: "System::Xml::Schema::XmlSchemaRedefine Klasse"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaRedefine Klasse. Stellt das redefine-Element aus XML Schema dar, wie vom World Wide Web Consortium (W3C) spezifiziert. Diese Klasse kann verwendet werden, um einfache und komplexe Typen, Gruppen und Attributgruppen aus externen Schemadateien im aktuellen Schema neu zu definieren. Sie kann außerdem verwendet werden, um Versionierung für die Schemaelemente in C++ bereitzustellen."
type: docs
weight: 5600
url: /de/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


Stellt das **redefine**-Element aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) spezifiziert. Diese Klasse kann verwendet werden, um einfache und komplexe Typen, Gruppen und Attributgruppen aus externen Schemadateien im aktuellen Schema neu zu definieren. Sie kann außerdem verwendet werden, um Versionierung für die Schemaelemente bereitzustellen.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | Gibt die [XmlSchemaObjectTable](../xmlschemaobjecttable/)-Tabelle zurück, die für alle Attribute im Schema die nach der Kompilierung interpretierte **AttributeGroups**-Wert enthält. |
| [get_Groups](./get_groups/)() | Gibt die [XmlSchemaObjectTable](../xmlschemaobjecttable/)-Tabelle zurück, die für alle Gruppen im Schema die nach der Kompilierung interpretierte **Groups**-Wert enthält. |
| [get_Items](./get_items/)() | Gibt die Sammlung der folgenden Klassen zurück: [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), und [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | Gibt die [XmlSchemaObjectTable](../xmlschemaobjecttable/)-Tabelle zurück, die für alle einfachen und komplexen Typen im Schema die nach der Kompilierung interpretierte **SchemaTypes**-Wert enthält. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaRedefine](./). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
