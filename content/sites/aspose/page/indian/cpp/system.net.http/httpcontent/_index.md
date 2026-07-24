---
title: "System::Net::Http::HttpContent क्लास"
linktitle: "HttpContent"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::HttpContent क्लास। HTTP इकाई की सामग्री का प्रतिनिधित्व करता है। इस क्लास की वस्तु को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 400
url: /hi/cpp/system.net.http/httpcontent/
---
## HttpContent class


HTTP इकाई की सामग्री का प्रतिनिधित्व करता है। इस क्लास का [Object](../../system/object/) केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpContent : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Dispose](./dispose/)() override | वर्तमान इंस्टेंस को नष्ट करता है। यह मेथड 'ReadAsStream' द्वारा लौटाए गए स्ट्रीम और यदि बनाया गया हो तो मेमोरी बफ़र को भी नष्ट करता है। |
| [get_Headers](./get_headers/)() | HTTP सामग्री हेडर लौटाता है। |
| [LoadIntoBuffer](./loadintobuffer/)() | सामग्री को मेमोरी बफ़र में सीरियलाइज़ करता है। |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | सामग्री को मेमोरी बफ़र में सीरियलाइज़ करता है। |
| [ReadAsByteArray](./readasbytearray/)() | सामग्री को सीरियलाइज़ करता है और बाइट ऐरे लौटाता है। |
| [ReadAsStream](./readasstream/)() | सामग्री को सीरियलाइज़ करता है और एक स्ट्रीम लौटाता है। |
| [ReadAsString](./readasstring/)() | सामग्री को सीरियलाइज़ करता है और एक स्ट्रिंग लौटाता है। |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | सामग्री का आकार गणना करने का प्रयास करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | डिफ़ॉल्ट एन्कोडिंग। |
| static [MaxBufferSize](./maxbuffersize/) | बाइट्स की अधिकतम संख्या। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
