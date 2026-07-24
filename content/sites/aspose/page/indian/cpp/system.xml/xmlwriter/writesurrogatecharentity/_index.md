---
title: "System::Xml::XmlWriter::WriteSurrogateCharEntity method"
linktitle: "WriteSurrogateCharEntity"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlWriter::WriteSurrogateCharEntity method. जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो C++ में सरोगेट कैरेक्टर जोड़ी के लिए सरोगेट कैरेक्टर एंटिटी उत्पन्न करता है और लिखता है।"
type: docs
weight: 3400
url: /hi/cpp/system.xml/xmlwriter/writesurrogatecharentity/
---
## XmlWriter::WriteSurrogateCharEntity method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो सरोगेट कैरेक्टर जोड़ी के लिए सरोगेट कैरेक्टर एंटिटी उत्पन्न करता है और लिखता है।

```cpp
virtual void System::Xml::XmlWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| lowChar | char16_t | निचला सरोगेट। यह 0xDC00 और 0xDFFF के बीच का मान होना चाहिए। |
| highChar | char16_t | ऊपरी सरोगेट। यह 0xD800 और 0xDBFF के बीच का मान होना चाहिए। |

## संबंधित देखें

* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
