---
title: "System::Cast_noexcept मेथड"
linktitle: "Cast_noexcept"
second_title: "Aspose.Page C++ के लिए"
description: "System::Cast_noexcept मेथड। C++ में SmartPtr ऑब्जेक्ट्स पर कास्ट करता है।"
type: docs
weight: 15400
url: /hi/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


[SmartPtr](../smartptr/) ऑब्जेक्ट्स पर कास्ट करता है।

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
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

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
