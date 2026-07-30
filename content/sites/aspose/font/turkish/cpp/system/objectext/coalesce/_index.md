---
title: "System::ObjectExt::Coalesce yöntemi"
linktitle: "Coalesce"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::Coalesce yöntemi. C++'da nullable tipleri için ''??'' operatörünün çevirisinin uygulanması."
type: docs
weight: 500
url: /tr/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


Null olabilir tipler için '??' operatörünün çevirisinin uygulanması.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Parametre | Açıklama |
| --- | --- |
| T0 | Sol taraf (LHS) değer tipi. |
| T1 | Sağ taraf (RHS) ifadesini kapsülleyen lambda tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | System::Nullable\<T0\> | LHS değeri. |
| func | T1 | RHS ifadesi. |

### ReturnValue

Eğer LHS değeri null değilse, LHS'yi döndürür, aksi takdirde RHS ifadesini hesaplar ve sonucu döndürür.

## Ayrıca Bakınız

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


Null olmayan tipler için '??' operatörünün çevirisinin uygulanması.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Parametre | Açıklama |
| --- | --- |
| T0 | Sol taraf (LHS) değer tipi. |
| T1 | Sağ taraf (RHS) ifadesini kapsülleyen lambda tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | T0 | LHS değeri. |
| func | T1 | RHS ifadesi. |

### ReturnValue

Eğer LHS değeri null değilse, LHS'yi döndürür, aksi takdirde RHS ifadesini hesaplar ve sonucu döndürür.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
