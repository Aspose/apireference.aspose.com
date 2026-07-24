---
title: "System::ObjectExt::CoalesceInternal मेथड"
linktitle: "CoalesceInternal"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::CoalesceInternal मेथड. ''??'' ऑपरेटर अनुवाद का कार्यान्वयन गैर-नल प्रकारों के लिए। C++ में यदि RT2 को RT1 में परिवर्तित किया जा सकता है तो उसके लिए ओवरलोड।"
type: docs
weight: 600
url: /hi/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


'??' ऑपरेटर अनुवाद का कार्यान्वयन गैर-नल योग्य प्रकारों के लिए। यदि RT2, RT1 में परिवर्तनीय है तो ओवरलोड।

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| पैरामीटर | विवरण |
| --- | --- |
| T0 | LHS मान प्रकार। |
| T1 | RHS अभिव्यक्ति को संलग्न करने वाले लैम्ब्डा का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | RT1 | LHS मान। |
| func | F | RHS अभिव्यक्ति। |

### ReturnValue

यदि LHS मान null नहीं है, तो LHS लौटाता है, अन्यथा RHS अभिव्यक्ति की गणना करता है और परिणाम लौटाता है।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
