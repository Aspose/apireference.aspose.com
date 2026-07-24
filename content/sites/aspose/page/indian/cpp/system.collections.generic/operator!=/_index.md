---
title: "System::Collections::Generic::operator!= मेथड"
linktitle: "operator!="
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::operator!= मेथड। C++ में उल्टे ''equals'' सेमान्टिक्स का उपयोग करके दो कुंजी-मूल्य युग्मों की तुलना करता है।"
type: docs
weight: 5300
url: /hi/cpp/system.collections.generic/operator!=/
---
## System::Collections::Generic::operator!= method


उल्टे 'equals' सेमान्टिक्स का उपयोग करके दो कुंजी-मूल्य युग्मों की तुलना करता है।

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator!=(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
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

यदि दोनों कुंजियों और मानों का मेल नहीं है तो सत्य, अन्यथा असत्य।

## संबंधित देखें

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
