---
title: "System::Xml::XmlWriter::WriteProcessingInstruction मेथड"
linktitle: "WriteProcessingInstruction"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlWriter::WriteProcessingInstruction मेथड। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो यह नाम और पाठ के बीच एक स्पेस के साथ प्रोसेसिंग इंस्ट्रक्शन लिखता है इस प्रकार: <?name text?> C++ में।"
type: docs
weight: 2700
url: /hi/cpp/system.xml/xmlwriter/writeprocessinginstruction/
---
## XmlWriter::WriteProcessingInstruction method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो नाम और पाठ के बीच एक स्पेस के साथ प्रोसेसिंग इंस्ट्रक्शन को इस प्रकार लिखता है: **<?name text?>**।

```cpp
virtual void System::Xml::XmlWriter::WriteProcessingInstruction(String name, String text)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्रोसेसिंग इंस्ट्रक्शन का नाम। |
| text | String | प्रोसेसिंग इंस्ट्रक्शन में शामिल करने के लिए पाठ। |
## टिप्पणियाँ



यह मेथड पहले ही [XmlWriter::WriteStartDocument](../writestartdocument/) को कॉल करने के बाद XML घोषणा बनाने के लिए उपयोग किया जा रहा है।
## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
