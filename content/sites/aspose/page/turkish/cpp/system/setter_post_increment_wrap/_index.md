---
title: "System::setter_post_increment_wrap method"
linktitle: "setter_post_increment_wrap"
second_title: "Aspose.Page için C++"
description: "System::setter_post_increment_wrap method. Translator, setter ve getter tanımlı instance''s özelliğine yönelik C#''s post-increment ifadelerini, C++'ta bu fonksiyonun (const getter için overload) çağrısına dönüştürür."
type: docs
weight: 37900
url: /tr/cpp/system/setter_post_increment_wrap/
---
## System::setter_post_increment_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


Translator, setter ve getter tanımlı instance's özelliğine yönelik C#'s post-increment ifadelerini, bu fonksiyonun (const getter için overload) çağrısına dönüştürür.

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_increment_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| Parameter | Açıklama |
| --- | --- |
| T | Özelliğin tipi. |
| Host | - değiştirilecek örneğin sınıfı |
| HostConstGet | - Host kendisi veya özelliğin getter'ının tanımlı olduğu temel tipi |
| HostSet | - Host kendisi veya özelliğin setter'ının tanımlı olduğu temel tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ana bilgisayar | Host *const | Getter ve setter'ları çağırmak için örnek. |
| pGetter | T(HostConstGet::*)() const | Özelliğin getter işlevine işaret eden fonksiyon işaretçisi |
| pSetter | void(HostSet::*)(T) | Özelliğin ayarlayıcı işlevine işaret eden fonksiyon işaretçisi |

### ReturnValue

Artırmadan önce özelliğin değeri

## Ayrıca Bakınız

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_post_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Çevirmen, ayarlayıcı ve alıcı tanımlı örnek özelliğini hedefleyen C#'ın artı‑artı ifadelerini bu işlevin çağrısına (değişmez alıcı için aşırı yükleme) dönüştürür.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_post_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | Açıklama |
| --- | --- |
| T | Özelliğin tipi. |
| Host | - değiştirilecek örneğin sınıfı |
| HostGet | - Host kendisi veya özelliğin getter'ının tanımlı olduğu temel tipi |
| HostSet | - Host kendisi veya özelliğin setter'ının tanımlı olduğu temel tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ana bilgisayar | Host *const | Getter ve setter'ları çağırmak için örnek. |
| pGetter | T(HostGet::*)() | Özelliğin getter işlevine işaret eden fonksiyon işaretçisi |
| pSetter | void(HostSet::*)(T) | Özelliğin ayarlayıcı işlevine işaret eden fonksiyon işaretçisi |

### ReturnValue

Artırmadan önce özelliğin değeri

## Ayrıca Bakınız

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_post_increment_wrap(T(*)(), void(*)(T)) method


Çevirmen, ayarlayıcı ve alıcı tanımlı sınıf özelliğini hedefleyen C#'ın artı‑artı ifadelerini bu işlevin çağrısına dönüştürür.

```cpp
template<typename T> T System::setter_post_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | Açıklama |
| --- | --- |
| T | Özelliğin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| pGetter | T(*)() | Özelliğin alıcı serbest işlevine işaret eden fonksiyon işaretçisi |
| pSetter | void(*)(T) | Özelliğin ayarlayıcı serbest işlevine işaret eden fonksiyon işaretçisi |

### ReturnValue

Artırmadan önce özelliğin değeri

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
