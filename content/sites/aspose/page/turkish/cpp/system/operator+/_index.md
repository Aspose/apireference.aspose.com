---
title: "System::operator+ method"
linktitle: "operator+"
second_title: "Aspose.Page için C++"
description: "System::operator+ method. C++'de dize birleştirme."
type: docs
weight: 27500
url: /tr/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| sol | const char_t | Dizeye eklenecek karakter. |
| right | const String\& | [String](../string/) birleştirilecek. |

### ReturnValue

Birleştirilmiş dize.

## Ayrıca Bakınız

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


Belirtilen değer ile belirtilen [Decimal](../decimal/) nesnesi tarafından temsil edilen değerin toplamını temsil eden yeni bir [Decimal](../decimal/) sınıfı örneği döndürür.

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| x | const T\& | İlk terim |
| d | const Decimal\& | İkinci terimi temsil eden [Decimal](../decimal/) nesnesine sabit referans |

### ReturnValue

**x** ve **d** tarafından temsil edilen değerin toplamını temsil eden yeni bir [Decimal](../decimal/) sınıfı örneği.

## Ayrıca Bakınız

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


Null olmayan ve null olabilir değerleri toplar.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Sol operand tipi. |
| T2 | Sağ operand tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| bazı | const T1\& | Sol operand. |
| diğer | const Nullable\<T2\>\& | Sağ operand. |

### ReturnValue

Toplama sonucu.

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Sağ el temsilcisindeki tüm geri çağrıları sol el temsilcisinin geri çağrı listesinin sonuna bağlar.

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Geri çağrıların eklendiği temsilci. |
| rhv | MulticastDelegate\<T\> | Geri çağrıları eklenen temsilci. |

### ReturnValue

Sol el değerinin geri çağrılarını ve ardından sağ el değerinin geri çağrılarını içeren bir temsilci döndürür.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | Açıklama |
| --- | --- |
| T | [String](../string/) literal türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| sol | T\& | Dizeye eklenecek sabit. |
| right | const String\& | [String](../string/) birleştirilecek. |

### ReturnValue

Birleştirilmiş dize.

## Ayrıca Bakınız

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | Açıklama |
| --- | --- |
| T | [String](../string/) işaretçi tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| left | T\& | [String](../string/) dizeye eklemek için gösterici. |
| right | const String\& | [String](../string/) birleştirilecek. |

### ReturnValue

Birleştirilmiş dize.

## Ayrıca Bakınız

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
