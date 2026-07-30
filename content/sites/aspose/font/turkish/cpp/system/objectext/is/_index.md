---
title: "System::ObjectExt::Is yöntemi"
linktitle: "Mi"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::Is yöntemi. ''is'' operatörünün çevirisini uygular. C++'da string literal için özelleştirme."
type: docs
weight: 1100
url: /tr/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


Dize sabiti için 'is' operatörü çevirisini uygular. Dize sabiti için özelleştirme.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) literalı. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


İstisna sarmalayıcı tipleri için 'is' operatörü çevirisini uygular. İstisna sarmalayıcı tipleri için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


'is' operatörünün çevirisini uygular. [Nullable](../../nullable/) tipi için özelleştirme.

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Nullable\<U\>\& | [Nullable](../../nullable/) türü. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


'is' operatörünün çevirisini uygular. Değer tipleri için özelleştirme.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


'is' operatörünün çevirisini uygular. Dönüştürülemez tipler için özelleştirme.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Tipler dönüştürülemez olduğu için her zaman false döndürür.

## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Nullable tipleri için 'is' operatörü çevirisini uygular. Nullable tipleri için özelleştirme.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


== operatörü tanımlı kutlanabilir tipler için 'is' operatörü çevirisini uygular. == operatörü tanımlı kutlanabilir tipler için özelleştirme.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


== operatörü tanımlanmamış kutlanabilir tipler için 'is' operatörü çevirisini uygular. == operatörü tanımlanmamış kutlanabilir tipler için özelleştirme.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


'is' operatörünün çevirisini uygular. İşaretçi tipleri için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Enum tipleri için 'is' operatörü çevirisini uygular. Enum tipleri için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |
| U | İşaret edilen nesnenin tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


Arayüzlere kutlanan değer tipleri için 'is' operatörü çevirisini uygular. Değer tiplerinin arayüzlere kutlanması için özelleştirme.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |
| V | İşaret edilen nesnenin tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const T\&) method


'is' operatörünün çevirisini uygular. Kutulanabilir (değer) tipler için özelleştirme; bu tiplerin tam olarak kutulanabilir olmasıdır.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) 'is' operatörünü test etmek için. Yok sayıldı. |

### ReturnValue

Her zaman doğru

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


'is' operatörünün çevirisini uygular. 'final' sınıflar için optimize edilmiş işaretçi tipleri için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |
| U | Test edilen tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


'is' operatörünün çevirisini uygular. İşaretçi tipleri için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |
| U | Test edilen tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


Enum tipleri ve zayıf işaretçiler için 'is' operatörü çevirisini uygular. Enum tipleri ve zayıf işaretçiler için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |
| U | İşaret edilen nesnenin tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(int32_t) method


Tamsayı sabiti için 'is' operatörü çevirisini uygular. Tamsayı sabiti için özelleştirme.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int32_t | tam sayı literalı. |

### ReturnValue

Eğer 'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
