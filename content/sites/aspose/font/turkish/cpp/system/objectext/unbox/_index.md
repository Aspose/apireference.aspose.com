---
title: "System::ObjectExt::Unbox yöntemi"
linktitle: "Unbox"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::Unbox yöntemi. Değer türlerini Object'e dönüştürdükten sonra kutusundan çıkarır. C++'de enum türleri için uygulanır."
type: docs
weight: 1500
url: /tr/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Değer türlerini [Object](../../object/)'e dönüştürdükten sonra kutusundan çıkarır. Enum türleri için uygulanır.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Enum](../../enum/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) kutusundan çıkarmak için. |

### ReturnValue

[Enum](../../enum/) value.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Değer türlerini [Object](../../object/)'e dönüştürdükten sonra kutusundan çıkarır. Enum olmayan ve nullable olmayan türler için uygulanır.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Değer türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) kutusundan çıkarmak için. |

### ReturnValue

Kutusundan çıkarılmış değer.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Değer türlerini [Object](../../object/)'e dönüştürdükten sonra kutusundan çıkarır. Enum olmayan ve nullable olmayan türler için uygulanır.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Değer türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) kutusundan çıkarmak için. |

### ReturnValue

Kutusundan çıkarılmış değer.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Dize değerlerinin kutlamasını kaldırır.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) kutusundan çıkarmak için |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


Enum tiplerinin kutlamasını kaldırarak tamsayıya dönüştürür.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tam sayı türü. |
| E | Kaynak enum türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| e | E | Kutusundan çıkarılacak değer. |

### ReturnValue

Enum'un tamsayı temsili.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


Enum tiplerini dönüştürür.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef enum türü. |
| E | Kaynak enum türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| e | E | Kutusundan çıkarılacak değer. |

### ReturnValue

Dönüştürülmüş enum değeri.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
