---
title: "System::Xml::XmlReader::ReadToNextSibling विधि"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::ReadToNextSibling विधि। C++ में XmlReader को निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले अगले सिब्लिंग तत्व पर ले जाता है।"
type: docs
weight: 7300
url: /hi/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले अगले सिब्लिंग तत्व पर [XmlReader](../) को ले जाता है।

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | उस सिब्लिंग तत्व का स्थानीय नाम जिसे आप स्थानांतरित होना चाहते हैं। |
| namespaceURI | String | उस सिब्लिंग तत्व का नेमस्पेस URI जिसे आप स्थानांतरित होना चाहते हैं। |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


निर्दिष्ट योग्य नाम वाले अगले सिब्लिंग तत्व पर [XmlReader](../) को ले जाता है।

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | उस सिब्लिंग तत्व का योग्य नाम जिसे आप स्थानांतरित होना चाहते हैं। |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
