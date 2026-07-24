---
title: "System::Xml::ValidationType enum"
linktitle: "ValidationType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::ValidationType enum. C++ में करने वाले वैलिडेशन के प्रकार को निर्दिष्ट करता है।"
type: docs
weight: 5500
url: /hi/cpp/system.xml/validationtype/
---
## ValidationType enum


किया जाने वाला वैधता प्रकार निर्दिष्ट करता है।

```cpp
enum class ValidationType
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| None | 0 | कोई मान्यकरण नहीं किया जाता, और कोई मान्यकरण त्रुटियाँ नहीं फेंकी जातीं। यह सेटिंग XML 1.0 अनुरूप गैर-मान्यकरण पार्सर बनाती है। |
| ऑटो | 1 | यदि DTD या स्कीमा जानकारी पाई जाती है तो मान्य करता है। |
| DTD | 2 | DTD के अनुसार मान्य करता है। |
| XDR | 3 | XML-डेटा रिड्यूस्ड (XDR) स्कीमा के अनुसार मान्य करें, जिसमें इनलाइन XDR स्कीमा शामिल हैं। XDR स्कीमा **x-schema** नेमस्पेस प्रीफ़िक्स या [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/) मान का उपयोग करके पहचाने जाते हैं। |
| Schema | 4 | XML [Schema](../../system.xml.schema/) परिभाषा भाषा (XSD) स्कीमा के अनुसार मान्य करें, जिसमें इनलाइन XML स्कीमा शामिल हैं। XML स्कीमा नेमस्पेस URI के साथ **schemaLocation** विशेषता का उपयोग करके या प्रदान किए गए **Schemas** के द्वारा जुड़े होते हैं। |

## संबंधित देखें

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
