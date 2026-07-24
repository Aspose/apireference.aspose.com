---
title: "System::Xml::XmlTextWriter::WriteSurrogateCharEntity मेथड"
linktitle: "WriteSurrogateCharEntity"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextWriter::WriteSurrogateCharEntity मेथड। C++ में सरोगेट कैरेक्टर जोड़ी के लिए सरोगेट कैरेक्टर एंटिटी उत्पन्न करता है और लिखता है।"
type: docs
weight: 4000
url: /hi/cpp/system.xml/xmltextwriter/writesurrogatecharentity/
---
## XmlTextWriter::WriteSurrogateCharEntity method


सर्जेट कैरेक्टर पेयर के लिए सर्जेट कैरेक्टर एंटिटी उत्पन्न करता है और लिखता है।

```cpp
void System::Xml::XmlTextWriter::WriteSurrogateCharEntity(char16_t lowChar, char16_t highChar) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| lowChar | char16_t | लो सरोगेट। यह मान **0xDC00** और **0xDFFF** के बीच होना चाहिए। |
| highChar | char16_t | हाई सरोगेट। यह मान **0xD800** और **0xDBFF** के बीच होना चाहिए। |

## संबंधित देखें

* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
