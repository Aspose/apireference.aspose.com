---
title: "System::ObjectExt::Box metodu"
linktitle: "Box"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::Box metodu. C++'ta string değerlerini kutular."
type: docs
weight: 200
url: /tr/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


Dize değerlerini kutular.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const String\& | Kutulamak için değer. |

### ReturnValue

Kaynak string null ise kutulanmış değer ya da null.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


Enum tipleri için [Object](../../object/) dönüşümünde değer tiplerini kutular. Enum tipleri için uygulama.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Enum](../../enum/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const T\& | [Enum](../../enum/) değerini kutulamak. |

### ReturnValue

Kutulanmış değeri tutan nesneye akıllı gösterici.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


Enum olmayan tipler için [Object](../../object/) dönüşümünde değer tiplerini kutular. Enum olmayan tipler için uygulama.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Değer türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const T\& | Kutulamak için değer. |

### ReturnValue

Kutulanmış değeri tutan nesneye akıllı gösterici.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Box(const T\&) method


[Nullable](../../nullable/) tiplerini [Object](../../object/) dönüşümünde kutular.

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Değer türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const T\& | Kutulamak için değer. |

### ReturnValue

Kutulanmış değeri tutan nesneye akıllı gösterici.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
