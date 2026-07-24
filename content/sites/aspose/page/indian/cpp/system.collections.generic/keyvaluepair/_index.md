---
title: "System::Collections::Generic::KeyValuePair क्लास"
linktitle: "KeyValuePair"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::KeyValuePair क्लास। कुंजी और मान की जोड़ी। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान द्वारा या संदर्भ द्वारा पास किया जाना चाहिए। C++ में इस प्रकार की वस्तुओं को प्रबंधित करने के लिए System::SmartPtr क्लास का कभी उपयोग न करें।"
type: docs
weight: 2900
url: /hi/cpp/system.collections.generic/keyvaluepair/
---
## KeyValuePair class


कुंजी और मान की जोड़ी। इस प्रकार को स्टैक पर आवंटित किया जाना चाहिए और फ़ंक्शनों को मान द्वारा या संदर्भ द्वारा पास किया जाना चाहिए। इस प्रकार की वस्तुओं को प्रबंधित करने के लिए [System::SmartPtr](../../system/smartptr/) क्लास का कभी उपयोग न करें।

```cpp
template<typename TKey,typename TValue>class KeyValuePair
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_Key](./get_key/)() const | कुंजी प्राप्त करता है। |
| [get_Value](./get_value/)() const | मान प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const | कुंजी और मान के हैश को XOR करके कुंजी-मान जोड़ी का हैश गणना करता है। |
| [IsNull](./isnull/)() const | हमेशा false लौटाता है। |
| [KeyValuePair](./keyvaluepair/)() | नल कुंजी-मान जोड़ी प्रारंभकर्ता। |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | निर्माता। |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | प्रकार रूपांतरण कंस्ट्रक्टर। |
| [operator<](./operator_/)(const KeyValuePair\&) const | क्लासों के लिए पैच जो [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/) से विरासत में मिली हैं, कुछ भी तुलना नहीं करता। |
| [ToString](./tostring/)() const | कुंजी-मान जोड़ी को स्ट्रिंग में बदलता है। |

## संबंधित देखें

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
