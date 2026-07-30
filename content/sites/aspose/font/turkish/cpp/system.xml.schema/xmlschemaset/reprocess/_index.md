---
title: "System::Xml::Schema::XmlSchemaSet::Reprocess yöntemi"
linktitle: "Yeniden İşle"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaSet::Reprocess yöntemi. C++'da XmlSchemaSet içinde zaten mevcut olan bir XML Schema tanım dili (XSD) şemasını yeniden işler."
type: docs
weight: 1500
url: /tr/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


Zaten [XmlSchemaSet](../) içinde bulunan bir XML [Şema](../../) tanım dili (XSD) şemasını yeniden işler.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| şema | SharedPtr\<XmlSchema\> | Yeniden işlenecek şema. |

### ReturnValue

Şema geçerli bir şema ise bir [XmlSchema](../../xmlschema/) nesnesi. Şema geçerli değilse ve bir [ValidationEventHandler](../../validationeventhandler/) belirtilmişse, **nullptr** döndürülür ve uygun doğrulama olayı tetiklenir. Aksi takdirde, bir [XmlSchemaException](../../xmlschemaexception/) fırlatılır.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
