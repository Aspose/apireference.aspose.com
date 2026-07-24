---
title: "System::Xml::XPath::XPathNavigator::Select विधि"
linktitle: "चयन"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::Select विधि। निर्दिष्ट XPathExpression का उपयोग करके C++ में एक नोड सेट का चयन करता है।"
type: docs
weight: 7100
url: /hi/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


निर्दिष्ट [XPathExpression](../../xpathexpression/) का उपयोग करके एक नोड सेट का चयन करता है।

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | एक संकलित [XPath](../../) क्वेरी युक्त [XPathExpression](../../xpathexpression/) ऑब्जेक्ट। |

### ReturnValue

एक [XPathNodeIterator](../../xpathnodeiterator/) जो चयनित नोड सेट की ओर संकेत करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String) method


निर्दिष्ट [XPath](../../) अभिव्यक्ति का उपयोग करके एक नोड सेट का चयन करता है।

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | String | [XPath](../../) अभिव्यक्ति को दर्शाने वाला एक [String](../../../system/string/)। |

### ReturnValue

एक [XPathNodeIterator](../../xpathnodeiterator/) जो चयनित नोड सेट की ओर संकेत करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


निर्दिष्ट [XPath](../../) अभिव्यक्ति का उपयोग करके एक नोड सेट का चयन करता है, साथ ही नेमस्पेस प्रीफ़िक्स को हल करने के लिए निर्दिष्ट [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट का उपयोग करता है।

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | String | [XPath](../../) अभिव्यक्ति को दर्शाने वाला एक [String](../../../system/string/)। |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | नेमस्पेस प्रीफ़िक्स को हल करने के लिए उपयोग किया गया [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट। |

### ReturnValue

एक [XPathNodeIterator](../../xpathnodeiterator/) जो चयनित नोड सेट की ओर संकेत करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
