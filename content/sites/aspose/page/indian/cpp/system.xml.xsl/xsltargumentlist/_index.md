---
title: "System::Xml::Xsl::XsltArgumentList वर्ग"
linktitle: "XsltArgumentList"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XsltArgumentList वर्ग। इसमें एक परिवर्तनीय संख्या में तर्क होते हैं जो या तो XSLT पैरामीटर होते हैं या C++ में एक्सटेंशन ऑब्जेक्ट्स।"
type: docs
weight: 400
url: /hi/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


इसमें एक परिवर्तनीय संख्या में तर्क होते हैं, जो या तो XSLT पैरामीटर या एक्सटेंशन ऑब्जेक्ट होते हैं।

```cpp
class XsltArgumentList : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | [XsltArgumentList](./) में एक नया ऑब्जेक्ट जोड़ता है और उसे नेमस्पेस URI के साथ संबद्ध करता है। |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | [XsltArgumentList](./) में एक पैरामीटर जोड़ता है और उसे नेमस्पेस योग्य नाम के साथ संबद्ध करता है। |
| [Clear](./clear/)() | [XsltArgumentList](./) से सभी पैरामीटर और एक्सटेंशन ऑब्जेक्ट्स को हटाता है। |
| [GetExtensionObject](./getextensionobject/)(const String\&) | दिए गए नेमस्पेस के साथ संबद्ध ऑब्जेक्ट को लौटाता है। |
| [GetParam](./getparam/)(const String\&, const String\&) | नेमस्पेस योग्य नाम के साथ संबद्ध पैरामीटर को लौटाता है। |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | ऑब्जेक्ट को नेमस्पेस URI के साथ [XsltArgumentList](./) से हटाता है। |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | पैरामीटर को [XsltArgumentList](./) से हटाता है। |
| [XsltArgumentList](./xsltargumentlist/)() | [XsltArgumentList](./) का नया उदाहरण बनाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
