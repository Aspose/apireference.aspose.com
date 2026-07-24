---
title: "Aspose::Page::EPS::XMP::XmpValue classe"
linktitle: "XmpValue"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::XMP::XmpValue classe. Rappresenta il valore XMP in C++."
type: docs
weight: 300
url: /it/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


Rappresenta il valore [XMP](../).

```cpp
class XmpValue : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_IsArray](./get_isarray/)() | Restituisce true se [XmpValue](./) è un array. |
| [get_IsDateTime](./get_isdatetime/)() const | Restituisce true se il valore è DateTime. |
| [get_IsDouble](./get_isdouble/)() const | Restituisce true se il valore è un valore a virgola mobile. |
| [get_IsField](./get_isfield/)() | Restituisce true se [XmpValue](./) è un campo. |
| [get_IsInteger](./get_isinteger/)() const | Restituisce true se il valore è un intero. |
| [get_IsNamedValue](./get_isnamedvalue/)() const | Restituisce true se [XmpValue](./) è un valore denominato. |
| [get_IsNamedValues](./get_isnamedvalues/)() | Restituisce true se [XmpValue](./) rappresenta valori denominati. |
| [get_IsRaw](./get_israw/)() | Il valore non è supportato/sconosciuto e viene fornito il codice XML grezzo. |
| [get_IsString](./get_isstring/)() | Restituisce true se il valore è una stringa. |
| [get_IsStructure](./get_isstructure/)() | Restituisce true se [XmpValue](./) rappresenta una struttura. |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | Converte [XmpValue](./) in valore denominato. |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | Converte XmlValue in valore di raccolta denominato. |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | Converte [XmpValue](./) in stringa. |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | Converte la stringa in [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | Converte l'intero in [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(double) | Converte il double in [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | Converte il DateTime in [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Converte l'array in [XmpValue](./). |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | Converte [XmpValue](./) in array. |
| [ToArray](./toarray/)() | Restituisce l'array. |
| [ToDateTime](./todatetime/)() | Converte in data e ora. |
| [ToDictionary](./todictionary/)() | Restituisce un dizionario che contiene valori denominati. |
| [ToDouble](./todouble/)() | Converte in double. |
| [ToField](./tofield/)() | Restituisce il valore [XMP](../) come campo [XMP](../). |
| [ToInteger](./tointeger/)() | Converte in intero. |
| [ToNamedValue](./tonamedvalue/)() | Restituisce il valore [XMP](../) come valore nominato. |
| [ToNamedValues](./tonamedvalues/)() | Restituisce il valore [XMP](../) come raccolta di valori nominati. |
| [ToRaw](./toraw/)() | Codice XML grezzo per valori sconosciuti/non supportati. |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Restituisce la rappresentazione stringa. |
| [ToString](./tostring/)() const override | Restituisce la rappresentazione stringa di [XmpValue](./). |
| [ToStringValue](./tostringvalue/)() | Converte in stringa. |
| [ToStructure](./tostructure/)() | Restituisce il valore [XMP](../) come struttura (insieme di campi). |
| [XmpValue](./xmpvalue/)(System::String) | Costruttore per valore stringa. |
| [XmpValue](./xmpvalue/)(int32_t) | Costruttore per valore intero. |
| [XmpValue](./xmpvalue/)(double) | Costruttore per valore a virgola mobile. |
| [XmpValue](./xmpvalue/)(System::DateTime) | Costruttore per valore data e ora. |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | Costruttore per valore array. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
