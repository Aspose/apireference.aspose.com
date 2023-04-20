---
title: Interface ITrueTypeFont
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Drawing.ITrueTypeFont arayüz. TrueType yazı tipiyle çalışmak için yöntemler bildirir.
type: docs
weight: 1510
url: /tr/net/aspose.svg.drawing/itruetypefont/
---
## ITrueTypeFont interface

TrueType yazı tipiyle çalışmak için yöntemler bildirir.

```csharp
public interface ITrueTypeFont
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [DataSize](../../aspose.svg.drawing/itruetypefont/datasize/) { get; } | Yazı tipi verilerinin boyutunu bytes cinsinden döndürür |
| [FamilyName](../../aspose.svg.drawing/itruetypefont/familyname/) { get; } | Yazı tipi ailesinin adını alın. |
| [FullFontName](../../aspose.svg.drawing/itruetypefont/fullfontname/) { get; } | Bu, "FamilyName" ve "SubFamilyName" kombinasyonu olmalıdır. İstisna: Yazı tipi "AltAileAdı" içinde belirtildiği gibi "Normal" ise, o zaman yalnızca "AileAdı" içinde bulunan aile adını kullanın. Yukarıdaki Tam yazı tipi adı tanımının bir istisnası, CFF OpenType yazı tipleri için Microsoft platform dizeleri içindir: bu durumda, Tam yazı tipi adı dizesi, CFF Adı INDEX. 'deki PostScript Yazı TipiAdı ile aynı olmalıdır |
| [SubFamilyName](../../aspose.svg.drawing/itruetypefont/subfamilyname/) { get; } | Yazı Tipi Alt ailesi adı, aynı Yazı Tipi Ailesi adına sahip bir gruptaki yazı tipini ayırt eder. Bunun stile (italik, eğik) ve ağırlığa (açık, kalın, siyah vb.) hitap ettiği varsayılır. Ağırlık veya stil açısından belirli farkları olmayan bir yazı tipi (örn. orta ağırlık, italik değil ve fsSelection bit 6 seti), bu konumda depolanan "Normal" dizesine sahip olmalıdır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [GetAscent](../../aspose.svg.drawing/itruetypefont/getascent/)(float) | Yükselişi puan olarak verir. |
| [GetData](../../aspose.svg.drawing/itruetypefont/getdata/)() | Akışı yazı tipi verileriyle açın. Çağıran, akışı elden çıkarmaktan sorumludur. |
| [GetDescent](../../aspose.svg.drawing/itruetypefont/getdescent/)(float) | İnişi puan olarak verir. |

### Ayrıca bakınız

* ad alanı [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* toplantı [Aspose.SVG](../../)


