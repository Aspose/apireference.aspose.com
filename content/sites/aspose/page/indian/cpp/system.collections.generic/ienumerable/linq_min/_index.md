---
title: "System::Collections::Generic::IEnumerable::LINQ_Min मेथड"
linktitle: "LINQ_Min"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Collections::Generic::IEnumerable क्लास के LINQ_Min मेथड का उपयोग कैसे करें।"
type: docs
weight: 2100
url: /hi/cpp/system.collections.generic/ienumerable/linq_min/
---
## IEnumerable::LINQ_Min(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<Source, ResultType> &selector)
```

## संबंधित देखें

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Min(const Func\<T, ResultType\>\&) method


एक सामान्य अनुक्रम के प्रत्येक तत्व पर ट्रांसफ़ॉर्म फ़ंक्शन को कॉल करता है और न्यूनतम परिणामी मान लौटाता है।

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<T, ResultType> &selector)
```


| पैरामीटर | विवरण |
| --- | --- |
| ResultType | सेलेक्टर द्वारा लौटाए गए मान का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | प्रत्येक तत्व पर लागू करने के लिए एक ट्रांसफ़ॉर्म फ़ंक्शन। |

### ReturnValue

क्रम में न्यूनतम मान।

## संबंधित देखें

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
