---
title: "System::ObjectExt::CoalesceInternal yöntemi"
linktitle: "CoalesceInternal"
second_title: "Aspose.Page için C++"
description: "System::ObjectExt::CoalesceInternal yöntemi. Null olmayan tipler için ''??'' operatörünün çevirisinin uygulanması. RT2'nin C++'ta RT1'e dönüştürülebilir olduğu durum için aşırı yükleme."
type: docs
weight: 600
url: /tr/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


Null olmayan tipler için '??' operatörü çevirisinin uygulanması. RT2'nin RT1'e dönüştürülebilir olduğu durum için aşırı yükleme.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Parameter | Açıklama |
| --- | --- |
| T0 | LHS değer türü. |
| T1 | RHS ifadesini kapsülleyen lambda türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | RT1 | LHS değeri. |
| fonksiyon | F | RHS ifadesi. |

### ReturnValue

Eğer LHS değeri null değilse, LHS döndürülür, aksi takdirde RHS ifadesi hesaplanır ve sonuç döndürülür.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
