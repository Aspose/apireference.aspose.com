---
title: "System::Xml::XmlWriter::WriteDocType विधि"
linktitle: "WriteDocType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlWriter::WriteDocType विधि। जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो C++ में निर्दिष्ट नाम और वैकल्पिक गुणों के साथ DOCTYPE घोषणा लिखता है।"
type: docs
weight: 1700
url: /hi/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट नाम और वैकल्पिक गुणों के साथ DOCTYPE घोषणा लिखता है।

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | const String\& | DOCTYPE का नाम। यह खाली नहीं होना चाहिए। |
| pubid | const String\& | यदि null नहीं है तो यह PUBLIC \"pubid\" \"sysid\" भी लिखता है जहाँ **pubid** और **sysid** दिए गए तर्कों के मान से प्रतिस्थापित होते हैं। |
| sysid | const String\& | यदि **pubid** **nullptr** है और **sysid** नॉन-नल है, तो यह SYSTEM "sysid" लिखता है जहाँ **sysid** को इस तर्क के मान से प्रतिस्थापित किया जाता है। |
| subset | const String\& | यदि null नहीं है तो यह [subset] लिखता है जहाँ subset इस तर्क के मान से प्रतिस्थापित होता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
