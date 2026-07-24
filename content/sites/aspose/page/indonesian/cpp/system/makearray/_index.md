---
title: "metode System::MakeArray"
linktitle: "BuatArray"
second_title: "Aspose.Page untuk C++"
description: "Metode System::MakeArray. Fungsi pabrik yang membuat objek Array baru dengan meneruskan argumen yang ditentukan ke konstruktornya dalam C++."
type: docs
weight: 24000
url: /id/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


Fungsi pabrik yang membuat objek [Array](../array/) baru dengan meneruskan argumen yang ditentukan ke konstruktornya.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen dari objek [Array](../array/) yang dibuat oleh fungsi ini |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| args | Args\&&... | Argumen yang diteruskan ke konstruktor objek [Array](../array/) yang sedang dibuat |

### ReturnValue

Pointer pintar yang menunjuk ke objek [Array](../array/) yang dibangun

## Lihat Juga

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


Fungsi pabrik yang membuat objek [Array](../array/) baru dengan meneruskan argumen yang ditentukan ke konstruktornya.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen dari objek [Array](../array/) yang dibuat oleh fungsi ini |
| Integral | Tipe ukuran array. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| size | Integral | Ukuran array yang sedang dibuat. |
| args | Args\&&... | Argumen yang diteruskan ke konstruktor objek [Array](../array/) yang sedang dibuat |

### ReturnValue

Pointer pintar yang menunjuk ke objek [Array](../array/) yang dibangun

## Lihat Juga

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


Fungsi pabrik yang membuat objek [Array](../array/) baru, mengisinya dengan elemen-elemen dari daftar inisialisasi yang ditentukan, dan mengembalikan pointer pintar yang menunjuk ke objek [Array](../array/).

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen dari objek [Array](../array/) yang dibuat oleh fungsi ini |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| init | std::initializer_list\<T\> | Daftar inisialisasi yang berisi elemen-elemen untuk mengisi array |

### ReturnValue

Pointer pintar yang menunjuk ke objek [Array](../array/) yang dibangun

## Lihat Juga

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
