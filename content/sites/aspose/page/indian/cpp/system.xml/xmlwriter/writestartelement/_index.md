---
title: "System::Xml::XmlWriter::WriteStartElement method"
linktitle: "WriteStartElement"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlWriter::WriteStartElement मेथड। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट स्थानीय नाम के साथ एक स्टार्ट टैग को C++ में लिखता है।"
type: docs
weight: 3200
url: /hi/cpp/system.xml/xmlwriter/writestartelement/
---
## XmlWriter::WriteStartElement(const String\&) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट स्थानीय नाम के साथ एक प्रारंभ टैग लिखता है।

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | const String\& | एलिमेंट का स्थानीय नाम। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट प्रारंभ टैग लिखता है और इसे दिए गए नेमस्पेस से जोड़ता है।

```cpp
void System::Xml::XmlWriter::WriteStartElement(const String &localName, const String &ns)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | const String\& | एलिमेंट का स्थानीय नाम। |
| ns | const String\& | तत्व के साथ संबद्ध करने के लिए नेमस्पेस URI। यदि यह नेमस्पेस पहले से ही स्कोप में है और इसका एक संबद्ध प्रीफ़िक्स है, तो लेखक स्वचालित रूप से वह प्रीफ़िक्स भी लिखता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::WriteStartElement(const String\&, const String\&, const String\&) method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट प्रारंभ टैग लिखता है और इसे दिए गए नेमस्पेस और प्रीफ़िक्स से जोड़ता है।

```cpp
virtual void System::Xml::XmlWriter::WriteStartElement(const String &prefix, const String &localName, const String &ns)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| उपसर्ग | const String\& | एलिमेंट का नेमस्पेस प्रीफ़िक्स। |
| localName | const String\& | एलिमेंट का स्थानीय नाम। |
| ns | const String\& | तत्व के साथ संबद्ध करने के लिए नेमस्पेस URI। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
