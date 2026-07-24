---
title: "System::Net::NetworkInformation::IPGlobalProperties क्लास"
linktitle: "IPGlobalProperties"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::NetworkInformation::IPGlobalProperties क्लास। स्थानीय कंप्यूटर के नेटवर्क कनेक्शन की जानकारी का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार को स्टैक पर या operator new का उपयोग करके कभी भी इंस्टेंस न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें C++ में।"
type: docs
weight: 200
url: /hi/cpp/system.net.networkinformation/ipglobalproperties/
---
## IPGlobalProperties class


स्थानीय कंप्यूटर के नेटवर्क कनेक्शन के बारे में जानकारी का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

```cpp
class IPGlobalProperties : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_DomainName](./get_domainname/)() | स्थानीय कंप्यूटर के पंजीकृत डोमेन को लौटाता है। |
| virtual [get_HostName](./get_hostname/)() | स्थानीय कंप्यूटर का होस्ट नाम लौटाता है। |
| static [GetIPGlobalProperties](./getipglobalproperties/)() | RTTI जानकारी। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net::NetworkInformation](../)
* Library [Aspose.Page for C++](../../)
