---
title: "System::Xml::XmlTextWriter::XmlTextWriter कंस्ट्रक्टर"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextWriter::XmlTextWriter कंस्ट्रक्टर। निर्दिष्ट स्ट्रीम और एन्कोडिंग का उपयोग करके C++ में XmlTextWriter क्लास का एक उदाहरण बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


निर्दिष्ट स्ट्रीम और एन्कोडिंग का उपयोग करके [XmlTextWriter](../) क्लास का एक उदाहरण बनाता है।

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | वह स्ट्रीम जिससे आप लिखना चाहते हैं। |
| encoding | const SharedPtr\<Text::Encoding\>\& | जनरेट करने के लिए एन्कोडिंग। यदि एन्कोडिंग **nullptr** है तो यह स्ट्रीम को UTF-8 के रूप में लिखता है और **ProcessingInstruction** से एन्कोडिंग एट्रिब्यूट को हटा देता है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


निर्दिष्ट TextWriter का उपयोग करके [XmlTextWriter](../) क्लास का एक उदाहरण बनाता है।

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | लिखने के लिए TextWriter। यह माना जाता है कि TextWriter पहले से ही सही एन्कोडिंग पर सेट है। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


निर्दिष्ट फ़ाइल का उपयोग करके [XmlTextWriter](../) क्लास का एक उदाहरण बनाता है।

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| filename | const String\& | लिखने के लिए फ़ाइलनाम। यदि फ़ाइल मौजूद है, तो इसे ट्रंकेट कर नया सामग्री के साथ ओवरराइट किया जाता है। |
| encoding | const SharedPtr\<Text::Encoding\>\& | जनरेट करने के लिए एन्कोडिंग। यदि एन्कोडिंग **nullptr** है तो यह फ़ाइल को UTF-8 के रूप में लिखता है और **ProcessingInstruction** से एन्कोडिंग एट्रिब्यूट को हटा देता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
