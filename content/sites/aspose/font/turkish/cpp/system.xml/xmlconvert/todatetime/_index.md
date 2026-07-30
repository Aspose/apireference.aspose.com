---
title: "System::Xml::XmlConvert::ToDateTime yöntemi"
linktitle: "ToDateTime"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlConvert::ToDateTime yöntemi. String'i C++'ta bir DateTime eşdeğerine dönüştürür."
type: docs
weight: 1400
url: /tr/cpp/system.xml/xmlconvert/todatetime/
---
## XmlConvert::ToDateTime(const String\&) method


[String](../../../system/string/) değerini bir [DateTime](../../../system/datetime/) eşdeğerine dönüştürür.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. |

### ReturnValue

Dizenin bir [DateTime](../../../system/datetime/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const ArrayPtr\<String\>\&) method


[String](../../../system/string/) değerini bir [DateTime](../../../system/datetime/) eşdeğerine dönüştürür.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const ArrayPtr<String> &formats)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. |
| formats | const ArrayPtr\<String\>\& | Dönüştürülen [DateTime](../../../system/datetime/) üzerine uygulanacak biçim yapılarını içeren bir dizi. Geçerli biçimler "yyyy-MM-ddTHH:mm:sszzzzzz" ve alt kümelerini içerir. |

### ReturnValue

Dizenin bir [DateTime](../../../system/datetime/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, const String\&) method


[String](../../../system/string/) değerini bir [DateTime](../../../system/datetime/) eşdeğerine dönüştürür.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, const String &format)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek dize. |
| format | const String\& | Dönüştürülen [DateTime](../../../system/datetime/) üzerine uygulanacak biçim yapısı. Geçerli biçimler "yyyy-MM-ddTHH:mm:sszzzzzz" ve alt kümelerini içerir. Dize bu biçime göre doğrulanır. |

### ReturnValue

Dizenin bir [DateTime](../../../system/datetime/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlConvert::ToDateTime(const String\&, XmlDateTimeSerializationMode) method


[String](../../../system/string/) değerini belirtilen [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/) kullanarak bir [DateTime](../../../system/datetime/) tipine dönüştürür.

```cpp
static DateTime System::Xml::XmlConvert::ToDateTime(const String &s, XmlDateTimeSerializationMode dateTimeOption)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek [String](../../../system/string/) değeri. |
| dateTimeOption | XmlDateTimeSerializationMode | Tarihin yerel saate dönüştürülüp dönüştürülmeyeceğini veya Koordinatlı Evrensel Zaman (UTC) olarak korunup korunmayacağını belirten enum değerlerinden biri, eğer tarih UTC ise. |

### ReturnValue

[String](../../../system/string/) değerinin bir [DateTime](../../../system/datetime/) eşdeğeri.

## Ayrıca Bakınız

* Class [DateTime](../../../system/datetime/)
* Class [String](../../../system/string/)
* Enum [XmlDateTimeSerializationMode](../../xmldatetimeserializationmode/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
