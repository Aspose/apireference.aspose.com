---
title: "System::Xml::XmlReader::MoveToAttribute मेथड"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::MoveToAttribute मेथड। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह C++ में निर्दिष्ट अनुक्रमांक वाले एट्रिब्यूट पर जाता है।"
type: docs
weight: 3200
url: /hi/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट अनुक्रमांक वाले गुण पर जाता है।

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| i | int32_t | एट्रिब्यूट का सूचकांक। |

## संबंधित देखें

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String) method


जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह निर्दिष्ट [XmlReader::get_Name](../get_name/) मान वाले एट्रिब्यूट पर जाता है।

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | एट्रिब्यूट का योग्य नाम। |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह निर्दिष्ट [XmlReader::get_LocalName](../get_localname/) और [XmlReader::get_NamespaceURI](../get_namespaceuri/) मानों वाले एट्रिब्यूट पर जाता है।

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | एट्रिब्यूट का स्थानीय नाम। |
| ns | String | एट्रिब्यूट का नेमस्पेस URI। |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
