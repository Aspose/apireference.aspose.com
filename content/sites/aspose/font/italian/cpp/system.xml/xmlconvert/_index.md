---
title: "classe System::Xml::XmlConvert"
linktitle: "XmlConvert"
second_title: "Aspose.Font per C++"
description: "classe System::Xml::XmlConvert. Codifica e decodifica i nomi XML e fornisce metodi per la conversione tra tipi di runtime e tipi del linguaggio di definizione dello schema XML (XSD). Durante la conversione dei tipi di dati, i valori restituiti sono indipendenti dalla locale in C++."
type: docs
weight: 1200
url: /it/cpp/system.xml/xmlconvert/
---
## XmlConvert class


Codifica e decodifica i nomi XML e fornisce metodi per la conversione tra tipi di runtime e tipi del linguaggio di definizione dello [Schema](../../system.xml.schema/) XML (XSD). Quando si convertono i tipi di dati, i valori restituiti sono indipendenti dalla locale.

```cpp
class XmlConvert : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | Decodifica un nome. Questo metodo esegue l'operazione inversa dei metodi XmlConvert::EncodeName(String) e XmlConvert::EncodeLocalName(String). |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | Converte il nome in un nome locale XML valido. |
| static [EncodeName](./encodename/)(const String\&) | Converte il nome in un nome XML valido. |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | Verifica che il nome sia valido secondo la specifica XML. |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | Verifica se il carattere fornito è un tipo di carattere non due punti valido. |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | Restituisce l'istanza del carattere fornito se il carattere nell'argomento è un carattere ID pubblico valido, altrimenti **nullptr**. |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | Verifica se il carattere fornito è un tipo di carattere di avvio nome valido. |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | Verifica se il carattere fornito è un carattere di spazio bianco XML valido. |
| static [IsXmlChar](./isxmlchar/)(char16_t) | Verifica se il carattere fornito è un carattere XML valido. |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | Verifica se la coppia surrogata di caratteri fornita è un carattere XML valido. |
| static [ToBoolean](./toboolean/)(String) | Converte la [String](../../system/string/) in un equivalente [Boolean](../../system/boolean/). |
| static [ToByte](./tobyte/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [Byte](../../system/byte/). |
| static [ToChar](./tochar/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [Char](../../system/char/). |
| static [ToDateTime](./todatetime/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | Converte la [String](../../system/string/) in un equivalente [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | Converte la [String](../../system/string/) in un equivalente [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | Converte la [String](../../system/string/) in un [DateTime](../../system/datetime/) utilizzando il [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) specificato. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | Converte la [String](../../system/string/) fornita in un equivalente [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | Converte la [String](../../system/string/) fornita in un equivalente [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | Converte la [String](../../system/string/) fornita in un equivalente [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDecimal](./todecimal/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [Decimal](../../system/decimal/). |
| static [ToDouble](./todouble/)(String) | Converte la [String](../../system/string/) in un equivalente [Double](../../system/double/). |
| static [ToGuid](./toguid/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [Guid](../../system/guid/). |
| static [ToInt16](./toint16/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [Int16](../../system/int16/). |
| static [ToInt32](./toint32/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [Int32](../../system/int32/). |
| static [ToInt64](./toint64/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [Int64](../../system/int64/). |
| static [ToSByte](./tosbyte/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [SByte](../../system/sbyte/). |
| static [ToSingle](./tosingle/)(String) | Converte la [String](../../system/string/) in un equivalente [Single](../../system/single/). |
| static [ToString](./tostring/)(bool) | Converte il [Boolean](../../system/boolean/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(char16_t) | Converte il [Char](../../system/char/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(Decimal) | Converte il [Decimal](../../system/decimal/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(int8_t) | Converte il [SByte](../../system/sbyte/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(int16_t) | Converte il [Int16](../../system/int16/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(int32_t) | Converte il [Int32](../../system/int32/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(int64_t) | Converte il [Int64](../../system/int64/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(uint8_t) | Converte il [Byte](../../system/byte/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(uint16_t) | Converte il [UInt16](../../system/uint16/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(uint32_t) | Converte il [UInt32](../../system/uint32/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(uint64_t) | Converte il [UInt64](../../system/uint64/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(float) | Converte il [Single](../../system/single/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(double) | Converte il [Double](../../system/double/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(TimeSpan) | Converte il [TimeSpan](../../system/timespan/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime) | Converte il [DateTime](../../system/datetime/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, const String\&) | Converte il [DateTime](../../system/datetime/) in una [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | Converte il [DateTime](../../system/datetime/) in una [String](../../system/string/) utilizzando il [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) specificato. |
| static [ToString](./tostring/)(DateTimeOffset) | Converte il [DateTimeOffset](../../system/datetimeoffset/) fornito in una [String](../../system/string/). |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | Converte il [DateTimeOffset](../../system/datetimeoffset/) fornito in una [String](../../system/string/) nel formato specificato. |
| static [ToString](./tostring/)(Guid) | Converte il [Guid](../../system/guid/) in una [String](../../system/string/). |
| static [ToTimeSpan](./totimespan/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [TimeSpan](../../system/timespan/). |
| static [ToUInt16](./touint16/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [UInt16](../../system/uint16/). |
| static [ToUInt32](./touint32/)(const String\&) | Converte la [String](../../system/string/) in un equivalente [UInt32](../../system/uint32/). |
| static [ToUInt64](./touint64/)(const String\&) | Converte il [String](../../system/string/) in un equivalente [UInt64](../../system/uint64/). |
| static [VerifyName](./verifyname/)(const String\&) | Verifica che il nome sia un nome valido secondo la raccomandazione W3C Extended Markup Language. |
| static [VerifyNCName](./verifyncname/)(const String\&) | Verifica che il nome sia un **NCName** valido secondo la raccomandazione W3C Extended Markup Language. Un **NCName** è un nome che non può contenere due punti. |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | Verifica che la stringa sia un NMTOKEN valido secondo la raccomandazione W3C XML [Schema](../../system.xml.schema/) Parte 2: Datatypes. |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | Restituisce l'istanza di stringa passata se tutti i caratteri nell'argomento stringa sono caratteri di ID pubblico validi. |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | Verifica che la stringa sia un token valido secondo la raccomandazione W3C XML [Schema](../../system.xml.schema/) Parte 2: Datatypes. |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | Restituisce l'istanza di stringa passata se tutti i caratteri nell'argomento stringa sono caratteri di spazio bianco validi. |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | Restituisce la stringa passata se tutti i caratteri e i caratteri di coppia surrogata nell'argomento stringa sono caratteri XML validi, altrimenti viene generata un'eccezione [XmlException](../xmlexception/) con informazioni sul primo carattere non valido riscontrato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
