---
title: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator yapıcı"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator yapıcı. C++'ta XmlSchemaValidator sınıfının yeni bir örneğini başlatır."
type: docs
weight: 100
url: /tr/cpp/system.xml.schema/xmlschemavalidator/xmlschemavalidator/
---
## XmlSchemaValidator::XmlSchemaValidator constructor


[XmlSchemaValidator](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator(const SharedPtr<XmlNameTable> &nameTable, const SharedPtr<XmlSchemaSet> &schemas, const SharedPtr<IXmlNamespaceResolver> &namespaceResolver, XmlSchemaValidationFlags validationFlags)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| nameTable | const SharedPtr\<XmlNameTable\>\& | Eleman ve öznitelik adlarını atomize edilmiş dizgeler olarak içeren bir [XmlNameTable](../../../system.xml/xmlnametable/) nesnesi. |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | Doğrulama için kullanılan XML [Schema](../../) Tanım Dili (XSD) şemalarını içeren bir [XmlSchemaSet](../../xmlschemaset/) nesnesi. |
| namespaceResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | Doğrulama sırasında karşılaşılan ad alanlarını çözmek için kullanılan bir [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) nesnesi. |
| validationFlags | XmlSchemaValidationFlags | Şema doğrulama seçeneklerini belirten bir [XmlSchemaValidationFlags](../../xmlschemavalidationflags/) değeri. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Enum [XmlSchemaValidationFlags](../../xmlschemavalidationflags/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
