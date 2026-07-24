---
title: "System::Xml::XPath::XPathItem::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathItem::ValueAs method. C++ में आइटम का मान निर्दिष्ट प्रकार के रूप में लौटाता है।"
type: docs
weight: 1100
url: /hi/cpp/system.xml.xpath/xpathitem/valueas/
---
## XPathItem::ValueAs(const TypeInfo\&) method


आइटम का मान निर्दिष्ट प्रकार के रूप में लौटाता है।

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| returnType | const TypeInfo\& | आइटम के मान को लौटाने के लिए प्रकार। |

### ReturnValue

आइटम का मान अनुरोधित प्रकार के रूप में।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathItem::ValueAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट का उपयोग करके निर्दिष्ट प्रकार के अनुसार आइटम का मान लौटाता है, जो नेमस्पेस प्रीफ़िक्स को हल करने के लिए निर्दिष्ट किया गया है।

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathItem::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| returnType | const TypeInfo\& | आइटम के मान को लौटाने के लिए प्रकार। |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | नेमस्पेस प्रीफ़िक्स को हल करने के लिए उपयोग किया गया [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट। |

### ReturnValue

आइटम का मान अनुरोधित प्रकार के रूप में।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathItem](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
