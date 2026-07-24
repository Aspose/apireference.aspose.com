---
title: "System::Xml::XPath::XPathExpression class"
linktitle: "XPathExpression"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathExpression class. C++ में संकलित XPath अभिव्यक्ति का प्रतिनिधित्व करने वाला एक टाइप्ड क्लास प्रदान करता है।"
type: docs
weight: 300
url: /hi/cpp/system.xml.xpath/xpathexpression/
---
## XPathExpression class


एक टाइप्ड क्लास प्रदान करता है जो एक संकलित [XPath](../) अभिव्यक्ति का प्रतिनिधित्व करता है।

```cpp
class XPathExpression : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट IComparer ऑब्जेक्ट के अनुसार [XPath](../) अभिव्यक्ति द्वारा चयनित नोड्स को क्रमबद्ध करता है। |
| virtual [AddSort](./addsort/)(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो प्रदान किए गए पैरामीटरों के अनुसार [XPath](../) अभिव्यक्ति द्वारा चयनित नोड्स को क्रमबद्ध करता है। |
| virtual [Clone](./clone/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो इस [XPathExpression](./) की एक क्लोन लौटाता है। |
| static [Compile](./compile/)(const String\&) | निर्दिष्ट [XPath](../) अभिव्यक्ति को संकलित करता है और एक [XPathExpression](./) ऑब्जेक्ट लौटाता है जो [XPath](../) अभिव्यक्ति का प्रतिनिधित्व करता है। |
| static [Compile](./compile/)(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) | निर्दिष्ट [XPath](../) अभिव्यक्ति को संकलित करता है, जिसमें नेमस्पेस समाधान के लिए निर्दिष्ट [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट शामिल है, और एक [XPathExpression](./) ऑब्जेक्ट लौटाता है जो [XPath](../) अभिव्यक्ति का प्रतिनिधित्व करता है। |
| virtual [get_Expression](./get_expression/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो [XPathExpression](./) का **string** प्रतिनिधित्व प्राप्त करता है। |
| virtual [get_ReturnType](./get_returntype/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो [XPath](../) अभिव्यक्ति का परिणाम प्रकार प्राप्त करता है। |
| virtual [SetContext](./setcontext/)(SharedPtr\<XmlNamespaceManager\>) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो नेमस्पेस समाधान के लिए उपयोग करने वाले [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) ऑब्जेक्ट को निर्दिष्ट करता है। |
| virtual [SetContext](./setcontext/)(SharedPtr\<IXmlNamespaceResolver\>) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो नेमस्पेस समाधान के लिए उपयोग करने वाले [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) ऑब्जेक्ट को निर्दिष्ट करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
