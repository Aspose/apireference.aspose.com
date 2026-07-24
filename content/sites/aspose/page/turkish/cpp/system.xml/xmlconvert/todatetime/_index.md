---
title: "System::Xml::XmlConvert::ToDateTime yöntemi"
linktitle: "ToDateTime"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlConvert::ToDateTime yöntemi. String'i C++'ta bir DateTime eşdeğerine dönüştürür."
type: docs
weight: 1400
url: /tr/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


[String](../../../system/string/) öğesini bir [DateTime](../../../system/datetime/) eşdeğerine dönüştürür.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. |

### ReturnValue

Dizenin bir [DateTime](../../../system/datetime/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


[String](../../../system/string/) öğesini bir [DateTime](../../../system/datetime/) eşdeğerine dönüştürür.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. |
| formats | const ArrayPtr\<String\>\& | Dönüştürülen [DateTime](../../../system/datetime/) üzerine uygulanacak format yapılarını içeren bir dizi. Geçerli formatlar "yyyy-MM-ddTHH:mm:sszzzzzz" ve alt kümelerini içerir. |

### ReturnValue

Dizenin bir [DateTime](../../../system/datetime/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


[String](../../../system/string/) öğesini bir [DateTime](../../../system/datetime/) eşdeğerine dönüştürür.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. |
| format | const String\& | Dönüştürülen [DateTime](../../../system/datetime/) üzerine uygulanacak format yapısı. Geçerli formatlar "yyyy-MM-ddTHH:mm:sszzzzzz" ve alt kümelerini içerir. Dize bu formatla doğrulanır. |

### ReturnValue

Dizenin bir [DateTime](../../../system/datetime/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


Belirtilen [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) kullanılarak [String](../../../system/string/) öğesini bir [DateTime](../../../system/datetime/) öğesine dönüştürür.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek [String](../../../system/string/) değeri. |
| dateTimeOption | XmlDateTimeSerializationMode | Tarih bir UTC tarihi ise, yerel saate dönüştürülüp dönüştürülmeyeceğini veya Koordinatlı Evrensel Zaman (UTC) olarak korunacağını belirten enum değerlerinden biri. |

### ReturnValue

[String](../../../system/string/) öğesinin bir [DateTime](../../../system/datetime/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
