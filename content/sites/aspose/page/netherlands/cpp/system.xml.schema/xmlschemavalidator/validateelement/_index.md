---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement methode"
linktitle: "ValidateElement"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement methode. Valideert het element in de huidige context in C++."
type: docs
weight: 1700
url: /nl/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Valideert het element in de huidige context.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | const String\& | De lokale naam van het te valideren element. |
| namespaceUri | const String\& | De namespace-URI van het te valideren element. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Een [XmlSchemaInfo](../../xmlschemainfo/) object waarvan de eigenschappen worden ingesteld bij succesvolle validatie van de naam van het element. Deze parameter kan **nullptr** zijn. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


Valideert het element in de huidige context met de opgegeven **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation**- en **xsi:NoNamespaceSchemaLocation**‑attribuutwaarden.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | const String\& | De lokale naam van het te valideren element. |
| namespaceUri | const String\& | De namespace-URI van het te valideren element. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Een [XmlSchemaInfo](../../xmlschemainfo/) object waarvan de eigenschappen worden ingesteld bij succesvolle validatie van de naam van het element. Deze parameter kan **nullptr** zijn. |
| xsiType | const String\& | De **xsi:Type** attribuutwaarde van het element. Deze parameter kan **nullptr** zijn. |
| xsiNil | const String\& | De **xsi:Nil** attribuutwaarde van het element. Deze parameter kan **nullptr** zijn. |
| xsiSchemaLocation | const String\& | De **xsi:SchemaLocation** attribuutwaarde van het element. Deze parameter kan **nullptr** zijn. |
| xsiNoNamespaceSchemaLocation | const String\& | De **xsi:NoNamespaceSchemaLocation** attribuutwaarde van het element. Deze parameter kan **nullptr** zijn. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
