---
title: "System::Xml::XmlReader::ReadToFollowing मेथड"
linktitle: "ReadToFollowing"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::ReadToFollowing मेथड। C++ में निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले तत्व मिलने तक पढ़ता है।"
type: docs
weight: 7200
url: /hi/cpp/system.xml/xmlreader/readtofollowing/
---
## XmlReader::ReadToFollowing(String, String) method


निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले तत्व को मिलने तक पढ़ता है।

```cpp
virtual bool System::Xml::XmlReader::ReadToFollowing(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | एलिमेंट का स्थानीय नाम। |
| namespaceURI | String | एलिमेंट का नेमस्पेस URI। |

### ReturnValue

**true** if a matching element is found; otherwise **false** and the [XmlReader](../) is in an end of file state.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToFollowing(String) method


जब तक निर्दिष्ट क्वालिफाइड नाम वाला एलिमेंट नहीं मिल जाता, तब तक पढ़ता रहता है।

```cpp
virtual bool System::Xml::XmlReader::ReadToFollowing(String name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | तत्व का योग्य नाम। |

### ReturnValue

**true** if a matching element is found; otherwise **false** and the [XmlReader](../) is in an end of file state.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
