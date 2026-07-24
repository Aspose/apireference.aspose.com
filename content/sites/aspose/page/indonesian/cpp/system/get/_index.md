---
title: "System::Get metode"
linktitle: "Dapatkan"
second_title: "Aspose.Page untuk C++"
description: "System::Get metode. Fungsi untuk mendapatkan elemen ke-N dari tuple yang diberikan. Overload untuk objek dasar dalam C++."
type: docs
weight: 20700
url: /id/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


Fungsi untuk mendapatkan elemen ke-N dari tuple yang diberikan. Overload untuk objek dasar.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Parameter | Deskripsi |
| --- | --- |
| N | indeks elemen. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| objek | const SharedPtr\<Object\>\& | objek untuk diperiksa. |

### ReturnValue

nilai elemen ke-N dari tuple yang di-cast ke objek.

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


Fungsi untuk mendapatkan elemen ke-N dari tuple yang diberikan. Overload untuk shared pointer.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Parameter | Deskripsi |
| --- | --- |
| N | indeks elemen. |
| T | tipe objek yang diperiksa. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| objek | const SharedPtr\<T\>\& | objek untuk diperiksa. |

### ReturnValue

nilai elemen ke-N dari tuple.

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


Fungsi untuk mendapatkan elemen ke-N dari tuple yang diberikan. Overload untuk objek dengan metode Deconstruct.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Parameter | Deskripsi |
| --- | --- |
| N | indeks elemen. |
| T | tipe objek yang diperiksa. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| objek | const T\& | objek untuk diperiksa. |

### ReturnValue

nilai elemen ke-N dari tuple.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


Mendapatkan elemen ke-N dari tuple nilai.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Parameter | Deskripsi |
| --- | --- |
| N | indeks elemen. |
| Argumen | elemen tuple. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tuple | const ValueTuple\<Args...\>\& | tuple untuk mendapatkan elemen dari. |

### ReturnValue

nilai elemen ke-N dari tuple.

## Lihat Juga

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
