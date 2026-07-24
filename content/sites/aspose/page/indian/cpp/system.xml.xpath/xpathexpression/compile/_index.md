---
title: "System::Xml::XPath::XPathExpression::Compile मेथड"
linktitle: "कम्पाइल"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathExpression::Compile मेथड। निर्दिष्ट XPath अभिव्यक्ति को संकलित करता है और C++ में XPath अभिव्यक्ति का प्रतिनिधित्व करने वाला XPathExpression ऑब्जेक्ट लौटाता है।"
type: docs
weight: 600
url: /hi/cpp/system.xml.xpath/xpathexpression/compile/
---
## XPathExpression::Compile(const String\&) method


निर्दिष्ट [XPath](../../) अभिव्यक्ति को संकलित करता है और एक [XPathExpression](../) ऑब्जेक्ट लौटाता है जो [XPath](../../) अभिव्यक्ति का प्रतिनिधित्व करता है।

```cpp
static SharedPtr<XPathExpression> System::Xml::XPath::XPathExpression::Compile(const String &xpath)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | const String\& | एक [XPath](../../) अभिव्यक्ति। |

### ReturnValue

एक [XPathExpression](../) ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../)
* Class [String](../../../system/string/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::Compile(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) method


निर्दिष्ट [XPath](../../) अभिव्यक्ति को संकलित करता है, साथ ही नेमस्पेस समाधान के लिए निर्दिष्ट [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट के साथ, और एक [XPathExpression](../) ऑब्जेक्ट लौटाता है जो [XPath](../../) अभिव्यक्ति का प्रतिनिधित्व करता है।

```cpp
static SharedPtr<XPathExpression> System::Xml::XPath::XPathExpression::Compile(const String &xpath, const SharedPtr<IXmlNamespaceResolver> &nsResolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | const String\& | एक [XPath](../../) अभिव्यक्ति। |
| nsResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | एक ऑब्जेक्ट जो नेमस्पेस समाधान के लिए [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) इंटरफ़ेस को लागू करता है। |

### ReturnValue

एक [XPathExpression](../) ऑब्जेक्ट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
