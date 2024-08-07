---
title: Alt Küme Stratejisini Kullanarak Yazı Tiplerini Gömme
linktitle: Alt Küme Stratejisini Kullanarak Yazı Tiplerini Gömme
second_title: Aspose.PDF for .NET API Referansı
description: Aspose.PDF for .NET kullanarak Alt Küme Stratejisi ile bir PDF dosyasına yazı tiplerini nasıl gömeceğinizi öğrenin. Yalnızca gerekli karakterleri ekleyerek PDF boyutunuzu optimize edin.
type: docs
weight: 130
url: /tr/net/programming-with-document/embedfontsusingsubsetstrategy/
---

Bu öğreticide, Aspose.PDF for .NET kullanarak bir altküme stratejisiyle bir PDF dosyasına yazı tiplerinin nasıl gömüleceğini tartışacağız. Aspose.PDF for .NET, geliştiricilerin PDF belgelerini program aracılığıyla oluşturmasına, düzenlemesine ve işlemesine olanak sağlayan güçlü bir kitaplıktır. Yazı tiplerini bir PDF dosyasına gömmek, gerekli yazı tiplerinin bu cihazlarda yüklü olup olmadığına bakılmaksızın, belgenin farklı cihazlarda doğru şekilde görüntülenmesini sağlamak için önemli bir adımdır.

## 1. Adım: Yeni bir C# Konsol Uygulaması oluşturun
Başlamak için Visual Studio'da yeni bir C# Konsol Uygulaması oluşturun. Adını ne istersen koyabilirsin. Proje oluşturulduktan sonra Aspose.PDF for .NET kitaplığına bir referans eklemeniz gerekir.

## Adım 2: Aspose.PDF Ad Alanını İçeri Aktarın
Aspose.PDF ad alanını içe aktarmak için C# dosyanızın en üstüne aşağıdaki kod satırını ekleyin:

```csharp
using Aspose.Pdf;
```

## 3. Adım: Mevcut bir PDF Dosyasını Yükleyin
Yazı tiplerini mevcut bir PDF dosyasına gömmek için bu dosyayı Document sınıfını kullanarak yüklemeniz gerekir. Aşağıdaki kod, mevcut bir PDF dosyasının nasıl yükleneceğini gösterir:

```csharp
// Belgeler dizininin yolu.
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Mevcut bir PDF dosyasını yükleyin
Document doc = new Document(dataDir + "input.pdf");
```

## 4. Adım: Yazı Tiplerini Alt Küme Stratejisiyle Yerleştirin
Aspose.PDF for .NET, yazı tipi gömme için iki strateji sunar: SubsetAllFonts ve SubsetEmbeddedFontsOnly.

SubsetAllFonts stratejisi, belgedeki tüm yazı tiplerini bir alt küme olarak katıştıracaktır. Bir alt küme, yazı tipinin yalnızca belgede kullanılan karakterleri içeren bir bölümüdür. Bu strateji, PDF belgesinin dosya boyutunu küçültmek için kullanışlıdır.

SubsetEmbeddedFontsOnly stratejisi, yalnızca belgede zaten gömülü olan yazı tiplerinin alt kümesini katıştıracaktır. Bir yazı tipi gömülü değilse, bu stratejiden etkilenmeyecektir.

Aşağıdaki kod, yazı tiplerinin bir alt küme stratejisiyle bir PDF dosyasına nasıl gömüleceğini gösterir:

```csharp
// SubsetAllFonts durumunda tüm yazı tipleri belgeye alt küme olarak gömülecektir.
doc.FontUtilities.SubsetFonts(FontSubsetStrategy.SubsetAllFonts);

// Yazı tipi alt kümesi, tamamen gömülü yazı tipleri için gömülecektir ancak belgeye gömülmemiş yazı tipleri etkilenmeyecektir.
doc.FontUtilities.SubsetFonts(FontSubsetStrategy.SubsetEmbeddedFontsOnly);
```

## Adım 5: PDF Belgesini Kaydedin
PDF dosyasındaki tüm yazı tiplerini bir alt küme stratejisiyle gömdükten sonra, belgeyi kaydetmeniz gerekir. Aşağıdaki kod, PDF dosyasının nasıl kaydedileceğini gösterir:

```csharp
doc.Save(dataDir + "Output_out.pdf");
```

### Aspose.PDF for .NET kullanarak alt küme stratejisiyle yazı tiplerini gömmek için örnek kaynak kodu. 

```csharp

            
            // Belgeler dizininin yolu.
            string dataDir = "YOUR DOCUMENT DIRECTORY";
            Document doc = new Document(dataDir + "input.pdf");
            // SubsetAllFonts durumunda tüm yazı tipleri belgeye alt küme olarak gömülecektir.
            doc.FontUtilities.SubsetFonts(FontSubsetStrategy.SubsetAllFonts);
            // Yazı tipi alt kümesi, tamamen gömülü yazı tipleri için gömülecektir ancak belgeye gömülmemiş yazı tipleri etkilenmeyecektir.
            doc.FontUtilities.SubsetFonts(FontSubsetStrategy.SubsetEmbeddedFontsOnly);
            doc.Save(dataDir + "Output_out.pdf");
            

        
```

## Çözüm
Bu makalede, Aspose.PDF for .NET kullanarak bir alt küme stratejisiyle bir PDF dosyasına yazı tiplerinin nasıl gömüleceğini tartıştık. Aspose.PDF for .NET, farklı stratejilerle yazı tipi ekleme ve gömme de dahil olmak üzere PDF belgeleriyle çalışmak için basit ve kullanımı kolay bir API sağlar. Yazı tiplerini bir PDF dosyasına gömmek, belgenin farklı cihazlarda doğru şekilde görüntülenmesini sağlamak için önemli bir adımdır ve alt küme stratejisi, PDF belgesinin dosya boyutunu küçültmek için kullanışlı bir özelliktir.

