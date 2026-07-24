---
title: "Aspose::Page::EPS::XMP::XmpValue class"
linktitle: "XmpValue"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::XMP::XmpValue class. Représente la valeur XMP en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


Représente la valeur [XMP](../).

```cpp
class XmpValue : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_IsArray](./get_isarray/)() | Renvoie vrai si [XmpValue](./) est un tableau. |
| [get_IsDateTime](./get_isdatetime/)() const | Renvoie vrai si la valeur est DateTime. |
| [get_IsDouble](./get_isdouble/)() const | Renvoie vrai si la valeur est un nombre à virgule flottante. |
| [get_IsField](./get_isfield/)() | Renvoie vrai si [XmpValue](./) est un champ. |
| [get_IsInteger](./get_isinteger/)() const | Renvoie vrai si la valeur est un entier. |
| [get_IsNamedValue](./get_isnamedvalue/)() const | Renvoie vrai si [XmpValue](./) est une valeur nommée. |
| [get_IsNamedValues](./get_isnamedvalues/)() | Renvoie vrai si [XmpValue](./) représente des valeurs nommées. |
| [get_IsRaw](./get_israw/)() | La valeur n'est pas prise en charge/inconnue et le code XML brut est fourni. |
| [get_IsString](./get_isstring/)() | Renvoie vrai si la valeur est une chaîne. |
| [get_IsStructure](./get_isstructure/)() | Renvoie vrai si [XmpValue](./) représente une structure. |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | Convertit [XmpValue](./) en valeur nommée. |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | Convertit XmlValue en valeur de collection nommée. |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | Convertit [XmpValue](./) en chaîne. |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | Convertit une chaîne en [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | Convertit un entier en [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(double) | Convertit un double en [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | Convertit un DateTime en [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Convertit un tableau en [XmpValue](./). |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | Convertit [XmpValue](./) en tableau. |
| [ToArray](./toarray/)() | Renvoie un tableau. |
| [ToDateTime](./todatetime/)() | Convertit en date et heure. |
| [ToDictionary](./todictionary/)() | Renvoie un dictionnaire qui contient des valeurs nommées. |
| [ToDouble](./todouble/)() | Convertit en double. |
| [ToField](./tofield/)() | Renvoie la valeur [XMP](../) en tant que champ [XMP](../). |
| [ToInteger](./tointeger/)() | Convertit en entier. |
| [ToNamedValue](./tonamedvalue/)() | Renvoie la valeur [XMP](../) en tant que valeur nommée. |
| [ToNamedValues](./tonamedvalues/)() | Renvoie la valeur [XMP](../) en tant que collection de valeurs nommées. |
| [ToRaw](./toraw/)() | Code XML brut pour les valeurs inconnues/non prises en charge. |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Renvoie la représentation sous forme de chaîne. |
| [ToString](./tostring/)() const override | Renvoie la représentation sous forme de chaîne de [XmpValue](./). |
| [ToStringValue](./tostringvalue/)() | Convertit en chaîne. |
| [ToStructure](./tostructure/)() | Renvoie la valeur [XMP](../) sous forme de structure (ensemble de champs). |
| [XmpValue](./xmpvalue/)(System::String) | Constructeur pour une valeur chaîne. |
| [XmpValue](./xmpvalue/)(int32_t) | Constructeur pour une valeur entière. |
| [XmpValue](./xmpvalue/)(double) | Constructeur pour une valeur à virgule flottante. |
| [XmpValue](./xmpvalue/)(System::DateTime) | Constructeur pour une valeur date et heure. |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | Constructeur pour une valeur tableau. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
