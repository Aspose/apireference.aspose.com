---
title: "System::Xml::XPath::XPathNavigator::CheckValidity methode"
linktitle: "CheckValidity"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNavigator::CheckValidity methode. Verifieert dat de XML‑gegevens in de XPathNavigator voldoen aan het XML‑Schema definitietaal (XSD)‑schema dat is geleverd in C++."
type: docs
weight: 300
url: /nl/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


Verifieert dat de XML‑gegevens in de [XPathNavigator](../) voldoen aan de XML [Schema](../../../system.xml.schema/) definitietaal (XSD)‑schema die is geleverd.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | De XmlSchemaSet die de schema's bevat die worden gebruikt om de XML-gegevens te valideren die zich bevinden in de [XPathNavigator](../). |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | De ValidationEventHandler die informatie ontvangt over waarschuwingen en fouten bij schema-validatie. |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
