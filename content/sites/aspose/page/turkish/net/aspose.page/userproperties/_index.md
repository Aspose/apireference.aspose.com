---
title: UserProperties
second_title: Aspose.Page for .NET API Referansı
description: Yazılan özelliklerin ayarlanmasına ve döndürülmesine izin veren özel özellik sınıfı. Ayrıca bu özellik nesnesi özelliği içermiyorsa iki varsayılan özellik nesnesi nin bağlanmasının aranmasına izin verir.
type: docs
weight: 260
url: /tr/net/aspose.page/userproperties/
---
## UserProperties class

Yazılan özelliklerin ayarlanmasına ve döndürülmesine izin veren özel özellik sınıfı. Ayrıca, bu özellik nesnesi özelliği içermiyorsa, iki varsayılan özellik nesnesi 'nin bağlanmasının aranmasına izin verir.

```csharp
public class UserProperties : Dictionary<string, object>
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [UserProperties](userproperties#constructor)() | UserProperties sınıfının boş bir örneğini başlatır. |
| [UserProperties](userproperties#constructor_1)(Dictionary&lt;string, object&gt;) | Varsayılan değerlerle bir UserProperties sınıfını başlatır. |
| [UserProperties](userproperties#constructor_2)(Dictionary&lt;string, object&gt;, Dictionary&lt;string, object&gt;) | Bu sırayla aranan bir defaults ve altDefaults tablosu, ile UserProperties oluşturur. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [Properties](../../aspose.page/userproperties/properties) { set; } | Varsayılanları da dahil olmak üzere özellikleri bu UserProperties içine kopyalar |

## yöntemler

| İsim | Tanım |
| --- | --- |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty#getproperty)(string) | Dize özellik değerini alır. |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty#getproperty_1)(string, string) | Dize özellik değerini alır. İstenen özellik yoksa, sağlanan varsayılan değeri döndürür. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor#getpropertycolor)(string) | Renk özelliği değerini alır. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor#getpropertycolor_1)(string, Color) | Renk özelliği değerini alır. İstenen özellik yoksa, sağlanan varsayılan değeri döndürür. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble#getpropertydouble)(string) | Çift özellik değeri alır. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble#getpropertydouble_1)(string, double) | Çift özellik değeri alır. İstenen özellik yoksa, sağlanan varsayılan değeri döndürür. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat#getpropertyfloat)(string) | Float özellik değerini alır. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat#getpropertyfloat_1)(string, float) | Float özellik değerini alır. İstenen özellik yoksa, sağlanan varsayılan değeri döndürür. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint#getpropertyint)(string) | Tamsayı özellik değerini alır. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint#getpropertyint_1)(string, int) | Tamsayı özellik değerini alır. İstenen özellik yoksa, sağlanan varsayılan değeri döndürür. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins#getpropertymargins)(string) | Kenar boşlukları özellik değerini alır. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins#getpropertymargins_1)(string, Margins) | Kenar boşlukları özellik değerini alır. İstenen özellik yoksa, sağlanan varsayılan değeri döndürür. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle#getpropertyrectangle)(string) | Dikdörtgen özellik değerini alır. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle#getpropertyrectangle_1)(string, RectangleF) | Dikdörtgen özellik değerini alır. İstenen özellik yoksa, sağlanan varsayılan değeri döndürür. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize#getpropertysize)(string) | Boyut özelliği değerini alır. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize#getpropertysize_1)(string, Size) | Boyut özelliği değerini alır. İstenen özellik yoksa, sağlanan varsayılan değeri döndürür. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray#getpropertystringarray)(string) | Dize dizisi özellik değerini alır. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray#getpropertystringarray_1)(string, string[]) | Dize dizisi özellik değerini alır. İstenen özellik yoksa, sağlanan varsayılan değeri döndürür. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty#isproperty)(string) | Boole özelliği değerini alır. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty#isproperty_1)(string, bool) | Boole özelliği değerini alır. İstenen özellik yoksa, sağlanan varsayılan değeri döndürür. |
| virtual [PropertyNames](../../aspose.page/userproperties/propertynames)() | Özellik adlarını döndürür. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_1)(string, bool) | Boole özelliği değerini ayarlar. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_5)(string, Color) | Renk özelliği değerini ayarlar. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_2)(string, double) | Çift özellik değerini ayarlar. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_4)(string, float) | Float özellik değerini ayarlar. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_3)(string, int) | Tamsayı özellik değerini ayarlar. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty)(string, Margins) | Kenar boşlukları özellik değerini ayarlar. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_6)(string, Rectangle) | Dikdörtgen özellik değerini ayarlar. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_7)(string, Size) | Boyut özelliği değerini ayarlar. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_8)(string, string) | Dize özellik değerini ayarlar. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_9)(string, string[]) | Dize dizisi özellik değerini ayarlar. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_1)(Dictionary&lt;string, object&gt;, string, bool) | Belirtilen özellikler tablosunda boole özelliği değerini ayarlar. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_5)(Dictionary&lt;string, object&gt;, string, Color) | Belirtilen özellikler tablosunda renk özelliği değerini ayarlar. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_2)(Dictionary&lt;string, object&gt;, string, double) | Belirtilen özellikler tablosunda çift özellik değerini ayarlar. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_4)(Dictionary&lt;string, object&gt;, string, float) | Belirtilen özellikler tablosunda kayan özellik değerini ayarlar. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_3)(Dictionary&lt;string, object&gt;, string, int) | Belirtilen özellikler tablosunda tamsayı özellik değerini ayarlar. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty)(Dictionary&lt;string, object&gt;, string, Margins) | Belirtilen özellikler tablosunda kenar boşlukları özellik değerini ayarlar. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_6)(Dictionary&lt;string, object&gt;, string, Rectangle) | Belirtilen özellikler tablosunda dikdörtgen özellik değerini ayarlar. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_7)(Dictionary&lt;string, object&gt;, string, Size) | Belirtilen özellikler tablosunda boyut özelliği değerini ayarlar. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_8)(Dictionary&lt;string, object&gt;, string, string[]) | Belirtilen özellikler tablosunda dize dizisi özellik değerini ayarlar. |

### Ayrıca bakınız

* ad alanı [Aspose.Page](../../aspose.page)
* toplantı [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
