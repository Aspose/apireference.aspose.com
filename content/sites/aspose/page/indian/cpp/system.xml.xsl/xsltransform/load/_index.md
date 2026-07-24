---
title: "System::Xml::Xsl::XslTransform::Load मेथड"
linktitle: "लोड"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XslTransform::Load मेथड। C++ में IXPathNavigable में निहित XSLT स्टाइल शीट को लोड करता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml.xsl/xsltransform/load/
---
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


XSLT शैली पत्रिका को IXPathNavigable में लोड करता है।

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या XSLT स्टाइल शीट युक्त एक XPathDocument। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


XSLT शैली पत्रिका को IXPathNavigable में लोड करता है।

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या XSLT स्टाइल शीट युक्त एक XPathDocument। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) का उपयोग उन सभी स्टाइल शीट्स को लोड करने के लिए किया जाता है जो **xsl:import** और **xsl:include** तत्वों में संदर्भित होते हैं। यदि यह **nullptr** है, तो बाहरी संसाधनों को हल नहीं किया जाता। इस मेथड के समाप्त होने के बाद [XmlResolver](../../../system.xml/xmlresolver/) को कैश नहीं किया जाता। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) method


XSLT शैली पत्रिका को XPathNavigator में लोड करता है।

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्टाइल शीट | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | एक XPathNavigator ऑब्जेक्ट जो XSLT स्टाइल शीट को समाहित करता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


XSLT शैली पत्रिका को XPathNavigator में लोड करता है।

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<System::Xml::XPath::XPathNavigator> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| स्टाइल शीट | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | एक XPathNavigator ऑब्जेक्ट जो XSLT स्टाइल शीट को समाहित करता है। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) का उपयोग उन सभी स्टाइल शीट्स को लोड करने के लिए किया जाता है जो **xsl:import** और **xsl:include** तत्वों में संदर्भित होते हैं। यदि यह **nullptr** है, तो बाहरी संसाधनों को हल नहीं किया जाता। इस मेथड के समाप्त होने के बाद [XmlResolver](../../../system.xml/xmlresolver/) को कैश नहीं किया जाता। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) में निहित XSLT स्टाइल शीट को लोड करता है।

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | एक [XmlReader](../../../system.xml/xmlreader/) ऑब्जेक्ट जो XSLT स्टाइल शीट को समाहित करता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


[XmlReader](../../../system.xml/xmlreader/) में निहित XSLT स्टाइल शीट को लोड करता है।

```cpp
void System::Xml::Xsl::XslTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | एक [XmlReader](../../../system.xml/xmlreader/) ऑब्जेक्ट जो XSLT स्टाइल शीट को समाहित करता है। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) का उपयोग उन सभी स्टाइल शीट्स को लोड करने के लिए किया जाता है जो **xsl:import** और **xsl:include** तत्वों में संदर्भित होते हैं। यदि यह **nullptr** है, तो बाहरी संसाधनों को हल नहीं किया जाता। इस मेथड के समाप्त होने के बाद [XmlResolver](../../../system.xml/xmlresolver/) को कैश नहीं किया जाता। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&) method


URL द्वारा निर्दिष्ट XSLT शैली पत्रिका को लोड करता है।

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| url | const String\& | URL जो लोड करने के लिए XSLT स्टाइल शीट निर्दिष्ट करता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslTransform::Load(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


URL द्वारा निर्दिष्ट XSLT शैली पत्रिका को लोड करता है।

```cpp
void System::Xml::Xsl::XslTransform::Load(const String &url, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| url | const String\& | URL जो लोड करने के लिए XSLT स्टाइल शीट निर्दिष्ट करता है। |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) का उपयोग स्टाइल शीट और **xsl:import** तथा **xsl:include** तत्वों में संदर्भित किसी भी स्टाइल शीट(s) को लोड करने के लिए किया जाता है। यदि यह **nullptr** है, तो कोई उपयोगकर्ता क्रेडेंशियल्स के बिना एक डिफ़ॉल्ट [XmlUrlResolver](../../../system.xml/xmlurlresolver/) का उपयोग स्टाइल शीट खोलने के लिए किया जाता है। डिफ़ॉल्ट [XmlUrlResolver](../../../system.xml/xmlurlresolver/) को स्टाइल शीट में किसी भी बाहरी संसाधन को हल करने के लिए उपयोग नहीं किया जाता, इसलिए **xsl:import** और **xsl:include** तत्व हल नहीं होते। इस मेथड के समाप्त होने के बाद [XmlResolver](../../../system.xml/xmlresolver/) को कैश नहीं किया जाता। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
