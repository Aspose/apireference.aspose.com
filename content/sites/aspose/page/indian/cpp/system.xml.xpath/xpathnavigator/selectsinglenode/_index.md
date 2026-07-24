---
title: "System::Xml::XPath::XPathNavigator::SelectSingleNode method"
linktitle: "SelectSingleNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::SelectSingleNode method. निर्दिष्ट [XPathExpression](../../xpathexpression/) ऑब्जेक्ट का उपयोग करके C++ में XPathNavigator में एकल नोड का चयन करता है।"
type: docs
weight: 7500
url: /hi/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


[XPathNavigator](../) में निर्दिष्ट [XPathExpression](../../xpathexpression/) ऑब्जेक्ट का उपयोग करके एकल नोड का चयन करता है।

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | एक संकलित [XPath](../../) क्वेरी युक्त [XPathExpression](../../xpathexpression/) ऑब्जेक्ट। |

### ReturnValue

एक [XPathNavigator](../) ऑब्जेक्ट जो निर्दिष्ट [XPath](../../) क्वेरी के लिए पहला मिलान करने वाला नोड रखता है; अन्यथा **nullptr** यदि कोई क्वेरी परिणाम नहीं है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


[XPathNavigator](../) में निर्दिष्ट [XPath](../../) क्वेरी का उपयोग करके एकल नोड का चयन करता है।

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | String | [XPath](../../) अभिव्यक्ति को दर्शाने वाला एक [String](../../../system/string/)। |

### ReturnValue

एक [XPathNavigator](../) ऑब्जेक्ट जो निर्दिष्ट [XPath](../../) क्वेरी के लिए पहला मिलान करने वाला नोड रखता है; अन्यथा, **nullptr** यदि कोई क्वेरी परिणाम नहीं है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


[XPathNavigator](../) ऑब्जेक्ट में निर्दिष्ट [XPath](../../) क्वेरी का उपयोग करके, नेमस्पेस प्रीफ़िक्स को हल करने के लिए निर्दिष्ट [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट के साथ एकल नोड का चयन करता है।

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | String | [XPath](../../) अभिव्यक्ति को दर्शाने वाला एक [String](../../../system/string/)। |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट जो [XPath](../../) क्वेरी में नेमस्पेस प्रीफ़िक्स को हल करने के लिए उपयोग किया जाता है। |

### ReturnValue

एक [XPathNavigator](../) ऑब्जेक्ट जो निर्दिष्ट [XPath](../../) क्वेरी के लिए पहला मिलान करने वाला नोड रखता है; अन्यथा **nullptr** यदि कोई क्वेरी परिणाम नहीं है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
