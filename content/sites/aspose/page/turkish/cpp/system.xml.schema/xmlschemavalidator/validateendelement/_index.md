---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement yöntemi"
linktitle: "ValidateEndElement"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement yöntemi. Basit içerikli öğeler için öğenin metin içeriğinin veri türüne göre geçerli olup olmadığını doğrular ve karmaşık içerikli öğeler için mevcut öğenin içeriğinin tamamlanmış olup olmadığını doğrular C++ içinde."
type: docs
weight: 1800
url: /tr/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


Basit içerikli öğeler için öğenin metin içeriğinin veri türüne göre geçerli olup olmadığını ve karmaşık içerikli öğeler için geçerli öğenin içeriğinin tam olup olmadığını doğrular.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Öğenin başarılı doğrulaması sonrasında özellikleri ayarlanan bir [XmlSchemaInfo](../../xmlschemainfo/) nesnesi. Bu parametre **nullptr** olabilir. |

### ReturnValue

Öğe basit içeriğe sahipse, ayrıştırılmış, tiplenmiş metin değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


Belirtilen öğenin metin içeriğinin veri türüne göre geçerli olup olmadığını doğrular.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Öğenin metin içeriğinin başarılı doğrulaması sonrasında özellikleri ayarlanan bir [XmlSchemaInfo](../../xmlschemainfo/) nesnesi. Bu parametre **nullptr** olabilir. |
| typedValue | const SharedPtr\<Object\>\& | Öğenin tiplenmiş metin içeriği. |

### ReturnValue

Öğenin ayrıştırılmış, tiplenmiş basit içeriği.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
