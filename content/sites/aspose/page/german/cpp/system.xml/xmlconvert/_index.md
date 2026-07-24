---
title: "System::Xml::XmlConvert Klasse"
linktitle: "XmlConvert"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlConvert‑Klasse. Kodiert und dekodiert XML-Namen und bietet Methoden zum Konvertieren zwischen Laufzeittypen und XML‑Schema‑Definitionssprache (XSD)-Typen. Beim Konvertieren von Datentypen sind die zurückgegebenen Werte in C++ sprachunabhängig."
type: docs
weight: 1200
url: /de/cpp/system.xml/xmlconvert/
---
## XmlConvert class


Kodiert und dekodiert XML-Namen und bietet Methoden zum Konvertieren zwischen Laufzeittypen und XML [Schema](../../system.xml.schema/) Definitionssprache (XSD)-Typen. Beim Konvertieren von Datentypen sind die zurückgegebenen Werte sprachunabhängig.

```cpp
class XmlConvert : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | Dekodiert einen Namen. Diese Methode führt das Gegenteil der Methoden XmlConvert::EncodeName(String) und XmlConvert::EncodeLocalName(String) aus. |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | Konvertiert den Namen in einen gültigen XML-Lokalen Namen. |
| static [EncodeName](./encodename/)(const String\&) | Konvertiert den Namen in einen gültigen XML-Namen. |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | Überprüft, ob der Name gemäß der XML-Spezifikation gültig ist. |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | Prüft, ob das übergebene Zeichen ein gültiger Nicht‑Doppelpunkt‑Zeichentyp ist. |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | Gibt die übergebene Zeicheninstanz zurück, wenn das Zeichen im Argument ein gültiges Public‑ID‑Zeichen ist, andernfalls **nullptr**. |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | Prüft, ob das übergebene Zeichen ein gültiger Start‑Namens‑Zeichentyp ist. |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | Überprüft, ob das übergebene Zeichen ein gültiges XML‑Leerzeichen‑Zeichen ist. |
| static [IsXmlChar](./isxmlchar/)(char16_t) | Überprüft, ob das übergebene Zeichen ein gültiges XML‑Zeichen ist. |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | Überprüft, ob das übergebene Surrogat‑Paar von Zeichen ein gültiges XML‑Zeichen ist. |
| static [ToBoolean](./toboolean/)(String) | Konvertiert den [String](../../system/string/) in ein entsprechendes [Boolean](../../system/boolean/). |
| static [ToByte](./tobyte/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [Byte](../../system/byte/). |
| static [ToChar](./tochar/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [Char](../../system/char/). |
| static [ToDateTime](./todatetime/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | Konvertiert den [String](../../system/string/) in ein [DateTime](../../system/datetime/) unter Verwendung des angegebenen [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | Konvertiert den bereitgestellten [String](../../system/string/) in ein entsprechendes [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | Konvertiert den bereitgestellten [String](../../system/string/) in ein entsprechendes [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | Konvertiert den bereitgestellten [String](../../system/string/) in ein entsprechendes [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDecimal](./todecimal/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [Decimal](../../system/decimal/). |
| static [ToDouble](./todouble/)(String) | Konvertiert den [String](../../system/string/) in ein entsprechendes [Double](../../system/double/). |
| static [ToGuid](./toguid/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [Guid](../../system/guid/). |
| static [ToInt16](./toint16/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [Int16](../../system/int16/). |
| static [ToInt32](./toint32/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [Int32](../../system/int32/). |
| static [ToInt64](./toint64/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [Int64](../../system/int64/). |
| static [ToSByte](./tosbyte/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [SByte](../../system/sbyte/). |
| static [ToSingle](./tosingle/)(String) | Konvertiert den [String](../../system/string/) in ein entsprechendes [Single](../../system/single/). |
| static [ToString](./tostring/)(bool) | Konvertiert das [Boolean](../../system/boolean/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(char16_t) | Konvertiert das [Char](../../system/char/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(Decimal) | Konvertiert das [Decimal](../../system/decimal/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(int8_t) | Konvertiert das [SByte](../../system/sbyte/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(int16_t) | Konvertiert das [Int16](../../system/int16/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(int32_t) | Konvertiert das [Int32](../../system/int32/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(int64_t) | Konvertiert das [Int64](../../system/int64/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(uint8_t) | Konvertiert das [Byte](../../system/byte/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(uint16_t) | Konvertiert das [UInt16](../../system/uint16/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(uint32_t) | Konvertiert das [UInt32](../../system/uint32/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(uint64_t) | Konvertiert das [UInt64](../../system/uint64/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(float) | Konvertiert das [Single](../../system/single/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(double) | Konvertiert das [Double](../../system/double/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(TimeSpan) | Konvertiert das [TimeSpan](../../system/timespan/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime) | Konvertiert das [DateTime](../../system/datetime/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, const String\&) | Konvertiert das [DateTime](../../system/datetime/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | Konvertiert das [DateTime](../../system/datetime/) in einen [String](../../system/string/) unter Verwendung des angegebenen [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/). |
| static [ToString](./tostring/)(DateTimeOffset) | Konvertiert das bereitgestellte [DateTimeOffset](../../system/datetimeoffset/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | Konvertiert das bereitgestellte [DateTimeOffset](../../system/datetimeoffset/) in einen [String](../../system/string/) im angegebenen Format. |
| static [ToString](./tostring/)(Guid) | Konvertiert das [Guid](../../system/guid/) in einen [String](../../system/string/). |
| static [ToTimeSpan](./totimespan/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [TimeSpan](../../system/timespan/). |
| static [ToUInt16](./touint16/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [UInt16](../../system/uint16/). |
| static [ToUInt32](./touint32/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [UInt32](../../system/uint32/). |
| static [ToUInt64](./touint64/)(const String\&) | Konvertiert den [String](../../system/string/) in ein entsprechendes [UInt64](../../system/uint64/). |
| static [VerifyName](./verifyname/)(const String\&) | Überprüft, ob der Name gemäß der W3C Extended Markup Language-Empfehlung ein gültiger Name ist. |
| static [VerifyNCName](./verifyncname/)(const String\&) | Überprüft, ob der Name gemäß der W3C Extended Markup Language-Empfehlung ein gültiger **NCName** ist. Ein **NCName** ist ein Name, der keinen Doppelpunkt enthalten darf. |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | Überprüft, ob die Zeichenkette ein gültiger NMTOKEN gemäß der W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes-Empfehlung ist. |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | Gibt die übergebene Zeichenketteninstanz zurück, wenn alle Zeichen im Zeichenkettenargument gültige Public-ID-Zeichen sind. |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | Überprüft, ob die Zeichenkette ein gültiges Token gemäß der W3C XML [Schema](../../system.xml.schema/) Part2: Datatypes-Empfehlung ist. |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | Gibt die übergebene Zeichenketteninstanz zurück, wenn alle Zeichen im Zeichenkettenargument gültige Leerzeichenzeichen sind. |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | Gibt die übergebene Zeichenkette zurück, wenn alle Zeichen und Surrogat-Paar-Zeichen im Zeichenkettenargument gültige XML-Zeichen sind; andernfalls wird eine [XmlException](../xmlexception/) mit Informationen zum ersten ungültigen Zeichen ausgelöst. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
