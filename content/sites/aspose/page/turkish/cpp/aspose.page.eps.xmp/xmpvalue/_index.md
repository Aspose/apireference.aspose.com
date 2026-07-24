---
title: "Aspose::Page::EPS::XMP::XmpValue class"
linktitle: "XmpValue"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::XMP::XmpValue class. C++'da XMP değerini temsil eder."
type: docs
weight: 300
url: /tr/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


[XMP](../) değerini temsil eder.

```cpp
class XmpValue : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_IsArray](./get_isarray/)() | True döndürür, [XmpValue](./) bir dizi ise. |
| [get_IsDateTime](./get_isdatetime/)() const | Değer DateTime ise true döndürür. |
| [get_IsDouble](./get_isdouble/)() const | Değer kayan nokta ise true döndürür. |
| [get_IsField](./get_isfield/)() | True döndürür, [XmpValue](./) bir alan ise. |
| [get_IsInteger](./get_isinteger/)() const | Değer tam sayı ise true döndürür. |
| [get_IsNamedValue](./get_isnamedvalue/)() const | True döndürür, [XmpValue](./) adlandırılmış değer ise. |
| [get_IsNamedValues](./get_isnamedvalues/)() | True döndürür, [XmpValue](./) adlandırılmış değerleri temsil ediyorsa. |
| [get_IsRaw](./get_israw/)() | Değer desteklenmiyor/bilinmiyor ve ham XML kodu sağlanır. |
| [get_IsString](./get_isstring/)() | Değer string ise true döndürür. |
| [get_IsStructure](./get_isstructure/)() | True döndürür, [XmpValue](./) bir yapı temsil ediyorsa. |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./) değerini adlandırılmış değere dönüştürür. |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | XmlValue'yi adlandırılmış koleksiyon değerine dönüştürür. |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./) değerini stringe dönüştürür. |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | Dizgiyi [XmpValue](./) öğesine dönüştürür. |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | Tam sayıyı [XmpValue](./) öğesine dönüştürür. |
| static [to_XmpValue](./to_xmpvalue/)(double) | Double'ı [XmpValue](./) öğesine dönüştürür. |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | DateTime'ı [XmpValue](./) öğesine dönüştürür. |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Diziyi [XmpValue](./) öğesine dönüştürür. |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | [XmpValue](./) öğesini diziye dönüştürür. |
| [ToArray](./toarray/)() | Dizi döndürür. |
| [ToDateTime](./todatetime/)() | DateTime'a dönüştürür. |
| [ToDictionary](./todictionary/)() | Adlandırılmış değerleri içeren sözlüğü döndürür. |
| [ToDouble](./todouble/)() | Double'a dönüştürür. |
| [ToField](./tofield/)() | [XMP](../) değerini [XMP](../) alanı olarak döndürür. |
| [ToInteger](./tointeger/)() | Tam sayıya dönüştürür. |
| [ToNamedValue](./tonamedvalue/)() | [XMP](../) değerini adlandırılmış değer olarak döndürür. |
| [ToNamedValues](./tonamedvalues/)() | [XMP](../) değerini adlandırılmış değer koleksiyonu olarak döndürür. |
| [ToRaw](./toraw/)() | Bilinmeyen/desteklenmeyen değerler için ham XML kodu. |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Dizgi temsilini döndürür. |
| [ToString](./tostring/)() const override | [XmpValue](./) öğesinin dizgi temsilini döndürür. |
| [ToStringValue](./tostringvalue/)() | Dizgiye dönüştürür. |
| [ToStructure](./tostructure/)() | [XMP](../) değerini yapı (alan kümesi) olarak döndürür. |
| [XmpValue](./xmpvalue/)(System::String) | Dizgi değeri için yapıcı. |
| [XmpValue](./xmpvalue/)(int32_t) | Tam sayı değeri için yapıcı. |
| [XmpValue](./xmpvalue/)(double) | Kayan nokta değeri için yapıcı. |
| [XmpValue](./xmpvalue/)(System::DateTime) | DateTime değeri için yapıcı. |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | Dizi değeri için yapıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
