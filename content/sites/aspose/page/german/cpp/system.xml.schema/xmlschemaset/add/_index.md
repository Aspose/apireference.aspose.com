---
title: "System::Xml::Schema::XmlSchemaSet::Add-Methode"
linktitle: "Add"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaSet::Add-Methode. Fügt das angegebene XmlSchema dem XmlSchemaSet in C++ hinzu."
type: docs
weight: 200
url: /de/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


Fügt das angegebene [XmlSchema](../../xmlschema/) zum [XmlSchemaSet](../) hinzu.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Das [XmlSchema](../../xmlschema/)-Objekt, das zum [XmlSchemaSet](../) hinzugefügt werden soll. |

### ReturnValue

Ein [XmlSchema](../../xmlschema/)-Objekt, wenn das Schema gültig ist. Wenn das Schema nicht gültig ist und ein [ValidationEventHandler](../../validationeventhandler/) angegeben wird, wird **nullptr** zurückgegeben und das entsprechende Validierungsereignis ausgelöst. Andernfalls wird eine [XmlSchemaException](../../xmlschemaexception/) ausgelöst.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


Fügt alle XML [Schema](../../) Definitionssprache (XSD)-Schemata im angegebenen [XmlSchemaSet](../) zum [XmlSchemaSet](../) hinzu.

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | Das [XmlSchemaSet](../)-Objekt. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


Fügt das XML [Schema](../../) Definitionssprache (XSD)-Schema, das im [XmlReader](../../../system.xml/xmlreader/) enthalten ist, zum [XmlSchemaSet](../) hinzu.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| targetNamespace | String | Der Schema-**targetNamespace**-Wert oder **nullptr**, um das im Schema angegebene **targetNamespace** zu verwenden. |
| schemaDocument | const SharedPtr\<XmlReader\>\& | Das [XmlReader](../../../system.xml/xmlreader/)-Objekt. |

### ReturnValue

Ein [XmlSchema](../../xmlschema/)-Objekt, wenn das Schema gültig ist. Wenn das Schema nicht gültig ist und ein [ValidationEventHandler](../../validationeventhandler/) angegeben wird, wird **nullptr** zurückgegeben und das entsprechende Validierungsereignis ausgelöst. Andernfalls wird eine [XmlSchemaException](../../xmlschemaexception/) ausgelöst.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


Fügt das XML [Schema](../../) Definitionssprache (XSD)-Schema an der angegebenen URL zum [XmlSchemaSet](../) hinzu.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| targetNamespace | String | Der Schema-**targetNamespace**-Wert oder **nullptr**, um das im Schema angegebene **targetNamespace** zu verwenden. |
| schemaUri | const String\& | Die URL, die das zu ladende Schema angibt. |

### ReturnValue

Ein [XmlSchema](../../xmlschema/)-Objekt, wenn das Schema gültig ist. Wenn das Schema nicht gültig ist und ein [ValidationEventHandler](../../validationeventhandler/) angegeben wird, wird **nullptr** zurückgegeben und das entsprechende Validierungsereignis ausgelöst. Andernfalls wird eine [XmlSchemaException](../../xmlschemaexception/) ausgelöst.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
