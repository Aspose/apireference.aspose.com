---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess метод"
linktitle: "Повторно обработать"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess метод. Повторно обрабатывает схему языка определения XML Schema (XSD), уже существующую в XmlSchemaSet в C++."
type: docs
weight: 1500
url: /ru/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


Повторно обрабатывает схему XML [Schema](../../) (XSD), уже существующую в [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| схема | SharedPtr\<XmlSchema\> | Схема для повторной обработки. |

### ReturnValue

Объект [XmlSchema](../../xmlschema/), если схема является действительной. Если схема недействительна и указан [ValidationEventHandler](../../validationeventhandler/), возвращается **nullptr** и генерируется соответствующее событие проверки. В противном случае бросается [XmlSchemaException](../../xmlschemaexception/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
