---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType methode"
linktitle: "ChangeType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType methode. Converteert de opgegeven waarde, waarvan het type een van de geldige representaties is van het XML‑schemas type dat wordt vertegenwoordigd door de XmlSchemaDatatype, naar het runtime‑type dat is opgegeven in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


Converteert de opgegeven waarde, waarvan het type een van de geldige representaties is van het XML‑schemas type dat wordt vertegenwoordigd door de [XmlSchemaDatatype](../), naar het opgegeven runtime‑type.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | SharedPtr\<Object\> | De invoerwaarde om te converteren naar het opgegeven type. |
| targetType | const TypeInfo\& | Het doelformaat om de invoerwaarde naar te converteren. |

### ReturnValue

De geconverteerde invoerwaarde.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Converteert de opgegeven waarde, waarvan het type een van de geldige representaties is van het XML‑schemas type dat wordt vertegenwoordigd door de [XmlSchemaDatatype](../../../system.xml/xmlnametable/), naar het opgegeven runtime‑type met behulp van de [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) als de [XmlSchemaDatatype](../) het **xs:QName**‑type vertegenwoordigt of een daarvan afgeleid type.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | SharedPtr\<Object\> | De invoerwaarde om te converteren naar het opgegeven type. |
| targetType | const TypeInfo\& | Het doelformaat om de invoerwaarde naar te converteren. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Een [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) die wordt gebruikt voor het oplossen van namespace‑prefixen. Dit is alleen nuttig als de [XmlSchemaDatatype](../) het **xs:QName**‑type vertegenwoordigt of een daarvan afgeleid type. |

### ReturnValue

De geconverteerde invoerwaarde.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
