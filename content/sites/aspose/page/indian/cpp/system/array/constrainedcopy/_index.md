---
title: "System::Array::ConstrainedCopy मेथड"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::ConstrainedCopy मेथड। C++ में निर्दिष्ट स्रोत से शुरू होकर System.Array से तत्वों की एक रेंज कॉपी करता है।"
type: docs
weight: 4700
url: /hi/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


निर्दिष्ट स्रोत से शुरू होकर एक [System.Array](../) से तत्वों की रेंज कॉपी करता है।

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| पैरामीटर | विवरण |
| --- | --- |
| SrcType | स्रोत ऐरे में तत्वों का प्रकार |
| DstType | गंतव्य ऐरे में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | स्रोत ऐरे |
| srcIndex | int64_t | स्रोत ऐरे में वह इंडेक्स जो कॉपी करने वाले आइटम्स की रेंज की शुरुआत दर्शाता है |
| dstArray | const ArrayPtr\<DstType\>\& | गंतव्य ऐरे |
| dstIndex | int64_t | गंतव्य ऐरे में वह इंडेक्स जहाँ कॉपी किए गए आइटम्स को डालना शुरू किया जाता है |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |
## टिप्पणियाँ


अस्थायी कच्चा कार्यान्वयन बिना किसी अधूरे काम के!
## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
