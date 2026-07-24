---
title: "System::Xml::XPath::XPathNavigator::CheckValidity metodo"
linktitle: "CheckValidity"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::XPath::XPathNavigator::CheckValidity. Verifica che i dati XML nel XPathNavigator siano conformi al linguaggio di definizione dello schema XML (XSD) fornito in C++."
type: docs
weight: 300
url: /it/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


Verifica che i dati XML nel [XPathNavigator](../) siano conformi al linguaggio di definizione dello [Schema](../../../system.xml.schema/) XML (XSD) fornito.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | Il XmlSchemaSet contenente gli schemi usati per convalidare i dati XML contenuti nel [XPathNavigator](../). |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | Il ValidationEventHandler che riceve informazioni sugli avvisi e sugli errori di convalida dello schema. |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
