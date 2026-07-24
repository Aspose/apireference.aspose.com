---
title: "System::Array::Array constructor"
linktitle: "ऐरे"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::Array कन्स्ट्रक्टर। C++ में एक खाली एरे बनाता है।"
type: docs
weight: 100
url: /hi/cpp/system/array/array/
---
## Array::Array() constructor


एक खाली ऐरे बनाता है।

```cpp
System::Array<T>::Array()
```

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::array\<UnderlyingType, InitArraySize\>\&) constructor


एक [Array](../) ऑब्जेक्ट बनाता है और इसे निर्दिष्ट एरे से मानों से भरता है जिसमें **[UnderlyingType](../underlyingtype/)** प्रकार के तत्व होते हैं।

```cpp
template<std::size_t> System::Array<T>::Array(const std::array<UnderlyingType, InitArraySize> &init)
```


| पैरामीटर | विवरण |
| --- | --- |
| InitArraySize | **init** एरे के तत्वों की संख्या। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| init | const std::array\<UnderlyingType, InitArraySize\>\& | [Array](../) जिसे निर्मित हो रहे एरे में कॉपी किया जाएगा। |

## संबंधित देखें

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const std::vector\<Q\>\&) constructor


एक [Array](../) ऑब्जेक्ट बनाता है और इसे उन मानों से भरता है जो एक std::vector ऑब्जेक्ट से कॉपी किए गए हैं, जिसका मान प्रकार **T** के समान है लेकिन **[UnderlyingType](../underlyingtype/)** से अलग है।

```cpp
template<typename Q,typename> System::Array<T>::Array(const std::vector<Q> &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| Q | std::vector ऑब्जेक्ट के तत्वों का प्रकार जिससे तत्वों को कॉपी किया जाता है |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const std::vector<Q>\& | मानों को कॉपी करने के लिए std::vector |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(const vector_t\&) constructor


कॉपी कंस्ट्रक्टर।

```cpp
System::Array<T>::Array(const vector_t &assgn)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| assgn | const vector_t\& | मानों को कॉपी करने के लिए std::vector |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T\&) constructor


भरण कंस्ट्रक्टर।

```cpp
System::Array<T>::Array(int count, const T &init=T())
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| count | int | एरे का प्रारंभिक आकार |
| init | const T\& | ऐरे को भरने के लिए उपयोग किया गया प्रारंभिक मान |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(int, const T) constructor


भरण कंस्ट्रक्टर।

```cpp
System::Array<T>::Array(int count, const T inits[])
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| count | int | एरे का प्रारंभिक आकार |
| इनिट्स | const T | ऐरे को भरने के लिए मान |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<bool\>, int) constructor


निर्दिष्ट इनिशियलाइज़र सूची से बूल प्रकार के तत्वों को लेकर एक [Array](../) ऑब्जेक्ट बनाता है और उसे मानों से भरता है।

```cpp
System::Array<T>::Array(std::initializer_list<bool> init, int=0)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| init | std::initializer_list\<bool\> | ऐरे को भरने के लिए तत्वों वाली इनिशियलाइज़र सूची |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::initializer_list\<UnderlyingType\>) constructor


निर्दिष्ट इनिशियलाइज़र सूची से **[UnderlyingType](../underlyingtype/)** प्रकार के तत्वों को लेकर एक [Array](../) ऑब्जेक्ट बनाता है और उसे मानों से भरता है।

```cpp
System::Array<T>::Array(std::initializer_list<UnderlyingType> init)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| init | std::initializer_list\<UnderlyingType\> | ऐरे को भरने के लिए तत्वों वाली इनिशियलाइज़र सूची |

## संबंधित देखें

* Typedef [UnderlyingType](../underlyingtype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(std::vector\<Q\>\&&) constructor


एक std::vector ऑब्जेक्ट से मानों को स्थानांतरित करके एक [Array](../) ऑब्जेक्ट बनाता है, जहाँ उस वेक्टर के मानों का प्रकार **T** के समान है लेकिन **[UnderlyingType](../underlyingtype/)** से अलग है।

```cpp
template<typename Q,typename> System::Array<T>::Array(std::vector<Q> &&value)
```


| पैरामीटर | विवरण |
| --- | --- |
| Q | जिस std::vector ऑब्जेक्ट से तत्वों को स्थानांतरित किया जाएगा, उसके तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | std::vector\<Q\>\&& | मानों को कॉपी करने के लिए std::vector |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) constructor


भरण कंस्ट्रक्टर।

```cpp
template<typename ValueType> System::Array<T>::Array(typename std::enable_if<std::is_arithmetic<T>::value &&std::is_arithmetic<ValueType>::value &&std::is_convertible<ValueType, T>::value, int>::type count, ValueType init)
```


| पैरामीटर | विवरण |
| --- | --- |
| ValueType | प्रारंभिक मान का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| count | typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type | एरे का प्रारंभिक आकार |
| init | ValueType | ऐरे को भरने के लिए उपयोग किया गया प्रारंभिक मान |

## संबंधित देखें

* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Array(vector_t\&&) constructor


मूव कंस्ट्रक्टर।

```cpp
System::Array<T>::Array(vector_t &&value)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | vector_t\&& | std::vector, जिसके तत्वों को ऐरे द्वारा प्राप्त किया जाता है |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
