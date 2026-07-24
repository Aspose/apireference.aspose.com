---
title: "Metode System::InitObject"
linktitle: "InisialisasiObjek"
second_title: "Aspose.Page untuk C++"
description: "Metode System::InitObject. Memulai inisialisasi sebuah objek dengan kepemilikan bersama dalam C++."
type: docs
weight: 21800
url: /id/cpp/system/initobject/
---
## System::InitObject method


Memulai inisialisasi sebuah objek dengan kepemilikan bersama.

```cpp
template<typename T> Details::ObjectBuilder<T, SharedPtr<T>> System::InitObject(const SharedPtr<T> &object)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek yang akan diinisialisasi |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../object/) untuk diinisialisasi |

### ReturnValue

ObjectBuilder yang dikonfigurasi untuk konstruksi shared pointer
## Catatan



[Object](../object/) initialization must be finished with [Get()](../get/) call 

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
