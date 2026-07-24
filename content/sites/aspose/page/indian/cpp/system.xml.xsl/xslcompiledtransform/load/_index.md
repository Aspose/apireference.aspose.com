---
title: "System::Xml::Xsl::XslCompiledTransform::Load मेथड"
linktitle: "लोड"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XslCompiledTransform::Load मेथड. C++ में IXPathNavigable ऑब्जेक्ट में सम्मिलित स्टाइल शीट को कंपाइल करता है।"
type: docs
weight: 300
url: /hi/cpp/system.xml.xsl/xslcompiledtransform/load/
---
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) method


IXPathNavigable ऑब्जेक्ट में निहित शैली पत्रक को संकलित करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो स्टाइल शीट को सम्मिलित करता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) method


IXPathNavigable में सम्मिलित XSLT स्टाइल शीट को कंपाइल करता है। [XmlResolver](../../../system.xml/xmlresolver/) किसी भी XSLT **import** या **include** तत्व को हल करता है और XSLT सेटिंग्स स्टाइल शीट के लिए अनुमतियों को निर्धारित करती हैं।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<System::Xml::XPath::IXPathNavigable> &stylesheet, SharedPtr<XsltSettings> settings, SharedPtr<XmlResolver> stylesheetResolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stylesheet | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | IXPathNavigable इंटरफ़ेस को लागू करने वाला एक ऑब्जेक्ट। यह या तो एक [XmlNode](../../../system.xml/xmlnode/) (आमतौर पर एक [XmlDocument](../../../system.xml/xmldocument/)) हो सकता है, या एक XPathDocument जो स्टाइल शीट को सम्मिलित करता है। |
| settings | SharedPtr\<XsltSettings\> | स्टाइल शीट पर लागू करने के लिए [XsltSettings](../../xsltsettings/)। यदि यह **nullptr** है, तो [XsltSettings::get_Default](../../xsltsettings/get_default/) सेटिंग लागू की जाती है। |
| stylesheetResolver | SharedPtr\<XmlResolver\> | XSLT **import** और **include** तत्वों में संदर्भित किसी भी स्टाइल शीट को हल करने के लिए उपयोग किया जाने वाला [XmlResolver](../../../system.xml/xmlresolver/)। यदि यह **nullptr** है, तो बाहरी संसाधनों को हल नहीं किया जाता। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&) method


[XmlReader](../../../system.xml/xmlreader/) में सम्मिलित स्टाइल शीट को कंपाइल करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | स्टाइल शीट को सम्मिलित करने वाला एक [XmlReader](../../../system.xml/xmlreader/)। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


[XmlReader](../../../system.xml/xmlreader/) में सम्मिलित XSLT स्टाइल शीट को कंपाइल करता है। [XmlResolver](../../../system.xml/xmlresolver/) किसी भी XSLT **import** या **include** तत्व को हल करता है और XSLT सेटिंग्स स्टाइल शीट के लिए अनुमतियों को निर्धारित करती हैं।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const SharedPtr<XmlReader> &stylesheet, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stylesheet | const SharedPtr\<XmlReader\>\& | स्टाइल शीट को सम्मिलित करने वाला [XmlReader](../../../system.xml/xmlreader/)। |
| settings | const SharedPtr\<XsltSettings\>\& | स्टाइल शीट पर लागू करने के लिए [XsltSettings](../../xsltsettings/)। यदि यह **nullptr** है, तो [XsltSettings::get_Default](../../xsltsettings/get_default/) सेटिंग लागू की जाती है। |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | XSLT **import** और **include** तत्वों में संदर्भित किसी भी स्टाइल शीट को हल करने के लिए उपयोग किया जाने वाला [XmlResolver](../../../system.xml/xmlresolver/)। यदि यह **nullptr** है, तो बाहरी संसाधनों को हल नहीं किया जाता। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&) method


निर्दिष्ट URI पर स्थित स्टाइल शीट को लोड करता है और संकलित करता है।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stylesheetUri | const String\& | स्टाइल शीट का URI। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
## XslCompiledTransform::Load(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) method


URI द्वारा निर्दिष्ट XSLT स्टाइल शीट को लोड करता है और संकलित करता है। [XmlResolver](../../../system.xml/xmlresolver/) किसी भी XSLT **import** या **include** तत्व को हल करता है और XSLT सेटिंग्स स्टाइल शीट के लिए अनुमतियों को निर्धारित करती हैं।

```cpp
void System::Xml::Xsl::XslCompiledTransform::Load(const String &stylesheetUri, const SharedPtr<XsltSettings> &settings, const SharedPtr<XmlResolver> &stylesheetResolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| stylesheetUri | const String\& | स्टाइल शीट का URI। |
| settings | const SharedPtr\<XsltSettings\>\& | स्टाइल शीट पर लागू करने के लिए [XsltSettings](../../xsltsettings/)। यदि यह **nullptr** है, तो [XsltSettings::get_Default](../../xsltsettings/get_default/) सेटिंग लागू की जाती है। |
| stylesheetResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) का उपयोग स्टाइल शीट URI और XSLT **import** और **include** तत्वों में संदर्भित किसी भी स्टाइल शीट को हल करने के लिए किया जाता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltSettings](../../xsltsettings/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
