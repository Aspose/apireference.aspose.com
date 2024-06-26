---
title: Varsayılan Yazı Tipi Adını Ayarla
linktitle: Varsayılan Yazı Tipi Adını Ayarla
second_title: Aspose.PDF for .NET API Referansı
description: Aspose.PDF for .NET kullanarak PDF dosyasında varsayılan yazı tipi adını ayarlamak için adım adım kılavuz.
type: docs
weight: 270
url: /tr/net/document-conversion/set-default-font-name/
---
Bu eğitimde, Aspose.PDF for .NET kullanarak bir PDF dosyasında varsayılan yazı tipi adını nasıl ayarlayacağınızı göstereceğiz. Bazen bir PDF dosyasından görüntüleri ayıkladığınızda, eksik yazı tipi sorunlarıyla karşılaşabilirsiniz. Varsayılan bir yazı tipi adı belirterek, ayıklanan metnin doğru şekilde görüntülenmesini sağlayabilirsiniz. Bir PDF dosyasında varsayılan yazı tipi adını ayarlamak için aşağıdaki adımları izleyin.

## Önkoşullar
Başlamadan önce, aşağıdaki ön koşulları karşıladığınızdan emin olun:

- C# programlama dili hakkında temel bilgi.
- Sisteminizde kurulu .NET için Aspose.PDF kitaplığı.
- Visual Studio gibi bir geliştirme ortamı.

## 1. Adım: PDF belgesini yükleme
 İlk adım, PDF belgesini bir dosyaya yüklemektir.`Document` nesne. Aşağıdaki kodu kullanın:

```csharp
// Belgeler dizinine giden yol.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

using (Document pdfDocument = new Document(dataDir + "input.pdf"))
{
     // eklenecek kod
}
```

 değiştirdiğinizden emin olun`"YOUR DOCUMENTS DIRECTORY"` PDF dosyanızın bulunduğu gerçek dizinle.

## 2. Adım: Varsayılan yazı tipi adını ayarlayın
 Ardından, kullanarak varsayılan yazı tipi adını ayarlayacağız.`DefaultFontName` seçeneği`RenderingOptions` nesne. Aşağıdaki kodu kullanın:

```csharp
using (Document pdfDocument = new Document(dataDir + "input.pdf"))
{
     using (FileStream imageStream = new FileStream(dataDir + "SetDefaultFontName.png", FileMode.Create))
     {
         Resolution resolution = new Resolution(300);
         PngDevice pngDevice = new PngDevice(resolution);
         RenderingOptions ro = new RenderingOptions();
         ro.DefaultFontName = "Arial";
         pngDevice.RenderingOptions = ro;
        
         // eklenecek kod
     }
}
```

 değiştirdiğinizden emin olun`"Arial"` İstenen yazı tipi adıyla.

## 3. Adım: Görüntü Çıkarma
Ardından, görüntüyü PDF belgesinin belirtilen sayfasından çıkaracağız. Aşağıdaki kodu kullanın:

```csharp
pngDevice.Process(pdfDocument.Pages[1], imageStream);
```

 Doğru sayfa numarasını belirttiğinizden emin olun.`pdfDocument.Pages[1]`.

### Aspose.PDF for .NET kullanarak Varsayılan Yazı Tipi Adını Ayarlamak için örnek kaynak kodu

```csharp
// Belgeler dizininin yolu.
string dataDir = "YOUR DOCUMENT DIRECTORY";

using (Document pdfDocument = new Document(dataDir + "input.pdf"))
{
	using (FileStream imageStream = new FileStream(dataDir + "SetDefaultFontName.png", FileMode.Create))
	{
		Resolution resolution = new Resolution(300);
		PngDevice pngDevice = new PngDevice(resolution);
		RenderingOptions ro = new RenderingOptions();
		ro.DefaultFontName = "Arial";
		pngDevice.RenderingOptions = ro;
		pngDevice.Process(pdfDocument.Pages[1], imageStream);
	}
}
```

## Çözüm
Bu öğreticide, Aspose.PDF for .NET kullanarak bir PDF dosyasında varsayılan yazı tipi adının nasıl ayarlanacağını öğrendik. Varsayılan bir yazı tipi adı belirterek, ayıklanan metnin doğru şekilde görüntülenmesini sağlayabilirsiniz. PDF dosyalarından görüntüleri ayıklarken eksik yazı tipi sorunlarını çözmek için bu yöntemi kullanın.

### SSS

#### S: Aspose.PDF for .NET nedir?

Y: Aspose.PDF for .NET, geliştiricilerin C# uygulamalarında PDF belgeleriyle çalışmasını sağlayan güçlü bir kitaplıktır. Bir PDF dosyasında varsayılan yazı tipi adını ayarlamak dahil olmak üzere çeşitli işlevler sunar.

#### S: Neden bir PDF dosyasında varsayılan yazı tipi adını ayarlamam gerekiyor?

A: Varsayılan yazı tipi adının ayarlanması, bir PDF belgesinden metin ayıklanırken kullanışlıdır. PDF, çıkarma makinesinde bulunmayan yazı tiplerine sahip metin içeriyorsa, varsayılan bir yazı tipi adının belirtilmesi metnin doğru görüntülenmesini sağlar.

#### S: Aspose.PDF for .NET kullanarak bir PDF belgesini nasıl yükleyebilirim ve varsayılan yazı tipi adını nasıl ayarlayabilirim?

 Y: Bir PDF belgesi yüklemek ve varsayılan yazı tipi adını ayarlamak için`Document`PDF dosyasını yüklemek için sınıf ve`RenderingOptions.DefaultFontName` İstenen varsayılan yazı tipi adını belirtmek için özelliği.

#### S: Varsayılan yazı tipi adı olarak herhangi bir yazı tipini seçebilir miyim?

C:Evet, çıkartma makinesinde bulunan herhangi bir yazı tipini varsayılan yazı tipi adı olarak seçebilirsiniz. Doğru metin oluşturmayı sağlamak için orijinal PDF'deki eksik yazı tipleriyle yakından eşleşen bir yazı tipi kullanın.

#### S: Varsayılan yazı tipi adını ayarlamak, PDF dosyasında kalıcı bir değişiklik midir?

C: Hayır, Aspose.PDF for .NET kullanılarak varsayılan yazı tipi adının ayarlanması, metin çıkarma sırasında yapılan geçici bir değişikliktir. Orijinal PDF dosyasını değiştirmez.