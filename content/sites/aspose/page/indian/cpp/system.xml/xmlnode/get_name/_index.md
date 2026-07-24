---
title: "System::Xml::XmlNode::get_Name विधि"
linktitle: "get_Name"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNode::get_Name विधि। नोड का योग्य नाम लौटाता है, जब इसे C++ में एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है।"
type: docs
weight: 1500
url: /hi/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


डेराइव्ड क्लास में ओवरराइड किए जाने पर नोड का योग्य नाम लौटाता है।

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

नोड का योग्य नाम।
## टिप्पणियाँ



वापसी किया गया नाम नोड के [XmlNode::get_NodeType](../get_nodetype/) पर निर्भर करता है: |||
|-|-|
| प्रकार | नाम |
| Attribute | एट्रिब्यूट का योग्य नाम। |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | दस्तावेज़ प्रकार का नाम। |
| Element | तत्व का योग्य नाम। |
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
