---
title: "System::Xml::XmlReader::get_Name मेथड"
linktitle: "get_Name"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::get_Name मेथड। जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो C++ में वर्तमान नोड का क्वालिफाइड नाम प्राप्त करता है।"
type: docs
weight: 1500
url: /hi/cpp/system.xml/xmlreader/get_name/
---
## XmlReader::get_Name method


जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो वर्तमान नोड का क्वालिफाइड नाम प्राप्त करता है।

```cpp
virtual String System::Xml::XmlReader::get_Name()
```


### ReturnValue

वर्तमान नोड का योग्य नाम। उदाहरण के लिए, **Name** तत्व **<bk:book>** के लिए **bk:book** है।
## टिप्पणियाँ



वापस किया गया नाम नोड के [XmlReader::get_NodeType](../get_nodetype/) मान पर निर्भर करता है। निम्नलिखित नोड प्रकार सूचीबद्ध मान लौटाते हैं। अन्य सभी नोड प्रकार एक खाली स्ट्रिंग लौटाते हैं। |||
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
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
