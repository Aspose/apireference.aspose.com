---
title: ImageType
second_title: Aspose.Cells for .NET API Referansı
description: Resmin resim biçimini alır.
type: docs
weight: 60
url: /tr/net/aspose.cells.drawing/picture/imagetype/
---
## Picture.ImageType property

Resmin resim biçimini alır.

```csharp
public ImageType ImageType { get; }
```

### Örnekler

```csharp

[C#]
//Bir Çalışma Kitabı nesnesini başlatma
Workbook workbook = new Workbook();
Worksheet worksheet = workbook.Worksheets[0];
//ilk resmi ekle
int imgIndex1 = worksheet.Pictures.Add(1, 1, "1.png");
// Eklenen resim nesnesini al
Picture pic1 = worksheet.Pictures[imgIndex1];
if(pic1.ImageType == Aspose.Cells.Drawing.ImageType.Png)
{
    //Resmin türü png'dir.";
}
//ikinci resmi ekle
int imgIndex2 = worksheet.Pictures.Add(1, 9, "2.jpeg");
// Eklenen resim nesnesini al
Picture pic2 = worksheet.Pictures[imgIndex2];
if(pic2.ImageType == Aspose.Cells.Drawing.ImageType.Jpeg)
{
    //Resmin türü jpg.";
}
```

### Ayrıca bakınız

* enum [ImageType](../../imagetype)
* class [Picture](../../picture)
* ad alanı [Aspose.Cells.Drawing](../../picture)
* toplantı [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
