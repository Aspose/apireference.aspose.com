---
title: "System::setter_increment_wrap metodu"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Font için C++"
description: "System::setter_increment_wrap metodu. Çevirmen, setter ve getter tanımlı sınıf özelliğine yönelik C#''nin artırma ifadelerini, C++'ta bu işlevin çağrısına dönüştürür."
type: docs
weight: 37500
url: /tr/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Çevirmen, setter ve getter tanımlı sınıf özelliğine yönelik C#'nin artırma ifadelerini, bu işlevin çağrısına dönüştürür.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parametre | Açıklama |
| --- | --- |
| T | Özelliğin türü |
| Host | - değiştirilecek örneğin sınıfı |
| HostGet | - Özelliğin getter'ının tanımlı olduğu Host kendisi veya onun temel tipi |
| HostSet | - Özelliğin setter'ının tanımlı olduğu Host kendisi veya onun temel tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| host | Host *const | Özelliği artırılacak bir nesneye işaretçi |
| pGetter | T(HostGet::*)() | Özelliğin getter metoduna işaret eden fonksiyon işaretçisi |
| pSetter | void(HostSet::*)(T) | Özelliğin setter metoduna işaret eden fonksiyon işaretçisi |

### ReturnValue

Özelliğin artırılmış değeri

## Ayrıca Bakınız

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


Çevirmen, setter ve getter tanımlı sınıf özelliğine yönelik C#'nin artırma ifadelerini, bu işlevin çağrısına dönüştürür.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parametre | Açıklama |
| --- | --- |
| T | Özelliğin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| pGetter | T(*)() | Özelliğin getter serbest fonksiyonuna işaret eden fonksiyon işaretçisi |
| pSetter | void(*)(T) | Özelliğin setter serbest fonksiyonuna işaret eden fonksiyon işaretçisi |

### ReturnValue

Özelliğin artırılmış değeri

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
