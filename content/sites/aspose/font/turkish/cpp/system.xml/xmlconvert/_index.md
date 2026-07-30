---
title: "System::Xml::XmlConvert sınıfı"
linktitle: "XmlConvert"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlConvert sınıfı. XML adlarını kodlar ve çözer, ayrıca çalışma zamanı türleri ile XML Şema tanım dili (XSD) türleri arasında dönüşüm sağlayan yöntemler sunar. Veri türlerini dönüştürürken, döndürülen değerler C++'ta yerel ayar bağımsızdır."
type: docs
weight: 1200
url: /tr/cpp/system.xml/xmlconvert/
---
## XmlConvert class


XML adlarını kodlar ve çözer, ayrıca çalışma zamanı türleri ile XML [Schema](../../system.xml.schema/) tanım dili (XSD) türleri arasında dönüşüm sağlayan yöntemler sunar. Veri türlerini dönüştürürken, döndürülen değerler yerel ayar bağımsızdır.

```cpp
class XmlConvert : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | Bir adı çözer. Bu yöntem, XmlConvert::EncodeName(String) ve XmlConvert::EncodeLocalName(String) yöntemlerinin tersini yapar. |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | Adı geçerli bir XML yerel adına dönüştürür. |
| static [EncodeName](./encodename/)(const String\&) | Adı geçerli bir XML adına dönüştürür. |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | Adın XML spesifikasyonuna göre geçerli olduğunu doğrular. |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | Verilen karakterin geçerli bir iki nokta üst üste olmayan karakter türü olup olmadığını kontrol eder. |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | Argümandaki karakter geçerli bir public id karakteri ise verilen karakter örneğini döndürür, aksi takdirde **nullptr**. |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | Verilen karakterin geçerli bir Başlangıç Adı Karakteri türü olup olmadığını kontrol eder. |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | Verilen karakterin geçerli bir XML boşluk karakteri olup olmadığını kontrol eder. |
| static [IsXmlChar](./isxmlchar/)(char16_t) | Verilen karakterin geçerli bir XML karakteri olup olmadığını kontrol eder. |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | Verilen ikili karakter çiftinin geçerli bir XML karakteri olup olmadığını kontrol eder. |
| static [ToBoolean](./toboolean/)(String) | [String](../../system/string/) nesnesini bir [Boolean](../../system/boolean/) eşdeğerine dönüştürür. |
| static [ToByte](./tobyte/)(const String\&) | [String](../../system/string/) nesnesini bir [Byte](../../system/byte/) eşdeğerine dönüştürür. |
| static [ToChar](./tochar/)(const String\&) | [String](../../system/string/) nesnesini bir [Char](../../system/char/) eşdeğerine dönüştürür. |
| static [ToDateTime](./todatetime/)(const String\&) | [String](../../system/string/) nesnesini bir [DateTime](../../system/datetime/) eşdeğerine dönüştürür. |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | [String](../../system/string/) nesnesini bir [DateTime](../../system/datetime/) eşdeğerine dönüştürür. |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | [String](../../system/string/) nesnesini bir [DateTime](../../system/datetime/) eşdeğerine dönüştürür. |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | [String](../../system/string/) nesnesini belirtilen [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) kullanarak bir [DateTime](../../system/datetime/) değerine dönüştürür. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | Sağlanan [String](../../system/string/) nesnesini bir [DateTimeOffset](../../system/datetimeoffset/) eşdeğerine dönüştürür. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | Sağlanan [String](../../system/string/) nesnesini bir [DateTimeOffset](../../system/datetimeoffset/) eşdeğerine dönüştürür. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | Sağlanan [String](../../system/string/) nesnesini bir [DateTimeOffset](../../system/datetimeoffset/) eşdeğerine dönüştürür. |
| static [ToDecimal](./todecimal/)(const String\&) | [String](../../system/string/) nesnesini bir [Decimal](../../system/decimal/) eşdeğerine dönüştürür. |
| static [ToDouble](./todouble/)(String) | [String](../../system/string/) nesnesini bir [Double](../../system/double/) eşdeğerine dönüştürür. |
| static [ToGuid](./toguid/)(const String\&) | [String](../../system/string/) nesnesini bir [Guid](../../system/guid/) eşdeğerine dönüştürür. |
| static [ToInt16](./toint16/)(const String\&) | [String](../../system/string/) nesnesini bir [Int16](../../system/int16/) eşdeğerine dönüştürür. |
| static [ToInt32](./toint32/)(const String\&) | [String](../../system/string/) nesnesini bir [Int32](../../system/int32/) eşdeğerine dönüştürür. |
| static [ToInt64](./toint64/)(const String\&) | [String](../../system/string/) öğesini [Int64](../../system/int64/) eşdeğerine dönüştürür. |
| static [ToSByte](./tosbyte/)(const String\&) | [String](../../system/string/) öğesini [SByte](../../system/sbyte/) eşdeğerine dönüştürür. |
| static [ToSingle](./tosingle/)(String) | [String](../../system/string/) öğesini [Single](../../system/single/) eşdeğerine dönüştürür. |
| static [ToString](./tostring/)(bool) | [Boolean](../../system/boolean/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(char16_t) | [Char](../../system/char/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(Decimal) | [Decimal](../../system/decimal/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(int8_t) | [SByte](../../system/sbyte/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(int16_t) | [Int16](../../system/int16/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(int32_t) | [Int32](../../system/int32/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(int64_t) | [Int64](../../system/int64/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(uint8_t) | [Byte](../../system/byte/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(uint16_t) | [UInt16](../../system/uint16/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(uint32_t) | [UInt32](../../system/uint32/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(uint64_t) | [UInt64](../../system/uint64/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(float) | [Single](../../system/single/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(double) | [Double](../../system/double/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(TimeSpan) | [TimeSpan](../../system/timespan/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(DateTime) | [DateTime](../../system/datetime/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(DateTime, const String\&) | [DateTime](../../system/datetime/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | [DateTime](../../system/datetime/) öğesini belirtilen [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) kullanarak [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(DateTimeOffset) | Sağlanan [DateTimeOffset](../../system/datetimeoffset/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | Sağlanan [DateTimeOffset](../../system/datetimeoffset/) öğesini belirtilen biçimde [String](../../system/string/) türüne dönüştürür. |
| static [ToString](./tostring/)(Guid) | [Guid](../../system/guid/) öğesini [String](../../system/string/) türüne dönüştürür. |
| static [ToTimeSpan](./totimespan/)(const String\&) | [String](../../system/string/) öğesini [TimeSpan](../../system/timespan/) eşdeğerine dönüştürür. |
| static [ToUInt16](./touint16/)(const String\&) | [String](../../system/string/) öğesini [UInt16](../../system/uint16/) eşdeğerine dönüştürür. |
| static [ToUInt32](./touint32/)(const String\&) | [String](../../system/string/) öğesini [UInt32](../../system/uint32/) eşdeğerine dönüştürür. |
| static [ToUInt64](./touint64/)(const String\&) | Belirtilen [String](../../system/string/) öğesini bir [UInt64](../../system/uint64/) eşdeğerine dönüştürür. |
| static [VerifyName](./verifyname/)(const String\&) | İsmin, W3C Genişletilmiş İşaretleme Dili önerisine göre geçerli bir isim olduğunu doğrular. |
| static [VerifyNCName](./verifyncname/)(const String\&) | İsmin, W3C Genişletilmiş İşaretleme Dili önerisine göre geçerli bir **NCName** olduğunu doğrular. **NCName**, iki nokta üstüste içeremeyen bir isimdir. |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | Dizgenin, W3C XML [Schema](../../system.xml.schema/) Bölüm2: Veri Tipleri önerisine göre geçerli bir NMTOKEN olduğunu doğrular. |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | Dizge argümanındaki tüm karakterler geçerli public id karakterleri ise, verilen dizge örneğini döndürür. |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | Dizgenin, W3C XML [Schema](../../system.xml.schema/) Bölüm2: Veri Tipleri önerisine göre geçerli bir token olduğunu doğrular. |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | Dizge argümanındaki tüm karakterler geçerli boşluk karakterleri ise, verilen dizge örneğini döndürür. |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | Dizge argümanındaki tüm karakterler ve surrogate çift karakterler geçerli XML karakterleri ise, verilen dizgeyi döndürür; aksi takdirde, karşılaşılan ilk geçersiz karakter hakkında bilgi içeren bir [XmlException](../xmlexception/) fırlatılır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
