---
title: "System::Collections::Generic::operator== मेथड"
linktitle: "operator=="
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::operator== मेथड। दो कुंजी-मूल्य जोड़ों की तुलना ''equals'' सेमांटिक्स का उपयोग करके करता है। दोनों कुंजियों और मानों के लिए operator == या EqualsTo मेथड का उपयोग करता है, जो भी C++ में परिभाषित है।"
type: docs
weight: 5600
url: /hi/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


दो कुंजी-मूल्य जोड़ों की तुलना 'equals' सेमांटिक्स का उपयोग करके करता है। दोनों कुंजियों और मानों के लिए operator == या EqualsTo मेथड का उपयोग करता है, जो भी परिभाषित है।

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| पैरामीटर | विवरण |
| --- | --- |
| TKey | कुंजी प्रकार। |
| TValue | वैल्यू टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बाएँ | const KeyValuePair\<TKey, TValue\>\& | बाएँ हाथ का ऑपरेण्ड। |
| दाएँ | const KeyValuePair\<TKey, TValue\>\& | RHS ऑपरेण्ड। |

### ReturnValue

यदि दोनों कुंजियाँ और मान मेल खाते हैं तो सत्य, अन्यथा असत्य।

## संबंधित देखें

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
