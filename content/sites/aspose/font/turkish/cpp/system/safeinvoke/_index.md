---
title: "System::SafeInvoke yöntemi"
linktitle: "SafeInvoke"
second_title: "Aspose.Font için C++"
description: "System::SafeInvoke yöntemi. C++'da ''?.'' operatörünün çevirisinin uygulanması."
type: docs
weight: 37000
url: /tr/cpp/system/safeinvoke/
---
## System::SafeInvoke method


'?.' operatörünün çevirisinin uygulanması.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 &&expr, T1 &&func)
```


| Parametre | Açıklama |
| --- | --- |
| T0 | ifade türü. |
| T1 | 'WhenTrue' ifadesini kapsülleyen lambda türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| expr | T0\&& | ifade değeri. |
| func | T1\&& | 'WhenTrue' ifadesi fonktöre bağlanmıştır. |

### ReturnValue

Eğer expr değeri null değilse, değeri ilk argüman olarak çağrılan func'ı döndürür, aksi takdirde null döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
