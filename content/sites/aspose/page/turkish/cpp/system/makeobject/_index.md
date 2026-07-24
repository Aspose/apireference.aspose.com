---
title: "System::MakeObject yöntemi"
linktitle: "MakeObject"
second_title: "Aspose.Page için C++"
description: "System::MakeObject yöntemi. C++'ta nesneyi yığıt üzerinde oluşturur ve ona bir shared pointer döndürür."
type: docs
weight: 24500
url: /tr/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


Nesneyi yığıt üzerinde oluşturur ve ona bir shared pointer döndürür.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Parameter | Açıklama |
| --- | --- |
| T | Örneklemek için sınıf. |
| Argümanlar | Yapıcı argümanlarının tipleri. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| args | Args\&&... | Yapıcı argümanları. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeObject(Args\&&...) method


Nesneyi yığıt üzerinde oluşturur ve ona bir shared pointer döndürür.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Parameter | Açıklama |
| --- | --- |
| T | [SmartPtr](../smartptr/) örneklemek için sınıfa. |
| Argümanlar | Yapıcı argümanlarının tipleri. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| args | Args\&&... | Yapıcı argümanları. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
