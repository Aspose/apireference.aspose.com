---
title: "System::ObjectExt::Is yöntemi"
linktitle: "Mi"
second_title: "Aspose.Page için C++"
description: "System::ObjectExt::Is yöntemi. ''is'' operatörünün çevirisini uygular. C++'ta string sabiti için özelleştirme."
type: docs
weight: 1000
url: /tr/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


'is' operatörünün çevirisini uygular. Dize sabiti için özelleştirme.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) sabiti. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


'is' operatörünün çevirisini uygular. İstisna sarmalayıcı tipleri için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


'is' operatörünün çevirisini uygular. [Nullable](../../nullable/) tipi için özelleştirme.

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Nullable\<U\>\& | [Nullable](../../nullable/) türü. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


'is' operatörü çevirisini uygular. Değer tipleri için özelleştirme.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


'is' operatörünün çevirisini uygular. Dönüştürülemez tipler için özelleştirme.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

Tipler dönüştürülemez olduğu için her zaman false döndürür.

## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


'is' operatörünün çevirisini uygular. Nullable tipler için özelleştirme.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


'is' operatörünün çevirisini uygular. == operatörü tanımlı kutulanabilir tipler için özelleştirme.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


'is' operatörünün çevirisini uygular. == operatörü tanımlanmamış kutulanabilir tipler için özelleştirme.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


'is' operatörü çevirisini uygular. İşaretçi tipleri için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


'is' operatörünün çevirisini uygular. Enum tipleri için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |
| U | İşaret edilen nesnenin tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


'is' operatörünün çevirisini uygular. Arabirimlere kutulanmış değer tipleri için özelleştirme.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |
| V | İşaret edilen nesnenin tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const T\&) method


'is' operatörü çevirisini uygular. Kutulanabilir (değer) tipler için özelleştirme; bu tiplerin tam olarak bu olduğu anlamına gelir.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) 'is' operatörünü test etmek için. Yoksayıldı. |

### ReturnValue

Her zaman doğru

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


'is' operatörü çevirisini uygular. 'final' sınıflar için optimize edilmiş işaretçi tipleri için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |
| U | Test edilen tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


'is' operatörü çevirisini uygular. İşaretçi tipleri için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |
| U | Test edilen tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


'is' operatörünün çevirisini uygular. Enum tipleri ve zayıf işaretçiler için özelleştirme.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |
| U | İşaret edilen nesnenin tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) 'is' operatörünü test etmek için. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(int32_t) method


'is' operatörünün çevirisini uygular. Tam sayı sabiti için özelleştirme.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| Parameter | Açıklama |
| --- | --- |
| T | Hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | int32_t | tam sayı sabiti. |

### ReturnValue

'is' true döndürürse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
