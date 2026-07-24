---
title: "System::Xml::XmlUrlResolver क्लास"
linktitle: "XmlUrlResolver"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlUrlResolver क्लास। C++ में यूनिफ़ॉर्म रिसोर्स आइडेंटिफ़ायर (URI) द्वारा नामित बाहरी XML संसाधनों को हल करता है।"
type: docs
weight: 4100
url: /hi/cpp/system.xml/xmlurlresolver/
---
## XmlUrlResolver class


Uniform Resource Identifier (URI) द्वारा नामित बाहरी XML संसाधनों को हल करता है।

```cpp
class XmlUrlResolver : public System::Xml::XmlResolver
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | एक URI को उस ऑब्जेक्ट से मैप करता है जिसमें वास्तविक संसाधन होता है। |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | बेस और रिलेटिव URI से पूर्ण (एब्सोल्यूट) URI को हल करता है। |
| [set_CachePolicy](./set_cachepolicy/)(const SharedPtr\<Net::Cache::RequestCachePolicy\>\&) | अंतर्निहित WebRequest ऑब्जेक्ट के लिए कैश नीति सेट करता है। |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | वेब अनुरोधों को प्रमाणित करने के लिए उपयोग किए जाने वाले क्रेडेंशियल्स सेट करता है। |
| [set_Proxy](./set_proxy/)(const SharedPtr\<Net::IWebProxy\>\&) | अंतर्निहित WebRequest ऑब्जेक्ट के लिए नेटवर्क प्रॉक्सी सेट करता है। |
| [XmlUrlResolver](./xmlurlresolver/)() | [XmlUrlResolver](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
