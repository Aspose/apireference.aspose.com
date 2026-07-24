---
title: "System::AsCast yöntemi"
linktitle: "AsCast"
second_title: "Aspose.Page için C++"
description: "System::AsCast yöntemi. Kaynak türü, ''as'' operatör dönüşümü kullanarak sonuç türüne dönüştürür. C++'ta basit yapıcı benzeri dönüşüm gerektiğinde kullanılır."
type: docs
weight: 13500
url: /tr/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


Kaynak türü, 'as' operatör dönüşümü kullanarak sonuç türüne dönüştürür. Basit yapıcı benzeri dönüşüm gerektiğinde kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. Kaynak ve sonuç türleri aynı olduğunda kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. İstisna sarmalayıcıları için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu. Dönüşüm mevcut değilse nullptr döndürür.

## Ayrıca Bakınız

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. Nesneyi istisna olarak dönüştürmek için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu. Dönüşüm mevcut değilse nullptr döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. Kaynak ve sonuç her ikisi de akıllı işaretçiler olduğunda kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu. Dönüşüm mevcut değilse nullptr döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. Kaynak ve sonuç her ikisi de akıllı işaretçiler olduğunda (sonuç türünde açıkça [SmartPtr<...>](../smartptr/) ile) kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu. Dönüşüm mevcut değilse nullptr döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. Nesneyi nullable'a açmak (unboxing) için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu. Dönüşüm mevcut değilse boş nullable döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. Nesne olmayan türe geçersiz unboxing.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Her zaman null döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


Nesne olmayan türe geçersiz unboxing.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Her zaman null döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. Nullable nesneyi kutulamak (boxing) için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. Genel nesneyi kutulamak (boxing) için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. Genel nesneyi kutulamak (boxing) için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. Dize (string) unboxing'i için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. nullptr durumlandırması için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


'as' operatörü dönüşümü kullanarak kaynak türünü sonuç türüne dönüştürür. Diziler arasında dönüşüm yapmak için kullanılır.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| Parameter | Açıklama |
| --- | --- |
| Kaynak | Kaynak türü. |
| Result | Sonuç türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) dönüştürmek için. |

### ReturnValue

Dönüştürme sonucu. Herhangi bir dizi üyesi için dönüşüm mevcut değilse nullptr döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
