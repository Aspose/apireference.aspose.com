---
title: "System::Default yöntemi"
linktitle: "Varsayılan"
second_title: "Aspose.Font için C++"
description: "System::Default yöntemi. C++'ta istisna türünün tek varsayılan oluşturulmuş örneğine referansı döndürür."
type: docs
weight: 16300
url: /tr/cpp/system/default/
---
## System::Default() method


İstisna türünün tek varsayılan oluşturulmuş örneğine referansı döndürür.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parametre | Açıklama |
| --- | --- |
| T | Örneği döndürülen tür |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Default() method


İstisna olmayan türün tek varsayılan oluşturulmuş örneğine referansı döndürür.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parametre | Açıklama |
| --- | --- |
| T | Örneği döndürülen tür |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
