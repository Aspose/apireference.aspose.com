---
title: ShapeBase.AlternativeText
linktitle: AlternativeText
articleTitle: AlternativeText
second_title: Aspose.Words for .NET
description: ShapeBase AlternativeText mülk. Grafik yerine görüntülenecek alternatif metni tanımlar C#'da.
type: docs
weight: 20
url: /tr/net/aspose.words.drawing/shapebase/alternativetext/
---
## ShapeBase.AlternativeText property

Grafik yerine görüntülenecek alternatif metni tanımlar.

```csharp
public string AlternativeText { get; set; }
```

## Notlar

Varsayılan değer boş bir dizedir.

## Örnekler

Bir şeklin alternatif metninin nasıl kullanılacağını gösterir.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
Shape shape = builder.InsertShape(ShapeType.Cube, 150, 150);
shape.Name = "MyCube";

shape.AlternativeText = "Alt text for MyCube.";

// Bir şeklin alternatif metnine sağ tıklayarak ve ardından "Otomatik Şekil Biçimlendir" -> aracılığıyla erişebiliriz. "Alternatif Metin".
doc.Save(ArtifactsDir + "Shape.AltText.docx");

// Belgeyi HTML'ye kaydedin ve ardından şeklimize ait bağlantılı görüntüyü silin.
// HTML'mizi okuyan tarayıcı, eksik görselin yerine alternatif metni görüntüleyecektir.
doc.Save(ArtifactsDir + "Shape.AltText.html");
File.Delete(ArtifactsDir + "Shape.AltText.001.png");
```

### Ayrıca bakınız

* class [ShapeBase](../)
* ad alanı [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* toplantı [Aspose.Words](../../../)
