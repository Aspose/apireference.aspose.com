---
title: "System::ObjectExt::Coalesce मेथड"
linktitle: "कोएलिसेस"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::Coalesce मेथड। C++ में nullable प्रकारों के लिए ''??'' ऑपरेटर अनुवाद का कार्यान्वयन।"
type: docs
weight: 500
url: /hi/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


'??' ऑपरेटर अनुवाद का कार्यान्वयन नल योग्य प्रकारों के लिए।

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| पैरामीटर | विवरण |
| --- | --- |
| T0 | LHS मान प्रकार। |
| T1 | RHS अभिव्यक्ति को संलग्न करने वाले लैम्ब्डा का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | System::Nullable\<T0\> | LHS मान। |
| func | T1 | RHS अभिव्यक्ति। |

### ReturnValue

यदि LHS मान null नहीं है, तो LHS लौटाता है, अन्यथा RHS अभिव्यक्ति की गणना करता है और परिणाम लौटाता है।

## संबंधित देखें

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


'??' ऑपरेटर अनुवाद का कार्यान्वयन गैर-नल योग्य प्रकारों के लिए।

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| पैरामीटर | विवरण |
| --- | --- |
| T0 | LHS मान प्रकार। |
| T1 | RHS अभिव्यक्ति को संलग्न करने वाले लैम्ब्डा का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | T0 | LHS मान। |
| func | T1 | RHS अभिव्यक्ति। |

### ReturnValue

यदि LHS मान null नहीं है, तो LHS लौटाता है, अन्यथा RHS अभिव्यक्ति की गणना करता है और परिणाम लौटाता है।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
