---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs कंस्ट्रक्टर"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs कन्स्ट्रक्टर। C++ में XmlNodeChangedEventArgs क्लास का नया उदाहरण आरंभ करता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


[XmlNodeChangedEventArgs](../) क्लास का नया उदाहरण आरंभ करता है।

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | इवेंट उत्पन्न करने वाला [XmlNode](../../xmlnode/)। |
| oldParent | const SharedPtr\<XmlNode\>\& | इवेंट उत्पन्न करने वाले [XmlNode](../../xmlnode/) का पुराना पैरेंट [XmlNode](../../xmlnode/)। |
| newParent | const SharedPtr\<XmlNode\>\& | इवेंट उत्पन्न करने वाले [XmlNode](../../xmlnode/) का नया पैरेंट [XmlNode](../../xmlnode/)। |
| oldValue | const String\& | इवेंट उत्पन्न करने वाले [XmlNode](../../xmlnode/) का पुराना मान। |
| newValue | const String\& | इवेंट उत्पन्न करने वाले [XmlNode](../../xmlnode/) का नया मान। |
| action | XmlNodeChangedAction | यह [XmlNodeChangedAction](../../xmlnodechangedaction/)। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
