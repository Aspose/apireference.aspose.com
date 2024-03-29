---
title: FontInfo.Panose
linktitle: Panose
articleTitle: Panose
second_title: Aspose.Words for .NET
description: FontInfo Panose mülk. PANOSE yazı tipi sınıflandırma numarasını alır veya ayarlar C#'da.
type: docs
weight: 60
url: /tr/net/aspose.words.fonts/fontinfo/panose/
---
## FontInfo.Panose property

PANOSE yazı tipi sınıflandırma numarasını alır veya ayarlar.

```csharp
public byte[] Panose { get; set; }
```

## Notlar

PANOSE, bir yazı tipinin kontrast, ağırlık ve serif stili gibi gibi kritik görsel özelliklerinin 10 baytlık kompakt bir açıklamasıdır. Rakamlar Aile Türü, Serif Stili, Ağırlık, Oran, Kontrast, Kontur Değişikliği, Kol Stili, Harf Biçimi, Orta Çizgi ve X Yüksekliğini temsil eder.

Olabilir`hükümsüz`.

## Örnekler

Bir belgedeki her yazı tipinin ayrıntılarına nasıl erişileceğini ve yazdırılacağını gösterir.

```csharp
Document doc = new Document(MyDir + "Document.docx");

IEnumerator<FontInfo> fontCollectionEnumerator = doc.FontInfos.GetEnumerator();
while (fontCollectionEnumerator.MoveNext())
{
    FontInfo fontInfo = fontCollectionEnumerator.Current;
    if (fontInfo != null)
    {
        Console.WriteLine("Font name: " + fontInfo.Name);

        // Alternatif adlar genellikle boştur.
        Console.WriteLine("Alt name: " + fontInfo.AltName);
        Console.WriteLine("\t- Family: " + fontInfo.Family);
        Console.WriteLine("\t- " + (fontInfo.IsTrueType ? "Is TrueType" : "Is not TrueType"));
        Console.WriteLine("\t- Pitch: " + fontInfo.Pitch);
        Console.WriteLine("\t- Charset: " + fontInfo.Charset);
        Console.WriteLine("\t- Panose:");
        Console.WriteLine("\t\tFamily Kind: " + fontInfo.Panose[0]);
        Console.WriteLine("\t\tSerif Style: " + fontInfo.Panose[1]);
        Console.WriteLine("\t\tWeight: " + fontInfo.Panose[2]);
        Console.WriteLine("\t\tProportion: " + fontInfo.Panose[3]);
        Console.WriteLine("\t\tContrast: " + fontInfo.Panose[4]);
        Console.WriteLine("\t\tStroke Variation: " + fontInfo.Panose[5]);
        Console.WriteLine("\t\tArm Style: " + fontInfo.Panose[6]);
        Console.WriteLine("\t\tLetterform: " + fontInfo.Panose[7]);
        Console.WriteLine("\t\tMidline: " + fontInfo.Panose[8]);
        Console.WriteLine("\t\tX-Height: " + fontInfo.Panose[9]);
    }
}
```

### Ayrıca bakınız

* class [FontInfo](../)
* ad alanı [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* toplantı [Aspose.Words](../../../)
