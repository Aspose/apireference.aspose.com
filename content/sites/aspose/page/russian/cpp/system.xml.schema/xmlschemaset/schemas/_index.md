---
title: "System::Xml::Schema::XmlSchemaSet::Schemas method"
linktitle: "Схемы"
second_title: "Aspose.Page для C++"
description: "System::Xml::Schema::XmlSchemaSet::Schemas method. Возвращает коллекцию всех схем языка определения XML Schema (XSD) в XmlSchemaSet на C++."
type: docs
weight: 1600
url: /ru/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


Возвращает коллекцию всех схем XML [Schema](../../) языка определения (XSD) в [XmlSchemaSet](../).

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

Объект IList, содержащий все схемы, добавленные в [XmlSchemaSet](../). Если в [XmlSchemaSet](../) не добавлено схем, возвращается пустая коллекция.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


Возвращает коллекцию всех схем XML [Schema](../../) языка определения (XSD) в [XmlSchemaSet](../), принадлежащих заданному пространству имён.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| targetNamespace | String | Свойство схемы **targetNamespace**. |

### ReturnValue

Объект IList, содержащий все схемы, добавленные в [XmlSchemaSet](../) и принадлежащие заданному пространству имён. Если в [XmlSchemaSet](../) не добавлено схем, возвращается пустая коллекция.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
