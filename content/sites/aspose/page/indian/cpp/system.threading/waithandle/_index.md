---
title: "System::Threading::WaitHandle क्लास"
linktitle: "WaitHandle"
second_title: "Aspose.Page C++ के लिए"
description: "System::Threading::WaitHandle class. प्रतीक्षा करने वाला प्रिमिटिव बेस क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।"
type: docs
weight: 1700
url: /hi/cpp/system.threading/waithandle/
---
## WaitHandle class


प्रतीक्षा करने वाला प्रिमिटिव बेस क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class WaitHandle : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Close](./close/)() | हैंडल से जुड़ा कोई भी संसाधन रिलीज़ करता है। |
| [get_Handle](./get_handle/)() | हैंडल प्राप्त करता है। |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | RTTI जानकारी। |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | सभी हैंडल के फायर होने की प्रतीक्षा करता है। |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | सभी हैंडल के फायर होने की प्रतीक्षा करता है। |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | किसी भी हैंडल के फायर होने की प्रतीक्षा करता है। |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | किसी भी हैंडल के फायर होने की प्रतीक्षा करता है। |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | किसी भी हैंडल के फायर होने की प्रतीक्षा करता है। |
| virtual [WaitOne](./waitone/)() | असीमित अवधि तक हैंडल के फायर होने का इंतजार करता है। |
| virtual [WaitOne](./waitone/)(int) | हैंडल के फायर होने का इंतजार करता है। |
| virtual [WaitOne](./waitone/)(TimeSpan) | हैंडल के फायर होने का इंतजार करता है। |
| virtual [WaitOne](./waitone/)(int, bool) | हैंडल के फायर होने का इंतजार करता है। |
| virtual [~WaitHandle](./~waithandle/)() | डिस्ट्रक्टर। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | फ़ंक्शन द्वारा लौटाया जाने वाला विशेष मान, अन्यथा एरे में सिग्नल्ड ऑब्जेक्ट का इंडेक्स लौटाता है, यदि टाइमआउट समाप्त हो जाता है और कुछ भी सिग्नल नहीं करता। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
