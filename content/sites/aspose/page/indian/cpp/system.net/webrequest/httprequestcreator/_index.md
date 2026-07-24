---
title: "System::Net::WebRequest::HttpRequestCreator क्लास"
linktitle: "HttpRequestCreator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebRequest::HttpRequestCreator क्लास। WebRequest-क्लास के उदाहरण बनाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 3900
url: /hi/cpp/system.net/webrequest/httprequestcreator/
---
## HttpRequestCreator class


WebRequest-क्लास के उदाहरण बनाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpRequestCreator : public System::Net::IWebRequestCreate
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<Uri\>) | निर्दिष्ट URI का उपयोग करके WebRequest-क्लास का नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
