---
title: "Metode System::ObjectExt::Box"
linktitle: "Box"
second_title: "Aspose.Page untuk C++"
description: "System::ObjectExt::Box method. Membungkus nilai string di C++."
type: docs
weight: 200
url: /id/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


Membungkus nilai string.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const String\& | Nilai untuk dibungkus. |

### ReturnValue

Nilai yang dibungkus atau null, jika string sumber null.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Membungkus tipe nilai untuk dikonversi menjadi [Object](../../object/). Implementasi untuk tipe enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Deskripsi |
| --- | --- |
| T | [Enum](../../enum/) tipe. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const T\& | Nilai [Enum](../../enum/) untuk dibungkus. |

### ReturnValue

Smart pointer ke objek yang menyimpan nilai yang dibungkus.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Membungkus tipe nilai untuk dikonversi menjadi [Object](../../object/). Implementasi untuk tipe non-enum.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const T\& | Nilai untuk dibungkus. |

### ReturnValue

Smart pointer ke objek yang menyimpan nilai yang dibungkus.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Membungkus tipe [Nullable](../../nullable/) untuk dikonversi menjadi [Object](../../object/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const T\& | Nilai untuk dibungkus. |

### ReturnValue

Smart pointer ke objek yang menyimpan nilai yang dibungkus.

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
