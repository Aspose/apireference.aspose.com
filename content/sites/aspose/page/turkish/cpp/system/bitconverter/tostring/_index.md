---
title: "System::BitConverter::ToString yöntemi"
linktitle: "ToString"
second_title: "Aspose.Page için C++"
description: "System::BitConverter::ToString yöntemi. Belirtilen bayt dizisinin tüm değerlerini onaltılık dize temsiline dönüştürür. Onaltılık gösterimde kullanılacak harflerin büyük/küçük olması ve komşu bayt çiftleri arasına eklenecek ayırıcı, C++'ta ilgili argümanlar aracılığıyla belirtilir."
type: docs
weight: 1200
url: /tr/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


Belirtilen bayt dizisinin tüm değerlerini onaltılık dize temsiline dönüştürür. Onaltılık gösterimde kullanılacak harflerin büyük/küçük olması ve komşu bayt çiftleri arasına eklenecek ayırıcı, ilgili argümanlarla belirtilir.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | Dönüştürülecek baytları içeren [Array](../../array/) |
| büyük harf | bool | Sonuçtaki onaltılık temsilde kullanılacak harflerin büyük/küçük olmasını belirler |
| ayırıcı | const String\& | Sonuç dizesinde komşu bayt çiftleri arasına eklenen ayırıcı olarak kullanılan bir dize |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## Ayrıca Bakınız

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


Belirtilen bayt dizisinin değerlerini belirtilen dizinden başlayarak onaltılık dize temsiline dönüştürür.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | Dönüştürülecek baytları içeren [Array](../../array/) |
| startIndex | int | Belirtilen dizide dönüştürmeye başlanacak indeks |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Ayrıca Bakınız

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


Belirtilen bayt dizisinin bir değer aralığını onaltılık dize temsiline dönüştürür.

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | Dönüştürülecek baytları içeren [Array](../../array/) |
| startIndex | int | Belirtilen dizide dönüştürülecek bayt dizisi öğelerinin aralığının başladığı indeks |
| length | int | Dönüştürülecek bayt dizisi öğelerinin aralığının uzunluğu |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## Ayrıca Bakınız

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
