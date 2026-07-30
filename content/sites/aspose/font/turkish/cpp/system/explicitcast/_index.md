---
title: "System::ExplicitCast method"
linktitle: "AçıkDönüştürme"
second_title: "Aspose.Font için C++"
description: "System::ExplicitCast yöntemi. Kaynak tipi, açık dönüşüm kullanılarak sonuç tipine dönüştürür. C++'da kaynak ve sonuç tipleri aynı olduğunda kullanılır."
type: docs
weight: 18600
url: /tr/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Kaynak ve sonuç türleri aynı olduğunda kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Basit bir yapıcı benzeri dönüşüm gerektiğinde kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. İstisna sarmalayıcıları için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Nesneyi istisna olarak dönüştürmek için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Kaynak ve sonuç ikisi de akıllı işaretçiler olduğunda (sonuç türünde açık [SmartPtr<...>](../smartptr/) olmadan) kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Kaynak ve sonuç ikisi de akıllı işaretçiler olduğunda (sonuç türünde açık [SmartPtr<...>](../smartptr/) ile) kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Nesneyi nullable (boş değer alabilen) tipe kutudan çıkarmak için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Nullable'ı kutulamak (box) için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Nullable nesneyi kutudan çıkarmak için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Enum kutulaması için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Değer türünün akıllı işaretçi olarak referans gösterilmesi gerektiğinde (arayüz türüyle kısıtlanmış jeneriklerde, ancak bu arayüzü uygulayan yapı ile özelleştirilmiş) değer türlerini yığına kopyalamak için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Değer türlerinden arayüz elde etmek için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Genel kutulama için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. [System::String](../string/) kutulaması için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Arayüzleri kutudan çıkarmak için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Genel kutudan çıkarma için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. nullptr dönüşümü için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(const Source\&) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Diziler arasında dönüşüm yapmak için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const Source\& | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::ExplicitCast(Source) method


Kaynak türü, açık dönüşüm kullanılarak sonuç türüne dönüştürülür. Ham işaretçiyi akıllı işaretçiye dönüştürürken kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| Parametre | Açıklama |
| --- | --- |
| Kaynak | Kaynak tipi. |
| Result | Sonuç tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | Source | Dönüştürülecek [Object](../object/). |

### ReturnValue

Dönüşüm sonucu.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
