---
title: ImageSaveOptions.Resolution
linktitle: Resolution
articleTitle: Resolution
second_title: Aspose.Words for .NET
description: ImageSaveOptions Resolution mülk. Oluşturulan görüntüler için inç başına nokta sayısı cinsinden hem yatay hem de dikey çözünürlüğü ayarlar C#'da.
type: docs
weight: 130
url: /tr/net/aspose.words.saving/imagesaveoptions/resolution/
---
## ImageSaveOptions.Resolution property

Oluşturulan görüntüler için inç başına nokta sayısı cinsinden hem yatay hem de dikey çözünürlüğü ayarlar.

```csharp
public float Resolution { set; }
```

## Notlar

Bu özellik yalnızca taramalı görüntü formatlarına kaydederken etkilidir.

## Örnekler

Bir belgeyi PNG'ye dönüştürürken çözünürlüğün nasıl belirleneceğini gösterir.

```csharp
Document doc = new Document();
            DocumentBuilder builder = new DocumentBuilder(doc);

            builder.Font.Name = "Times New Roman";
            builder.Font.Size = 24;
            builder.Writeln("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

            builder.InsertImage(ImageDir + "Logo.jpg");

            // Belgenin "Save" yöntemine aktarabileceğimiz bir "ImageSaveOptions" nesnesi oluşturun
            // bu yöntemin belgeyi bir görüntüye dönüştürme biçimini değiştirmek için.
            ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Png);

            // Belgeyi 72dpi çözünürlükte oluşturmak için "Çözünürlük" özelliğini "72" olarak ayarlayın.
            options.Resolution = 72;

            doc.Save(ArtifactsDir + "ImageSaveOptions.Resolution.72dpi.png", options);

            Assert.That(120000, Is.AtLeast(new FileInfo(ArtifactsDir + "ImageSaveOptions.Resolution.72dpi.png").Length));

#if NET48 || JAVA
            Image image = Image.FromFile(ArtifactsDir + "ImageSaveOptions.Resolution.72dpi.png");

            Assert.AreEqual(612, image.Width);
            Assert.AreEqual(792, image.Height);
#elif NET5_0_OR_GREATER || __MOBILE__
            using (SKBitmap image = SKBitmap.Decode(ArtifactsDir + "ImageSaveOptions.Resolution.72dpi.png")) 
            {
                Assert.AreEqual(612, image.Width);
                Assert.AreEqual(792, image.Height);
            }
#endif
            // Belgeyi 300dpi çözünürlükte oluşturmak için "Çözünürlük" özelliğini "300" olarak ayarlayın.
            options.Resolution = 300;

            doc.Save(ArtifactsDir + "ImageSaveOptions.Resolution.300dpi.png", options);

            Assert.That(700000, Is.LessThan(new FileInfo(ArtifactsDir + "ImageSaveOptions.Resolution.300dpi.png").Length));

#if NET48 || JAVA
            image = Image.FromFile(ArtifactsDir + "ImageSaveOptions.Resolution.300dpi.png");

            Assert.AreEqual(2550, image.Width);
            Assert.AreEqual(3300, image.Height);
#elif NET5_0_OR_GREATER || __MOBILE__
            using (SKBitmap image = SKBitmap.Decode(ArtifactsDir + "ImageSaveOptions.Resolution.300dpi.png")) 
            {
                Assert.AreEqual(2550, image.Width);
                Assert.AreEqual(3300, image.Height);
            }
#endif
```

### Ayrıca bakınız

* class [ImageSaveOptions](../)
* ad alanı [Aspose.Words.Saving](../../../aspose.words.saving/)
* toplantı [Aspose.Words](../../../)
