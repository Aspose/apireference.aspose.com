---
title: "System::SafeInvoke طريقة"
linktitle: "SafeInvoke"
second_title: "Aspose.Page لـ C++"
description: "System::SafeInvoke طريقة. تنفيذ ترجمة عامل ''?.'' في C++."
type: docs
weight: 36900
url: /ar/cpp/system/safeinvoke/
---
## System::SafeInvoke method


تنفيذ ترجمة عامل '?.'.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Parameter | الوصف |
| --- | --- |
| T0 | نوع التعبير. |
| T1 | نوع الدالة اللامبادا التي تغلف تعبير 'WhenTrue'. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| expr | T0 | قيمة التعبير. |
| func | T1 | تعبير 'WhenTrue' المرتبط بـ functor. |

### ReturnValue

إذا كانت قيمة expr ليست null، تُعيد func التي تُستدعى بقيمتها كوسيط أول، وإلا تُعيد null.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
