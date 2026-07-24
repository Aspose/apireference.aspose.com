---
title: "System::Default yöntemi"
linktitle: "Default"
second_title: "Aspose.Page için C++"
description: "System::Default yöntemi. C++'da istisna türünün tek varsayılan-oluşturulmuş örneğine referansı döndürür."
type: docs
weight: 16200
url: /tr/cpp/system/default/
---
## System::Default() method


İstisna türünün tek varsayılan-oluşturulmuş örneğine referansı döndürür.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Açıklama |
| --- | --- |
| T | Örneği döndürülen tür |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


İstisna olmayan türün tek varsayılan-oluşturulmuş örneğine referansı döndürür.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Açıklama |
| --- | --- |
| T | Örneği döndürülen tür |

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
