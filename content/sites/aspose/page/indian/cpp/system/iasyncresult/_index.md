---
title: "System::IAsyncResult क्लास"
linktitle: "IAsyncResult"
second_title: "Aspose.Page C++ के लिए"
description: "System::IAsyncResult क्लास। असिंक्रोनस ऑपरेशन की स्थिति दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 3100
url: /hi/cpp/system/iasyncresult/
---
## IAsyncResult class


असिंक्रोनस ऑपरेशन की स्थिति दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें।

```cpp
class IAsyncResult : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | असिंक्रोनस ऑपरेशन के बारे में जानकारी शामिल करने वाली वस्तु लौटाता है। |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | असिंक्रोनस ऑपरेशन की पूर्णता की प्रतीक्षा करने के लिए उपयोग की जा सकने वाली WaitHandle की इंस्टेंस लौटाता है। |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | एक मान लौटाता है जो यह दर्शाता है कि असिंक्रोनस ऑपरेशन सिंक्रोनस रूप से पूरा हुआ या नहीं। |
| virtual [get_IsCompleted](./get_iscompleted/)() | एक मान लौटाता है जो यह दर्शाता है कि असिंक्रोनस ऑपरेशन पूरा हुआ है या नहीं। |
| virtual [~IAsyncResult](./~iasyncresult/)() | डिस्ट्रक्टर। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [smart_ptr](./smart_ptr/) | शेयर किया गया पॉइंटर [IAsyncResult](./) के लिए। |
## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
