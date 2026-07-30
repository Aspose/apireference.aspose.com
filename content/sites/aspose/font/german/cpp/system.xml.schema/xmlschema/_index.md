---
title: "System::Xml::Schema::XmlSchema Klasse"
linktitle: "XmlSchema"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchema Klasse. Eine In‑Memory‑Darstellung eines XML‑Schemas, wie vom World Wide Web Consortium (W3C) und in C++ spezifiziert."
type: docs
weight: 400
url: /de/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


Eine In‑Memory‑Darstellung eines XML [Schema](../), wie vom World Wide [Web](../../system.web/) Consortium (W3C) [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) und [XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/) spezifiziert.

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | Kompiliert das XML [Schema](../)[Object](../../system/object/) Modell (SOM) in Schemainformationen zur Validierung. Wird verwendet, um die syntaktische und semantische Struktur des programmgesteuert erstellten SOM zu prüfen. Die semantische Validierungsprüfung wird während der Kompilierung durchgeführt. |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | Kompiliert das XML [Schema](../)[Object](../../system/object/) Modell (SOM) in Schemainformationen zur Validierung. Wird verwendet, um die syntaktische und semantische Struktur des programmgesteuert erstellten SOM zu prüfen. Die semantische Validierungsprüfung wird während der Kompilierung durchgeführt. |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | Gibt die Form für Attribute zurück, die im Ziel‑Namespace des Schemas deklariert sind. |
| [get_AttributeGroups](./get_attributegroups/)() | Gibt den nach der Schema‑Kompilierung ermittelten Wert aller globalen Attributgruppen im Schema zurück. |
| [get_Attributes](./get_attributes/)() | Gibt den nach der Schema‑Kompilierung ermittelten Wert aller Attribute im Schema zurück. |
| [get_BlockDefault](./get_blockdefault/)() | Gibt das Attribut **blockDefault** zurück, das den Standardwert des Attributs **block** für Elemente und komplexe Typen im **targetNamespace** des Schemas festlegt. |
| [get_ElementFormDefault](./get_elementformdefault/)() | Gibt die Form für Elemente zurück, die im Ziel‑Namespace des Schemas deklariert sind. |
| [get_Elements](./get_elements/)() | Gibt den nach der Schema‑Kompilierung ermittelten Wert aller Elemente im Schema zurück. |
| [get_FinalDefault](./get_finaldefault/)() | Gibt das Attribut **finalDefault** zurück, das den Standardwert des Attributs **final** für Elemente und komplexe Typen im Ziel‑Namespace des Schemas festlegt. |
| [get_Groups](./get_groups/)() | Gibt den nach der Schema‑Kompilierung ermittelten Wert aller Gruppen im Schema zurück. |
| [get_Id](./get_id/)() | Gibt die Zeichenketten‑ID zurück. |
| [get_Includes](./get_includes/)() | Gibt die Sammlung der eingeschlossenen und importierten Schemas zurück. |
| [get_IsCompiled](./get_iscompiled/)() | Zeigt an, ob das Schema kompiliert wurde. |
| [get_Items](./get_items/)() | Gibt die Sammlung der Schema‑Elemente im Schema zurück und wird verwendet, um neue Elementtypen auf **schema**‑Elementebene hinzuzufügen. |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | Gibt die Zeilennummer in der Datei zurück, auf die sich das **schema**‑Element bezieht. |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | Gibt die Zeilenposition in der Datei zurück, auf die sich das **schema**‑Element bezieht. |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | Gibt die XmlSerializerNamespaces zurück, die mit diesem Schema‑Objekt verwendet werden sollen. |
| [get_Notations](./get_notations/)() | Gibt den nach der Schema‑Kompilierung ermittelten Wert aller Notationen im Schema zurück. |
| [get_Parent](../xmlschemaobject/get_parent/)() | Gibt das übergeordnete Element dieses [XmlSchemaObject](../xmlschemaobject/) zurück. |
| [get_SchemaTypes](./get_schematypes/)() | Gibt den nach der Schema‑Kompilierung ermittelten Wert aller Schematypen im Schema zurück. |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | Gibt den Quellort der Datei zurück, die das Schema geladen hat. |
| [get_TargetNamespace](./get_targetnamespace/)() | Gibt den Uniform Resource Identifier (URI) des Zielnamensraums des Schemas zurück. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Gibt die qualifizierten Attribute zurück, die nicht zum Zielnamensraum des Schemas gehören. |
| [get_Version](./get_version/)() | Gibt die Version des Schemas zurück. |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | Liest ein XML [Schema](../) aus dem bereitgestellten [IO::TextReader](../../system.io/textreader/). |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | Liest ein XML [Schema](../) aus dem bereitgestellten Stream. |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | Liest ein XML [Schema](../) aus dem bereitgestellten [XmlReader](../../system.xml/xmlreader/). |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | Setzt die Form für Attribute, die im Zielnamensraum des Schemas deklariert sind. |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | Setzt das Attribut **blockDefault**, das den Standardwert des Attributs **block** für Elemente und komplexe Typen im **targetNamespace** des Schemas festlegt. |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | Setzt die Form für Elemente, die im Zielnamensraum des Schemas deklariert sind. |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | Setzt das Attribut **finalDefault**, das den Standardwert des Attributs **final** für Elemente und komplexe Typen im Zielnamensraum des Schemas festlegt. |
| [set_Id](./set_id/)(const String\&) | Setzt die String-ID. |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | Setzt die Zeilennummer in der Datei, auf die das **schema**-Element verweist. |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | Setzt die Zeilenposition in der Datei, auf die das **schema**-Element verweist. |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Setzt die XmlSerializerNamespaces, die mit diesem Schemaobjekt verwendet werden sollen. |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Setzt das übergeordnete Element dieses [XmlSchemaObject](../xmlschemaobject/). |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | Setzt den Quellort für die Datei, die das Schema geladen hat. |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | Setzt den Uniform Resource Identifier (URI) des Zielnamensraums des Schemas. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Setzt die qualifizierten Attribute, die nicht zum Zielnamensraum des Schemas gehören. |
| [set_Version](./set_version/)(const String\&) | Setzt die Version des Schemas. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | Schreibt das XML [Schema](../) in den bereitgestellten Datenstream. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Schreibt das XML [Schema](../) in den bereitgestellten Stream unter Verwendung des angegebenen [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/). |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | Schreibt das XML [Schema](../) in den bereitgestellten [IO::TextWriter](../../system.io/textwriter/). |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Schreibt das XML [Schema](../) in den bereitgestellten TextWriter. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | Schreibt das XML [Schema](../) in den bereitgestellten [XmlWriter](../../system.xml/xmlwriter/). |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Schreibt das XML [Schema](../) in den bereitgestellten [XmlWriter](../../system.xml/xmlwriter/). |
| [XmlSchema](./xmlschema/)() | Initialisiert eine neue Instanz der Klasse [XmlSchema](./). |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaObject](../xmlschemaobject/). |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | Der XML-Schema-Instanz-Namespace. Dieses Feld ist konstant. |
| static [Namespace](./namespace/) | Der XML-Schema-Namespace. Dieses Feld ist konstant. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
