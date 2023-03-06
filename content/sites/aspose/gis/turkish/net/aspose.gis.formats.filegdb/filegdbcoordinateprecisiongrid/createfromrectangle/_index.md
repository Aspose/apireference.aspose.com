---
title: FileGdbCoordinatePrecisionGrid.CreateFromRectangle
second_title: Aspose.GIS for .NET API Referansı
description: FileGdbCoordinatePrecisionGrid yöntem. Yeni oluştururFileGdbCoordinatePrecisionGrid öyle ki bir dikdörtgen içindeki tüm değerler temsil edilebilir.
type: docs
weight: 20
url: /tr/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/
---
## FileGdbCoordinatePrecisionGrid.CreateFromRectangle method

Yeni oluşturur`FileGdbCoordinatePrecisionGrid` öyle ki bir dikdörtgen içindeki tüm değerler temsil edilebilir.

```csharp
public static FileGdbCoordinatePrecisionGrid CreateFromRectangle(IPoint p1, IPoint p2)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| p1 | IPoint | Dikdörtgenin bir köşesi. |
| p2 | IPoint | Dikdörtgenin karşı köşesi. ile aynı boyutlara sahip olmalıdır.*p1*. |

### Geri dönüş değeri

`FileGdbCoordinatePrecisionGrid`öyle ki bir dikdörtgen içindeki tüm değerler temsil edilebilir. Dikdörtgenin dışındaki değerler temsil edilemez, bu nedenle FileGDB layer 'ye yazılacak tüm koordinatlar dikdörtgenin içinde olmalıdır.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null` . |
| ArgumentException | *p1* Ve*p2* boş olmayan geçerli bir dikdörtgen oluşturma: *p1* veya*p2* boş. HasZ'nin bayrakları*p1* 'HasZ' bayrağına eşit değil*p2* HasM' bayrakları*p1* 'HasM' bayrağına eşit değil*p2* X' koordinatı*p1* 'X' koordinatına eşittir*p2* Y' koordinatı*p1* 'Y' koordinatına eşittir*p2* Z' koordinatı*p1* 'Z' koordinatına eşittir*p2* M' koordinatı*p1* 'M' koordinatına eşittir*p2* herhangi bir koordinatNaN veya sonsuzluk. |

### Ayrıca bakınız

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [FileGdbCoordinatePrecisionGrid](../)
* ad alanı [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* toplantı [Aspose.GIS](../../../)


