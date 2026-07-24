---
title: "System::DefaultBoxedValue क्लास"
linktitle: "DefaultBoxedValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::DefaultBoxedValue क्लास। BoxedValue क्लास कार्यान्वयन। यह BoxingValue विशेषीकरणों को सामान्य कोड को दोहराए बिना घोषित करने की अनुमति देता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 2000
url: /hi/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | निर्दिष्ट मान का प्रतिनिधित्व करने वाली [DefaultBoxedValue](./) क्लास की नई इंस्टेंस बनाता है। |
| [Equals](./equals/)(ptr) override | वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए बॉक्स्ड वैल्यू की समानता निर्धारित करता है। |
| [GetHashCode](./gethashcode/)() const override | वर्तमान ऑब्जेक्ट के लिए हैश कोड लौटाता है। |
| [GetType](./gettype/)() const override | ऑब्जेक्ट का वास्तविक प्रकार प्राप्त करता है। |
| [is](./is/)() const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए बॉक्स्ड वैल्यू का प्रकार **V** है या नहीं। |
| [ToString](./tostring/)() const override | बॉक्स्ड वैल्यू का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [unbox](./unbox/)() const | बॉक्स्ड वैल्यू को अनबॉक्स करता है। |
## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
