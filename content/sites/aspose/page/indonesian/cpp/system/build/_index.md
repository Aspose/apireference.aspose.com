---
title: "Metode System::Build"
linktitle: "Build"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Build. Membuat sebuah objek dengan kepemilikan langsung dalam C++."
type: docs
weight: 15000
url: /id/cpp/system/build/
---
## System::Build method


Membuat sebuah objek dengan kepemilikan langsung.

```cpp
template<typename T,typename...> Details::ObjectBuilder<T> System::Build(Args &&... args)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek yang akan dibangun |
| Argumen | Tipe argumen untuk konstruksi objek |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| args | Args\&&... | Argumen untuk diteruskan ke konstruktor objek |

### ReturnValue

ObjectBuilder dikonfigurasi untuk konstruksi objek langsung
## Catatan



[Object](../object/) construction must be finished with [Get()](../get/) call 

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
