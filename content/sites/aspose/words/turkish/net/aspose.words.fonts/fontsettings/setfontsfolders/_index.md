---
title: FontSettings.SetFontsFolders
linktitle: SetFontsFolders
articleTitle: SetFontsFolders
second_title: Aspose.Words for .NET
description: FontSettings SetFontsFolders yöntem. Aspose.Wordsün belgeleri oluştururken veya yazı tiplerini gömerken TrueType yazı tiplerini arayacağı klasörleri ayarlar C#'da.
type: docs
weight: 90
url: /tr/net/aspose.words.fonts/fontsettings/setfontsfolders/
---
## FontSettings.SetFontsFolders method

Aspose.Words'ün belgeleri oluştururken veya yazı tiplerini gömerken TrueType yazı tiplerini arayacağı klasörleri ayarlar.

```csharp
public void SetFontsFolders(string[] fontsFolders, bool recursive)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| fontsFolders | String[] | TrueType yazı tiplerini içeren bir dizi klasör. |
| recursive | Boolean | Yazı tipleri için belirtilen klasörleri yinelemeli olarak taramak için True. |

## Notlar

Aspose.Words varsayılan olarak sistemde yüklü olan yazı tiplerini arar.

Bu özelliğin ayarlanması önceden yüklenen tüm yazı tiplerinin önbelleğini sıfırlar.

## Örnekler

Birden çok yazı tipi kaynağı dizininin nasıl ayarlanacağını gösterir.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Font.Name = "Amethysta";
builder.Writeln("The quick brown fox jumps over the lazy dog.");
builder.Font.Name = "Junction Light";
builder.Writeln("The quick brown fox jumps over the lazy dog.");

// Yazı tipi kaynaklarımız bu belgede metin için kullandığımız yazı tipini içermiyor.
// Bu belgeyi render ederken bu font ayarlarını kullanırsak,
// Aspose.Words, Aspose.Words'ün bulamadığı bir yazı tipine sahip metne bir yedek yazı tipi uygulayacaktır.
FontSourceBase[] originalFontSources = FontSettings.DefaultInstance.GetFontsSources();

Assert.AreEqual(1, originalFontSources.Length);
Assert.True(originalFontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Arial"));

// Varsayılan yazı tipi kaynaklarında bu belgede kullandığımız iki yazı tipi eksik.
Assert.False(originalFontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Amethysta"));
Assert.False(originalFontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Junction Light"));

// İlk argüman olarak ilettiğimiz her font dizininden bir font kaynağı oluşturmak için "SetFontsFolders" yöntemini kullanın.
// Dizinlerdeki tüm yazı tipi dosyalarından yazı tiplerini dahil etmek için "özyinelemeli" argüman olarak "yanlış"ı iletin
// ilk argümanda aktarıyoruz ancak dizinlerin alt klasörlerinden herhangi bir yazı tipini dahil etmiyoruz.
// İlettiğimiz dizinlerdeki tüm yazı tipi dosyalarını dahil etmek için "özyinelemeli" argüman olarak "doğru"yu iletin
// ilk argümanda ve ayrıca alt dizinlerindeki tüm yazı tiplerinde.
FontSettings.DefaultInstance.SetFontsFolders(new[] {FontsDir + "/Amethysta", FontsDir + "/Junction"},
    recursive);

FontSourceBase[] newFontSources = FontSettings.DefaultInstance.GetFontsSources();

Assert.AreEqual(2, newFontSources.Length);
Assert.False(newFontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Arial"));
Assert.AreEqual(1, newFontSources[0].GetAvailableFonts().Count);
Assert.True(newFontSources[0].GetAvailableFonts().Any(f => f.FullFontName == "Amethysta"));

// "Junction" klasörünün kendisi yazı tipi dosyası içermez, ancak yazı tipi dosyası içeren alt klasörlere sahiptir.
if (recursive)
{
    Assert.AreEqual(6, newFontSources[1].GetAvailableFonts().Count);
    Assert.True(newFontSources[1].GetAvailableFonts().Any(f => f.FullFontName == "Junction Light"));
}
else
{
    Assert.AreEqual(0, newFontSources[1].GetAvailableFonts().Count);
}

doc.Save(ArtifactsDir + "FontSettings.SetFontsFolders.pdf");

// Orijinal yazı tipi kaynaklarını geri yükleyin.
FontSettings.DefaultInstance.SetFontsSources(originalFontSources);
```

### Ayrıca bakınız

* class [FontSettings](../)
* ad alanı [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* toplantı [Aspose.Words](../../../)
