---
title: "System::Xml::XPath::XPathNavigator::CheckValidity‑metod"
linktitle: "CheckValidity"
second_title: "Aspose.Page för C++"
description: "System::Xml::XPath::XPathNavigator::CheckValidity‑metod. Verifierar att XML‑data i XPathNavigator överensstämmer med XML‑Schema definitionsspråket (XSD) schema som tillhandahålls i C++."
type: docs
weight: 300
url: /sv/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


Verifierar att XML‑data i [XPathNavigator](../) överensstämmer med XML‑[Schema](../../../system.xml.schema/) definitionsspråket (XSD) schema som tillhandahålls.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | XmlSchemaSet‑uppsättningen som innehåller scheman som används för att validera XML‑data som finns i [XPathNavigator](../). |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | ValidationEventHandler som tar emot information om varningar och fel vid schemavalidering. |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
