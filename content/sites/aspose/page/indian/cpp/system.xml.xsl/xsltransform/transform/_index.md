---
title: "System::Xml::Xsl::XslTransform::Transform मेथड"
linktitle: "Transform"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XslTransform::Transform मेथड। निर्दिष्ट args का उपयोग करके IXPathNavigable में XML डेटा को ट्रांसफ़ॉर्म करता है और परिणाम को C++ में एक XmlReader में आउटपुट करता है।"
type: docs
weight: 400
url: /hi/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


निर्दिष्ट **args** का उपयोग करके IXPathNavigable में XML डेटा को ट्रांसफ़ॉर्म करता है और परिणाम को एक [XmlReader](../../../system.xml/xmlreader/) में आउटपुट करता है।

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |

### ReturnValue

एक [XmlReader](../../../system.xml/xmlreader/) जिसमें रूपांतरण के परिणाम होते हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक Stream में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| आउटपुट | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक Stream में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| आउटपुट | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जहाँ आप आउटपुट देना चाहते हैं। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** फ़ंक्शन को हल करने के लिए प्रयुक्त [XmlResolver](../../../system.xml/xmlresolver/). यदि यह **nullptr** है, तो **document()** फ़ंक्शन हल नहीं होगा। [XmlResolver](../../../system.xml/xmlresolver/) को [XslTransform::Transform](./) मेथड के पूर्ण होने के बाद कैश नहीं किया जाता। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक TextWriter में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| आउटपुट | const SharedPtr\<IO::TextWriter\>\& | वह TextWriter जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


IXPathNavigable में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक TextWriter में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| आउटपुट | const SharedPtr\<IO::TextWriter\>\& | वह TextWriter जहाँ आप आउटपुट देना चाहते हैं। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** फ़ंक्शन को हल करने के लिए प्रयुक्त [XmlResolver](../../../system.xml/xmlresolver/). यदि यह **nullptr** है, तो **document()** फ़ंक्शन हल नहीं होगा। इस मेथड के पूर्ण होने के बाद [XmlResolver](../../../system.xml/xmlresolver/) को कैश नहीं किया जाता। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


निर्दिष्ट **args** का उपयोग करके IXPathNavigable में XML डेटा को ट्रांसफ़ॉर्म करता है और परिणाम को एक [XmlReader](../../../system.xml/xmlreader/) में आउटपुट करता है।

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** फ़ंक्शन को हल करने के लिए प्रयुक्त [XmlResolver](../../../system.xml/xmlresolver/). यदि यह **nullptr** है, तो **document()** फ़ंक्शन हल नहीं होगा। इस मेथड के पूर्ण होने के बाद [XmlResolver](../../../system.xml/xmlresolver/) को कैश नहीं किया जाता। |

### ReturnValue

एक [XmlReader](../../../system.xml/xmlreader/) जिसमें रूपांतरण के परिणाम होते हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


निर्दिष्ट **args** का उपयोग करके IXPathNavigable में XML डेटा को परिवर्तित करता है और परिणाम को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| output | const SharedPtr\<XmlWriter\>\& | वह [XmlWriter](../../../system.xml/xmlwriter/) जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


निर्दिष्ट **args** का उपयोग करके IXPathNavigable में XML डेटा को परिवर्तित करता है और परिणाम को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो ट्रांसफ़ॉर्म किए जाने वाले डेटा को समाहित करता है। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| output | const SharedPtr\<XmlWriter\>\& | वह [XmlWriter](../../../system.xml/xmlwriter/) जहाँ आप आउटपुट देना चाहते हैं। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** फ़ंक्शन को हल करने के लिए प्रयुक्त [XmlResolver](../../../system.xml/xmlresolver/). यदि यह **nullptr** है, तो **document()** फ़ंक्शन हल नहीं होगा। इस मेथड के पूर्ण होने के बाद [XmlResolver](../../../system.xml/xmlresolver/) को कैश नहीं किया जाता। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


निर्दिष्ट **args** का उपयोग करके XPathNavigator में XML डेटा को परिवर्तित करता है और परिणाम को एक [XmlReader](../../../system.xml/xmlreader/) में आउटपुट करता है।

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | एक XPathNavigator जिसमें परिवर्तित किए जाने वाले डेटा होते हैं। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |

### ReturnValue

एक [XmlReader](../../../system.xml/xmlreader/) जिसमें रूपांतरण के परिणाम होते हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


XPathNavigator में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक Stream में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | एक XPathNavigator जिसमें परिवर्तित किए जाने वाले डेटा होते हैं। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| आउटपुट | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


