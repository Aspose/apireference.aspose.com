---
title: "Metode System::ObjectType::GetType"
linktitle: "GetType"
second_title: "Aspose.Page untuk C++"
description: "Metode System::ObjectType::GetType. Mengimplementasikan terjemahan typeof(). Overload untuk tipe primitif dalam C++."
type: docs
weight: 100
url: /id/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


Implementasi terjemahan typeof(). Overload untuk tipe primitif.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe primitif. |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan tipe yang ditentukan.

## Lihat Juga

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementasi terjemahan typeof(). Overload untuk tipe enum.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe primitif. |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan tipe yang ditentukan.

## Lihat Juga

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementasi terjemahan typeof(). Overload untuk struktur dan pointer.

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe primitif. |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan struktur yang ditentukan.

## Lihat Juga

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Mengimplementasikan terjemahan typeof(). Overload untuk [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Deskripsi |
| --- | --- |
| T | [Nullable](../../nullable/) tipe. |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan struktur yang ditentukan.

## Lihat Juga

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementasi terjemahan typeof(). Overload untuk MutlicastDelegate.

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe MutlicastDelegate. |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan struktur yang ditentukan.

## Lihat Juga

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementasi terjemahan typeof(). Overload untuk struktur dan pointer.

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe primitif. |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan struktur yang ditentukan atau tipe yang ditunjuk jika dipanggil untuk [SmartPtr](../../smartptr/).

## Lihat Juga

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Implementasi terjemahan typeof(). Overload untuk uint8_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Lihat Juga

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Mengimplementasikan terjemahan typeof(). Overload untuk char16_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Lihat Juga

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Mengimplementasikan terjemahan typeof(). Overload untuk int32_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Lihat Juga

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Mengimplementasikan terjemahan typeof(). Overload untuk int64_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Lihat Juga

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Mengimplementasikan terjemahan typeof(). Overload untuk bool.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Lihat Juga

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType() method


Mengimplementasikan terjemahan typeof(). Overload untuk [Void](../../void/).

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Lihat Juga

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const String\&) method


Implementasi terjemahan typeof(). Overload untuk tipe string.

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe primitif. |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan tipe [String](../../string/).

## Lihat Juga

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementasi terjemahan typeof(). Overload untuk smart pointer.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek pointer. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) untuk mendapatkan [TypeInfo](../../typeinfo/). |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan kelas akhir dari objek yang diberikan.

## Lihat Juga

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementasi terjemahan typeof(). Overload untuk struktur.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | tipe struktur. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) untuk mendapatkan [TypeInfo](../../typeinfo/). |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan kelas akhir dari objek yang diberikan.

## Lihat Juga

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T\&) method


Implementasi terjemahan typeof(). Overload untuk pengecualian.

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe [Exception](../../exception/). |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) untuk mendapatkan [TypeInfo](../../typeinfo/). |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan kelas akhir dari objek yang diberikan.

## Lihat Juga

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


Implementasi terjemahan typeof(). Overload untuk tipe primitif.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe primitif. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan tipe objek yang diberikan.

## Lihat Juga

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectType::GetType(const T) method


Menerapkan terjemahan typeof(). Overload untuk tipe [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parameter | Deskripsi |
| --- | --- |
| T | [Nullable](../../nullable/) tipe. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Referensi konstan ke struktur [TypeInfo](../../typeinfo/) yang menggambarkan tipe objek yang diberikan.

## Lihat Juga

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
