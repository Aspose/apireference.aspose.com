---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "Aspose.Page för C++"
description: "System::SafeInvoke method. Implementation av ''?.''-operatorns översättning i C++."
type: docs
weight: 36900
url: /sv/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Implementation av '?.'-operatorns översättning.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Parameter | Beskrivning |
| --- | --- |
| T0 | uttryckstyp. |
| T1 | Typ av lambda som kapslar in 'WhenTrue'-uttrycket. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| expr | T0 | uttrycksvärde. |
| func | T1 | 'WhenTrue'-uttrycket bundet till funktorn. |

### ReturnValue

Om expr-värdet inte är null, returneras func som anropas med dess värde som första argument, annars returneras null.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
