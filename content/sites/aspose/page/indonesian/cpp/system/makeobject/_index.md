---
title: "System::MakeObject method"
linktitle: "MakeObject"
second_title: "Aspose.Page untuk C++"
description: "System::MakeObject method. Membuat objek di heap dan mengembalikan shared pointer ke objek tersebut dalam C++."
type: docs
weight: 24500
url: /id/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


Membuat objek di heap dan mengembalikan shared pointer ke objek tersebut.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Kelas untuk diinstansiasi. |
| Argumen | Tipe argumen konstruktor. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| args | Args\&&... | Argumen konstruktor. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeObject(Args\&&...) method


Membuat objek di heap dan mengembalikan shared pointer ke objek tersebut.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Parameter | Deskripsi |
| --- | --- |
| T | [SmartPtr](../smartptr/) ke kelas untuk diinstansiasi. |
| Argumen | Tipe argumen konstruktor. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| args | Args\&&... | Argumen konstruktor. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
