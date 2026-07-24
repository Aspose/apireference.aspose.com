---
title: "System::ComponentModel::CancelEventArgs वर्ग"
linktitle: "CancelEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::CancelEventArgs वर्ग. रद्द करने योग्य इवेंट के तर्क. इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए. इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी. हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन के तर्क के रूप में पास करें."
type: docs
weight: 300
url: /hi/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


रद्द करने योग्य इवेंट के तर्क. इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए. इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी. हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन के तर्क के रूप में पास करें.

```cpp
class CancelEventArgs : public System::EventArgs
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | RTTI जानकारी। |
| [CancelEventArgs](./canceleventargs/)() | कन्स्ट्रक्टर; Cancel प्रॉपर्टी को false सेट करता है. |
| [get_Cancel](./get_cancel/)() | इवेंट को रद्द किया जाना चाहिए या नहीं, यह दर्शाने वाला मान प्राप्त करता है. |
| [set_Cancel](./set_cancel/)(bool) | इवेंट को रद्द किया जाना चाहिए या नहीं, यह दर्शाने वाला मान सेट करता है. |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | एक स्थैतिक सदस्य जो एक "खाली" [EventArgs](../../system/eventargs/) साझा पॉइंटर (नल-पॉइंटर) को दर्शाता है। |
## संबंधित देखें

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
