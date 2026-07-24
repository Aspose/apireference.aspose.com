---
title: "Metode System::SmartPtr::Cast"
linktitle: "Cast"
second_title: "Aspose.Page untuk C++"
description: "Metode System::SmartPtr::Cast. Mengubah tipe pointer ke tipe dirinya sendiri dalam C++."
type: docs
weight: 400
url: /id/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


Mengubah tipe pointer ke tipe aslinya.

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Deskripsi |
| --- | --- |
| Y | Tipe target dari objek yang ditunjuk. |
| Check | Bendera untuk melempar pengecualian jika tidak ada cast yang tersedia. |

### ReturnValue

Pointer dengan tipe yang diubah yang selalu berada dalam mode berbagi.

## Lihat Juga

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Mengubah tipe pointer ke tipe dasar menggunakan static_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Deskripsi |
| --- | --- |
| Y | Tipe target dari objek yang ditunjuk. |
| Check | Bendera untuk melempar pengecualian jika tidak ada cast yang tersedia. |

### ReturnValue

Pointer dengan tipe yang diubah yang selalu berada dalam mode berbagi.

## Lihat Juga

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Mengubah tipe pointer ke tipe turunan menggunakan dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Deskripsi |
| --- | --- |
| Y | Tipe target dari objek yang ditunjuk. |
| Check | Bendera untuk melempar pengecualian jika tidak ada cast yang tersedia. |

### ReturnValue

Pointer dengan tipe yang diubah yang selalu dalam mode berbagi. Melempar InvalidCastException jika tidak ada konversi yang tersedia.

## Lihat Juga

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


Mengubah tipe pointer ke tipe turunan menggunakan dynamic_cast.

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| Parameter | Deskripsi |
| --- | --- |
| Y | Tipe target dari objek yang ditunjuk. |
| Check | Bendera untuk melempar pengecualian jika tidak ada cast yang tersedia. |

### ReturnValue

Pointer dengan tipe yang diubah yang selalu dalam mode berbagi. Mengembalikan nullptr jika tidak ada konversi yang tersedia.

## Lihat Juga

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
