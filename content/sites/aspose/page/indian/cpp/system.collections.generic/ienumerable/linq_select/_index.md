---
title: "System::Collections::Generic::IEnumerable::LINQ_Select method"
linktitle: "LINQ_Select"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Collections::Generic::IEnumerable क्लास की LINQ_Select मेथड का उपयोग कैसे करें।"
type: docs
weight: 2600
url: /hi/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<Source, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, Result> &selector)
```

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


एक अनुक्रम के प्रत्येक तत्व को उसके इंडेक्स को शामिल करके नई रूप में परिवर्तित करता है।

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| पैरामीटर | विवरण |
| --- | --- |
| ResultType | **selector** द्वारा लौटाए गए मान का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | एक ट्रांसफ़ॉर्म फ़ंक्शन। |

### ReturnValue

एक [IEnumerable](../) जो **selector** फ़ंक्शन द्वारा लौटाए गए तत्वों को सम्मिलित करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


एक अनुक्रम के तत्वों को परिवर्तित करता है।

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| पैरामीटर | विवरण |
| --- | --- |
| ResultType | **selector** द्वारा लौटाए गए मान का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | एक ट्रांसफ़ॉर्म फ़ंक्शन। |

### ReturnValue

एक [IEnumerable](../) जो **selector** फ़ंक्शन द्वारा लौटाए गए तत्वों को सम्मिलित करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
