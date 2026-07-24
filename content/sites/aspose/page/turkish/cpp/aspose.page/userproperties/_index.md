---
title: "Aspose::Page::UserProperties sınıfı"
linktitle: "UserProperties"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::UserProperties sınıfı. Tiplenmiş özelliklerin ayarlanıp döndürülebileceği özel bir özellik sınıfı. Ayrıca, bu özellik nesnesi içinde özellik bulunmadığında aranacak iki varsayılan özellik nesnesinin bağlanmasına izin verir (C++)."
type: docs
weight: 1600
url: /tr/cpp/aspose.page/userproperties/
---
## UserProperties class


Tiplenmiş özelliklerin ayarlanıp döndürülebilmesini sağlayan özel bir özellik sınıfı. Ayrıca, bu özellik nesnesi özelliği içermiyorsa iki varsayılan özellik nesnesinin aranmasına izin verir.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | Dize özelliği değerini alır. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | Dize özelliği değerini alır. İstenen özellik yoksa, verilen varsayılan değeri döndürür. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | Renk özelliği değerini alır. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | Renk özelliği değerini alır. İstenen özellik yoksa, verilen varsayılan değeri döndürür. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | Double özelliği değerini alır. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | Double özelliği değerini alır. İstenen özellik yoksa, verilen varsayılan değeri döndürür. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | Float özelliği değerini alır. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | Float özelliği değerini alır. İstenen özellik yoksa, verilen varsayılan değeri döndürür. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | Integer özelliği değerini alır. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | Integer özelliği değerini alır. İstenen özellik yoksa, verilen varsayılan değeri döndürür. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | Kenar boşlukları özelliği değerini alır. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | Kenar boşlukları özelliği değerini alır. İstenen özellik yoksa, verilen varsayılan değeri döndürür. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | Matris özelliği değerini alır. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Matris özelliği değerini alır. İstenen özellik yoksa, verilen varsayılan değeri döndürür. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | Dikdörtgen özelliği değerini alır. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | Dikdörtgen özelliği değerini alır. İstenen özellik yoksa, verilen varsayılan değeri döndürür. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | Boyut özelliği değerini alır. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | Boyut özelliği değerini alır. İstenen özellik yoksa, verilen varsayılan değeri döndürür. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | Dize dizisi özelliği değerini alır. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | Dize dizisi özelliği değerini alır. İstenen özellik yoksa, verilen varsayılan değeri döndürür. |
| virtual [IsProperty](./isproperty/)(System::String) | Boolean özelliği değerini alır. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | Boolean özelliği değerini alır. İstenen özellik yoksa, verilen varsayılan değeri döndürür. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | Özellik adlarını döndürür. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Özellikleri, varsayılanlarıyla birlikte bu [UserProperties](./) içine kopyalar. |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | Dize özelliği değerini ayarlar. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | Dize dizisi özelliği değerini ayarlar. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | Belirtilen özellikler tablosunda dize dizisi özelliği değerini ayarlar. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | Renk özelliği değerini ayarlar. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | Belirtilen özellikler tablosunda renk özelliği değerini ayarlar. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | Dikdörtgen özelliği değerini ayarlar. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | Belirtilen özellikler tablosunda dikdörtgen özelliği değerini ayarlar. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | Kenar boşlukları özelliği değerini ayarlar. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | Belirtilen özellikler tablosunda kenar boşlukları özelliği değerini ayarlar. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | Boyut özelliği değerini ayarlar. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | Belirtilen özellikler tablosunda boyut özelliği değerini ayarlar. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | Tam sayı özelliği değerini ayarlar. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | Belirtilen özellikler tablosunda tam sayı özelliği değerini ayarlar. |
| virtual [SetProperty](./setproperty/)(System::String, double) | Double özelliği değerini ayarlar. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | Belirtilen özellikler tablosunda double özelliği değerini ayarlar. |
| virtual [SetProperty](./setproperty/)(System::String, float) | Float özelliği değerini ayarlar. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | Belirtilen özellikler tablosunda float özelliği değerini ayarlar. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | Boolean özelliği değerini ayarlar. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | Belirtilen özellikler tablosunda boolean özelliği değerini ayarlar. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Matris özelliği değerini ayarlar. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Belirtilen özellikler tablosunda matris özelliği değerini ayarlar. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir işaretçi olarak ayarla (paylaşılan yerine). Kapsayıcılardaki işaretçilerin zayıf moda geçişine izin verir. |
| [UserProperties](./userproperties/)() | [UserProperties](./) sınıfının boş bir örneğini başlatır. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | [UserProperties](./) sınıfının varsayılan değerlerle bir örneğini başlatır. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | [UserProperties](./) sınıfını varsayılanlar ve altVarsayılanlar tabloları ile oluşturur; bunlar bu sırayla aranır. |
## Ayrıca Bakınız

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
