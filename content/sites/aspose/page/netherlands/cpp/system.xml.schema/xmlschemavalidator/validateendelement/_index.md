---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement methode"
linktitle: "ValidateEndElement"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement methode. Verifieert of de tekstinhoud van het element geldig is volgens het gegevenstype voor elementen met eenvoudige inhoud, en verifieert of de inhoud van het huidige element compleet is voor elementen met complexe inhoud in C++."
type: docs
weight: 1800
url: /nl/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


Controleert of de tekstinhoud van het element geldig is volgens het gegevenstype voor elementen met eenvoudige inhoud, en controleert of de inhoud van het huidige element volledig is voor elementen met complexe inhoud.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Een [XmlSchemaInfo](../../xmlschemainfo/) object waarvan de eigenschappen worden ingesteld bij succesvolle validatie van het element. Deze parameter kan **nullptr** zijn. |

### ReturnValue

De geparseerde, getypte tekstwaarde van het element als het element eenvoudige inhoud heeft.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


Controleert of de tekstinhoud van het opgegeven element geldig is volgens het gegevenstype.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Een [XmlSchemaInfo](../../xmlschemainfo/) object waarvan de eigenschappen worden ingesteld bij succesvolle validatie van de tekstinhoud van het element. Deze parameter kan **nullptr** zijn. |
| typedValue | const SharedPtr\<Object\>\& | De getypte tekstinhoud van het element. |

### ReturnValue

De geparseerde, getypte eenvoudige inhoud van het element.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
