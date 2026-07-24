---
title: "System::IDisposable class"
linktitle: "IDisposable"
second_title: "Aspose.Page C++ के लिए"
description: "System::IDisposable class. वर्तमान ऑब्जेक्ट द्वारा स्वामित्व वाले संसाधनों को मुक्त करने वाला मेथड परिभाषित करता है। इस क्लास के ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन्स को आर्ग्युमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 3600
url: /hi/cpp/system/idisposable/
---
## IDisposable class


वर्तमान ऑब्जेक्ट द्वारा स्वामित्व वाले संसाधनों को मुक्त करने वाला मेथड परिभाषित करता है। इस क्लास के ऑब्जेक्ट्स को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन्स को आर्ग्युमेंट के रूप में पास करने के लिए करें।

```cpp
class IDisposable : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Dispose](./dispose/)() | कुछ नहीं करता। |
## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
