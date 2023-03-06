---
title: Class SimpleLabeling
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling sınıf. Basit bir etiketleme etiketi her özelliğin üzerine yerleştirir.
type: docs
weight: 1700
url: /tr/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

Basit bir etiketleme, etiketi her özelliğin üzerine yerleştirir.

```csharp
public class SimpleLabeling : Labeling
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | Yeni bir örneğini başlatır.`SimpleLabeling` sınıf. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | Yeni bir örneğini başlatır.`SimpleLabeling` sınıf. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | Yeni bir örneğini başlatır.`SimpleLabeling` sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | Bir özelliği işlemeden önce bu etiketlemeyi yapılandırmak için kullanılan bir geri arama. |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | Metnin rengini belirler. |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | Metni işlemek için kullanılacak yazı tipi ailesi. Varsayılan, sisteme bağlı değerdir. |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | Metnin boyutu. |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | Metne uygulanacak stil. |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | Özellik geometrisini, etiketleme için değiştirilmiş bir geometriyle değiştirmenin bir yolunu sağlar. Bu geri çağırma, bundan sonraki ilk çağrılır[`FeatureBasedConfiguration`](./featurebasedconfiguration/) . Varsayılan değer`null` (olduğu gibi özellik geometrisini kullanın). |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | Metnin etrafındaki halenin (vuruş) rengi. |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | Metnin etrafındaki halenin (vuruş) boyutu. |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | Etiketlerin kaynağı olarak kullanılacak öznitelik adı. yoksayıldıysa[`LabelExpression`](./labelexpression/) set. Her ikisi de[`LabelAttribute`](./labelattribute/) veya[`LabelExpression`](./labelexpression/) oluşturulmadan önce ayarlanmalıdır; InvalidOperationException aksi takdirde atılır. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | Etiket metnini özelleştirmek ve biçimlendirmek için bir yol sağlar. Ayarlanırsa, geçersiz kılmalar[`LabelAttribute`](./labelattribute/) . Her ikisi de[`LabelAttribute`](./labelattribute/) veya[`LabelExpression`](./labelexpression/) oluşturulmadan önce ayarlanmalıdır; InvalidOperationException aksi takdirde atılır. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | Çok parçalı geometriler için işleme davranışını belirtir. varsayılanAll . |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | Etiket yerleşimi, etiketlerin özelliğin geometrilerine göre nasıl yerleştirildiğini belirtir. |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | Başka bir etiketle çakışması durumunda bu etiketin önceliğini belirtir. Daha düşük önceliğe sahip etiket işlenmez. Varsayılan değer 1000. 'dir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | Bu örneği klonlar. |

### Ayrıca bakınız

* class [Labeling](../labeling/)
* ad alanı [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* toplantı [Aspose.GIS](../../)


