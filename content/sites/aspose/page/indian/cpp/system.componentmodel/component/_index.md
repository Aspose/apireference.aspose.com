---
title: "System::ComponentModel::Component क्लास"
linktitle: "Component"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::Component क्लास। अनुवादित कोड को Component क्लास का उपयोग करके संकलनीय बनाने के लिए डमी क्लास। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 400
url: /hi/cpp/system.componentmodel/component/
---
## Component class


अनुवादित कोड को [Component](./) क्लास का उपयोग करके संकलनीय बनाने के लिए डमी क्लास। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Component](./component/)() | RTTI जानकारी। |
| [Dispose](./dispose/)(bool) | डिस्पोजेबल पैटर्न समर्थन; कुछ नहीं करता। |
| [get_DesignMode](./get_designmode/)() | जाँचता है कि घटक डिज़ाइन मोड में है या नहीं। |
## संबंधित देखें

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