XPathNavigator में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक Stream में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | एक XPathNavigator जिसमें परिवर्तित किए जाने वाले डेटा होते हैं। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| आउटपुट | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जहाँ आप आउटपुट देना चाहते हैं। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** फ़ंक्शन को हल करने के लिए प्रयुक्त [XmlResolver](../../../system.xml/xmlresolver/). यदि यह **nullptr** है, तो **document()** फ़ंक्शन हल नहीं होगा। इस मेथड के पूर्ण होने के बाद [XmlResolver](../../../system.xml/xmlresolver/) को कैश नहीं किया जाता। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


XPathNavigator में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक TextWriter में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | एक XPathNavigator जिसमें परिवर्तित किए जाने वाले डेटा होते हैं। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| आउटपुट | const SharedPtr\<IO::TextWriter\>\& | वह TextWriter जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


XPathNavigator में XML डेटा को निर्दिष्ट **args** का उपयोग करके परिवर्तित करता है और परिणाम को एक TextWriter में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | एक XPathNavigator जिसमें परिवर्तित किए जाने वाले डेटा होते हैं। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| आउटपुट | const SharedPtr\<IO::TextWriter\>\& | वह TextWriter जहाँ आप आउटपुट देना चाहते हैं। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** फ़ंक्शन को हल करने के लिए प्रयुक्त [XmlResolver](../../../system.xml/xmlresolver/). यदि यह **nullptr** है, तो **document()** फ़ंक्शन हल नहीं होगा। इस मेथड के पूर्ण होने के बाद [XmlResolver](../../../system.xml/xmlresolver/) को कैश नहीं किया जाता। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


निर्दिष्ट **args** का उपयोग करके XPathNavigator में XML डेटा को परिवर्तित करता है और परिणाम को एक [XmlReader](../../../system.xml/xmlreader/) में आउटपुट करता है।

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | एक XPathNavigator जिसमें परिवर्तित किए जाने वाले डेटा होते हैं। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** फ़ंक्शन को हल करने के लिए प्रयुक्त [XmlResolver](../../../system.xml/xmlresolver/). यदि यह **nullptr** है, तो **document()** फ़ंक्शन हल नहीं होगा। इस मेथड के पूर्ण होने के बाद [XmlResolver](../../../system.xml/xmlresolver/) को कैश नहीं किया जाता। |

### ReturnValue

एक [XmlReader](../../../system.xml/xmlreader/) जिसमें रूपांतरण के परिणाम होते हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


निर्दिष्ट args का उपयोग करके XPathNavigator में XML डेटा को परिवर्तित करता है और परिणाम को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | एक XPathNavigator जिसमें परिवर्तित किए जाने वाले डेटा होते हैं। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| output | const SharedPtr\<XmlWriter\>\& | वह [XmlWriter](../../../system.xml/xmlwriter/) जहाँ आप आउटपुट देना चाहते हैं। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


निर्दिष्ट args का उपयोग करके XPathNavigator में XML डेटा को परिवर्तित करता है और परिणाम को एक [XmlWriter](../../../system.xml/xmlwriter/) में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | एक XPathNavigator जिसमें परिवर्तित किए जाने वाले डेटा होते हैं। |
| args | const SharedPtr\<XsltArgumentList\>\& | एक [XsltArgumentList](../../xsltargumentlist/) जिसमें रूपांतरण के इनपुट के रूप में प्रयुक्त नेमस्पेस-योग्य तर्क होते हैं। |
| output | const SharedPtr\<XmlWriter\>\& | वह [XmlWriter](../../../system.xml/xmlwriter/) जहाँ आप आउटपुट देना चाहते हैं। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** फ़ंक्शन को हल करने के लिए प्रयुक्त [XmlResolver](../../../system.xml/xmlresolver/). यदि यह **nullptr** है, तो **document()** फ़ंक्शन हल नहीं होगा। इस मेथड के पूर्ण होने के बाद [XmlResolver](../../../system.xml/xmlresolver/) को कैश नहीं किया जाता। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


इनपुट फ़ाइल में XML डेटा को परिवर्तित करता है और परिणाम को आउटपुट फ़ाइल में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुटफ़ाइल | const String\& | रूपांतरण के लिए स्रोत दस्तावेज़ का URL। |
| आउटपुटफ़ाइल | const String\& | आउटपुट फ़ाइल का URL। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


इनपुट फ़ाइल में XML डेटा को परिवर्तित करता है और परिणाम को आउटपुट फ़ाइल में आउटपुट करता है।

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुटफ़ाइल | const String\& | रूपांतरण के लिए स्रोत दस्तावेज़ का URL। |
| आउटपुटफ़ाइल | const String\& | आउटपुट फ़ाइल का URL। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | XSLT **document()** फ़ंक्शन को हल करने के लिए प्रयुक्त [XmlResolver](../../../system.xml/xmlresolver/). यदि यह **nullptr** है, तो **document()** फ़ंक्शन हल नहीं होगा। [XmlResolver](../../../system.xml/xmlresolver/) को [XslTransform::Transform](./) मेथड के पूर्ण होने के बाद कैश नहीं किया जाता। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
