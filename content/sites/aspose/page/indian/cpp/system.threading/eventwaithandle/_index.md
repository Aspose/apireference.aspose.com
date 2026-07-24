---
title: "System::Threading::EventWaitHandle class"
linktitle: "EventWaitHandle"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::EventWaitHandle class। वह इवेंट जो प्रतीक्षा कर रहे थ्रेड को भेजा जा सकता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 500
url: /hi/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | RTTI जानकारी। |
| virtual [Reset](./reset/)() | इवेंट को गैर-सिग्नलिंग स्थिति में सेट करता है। |
| virtual [Set](./set/)() | इवेंट को सिग्नलिंग स्थिति में सेट करता है। |
| [~EventWaitHandle](./~eventwaithandle/)() | डिस्ट्रक्टर। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | फ़ंक्शन द्वारा लौटाया जाने वाला विशेष मान, अन्यथा एरे में सिग्नल्ड ऑब्जेक्ट का इंडेक्स लौटाता है, यदि टाइमआउट समाप्त हो जाता है और कुछ भी सिग्नल नहीं करता। |
## संबंधित देखें

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
