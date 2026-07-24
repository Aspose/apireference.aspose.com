---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute methode"
linktitle: "ValidateAttribute"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute methode. Valideert de attribuutnaam, namespace-URI en waarde in de huidige elementcontext in C++."
type: docs
weight: 1600
url: /nl/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Valideert de attribuutnaam, namespace‑URI en waarde in de huidige elementcontext.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | const String\& | De lokale naam van het attribuut dat moet worden gevalideerd. |
| namespaceUri | const String\& | De namespace-URI van het attribuut dat moet worden gevalideerd. |
| attributeValue | const String\& | De waarde van het attribuut dat moet worden gevalideerd. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Een [XmlSchemaInfo](../../xmlschemainfo/) object waarvan de eigenschappen worden ingesteld bij succesvolle validatie van het attribuut. Deze parameter kan **nullptr** zijn. |

### ReturnValue

De waarde van het gevalideerde attribuut.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


Valideert de attribuutnaam, namespace‑URI en waarde in de huidige elementcontext.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | const String\& | De lokale naam van het attribuut dat moet worden gevalideerd. |
| namespaceUri | const String\& | De namespace-URI van het attribuut dat moet worden gevalideerd. |
| attributeValue | XmlValueGetter | Een [XmlValueGetter](../../xmlvaluegetter/) callback die wordt gebruikt om de waarde van het attribuut door te geven als een type dat compatibel is met het XML [Schema](../../) Definition Language (XSD)-type van het attribuut. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Een [XmlSchemaInfo](../../xmlschemainfo/) object waarvan de eigenschappen worden ingesteld bij succesvolle validatie van het attribuut. Deze parameter kan **nullptr** zijn. |

### ReturnValue

De waarde van het gevalideerde attribuut.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
