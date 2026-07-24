---
title: "System::StaticCast मेथड"
linktitle: "StaticCast"
second_title: "Aspose.Page C++ के लिए"
description: "System::StaticCast मेथड. C++ में नॉन-पॉइंटर ऑब्जेक्ट्स पर स्टैटिक कास्ट करता है।"
type: docs
weight: 38500
url: /hi/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


नॉन-पॉइंटर ऑब्जेक्ट्स पर स्टैटिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्ष्य प्रकार। |
| TFrom | स्रोत प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const TFrom\& | स्रोत ऑब्जेक्ट। |

### ReturnValue

यदि कास्ट अनुमति है तो कास्ट परिणाम।

## Deprecated
बैकवर्ड संगतता के लिए छोड़ा गया है। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom\&) method


[Exception](../exception/) ऑब्जेक्ट्स पर स्थैतिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित [Exception](../exception/) प्रकार। |
| TFrom | स्रोत [Exception](../exception/) प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const TFrom\& | स्रोत पॉइंटर। |

### ReturnValue

यदि कास्ट अनुमति है तो कास्ट परिणाम।

## Deprecated
बैकवर्ड संगतता के लिए छोड़ा गया है। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom *) method


अंकगणितीय प्रकारों के लिए विशेषीकरण।

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


[SmartPtr](../smartptr/) ऑब्जेक्ट्स पर स्थैतिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित पॉइनी प्रकार। |
| TFrom | स्रोत पॉइनी प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | स्रोत पॉइंटर। |

### ReturnValue

यदि कास्ट अनुमति है तो कास्ट परिणाम।

## Deprecated
बैकवर्ड संगतता के लिए छोड़ा गया है। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\>) method


Objects को [Exception](../exception/) ऑब्जेक्ट्स में स्थैतिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित [Exception](../exception/) प्रकार। |
| TFrom | [Object](../object/) प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | स्रोत पॉइंटर। |

### ReturnValue

यदि कास्ट अनुमति है तो कास्ट परिणाम।

## Deprecated
बैकवर्ड संगतता के लिए छोड़ा गया है। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(std::nullptr_t) method


नल ऑब्जेक्ट्स का स्टैटिक कास्ट करता है।

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित पॉइनी प्रकार। |

### ReturnValue

nullptr।

## Deprecated
बैकवर्ड संगतता के लिए छोड़ा गया है। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TFrom) method


अंकगणितीय प्रकारों के लिए विशेषीकरण।

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TTo) method


कास्ट प्रोसेस करें [String](../string/) से [String](../string/) तक।

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## संबंधित देखें

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


[WeakPtr](../weakptr/) ऑब्जेक्ट्स पर स्थैतिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित पॉइनी प्रकार। |
| TFrom | स्रोत पॉइनी प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | स्रोत पॉइंटर। |

### ReturnValue

यदि कास्ट अनुमति है तो कास्ट परिणाम।

## Deprecated
बैकवर्ड संगतता के लिए छोड़ा गया है। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
