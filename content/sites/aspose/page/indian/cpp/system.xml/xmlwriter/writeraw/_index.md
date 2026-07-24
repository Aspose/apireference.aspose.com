---
title: "System::Xml::XmlWriter::WriteRaw method"
linktitle: "WriteRaw"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlWriter::WriteRaw method. जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो C++ में एक कैरेक्टर बफ़र से कच्चा मार्कअप मैन्युअली लिखता है।"
type: docs
weight: 2900
url: /hi/cpp/system.xml/xmlwriter/writeraw/
---
## XmlWriter::WriteRaw(ArrayPtr\<char16_t\>, int32_t, int32_t) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो एक कैरेक्टर बफ़र से मैन्युअल रूप से कच्चा मार्कअप लिखता है।

```cpp
virtual void System::Xml::XmlWriter::WriteRaw(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | ArrayPtr\<char16_t\> | लिखने के लिए टेक्स्ट को समाहित करने वाला कैरेक्टर एरे। |
| सूचकांक | int32_t | बफ़र के भीतर वह स्थिति जो लिखने के लिए टेक्स्ट की शुरुआत दर्शाती है। |
| count | int32_t | लिखने के लिए कैरेक्टर्स की संख्या। |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteRaw(const String\&) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो एक स्ट्रिंग से मैन्युअल रूप से कच्चा मार्कअप लिखता है।

```cpp
virtual void System::Xml::XmlWriter::WriteRaw(const String &data)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| data | const String\& | [String](../../../system/string/) जिसमें लिखने के लिए टेक्स्ट है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
