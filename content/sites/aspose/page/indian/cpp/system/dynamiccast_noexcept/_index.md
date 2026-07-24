---
title: "System::DynamicCast_noexcept मेथड"
linktitle: "DynamicCast_noexcept"
second_title: "Aspose.Page C++ के लिए"
description: "System::DynamicCast_noexcept मेथड। पुराने अप्रचलित कास्ट। भविष्य के C++ संस्करणों में हटाए जाएंगे।"
type: docs
weight: 17600
url: /hi/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


पुराने अप्रचलित कास्ट। भविष्य के संस्करणों में हटा दिए जाएंगे।

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
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
## टिप्पणियाँ


डायनामिक कास्ट को [Exception](../exception/) ऑब्जेक्ट्स पर लागू करता है। ## Deprecated
बैकवर्ड संगतता के लिए रखा गया है। इसके बजाय AsCast का उपयोग करें।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


डायनामिक कास्ट को [SmartPtr](../smartptr/) ऑब्जेक्ट्स पर लागू करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
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
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


ऑब्जेक्ट्स को [Exception](../exception/) ऑब्जेक्ट्स में डायनामिक कास्ट लागू करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
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
