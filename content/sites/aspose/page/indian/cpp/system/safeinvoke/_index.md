---
title: "System::SafeInvoke मेथड"
linktitle: "SafeInvoke"
second_title: "Aspose.Page C++ के लिए"
description: "System::SafeInvoke मेथड। C++ में ''?.'' ऑपरेटर अनुवाद का कार्यान्वयन।"
type: docs
weight: 36900
url: /hi/cpp/system/safeinvoke/
---
## System::SafeInvoke method


'?.' ऑपरेटर अनुवाद का कार्यान्वयन।

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| पैरामीटर | विवरण |
| --- | --- |
| T0 | एक्सप्रेशन प्रकार। |
| T1 | ‘WhenTrue’ अभिव्यक्ति को संलग्न करने वाले लैम्ब्डा का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| expr | T0 | अभिव्यक्ति मान। |
| func | T1 | ‘WhenTrue’ अभिव्यक्ति को फ़ंक्टर से बंधा हुआ। |

### ReturnValue

यदि expr मान null नहीं है, तो func को उसके मान को पहला तर्क बनाकर कॉल किया जाता है और परिणाम लौटाता है, अन्यथा null लौटाता है।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
