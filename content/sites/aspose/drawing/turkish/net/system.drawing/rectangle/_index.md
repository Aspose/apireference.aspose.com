---
title: Rectangle
second_title: Aspose.Drawing for .NET API Referansı
description: Bir dikdörtgenin konumunu ve boyutunu temsil eden dört tamsayı kümesini depolar.
type: docs
weight: 1040
url: /tr/net/system.drawing/rectangle/
---
## Rectangle structure

Bir dikdörtgenin konumunu ve boyutunu temsil eden dört tamsayı kümesini depolar.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Rectangle](rectangle#constructor_1)(Point, Size) | Yeni bir örneğini başlatır[`Rectangle`](../rectangle) belirtilen konum ve boyuta sahip yapı. |
| [Rectangle](rectangle#constructor)(int, int, int, int) | Belirtilen konum ve boyutla Rectangle yapısının yeni bir örneğini başlatır. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom) { get; } | Bu Dikdörtgen yapısının Y ve Yükseklik özellik değerlerinin toplamı olan y koordinatını alır. |
| [Height](../../system.drawing/rectangle/height) { get; set; } | Bu Rectangle yapısının yüksekliğini alır veya ayarlar. |
| [IsEmpty](../../system.drawing/rectangle/isempty) { get; } | Bunun tüm sayısal özelliklerinin olup olmadığını gösteren bir değer alır.[`Rectangle`](../rectangle) sıfır değerlerine sahip. |
| [Left](../../system.drawing/rectangle/left) { get; } | Bu Rectangle yapısının sol kenarının x koordinatını alır. |
| [Location](../../system.drawing/rectangle/location) { get; set; } | Bunun sol üst köşesinin koordinatlarını alır veya ayarlarRectangle yapı. |
| [Right](../../system.drawing/rectangle/right) { get; } | Bu Rectangle yapısının X ve Width özellik değerlerinin toplamı olan x koordinatını alır. |
| [Size](../../system.drawing/rectangle/size) { get; set; } | Bunun boyutunu alır veya ayarlarRectangle . |
| [Top](../../system.drawing/rectangle/top) { get; } | Bu Dikdörtgen yapısının üst kenarının y koordinatını alır. |
| [Width](../../system.drawing/rectangle/width) { get; set; } | Bu Rectangle yapısının genişliğini alır veya ayarlar. |
| [X](../../system.drawing/rectangle/x) { get; set; } | Bu Dikdörtgen yapısının sol üst köşesinin x koordinatını alır veya ayarlar. |
| [Y](../../system.drawing/rectangle/y) { get; set; } | Bu Dikdörtgen yapısının sol üst köşesinin y koordinatını alır veya ayarlar. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling)(RectangleF) | Belirtileni dönüştürürRectangleF bir yapıyaRectangle yuvarlatılarak yapıRectangleF değerleri bir sonraki daha yüksek tamsayı değerlerine bağlar. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb)(int, int, int, int) | BirRectangle belirtilen kenar konumlarına sahip yapı. |
| static [Inflate](../../system.drawing/rectangle/inflate)(Rectangle, int, int) | Bir[`Rectangle`](../rectangle) belirtilen miktar kadar şişirilir. |
| static [Intersect](../../system.drawing/rectangle/intersect)(Rectangle, Rectangle) | Üçte birini döndürürRectangle diğer iki kesişim öğesini temsil eden yapıRectangle yapılar. Kavşak yoksa boşRectangle döndürülür. |
| static [Round](../../system.drawing/rectangle/round)(RectangleF) | Belirtileni dönüştürürRectangleF birRectangle yuvarlayarak RectangleFen yakın tamsayı değerlerine değerler. |
| static [Truncate](../../system.drawing/rectangle/truncate)(RectangleF) | Belirtileni dönüştürürRectangleF birRectangle kısaltarakRectangleF değerler. |
| static [Union](../../system.drawing/rectangle/union)(Rectangle, Rectangle) | Rectangle ikisinin birleşimini içeren yapıRectangle yapılar. |
| [Contains](../../system.drawing/rectangle/contains#contains_1)(Point) | Belirtilen noktanın bunun içinde bulunup bulunmadığını belirler.Rectangle yapı. |
| [Contains](../../system.drawing/rectangle/contains#contains_2)(Rectangle) | ile temsil edilen dikdörtgen bölgenin*rect* tamamen bununla temsil edilen dikdörtgen bölge içinde yer alır.[`Rectangle`](../rectangle) . |
| [Contains](../../system.drawing/rectangle/contains#contains)(int, int) | Belirtilen noktanın bunun içinde bulunup bulunmadığını belirler.Rectangle yapı. |
| override [Equals](../../system.drawing/rectangle/equals#equals_1)(object) | Obj olup olmadığını test ederRectangle aynı yer ve büyüklükteki yapıRectangle yapı. |
| [Equals](../../system.drawing/rectangle/equals#equals)(Rectangle) | Diğer olup olmadığını test eder[`Rectangle`](../rectangle) yapı bununla aynı yere ve boyuta sahip[`Rectangle`](../rectangle) yapı. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode)() | Bunun için karma kodu döndürürRectangle yapı. Karma kodlarının kullanımı hakkında bilgi için bkz. GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate#inflate_1)(Size) | Bunu büyütürRectangle belirtilen miktarda. |
| [Inflate](../../system.drawing/rectangle/inflate#inflate)(int, int) | Bunu büyütürRectangle belirtilen miktarda. |
| [Intersect](../../system.drawing/rectangle/intersect)(Rectangle) | Bunu değiştirirRectanglekendisinin ve belirtilenin kesişimi ileRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith)(Rectangle) | Bu dikdörtgenin aşağıdakilerle kesişip kesişmediğini belirler.*rect* . |
| [Offset](../../system.drawing/rectangle/offset#offset_1)(Point) | Belirtilen miktara göre bu dikdörtgenin konumunu ayarlar. |
| [Offset](../../system.drawing/rectangle/offset#offset)(int, int) | Belirtilen miktara göre bu dikdörtgenin konumunu ayarlar. |
| override [ToString](../../system.drawing/rectangle/tostring)() | Bunun özniteliklerini dönüştürür[`Rectangle`](../rectangle) insan tarafından okunabilir bir dizeye. |
| [operator ==](../../system.drawing/rectangle/op_equality) | İki tane olup olmadığını test eder.Rectangle yapılar eşit konum ve boyuta sahiptir. |
| [operator !=](../../system.drawing/rectangle/op_inequality) | İki tane olup olmadığını test eder.Rectangle yapılar konum veya boyut bakımından farklılık gösterir. |

## Alanlar

| İsim | Tanım |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty) | BirRectangle özellikleri başlatılmamış halde bırakılan yapı. |

### Ayrıca bakınız

* ad alanı [System.Drawing](../../system.drawing)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
