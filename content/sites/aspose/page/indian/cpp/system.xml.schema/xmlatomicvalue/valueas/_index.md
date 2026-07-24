---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs method. C++ में नेमस्पेस प्रीफ़िक्स को हल करने के लिए निर्दिष्ट IXmlNamespaceResolver ऑब्जेक्ट का उपयोग करके निर्दिष्ट प्रकार के रूप में मान्य XML तत्व या विशेषता के मान को लौटाता है।"
type: docs
weight: 1300
url: /hi/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


मान्य XML तत्व या विशेषता के मान को निर्दिष्ट प्रकार के रूप में लौटाता है, जो नेमस्पेस प्रीफ़िक्स को हल करने के लिए उपयोग किए गए [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट द्वारा निर्दिष्ट है।

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रकार | const TypeInfo\& | मान्य XML तत्व या विशेषता के मान को लौटाने के लिए निर्दिष्ट प्रकार। |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | नेमस्पेस प्रीफ़िक्स को हल करने के लिए उपयोग किया गया [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट। |

### ReturnValue

सत्यापित XML तत्व या विशेषता का मान अनुरोधित प्रकार के रूप में।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
