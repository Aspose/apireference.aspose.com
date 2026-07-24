---
title: "System::ComponentModel::ProgressChangedEventArgs क्लास"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::ProgressChangedEventArgs क्लास। इस क्लास का एक उदाहरण ProgressChangedEventHandler डेलीगेट को तर्क के रूप में पास किया जाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1100
url: /hi/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


इस क्लास का एक उदाहरण ProgressChangedEventHandler डेलीगेट को तर्क के रूप में पास किया जाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | असिंक्रोनस कार्य की प्रगति प्रतिशत प्राप्त करता है। |
| [get_UserState](./get_userstate/)() const | एक अद्वितीय उपयोगकर्ता स्थिति प्राप्त करता है। |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | निर्माता। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | एक स्थैतिक सदस्य जो एक "खाली" [EventArgs](../../system/eventargs/) साझा पॉइंटर (नल-पॉइंटर) को दर्शाता है। |
## संबंधित देखें

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
