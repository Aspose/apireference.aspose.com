---
title: "Metode System::Default"
linktitle: "Default"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Default. Mengembalikan referensi ke satu-satunya instance yang dibangun secara default dari tipe pengecualian dalam C++."
type: docs
weight: 16200
url: /id/cpp/system/default/
---
## System::Default() method


Mengembalikan referensi ke satu-satunya instance yang dibangun secara default dari tipe pengecualian.

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe yang instance-nya dikembalikan |

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


Mengembalikan referensi ke satu-satunya instance yang dibangun secara default dari tipe non-pengecualian.

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe yang instance-nya dikembalikan |

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
