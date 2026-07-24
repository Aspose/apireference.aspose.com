---
title: "System::ForceStaticCast method"
linktitle: "बलस्थैतिककास्ट"
second_title: "Aspose.Page C++ के लिए"
description: "System::ForceStaticCast method. C++ में SmartPtr ऑब्जेक्ट्स पर वास्तविक static cast करता है।"
type: docs
weight: 20400
url: /hi/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


[SmartPtr](../smartptr/) ऑब्जेक्ट्स पर वास्तविक static cast करता है।

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित पॉइनी प्रकार। |
| TFrom | स्रोत पॉइनी प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | स्रोत पॉइंटर। |

### ReturnValue

यदि cast की अनुमति है तो cast परिणाम लौटाता है, अन्यथा व्यवहार अपरिभाषित रहता है।

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
