---
title: "System::ConstCast मेथड"
linktitle: "ConstCast"
second_title: "Aspose.Page C++ के लिए"
description: "System::ConstCast मेथड। C++ में अप्रचलित कास्ट का अंत।"
type: docs
weight: 16100
url: /hi/cpp/system/constcast/
---
## System::ConstCast method


अप्रचलित कास्ट का अंत।

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| TTo | लक्षित पॉइनी प्रकार। |
| TFrom | स्रोत पॉइनी प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | स्रोत पॉइंटर। |

### ReturnValue

यदि कास्ट अनुमति है तो कास्ट परिणाम, अन्यथा nullptr।
## टिप्पणियाँ


[SmartPtr](../smartptr/) ऑब्जेक्ट्स पर const कास्ट करता है।
## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
