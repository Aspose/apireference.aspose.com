---
title: "System::MakeYieldEnumerable मेथड"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Page C++ के लिए"
description: "System::MakeYieldEnumerable मेथड। C++ में एक यील्ड फ़ंक्शन से IEnumerable बनाता है।"
type: docs
weight: 25300
url: /hi/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


एक यील्ड फ़ंक्शन से IEnumerable बनाता है।

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | क्रम में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | चलाने के लिए यील्ड फ़ंक्शन |

### ReturnValue

IEnumerable के लिए साझा पॉइंटर

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
