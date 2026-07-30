---
title: "System::MakeObject yöntemi"
linktitle: "MakeObject"
second_title: "Aspose.Font için C++"
description: "System::MakeObject yöntemi. Nesneyi yığıt (heap) üzerinde oluşturur ve C++'ta ona paylaşımlı bir gösterici döndürür."
type: docs
weight: 24600
url: /tr/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


Nesneyi yığıt üzerinde oluşturur ve ona paylaşımlı bir gösterici döndürür.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Parametre | Açıklama |
| --- | --- |
| T | Örneklenmesi gereken sınıf. |
| Args | Yapıcı argümanlarının tipleri. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| args | Args\&&... | Yapıcı argümanları. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeObject(Args\&&...) method


Nesneyi yığıt üzerinde oluşturur ve ona paylaşımlı bir gösterici döndürür.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Parametre | Açıklama |
| --- | --- |
| T | [SmartPtr](../smartptr/) örneklenmesi gereken sınıfa. |
| Args | Yapıcı argümanlarının tipleri. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| args | Args\&&... | Yapıcı argümanları. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
