---
title: "System::Net::IPHostEntry क्लास"
linktitle: "IPHostEntry"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::IPHostEntry क्लास। इंटरनेट होस्ट एड्रेस के बारे में जानकारी दर्शाता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 2600
url: /hi/cpp/system.net/iphostentry/
---
## IPHostEntry class


इंटरनेट होस्ट एड्रेस के बारे में जानकारी दर्शाता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class IPHostEntry : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | होस्ट के IP पतों का संग्रह प्राप्त करता है। |
| [get_Aliases](./get_aliases/)() | होस्ट के उपनामों का संग्रह प्राप्त करता है। |
| [get_HostName](./get_hostname/)() const | RTTI जानकारी। |
| [IPHostEntry](./iphostentry/)() | एक नया उदाहरण बनाता है। |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | होस्ट के IP पतों का संग्रह सेट करता है। |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | होस्ट के उपनामों का संग्रह सेट करता है। |
| [set_HostName](./set_hostname/)(String) | होस्ट नाम सेट करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
