---
title: "System::ObjectExt::Coalesce yöntemi"
linktitle: "Coalesce"
second_title: "Aspose.Page için C++"
description: "System::ObjectExt::Coalesce yöntemi. C++'ta nullable türler için ''??'' operatörünün çevirisinin uygulanması."
type: docs
weight: 500
url: /tr/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


Null olabilir tipler için '??' operatörü çevirisinin uygulanması.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Parameter | Açıklama |
| --- | --- |
| T0 | LHS değer türü. |
| T1 | RHS ifadesini kapsülleyen lambda türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | System::Nullable\<T0\> | LHS değeri. |
| fonksiyon | T1 | RHS ifadesi. |

### ReturnValue

Eğer LHS değeri null değilse, LHS döndürülür, aksi takdirde RHS ifadesi hesaplanır ve sonuç döndürülür.

## Ayrıca Bakınız

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


Null olmayan tipler için '??' operatörü çevirisinin uygulanması.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Parameter | Açıklama |
| --- | --- |
| T0 | LHS değer türü. |
| T1 | RHS ifadesini kapsülleyen lambda türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | T0 | LHS değeri. |
| fonksiyon | T1 | RHS ifadesi. |

### ReturnValue

Eğer LHS değeri null değilse, LHS döndürülür, aksi takdirde RHS ifadesi hesaplanır ve sonuç döndürülür.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
