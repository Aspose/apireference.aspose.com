---
title: "System::ObjectExt::Unbox yöntemi"
linktitle: "Unbox"
second_title: "Aspose.Page için C++"
description: "System::ObjectExt::Unbox yöntemi. Değer tiplerini Object'e dönüştürdükten sonra kutudan çıkarır. C++'ta enum tipleri için uygulanır."
type: docs
weight: 1400
url: /tr/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Değer tiplerini [Object](../../object/) e dönüştürdükten sonra kutudan çıkarır. Enum tipleri için uygulanır.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | [Enum](../../enum/) türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) kutudan çıkarma için. |

### ReturnValue

[Enum](../../enum/) value.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Değer tiplerini [Object](../../object/) e dönüştürdükten sonra kutudan çıkarır. Enum olmayan ve nullable olmayan tipler için uygulanır.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Değer türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) kutudan çıkarma için. |

### ReturnValue

Kutudan çıkarılmış değer.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Değer tiplerini [Object](../../object/) e dönüştürdükten sonra kutudan çıkarır. Enum olmayan ve nullable olmayan tipler için uygulanır.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Değer türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) kutudan çıkarma için. |

### ReturnValue

Kutudan çıkarılmış değer.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Dize değerlerini kutudan çıkarır.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) kutudan çıkarma için |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Enum tiplerini tam sayıya kutudan çıkarır.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tam sayı türü. |
| E | Kaynak enum türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| e | E | Açılacak değer. |

### ReturnValue

Enum'un tam sayı temsili.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


Enum tiplerini dönüştürür.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef enum tipi. |
| E | Kaynak enum türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| e | E | Açılacak değer. |

### ReturnValue

Dönüştürülmüş enum değeri.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
