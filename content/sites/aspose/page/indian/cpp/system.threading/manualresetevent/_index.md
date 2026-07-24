---
title: "System::Threading::ManualResetEvent क्लास"
linktitle: "ManualResetEvent"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::ManualResetEvent class. वह इवेंट जो प्रतीक्षा कर रहे थ्रेड को सूचित करता है और स्वचालित रूप से रीसेट नहीं होता। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।"
type: docs
weight: 700
url: /hi/cpp/system.threading/manualresetevent/
---
## ManualResetEvent class


[Event](../../system/event/) to notify waiting thread that does not reset automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ManualResetEvent : public System::Threading::EventWaitHandle
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ManualResetEvent](./manualresetevent/)(bool) | RTTI जानकारी। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | फ़ंक्शन द्वारा लौटाया जाने वाला विशेष मान, अन्यथा एरे में सिग्नल्ड ऑब्जेक्ट का इंडेक्स लौटाता है, यदि टाइमआउट समाप्त हो जाता है और कुछ भी सिग्नल नहीं करता। |
## संबंधित देखें

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
