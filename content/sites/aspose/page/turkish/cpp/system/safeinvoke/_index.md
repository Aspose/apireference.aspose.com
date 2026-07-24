---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "Aspose.Page için C++"
description: "System::SafeInvoke method. C++'ta ''?.'' operatörünün çevirisinin uygulanması."
type: docs
weight: 36900
url: /tr/cpp/system/safeinvoke/
---
## System::SafeInvoke method


'?.' operatörünün çevirisinin uygulanması.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Parameter | Açıklama |
| --- | --- |
| T0 | ifade türü. |
| T1 | 'WhenTrue' ifadesini kapsayan lambda türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ifade | T0 | ifade değeri. |
| fonksiyon | T1 | 'WhenTrue' ifadesi fonktöre bağlandı. |

### ReturnValue

expr değeri null değilse, değeri ilk argüman olarak çağrılan func'ı döndürür, aksi takdirde null döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
