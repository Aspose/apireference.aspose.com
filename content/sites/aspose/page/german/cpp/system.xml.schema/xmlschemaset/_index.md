---
title: "System::Xml::Schema::XmlSchemaSet class"
linktitle: "XmlSchemaSet"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaSet class. Enthält einen Cache von XML‑Schema‑Definitionssprache (XSD)-Schemata in C++."
type: docs
weight: 5800
url: /de/cpp/system.xml.schema/xmlschemaset/
---
## XmlSchemaSet class


Enthält einen Cache von XML [Schema](../)-Definitionssprache (XSD)-Schemata.

```cpp
class XmlSchemaSet : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(String, const String\&) | Fügt das XML [Schema](../)-Definitionssprache (XSD)-Schema an der angegebenen URL zum [XmlSchemaSet](./) hinzu. |
| [Add](./add/)(String, const SharedPtr\<XmlReader\>\&) | Fügt das im [XmlReader](../../system.xml/xmlreader/) enthaltene XML [Schema](../)-Definitionssprache (XSD)-Schema zum [XmlSchemaSet](./) hinzu. |
| [Add](./add/)(const SharedPtr\<XmlSchemaSet\>\&) | Fügt alle XML [Schema](../)-Definitionssprache (XSD)-Schemata im angegebenen [XmlSchemaSet](./) zum [XmlSchemaSet](./) hinzu. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Fügt das angegebene [XmlSchema](../xmlschema/) zum [XmlSchemaSet](./) hinzu. |
| [Compile](./compile/)() | Kompiliert die zum [XmlSchemaSet](./) hinzugefügten XML [Schema](../)-Definitionssprache (XSD)-Schemata zu einem logischen Schema. |
| [Contains](./contains/)(String) | Gibt an, ob ein XML [Schema](../)-Definitionssprache (XSD)-Schema mit dem angegebenen Ziel‑Namensraum‑URI im [XmlSchemaSet](./) enthalten ist. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Gibt an, ob das angegebene XML [Schema](../)-Definitionssprache (XSD) [XmlSchema](../xmlschema/)-Objekt im [XmlSchemaSet](./) enthalten ist. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Kopiert alle [XmlSchema](../xmlschema/)-Objekte vom [XmlSchemaSet](./) in das angegebene Array, beginnend beim angegebenen Index. |
| [get_CompilationSettings](./get_compilationsettings/)() | Gibt die [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) für das [XmlSchemaSet](./) zurück. |
| [get_Count](./get_count/)() | Gibt die Anzahl der logischen XML-[Schema](../)-Definitionssprache (XSD)-Schemata im [XmlSchemaSet](./) zurück. |
| [get_GlobalAttributes](./get_globalattributes/)() | Gibt alle globalen Attribute in allen XML-[Schema](../)-Definitionssprache (XSD)-Schemata im [XmlSchemaSet](./) zurück. |
| [get_GlobalElements](./get_globalelements/)() | Gibt alle globalen Elemente in allen XML-[Schema](../)-Definitionssprache (XSD)-Schemata im [XmlSchemaSet](./) zurück. |
| [get_GlobalTypes](./get_globaltypes/)() | Gibt alle globalen einfachen und komplexen Typen in allen XML-[Schema](../)-Definitionssprache (XSD)-Schemata im [XmlSchemaSet](./) zurück. |
| [get_IsCompiled](./get_iscompiled/)() | Gibt einen Wert zurück, der angibt, ob die XML-[Schema](../)-Definitionssprache (XSD)-Schemata im [XmlSchemaSet](./) kompiliert wurden. |
| [get_NameTable](./get_nametable/)() | Gibt die standardmäßige [XmlNameTable](../../system.xml/xmlnametable/) zurück, die vom [XmlSchemaSet](./) beim Laden neuer XML-[Schema](../)-Definitionssprache (XSD)-Schemata verwendet wird. |
| [Remove](./remove/)(const SharedPtr\<XmlSchema\>\&) | Entfernt das angegebene XML-[Schema](../)-Definitionssprache (XSD)-Schema aus dem [XmlSchemaSet](./). |
| [RemoveRecursive](./removerecursive/)(const SharedPtr\<XmlSchema\>\&) | Entfernt das angegebene XML-[Schema](../)-Definitionssprache (XSD)-Schema und alle von ihm importierten Schemata aus dem [XmlSchemaSet](./). |
| [Reprocess](./reprocess/)(SharedPtr\<XmlSchema\>) | Verarbeitet ein bereits im [XmlSchemaSet](./) vorhandenes XML-[Schema](../)-Definitionssprache (XSD)-Schema erneut. |
| [Schemas](./schemas/)() | Gibt eine Sammlung aller XML-[Schema](../)-Definitionssprache (XSD)-Schemata im [XmlSchemaSet](./) zurück. |
| [Schemas](./schemas/)(String) | Gibt eine Sammlung aller XML-[Schema](../)-Definitionssprache (XSD)-Schemata im [XmlSchemaSet](./) zurück, die zum angegebenen Namespace gehören. |
| [set_CompilationSettings](./set_compilationsettings/)(const SharedPtr\<XmlSchemaCompilationSettings\>\&) | Legt die [XmlSchemaCompilationSettings](../xmlschemacompilationsettings/) für das [XmlSchemaSet](./) fest. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Legt den [XmlResolver](../../system.xml/xmlresolver/) fest, der zum Auflösen von Namespaces oder Standorten verwendet wird, die in Include- und Import-Elementen eines Schemas referenziert werden. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Fügt einen Ereignishandler hinzu, um Informationen über XML-[Schema](../)-Definitionssprache (XSD)-Schemavalidierungsfehler zu erhalten. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Entfernt einen Ereignishandler, der Informationen über XML-[Schema](../)-Definitionssprache (XSD)-Schemavalidierungsfehler bereitstellt. |
| [XmlSchemaSet](./xmlschemaset/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaSet](./). |
| [XmlSchemaSet](./xmlschemaset/)(const SharedPtr\<XmlNameTable\>\&) | Initialisiert eine neue Instanz der Klasse [XmlSchemaSet](./) mit der angegebenen [XmlNameTable](../../system.xml/xmlnametable/). |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
