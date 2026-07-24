---
title: "System::Xml::XmlConvert class"
linktitle: "XmlConvert"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlConvert class. Codeert en decodeert XML-namen, en biedt methoden voor het converteren tussen runtime-typen en XML Schema-definitietaal (XSD)-typen. Bij het converteren van gegevenstypen zijn de geretourneerde waarden locale-onafhankelijk in C++."
type: docs
weight: 1200
url: /nl/cpp/system.xml/xmlconvert/
---
## XmlConvert class


Codeert en decodeert XML-namen, en biedt methoden voor het converteren tussen runtime-typen en XML [Schema](../../system.xml.schema/) definitietaal (XSD)-typen. Bij het converteren van gegevenstypen zijn de geretourneerde waarden locale-onafhankelijk.

```cpp
class XmlConvert : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | Decodeert een naam. Deze methode doet het omgekeerde van de XmlConvert::EncodeName(String)- en XmlConvert::EncodeLocalName(String)-methoden. |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | Converteert de naam naar een geldige XML-lokale naam. |
| static [EncodeName](./encodename/)(const String\&) | Converteert de naam naar een geldige XML-naam. |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | Verifieert dat de naam geldig is volgens de XML-specificatie. |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | Controleert of het meegegeven teken een geldig niet-dubbelepunt-teken type is. |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | Retourneert de meegegeven tekeninstantie als het teken in het argument een geldig public-id-teken is, anders **nullptr**. |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | Controleert of het meegegeven teken een geldig Start-Name-Character-type is. |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | Controleert of het doorgegeven teken een geldig XML-ruimtekarakter is. |
| static [IsXmlChar](./isxmlchar/)(char16_t) | Controleert of het doorgegeven teken een geldig XML-teken is. |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | Controleert of het doorgegeven surrogate-paar van tekens een geldig XML-teken is. |
| static [ToBoolean](./toboolean/)(String) | Converteert de [String](../../system/string/) naar een [Boolean](../../system/boolean/) equivalent. |
| static [ToByte](./tobyte/)(const String\&) | Converteert de [String](../../system/string/) naar een [Byte](../../system/byte/) equivalent. |
| static [ToChar](./tochar/)(const String\&) | Converteert de [String](../../system/string/) naar een [Char](../../system/char/) equivalent. |
| static [ToDateTime](./todatetime/)(const String\&) | Converteert de [String](../../system/string/) naar een [DateTime](../../system/datetime/) equivalent. |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | Converteert de [String](../../system/string/) naar een [DateTime](../../system/datetime/) equivalent. |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | Converteert de [String](../../system/string/) naar een [DateTime](../../system/datetime/) equivalent. |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | Converteert de [String](../../system/string/) naar een [DateTime](../../system/datetime/) met de opgegeven [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | Converteert de opgegeven [String](../../system/string/) naar een [DateTimeOffset](../../system/datetimeoffset/) equivalent. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | Converteert de opgegeven [String](../../system/string/) naar een [DateTimeOffset](../../system/datetimeoffset/) equivalent. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | Converteert de opgegeven [String](../../system/string/) naar een [DateTimeOffset](../../system/datetimeoffset/) equivalent. |
| static [ToDecimal](./todecimal/)(const String\&) | Converteert de [String](../../system/string/) naar een [Decimal](../../system/decimal/) equivalent. |
| static [ToDouble](./todouble/)(String) | Converteert de [String](../../system/string/) naar een [Double](../../system/double/) equivalent. |
| static [ToGuid](./toguid/)(const String\&) | Converteert de [String](../../system/string/) naar een [Guid](../../system/guid/) equivalent. |
| static [ToInt16](./toint16/)(const String\&) | Converteert de [String](../../system/string/) naar een [Int16](../../system/int16/) equivalent. |
| static [ToInt32](./toint32/)(const String\&) | Converteert de [String](../../system/string/) naar een [Int32](../../system/int32/) equivalent. |
| static [ToInt64](./toint64/)(const String\&) | Converteert de [String](../../system/string/) naar een [Int64](../../system/int64/) equivalent. |
| static [ToSByte](./tosbyte/)(const String\&) | Converteert de [String](../../system/string/) naar een [SByte](../../system/sbyte/) equivalent. |
| static [ToSingle](./tosingle/)(String) | Converteert de [String](../../system/string/) naar een [Single](../../system/single/) equivalent. |
| static [ToString](./tostring/)(bool) | Converteert de [Boolean](../../system/boolean/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(char16_t) | Converteert de [Char](../../system/char/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(Decimal) | Converteert de [Decimal](../../system/decimal/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(int8_t) | Converteert de [SByte](../../system/sbyte/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(int16_t) | Converteert de [Int16](../../system/int16/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(int32_t) | Converteert de [Int32](../../system/int32/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(int64_t) | Converteert de [Int64](../../system/int64/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(uint8_t) | Converteert de [Byte](../../system/byte/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(uint16_t) | Converteert de [UInt16](../../system/uint16/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(uint32_t) | Converteert de [UInt32](../../system/uint32/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(uint64_t) | Converteert de [UInt64](../../system/uint64/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(float) | Converteert de [Single](../../system/single/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(double) | Converteert de [Double](../../system/double/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(TimeSpan) | Converteert de [TimeSpan](../../system/timespan/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime) | Converteert de [DateTime](../../system/datetime/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, const String\&) | Converteert de [DateTime](../../system/datetime/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | Converteert de [DateTime](../../system/datetime/) naar een [String](../../system/string/) met de opgegeven [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/). |
| static [ToString](./tostring/)(DateTimeOffset) | Converteert de opgegeven [DateTimeOffset](../../system/datetimeoffset/) naar een [String](../../system/string/). |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | Converteert de opgegeven [DateTimeOffset](../../system/datetimeoffset/) naar een [String](../../system/string/) in het opgegeven formaat. |
| static [ToString](./tostring/)(Guid) | Converteert de [Guid](../../system/guid/) naar een [String](../../system/string/). |
| static [ToTimeSpan](./totimespan/)(const String\&) | Converteert de [String](../../system/string/) naar een [TimeSpan](../../system/timespan/) equivalent. |
| static [ToUInt16](./touint16/)(const String\&) | Converteert de [String](../../system/string/) naar een [UInt16](../../system/uint16/) equivalent. |
| static [ToUInt32](./touint32/)(const String\&) | Converteert de [String](../../system/string/) naar een [UInt32](../../system/uint32/) equivalent. |
| static [ToUInt64](./touint64/)(const String\&) | Converteert de [String](../../system/string/) naar een [UInt64](../../system/uint64/) equivalent. |
| static [VerifyName](./verifyname/)(const String\&) | Verifieert dat de naam een geldige naam is volgens de W3C Extended Markup Language-aanbeveling. |
| static [VerifyNCName](./verifyncname/)(const String\&) | Verifieert dat de naam een geldige **NCName** is volgens de W3C Extended Markup Language-aanbeveling. Een **NCName** is een naam die geen dubbele punt mag bevatten. |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | Verifieert dat de string een geldig NMTOKEN is volgens de W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes-aanbeveling. |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | Retourneert de meegegeven string‑instantie als alle tekens in het string‑argument geldige public‑id‑tekens zijn. |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | Verifieert dat de string een geldig token is volgens de W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes-aanbeveling. |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | Retourneert de meegegeven string‑instantie als alle tekens in het string‑argument geldige witruimte‑tekens zijn. |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | Retourneert de meegegeven string als alle tekens en surrogate‑paar‑tekens in het string‑argument geldige XML‑tekens zijn; anders wordt een [XmlException](../xmlexception/) gegooid met informatie over het eerste ongeldige teken dat wordt aangetroffen. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
