---
title: "System::Diagnostics::StackFrame क्लास"
linktitle: "StackFrame"
second_title: "Aspose.Page C++ के लिए"
description: "System::Diagnostics::StackFrame क्लास। एकल स्टैक फ्रेम पर जानकारी प्राप्त करता है। केवल MSVS। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 500
url: /hi/cpp/system.diagnostics/stackframe/
---
## StackFrame class


एकल स्टैक फ्रेम पर जानकारी प्राप्त करता है। केवल MSVS। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class StackFrame : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | colnum संख्या प्राप्त करता है। |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | लाइन संख्या प्राप्त करता है। |
| virtual [GetFileName](./getfilename/)() | फ़ाइल नाम प्राप्त करता है। |
| [GetMethod](./getmethod/)() | मेथड जानकारी प्राप्त करता है। |
| [operator=](./operator=/)(const StackFrame\&) const | कोई परिवर्तन नहीं। |
| [StackFrame](./stackframe/)(int) | वर्तमान स्टैक ऑफ़सेट पर स्टैक फ्रेम बनाता है। |
| [StackFrame](./stackframe/)(const StackFrame\&) | कॉपी नहीं किया जा सकता। |
| virtual [~StackFrame](./~stackframe/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
