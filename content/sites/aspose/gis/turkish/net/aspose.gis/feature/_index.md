---
title: Class Feature
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Feature sınıf. Bir geometri ve kullanıcı tanımlı özniteliklerden oluşan bir coğrafi özellik.
type: docs
weight: 130
url: /tr/net/aspose.gis/feature/
---
## Feature class

Bir geometri ve kullanıcı tanımlı özniteliklerden oluşan bir coğrafi özellik.

```csharp
public class Feature
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | Özelliğin geometrisini alır veya ayarlar. Olamaz`null` , kullanmak[`Null`](../../aspose.gis.geometries/geometry/null/) eksik geometriyi belirtmek için. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | Başka bir özellikten özniteliklerin değerlerini kopyalar. |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | Bir niteliğin değerini alır. |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | Bir niteliğin değerini alır. |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | Bir özelliğin değerini alır veya[`DefaultValue`](../featureattribute/defaultvalue/) değer ayarlanmamışsa veya`hükümsüz` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | Bir özelliğin değerini alır veya[`DefaultValue`](../featureattribute/defaultvalue/) değer ayarlanmamışsa veya`hükümsüz` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | Bir özelliğin değerini alır veya[`DefaultValue`](../featureattribute/defaultvalue/) değer ayarlanmamışsa veya`hükümsüz` . |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | Bir dizideki tüm özniteliklerin değerlerini döndürür. |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | Bir dizideki tüm özniteliklerin değerlerini döndürür. Kullanmayı düşünün[`GetValues`](./getvalues/) ek bellek ayırmayı önleme yöntemi. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | Bir öznitelik dizisinin değerlerini bir liste olarak alır. |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | Belirtilen özniteliğin açıkça olarak ayarlanıp ayarlanmadığını belirler.`hükümsüz` değer. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | Bu özellikte özellik değerinin ayarlanıp ayarlanmadığını kontrol eder. |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | Bir özellik için yeni bir değer ayarlar. |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | Özniteliğin değerini şu şekilde ayarlar:`hükümsüz` . |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | Tüm nitelikler için yeni değerler ayarlar. Ayrıca kullanmayı düşünün[`CopyValues`](./copyvalues/) ayar değerlerini tek bir çağrıda düzene sokma yöntemi. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | Öznitelik değerini bu özellikten kaldırır. |

### Ayrıca bakınız

* ad alanı [Aspose.Gis](../../aspose.gis/)
* toplantı [Aspose.GIS](../../)


