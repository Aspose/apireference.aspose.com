---
title: "System::Xml::XmlNodeReader::get_Name method"
linktitle: "get_Name"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNodeReader::get_Name method. वर्तमान नोड का योग्य नाम C++ में लौटाता है।"
type: docs
weight: 1400
url: /hi/cpp/system.xml/xmlnodereader/get_name/
---
## XmlNodeReader::get_Name method


वापस देता है वर्तमान नोड का योग्य नाम।

```cpp
String System::Xml::XmlNodeReader::get_Name() override
```


### ReturnValue

वर्तमान नोड का योग्य नाम। उदाहरण के लिए, **Name** तत्व **<bk:book>** के लिए **bk:book** है।
## टिप्पणियाँ



वापस किया गया नाम नोड के [XmlNodeReader::get_NodeType](../get_nodetype/) मान पर निर्भर करता है। निम्नलिखित नोड प्रकार सूचीबद्ध मान लौटाते हैं। सभी अन्य नोड प्रकार एक खाली स्ट्रिंग लौटाते हैं। |||
|-|-|
| नोड प्रकार | नाम |
| Attribute | विशेषता का नाम। |
| DocumentType | दस्तावेज़ प्रकार का नाम। |
| Element | टैग का नाम। |
| EntityReference | संदर्भित इकाई का नाम। |
| ProcessingInstruction | प्रोसेसिंग निर्देश का लक्ष्य। |
| XmlDeclaration | शाब्दिक स्ट्रिंग xml। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
