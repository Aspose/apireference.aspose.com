---
title: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault मेथड"
linktitle: "LINQ_FirstOrDefault"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault मेथड। एक अनुक्रम का पहला तत्व लौटाता है, या यदि अनुक्रम खाली है तो डिफ़ॉल्ट मान C++ में।"
type: docs
weight: 1600
url: /hi/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


अनुक्रम का पहला तत्व लौटाता है, या यदि अनुक्रम खाली है तो डिफ़ॉल्ट मान।

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

अनुक्रम में पहला तत्व या यदि अनुक्रम खाली है तो डिफ़ॉल्ट-निर्मित मान।

## संबंधित देखें

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


अनुक्रम का पहला तत्व लौटाता है जो शर्त को पूरा करता है, या यदि ऐसा कोई तत्व नहीं मिला तो डिफ़ॉल्ट मान।

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| प्रेडिकेट | std::function\<bool(T)> | एक फ़ंक्शन जो प्रत्येक तत्व को किसी शर्त के लिए परीक्षण करता है। |

### ReturnValue

यदि स्रोत खाली है या कोई तत्व प्रेडिकेट द्वारा निर्दिष्ट परीक्षण पास नहीं करता तो default(T); अन्यथा, स्रोत में वह पहला तत्व जो प्रेडिकेट द्वारा निर्दिष्ट परीक्षण पास करता है।

## संबंधित देखें

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
