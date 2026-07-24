---
title: "System::Span class"
linktitle: "Span"
second_title: "Aspose.Page C++ के लिए"
description: "System::Span क्लास। यह C++ में C++20 की std::span के समान मनमाने मेमोरी के सतत क्षेत्र का प्रतिनिधित्व करता है।"
type: docs
weight: 5700
url: /hi/cpp/system/span/
---
## Span class


C++20 के std::span के समान मनमाने मेमोरी के निरंतर क्षेत्र का प्रतिनिधित्व करता है।

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्पैन में तत्वों का प्रकार। यह क्लास ऑब्जेक्ट्स की सतत अनुक्रमों के साथ काम करने के लिए टाइप-सेफ तरीका प्रदान करती है। इसे एरेज़, स्टैक एरेज़, या रॉ पॉइंटर्स को लपेटने के लिए उपयोग किया जा सकता है जबकि बाउंड्स चेकिंग बनाए रखी जाती है। [Span](./) मेमोरी का मालिक नहीं है—यह केवल मौजूदा मेमोरी का एक दृश्य है। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clear](./clear/)() const | स्पैन की सभी तत्वों को डिफ़ॉल्ट मान पर सेट करके उसकी सामग्री को साफ़ करता है। |
| [Fill](./fill/)(const T\&) const | स्पैन को निर्दिष्ट मान से भरता है। |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | एक एरे को [Span](./) में परिवर्तित करता है। |

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
