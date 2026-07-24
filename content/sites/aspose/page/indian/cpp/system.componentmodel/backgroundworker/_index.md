---
title: "System::ComponentModel::BackgroundWorker क्लास"
linktitle: "BackgroundWorker"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::BackgroundWorker क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 200
url: /hi/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class BackgroundWorker : public System::ComponentModel::Component
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [BackgroundWorker](./backgroundworker/)() | RTTI जानकारी। |
| [get_WorkerReportsProgress](./get_workerreportsprogress/)() const | [System::ComponentModel::BackgroundWorker](./) प्रोग्रेस अपडेट रिपोर्ट कर सकता है या नहीं, यह दर्शाने वाला मान प्राप्त करता है। |
| [ReportProgress](./reportprogress/)(int) | **System::ComponentModel::BackgroundWorker::ProgressChanged** इवेंट को उठाता है। |
| [ReportProgress](./reportprogress/)(int, const System::SharedPtr\<System::Object\>\&) | userState ऑब्जेक्ट के साथ **System::ComponentModel::BackgroundWorker::ProgressChanged** इवेंट को उठाता है। |
| [RunWorkerAsync](./runworkerasync/)() | एक बैकग्राउंड ऑपरेशन का निष्पादन शुरू करता है। |
| [RunWorkerAsync](./runworkerasync/)(const System::SharedPtr\<System::Object\>\&) | एक बैकग्राउंड ऑपरेशन का निष्पादन शुरू करता है। |
| [set_WorkerReportsProgress](./set_workerreportsprogress/)(bool) | [System::ComponentModel::BackgroundWorker](./) प्रोग्रेस अपडेट रिपोर्ट कर सकता है या नहीं, यह दर्शाने वाला मान सेट करता है। |
| [~BackgroundWorker](./~backgroundworker/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Component](../component/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
