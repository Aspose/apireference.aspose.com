---
title: "System::Array::Exists मेथड"
linktitle: "Exists"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::Exists मेथड। निर्धारित करता है कि निर्दिष्ट Array ऑब्जेक्ट में कोई तत्व है जो C++ में निर्दिष्ट प्रेडिकेट की आवश्यकताओं को पूरा करता है।"
type: docs
weight: 5000
url: /hi/cpp/system/array/exists/
---
## Array::Exists method


निर्धारित करता है कि निर्दिष्ट [Array](../) ऑब्जेक्ट में कोई तत्व है जो निर्दिष्ट प्रेडिकेट की आवश्यकताओं को पूरा करता है।

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | तत्व को खोजने के लिए array |
| मिलान | std::function\<bool(T)> | फ़ंक्शन ऑब्जेक्ट जो आवश्यकताओं को परिभाषित करता है और जांचता है कि कोई तत्व उन्हें पूरा करता है या नहीं |

### ReturnValue

यदि **arr** में कोई तत्व है जो **match** द्वारा परिभाषित आवश्यकताओं को पूरा करता है तो True

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
