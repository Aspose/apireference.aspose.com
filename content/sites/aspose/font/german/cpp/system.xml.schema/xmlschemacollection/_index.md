---
title: "System::Xml::Schema::XmlSchemaCollection Klasse"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaCollection Klasse. Enthält einen Cache von XML Schema-Definitionssprache (XSD) und XML-Data Reduced (XDR) Schemas in C++."
type: docs
weight: 1500
url: /de/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


Enthält einen Cache von XML [Schema](../)-Definitionssprache (XSD) und XML-Data Reduced (XDR) Schemas.

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Fügt das Schema, das über die angegebene URL gefunden wird, zur Schemasammlung hinzu. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | Fügt das im [XmlReader](../../system.xml/xmlreader/) enthaltene Schema zur Schemasammlung hinzu. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Fügt das im [XmlReader](../../system.xml/xmlreader/) enthaltene Schema zur Schemasammlung hinzu. Der angegebene [XmlResolver](../../system.xml/xmlresolver/) wird verwendet, um externe Ressourcen aufzulösen. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Fügt das [XmlSchema](../xmlschema/) zur Sammlung hinzu. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Fügt das [XmlSchema](../xmlschema/) zur Sammlung hinzu. Der angegebene [XmlResolver](../../system.xml/xmlresolver/) wird verwendet, um externe Verweise aufzulösen. |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | Fügt alle im übergebenen Sammlung definierten Namespaces (einschließlich ihrer zugehörigen Schemas) zu dieser Sammlung hinzu. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Gibt einen Wert zurück, der angibt, ob das **targetNamespace** des angegebenen [XmlSchema](../xmlschema/) in der Sammlung enthalten ist. |
| [Contains](./contains/)(const String\&) | Gibt einen Wert zurück, der angibt, ob ein Schema mit dem angegebenen Namespace in der Sammlung enthalten ist. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Kopiert alle [XmlSchema](../xmlschema/)-Objekte aus dieser Sammlung in das angegebene Array, beginnend beim angegebenen Index. |
| [get_Count](./get_count/)() | Gibt die Anzahl der in dieser Sammlung definierten Namespaces zurück. |
| [get_NameTable](./get_nametable/)() | Gibt die standardmäßige [XmlNameTable](../../system.xml/xmlnametable/) zurück, die von der [XmlSchemaCollection](./) beim Laden neuer Schemas verwendet wird. |
| [GetEnumerator](./getenumerator/)() override | Bietet Unterstützung für die Iteration über die Sammlung von Schemas. |
| [idx_get](./idx_get/)(const String\&) | Gibt das mit dem angegebenen Namespace-URI verknüpfte [XmlSchema](../xmlschema/) zurück. |
| [XmlSchemaCollection](./xmlschemacollection/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaCollection](./). |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | Initialisiert eine neue Instanz der Klasse [XmlSchemaCollection](./) mit der angegebenen [XmlNameTable](../../system.xml/xmlnametable/). Die [XmlNameTable](../../system.xml/xmlnametable/) wird beim Laden von Schemas verwendet. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise


## Deprecated
Die Klasse XmlSchemaCollection ist veraltet. Verwenden Sie stattdessen XmlSchemaSet.

Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
