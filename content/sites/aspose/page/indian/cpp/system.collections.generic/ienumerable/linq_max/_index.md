---
title: "System::Collections::Generic::IEnumerable::LINQ_Max विधि"
linktitle: "LINQ_Max"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Collections::Generic::IEnumerable वर्ग की LINQ_Max विधि का उपयोग कैसे करें।"
type: docs
weight: 2000
url: /hi/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## संबंधित देखें

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


एक सामान्य अनुक्रम के प्रत्येक तत्व पर ट्रांसफ़ॉर्म फ़ंक्शन को कॉल करता है और अधिकतम परिणामी मान लौटाता है।

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| पैरामीटर | विवरण |
| --- | --- |
| ResultType | सेलेक्टर द्वारा लौटाए गए मान का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | प्रत्येक तत्व पर लागू करने के लिए एक ट्रांसफ़ॉर्म फ़ंक्शन। |

### ReturnValue

क्रम में अधिकतम मान।

## संबंधित देखें

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
