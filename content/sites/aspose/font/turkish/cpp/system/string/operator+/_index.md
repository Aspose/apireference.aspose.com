---
title: "System::String::operator+ yöntemi"
linktitle: "operator+"
second_title: "Aspose.Font için C++"
description: "System::String::operator+ yöntemi. C++'da dizeye karakter ekler."
type: docs
weight: 2800
url: /tr/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


Dizgenin sonuna karakter ekler.

```cpp
String System::String::operator+(char_t x) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | char_t | Eklenecek karakter. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | [String](../) mevcut olanın sonuna eklemek için. |

### ReturnValue

Birleştirilmiş dize.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| Parametre | Açıklama |
| --- | --- |
| T | Dize sabiti veya karakter dize işaretçisi biçimlerinden biri. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg | const T\& | Geçerli dizeye eklenecek varlık. |

### ReturnValue

Birleştirilmiş dize.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


Dizgenin sonuna referans tipindeki nesnenin dize temsilini ekler.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| Parametre | Açıklama |
| --- | --- |
| T | işaretçi türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) dizeye dönüştürmek için [ToString()](../tostring/) çağrısını kullanarak ve geçerli dizeye eklemek için. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(const T\&) const method


Değer türü nesnenin dize temsilini dize sonuna ekler.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| Parametre | Açıklama |
| --- | --- |
| T | Değer türü, [ToString()](../tostring/) çağrısı yapılacak. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | const T\& | [Object](../../object/) dizeye dönüştürmek için [ToString()](../tostring/) çağrısını kullanarak ve geçerli dizeye eklemek için. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(double) const method


Dizgenin sonuna kayan nokta değerinin dize temsilini ekler.

```cpp
String System::String::operator+(double d) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| d | double | Dizeye dönüştürülüp eklenecek değer. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int) const method


Dizgenin sonuna tamsayı değerinin dize temsilini ekler.

```cpp
String System::String::operator+(int i) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| i | int | Dizeye dönüştürülüp eklenecek tamsayı değeri. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(int64_t) const method


Dizgenin sonuna tamsayı değerinin dize temsilini ekler.

```cpp
String System::String::operator+(int64_t v) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| v | int64_t | Dizeye dönüştürülüp eklenmek için eklenecek değer. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(T) const method


Dizgenin sonuna boolean değerinin dize temsilini ekler.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| Parametre | Açıklama |
| --- | --- |
| T | Dizeyle birleştirilecek değer tipi. Bool olmalıdır |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) dizeye dönüştürülüp eklenecek değer. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::operator+(uint32_t) const method


Dizgenin sonuna işaretsiz tamsayı değerinin dize temsilini ekler.

```cpp
String System::String::operator+(uint32_t i) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| i | uint32_t | Dizeye dönüştürülüp eklenecek değer. |

### ReturnValue

[String](../) concatenation result.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
