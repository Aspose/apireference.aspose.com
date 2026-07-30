---
title: "System::Xml::Schema::XmlSchemaSet::Contains method"
linktitle: "Contains"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaSet::Contains method. Указывает, находится ли указанный объект XmlSchema языка определения XML Schema (XSD) в XmlSchemaSet в C++."
type: docs
weight: 400
url: /ru/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


Указывает, находится ли указанный объект [XmlSchema](../../xmlschema/) языка определения XML [Schema](../../) (XSD) в [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Объект [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Contains(String) method


Указывает, находится ли XML [Schema](../../) языка определения (XSD) схема с указанным целевым URI пространства имён в [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| targetNamespace | String | Свойство схемы **targetNamespace**. |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## См. также

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
