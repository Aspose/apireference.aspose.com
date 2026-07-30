---
title: "System::setter_post_increment_wrap yöntemi"
linktitle: "setter_post_increment_wrap"
second_title: "Aspose.Font için C++"
description: "System::setter_post_increment_wrap method. Çevirmen, C#''s sonrası artış ifadelerini, setter ve getter tanımlı örnek özelliğine yönelik olarak, C++'ta bu fonksiyonun (const getter için aşırı yükleme) çağrısına dönüştürür."
type: docs
weight: 38000
url: /tr/cpp/system/setter_post_increment_wrap/
---
## System::setter_post_increment_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


Çevirmen, C#'s sonrası artış ifadelerini, setter ve getter tanımlı örnek özelliğine yönelik olarak, bu fonksiyonun (const getter için aşırı yükleme) çağrısına dönüştürür.

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_increment_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
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
## System::setter_post_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Çevirmen, C#'ın setter ve getter tanımlı örnek özelliğini hedefleyen post-arttırma ifadelerini bu fonksiyonun (const olmayan getter için aşırı yükleme) çağrısına çevirir.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
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
## System::setter_post_increment_wrap(T(*)(), void(*)(T)) method


Çevirmen, C#'ın setter ve getter tanımlı sınıf özelliğini hedefleyen post-arttırma ifadelerini bu fonksiyonun çağrısına çevirir.

```cpp
template<typename T> T System::setter_post_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
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
