---
title: "System::Drawing::Printing::PrintPageEventArgs क्लास"
linktitle: "PrintPageEventArgs"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Printing::PrintPageEventArgs क्लास। PrintPage इवेंट के लिए डेटा प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 900
url: /hi/cpp/system.drawing.printing/printpageeventargs/
---
## PrintPageEventArgs class


PrintPage इवेंट के लिए डेटा प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class PrintPageEventArgs : public System::EventArgs
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Graphics](./get_graphics/)() | लागू नहीं किया गया। |
| [get_HasMorePages](./get_hasmorepages/)() | लागू नहीं किया गया। |
| [get_PageSettings](./get_pagesettings/)() | लागू नहीं किया गया। |
| [PrintPageEventArgs](./printpageeventargs/)(const SharedPtr\<Graphics\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<Rectangle\>\&, const SharedPtr\<PageSettings\>\&) | नया [PrintPageEventArgs](./) क्लास का इंस्टेंस बनाता है। |
| [set_HasMorePages](./set_hasmorepages/)(bool) | लागू नहीं किया गया। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | एक स्थैतिक सदस्य जो एक "खाली" [EventArgs](../../system/eventargs/) साझा पॉइंटर (नल-पॉइंटर) को दर्शाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए एक साझा पॉइंटर का उपनाम। |
## संबंधित देखें

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Page for C++](../../)
