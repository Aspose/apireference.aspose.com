---
title: "System::Xml::XmlTextWriter::WriteDocType मेथड"
linktitle: "WriteDocType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextWriter::WriteDocType मेथड। C++ में निर्दिष्ट नाम और वैकल्पिक गुणों के साथ DOCTYPE घोषणा लिखता है।"
type: docs
weight: 2500
url: /hi/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


निर्दिष्ट नाम और वैकल्पिक एट्रिब्यूट्स के साथ DOCTYPE घोषणा लिखता है।

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | const String\& | DOCTYPE का नाम। यह खाली नहीं होना चाहिए। |
| pubid | const String\& | यदि null नहीं है तो यह PUBLIC \"pubid\" \"sysid\" भी लिखता है जहाँ **pubid** और **sysid** दिए गए तर्कों के मान से प्रतिस्थापित होते हैं। |
| sysid | const String\& | यदि **pubid** null है और **sysid** null नहीं है तो यह SYSTEM \"sysid\" लिखता है जहाँ **sysid** इस तर्क के मान से प्रतिस्थापित होता है। |
| subset | const String\& | यदि null नहीं है तो यह [subset] लिखता है जहाँ subset इस तर्क के मान से प्रतिस्थापित होता है। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
