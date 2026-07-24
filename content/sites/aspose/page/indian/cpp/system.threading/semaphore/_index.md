---
title: "System::Threading::Semaphore वर्ग"
linktitle: "Semaphore"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::Semaphore वर्ग। सेमाफोर कार्यान्वयन। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1000
url: /hi/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Release](./release/)() | सेमाफोर पर लॉक जारी करता है। |
| [Release](./release/)(int) | सेमाफोर पर कई लॉक जारी करता है। |
| virtual [Reset](./reset/)() | सेमाफोर को गैर-सिग्नल्ड स्थिति में सेट करता है। समर्थित नहीं है। |
| [Semaphore](./semaphore/)(int, int) | RTTI जानकारी। |
| [Semaphore](./semaphore/)(int, int, const String\&) | नामित सेमाफोर बनाता है। |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | नामित सेमाफोर बनाता है। |
| virtual [Set](./set/)() | सेमाफोर को सिग्नल्ड स्थिति में सेट करता है। समर्थित नहीं है। |
| [WaitOne](./waitone/)() override | सेमाफोर को लॉक करता है। यदि आवश्यक हो तो असीमित प्रतीक्षा करता है। |
| [WaitOne](./waitone/)(int) override | सेमाफोर को लॉक करता है। यदि आवश्यक हो तो प्रतीक्षा करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | फ़ंक्शन द्वारा लौटाया जाने वाला विशेष मान, अन्यथा एरे में सिग्नल्ड ऑब्जेक्ट का इंडेक्स लौटाता है, यदि टाइमआउट समाप्त हो जाता है और कुछ भी सिग्नल नहीं करता। |
## संबंधित देखें

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
