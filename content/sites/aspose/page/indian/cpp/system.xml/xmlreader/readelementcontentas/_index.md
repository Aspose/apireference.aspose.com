---
title: "System::Xml::XmlReader::ReadElementContentAs मेथड"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::ReadElementContentAs मेथड। तत्व की सामग्री को अनुरोधित प्रकार के रूप में पढ़ता है C++ में।"
type: docs
weight: 5200
url: /hi/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


तत्व सामग्री को अनुरोधित प्रकार के रूप में पढ़ता है।

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| returnType | const TypeInfo\& | वापस किए जाने वाले मान का प्रकार। |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | एक [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) ऑब्जेक्ट जिसका उपयोग प्रकार रूपांतरण से संबंधित किसी भी नेमस्पेस उपसर्ग को हल करने के लिए किया जाता है। |

### ReturnValue

तत्व की सामग्री को अनुरोधित टाइप्ड ऑब्जेक्ट में परिवर्तित किया गया।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व से मेल खाता है, फिर तत्व सामग्री को अनुरोधित प्रकार के रूप में पढ़ता है।

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| returnType | const TypeInfo\& | वापस किए जाने वाले मान का प्रकार। |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | एक [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) ऑब्जेक्ट जिसका उपयोग प्रकार रूपांतरण से संबंधित किसी भी नेमस्पेस उपसर्ग को हल करने के लिए किया जाता है। |
| localName | String | एलिमेंट का स्थानीय नाम। |
| namespaceURI | String | एलिमेंट का नेमस्पेस URI। |

### ReturnValue

तत्व की सामग्री को अनुरोधित टाइप्ड ऑब्जेक्ट में परिवर्तित किया गया।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
