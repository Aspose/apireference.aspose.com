---
title: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator constructor"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator constructor. Initialiseert een nieuw exemplaar van de XmlSchemaValidator-klasse in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml.schema/xmlschemavalidator/xmlschemavalidator/
---
## XmlSchemaValidator::XmlSchemaValidator constructor


Initialiseert een nieuw exemplaar van de [XmlSchemaValidator](../) klasse.

```cpp
System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator(const SharedPtr<XmlNameTable> &nameTable, const SharedPtr<XmlSchemaSet> &schemas, const SharedPtr<IXmlNamespaceResolver> &namespaceResolver, XmlSchemaValidationFlags validationFlags)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| nameTable | const SharedPtr\<XmlNameTable\>\& | Een [XmlNameTable](../../../system.xml/xmlnametable/) object dat element- en attribuutnamen bevat als geatomiseerde strings. |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | Een [XmlSchemaSet](../../xmlschemaset/) object dat de XML [Schema](../../) Definition Language (XSD)-schema's bevat die worden gebruikt voor validatie. |
| namespaceResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | Een [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) object dat wordt gebruikt voor het oplossen van namespaces die tijdens validatie worden aangetroffen. |
| validationFlags | XmlSchemaValidationFlags | Een [XmlSchemaValidationFlags](../../xmlschemavalidationflags/) waarde die schema-validatieopties specificeert. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Enum [XmlSchemaValidationFlags](../../xmlschemavalidationflags/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
