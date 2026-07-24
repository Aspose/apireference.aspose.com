---
title: "System::Diagnostics::Stopwatch क्लास"
linktitle: "Stopwatch"
second_title: "Aspose.Page C++ के लिए"
description: "System::Diagnostics::Stopwatch क्लास। समय मापन की अनुमति देता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 700
url: /hi/cpp/system.diagnostics/stopwatch/
---
## Stopwatch class


समय मापन की अनुमति देता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Stopwatch : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Elapsed](./get_elapsed/)() const | वर्तमान उदाहरण द्वारा मापे गए कुल बीते समय को प्राप्त करता है। |
| [get_ElapsedMilliseconds](./get_elapsedmilliseconds/)() const | वर्तमान उदाहरण द्वारा मापे गए कुल बीते समय को मिलीसेकंड में प्राप्त करता है। |
| [get_ElapsedTicks](./get_elapsedticks/)() const | वर्तमान उदाहरण द्वारा मापे गए कुल बीते समय को टाइमर टिक में प्राप्त करता है। |
| [get_IsRunning](./get_isrunning/)() const | जाँचता है कि स्टॉपवॉच चल रहा है या नहीं। |
| [Reset](./reset/)() | समय मापन को रोकता है, मापे गए अंतराल को शून्य पर सेट करता है। |
| [Restart](./restart/)() | मापे गए अंतराल को शून्य पर सेट करता है, फिर समय मापन शुरू करता है। |
| [Start](./start/)() | समय मापन शुरू करता है। |
| static [StartNew](./startnew/)() | नया [Stopwatch](./) ऑब्जेक्ट बनाता है और मापन शुरू करता है। |
| [Stop](./stop/)() | समय मापन को रोकता है। |
| [Stopwatch](./stopwatch/)() | RTTI जानकारी। |
| virtual [~Stopwatch](./~stopwatch/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
