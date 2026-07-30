---
title: "System::Xml::XmlConvert Klasse"
linktitle: "XmlConvert"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlConvert Klasse. Kodiert und dekodiert XML-Namen und stellt Methoden zum Konvertieren zwischen Laufzeittypen und XML-Schema-Definitionssprache (XSD)-Typen bereit. Beim Konvertieren von Datentypen sind die zurückgegebenen Werte in C++ lokalisierungsunabhängig."
type: docs
weight: 1200
url: /de/cpp/system.xml/xmlconvert/
---
## XmlConvert class


Kodiert und dekodiert XML-Namen und stellt Methoden zum Konvertieren zwischen Laufzeittypen und XML [Schema](../../system.xml.schema/) Definitionssprache (XSD)-Typen bereit. Beim Konvertieren von Datentypen sind die zurückgegebenen Werte lokalisierungsunabhängig.

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
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | Prüft, ob das übergebene Zeichen ein gültiger Start‑Name‑Zeichentyp ist. |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | Prüft, ob das übergebene Zeichen ein gültiges XML‑Leerzeichen‑Zeichen ist. |
| static [IsXmlChar](./isxmlchar/)(char16_t) | Prüft, ob das übergebene Zeichen ein gültiges XML‑Zeichen ist. |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | Prüft, ob das übergebene Surrogat‑Paar von Zeichen ein gültiges XML‑Zeichen ist. |
| static [ToBoolean](./toboolean/)(String) | Konvertiert das [String](../../system/string/) in ein [Boolean](../../system/boolean/)-Äquivalent. |
| static [ToByte](./tobyte/)(const String\&) | Konvertiert das [String](../../system/string/) in ein [Byte](../../system/byte/)-Äquivalent. |
| static [ToChar](./tochar/)(const String\&) | Konvertiert das [String](../../system/string/) in ein [Char](../../system/char/)-Äquivalent. |
| static [ToDateTime](./todatetime/)(const String\&) | Konvertiert das [String](../../system/string/) in ein [DateTime](../../system/datetime/)-Äquivalent. |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | Konvertiert das [String](../../system/string/) in ein [DateTime](../../system/datetime/)-Äquivalent. |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | Konvertiert das [String](../../system/string/) in ein [DateTime](../../system/datetime/)-Äquivalent. |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | Konvertiert das [String](../../system/string/) in ein [DateTime](../../system/datetime/) unter Verwendung des angegebenen [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | Konvertiert das bereitgestellte [String](../../system/string/) in ein [DateTimeOffset](../../system/datetimeoffset/)-Äquivalent. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | Konvertiert das bereitgestellte [String](../../system/string/) in ein [DateTimeOffset](../../system/datetimeoffset/)-Äquivalent. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | Konvertiert das bereitgestellte [String](../../system/string/) in ein [DateTimeOffset](../../system/datetimeoffset/)-Äquivalent. |
| static [ToDecimal](./todecimal/)(const String\&) | Konvertiert das [String](../../system/string/) in ein [Decimal](../../system/decimal/)-Äquivalent. |
| static [ToDouble](./todouble/)(String) | Konvertiert das [String](../../system/string/) in ein [Double](../../system/double/)-Äquivalent. |
| static [ToGuid](./toguid/)(const String\&) | Konvertiert das [String](../../system/string/) in ein [Guid](../../system/guid/)-Äquivalent. |
| static [ToInt16](./toint16/)(const String\&) | Konvertiert das [String](../../system/string/) in ein [Int16](../../system/int16/)-Äquivalent. |
| static [ToInt32](./toint32/)(const String\&) | Konvertiert das [String](../../system/string/) in ein [Int32](../../system/int32/)-Äquivalent. |
| static [ToInt64](./toint64/)(const String\&) | Konvertiert den [String](../../system/string/) in ein [Int64](../../system/int64/) Äquivalent. |
| static [ToSByte](./tosbyte/)(const String\&) | Konvertiert den [String](../../system/string/) in ein [SByte](../../system/sbyte/) Äquivalent. |
| static [ToSingle](./tosingle/)(String) | Konvertiert den [String](../../system/string/) in ein [Single](../../system/single/) Äquivalent. |
| static [ToString](./tostring/)(bool) | Konvertiert den [Boolean](../../system/boolean/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(char16_t) | Konvertiert den [Char](../../system/char/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(Decimal) | Konvertiert den [Decimal](../../system/decimal/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(int8_t) | Konvertiert den [SByte](../../system/sbyte/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(int16_t) | Konvertiert den [Int16](../../system/int16/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(int32_t) | Konvertiert den [Int32](../../system/int32/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(int64_t) | Konvertiert den [Int64](../../system/int64/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(uint8_t) | Konvertiert den [Byte](../../system/byte/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(uint16_t) | Konvertiert den [UInt16](../../system/uint16/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(uint32_t) | Konvertiert den [UInt32](../../system/uint32/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(uint64_t) | Konvertiert den [UInt64](../../system/uint64/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(float) | Konvertiert den [Single](../../system/single/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(double) | Konvertiert den [Double](../../system/double/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(TimeSpan) | Konvertiert den [TimeSpan](../../system/timespan/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime) | Konvertiert den [DateTime](../../system/datetime/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, const String\&) | Konvertiert den [DateTime](../../system/datetime/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | Konvertiert den [DateTime](../../system/datetime/) in einen [String](../../system/string/) unter Verwendung des angegebenen [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/). |
| static [ToString](./tostring/)(DateTimeOffset) | Konvertiert das bereitgestellte [DateTimeOffset](../../system/datetimeoffset/) in einen [String](../../system/string/). |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | Konvertiert das bereitgestellte [DateTimeOffset](../../system/datetimeoffset/) in einen [String](../../system/string/) im angegebenen Format. |
| static [ToString](./tostring/)(Guid) | Konvertiert den [Guid](../../system/guid/) in einen [String](../../system/string/). |
| static [ToTimeSpan](./totimespan/)(const String\&) | Konvertiert den [String](../../system/string/) in ein [TimeSpan](../../system/timespan/) Äquivalent. |
| static [ToUInt16](./touint16/)(const String\&) | Konvertiert den [String](../../system/string/) in ein [UInt16](../../system/uint16/) Äquivalent. |
| static [ToUInt32](./touint32/)(const String\&) | Konvertiert den [String](../../system/string/) in ein [UInt32](../../system/uint32/) Äquivalent. |
| static [ToUInt64](./touint64/)(const String\&) | Konvertiert das [String](../../system/string/) in ein entsprechendes [UInt64](../../system/uint64/). |
| static [VerifyName](./verifyname/)(const String\&) | Überprüft, ob der Name ein gültiger Name gemäß der W3C‑Empfehlung für erweiterte Auszeichnungssprache ist. |
| static [VerifyNCName](./verifyncname/)(const String\&) | Überprüft, ob der Name ein gültiger **NCName** gemäß der W3C‑Empfehlung für erweiterte Auszeichnungssprache ist. Ein **NCName** ist ein Name, der keinen Doppelpunkt enthalten darf. |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | Überprüft, ob die Zeichenkette ein gültiges NMTOKEN gemäß der W3C XML [Schema](../../system.xml.schema/) Teil 2: Datentypen‑Empfehlung ist. |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | Gibt die übergebene Zeichenketteninstanz zurück, wenn alle Zeichen im Zeichenkettenargument gültige Public‑ID‑Zeichen sind. |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | Überprüft, ob die Zeichenkette ein gültiges Token gemäß der W3C XML [Schema](../../system.xml.schema/) Teil 2: Datentypen‑Empfehlung ist. |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | Gibt die übergebene Zeichenketteninstanz zurück, wenn alle Zeichen im Zeichenkettenargument gültige Leerzeichen‑Zeichen sind. |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | Gibt die übergebene Zeichenkette zurück, wenn alle Zeichen und Surrogat‑Paar‑Zeichen im Zeichenkettenargument gültige XML‑Zeichen sind; andernfalls wird eine [XmlException](../xmlexception/) mit Informationen zum ersten ungültigen Zeichen ausgelöst. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
