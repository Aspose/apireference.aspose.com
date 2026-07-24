---
title: "System::ReadOnlySpan क्लास"
linktitle: "ReadOnlySpan"
second_title: "Aspose.Page C++ के लिए"
description: "System::ReadOnlySpan क्लास। C++ में Span क्लास के भीतर उपयोग के लिए फ़ॉरवर्ड।"
type: docs
weight: 5300
url: /hi/cpp/system/readonlyspan/
---
## ReadOnlySpan class


फ़ॉरवर्ड उपयोग के लिए [Span](../span/) क्लास के भीतर।

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्पैन में तत्वों का प्रकार। यह क्लास ऑब्जेक्ट्स की निरंतर अनुक्रमों के साथ केवल-पढ़ने योग्य तरीके से काम करने के लिए टाइप-सेफ तरीका प्रदान करती है। इसे ऐरे, स्टैक ऐरे, या कच्चे पॉइंटर्स को रैप करने के लिए उपयोग किया जा सकता है जबकि बाउंड्स चेकिंग बनाए रखी जाती है। [ReadOnlySpan](./) उस मेमोरी का स्वामी नहीं है जिस पर यह इंगित करता है - यह केवल मौजूदा मेमोरी का एक दृश्य है। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | एक नियमित स्पैन से केवल-पढ़ने योग्य स्पैन बनाता है। |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | एक ऐरे को [ReadOnlySpan](./) में परिवर्तित करता है। |
## टिप्पणियाँ


एक मनमाने मेमोरी के केवल-पढ़ने योग्य निरंतर क्षेत्र का प्रतिनिधित्व करता है।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
