---
title: "System::ExplicitCast yöntemi"
linktitle: "AçıkDönüştürme"
second_title: "Aspose.Page için C++"
description: "System::ExplicitCast yöntemi. Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. C++'ta kaynak ve sonuç tipleri aynı olduğunda kullanılır."
type: docs
weight: 18500
url: /tr/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Kaynak ve sonuç tipleri aynı olduğunda kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Basit yapıcı benzeri dönüşüm gerektiğinde kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. İstisna sarmalayıcıları için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Nesneyi istisna olarak dönüştürmek için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Kaynak ve sonuç her ikisi de akıllı göstericiler olduğunda (sonuç tipinde açık [SmartPtr<...>](../smartptr/) olmadan) kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Kaynak ve sonuç her ikisi de akıllı göstericiler olduğunda (sonuç tipinde açık [SmartPtr<...>](../smartptr/) ile) kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Nesneyi nullable (boş değer alabilir) tipe dönüştürmek için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Nullable'ı kutulamak (box) için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Nullable nesneyi kutudan çıkarmak (unbox) için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Enum kutulaması için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Değer tiplerinin yığına (heap) kopyalanması gerektiğinde ve değer tipi akıllı gösterici olarak referans gösterilmeliyse (arayüz tipiyle kısıtlanmış generiklerde, ancak bu arayüzü uygulayan yapı ile özelleştirildiğinde) kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Değer tiplerinden arayüz elde etmek için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Yaygın kutulama (boxing) için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. [System::String](../string/) kutulaması için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Arayüzlerin kutudan çıkarılması (unboxing) için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Yaygın kutudan çıkarma (unboxing) için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. nullptr dönüşümü için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Diziler arasında dönüşüm için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(Source) method


Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. Ham göstericinin akıllı göstericiye dönüştürülmesi gerektiğinde kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | Source | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
