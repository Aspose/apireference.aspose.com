---
title: "metode System::StaticCastArray"
linktitle: "StaticCastArray"
second_title: "Aspose.Page untuk C++"
description: "metode System::StaticCastArray. Melakukan casting elemen-elemen array yang ditentukan ke tipe yang berbeda. Override untuk kasus di mana From adalah objek SmartPtr dalam C++."
type: docs
weight: 39800
url: /id/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Melakukan casting elemen-elemen array yang ditentukan ke tipe yang berbeda. Override untuk kasus di mana From adalah objek [SmartPtr](../smartptr/).

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parameter | Deskripsi |
| --- | --- |
| Ke | Tipe yang akan menjadi target casting elemen array yang ditentukan |
| From | Tipe elemen dari array yang elemennya akan di-cast |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dari | const System::SharedPtr\<System::Array\<From\>\>\& | Shared pointer ke array yang berisi elemen-elemen yang akan di-cast |

### ReturnValue

Pointer ke array baru yang berisi elemen dengan tipe **To** yang setara dengan elemen **from**

## Deprecated
Ditambahkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Melakukan casting elemen-elemen array yang ditentukan ke tipe yang berbeda. Override untuk kasus di mana From adalah Boxable dan To adalah [Object](../object/)[].

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parameter | Deskripsi |
| --- | --- |
| Ke | Tipe yang akan menjadi target casting elemen array yang ditentukan |
| From | Tipe elemen dari array yang elemennya akan di-cast |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dari | const System::SharedPtr\<System::Array\<From\>\>\& | Shared pointer ke array yang berisi elemen-elemen yang akan di-cast |

### ReturnValue

Pointer ke array baru yang berisi elemen dengan tipe **To** yang setara dengan elemen **from**

## Deprecated
Ditambahkan untuk kompatibilitas mundur. Gunakan ExplicitCast sebagai gantinya.

## Lihat Juga

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
