---
title: "Konstruktor System::SmartPtr::SmartPtr"
linktitle: "SmartPtr"
second_title: "Aspose.Page untuk C++"
description: "Konstruktor System::SmartPtr::SmartPtr. Mengubah tipe array yang direferensikan dengan membuat array baru dengan tipe berbeda. Berguna jika di C# terdapat cast tipe array yang tidak didukung di C++."
type: docs
weight: 100
url: /id/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


Mengonversi tipe array yang dirujuk dengan membuat array baru dengan tipe berbeda. Berguna jika di C# terdapat cast tipe array yang tidak didukung di C++.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Deskripsi |
| --- | --- |
| Y | Tipe array sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | Penunjuk ke array untuk membuat salinan, tetapi dengan tipe elemen yang berbeda. |
| mode | SmartPtrMode | Mode penunjuk. |

## Lihat Juga

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


Membuat sebuah [SmartPtr](../) yang berbagi informasi kepemilikan dengan nilai awal ptr, tetapi memegang penunjuk p yang tidak terkait dan tidak dikelola.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | Penunjuk pintar lain untuk berbagi kepemilikan dari kepemilikan sebelumnya. |
| p | Pointee_ * | Penunjuk ke objek yang akan dikelola. |
| mode | SmartPtrMode | Mode penunjuk. |

## Lihat Juga

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


Membuat salinan objek [SmartPtr](../). Kedua penunjuk menunjuk ke objek yang sama setelahnya. Melakukan konversi tipe jika diizinkan.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Deskripsi |
| --- | --- |
| Q | Tipe objek yang ditunjuk oleh x. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | Penunjuk ke salinan. |
| mode | SmartPtrMode | Mode penunjuk. |

## Lihat Juga

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


Membuat salinan objek [SmartPtr](../). Kedua penunjuk menunjuk ke objek yang sama setelahnya.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ptr | const SmartPtr_\& | Penunjuk ke salinan. |
| mode | SmartPtrMode | Mode penunjuk. |

## Lihat Juga

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


Menginisialisasi array kosong. Digunakan untuk menerjemahkan beberapa konstruksi kode C#.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| Parameter | Deskripsi |
| --- | --- |
| Y | Tempat penampung tipe EmptyArrayInitializer. |

## Lihat Juga

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


Membuat [SmartPtr](../) yang menunjuk ke objek yang ditentukan, atau mengonversi penunjuk mentah menjadi [SmartPtr](../).

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| objek | Pointee_ * | Pointee. |
| mode | SmartPtrMode | Mode penunjuk. |

## Lihat Juga

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


Membuat objek [SmartPtr](../) dengan pemindahan. Secara efektif, menukar dua penunjuk, jika keduanya berada dalam mode yang sama. x mungkin tidak dapat digunakan setelah pemanggilan.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | SmartPtr_\&& | Penunjuk untuk dipindahkan. |
| mode | SmartPtrMode | Mode penunjuk. |

## Lihat Juga

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


Membuat objek [SmartPtr](../) dengan mode yang diperlukan.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| mode | SmartPtrMode | Mode penunjuk. |

## Lihat Juga

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


Membuat objek [SmartPtr](../) null-pointer dengan mode yang diperlukan.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| mode | std::nullptr_t | Mode penunjuk. |

## Lihat Juga

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
