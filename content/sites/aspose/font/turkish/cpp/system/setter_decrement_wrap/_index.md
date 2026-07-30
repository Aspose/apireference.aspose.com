---
title: "System::setter_decrement_wrap metot"
linktitle: "setter_decrement_wrap"
second_title: "Aspose.Font için C++"
description: "System::setter_decrement_wrap metot. Çevirmen, C#'ın ayarlayıcı ve alıcı tanımlı örnek özelliğini hedefleyen ön-azaltma ifadelerini (const alıcı için aşırı yükleme) C++'ta bu işlevin çağrısına dönüştürür."
type: docs
weight: 37200
url: /tr/cpp/system/setter_decrement_wrap/
---
## System::setter_decrement_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


Çevirmen, ayarlayıcı ve alıcı tanımlı bir örnek özelliğini hedefleyen C#'ın ön-azaltma ifadelerini, bu işlevin (const alıcı için aşırı yükleme) çağrısına dönüştürür.

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| Parametre | Açıklama |
| --- | --- |
| T | Özelliğin tipi. |
| Host | - değiştirilecek örneğin sınıfı |
| HostConstGet | - Özelliğin getter'ının tanımlı olduğu Host kendisi veya onun temel tipi |
| HostSet | - Özelliğin setter'ının tanımlı olduğu Host kendisi veya onun temel tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| host | Host *const | Getter ve setter'ların çağrılacağı örnek. |
| pGetter | T(HostConstGet::*)() const | Özelliğin getter işlevine işaret eden fonksiyon işaretçisi |
| pSetter | void(HostSet::*)(T) | Özelliğin setter işlevine işaret eden fonksiyon işaretçisi |

### ReturnValue

Artırmadan önce özelliğin değeri

## Ayrıca Bakınız

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_decrement_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Çevirmen, ayarlayıcı ve alıcı tanımlı bir örnek özelliğini hedefleyen C#'ın ön-azaltma ifadelerini, bu işlevin (non-const alıcı için aşırı yükleme) çağrısına dönüştürür.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parametre | Açıklama |
| --- | --- |
| T | Özelliğin tipi. |
| Host | - değiştirilecek örneğin sınıfı |
| HostGet | - Özelliğin getter'ının tanımlı olduğu Host kendisi veya onun temel tipi |
| HostSet | - Özelliğin setter'ının tanımlı olduğu Host kendisi veya onun temel tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| host | Host *const | Getter ve setter'ların çağrılacağı örnek. |
| pGetter | T(HostGet::*)() | Özelliğin getter işlevine işaret eden fonksiyon işaretçisi |
| pSetter | void(HostSet::*)(T) | Özelliğin setter işlevine işaret eden fonksiyon işaretçisi |

### ReturnValue

Artırmadan önce özelliğin değeri

## Ayrıca Bakınız

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_decrement_wrap(T(*)(), void(*)(T)) method


Çevirmen, ayarlayıcı ve alıcı tanımlı bir sınıf özelliğini hedefleyen C#'ın ön-azaltma ifadelerini, bu işlevin çağrısına dönüştürür.

```cpp
template<typename T> T System::setter_decrement_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parametre | Açıklama |
| --- | --- |
| T | Özelliğin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| pGetter | T(*)() | Özelliğin getter serbest fonksiyonuna işaret eden fonksiyon işaretçisi |
| pSetter | void(*)(T) | Özelliğin setter serbest fonksiyonuna işaret eden fonksiyon işaretçisi |

### ReturnValue

Artırmadan önce özelliğin değeri

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
