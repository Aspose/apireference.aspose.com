---
title: "System::MakeYieldEnumerator विधि"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Page C++ के लिए"
description: "System::MakeYieldEnumerator विधि। C++ में एक yield फ़ंक्शन से IEnumerator बनाता है।"
type: docs
weight: 25400
url: /hi/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


एक yield फ़ंक्शन से IEnumerator बनाता है।

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | क्रम में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | चलाने के लिए यील्ड फ़ंक्शन |

### ReturnValue

IEnumerator के लिए साझा पॉइंटर

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
