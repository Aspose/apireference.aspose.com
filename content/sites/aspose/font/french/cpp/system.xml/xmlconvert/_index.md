---
title: "System::Xml::XmlConvert classe"
linktitle: "XmlConvert"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlConvert classe. Encode et décode les noms XML, et fournit des méthodes pour convertir entre les types d'exécution et les types du langage de définition de schéma XML (XSD). Lors de la conversion des types de données, les valeurs retournées sont indépendantes de la locale en C++."
type: docs
weight: 1200
url: /fr/cpp/system.xml/xmlconvert/
---
## XmlConvert class


Encode et décode les noms XML, et fournit des méthodes pour convertir entre les types d'exécution et le langage de définition du [Schema](../../system.xml.schema/) XML (XSD). Lors de la conversion des types de données, les valeurs retournées sont indépendantes de la locale.

```cpp
class XmlConvert : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [DecodeName](./decodename/)(const String\&) | Décode un nom. Cette méthode effectue l'inverse des méthodes XmlConvert::EncodeName(String) et XmlConvert::EncodeLocalName(String). |
| static [EncodeLocalName](./encodelocalname/)(const String\&) | Convertit le nom en un nom local XML valide. |
| static [EncodeName](./encodename/)(const String\&) | Convertit le nom en un nom XML valide. |
| static [EncodeNmToken](./encodenmtoken/)(const String\&) | Vérifie que le nom est valide selon la spécification XML. |
| static [IsNCNameChar](./isncnamechar/)(char16_t) | Vérifie si le caractère fourni est un type de caractère non deux-points valide. |
| static [IsPublicIdChar](./ispublicidchar/)(char16_t) | Renvoie l'instance du caractère fourni si le caractère dans l'argument est un caractère d'identifiant public valide, sinon **nullptr**. |
| static [IsStartNCNameChar](./isstartncnamechar/)(char16_t) | Vérifie si le caractère fourni est un type de caractère de début de nom valide. |
| static [IsWhitespaceChar](./iswhitespacechar/)(char16_t) | Vérifie si le caractère fourni est un caractère d'espace blanc XML valide. |
| static [IsXmlChar](./isxmlchar/)(char16_t) | Vérifie si le caractère fourni est un caractère XML valide. |
| static [IsXmlSurrogatePair](./isxmlsurrogatepair/)(char16_t, char16_t) | Vérifie si la paire de caractères de substitution fournie est un caractère XML valide. |
| static [ToBoolean](./toboolean/)(String) | Convertit le [String](../../system/string/) en un équivalent [Boolean](../../system/boolean/). |
| static [ToByte](./tobyte/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [Byte](../../system/byte/). |
| static [ToChar](./tochar/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [Char](../../system/char/). |
| static [ToDateTime](./todatetime/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const String\&) | Convertit le [String](../../system/string/) en un équivalent [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, const ArrayPtr\<String\>\&) | Convertit le [String](../../system/string/) en un équivalent [DateTime](../../system/datetime/). |
| static [ToDateTime](./todatetime/)(const String\&, XmlDateTimeSerializationMode) | Convertit le [String](../../system/string/) en un [DateTime](../../system/datetime/) en utilisant le [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) spécifié. |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&) | Convertit le [String](../../system/string/) fourni en un équivalent [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const String\&) | Convertit le [String](../../system/string/) fourni en un équivalent [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDateTimeOffset](./todatetimeoffset/)(const String\&, const ArrayPtr\<String\>\&) | Convertit le [String](../../system/string/) fourni en un équivalent [DateTimeOffset](../../system/datetimeoffset/). |
| static [ToDecimal](./todecimal/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [Decimal](../../system/decimal/). |
| static [ToDouble](./todouble/)(String) | Convertit le [String](../../system/string/) en un équivalent [Double](../../system/double/). |
| static [ToGuid](./toguid/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [Guid](../../system/guid/). |
| static [ToInt16](./toint16/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [Int16](../../system/int16/). |
| static [ToInt32](./toint32/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [Int32](../../system/int32/). |
| static [ToInt64](./toint64/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [Int64](../../system/int64/). |
| static [ToSByte](./tosbyte/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [SByte](../../system/sbyte/). |
| static [ToSingle](./tosingle/)(String) | Convertit le [String](../../system/string/) en un équivalent [Single](../../system/single/). |
| static [ToString](./tostring/)(bool) | Convertit le [Boolean](../../system/boolean/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(char16_t) | Convertit le [Char](../../system/char/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(Decimal) | Convertit le [Decimal](../../system/decimal/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(int8_t) | Convertit le [SByte](../../system/sbyte/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(int16_t) | Convertit le [Int16](../../system/int16/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(int32_t) | Convertit le [Int32](../../system/int32/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(int64_t) | Convertit le [Int64](../../system/int64/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(uint8_t) | Convertit le [Byte](../../system/byte/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(uint16_t) | Convertit le [UInt16](../../system/uint16/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(uint32_t) | Convertit le [UInt32](../../system/uint32/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(uint64_t) | Convertit le [UInt64](../../system/uint64/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(float) | Convertit le [Single](../../system/single/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(double) | Convertit le [Double](../../system/double/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(TimeSpan) | Convertit le [TimeSpan](../../system/timespan/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime) | Convertit le [DateTime](../../system/datetime/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, const String\&) | Convertit le [DateTime](../../system/datetime/) en une [String](../../system/string/). |
| static [ToString](./tostring/)(DateTime, XmlDateTimeSerializationMode) | Convertit le [DateTime](../../system/datetime/) en une [String](../../system/string/) en utilisant le [XmlDateTimeSerializationMode](../xmldatetimeserializationmode/) spécifié. |
| static [ToString](./tostring/)(DateTimeOffset) | Convertit le [DateTimeOffset](../../system/datetimeoffset/) fourni en une [String](../../system/string/). |
| static [ToString](./tostring/)(DateTimeOffset, const String\&) | Convertit le [DateTimeOffset](../../system/datetimeoffset/) fourni en une [String](../../system/string/) dans le format spécifié. |
| static [ToString](./tostring/)(Guid) | Convertit le [Guid](../../system/guid/) en une [String](../../system/string/). |
| static [ToTimeSpan](./totimespan/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [TimeSpan](../../system/timespan/). |
| static [ToUInt16](./touint16/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [UInt16](../../system/uint16/). |
| static [ToUInt32](./touint32/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [UInt32](../../system/uint32/). |
| static [ToUInt64](./touint64/)(const String\&) | Convertit le [String](../../system/string/) en un équivalent [UInt64](../../system/uint64/). |
| static [VerifyName](./verifyname/)(const String\&) | Vérifie que le nom est un nom valide selon la recommandation du Langage de balisage étendu W3C. |
| static [VerifyNCName](./verifyncname/)(const String\&) | Vérifie que le nom est un **NCName** valide selon la recommandation du Langage de balisage étendu W3C. Un **NCName** est un nom qui ne peut pas contenir de deux-points. |
| static [VerifyNMTOKEN](./verifynmtoken/)(const String\&) | Vérifie que la chaîne est un NMTOKEN valide selon la recommandation du W3C XML [Schema](../../system.xml.schema/) Partie 2 : Types de données. |
| static [VerifyPublicId](./verifypublicid/)(const String\&) | Renvoie l'instance de chaîne transmise si tous les caractères du paramètre chaîne sont des caractères d'identifiant public valides. |
| static [VerifyTOKEN](./verifytoken/)(const String\&) | Vérifie que la chaîne est un jeton valide selon la recommandation du W3C XML [Schema](../../system.xml.schema/) Partie 2 : Types de données. |
| static [VerifyWhitespace](./verifywhitespace/)(const String\&) | Renvoie l'instance de chaîne transmise si tous les caractères du paramètre chaîne sont des caractères d'espace blanc valides. |
| static [VerifyXmlChars](./verifyxmlchars/)(const String\&) | Renvoie la chaîne transmise si tous les caractères et les paires de substituts du paramètre chaîne sont des caractères XML valides, sinon une [XmlException](../xmlexception/) est levée avec des informations sur le premier caractère invalide rencontré. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
