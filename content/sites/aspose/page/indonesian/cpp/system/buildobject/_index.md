---
title: "System::BuildObject metode"
linktitle: "BuildObject"
second_title: "Aspose.Page untuk C++"
description: "System::BuildObject metode. Bangun sebuah objek dengan kepemilikan bersama dalam C++."
type: docs
weight: 15200
url: /id/cpp/system/buildobject/
---
## System::BuildObject method


Bangun sebuah objek dengan kepemilikan bersama.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T, SharedPtr<T>> System::BuildObject(Args &&... args)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek yang akan dibangun |
| Argumen | Tipe argumen untuk konstruksi objek |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| args | Args\&&... | Argumen untuk diteruskan ke konstruktor objek |

### ReturnValue

ObjectBuilder yang dikonfigurasi untuk konstruksi shared pointer
## Catatan



Membuat sebuah [SharedPtr<T>](../sharedptr/) dan mengembalikan builder untuknya
[Object](../object/) construction must be finished with [Get()](../get/) call 

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
