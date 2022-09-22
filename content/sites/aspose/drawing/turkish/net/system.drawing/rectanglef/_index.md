---
title: RectangleF
second_title: Aspose.Drawing for .NET API Referansı
description: Bir dikdörtgenin konumunu ve boyutunu temsil eden dört kayan noktalı sayı kümesini depolar. Daha gelişmiş bölge işlevleri için bir Region nesnesi kullanın.
type: docs
weight: 1050
url: /tr/net/system.drawing/rectanglef/
---
## RectangleF structure

Bir dikdörtgenin konumunu ve boyutunu temsil eden dört kayan noktalı sayı kümesini depolar. Daha gelişmiş bölge işlevleri için bir Region nesnesi kullanın.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [RectangleF](rectanglef#constructor_1)(PointF, SizeF) | Belirtilen konum ve boyutla RectangleF yapısının yeni bir örneğini başlatır. |
| [RectangleF](rectanglef#constructor)(float, float, float, float) | Belirtilen konum ve boyutla RectangleF yapısının yeni bir örneğini başlatır. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom) { get; } | Bu RectangleF yapısının Y ve Yüksekliğinin toplamı olan y koordinatını alır. |
| [Height](../../system.drawing/rectanglef/height) { get; set; } | Bu RectangleF yapısının yüksekliğini alır veya ayarlar. |
| [IsEmpty](../../system.drawing/rectanglef/isempty) { get; } | olup olmadığını gösteren bir değer alır.Width veyaHeight Bunun property RectangleFsıfır değerine sahiptir. |
| [Left](../../system.drawing/rectanglef/left) { get; } | Bu RectangleF yapısının sol kenarının x koordinatını alır. |
| [Location](../../system.drawing/rectanglef/location) { get; set; } | Bunun sol üst köşesinin koordinatlarını alır veya ayarlarRectangleF yapı. |
| [Right](../../system.drawing/rectanglef/right) { get; } | Bu RectangleF yapısının X ve Genişliğinin toplamı olan x koordinatını alır. |
| [Size](../../system.drawing/rectanglef/size) { get; set; } | Bunun boyutunu alır veya ayarlarRectangleF . |
| [Top](../../system.drawing/rectanglef/top) { get; } | Bu RectangleF yapısının üst kenarının y koordinatını alır. |
| [Width](../../system.drawing/rectanglef/width) { get; set; } | Bu RectangleF yapısının genişliğini alır veya ayarlar. |
| [X](../../system.drawing/rectanglef/x) { get; set; } | Bu RectangleF yapısının sol üst köşesinin x koordinatını alır veya ayarlar. |
| [Y](../../system.drawing/rectanglef/y) { get; set; } | Bu RectangleF yapısının sol üst köşesinin x koordinatını alır veya ayarlar. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb)(float, float, float, float) | Belirtilen konumlarda sol üst köşesi ve sağ alt köşesi olan bir RectangleF yapısı oluşturur. |
| static [Inflate](../../system.drawing/rectanglef/inflate)(RectangleF, float, float) | Belirtilen öğenin şişirilmiş bir kopyasını oluşturur ve döndürürRectangleF Structure. Kopya belirtilen miktar kadar şişirilir. Orijinal dikdörtgen değiştirilmeden kalır. |
| static [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF, RectangleF) | Bir döndürürRectangleF iki dikdörtgenin kesişimini temsil eden yapı. Kavşak yoksa ve boşsaRectangleF döndürülür. |
| static [Union](../../system.drawing/rectanglef/union)(RectangleF, RectangleF) | Bir birleşim oluşturan iki dikdörtgenin her ikisini de içerebilen olası en küçük üçüncü dikdörtgeni oluşturur. |
| [Contains](../../system.drawing/rectanglef/contains#contains_1)(PointF) | Belirtilen noktanın bunun içinde bulunup bulunmadığını belirler.RectangleF yapı. |
| [Contains](../../system.drawing/rectanglef/contains#contains_2)(RectangleF) | ile temsil edilen dikdörtgen bölgenin*rect* tamamen bunun içindedirRectangleF yapı. |
| [Contains](../../system.drawing/rectanglef/contains#contains)(float, float) | Belirtilen noktanın bunun içinde bulunup bulunmadığını belirler.RectangleF yapı. |
| override [Equals](../../system.drawing/rectanglef/equals#equals_1)(object) | BelirtilenObject , bu örneğe eşittir. |
| [Equals](../../system.drawing/rectanglef/equals#equals)(RectangleF) | Diğer olup olmadığını test eder[`RectangleF`](../rectanglef) yapı bununla aynı yere ve boyuta sahip[`RectangleF`](../rectanglef) yapı. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode)() | Bu örnek için bir karma kod döndürür. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate_1)(SizeF) | Bunu şişirirRectangleF belirtilen miktarda. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate)(float, float) | Bunu şişirirRectangleF belirtilen miktara göre yapı. |
| [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF) | Bunu değiştirirRectangleF kendisinin ve belirtilen 'nin kesişimiyle yapıRectangleF yapı. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith)(RectangleF) | Bu dikdörtgenin aşağıdakilerle kesişip kesişmediğini belirler.*rect* . |
| [Offset](../../system.drawing/rectanglef/offset#offset_1)(PointF) | Belirtilen miktara göre bu dikdörtgenin konumunu ayarlar. |
| [Offset](../../system.drawing/rectanglef/offset#offset)(float, float) | Belirtilen miktara göre bu dikdörtgenin konumunu ayarlar. |
| override [ToString](../../system.drawing/rectanglef/tostring)() | Bunun özniteliklerini dönüştürür[`Rectangle`](../rectangle) insan tarafından okunabilir bir dizeye. |
| [operator ==](../../system.drawing/rectanglef/op_equality) | İki tane olup olmadığını test eder.RectangleF yapılar eşit konum ve boyuta sahiptir. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit) | Belirtilen Rectangle yapısını bir RectangleF yapısına dönüştürür. |
| [operator !=](../../system.drawing/rectanglef/op_inequality) | İki tane olup olmadığını test eder.RectangleF yapılar konum veya boyut bakımından farklılık gösterir. |

## Alanlar

| İsim | Tanım |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty) | Şunun bir örneğini temsil eder:RectangleF üyeleri başlatılmamış olan sınıf. |

### Ayrıca bakınız

* ad alanı [System.Drawing](../../system.drawing)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
