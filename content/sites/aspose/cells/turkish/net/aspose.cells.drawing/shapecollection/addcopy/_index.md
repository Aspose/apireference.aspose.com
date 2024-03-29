---
title: AddCopy
second_title: Aspose.Cells for .NET API Referansı
description: Çalışma sayfasına bir şekil ekler ve kopyalar.
type: docs
weight: 90
url: /tr/net/aspose.cells.drawing/shapecollection/addcopy/
---
## ShapeCollection.AddCopy method

Çalışma sayfasına bir şekil ekler ve kopyalar.

```csharp
public Shape AddCopy(Shape sourceShape, int upperLeftRow, int top, int upperLeftColumn, int left)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| sourceShape | Shape | Kaynak şekli. |
| upperLeftRow | Int32 | Sol üst satır dizini. |
| top | Int32 | Piksel biriminde, sol satırından onay kutusunun dikey uzaklığını temsil eder. |
| upperLeftColumn | Int32 | Sol üst sütun dizini. |
| left | Int32 | Metin kutusunun sol sütunundan piksel birimi cinsinden yatay uzaklığını temsil eder. |

### Geri dönüş değeri

Yeni şekil nesnesi dizini.

### Örnekler

```csharp

[C#]
//şekil ekle
RectangleShape rectangle = shapes.AddRectangle(2, 0, 2, 0, 130, 130);
//kopyala
shapes.AddCopy(rectangle, 7, 0, 7, 0);
```

### Ayrıca bakınız

* class [Shape](../../shape)
* class [ShapeCollection](../../shapecollection)
* ad alanı [Aspose.Cells.Drawing](../../shapecollection)
* toplantı [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
