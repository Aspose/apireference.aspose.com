---
title: "System::ObjectExt::Unbox मेथड"
linktitle: "Unbox"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::Unbox मेथड। Object में बदलने के बाद वैल्यू टाइप्स को अनबॉक्स करता है। C++ में एनीम प्रकारों के लिए कार्यान्वयन।"
type: docs
weight: 1400
url: /hi/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


[Object](../../object/) में बदलने के बाद वैल्यू टाइप्स को अनबॉक्स करता है। एनीम प्रकारों के लिए कार्यान्वयन।

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Enum](../../enum/) प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) को अनबॉक्स करने के लिए। |

### ReturnValue

[Enum](../../enum/) value.

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


[Object](../../object/) में बदलने के बाद वैल्यू टाइप्स को अनबॉक्स करता है। नॉन-एनीम और नॉन-नलएबल प्रकारों के लिए कार्यान्वयन।

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वैल्यू टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) को अनबॉक्स करने के लिए। |

### ReturnValue

अनबॉक्स किया गया मान।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


[Object](../../object/) में बदलने के बाद वैल्यू टाइप्स को अनबॉक्स करता है। नॉन-एनीम और नॉन-नलएबल प्रकारों के लिए कार्यान्वयन।

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वैल्यू टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) को अनबॉक्स करने के लिए। |

### ReturnValue

अनबॉक्स किया गया मान।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


स्ट्रिंग वैल्यू को अनबॉक्स करता है।

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) को अनबॉक्स करने के लिए |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## संबंधित देखें

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


enum प्रकारों को पूर्णांक में अनबॉक्स करता है।

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | गंतव्य पूर्णांक प्रकार। |
| E | स्रोत एनीम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| e | E | अनबॉक्स करने के लिए मान। |

### ReturnValue

एनम का पूर्णांक प्रतिनिधित्व।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


enum प्रकारों को परिवर्तित करता है।

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | गंतव्य एनम प्रकार। |
| E | स्रोत एनीम प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| e | E | अनबॉक्स करने के लिए मान। |

### ReturnValue

परिवर्तित एनम मान।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
