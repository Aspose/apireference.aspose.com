---
title: "System::setter_wrap metodu"
linktitle: "setter_wrap"
second_title: "Aspose.Font için C++"
description: "System::setter_wrap metodu. C++'ta tip dönüşümüyle örnek setter işlevleri için aşırı yükleme."
type: docs
weight: 38300
url: /tr/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


Tip dönüşümüyle örnek setter işlevleri için aşırı yükleme.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Değer türü. |
| T2 | Setter işlevi tarafından beklenen tip. |
| Host | Örnek tip. |
| HostSet | - Host'un kendisi veya özelliğin ayarlayıcısının tanımlı olduğu temel tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| host | Host *const | [Object](../object/) için ayarlayıcı fonksiyonu çağırmak. |
| pSetter | void(HostSet::*)(T2) | Ayarlayıcı fonksiyon referansı. |
| değer | T | Ayarlanacak değer. |

### ReturnValue

değeri ayarla.

## Ayrıca Bakınız

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


Tip dönüşümüyle statik ayarlayıcı fonksiyonlar için aşırı yükleme.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Değer türü. |
| T2 | Setter işlevi tarafından beklenen tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| pSetter | void(*)(T2) | Statik ayarlayıcı fonksiyon referansı. |
| değer | T | Ayarlanacak değer. |

### ReturnValue

değeri ayarla.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
