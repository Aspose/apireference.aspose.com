---
title: "System::String::operator+ yöntemi"
linktitle: "operator+"
second_title: "Aspose.Page için C++"
description: "System::String::operator+ yöntemi. C++ içinde dizeye karakter ekler."
type: docs
weight: 2800
url: /tr/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


Dizenin sonuna karakter ekler.

```cpp
String System::String::operator+(char_t x) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| x | char_t | Eklenecek karakter. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| str | const String\& | [String](../) mevcut olanın sonuna eklemek için. |

### ReturnValue

Birleştirilmiş dize.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Parameter | Açıklama |
| --- | --- |
| T | Dize sabiti veya karakter dize işaretçisi biçimlerinden biri. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| arg | const T\& | Mevcut dizeyle birleştirilecek varlık. |

### ReturnValue

Birleştirilmiş dize.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Dizenin sonuna referans tipindeki nesnenin dize temsilini ekler.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Açıklama |
| --- | --- |
| T | işaretçi türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) dizeye dönüştürmek için [ToString()](../tostring/) çağrısını kullanarak ve mevcut dizeye eklemek için. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


Değer tipi nesnesinin dize temsilini dize sonuna ekler.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Parameter | Açıklama |
| --- | --- |
| T | Değer tipi, [ToString()](../tostring/) çağrısı yapılacak. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) dizeye dönüştürmek için [ToString()](../tostring/) çağrısını kullanarak ve mevcut dizeye eklemek için. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(double) const method


Dizenin sonuna kayan nokta değerinin dize temsilini ekler.

```cpp
String System::String::operator+(double d) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| d | double | Dizeye dönüştürülüp eklenecek değer. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int) const method


Dizenin sonuna tamsayı değerinin dize temsilini ekler.

```cpp
String System::String::operator+(int i) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| i | int | Dizeye dönüştürülüp eklenecek tamsayı değeri. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int64_t) const method


Dizenin sonuna tamsayı değerinin dize temsilini ekler.

```cpp
String System::String::operator+(int64_t v) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| v | int64_t | Dizeye dönüştürülüp eklenmek için eklenecek değer. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(T) const method


Dizenin sonuna boolean değerinin dize temsilini ekler.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Parameter | Açıklama |
| --- | --- |
| T | Dizeyle birleştirilecek değer tipi. Bool olmalıdır |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) değeri dizeye dönüştürülüp eklenecek. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(uint32_t) const method


Dizenin sonuna işaretsiz tamsayı değerinin dize temsilini ekler.

```cpp
String System::String::operator+(uint32_t i) const
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| i | uint32_t | Dizeye dönüştürülüp eklenecek değer. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
