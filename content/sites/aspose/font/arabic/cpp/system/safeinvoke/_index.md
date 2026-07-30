---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "Aspose.Font لـ C++"
description: "System::SafeInvoke method. تنفيذ ترجمة عامل ''?.'' في C++."
type: docs
weight: 37000
url: /ar/cpp/system/safeinvoke/
---
## System::SafeInvoke method


تنفيذ ترجمة عامل '?.'.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 &&expr, T1 &&func)
```


| معامل | الوصف |
| --- | --- |
| T0 | نوع التعبير. |
| T1 | نوع الدالة اللامدا التي تغلف تعبير 'WhenTrue'. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| expr | T0\&& | قيمة التعبير. |
| دالة | T1\&& | 'WhenTrue' تعبير مرتبط بـ functor. |

### ReturnValue

إذا كانت قيمة expr ليست null، تُعيد func تُستدعى بقيمتها كأول وسيط، وإلا تُعيد null.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
