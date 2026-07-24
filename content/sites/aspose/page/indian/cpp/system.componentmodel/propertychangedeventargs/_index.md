---
title: "System::ComponentModel::PropertyChangedEventArgs क्लास"
linktitle: "PropertyChangedEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::PropertyChangedEventArgs क्लास। PropertyChanged इवेंट के तर्क। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1200
url: /hi/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


PropertyChanged इवेंट के तर्क। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | RTTI जानकारी। |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | PropertyChanged इवेंट के तर्कों को प्रारंभ करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | एक स्थैतिक सदस्य जो एक "खाली" [EventArgs](../../system/eventargs/) साझा पॉइंटर (नल-पॉइंटर) को दर्शाता है। |
## संबंधित देखें

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
