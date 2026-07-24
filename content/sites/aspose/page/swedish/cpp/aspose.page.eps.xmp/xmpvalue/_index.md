---
title: "Aspose::Page::EPS::XMP::XmpValue klass"
linktitle: "XmpValue"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::XMP::XmpValue klass. Representerar XMP‑värde i C++."
type: docs
weight: 300
url: /sv/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


Representerar [XMP](../) värde.

```cpp
class XmpValue : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_IsArray](./get_isarray/)() | Returnerar true om [XmpValue](./) är en array. |
| [get_IsDateTime](./get_isdatetime/)() const | Returnerar true om värdet är DateTime. |
| [get_IsDouble](./get_isdouble/)() const | Returnerar true om värdet är ett flyttal. |
| [get_IsField](./get_isfield/)() | Returnerar true om [XmpValue](./) är ett fält. |
| [get_IsInteger](./get_isinteger/)() const | Returnerar true om värdet är ett heltal. |
| [get_IsNamedValue](./get_isnamedvalue/)() const | Returnerar true om [XmpValue](./) är ett namngivet värde. |
| [get_IsNamedValues](./get_isnamedvalues/)() | Returnerar true om [XmpValue](./) representerar namngivna värden. |
| [get_IsRaw](./get_israw/)() | Värdet stöds inte/är okänt och rå XML‑kod tillhandahålls. |
| [get_IsString](./get_isstring/)() | Returnerar true om värdet är en sträng. |
| [get_IsStructure](./get_isstructure/)() | Returnerar true om [XmpValue](./) representerar en struktur. |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | Konverterar [XmpValue](./) till ett namngivet värde. |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | Konverterar XmlValue till ett namngivet samlingsvärde. |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | Konverterar [XmpValue](./) till en sträng. |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | Konverterar sträng till [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | Konverterar heltal till [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(double) | Konverterar dubbel till [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | Konverterar DateTime till [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Konverterar array till [XmpValue](./). |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | Konverterar [XmpValue](./) till array. |
| [ToArray](./toarray/)() | Returnerar array. |
| [ToDateTime](./todatetime/)() | Konverterar till datum/tid. |
| [ToDictionary](./todictionary/)() | Returnerar ordbok som innehåller namngivna värden. |
| [ToDouble](./todouble/)() | Konverterar till dubbel. |
| [ToField](./tofield/)() | Returnerar [XMP](../)-värde som [XMP](../)-fält. |
| [ToInteger](./tointeger/)() | Konverterar till heltal. |
| [ToNamedValue](./tonamedvalue/)() | Returnerar [XMP](../)-värde som namngivet värde. |
| [ToNamedValues](./tonamedvalues/)() | Returnerar [XMP](../)-värde som samling av namngivna värden. |
| [ToRaw](./toraw/)() | Rå XML-kod för okända/ej stödda värden. |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Returnerar strängrepresentation. |
| [ToString](./tostring/)() const override | Returnerar strängrepresentation av [XmpValue](./). |
| [ToStringValue](./tostringvalue/)() | Konverterar till sträng. |
| [ToStructure](./tostructure/)() | Returnerar [XMP](../)-värde som struktur (uppsättning av fält). |
| [XmpValue](./xmpvalue/)(System::String) | Konstruktor för strängvärde. |
| [XmpValue](./xmpvalue/)(int32_t) | Konstruktor för heltalvärde. |
| [XmpValue](./xmpvalue/)(double) | Konstruktor för flyttalvärde. |
| [XmpValue](./xmpvalue/)(System::DateTime) | Konstruktor för datum/tid‑värde. |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | Konstruktor för arrayvärde. |
## Se även

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
