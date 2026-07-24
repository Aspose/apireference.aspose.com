---
title: "System::ComponentModel::RunWorkerCompletedEventArgs वर्ग"
linktitle: "RunWorkerCompletedEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::RunWorkerCompletedEventArgs वर्ग. इस वर्ग का एक उदाहरण RunWorkerCompletedEventHandler डेलीगेट को तर्क के रूप में पास किया जाता है. इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए. इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी. हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शन के तर्क के रूप में पास करें."
type: docs
weight: 1300
url: /hi/cpp/system.componentmodel/runworkercompletedeventargs/
---
## RunWorkerCompletedEventArgs class


इस वर्ग का एक उदाहरण RunWorkerCompletedEventHandler डेलीगेट को तर्क के रूप में पास किया जाता है. इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए. इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी. हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन के तर्क के रूप में पास करें.

```cpp
class RunWorkerCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Result](./get_result/)() const | एक असिंक्रोनस ऑपरेशन के परिणाम का प्रतिनिधित्व करने वाला मान प्राप्त करता है. |
| [RunWorkerCompletedEventArgs](./runworkercompletedeventargs/)(const System::SharedPtr\<System::Object\>\&, const System::Exception\&, bool) | RTTI जानकारी। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | एक स्थैतिक सदस्य जो एक "खाली" [EventArgs](../../system/eventargs/) साझा पॉइंटर (नल-पॉइंटर) को दर्शाता है। |
## संबंधित देखें

* Class [AsyncCompletedEventArgs](../asynccompletedeventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
