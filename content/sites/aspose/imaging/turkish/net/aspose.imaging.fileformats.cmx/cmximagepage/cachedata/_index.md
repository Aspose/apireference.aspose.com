---
title: CacheData
second_title: Aspose.Imaging for .NET API Referansı
description: Önbellek kullanılamaz.
type: docs
weight: 80
url: /tr/net/aspose.imaging.fileformats.cmx/cmximagepage/cachedata/
---
## CmxImagePage.CacheData method

Önbellek kullanılamaz.

```csharp
public override void CacheData()
```

### Örnekler

Aşağıdaki örnek, bir CMX görüntüsünün tüm sayfalarının nasıl önbelleğe alınacağını gösterir.

```csharp
[C#]

string dir = "c:\\temp\\";

// Bir CMX dosyasından bir resim yükleyin.
using (Aspose.Imaging.FileFormats.Cmx.CmxImage image = (Aspose.Imaging.FileFormats.Cmx.CmxImage)Aspose.Imaging.Image.Load(dir + "sample.cmx"))
{
    // Bu çağrı yalnızca varsayılan sayfayı önbelleğe alır.
    image.CacheData();

    // Temel veri akışından ek veri yüklemesi gerçekleştirilmeyecek şekilde tüm sayfaları önbelleğe alın.
    foreach (Aspose.Imaging.FileFormats.Cmx.CmxImagePage page in image.Pages)
    {
        page.CacheData();
    }
}
```

### Ayrıca bakınız

* class [CmxImagePage](../../cmximagepage)
* ad alanı [Aspose.Imaging.FileFormats.Cmx](../../cmximagepage)
* toplantı [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
