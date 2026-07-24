---
title: "System::Xml::XPath::XPathNavigator::ValueAs मेथड"
linktitle: "ValueAs"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::ValueAs मेथड। वर्तमान नोड का मान निर्दिष्ट Type के रूप में लौटाता है, नेमस्पेस प्रीफ़िक्स को हल करने के लिए निर्दिष्ट IXmlNamespaceResolver ऑब्जेक्ट का उपयोग करते हुए C++ में।"
type: docs
weight: 8100
url: /hi/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


वर्तमान नोड का मान निर्दिष्ट Type के रूप में लौटाता है, नेमस्पेस प्रीफ़िक्स को हल करने के लिए निर्दिष्ट [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट का उपयोग करते हुए।

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| returnType | const TypeInfo\& | वर्तमान नोड के मान को लौटाने के लिए Type। |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | नेमस्पेस प्रीफ़िक्स को हल करने के लिए उपयोग किया गया [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट। |

### ReturnValue

वर्तमान नोड का मान अनुरोधित Type के रूप में।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
