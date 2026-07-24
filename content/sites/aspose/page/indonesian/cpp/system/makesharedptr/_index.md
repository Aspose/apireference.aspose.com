---
title: "Metode System::MakeSharedPtr"
linktitle: "MakeSharedPtr"
second_title: "Aspose.Page untuk C++"
description: "Metode System::MakeSharedPtr. Mengonversi pointer mentah menjadi smart pointer. Overload untuk pointer const. Berguna, misalnya, ketika menggunakan variabel ''this'' dalam metode C# yang diterjemahkan menjadi const dalam C++."
type: docs
weight: 24800
url: /id/cpp/system/makesharedptr/
---
## System::MakeSharedPtr(const X *) method


Mengonversi pointer mentah menjadi smart pointer. Overload untuk pointer const. Berguna, misalnya, ketika menggunakan variabel 'this' dalam metode C# yang diterjemahkan menjadi const.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(const X *p)
```


| Parameter | Deskripsi |
| --- | --- |
| X | Tipe yang ditunjuk. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| p | const X * | Pointer mentah ke objek. |

### ReturnValue

Smart pointer bersama ke objek.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeSharedPtr(X *) method


Mengonversi pointer mentah menjadi smart pointer.

```cpp
template<class X> SmartPtr<X> System::MakeSharedPtr(X *p)
```


| Parameter | Deskripsi |
| --- | --- |
| X | Tipe yang ditunjuk. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| p | X * | Pointer mentah ke objek. |

### ReturnValue

Smart pointer bersama ke objek.

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
