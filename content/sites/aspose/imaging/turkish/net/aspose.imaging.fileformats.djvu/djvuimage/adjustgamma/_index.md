---
title: AdjustGamma
second_title: Aspose.Imaging for .NET API Referansı
description: Bir görüntünün gama düzeltmesi.
type: docs
weight: 170
url: /tr/net/aspose.imaging.fileformats.djvu/djvuimage/adjustgamma/
---
## AdjustGamma(float) {#adjustgamma}

Bir görüntünün gama düzeltmesi.

```csharp
public override void AdjustGamma(float gamma)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| gamma | Single | Kırmızı, yeşil ve mavi kanal katsayısı için gama |

### Örnekler

Aşağıdaki örnek, bir DJVU görüntüsünün gama düzeltmesini gerçekleştirir.

```csharp
[C#]

string dir = "c:\\temp\\";

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(dir + "sample.djvu"))
{
    Aspose.Imaging.FileFormats.Djvu.DjvuImage djvuImage = (Aspose.Imaging.FileFormats.Djvu.DjvuImage)image;

    // Kırmızı, yeşil ve mavi kanallar için gama katsayısını ayarlayın.
    djvuImage.AdjustGamma(2.5f);
    djvuImage.Save(dir + "sample.AdjustGamma.png", new Aspose.Imaging.ImageOptions.PngOptions());
}
```

### Ayrıca bakınız

* class [DjvuImage](../../djvuimage)
* ad alanı [Aspose.Imaging.FileFormats.Djvu](../../djvuimage)
* toplantı [Aspose.Imaging](../../../)

---

## AdjustGamma(float, float, float) {#adjustgamma_1}

Bir görüntünün gama düzeltmesi.

```csharp
public override void AdjustGamma(float gammaRed, float gammaGreen, float gammaBlue)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| gammaRed | Single | Kırmızı kanal katsayısı için gama |
| gammaGreen | Single | Yeşil kanal katsayısı için gama |
| gammaBlue | Single | Mavi kanal katsayısı için gama |

### Örnekler

Aşağıdaki örnek, renk bileşenleri için farklı katsayılar uygulayarak bir DJVU görüntüsünün gama düzeltmesini gerçekleştirir.

```csharp
[C#]

string dir = "c:\\temp\\";

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(dir + "sample.djvu"))
{
    Aspose.Imaging.FileFormats.Djvu.DjvuImage djvuImage = (Aspose.Imaging.FileFormats.Djvu.DjvuImage)image;

    // Kırmızı, yeşil ve mavi kanallar için ayrı gama katsayılarını ayarlayın.
    djvuImage.AdjustGamma(1.5f, 2.5f, 3.5f);
    djvuImage.Save(dir + "sample.AdjustGamma.png", new Aspose.Imaging.ImageOptions.PngOptions());
}
```

### Ayrıca bakınız

* class [DjvuImage](../../djvuimage)
* ad alanı [Aspose.Imaging.FileFormats.Djvu](../../djvuimage)
* toplantı [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
