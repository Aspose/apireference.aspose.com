---
title: "System::Diagnostics::StackTrace क्लास"
linktitle: "StackTrace"
second_title: "Aspose.Page C++ के लिए"
description: "System::Diagnostics::StackTrace क्लास। स्टैक फ्रेम्स का संग्रह। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार को स्टैक पर या operator new का उपयोग करके कभी भी इंस्टैंस न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें C++ में।"
type: docs
weight: 600
url: /hi/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


स्टैक फ्रेम्स का संग्रह। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार को स्टैक पर या operator new का उपयोग करके कभी भी इंस्टैंस न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class StackTrace : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | स्टैक ट्रेस में फ्रेम्स की गिनती प्राप्त करता है। |
| virtual [GetFrame](./getframe/)(uint32_t) | स्टैक फ्रेम प्राप्त करता है। |
| [operator=](./operator=/)(const StackTrace\&) const | कोई असाइनमेंट नहीं। |
| [StackTrace](./stacktrace/)() | वर्तमान स्टैक स्थिति का वर्णन करने वाला स्टैक ट्रेस बनाता है। |
| [StackTrace](./stacktrace/)(bool) | वर्तमान स्टैक स्थिति का वर्णन करने वाला स्टैक ट्रेस बनाता है। |
| [StackTrace](./stacktrace/)(const StackTrace\&) | कॉपी नहीं किया जा सकता। |
| virtual [~StackTrace](./~stacktrace/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
