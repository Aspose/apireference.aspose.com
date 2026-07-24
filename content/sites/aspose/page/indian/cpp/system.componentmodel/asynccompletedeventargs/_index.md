---
title: "System::ComponentModel::AsyncCompletedEventArgs क्लास"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::AsyncCompletedEventArgs क्लास। इस क्लास की एक इंस्टेंस को AsyncCompletedEventHandler डेलीगेट को तर्क के रूप में पास किया जाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 100
url: /hi/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


इस क्लास की एक इंस्टेंस को AsyncCompletedEventHandler डेलीगेट को तर्क के रूप में पास किया जाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | निर्माता। |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | [System.ComponentModel.AsyncCompletedEventArgs](./) क्लास की नई इंस्टेंस को प्रारंभ करता है। |
| [get_Cancelled](./get_cancelled/)() const | एक मान प्राप्त करता है जो दर्शाता है कि क्या कोई असिंक्रोनस ऑपरेशन रद्द किया गया है। यदि बैकग्राउंड ऑपरेशन रद्द किया गया है तो true; अन्यथा false। डिफ़ॉल्ट false है। |
| [get_Error](./get_error/)() const | एक मान प्राप्त करता है जो दर्शाता है कि असिंक्रोनस ऑपरेशन के दौरान कौन सी त्रुटि हुई। |
| [get_UserState](./get_userstate/)() const | असिंक्रोनस टास्क के लिए अद्वितीय पहचानकर्ता प्राप्त करता है। एक ऑब्जेक्ट रेफ़रेंस जो असिंक्रोनस टास्क को विशिष्ट रूप से पहचानता है; यदि कोई मान सेट नहीं किया गया है तो null। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | एक स्थैतिक सदस्य जो एक "खाली" [EventArgs](../../system/eventargs/) साझा पॉइंटर (नल-पॉइंटर) को दर्शाता है। |
## संबंधित देखें

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
