---
title: "System::ObjectExt::Box yöntemi"
linktitle: "Box"
second_title: "Aspose.Page için C++"
description: "System::ObjectExt::Box yöntemi. C++'ta string değerlerini kutular."
type: docs
weight: 200
url: /tr/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


Dize değerlerini kutular.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | const String\& | Kutulanacak değer. |

### ReturnValue

Kaynak string null ise kutulanmış değer veya null.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Değer türlerini [Object](../../object/) olarak dönüştürmek için kutular. Enum türleri için uygulama.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Açıklama |
| --- | --- |
| T | [Enum](../../enum/) türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const T\& | Kutulanacak [Enum](../../enum/) değeri. |

### ReturnValue

Kutulanmış değeri tutan nesneye akıllı işaretçi.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


Değer türlerini [Object](../../object/) olarak dönüştürmek için kutular. Enum olmayan türler için uygulama.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Açıklama |
| --- | --- |
| T | Değer türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | const T\& | Kutulanacak değer. |

### ReturnValue

Kutulanmış değeri tutan nesneye akıllı işaretçi.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


[Nullable](../../nullable/) türlerini [Object](../../object/) olarak dönüştürmek için kutular.

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| Parameter | Açıklama |
| --- | --- |
| T | Değer türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | const T\& | Kutulanacak değer. |

### ReturnValue

Kutulanmış değeri tutan nesneye akıllı işaretçi.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
