---
title: "System::Xml::WriteState एन्नुम"
linktitle: "WriteState"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::WriteState एन्नुम। C++ में XmlWriter की स्थिति निर्दिष्ट करता है।"
type: docs
weight: 5700
url: /hi/cpp/system.xml/writestate/
---
## WriteState enum


[XmlWriter](../xmlwriter/) की स्थिति निर्दिष्ट करता है।

```cpp
enum class WriteState
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| शुरू | 0 | इसे दर्शाता है कि XmlWriter::Write मेथड अभी तक नहीं बुलाया गया है। |
| Prolog | 1 | इसे दर्शाता है कि प्रोलॉग लिखा जा रहा है। |
| Element | 2 | इसे दर्शाता है कि एक एलिमेंट की प्रारम्भ टैग लिखी जा रही है। |
| Attribute | 3 | इसे दर्शाता है कि एक एट्रिब्यूट वैल्यू लिखी जा रही है। |
| Content | 4 | इसे दर्शाता है कि एलिमेंट की सामग्री लिखी जा रही है। |
| Closed | 5 | इसे दर्शाता है कि [XmlWriter::Close](../xmlwriter/close/) मेथड को बुलाया गया है। |
| Error | 6 | एक एक्सेप्शन फेंका गया है, जिससे [XmlWriter](../xmlwriter/) एक अमान्य स्थिति में रह गया है। आप [XmlWriter::Close](../xmlwriter/close/) मेथड को कॉल करके [XmlWriter](../xmlwriter/) को [WriteState::Closed](./) स्थिति में ला सकते हैं। किसी भी अन्य [XmlWriter](../xmlwriter/) मेथड कॉल से InvalidOperationException उत्पन्न होता है। |

## संबंधित देखें

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
