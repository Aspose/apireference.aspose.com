---
title: "System::ObjectExt::ArrayInitializerCast मेथड"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::ArrayInitializerCast मेथड। एरे के मूल मानों को (जो C# में स्वचालित रूप से होते हैं लेकिन C++ में नहीं होते) C++ में परिवर्तित करता है।"
type: docs
weight: 100
url: /hi/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


ऐरे के मूलभूत मानों को परिवर्तित करता है (जो C# स्वचालित रूप से करता है लेकिन C++ स्पष्ट रूप से नहीं करता)।

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| पैरामीटर | विवरण |
| --- | --- |
| को | लक्ष्य प्रकार। |
| From | स्रोत प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| args | से ... | लक्ष्य एरे में परिवर्तित करने और पुश करने के लिए मान। |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
