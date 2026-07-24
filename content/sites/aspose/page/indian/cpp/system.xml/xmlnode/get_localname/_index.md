---
title: "System::Xml::XmlNode::get_LocalName मेथड"
linktitle: "get_LocalName"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNode::get_LocalName मेथड। C++ में डेराइव्ड क्लास में ओवरराइड किए जाने पर नोड का स्थानीय नाम लौटाता है।"
type: docs
weight: 1400
url: /hi/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


डेराइव्ड क्लास में ओवरराइड किए जाने पर नोड का स्थानीय नाम लौटाता है।

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

प्रीफ़िक्स हटाए हुए नोड का नाम। उदाहरण के लिए, **LocalName** तत्व **<bk:book>** के लिए **book** है।
## टिप्पणियाँ



वापसी किया गया नाम नोड के [XmlNode::get_NodeType](../get_nodetype/) पर निर्भर करता है: |||
|-|-|
| प्रकार | नाम |
| Attribute | एट्रिब्यूट का स्थानीय नाम। |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | दस्तावेज़ प्रकार का नाम। |
| Element | एलिमेंट का स्थानीय नाम। |
| Entity | एंटिटी का नाम। |
| EntityReference | संदर्भित इकाई का नाम। |
| नोटेशन | नोटेशन नाम। |
| ProcessingInstruction | प्रोसेसिंग निर्देश का लक्ष्य। |
| Text | #text |
| रिक्त स्थान | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
