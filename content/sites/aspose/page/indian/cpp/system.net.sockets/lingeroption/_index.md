---
title: "System::Net::Sockets::LingerOption class"
linktitle: "LingerOption"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::LingerOption class. यह निर्दिष्ट करता है कि क्या सॉकेट Close() या Close() मेथड्स को कॉल करने के बाद भी कनेक्टेड रहेगा। यह यह भी निर्दिष्ट करता है कि डेटा भेजना जारी रहने पर सॉकेट कितने समय तक कनेक्टेड रहेगा। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्युमेंट के रूप में पास करने के लिए करें। C++ में।"
type: docs
weight: 200
url: /hi/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


यह निर्दिष्ट करता है कि क्या सॉकेट Close() या Close() मेथड्स को कॉल करने के बाद भी कनेक्टेड रहेगा। यह यह भी निर्दिष्ट करता है कि डेटा भेजना जारी रहने पर सॉकेट कितने समय तक कनेक्टेड रहेगा। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्युमेंट के रूप में पास करने के लिए करें।

```cpp
class LingerOption : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Enabled](./get_enabled/)() | RTTI जानकारी। |
| [get_LingerTime](./get_lingertime/)() | सेकंड में देरी टाइमआउट प्राप्त करता है। |
| [LingerOption](./lingeroption/)(bool, int32_t) | एक नया उदाहरण बनाता है। |
| [set_Enabled](./set_enabled/)(bool) | एक मान सेट करता है जो दर्शाता है कि सॉकेट सभी पेंडिंग डेटा भेजने के प्रयास में बंद होने में देरी करेगा या नहीं। |
| [set_LingerTime](./set_lingertime/)(int32_t) | सेकंड में देरी टाइमआउट सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
