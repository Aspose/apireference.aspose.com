---
title: "System::Xml::XPath::XPathNavigator::CheckValidity Methode"
linktitle: "CheckValidity"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathNavigator::CheckValidity Methode. Überprüft, ob die XML-Daten im XPathNavigator dem in C++ bereitgestellten XML‑Schema-Definitionssprache (XSD)-Schema entsprechen."
type: docs
weight: 300
url: /de/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


Überprüft, ob die XML-Daten im [XPathNavigator](../) dem bereitgestellten XML [Schema](../../../system.xml.schema/) Definitionssprache (XSD)-Schema entsprechen.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | Das XmlSchemaSet, das die Schemas enthält, die zum Validieren der im [XPathNavigator](../) enthaltenen XML-Daten verwendet werden. |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | Der ValidationEventHandler, der Informationen über Warnungen und Fehler bei der Schemainvalidierung empfängt. |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
