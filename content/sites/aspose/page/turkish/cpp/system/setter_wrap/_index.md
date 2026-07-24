---
title: "System::setter_wrap yöntemi"
linktitle: "setter_wrap"
second_title: "Aspose.Page için C++"
description: "System::setter_wrap yöntemi. C++'ta tip dönüşümüyle örnek setter fonksiyonları için aşırı yükleme."
type: docs
weight: 38200
url: /tr/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


Tip dönüşümüyle örnek setter fonksiyonları için aşırı yükleme.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Parameter | Açıklama |
| --- | --- |
| T | Değer türü. |
| T2 | Setter fonksiyonu tarafından beklenen tip. |
| Host | Örnek türü. |
| HostSet | - Ana bilgisayarın kendisi veya onun temel türü, özelliğin ayarlayıcısının tanımlandığı yerde. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| host | Host *const | [Object](../object/) için ayarlayıcı işlevi çağırmak. |
| pSetter | void(HostSet::*)(T2) | Ayarlayıcı işlev referansı. |
| değer | T | Ayarlanacak değer. |

### ReturnValue

değeri ayarla.

## Ayrıca Bakınız

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


Tip dönüşümüyle statik ayarlayıcı işlevler için aşırı yükleme.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Parameter | Açıklama |
| --- | --- |
| T | Değer türü. |
| T2 | Setter fonksiyonu tarafından beklenen tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| pSetter | void(*)(T2) | Statik ayarlayıcı işlev referansı. |
| değer | T | Ayarlanacak değer. |

### ReturnValue

değeri ayarla.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
