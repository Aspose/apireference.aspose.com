---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement method"
linktitle: "ValidateEndElement"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement yöntemi. Basit içeriğe sahip öğeler için öğenin metin içeriğinin veri tipine göre geçerli olup olmadığını doğrular ve karmaşık içeriğe sahip öğeler için geçerli öğenin içeriğinin tamamlanıp tamamlanmadığını (C++) kontrol eder."
type: docs
weight: 1800
url: /tr/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


Basit içerikli öğeler için öğenin metin içeriğinin veri türüne göre geçerli olup olmadığını ve karmaşık içerikli öğeler için geçerli öğenin içeriğinin tamam olup olmadığını doğrular.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Öğenin başarılı doğrulaması sonucunda özellikleri ayarlanan bir [XmlSchemaInfo](../../xmlschemainfo/) nesnesi. Bu parametre **nullptr** olabilir. |

### ReturnValue

Öğe basit içerik içeriyorsa, ayrıştırılmış ve tiplenmiş metin değeri.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


Belirtilen öğenin metin içeriğinin veri türüne göre geçerli olup olmadığını doğrular.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Öğenin metin içeriğinin başarılı doğrulaması sonucunda özellikleri ayarlanan bir [XmlSchemaInfo](../../xmlschemainfo/) nesnesi. Bu parametre **nullptr** olabilir. |
| typedValue | const SharedPtr\<Object\>\& | Öğenin tiplenmiş metin içeriği. |

### ReturnValue

Öğenin ayrıştırılmış ve tiplenmiş basit içeriği.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
