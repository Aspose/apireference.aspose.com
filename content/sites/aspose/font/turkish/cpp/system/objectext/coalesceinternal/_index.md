---
title: "System::ObjectExt::CoalesceInternal yöntemi"
linktitle: "CoalesceInternal"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::CoalesceInternal yöntemi. C++'da non-nullable tipleri için ''??'' operatörünün çevirisinin uygulanması. RT2'nin RT1'e dönüştürülebilir olduğu durum için aşırı yükleme."
type: docs
weight: 700
url: /tr/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


Null olmayan tipler için '??' operatörünün çevirisinin uygulanması. RT2'nin RT1'e dönüştürülebilir olduğu durum için aşırı yükleme.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Parametre | Açıklama |
| --- | --- |
| T0 | Sol taraf (LHS) değer tipi. |
| T1 | Sağ taraf (RHS) ifadesini kapsülleyen lambda tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | RT1 | LHS değeri. |
| func | F | RHS ifadesi. |

### ReturnValue

Eğer LHS değeri null değilse, LHS'yi döndürür, aksi takdirde RHS ifadesini hesaplar ve sonucu döndürür.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
