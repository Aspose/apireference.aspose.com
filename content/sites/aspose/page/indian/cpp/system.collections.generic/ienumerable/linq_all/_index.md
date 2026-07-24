---
title: "System::Collections::Generic::IEnumerable::LINQ_All method"
linktitle: "LINQ_All"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::IEnumerable::LINQ_All method. C++ में यह निर्धारित करता है कि क्या क्रम के सभी तत्व किसी शर्त को पूरा करते हैं।"
type: docs
weight: 700
url: /hi/cpp/system.collections.generic/ienumerable/linq_all/
---
## IEnumerable::LINQ_All method


निर्धारित करता है कि क्या अनुक्रम के सभी तत्व किसी शर्त को पूरा करते हैं।

```cpp
bool System::Collections::Generic::IEnumerable<T>::LINQ_All(std::function<bool(T)> predicate)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रेडिकेट | std::function\<bool(T)> | एक फ़ंक्शन जो प्रत्येक तत्व को किसी शर्त के लिए परीक्षण करता है। |

### ReturnValue

यदि स्रोत क्रम के प्रत्येक तत्व निर्दिष्ट प्रेडिकेट में परीक्षण पास करता है, या यदि क्रम खाली है तो true; अन्यथा false।

## संबंधित देखें

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
