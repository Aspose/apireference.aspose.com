---
title: "System::Xml::XPath::XPathNavigator::Evaluate method"
linktitle: "Evaluate"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::Evaluate method. XPathExpression का मूल्यांकन करता है और टाइप्ड परिणाम लौटाता है C++ में।"
type: docs
weight: 1200
url: /hi/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


[XPathExpression](../../xpathexpression/) का मूल्यांकन करता है और टाइप्ड परिणाम लौटाता है।

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | एक [XPathExpression](../../xpathexpression/) जिसे मूल्यांकन किया जा सकता है। |

### ReturnValue

अभिव्यक्ति का परिणाम ([Boolean](../../../system/boolean/), संख्या, स्ट्रिंग, या नोड सेट)। यह क्रमशः [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), या [XPathNodeIterator](../../xpathnodeiterator/) ऑब्जेक्ट्स से मेल खाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


प्रदान किए गए संदर्भ का उपयोग करके [XPathExpression](../../xpathexpression/) का मूल्यांकन करता है, और टाइप्ड परिणाम लौटाता है।

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | एक [XPathExpression](../../xpathexpression/) जिसे मूल्यांकन किया जा सकता है। |
| context | SharedPtr\<XPathNodeIterator\> | एक [XPathNodeIterator](../../xpathnodeiterator/) जो चयनित नोड सेट की ओर इशारा करता है, जिस पर मूल्यांकन किया जाना है। |

### ReturnValue

अभिव्यक्ति का परिणाम ([Boolean](../../../system/boolean/), संख्या, स्ट्रिंग, या नोड सेट)। यह क्रमशः [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), या [XPathNodeIterator](../../xpathnodeiterator/) ऑब्जेक्ट्स से मेल खाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String) method


निर्दिष्ट [XPath](../../) अभिव्यक्ति का मूल्यांकन करता है और टाइप्ड परिणाम लौटाता है।

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | String | एक स्ट्रिंग जो एक [XPath](../../) अभिव्यक्ति का प्रतिनिधित्व करती है, जिसे मूल्यांकन किया जा सकता है। |

### ReturnValue

अभिव्यक्ति का परिणाम ([Boolean](../../../system/boolean/), संख्या, स्ट्रिंग, या नोड सेट)। यह क्रमशः [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), या [XPathNodeIterator](../../xpathnodeiterator/) ऑब्जेक्ट्स से मेल खाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


निर्दिष्ट [XPath](../../) अभिव्यक्ति का मूल्यांकन करता है और टाइप्ड परिणाम लौटाता है, [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट का उपयोग करके, जो [XPath](../../) अभिव्यक्ति में नेमस्पेस प्रीफ़िक्स को हल करने के लिए निर्दिष्ट किया गया है।

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | String | एक स्ट्रिंग जो एक [XPath](../../) अभिव्यक्ति का प्रतिनिधित्व करती है, जिसे मूल्यांकन किया जा सकता है। |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | [XPath](../../) अभिव्यक्ति में नेमस्पेस प्रीफ़िक्स को हल करने के लिए उपयोग किया जाने वाला [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट। |

### ReturnValue

अभिव्यक्ति का परिणाम ([Boolean](../../../system/boolean/), संख्या, स्ट्रिंग, या नोड सेट)। यह क्रमशः [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), या [XPathNodeIterator](../../xpathnodeiterator/) ऑब्जेक्ट्स से मेल खाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
