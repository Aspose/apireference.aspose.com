---
title: "System::ObjectExt::CoalesceAssign metodu"
linktitle: "CoalesceAssign"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::CoalesceAssign metodu. C++'ta ''??='' operatörünün çevirisinin uygulanması."
type: docs
weight: 600
url: /tr/cpp/system/objectext/coalesceassign/
---
## ObjectExt::CoalesceAssign method


'??=' operatörünün çevirisinin uygulanması.

```cpp
template<typename T0,typename T1> static T0 & System::ObjectExt::CoalesceAssign(T0 &value, T1 func)
```


| Parametre | Açıklama |
| --- | --- |
| T0 | Sol taraf (LHS) değer tipi. |
| T1 | Sağ taraf (RHS) ifadesini kapsülleyen lambda tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | T0\& | LHS değeri. |
| func | T1 | RHS ifadesi. |

### ReturnValue

Eğer LHS değeri null değilse, LHS'yi döndürür, aksi takdirde RHS ifadesini hesaplar ve sonucu döndürür.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
