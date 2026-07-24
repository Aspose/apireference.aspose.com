---
title: "System::Xml::XPath::XPathExpression::SetContext मेथड"
linktitle: "SetContext"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathExpression::SetContext मेथड। जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो C++ में नेमस्पेस समाधान के लिए उपयोग किए जाने वाले IXmlNamespaceResolver ऑब्जेक्ट को निर्दिष्ट करता है।"
type: docs
weight: 500
url: /hi/cpp/system.xml.xpath/xpathexpression/setcontext/
---
## XPathExpression::SetContext(SharedPtr\<IXmlNamespaceResolver\>) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो नेमस्पेस समाधान के लिए उपयोग किए जाने वाले [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट को निर्दिष्ट करता है।

```cpp
virtual void System::Xml::XPath::XPathExpression::SetContext(SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | एक ऑब्जेक्ट जो नेमस्पेस समाधान के लिए उपयोग करने हेतु [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) इंटरफ़ेस को लागू करता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::SetContext(SharedPtr\<XmlNamespaceManager\>) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो नेमस्पेस समाधान के लिए उपयोग किए जाने वाले [XmlNamespaceManager](../../../system.xml/xmlnamespacemanager/) ऑब्जेक्ट को निर्दिष्ट करता है।

```cpp
virtual void System::Xml::XPath::XPathExpression::SetContext(SharedPtr<XmlNamespaceManager> nsManager)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| nsManager | SharedPtr\<XmlNamespaceManager\> | एक [XmlNamespaceManager](../../../system.xml/xmlnamespacemanager/) ऑब्जेक्ट नेमस्पेस समाधान के लिए उपयोग किया जाता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNamespaceManager](../../../system.xml/xmlnamespacemanager/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
