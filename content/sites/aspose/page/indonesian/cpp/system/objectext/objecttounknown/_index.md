---
title: "System::ObjectExt::ObjectToUnknown metode"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Page untuk C++"
description: "System::ObjectExt::ObjectToUnknown metode. Mengonversi Object ke tipe yang tidak diketahui, menangani kedua situasi tipe smart pointer dan nilai boxed dalam C++."
type: docs
weight: 1200
url: /id/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Mengonversi [Object](../../object/) ke tipe yang tidak diketahui, menangani kedua situasi tipe smart pointer dan nilai boxed.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe untuk mengonversi [Object](../../object/) menjadi. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) untuk dikonversi. |

### ReturnValue

Baik nilai yang tidak dibungkus maupun pointer yang dikonversi.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Mengonversi [Object](../../object/) ke tipe yang tidak diketahui, menangani kedua situasi tipe smart pointer dan nilai boxed.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe untuk mengonversi [Object](../../object/) menjadi. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) untuk dikonversi. |

### ReturnValue

Baik nilai yang tidak dibungkus maupun pointer yang dikonversi.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
