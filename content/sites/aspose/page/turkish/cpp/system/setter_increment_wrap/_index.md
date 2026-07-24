---
title: "System::setter_increment_wrap yöntemi"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Page için C++"
description: "System::setter_increment_wrap yöntemi. Çevirmen, setter ve getter tanımlı sınıf özelliğini hedef alan C#'ın artırma ifadelerini C++'ta bu işlevin çağrısına dönüştürür."
type: docs
weight: 37400
url: /tr/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Çevirmen, setter ve getter tanımlı sınıf özelliğini hedef alan C#'ın artırma ifadelerini bu işlevin çağrısına dönüştürür.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | Açıklama |
| --- | --- |
| T | Özelliğin türü |
| Host | - değiştirilecek örneğin sınıfı |
| HostGet | - Host kendisi veya özelliğin getter'ının tanımlı olduğu temel tipi |
| HostSet | - Host kendisi veya özelliğin setter'ının tanımlı olduğu temel tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ana bilgisayar | Host *const | Artırılacak özelliği olan bir nesneye işaretçi |
| pGetter | T(HostGet::*)() | Özelliğin getter yöntemine işaret eden fonksiyon işaretçisi |
| pSetter | void(HostSet::*)(T) | Özelliğin setter yöntemine işaret eden fonksiyon işaretçisi |

### ReturnValue

Özelliğin artırılmış değeri

## Ayrıca Bakınız

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


Çevirmen, setter ve getter tanımlı sınıf özelliğini hedef alan C#'ın artırma ifadelerini bu işlevin çağrısına dönüştürür.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | Açıklama |
| --- | --- |
| T | Özelliğin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| pGetter | T(*)() | Özelliğin alıcı serbest işlevine işaret eden fonksiyon işaretçisi |
| pSetter | void(*)(T) | Özelliğin ayarlayıcı serbest işlevine işaret eden fonksiyon işaretçisi |

### ReturnValue

Özelliğin artırılmış değeri

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
