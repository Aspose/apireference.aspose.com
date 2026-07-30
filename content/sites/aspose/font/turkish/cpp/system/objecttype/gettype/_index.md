---
title: "System::ObjectType::GetType yöntemi"
linktitle: "GetType"
second_title: "Aspose.Font için C++"
description: "System::ObjectType::GetType yöntemi. typeof() çevirisini uygular. C++'da ilkel tipler için aşırı yükleme."
type: docs
weight: 100
url: /tr/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


typeof() çevirisini uygular. İlkel tipler için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametre | Açıklama |
| --- | --- |
| T | İlkel tip. |

### ReturnValue

Belirtilen tipi tanımlayan [TypeInfo](../../typeinfo/) yapısına const referans.

## Ayrıca Bakınız

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


typeof() çevirisini uygular. Enum tipleri için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametre | Açıklama |
| --- | --- |
| T | İlkel tip. |

### ReturnValue

Belirtilen tipi tanımlayan [TypeInfo](../../typeinfo/) yapısına const referans.

## Ayrıca Bakınız

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


typeof() çevirisini uygular. Yapılar ve işaretçiler için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametre | Açıklama |
| --- | --- |
| T | İlkel tip. |

### ReturnValue

Belirtilen yapıyı tanımlayan [TypeInfo](../../typeinfo/) yapısına const referans.

## Ayrıca Bakınız

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


typeof() çevirisini uygular. [Nullable](../../nullable/) için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametre | Açıklama |
| --- | --- |
| T | [Nullable](../../nullable/) türü. |

### ReturnValue

Belirtilen yapıyı tanımlayan [TypeInfo](../../typeinfo/) yapısına const referans.

## Ayrıca Bakınız

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


typeof() çevirisini uygular. MutlicastDelegate için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametre | Açıklama |
| --- | --- |
| T | MutlicastDelegate tipi. |

### ReturnValue

Belirtilen yapıyı tanımlayan [TypeInfo](../../typeinfo/) yapısına const referans.

## Ayrıca Bakınız

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


typeof() çevirisini uygular. Yapılar ve işaretçiler için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| Parametre | Açıklama |
| --- | --- |
| T | İlkel tip. |

### ReturnValue

Belirtilen yapıyı tanımlayan [TypeInfo](../../typeinfo/) yapısına const referans veya [SmartPtr](../../smartptr/) için çağrıldığında işaret edilen tip.

## Ayrıca Bakınız

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


typeof() çevirisini uygular. uint8_t için aşırı yükleme.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Ayrıca Bakınız

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


typeof() çevirisini uygular. char16_t için aşırı yükleme.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Ayrıca Bakınız

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


typeof() çevirisini uygular. int32_t için aşırı yükleme.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Ayrıca Bakınız

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


typeof() çevirisini uygular. int64_t için aşırı yükleme.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Ayrıca Bakınız

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


typeof() çevirisini uygular. bool için aşırı yükleme.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Ayrıca Bakınız

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


typeof() çevirisini uygular. [Void](../../void/) için aşırı yükleme.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## Ayrıca Bakınız

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const String\&) method


typeof() çevirisini uygular. string tipi için aşırı yükleme.

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | İlkel tip. |

### ReturnValue

[String](../../string/) tipini tanımlayan [TypeInfo](../../typeinfo/) yapısına sabit referans.

## Ayrıca Bakınız

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() çevirisini uygular. Akıllı işaretçiler için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | İşaretçi nesne tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) için [TypeInfo](../../typeinfo/) al. |

### ReturnValue

Geçilen nesnenin son sınıfını tanımlayan [TypeInfo](../../typeinfo/) yapısına sabit referans.

## Ayrıca Bakınız

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() çevirisini uygular. Yapılar için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Yapı türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) için [TypeInfo](../../typeinfo/) al. |

### ReturnValue

Geçilen nesnenin son sınıfını tanımlayan [TypeInfo](../../typeinfo/) yapısına sabit referans.

## Ayrıca Bakınız

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


typeof() çevirisini uygular. İstisnalar için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Exception](../../exception/) tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) için [TypeInfo](../../typeinfo/) al. |

### ReturnValue

Geçilen nesnenin son sınıfını tanımlayan [TypeInfo](../../typeinfo/) yapısına sabit referans.

## Ayrıca Bakınız

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


typeof() çevirisini uygular. İlkel tipler için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | İlkel tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Geçilen nesnenin tipini tanımlayan [TypeInfo](../../typeinfo/) yapısına sabit referans.

## Ayrıca Bakınız

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


typeof() çevirisini uygular. [Nullable](../../nullable/) tipleri için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Nullable](../../nullable/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T | IGNORED |

### ReturnValue

Geçilen nesnenin tipini tanımlayan [TypeInfo](../../typeinfo/) yapısına sabit referans.

## Ayrıca Bakınız

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
