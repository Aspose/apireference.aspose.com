---
title: "System::StaticCast_noexcept विधि"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Page C++ के लिए"
description: "System::StaticCast_noexcept विधि। C++ में Exception ऑब्जेक्ट्स पर स्थैतिक कास्ट करता है।"
type: docs
weight: 39400
url: /hi/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


[Exception](../exception/) ऑब्जेक्ट्स पर स्थैतिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित [Exception](../exception/) प्रकार। |
| TFrom | स्रोत [Exception](../exception/) प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const TFrom\& | स्रोत पॉइंटर। |

### ReturnValue

यदि कास्ट अनुमति है तो कास्ट परिणाम, अन्यथा nullptr।

## Deprecated
बैकवर्ड संगतता के लिए रखा गया है। इसके बजाय AsCast का उपयोग करें।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


[SmartPtr](../smartptr/) ऑब्जेक्ट्स पर स्थैतिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित पॉइनी प्रकार। |
| TFrom | स्रोत पॉइनी प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | स्रोत पॉइंटर। |

### ReturnValue

यदि कास्ट अनुमति है तो कास्ट परिणाम, अन्यथा nullptr।

## Deprecated
बैकवर्ड संगतता के लिए रखा गया है। इसके बजाय AsCast का उपयोग करें।

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Objects को [Exception](../exception/) ऑब्जेक्ट्स में स्थैतिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित [Exception](../exception/) प्रकार। |
| TFrom | [Object](../object/) प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | स्रोत पॉइंटर। |

### ReturnValue

यदि कास्ट अनुमति है तो कास्ट परिणाम, अन्यथा nullptr।

## Deprecated
बैकवर्ड संगतता के लिए रखा गया है। इसके बजाय AsCast का उपयोग करें।

## संबंधित देखें

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


[WeakPtr](../weakptr/) ऑब्जेक्ट्स पर स्थैतिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित पॉइनी प्रकार। |
| TFrom | स्रोत पॉइनी प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | स्रोत पॉइंटर। |

### ReturnValue

यदि कास्ट अनुमति है तो कास्ट परिणाम, अन्यथा nullptr।

## Deprecated
बैकवर्ड संगतता के लिए रखा गया है। इसके बजाय AsCast का उपयोग करें।

## संबंधित देखें

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
