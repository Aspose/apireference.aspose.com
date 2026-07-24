---
title: "System::Xml::ReadState enum"
linktitle: "ReadState"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::ReadState enum. C++ में रीडर की स्थिति निर्दिष्ट करता है।"
type: docs
weight: 5300
url: /hi/cpp/system.xml/readstate/
---
## ReadState enum


रीडर की स्थिति को निर्दिष्ट करता है।

```cpp
enum class ReadState
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| Initial | 0 | यह [XmlReader::Read](../xmlreader/read/) मेथड अभी तक कॉल नहीं किया गया है। |
| Interactive | 1 | यह [XmlReader::Read](../xmlreader/read/) मेथड कॉल किया गया है। अतिरिक्त मेथड्स रीडर पर कॉल किए जा सकते हैं। |
| Error | 2 | एक त्रुटि हुई है जो पढ़ने के ऑपरेशन को जारी रखने से रोकती है। |
| EndOfFile | 3 | फ़ाइल का अंत सफलतापूर्वक पहुँच गया है। |
| Closed | 4 | यह [XmlReader::Close](../xmlreader/close/) मेथड कॉल किया गया है। |

## संबंधित देखें

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
