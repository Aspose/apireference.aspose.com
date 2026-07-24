---
title: "System::Xml::XmlTextReader::MoveToAttribute मेथड"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextReader::MoveToAttribute मेथड। C++ में निर्दिष्ट अनुक्रमांक वाले एट्रिब्यूट पर जाता है।"
type: docs
weight: 3800
url: /hi/cpp/system.xml/xmltextreader/movetoattribute/
---
## XmlTextReader::MoveToAttribute(int32_t) method


निर्दिष्ट अनुक्रमांक वाले गुण पर जाता है।

```cpp
void System::Xml::XmlTextReader::MoveToAttribute(int32_t i) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| i | int32_t | एट्रिब्यूट का सूचकांक। |

## संबंधित देखें

* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::MoveToAttribute(String, String) method


निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले गुण पर जाता है।

```cpp
bool System::Xml::XmlTextReader::MoveToAttribute(String localName, String namespaceURI) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | एट्रिब्यूट का स्थानीय नाम। |
| namespaceURI | String | एट्रिब्यूट का नेमस्पेस URI। |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::MoveToAttribute(String) method


निर्दिष्ट नाम वाले गुण पर जाता है।

```cpp
bool System::Xml::XmlTextReader::MoveToAttribute(String name) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | एट्रिब्यूट का योग्य नाम। |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
