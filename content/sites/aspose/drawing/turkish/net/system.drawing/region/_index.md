---
title: Region
second_title: Aspose.Drawing for .NET API Referansı
description: Dikdörtgenler ve yollardan oluşan bir grafik şeklinin içini tanımlar. Bu sınıf devralınamaz.
type: docs
weight: 1060
url: /tr/net/system.drawing/region/
---
## Region class

Dikdörtgenler ve yollardan oluşan bir grafik şeklinin içini tanımlar. Bu sınıf devralınamaz.

```csharp
public sealed class Region : IDisposable
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Region](region#constructor)() | Yeni bir örneğini başlatır[`Region`](../region) sınıf. |
| [Region](region#constructor_1)(GraphicsPath) | Yeni bir örneğini başlatır[`Region`](../region) belirtilen sınıfGraphicsPath . |
| [Region](region#constructor_3)(Rectangle) | Yeni bir örneğini başlatır[`Region`](../region) belirtilen sınıftanRectangle yapı. |
| [Region](region#constructor_4)(RectangleF) | Yeni bir örneğini başlatır[`Region`](../region) belirtilen sınıftanRectangleF yapı. |
| [Region](region#constructor_2)(RegionData) | Yeni bir örneğini başlatır[`Region`](../region) belirtilen verilerden sınıf. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Clone](../../system.drawing/region/clone)() | Bunun tam bir kopyasını oluştururRegion . |
| [Complement](../../system.drawing/region/complement#complement)(GraphicsPath) | Bunu güncellerRegion belirtilen kısmı içermekGraphicsPath bu, bununla kesişmez Region . |
| [Complement](../../system.drawing/region/complement#complement_1)(Rectangle) | Bunu güncellerRegion belirtilen kısmı içermekRectangle bununla kesişmeyen yapı Region . |
| [Complement](../../system.drawing/region/complement#complement_2)(RectangleF) | Bunu güncellerRegion belirtilen kısmı içermekRectangleF bununla kesişmeyen yapı Region . |
| [Complement](../../system.drawing/region/complement#complement_3)(Region) | Bunu güncellerRegion belirtilen kısmı içermekRegion bununla kesişmeyen Region . |
| [Dispose](../../system.drawing/region/dispose)() | Bunun kullandığı tüm kaynakları serbest bırakırRegion . |
| [Equals](../../system.drawing/region/equals#equals)(Region, Graphics) | BelirtilenRegion bununla aynıRegion belirtilen çizim yüzeyinde. |
| [Exclude](../../system.drawing/region/exclude#exclude)(GraphicsPath) | Bunu güncellerRegion yalnızca, belirtilen ile kesişmeyen iç kısmını içerecek şekildeGraphicsPath . |
| [Exclude](../../system.drawing/region/exclude#exclude_1)(Rectangle) | Bunu güncellerRegion yalnızca iç kısmının belirtilen ile kesişmeyen kısmını içermek içinRectangle yapı. |
| [Exclude](../../system.drawing/region/exclude#exclude_2)(RectangleF) | Bunu güncellerRegion yalnızca, belirtilen ile kesişmeyen iç kısmını içerecek şekildeRectangleF yapı. |
| [Exclude](../../system.drawing/region/exclude#exclude_3)(Region) | Bunu güncellerRegion yalnızca iç kısmının belirtilen ile kesişmeyen kısmını içermek içinRegion . |
| [GetBounds](../../system.drawing/region/getbounds)(Graphics) | RectangleFbunu sınırlayan bir dikdörtgeni temsil eden yapıRegion bir çizim yüzeyindeGraphics nesne. |
| [GetRegionData](../../system.drawing/region/getregiondata)() | Bir döndürürRegionData bunu açıklayan bilgileri temsil edenRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans)(Matrix) | Bir dizi döndürürRectangleF buna yakın yapılarRegion belirtilen matris dönüşümü uygulandıktan sonra. |
| [Intersect](../../system.drawing/region/intersect#intersect)(GraphicsPath) | Bunu güncellerRegion belirtilen ile kendisinin kesişimineGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect#intersect_1)(Rectangle) | Bunu güncellerRegion belirtilen ile kendisinin kesişimineRectangle yapı. |
| [Intersect](../../system.drawing/region/intersect#intersect_2)(RectangleF) | Bunu güncellerRegion belirtilen ile kendisinin kesişimineRectangleF yapı. |
| [Intersect](../../system.drawing/region/intersect#intersect_3)(Region) | Bunu güncellerRegion belirtilen ile kendisinin kesişimineRegion . |
| [IsEmpty](../../system.drawing/region/isempty)(Graphics) | Bunun olup olmadığını test ederRegion belirtilen çizim yüzeyinde boş bir iç kısım var. |
| [IsInfinite](../../system.drawing/region/isinfinite)(Graphics) | Bunun olup olmadığını test ederRegion belirtilen çizim yüzeyinde sonsuz bir iç kısma sahiptir. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_7)(Point) | BelirtilenPoint yapı bunun içinde yer alırRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_9)(PointF) | BelirtilenPointF yapı bunun içinde yer alırRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_11)(Rectangle) | Belirtilenin herhangi bir bölümününRectangle yapı this içinde yer alıyorRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_13)(RectangleF) | Belirtilenin herhangi bir bölümününRectangleF yapı bu içinde bulunurRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_3)(float, float) | Belirtilen noktanın bunun içinde olup olmadığını test eder.Region . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_8)(Point, Graphics) | BelirtilenPoint yapı bunun içinde yer alırRegion belirtilen kullanılarak çizildiğindeGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_10)(PointF, Graphics) | BelirtilenPointF yapı bunun içinde yer alırRegion belirtilen kullanılarak çizildiğindeGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_12)(Rectangle, Graphics) | Belirtilenin herhangi bir bölümününRectangle yapı bu içinde bulunurRegion belirtilen kullanılarak çizildiğindeGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_14)(RectangleF, Graphics) | Belirtilenin herhangi bir bölümününRectangleF yapı bu içinde bulunurRegion belirtilen kullanılarak çizildiğindeGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_6)(float, float, Graphics) | Belirtilen noktanın bunun içinde olup olmadığını test eder.Region belirtilen kullanılarak çizildiğindeGraphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_2)(int, int, Graphics) | Belirtilen noktanın bunun içinde olup olmadığını test eder.Region belirtilen kullanılarak çizildiğinde nesneGraphics nesne. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_4)(float, float, float, float) | Belirtilen dikdörtgenin herhangi bir bölümünün bunun içinde bulunup bulunmadığını test ederRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible)(int, int, int, int) | Belirtilen dikdörtgenin herhangi bir bölümünün bunun içinde bulunup bulunmadığını test ederRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_5)(float, float, float, float, Graphics) | Belirtilen dikdörtgenin herhangi bir bölümünün bunun içinde bulunup bulunmadığını test ederRegion belirtilen kullanılarak çizildiğindeGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_1)(int, int, int, int, Graphics) | Belirtilen dikdörtgenin herhangi bir bölümünün bunun içinde bulunup bulunmadığını test ederRegion belirtilen kullanılarak çizildiğinde Graphics . |
| [MakeEmpty](../../system.drawing/region/makeempty)() | Bunu başlatırRegion boş bir iç mekana. |
| [MakeInfinite](../../system.drawing/region/makeinfinite)() | Bunu başlatırRegion sonsuz bir iç mekana nesne. |
| [Transform](../../system.drawing/region/transform)(Matrix) | Bunu dönüştürürRegion belirtilen tarafındanMatrix . |
| [Translate](../../system.drawing/region/translate#translate_1)(float, float) | Bunun koordinatlarını ofsetlerRegion belirtilen miktarda. |
| [Translate](../../system.drawing/region/translate#translate)(int, int) | Bunun koordinatlarını ofsetlerRegion belirtilen miktarda. |
| [Union](../../system.drawing/region/union#union)(GraphicsPath) | Bunu güncellerRegion kendisinin ve belirtilenin birliğineGraphicsPath . |
| [Union](../../system.drawing/region/union#union_1)(Rectangle) | Bunu güncellerRegion kendisinin ve belirtilenin birliğineRectangle yapı. |
| [Union](../../system.drawing/region/union#union_2)(RectangleF) | Bunu güncellerRegion kendisinin ve belirtilenin birliğineRectangleF yapı. |
| [Union](../../system.drawing/region/union#union_3)(Region) | Bunu güncellerRegion kendisinin ve belirtilenin birliğineRegion . |
| [Xor](../../system.drawing/region/xor#xor)(GraphicsPath) | Bunu güncellerRegionbirliğe eksi belirtilen the ile kendisinin kesişimiGraphicsPath . |
| [Xor](../../system.drawing/region/xor#xor_1)(Rectangle) | Bunu güncellerRegionbirliğe eksi belirtilen the ile kendisinin kesişimiRectangle yapı. |
| [Xor](../../system.drawing/region/xor#xor_2)(RectangleF) | Bunu güncellerRegion birliğe eksi belirtilen ile kendisinin kesişimiRectangleF yapı. |
| [Xor](../../system.drawing/region/xor#xor_3)(Region) | Bunu güncellerRegionbirliğe eksi belirtilen the ile kendisinin kesişimiRegion . |

### Ayrıca bakınız

* ad alanı [System.Drawing](../../system.drawing)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
