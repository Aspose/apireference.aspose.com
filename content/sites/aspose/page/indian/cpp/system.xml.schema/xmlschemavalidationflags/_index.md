---
title: "System::Xml::Schema::XmlSchemaValidationFlags enum"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSchemaValidationFlags enum. स्कीमा वैधता विकल्प निर्दिष्ट करता है जो C++ में XmlSchemaValidator और XmlReader क्लासों द्वारा उपयोग किए जाते हैं।"
type: docs
weight: 7900
url: /hi/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


स्कीमा वैधता विकल्प निर्दिष्ट करता है जो [XmlSchemaValidator](../xmlschemavalidator/) और [XmlReader](../../system.xml/xmlreader/) क्लासों द्वारा उपयोग किए जाते हैं।

```cpp
enum class XmlSchemaValidationFlags
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| None | 0 | पहचान बाधाओं, इनलाइन स्कीमाओं, स्कीमा स्थान संकेतों को प्रोसेस न करें, या स्कीमा वैधता चेतावनियों की रिपोर्ट न करें। |
| ProcessInlineSchema | 1 | वैधता के दौरान मिलने वाली इनलाइन स्कीमाओं को प्रोसेस करें। |
| ProcessSchemaLocation | 2 | वैधता के दौरान मिलने वाले स्कीमा स्थान संकेतों (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**) को प्रोसेस करें। |
| ReportValidationWarnings | 4 | वैधता के दौरान मिलने वाली स्कीमा वैधता चेतावनियों की रिपोर्ट करें। |
| ProcessIdentityConstraints | 8 | वैधता के दौरान मिलने वाली पहचान बाधाओं (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**) को प्रोसेस करें। |
| AllowXmlAttributes | 16 | xml:* विशेषताओं को अनुमति दें भले ही वे स्कीमा में परिभाषित न हों। इन विशेषताओं को उनके डेटा प्रकार के आधार पर वैध किया जाएगा। |

## संबंधित देखें

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
