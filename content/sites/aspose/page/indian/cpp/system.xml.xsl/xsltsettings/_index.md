---
title: "System::Xml::Xsl::XsltSettings class"
linktitle: "XsltSettings"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::Xsl::XsltSettings क्लास। C++ में XSLT स्टाइल शीट के निष्पादन के दौरान समर्थन करने के लिए XSLT सुविधाओं को निर्दिष्ट करता है।"
type: docs
weight: 800
url: /hi/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


XSLT शैली पत्रक के निष्पादन के दौरान समर्थन करने के लिए XSLT सुविधाओं को निर्दिष्ट करता है।

```cpp
class XsltSettings : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [get_Default](./get_default/)() | डिफ़ॉल्ट सेटिंग्स के साथ एक [XsltSettings](./) ऑब्जेक्ट लौटाता है। XSLT **document()** फ़ंक्शन और एम्बेडेड स्क्रिप्ट ब्लॉक्स के लिए समर्थन निष्क्रिय है। |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | XSLT **document()** फ़ंक्शन के समर्थन को सक्षम करने के बारे में संकेत देने वाला मान लौटाता है। |
| [get_EnableScript](./get_enablescript/)() | एम्बेडेड स्क्रिप्ट ब्लॉक्स के समर्थन को सक्षम करने के बारे में संकेत देने वाला मान लौटाता है। |
| static [get_TrustedXslt](./get_trustedxslt/)() | एक [XsltSettings](./) ऑब्जेक्ट लौटाता है जो XSLT **document()** फ़ंक्शन और एम्बेडेड स्क्रिप्ट ब्लॉक्स के समर्थन को सक्षम करता है। |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | XSLT **document()** फ़ंक्शन के समर्थन को सक्षम करने के बारे में संकेत देने वाला मान सेट करता है। |
| [set_EnableScript](./set_enablescript/)(bool) | एम्बेडेड स्क्रिप्ट ब्लॉक्स के समर्थन को सक्षम करने के बारे में संकेत देने वाला मान सेट करता है। |
| [XsltSettings](./xsltsettings/)() | डिफ़ॉल्ट सेटिंग्स के साथ [XsltSettings](./) क्लास का नया उदाहरण प्रारंभ करता है। |
| [XsltSettings](./xsltsettings/)(bool, bool) | निर्दिष्ट सेटिंग्स के साथ [XsltSettings](./) क्लास का नया उदाहरण प्रारंभ करता है। |
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
