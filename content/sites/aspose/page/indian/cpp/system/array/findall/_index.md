---
title: "System::Array::FindAll method"
linktitle: "FindAll"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::FindAll method. निर्दिष्ट प्रेडिकेट द्वारा परिभाषित शर्तों से मेल खाने वाले सभी तत्वों को C++ में प्राप्त करता है।"
type: docs
weight: 5200
url: /hi/cpp/system/array/findall/
---
## Array::FindAll method


निर्दिष्ट प्रेडिकेट द्वारा परिभाषित शर्तों से मेल खाने वाले सभी तत्वों को प्राप्त करता है।

```cpp
static System::ArrayPtr<T> System::Array<T>::FindAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) में तत्व खोजने के लिए |
| मिलान | System::Predicate\<T\> | एक प्रेडिकेट जो एरे के तत्वों के मिलान की शर्तों को परिभाषित करता है |

### ReturnValue

एक [Array](../) जिसमें सभी तत्व होते हैं जो निर्दिष्ट प्रेडिकेट द्वारा परिभाषित शर्तों से मेल खाते हैं, यदि मिले; अन्यथा, एक खाली [Array](../)।

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
