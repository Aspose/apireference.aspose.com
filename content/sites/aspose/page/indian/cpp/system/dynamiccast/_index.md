---
title: "System::DynamicCast मेथड"
linktitle: "DynamicCast"
second_title: "Aspose.Page C++ के लिए"
description: "System::DynamicCast मेथड। C++ में Exception ऑब्जेक्ट्स पर डायनेमिक कास्ट करता है।"
type: docs
weight: 16900
url: /hi/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


[Exception](../exception/) ऑब्जेक्ट्स पर डायनेमिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


डायनामिक कास्ट को [SmartPtr](../smartptr/) ऑब्जेक्ट्स पर लागू करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\>) method


कास्ट के माध्यम से बॉक्स्ड enum को अनबॉक्स करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित enum प्रकार। |
| TFrom | स्रोत पॉइनी प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | डेटा अनबॉक्स करने के लिए ऑब्जेक्ट का पॉइंटर। |

### ReturnValue

अनबॉक्स किया गया enum मान।

## Deprecated
बैकवर्ड संगतता के लिए छोड़ा गया है। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


ऑब्जेक्ट्स को [Exception](../exception/) ऑब्जेक्ट्स में डायनामिक कास्ट लागू करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
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
## System::DynamicCast(std::nullptr_t) method


नल ऑब्जेक्ट्स का डायनेमिक कास्ट करता है।

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
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
## System::DynamicCast(TFrom\&) method


नॉन-पॉइंटर ऑब्जेक्ट्स पर डायनेमिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्ष्य प्रकार। |
| TFrom | स्रोत प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | TFrom\& | स्रोत ऑब्जेक्ट। |

### ReturnValue

कास्ट परिणाम।

## Deprecated
बैकवर्ड संगतता के लिए छोड़ा गया है। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom) method


IntPtr से पॉइंटर में डायनेमिक कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्ष्य प्रकार। |
| TFrom | स्रोत प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | TFrom | स्रोत IntPtr मान। |

### ReturnValue

कास्ट परिणाम।

## Deprecated
बैकवर्ड संगतता के लिए छोड़ा गया है। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
