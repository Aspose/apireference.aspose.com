---
title: "System::Text::RegularExpressions::Regex क्लास"
linktitle: "Regex"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::RegularExpressions::Regex क्लास। नियमित अभिव्यक्ति जो C#-जैसी सिंटैक्स का अनुसरण करती है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 800
url: /hi/cpp/system.text.regularexpressions/regex/
---
## Regex class


C#-जैसी सिंटैक्स का अनुसरण करने वाली नियमित अभिव्यक्ति। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Regex : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Escape](./escape/)(const String\&) | पैटर्न के भाग के रूप में स्ट्रिंग का उपयोग करने के लिए विशेष अक्षरों को एस्केप करता है। |
| [get_MatchTimeout](./get_matchtimeout/)() | मैचिंग टाइमआउट प्राप्त करता है। |
| [get_Options](./get_options/)() | रेजेक्स विकल्प प्राप्त करता है। |
| [get_RightToLeft](./get_righttoleft/)() | जाँचता है कि क्या मैचिंग दाएँ‑से‑बाएँ मोड में किया गया है। |
| [IsMatch](./ismatch/)(const String\&, int) | रेजेक्स को स्ट्रिंग के विरुद्ध मिलाता है। |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | जाँचता है कि स्ट्रिंग पैटर्न से मेल खाती है या नहीं। |
| [Match](./match/)(const String\&) | रेजेक्स को स्ट्रिंग के विरुद्ध मिलाता है। |
| [Match](./match/)(const String\&, int, int) | रेजेक्स को स्ट्रिंग के विरुद्ध मिलाता है। |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | स्ट्रिंग और पैटर्न को मिलाता है। |
| [Matches](./matches/)(const String\&, int) | दिए गए स्ट्रिंग में रेजेक्स के सभी मैचों को बार‑बार मिलाकर प्राप्त करता है। |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | स्ट्रिंग और पैटर्न के बीच सभी मैच प्राप्त करता है। |
| [Regex](./regex/)() | खाली रेगेक्स बनाता है। |
| [Regex](./regex/)(const String\&) | निर्माता। |
| [Regex](./regex/)(const String\&, RegexOptions) | निर्माता। |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | निर्माता। |
| [Replace](./replace/)(const String\&, const String\&) | स्ट्रिंग में रेजेक्स के सभी मैचों को प्रतिस्थापन स्ट्रिंग से बदलता है। |
| [Replace](./replace/)(const String\&, const char_t *) | स्ट्रिंग में रेजेक्स के सभी मैचों को प्रतिस्थापन स्ट्रिंग से बदलता है। |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | स्ट्रिंग में रेजेक्स के सभी मैचों को प्रतिस्थापन स्ट्रिंग से बदलता है। |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | स्ट्रिंग में रेजेक्स के सभी मैचों को प्रतिस्थापन स्ट्रिंग से बदलता है। |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | स्ट्रिंग में सभी मिलानों को प्रतिनिधि-जनित प्रतिस्थापन स्ट्रिंग्स से बदलता है। |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | स्ट्रिंग में सभी मिलानों को प्रतिनिधि-जनित प्रतिस्थापन स्ट्रिंग्स से बदलता है। |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | स्ट्रिंग में सभी मिलानों को प्रतिनिधि-जनित प्रतिस्थापन स्ट्रिंग्स से बदलता है। |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | स्ट्रिंग में सभी मिलानों को प्रतिनिधि-जनित प्रतिस्थापन स्ट्रिंग्स से बदलता है (स्थैतिक फ़ंक्शन)। |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | स्ट्रिंग में रेजेक्स के सभी मैचों को प्रतिस्थापन स्ट्रिंग से बदलता है। |
| [Replace](./replace/)(const String\&, const String\&, int) | स्ट्रिंग में उपस्ट्रिंग्स को बदलता है। लागू नहीं किया गया। |
| [Replace](./replace/)(const String\&, const String\&, int, int) | स्ट्रिंग में उपस्ट्रिंग्स को बदलता है। लागू नहीं किया गया। |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | रेजेक्स मिलानों को बदलता है। |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | रेजेक्स मिलानों को बदलता है। |
| [Split](./split/)(const String\&) | स्ट्रिंग को रेजेक्स मिलानों द्वारा विभाजित करता है। |
| [Split](./split/)(const String\&, int) | स्ट्रिंग को रेजेक्स मिलानों द्वारा विभाजित करता है। |
| [Split](./split/)(const String\&, int, int) | इनपुट स्ट्रिंग को निर्दिष्ट अधिकतम बार उपस्ट्रिंग्स की एरे में विभाजित करता है, उन स्थितियों पर जो [Regex](./) कंस्ट्रक्टर में निर्दिष्ट नियमित अभिव्यक्ति द्वारा परिभाषित हैं। नियमित अभिव्यक्ति पैटर्न की खोज इनपुट स्ट्रिंग में निर्दिष्ट अक्षर स्थिति से शुरू होती है। |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | स्ट्रिंग को रेगएक्सप्र द्वारा विभाजित करता है। |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | स्ट्रिंग को रेगएक्सप्र द्वारा विभाजित करता है। |
| [ToString](./tostring/)() const override | रेजेक्स को स्ट्रिंग में परिवर्तित करता है। |
| static [Unescape](./unescape/)(const String\&) | पैटर्न के भाग के रूप में उपयोग की गई स्ट्रिंग में विशेष अक्षरों को अनएस्केप करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | टाइमआउट द्वारा मिलान रोकने को निष्क्रिय करने के लिए विशेष टाइमआउट मान। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
