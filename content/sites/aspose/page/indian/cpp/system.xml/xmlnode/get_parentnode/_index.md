---
title: "System::Xml::XmlNode::get_ParentNode मेथड"
linktitle: "get_ParentNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNode::get_ParentNode मेथड। C++ में इस नोड का पैरेंट लौटाता है (उन नोड्स के लिए जिनके पास पैरेंट हो सकता है)।"
type: docs
weight: 2100
url: /hi/cpp/system.xml/xmlnode/get_parentnode/
---
## XmlNode::get_ParentNode method


इस नोड का पैरेंट लौटाता है (उन नोड्स के लिए जिनके पास पैरेंट हो सकता है)।

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::get_ParentNode() final
```


### ReturnValue

वर्तमान नोड का पैरेंट होने वाला [XmlNode](../)।
## टिप्पणियाँ



यदि कोई नोड अभी बनाया गया है और अभी तक ट्री में जोड़ा नहीं गया है, या यदि इसे ट्री से हटा दिया गया है, तो पैरेंट **nullptr** होता है। सभी अन्य नोड्स के लिए, लौटाया गया मान नोड के [XmlNode::get_NodeType](../get_nodetype/) पर निर्भर करता है। निम्न तालिका **get_NodeType** मेथड के संभावित रिटर्न वैल्यू को दर्शाती है। |||
|-|-|
| NodeType | ParentNode का रिटर्न वैल्यू |
| Attribute, Document, DocumentFragment, Entity, Notation | nullptr लौटाता है; इन नोड्स के पास पैरेंट नहीं होते। |
| CDATA | CDATA सेक्शन को शामिल करने वाले एलिमेंट या एंटिटी रेफ़रेंस को लौटाता है। |
| Comment | टिप्पणी को शामिल करने वाले एलिमेंट, एंटिटी रेफ़रेंस, डॉक्यूमेंट टाइप, या डॉक्यूमेंट को लौटाता है। |
| DocumentType | डॉक्यूमेंट नोड को लौटाता है। |
| Element | एलिमेंट का पैरेंट नोड लौटाता है। यदि एलिमेंट ट्री में रूट नोड है, तो पैरेंट डॉक्यूमेंट नोड होता है। |
| EntityReference | एंटिटी रेफ़रेंस को शामिल करने वाले एलिमेंट, एट्रिब्यूट, या एंटिटी रेफ़रेंस को लौटाता है। |
| ProcessingInstruction | प्रोसेसिंग इंस्ट्रक्शन को शामिल करने वाले डॉक्यूमेंट, एलिमेंट, डॉक्यूमेंट टाइप, या एंटिटी रेफ़रेंस को लौटाता है। |
| Text | टेक्स्ट नोड को शामिल करने वाले पैरेंट एलिमेंट, एट्रिब्यूट, या एंटिटी रेफ़रेंस को लौटाता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
