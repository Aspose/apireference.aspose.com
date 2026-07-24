---
title: "System::Diagnostics::TraceListener class"
linktitle: "TraceListener"
second_title: "Aspose.Page C++ के लिए"
description: "System::Diagnostics::TraceListener class। डिबग और ट्रेस जानकारी पर प्रतिक्रिया देने के लिए इंटरफ़ेस। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 800
url: /hi/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


डिबग और ट्रेस जानकारी पर प्रतिक्रिया देने के लिए इंटरफ़ेस। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
class TraceListener : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | डिबगर में विफलता संदेश लिखता है। |
| virtual [Fail](./fail/)(System::String, System::String) | डिबगर में विफलता संदेश लिखता है। |
| virtual [Write](./write/)(System::String) | RTTI जानकारी। |
| virtual [WriteLine](./writeline/)(System::String) | डिबगर में पंक्ति लिखता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
