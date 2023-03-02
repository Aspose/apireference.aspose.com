---
title: Class FeaturesSequence
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.FeaturesSequence sınıf. FeaturesSequence bir dizi vektör özelliğini temsil eder.
type: docs
weight: 170
url: /tr/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` bir dizi vektör özelliğini temsil eder.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | Buradaki özellikler için özel özniteliklerin koleksiyonunu alır[`VectorLayer`](../vectorlayer/) . |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | Bu özellik dizisinin uzamsal referans sistemini alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | Koleksiyon boyunca yinelenen bir numaralandırıcı döndürür. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | Bu katmanın uzamsal kapsamını alır. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | Unsur sırasını katmana kaydeder. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | Unsur sırasını katmana kaydeder. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | Unsur sırasını katmana kaydeder. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | Unsur sırasını katmana kaydeder. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | Unsurları geometri türüne göre ayırın. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | Özellik değeri sağlanan değere eşit olan özellikleri seçer. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | Özellik değeri sağlanan değerden daha büyük olan özellikleri seçer. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | Özellik değeri sağlanan değerden büyük veya ona eşit olan özellikleri seçer. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | Kapsama göre özellikleri filtreler. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | Unsurları, diğer unsurlar dizisindeki tüm geometrilerin birleşimine göre filtreler. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | Sağlanan geometriye göre unsurları filtreler. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | Özellik değeri sağlanan değere eşit olmayan özellikleri seçer. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | Özniteliği null değerine eşit olmayan özellikleri seçer. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | Özniteliği null değerine eşit olan özellikleri seçer. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | Nitelik ayarlı özellikleri seçer. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | Özellik değeri sağlanan değerden daha küçük olan özellikleri seçer. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | Özellik değeri sağlanan değerden küçük veya ona eşit olan özellikleri seçer. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | Belirtilen özniteliğin ayarlanmadığı özellikleri seçer. |

### Ayrıca bakınız

* class [Feature](../feature/)
* ad alanı [Aspose.Gis](../../aspose.gis/)
* toplantı [Aspose.GIS](../../)


