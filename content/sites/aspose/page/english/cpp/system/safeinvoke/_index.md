---
title: System::SafeInvoke method
linktitle: SafeInvoke
second_title: Aspose.Page for C++
description: 'System::SafeInvoke method. Implementation of ''?.'' operator translation in C++.'
type: docs
weight: 33700
url: /cpp/system/safeinvoke/
---
## System::SafeInvoke method


Implementation of '?.' operator translation.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Parameter | Description |
| --- | --- |
| T0 | expression type. |
| T1 | Type of lambda encapsulating 'WhenTrue' expression. |

| Parameter | Type | Description |
| --- | --- | --- |
| expr | T0 | expression value. |
| func | T1 | 'WhenTrue' expression bound to functor. |

### ReturnValue

If expr value is not null, returns func called with its value as first argument, otherwise returns null.

## See Also

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
