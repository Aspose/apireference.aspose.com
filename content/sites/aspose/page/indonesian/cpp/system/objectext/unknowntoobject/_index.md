---
title: "System::ObjectExt::UnknownToObject metode"
linktitle: "UnknownToObject"
second_title: "Aspose.Page untuk C++"
description: "System::ObjectExt::UnknownToObject metode. Mengonversi tipe tidak diketahui ke Object, menangani situasi tipe smart pointer dan tipe nilai dalam C++."
type: docs
weight: 1800
url: /id/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Mengonversi tipe tidak diketahui ke [Object](../../object/), menangani situasi tipe smart pointer dan tipe nilai.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe untuk dikonversi ke [Object](../../object/). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) untuk dikonversi. |

### ReturnValue

Smart pointer ke [Object](../../object/) yang berupa pointer yang dikonversi atau nilai yang dibungkus.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Mengonversi tipe tidak diketahui ke [Object](../../object/), menangani situasi tipe smart pointer dan tipe nilai.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe untuk dikonversi ke [Object](../../object/). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | T | [Object](../../object/) untuk dikonversi. |

### ReturnValue

Smart pointer ke [Object](../../object/) yang berupa pointer yang dikonversi atau nilai yang dibungkus.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
