---
title: "System::Xml::XmlReader::ReadToDescendant विधि"
linktitle: "ReadToDescendant"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::ReadToDescendant विधि। निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले अगले वंशज तत्व तक C++ में XmlReader को आगे बढ़ाता है।"
type: docs
weight: 7100
url: /hi/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले अगले वंशज तत्व तक [XmlReader](../) को आगे बढ़ाता है।

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | उस तत्व का स्थानीय नाम जिसे आप स्थानांतरित होना चाहते हैं। |
| namespaceURI | String | उस तत्व का नेमस्पेस URI जिसे आप स्थानांतरित होना चाहते हैं। |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToDescendant(String) method


निर्दिष्ट योग्य नाम वाले अगले वंशज तत्व तक [XmlReader](../) को आगे बढ़ाता है।

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | उस तत्व का योग्य नाम जिसे आप स्थानांतरित होना चाहते हैं। |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
