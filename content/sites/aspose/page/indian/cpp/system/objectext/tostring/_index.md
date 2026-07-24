---
title: "System::ObjectExt::ToString मेथड"
linktitle: "ToString"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::ToString मेथड। C# ToString मेथड का विकल्प ताकि यह किसी भी C++ प्रकार पर C++ में काम कर सके।"
type: docs
weight: 1300
url: /hi/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन।

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) लिटरल को स्ट्रिंग में बदलने के लिए। |

### ReturnValue

[String](../../string/) representation of **obj**.

## संबंधित देखें

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन।

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Nullable](../../nullable/) प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) ऑब्जेक्ट को स्ट्रिंग में बदलने के लिए। |

### ReturnValue

[String](../../string/) representation of **obj**.

## संबंधित देखें

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन।

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Enum](../../enum/) प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) मान को स्ट्रिंग में बदलने के लिए। |

### ReturnValue

[String](../../string/) representation of **obj**.

## संबंधित देखें

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन।

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्मार्ट पॉइंटर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) मान को स्ट्रिंग में बदलने के लिए। |

### ReturnValue

[String](../../string/) representation of **obj**.

## संबंधित देखें

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन।

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्ट्रक्चर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | स्ट्रक्चर मान को स्ट्रिंग में बदलने के लिए। |

### ReturnValue

[String](../../string/) representation of **obj**.

## संबंधित देखें

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन।

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्केलर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | T\&& | स्केलर मान को स्ट्रिंग में बदलने के लिए। |

### ReturnValue

[String](../../string/) representation of **obj**.

## संबंधित देखें

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन।

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्केलर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | T\&& | स्केलर मान को स्ट्रिंग में बदलने के लिए। |

### ReturnValue

[String](../../string/) representation of **obj**.

## संबंधित देखें

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन।

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्मार्ट पॉइंटर प्रकार या [ExceptionWrapper](../../exceptionwrapper/). |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | T\& | स्मार्ट पॉइंटर या [ExceptionWrapper](../../exceptionwrapper/) को स्ट्रिंग में बदलने के लिए। |

### ReturnValue

[String](../../string/) representation of **obj**.

## संबंधित देखें

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन।

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्केलर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | T\& | स्केलर मान को स्ट्रिंग में बदलने के लिए। |

### ReturnValue

[String](../../string/) representation of **obj**.

## संबंधित देखें

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


किसी भी C++ प्रकार पर काम करने के लिए C# ToString मेथड का प्रतिस्थापन।

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्ट्रक्चर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | T\& | स्ट्रक्चर मान को स्ट्रिंग में बदलने के लिए। |

### ReturnValue

[String](../../string/) representation of **obj**.

## संबंधित देखें

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
