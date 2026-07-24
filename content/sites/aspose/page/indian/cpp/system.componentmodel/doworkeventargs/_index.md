---
title: "System::ComponentModel::DoWorkEventArgs क्लास"
linktitle: "DoWorkEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::DoWorkEventArgs क्लास। DoWork इवेंट तर्क। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 600
url: /hi/cpp/system.componentmodel/doworkeventargs/
---
## DoWorkEventArgs class


DoWork इवेंट तर्क। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class DoWorkEventArgs : public System::ComponentModel::CancelEventArgs
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DoWorkEventArgs](./doworkeventargs/)(const SharedPtr\<System::Object\>\&) | RTTI जानकारी। |
| [get_Argument](./get_argument/)() | Argument प्रॉपर्टी प्राप्त करता है; लागू नहीं किया गया। |
| [get_Result](./get_result/)() | Result प्रॉपर्टी प्राप्त करता है; लागू नहीं किया गया। |
| [set_Result](./set_result/)(const SharedPtr\<System::Object\>\&) | Result प्रॉपर्टी सेट करता है; लागू नहीं किया गया। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | एक स्थैतिक सदस्य जो एक "खाली" [EventArgs](../../system/eventargs/) साझा पॉइंटर (नल-पॉइंटर) को दर्शाता है। |
## संबंधित देखें

* Class [CancelEventArgs](../canceleventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
