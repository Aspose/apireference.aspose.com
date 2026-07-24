---
title: "System::Xml::XPath::XPathNavigator::CheckValidity मेथड"
linktitle: "CheckValidity"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::CheckValidity method. सत्यापित करता है कि XPathNavigator में XML डेटा प्रदान किए गए C++ में XML Schema परिभाषा भाषा (XSD) स्कीमा के अनुरूप है।"
type: docs
weight: 300
url: /hi/cpp/system.xml.xpath/xpathnavigator/checkvalidity/
---
## XPathNavigator::CheckValidity method


सत्यापित करता है कि [XPathNavigator](../) में XML डेटा प्रदान किए गए XML [Schema](../../../system.xml.schema/) परिभाषा भाषा (XSD) स्कीमा के अनुरूप है।

```cpp
virtual bool System::Xml::XPath::XPathNavigator::CheckValidity(SharedPtr<System::Xml::Schema::XmlSchemaSet> schemas, System::Xml::Schema::ValidationEventHandler validationEventHandler)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| schemas | SharedPtr\<System::Xml::Schema::XmlSchemaSet\> | XmlSchemaSet जिसमें उन स्कीमा शामिल हैं जो [XPathNavigator](../) में मौजूद XML डेटा को मान्य करने के लिए उपयोग किए जाते हैं। |
| validationEventHandler | System::Xml::Schema::ValidationEventHandler | ValidationEventHandler जो स्कीमा मान्यकरण चेतावनियों और त्रुटियों के बारे में जानकारी प्राप्त करता है। |

### ReturnValue

**true** if no schema validation errors occurred; otherwise, **false**.

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../../../system.xml.schema/xmlschemaset/)
* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
