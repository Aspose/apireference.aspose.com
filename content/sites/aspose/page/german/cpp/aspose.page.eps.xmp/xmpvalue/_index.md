---
title: "Aspose::Page::EPS::XMP::XmpValue Klasse"
linktitle: "XmpValue"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::XMP::XmpValue Klasse. Stellt XMP-Wert in C++ dar."
type: docs
weight: 300
url: /de/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


Stellt den [XMP](../)-Wert dar.

```cpp
class XmpValue : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_IsArray](./get_isarray/)() | Gibt true zurück, wenn [XmpValue](./) ein Array ist. |
| [get_IsDateTime](./get_isdatetime/)() const | Gibt true zurück, wenn der Wert ein DateTime ist. |
| [get_IsDouble](./get_isdouble/)() const | Gibt true zurück, wenn der Wert ein Gleitkommawert ist. |
| [get_IsField](./get_isfield/)() | Gibt true zurück, wenn [XmpValue](./) ein Feld ist. |
| [get_IsInteger](./get_isinteger/)() const | Gibt true zurück, wenn der Wert ein Integer ist. |
| [get_IsNamedValue](./get_isnamedvalue/)() const | Gibt true zurück, wenn [XmpValue](./) ein benannter Wert ist. |
| [get_IsNamedValues](./get_isnamedvalues/)() | Gibt true zurück, wenn [XmpValue](./) benannte Werte darstellt. |
| [get_IsRaw](./get_israw/)() | Wert wird nicht unterstützt/unbekannt und roher XML-Code wird bereitgestellt. |
| [get_IsString](./get_isstring/)() | Gibt true zurück, wenn der Wert ein String ist. |
| [get_IsStructure](./get_isstructure/)() | Gibt true zurück, wenn [XmpValue](./) eine Struktur darstellt. |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | Konvertiert [XmpValue](./) in einen benannten Wert. |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | Konvertiert XmlValue in einen benannten Sammlungswert. |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | Konvertiert [XmpValue](./) in einen String. |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | Konvertiert Zeichenkette zu [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | Konvertiert Ganzzahl in [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(double) | Konvertiert Gleitkommazahl in [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | Konvertiert DateTime in [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Konvertiert Array zu [XmpValue](./). |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | Konvertiert [XmpValue](./) zu Array. |
| [ToArray](./toarray/)() | Gibt Array zurück. |
| [ToDateTime](./todatetime/)() | Konvertiert zu Datum/Zeit. |
| [ToDictionary](./todictionary/)() | Gibt Wörterbuch zurück, das benannte Werte enthält. |
| [ToDouble](./todouble/)() | Konvertiert zu Gleitkommazahl. |
| [ToField](./tofield/)() | Gibt [XMP](../)-Wert als [XMP](../)-Feld zurück. |
| [ToInteger](./tointeger/)() | Konvertiert zu Ganzzahl. |
| [ToNamedValue](./tonamedvalue/)() | Gibt [XMP](../)-Wert als benannten Wert zurück. |
| [ToNamedValues](./tonamedvalues/)() | Gibt [XMP](../)-Wert als Sammlung benannter Werte zurück. |
| [ToRaw](./toraw/)() | Roh-XML-Code für unbekannte/nicht unterstützte Werte. |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Gibt Zeichenkettenrepräsentation zurück. |
| [ToString](./tostring/)() const override | Gibt Zeichenkettenrepräsentation von [XmpValue](./) zurück. |
| [ToStringValue](./tostringvalue/)() | Konvertiert zu Zeichenkette. |
| [ToStructure](./tostructure/)() | Gibt [XMP](../)-Wert als Struktur (Menge von Feldern) zurück. |
| [XmpValue](./xmpvalue/)(System::String) | Konstruktor für Zeichenkettenwert. |
| [XmpValue](./xmpvalue/)(int32_t) | Konstruktor für Ganzzahlwert. |
| [XmpValue](./xmpvalue/)(double) | Konstruktor für Gleitkommawert. |
| [XmpValue](./xmpvalue/)(System::DateTime) | Konstruktor für Datum/Zeit-Wert. |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | Konstruktor für Arraywert. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
