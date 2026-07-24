---
title: "System::Xml::Schema::XmlSeverityType एनम"
linktitle: "XmlSeverityType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Schema::XmlSeverityType एनम। C++ में वैधता घटना की गंभीरता को दर्शाता है।"
type: docs
weight: 8100
url: /hi/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


वैधता इवेंट की गंभीरता को दर्शाता है।

```cpp
enum class XmlSeverityType
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| Error | 0 | इंस्टेंस दस्तावेज़ को मान्य करते समय एक वैधता त्रुटि हुई है, यह दर्शाता है। यह दस्तावेज़ प्रकार परिभाषाओं (DTDs) और XML [Schema](../) परिभाषा भाषा (XSD) स्कीमा पर लागू होता है। World Wide [Web](../../system.web/) Consortium (W3C) वैधता प्रतिबंधों को त्रुटियों के रूप में माना जाता है। यदि कोई वैधता घटना हैंडलर नहीं बनाया गया है, तो त्रुटियाँ अपवाद फेंकती हैं। |
| Warning | 1 | एक वैधता घटना हुई है जो त्रुटि नहीं है, यह दर्शाता है। जब कोई DTD नहीं होता, या किसी विशेष तत्व या विशेषता को मान्य करने के लिए XML [Schema](../) नहीं होता, तो सामान्यतः एक चेतावनी जारी की जाती है। त्रुटियों के विपरीत, चेतावनियों को वैधता घटना हैंडलर न होने पर अपवाद नहीं फेंका जाता। |

## संबंधित देखें

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
