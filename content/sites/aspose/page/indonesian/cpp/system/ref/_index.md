---
title: "Metode System::Ref"
linktitle: "Ref"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Ref. Pembungkus untuk memastikan Ref(std::ref(DynamicWeakPtr)) berfungsi di C++."
type: docs
weight: 36600
url: /id/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Pembungkus untuk memastikan Ref(std::ref(DynamicWeakPtr)) berfungsi.

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe yang direferensikan. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pembungkus | const std::reference_wrapper\<T\>\& | pembungkus std untuk membuka. |

### ReturnValue

Tipe referensi yang didefinisikan di [System](../):: bukan di std.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


Membuat referensi ke objek [DynamicWeakPtr](../dynamicweakptr/). Digunakan oleh penerjemah saat melewatkan argumen fungsi dengan referensi.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe yang ditunjuk. |
| trunkMode | Mode dari smart pointer itu sendiri. |
| weakLeafs | Indeks argumen templat yang memerlukan pemanggilan metode SetTemplateWeakPtr. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | Smart pointer untuk membuat referensi ke. |

### ReturnValue

Referensi smart pointer.

## Lihat Juga

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(T\&) method


Fungsi bantuan untuk memperoleh referensi ke objek. Digunakan untuk menjamin bahwa [System::DynamicWeakPtr](../dynamicweakptr/) memperbarui objek yang direferensikan setelah penugasan.

```cpp
template<typename T> T & System::Ref(T &value)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe untuk membuat referensi ke. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | T\\& | Nilai untuk membuat referensi ke. |

### ReturnValue

Referensi ke nilai yang diberikan ke fungsi ini.

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
