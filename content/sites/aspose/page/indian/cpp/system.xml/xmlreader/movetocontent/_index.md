---
title: "System::Xml::XmlReader::MoveToContent मेथड"
linktitle: "MoveToContent"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader::MoveToContent मेथड। जाँचता है कि वर्तमान नोड सामग्री (गैर-व्हाइटस्पेस टेक्स्ट, CDATA, Element, EndElement, EntityReference, या EndEntity) नोड है या नहीं। यदि नोड सामग्री नोड नहीं है, तो रीडर अगले सामग्री नोड या फ़ाइल के अंत तक स्किप करता है। यह निम्न प्रकार के नोड्स को स्किप करता है: ProcessingInstruction, DocumentType, Comment, Whitespace, या SignificantWhitespace C++ में।"
type: docs
weight: 3300
url: /hi/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


जाँचता है कि वर्तमान नोड एक कंटेंट (गैर-खाली स्थान पाठ, **CDATA**, **Element**, **EndElement**, **EntityReference**, या **EndEntity**) नोड है या नहीं। यदि नोड कंटेंट नोड नहीं है, तो रीडर अगले कंटेंट नोड या फ़ाइल के अंत तक आगे बढ़ जाता है। यह निम्न प्रकार के नोड्स को छोड़ देता है: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, या **SignificantWhitespace**।

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

विधि द्वारा पाए गए वर्तमान नोड का [XmlReader::get_NodeType](../get_nodetype/) मान या [XmlNodeType::None](../../xmlnodetype/) यदि रीडर इनपुट स्ट्रीम के अंत तक पहुँच गया है।

## संबंधित देखें

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
