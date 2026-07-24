---
title: "System::Net::WebClient क्लास"
linktitle: "WebClient"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebClient क्लास। WebClient डेटा भेजने और प्राप्त करने के सामान्य मेथड प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 3500
url: /hi/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | निर्दिष्ट संसाधन को बाइट एरे के रूप में डाउनलोड करता है। |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | निर्दिष्ट संसाधन को बाइट एरे के रूप में डाउनलोड करता है। |
| [DownloadString](./downloadstring/)(const String\&) const | निर्दिष्ट संसाधन को स्ट्रिंग के रूप में डाउनलोड करता है। |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | निर्दिष्ट संसाधन को स्ट्रिंग के रूप में डाउनलोड करता है। |
| [get_Encoding](./get_encoding/)() const | स्ट्रिंग्स को डाउनलोड या अपलोड करने के लिए उपयोग किए जाने वाले एन्कोडिंग को प्राप्त करता है। |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | स्ट्रिंग्स को डाउनलोड या अपलोड करने के लिए उपयोग किए जाने वाले एन्कोडिंग को सेट करता है। |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | लागू नहीं किया गया। |
| [WebClient](./webclient/)() | RTTI जानकारी। |
| [~WebClient](./~webclient/)() | वर्तमान इंस्टेंस को नष्ट करता है। |
## संबंधित देखें

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
