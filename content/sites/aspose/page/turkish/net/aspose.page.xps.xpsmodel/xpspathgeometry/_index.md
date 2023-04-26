---
title: Class XpsPathGeometry
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry sınıf. Sınıfı PathGeometry özellik öğesi özelliklerini içerir. Bu öğe Figures özniteliğiyle veya bir alt Path Figure öğesiyle belirtilen bir dizi yol figürü içerir.
type: docs
weight: 3280
url: /tr/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

Sınıfı, PathGeometry özellik öğesi özelliklerini içerir. Bu öğe, Figures özniteliğiyle veya bir alt Path Figure öğesiyle belirtilen bir dizi yol figürü içerir.

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | Geometrik şekillerin kesişen alanlarının bir bölge oluşturmak için nasıl birleştirildiğini belirten değeri döndürür/ayarlar. |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | Alt yol rakamlarının listesini döndürür. |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | Doldurma, kırpma veya vuruş için kullanılmadan önce yol geometrisinin tüm alt ve alt öğelerine uygulanan yerel matris dönüştürme 'yi kuran afin dönüşüm matrisini döndürür/ayarlar. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | Son pah rakamının alt segmentleri listesine bir yol segmenti ekler. |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | Bu yol geometrisini kopyalar. |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | adresindeki son yol rakamının alt segmentleri listesine bir yol segmenti ekler.*index* pozisyon. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | Son yol şeklinin alt segmentleri listesinden bir yol segmentini kaldırır. |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | adresindeki son yol rakamının alt segmentleri listesinden bir yol segmentini kaldırır.*index* pozisyon. |

### Ayrıca bakınız

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* ad alanı [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* toplantı [Aspose.Page](../../)


