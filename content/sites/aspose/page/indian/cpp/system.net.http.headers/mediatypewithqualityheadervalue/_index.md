---
title: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue क्लास"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue क्लास। ''Content-Type'' हेडर के मान में अतिरिक्त गुणवत्ता कारक के साथ एक MIME प्रकार का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों में तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1300
url: /hi/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


''Content-Type'' हेडर के मान में अतिरिक्त गुणवत्ता कारक के साथ एक MIME प्रकार का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों में तर्क के रूप में पास करने के लिए करें।

```cpp
class MediaTypeWithQualityHeaderValue : public System::Net::Http::Headers::MediaTypeHeaderValue
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Quality](./get_quality/)() | RTTI जानकारी। |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)() | एक नया उदाहरण बनाता है। |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String) | एक नया उदाहरण बनाता है। |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String, double) | एक नया उदाहरण बनाता है। |
| static [Parse](./parse/)(String) | पास किए गए स्ट्रिंग को [MediaTypeWithQualityHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करता है। |
| [set_Quality](./set_quality/)(Nullable\<double\>) | एक गुणवत्ता मान सेट करता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | पास किए गए स्ट्रिंग को [MediaTypeWithQualityHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करने का प्रयास करता है। |
## संबंधित देखें

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
