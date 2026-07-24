---
title: "System::ObjectType::GetType मेथड"
linktitle: "GetType"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectType::GetType मेथड। typeof() अनुवाद को लागू करता है। C++ में प्रिमिटिव टाइप्स के लिए ओवरलोड।"
type: docs
weight: 100
url: /hi/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। प्रिमिटिव टाइप्स के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| पैरामीटर | विवरण |
| --- | --- |
| T | प्रिमिटिव टाइप। |

### ReturnValue

निर्दिष्ट टाइप का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। एनीम टाइप्स के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| पैरामीटर | विवरण |
| --- | --- |
| T | प्रिमिटिव टाइप। |

### ReturnValue

निर्दिष्ट टाइप का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। स्ट्रक्चर्स और पॉइंटर्स के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| पैरामीटर | विवरण |
| --- | --- |
| T | प्रिमिटिव टाइप। |

### ReturnValue

निर्दिष्ट संरचना का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। [Nullable](../../nullable/) के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Nullable](../../nullable/) प्रकार। |

### ReturnValue

निर्दिष्ट संरचना का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। MutlicastDelegate के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| पैरामीटर | विवरण |
| --- | --- |
| T | MutlicastDelegate टाइप। |

### ReturnValue

निर्दिष्ट संरचना का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। स्ट्रक्चर्स और पॉइंटर्स के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| पैरामीटर | विवरण |
| --- | --- |
| T | प्रिमिटिव टाइप। |

### ReturnValue

निर्दिष्ट संरचना या यदि [SmartPtr](../../smartptr/) के लिए बुलाया गया हो तो पॉइंटी टाइप का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। uint8_t के लिए ओवरलोड।

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## संबंधित देखें

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। char16_t के लिए ओवरलोड।

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## संबंधित देखें

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। int32_t के लिए ओवरलोड।

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## संबंधित देखें

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। int64_t के लिए ओवरलोड।

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## संबंधित देखें

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। bool के लिए ओवरलोड।

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## संबंधित देखें

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


typeof() अनुवाद को लागू करता है। [Void](../../void/) के लिए ओवरलोड।

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## संबंधित देखें

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const String\&) method


typeof() अनुवाद को लागू करता है। स्ट्रिंग टाइप के लिए ओवरलोड।

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | प्रिमिटिव टाइप। |

### ReturnValue

[String](../../string/) टाइप का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() अनुवाद को लागू करता है। स्मार्ट पॉइंटर्स के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | पॉइंटर ऑब्जेक्ट टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) के लिए [TypeInfo](../../typeinfo/) प्राप्त करने हेतु। |

### ReturnValue

पारित ऑब्जेक्ट की अंतिम क्लास का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() अनुवाद को लागू करता है। स्ट्रक्चर्स के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्ट्रक्चर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) के लिए [TypeInfo](../../typeinfo/) प्राप्त करने हेतु। |

### ReturnValue

पारित ऑब्जेक्ट की अंतिम क्लास का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() अनुवाद को लागू करता है। एक्सेप्शन्स के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Exception](../../exception/) टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) के लिए [TypeInfo](../../typeinfo/) प्राप्त करने हेतु। |

### ReturnValue

पारित ऑब्जेक्ट की अंतिम क्लास का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


typeof() अनुवाद को लागू करता है। प्रिमिटिव टाइप्स के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | प्रिमिटिव टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

पारित ऑब्जेक्ट के टाइप का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


typeof() अनुवाद को लागू करता है। [Nullable](../../nullable/) टाइप्स के लिए ओवरलोड।

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [Nullable](../../nullable/) प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

पारित ऑब्जेक्ट के टाइप का वर्णन करने वाली [TypeInfo](../../typeinfo/) संरचना का कॉन्स्ट रेफ़रेंस।

## संबंधित देखें

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
