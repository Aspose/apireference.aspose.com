---
title: "System::Net::Http::ByteArrayContent class"
linktitle: "ByteArrayContent"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::ByteArrayContent class. HTTP सामग्री को बाइट ऐरे के रूप में दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 100
url: /hi/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


HTTP सामग्री को बाइट ऐरे के रूप में दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | RTTI जानकारी। |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | एक नया उदाहरण बनाता है। |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | बाइट ऐरे की लंबाई की गणना करने का प्रयास करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | डिफ़ॉल्ट एन्कोडिंग। |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | बाइट्स की अधिकतम संख्या। |
## संबंधित देखें

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
