---
title: "Aspose::Page::EPS::XMP::XmpValue klasse"
linktitle: "XmpValue"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::XMP::XmpValue klasse. Vertegenwoordigt XMP-waarde in C++."
type: docs
weight: 300
url: /nl/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


Vertegenwoordigt [XMP](../) waarde.

```cpp
class XmpValue : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_IsArray](./get_isarray/)() | Retourneert true als [XmpValue](./) een array is. |
| [get_IsDateTime](./get_isdatetime/)() const | Retourneert true als de waarde een DateTime is. |
| [get_IsDouble](./get_isdouble/)() const | Retourneert true als de waarde een floating point-waarde is. |
| [get_IsField](./get_isfield/)() | Retourneert true als [XmpValue](./) een veld is. |
| [get_IsInteger](./get_isinteger/)() const | Retourneert true als de waarde een integer is. |
| [get_IsNamedValue](./get_isnamedvalue/)() const | Retourneert true als [XmpValue](./) een benoemde waarde is. |
| [get_IsNamedValues](./get_isnamedvalues/)() | Retourneert true als [XmpValue](./) benoemde waarden vertegenwoordigt. |
| [get_IsRaw](./get_israw/)() | Waarde wordt niet ondersteund/onbekend en ruwe XML-code wordt geleverd. |
| [get_IsString](./get_isstring/)() | Retourneert true als de waarde een string is. |
| [get_IsStructure](./get_isstructure/)() | Retourneert true als [XmpValue](./) een structuur vertegenwoordigt. |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | Converteert [XmpValue](./) naar een benoemde waarde. |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | Converteert XmlValue naar een benoemde collectie-waarde. |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | Converteert [XmpValue](./) naar een string. |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | Converteert een string naar [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | Converteert een integer naar [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(double) | Converteert een double naar [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | Converteert een DateTime naar [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Converteert een array naar [XmpValue](./). |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | Converteert [XmpValue](./) naar een array. |
| [ToArray](./toarray/)() | Retourneert een array. |
| [ToDateTime](./todatetime/)() | Converteert naar een datum-tijd. |
| [ToDictionary](./todictionary/)() | Retourneert een dictionary die benoemde waarden bevat. |
| [ToDouble](./todouble/)() | Converteert naar een double. |
| [ToField](./tofield/)() | Retourneert de [XMP](../)-waarde als een [XMP](../)-veld. |
| [ToInteger](./tointeger/)() | Converteert naar een integer. |
| [ToNamedValue](./tonamedvalue/)() | Retourneert de [XMP](../)-waarde als een benoemde waarde. |
| [ToNamedValues](./tonamedvalues/)() | Retourneert de [XMP](../) waarde als benoemde waardecollectie. |
| [ToRaw](./toraw/)() | Ruwe XML-code voor onbekende/niet-ondersteunde waarden. |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Retourneert de tekenreeksrepresentatie. |
| [ToString](./tostring/)() const override | Retourneert de tekenreeksrepresentatie van [XmpValue](./). |
| [ToStringValue](./tostringvalue/)() | Converteert naar tekenreeks. |
| [ToStructure](./tostructure/)() | Retourneert de [XMP](../) waarde als structuur (verzameling van velden). |
| [XmpValue](./xmpvalue/)(System::String) | Constructor voor tekenreekswaarde. |
| [XmpValue](./xmpvalue/)(int32_t) | Constructor voor gehele getalwaarde. |
| [XmpValue](./xmpvalue/)(double) | Constructor voor zwevendekommagetalwaarde. |
| [XmpValue](./xmpvalue/)(System::DateTime) | Constructor voor datum‑tijdwaarde. |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | Constructor voor arraywaarde. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
