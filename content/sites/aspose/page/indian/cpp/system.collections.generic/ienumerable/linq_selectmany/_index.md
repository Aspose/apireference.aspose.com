---
title: "System::Collections::Generic::IEnumerable::LINQ_SelectMany मेथड"
linktitle: "LINQ_SelectMany"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Collections::Generic::IEnumerable क्लास के LINQ_SelectMany मेथड का उपयोग कैसे करें।"
type: docs
weight: 2700
url: /hi/cpp/system.collections.generic/ienumerable/linq_selectmany/
---
## IEnumerable::LINQ_SelectMany(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<Source, SharedPtr<IEnumerable<Result>>> &selector)
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_SelectMany(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) method


एक अनुक्रम के प्रत्येक तत्व को प्रोजेक्ट करता है और परिणामी अनुक्रमों को एक ही अनुक्रम में संयोजित करता है।

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<T, SharedPtr<IEnumerable<ResultType>>> &selector)
```


| पैरामीटर | विवरण |
| --- | --- |
| ResultType | **selector** द्वारा लौटाए गए मान का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| selector | const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\& | एक ट्रांसफ़ॉर्म फ़ंक्शन। |

### ReturnValue

[IEnumerable](../) जो इनपुट अनुक्रम के प्रत्येक तत्व पर एक-से-कई प्रोजेक्शन फ़ंक्शन को कॉल करने के परिणाम को रखता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
