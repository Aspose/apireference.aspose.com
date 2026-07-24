---
title: "System::Net::WebProxy क्लास"
linktitle: "WebProxy"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::WebProxy क्लास। एक HTTP वेब-प्रॉक्सी सर्वर को दर्शाता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 3700
url: /hi/cpp/system.net/webproxy/
---
## WebProxy class


एक HTTP वेब-प्रॉक्सी सर्वर को दर्शाता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही अलोकेट किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम एरर या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन्स को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class WebProxy : public System::Net::IWebProxy
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Address](./get_address/)() | वर्तमान प्रॉक्सी सर्वर का पता प्राप्त करता है। |
| [get_BypassList](./get_bypasslist/)() | उन पतों की सूची प्राप्त करता है जो प्रॉक्सी सर्वर का उपयोग नहीं करते। |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | एक मान प्राप्त करता है जो दर्शाता है कि स्थानीय पतों के लिए प्रॉक्सी सर्वर का उपयोग करना आवश्यक है या नहीं। |
| virtual [get_Credentials](./get_credentials/)() | प्रॉक्सी सर्वर को प्रमाणीकरण के लिए भेजे जाने वाले क्रेडेंशियल्स प्राप्त करता है। |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | एक मान प्राप्त करता है जो दर्शाता है कि डिफ़ॉल्ट क्रेडेंशियल्स को अनुरोधों के साथ भेजना आवश्यक है या नहीं। |
| static [GetDefaultProxy](./getdefaultproxy/)() | इंटरनेट एक्सप्लोरर की गैर-डायनामिक सेटिंग्स का उपयोग करने वाले प्रॉक्सी को लौटाता है। |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | वेब अनुरोध के लिए प्रॉक्सी किया गया URI लौटाता है। |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | जाँचता है कि निर्दिष्ट URI के लिए प्रॉक्सी सर्वर का उपयोग नहीं किया गया है या नहीं। |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | वर्तमान प्रॉक्सी सर्वर का पता सेट करता है। |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | प्रॉक्सी सर्वर का उपयोग न करने वाले पतों की सूची सेट करता है। |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | स्थानीय पतों के लिए प्रॉक्सी सर्वर का उपयोग करना आवश्यक है या नहीं, यह दर्शाने वाला मान सेट करता है। |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | प्रॉक्सी सर्वर को प्रमाणीकरण के लिए भेजे जाने वाले क्रेडेंशियल्स सेट करता है। |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | डिफ़ॉल्ट क्रेडेंशियल्स को अनुरोधों के साथ भेजना आवश्यक है या नहीं, यह दर्शाने वाला मान सेट करता है। |
| [WebProxy](./webproxy/)() | एक नया उदाहरण बनाता है। |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | एक नया उदाहरण बनाता है। |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | एक नया उदाहरण बनाता है। |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | एक नया उदाहरण बनाता है। |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | एक नया उदाहरण बनाता है। |
| [WebProxy](./webproxy/)(String, int32_t) | एक नया उदाहरण बनाता है। |
| [WebProxy](./webproxy/)(String) | एक नया उदाहरण बनाता है। |
| [WebProxy](./webproxy/)(String, bool) | एक नया उदाहरण बनाता है। |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | एक नया उदाहरण बनाता है। |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
