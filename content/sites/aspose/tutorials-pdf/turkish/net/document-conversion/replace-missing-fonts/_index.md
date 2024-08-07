---
title: Eksik Yazı Tiplerini Değiştir
linktitle: Eksik Yazı Tiplerini Değiştir
second_title: Aspose.PDF for .NET API Referansı
description: Aspose.PDF for .NET kullanarak bir PDF dosyasındaki eksik yazı tiplerini değiştirmek için adım adım kılavuz.
type: docs
weight: 260
url: /tr/net/document-conversion/replace-missing-fonts/
---
Bu eğitimde, Aspose.PDF for .NET kullanarak bir PDF dosyasındaki eksik yazı tiplerini değiştirme sürecinde size yol göstereceğiz. Belirli bir yazı tipinin eksik olduğu bir makinede bir PDF dosyasını açtığınızda, yazı tipi görüntüleme sorunları olabilir. Bu gibi durumlarda, eksik yazı tipini makinede bulunan başka bir yazı tipiyle değiştirmek mümkündür. Aşağıdaki adımları izleyerek, bir PDF dosyasındaki eksik yazı tiplerini değiştirebileceksiniz.

## Önkoşullar
Başlamadan önce, aşağıdaki ön koşulları karşıladığınızdan emin olun:

- C# programlama dili hakkında temel bilgi.
- Sisteminizde kurulu .NET için Aspose.PDF kitaplığı.
- Visual Studio gibi bir geliştirme ortamı.

## 1. Adım: Eksik yazı tipini bulma
İlk adım, PDF dosyasındaki eksik yazı tipini bulmaktır. Aşağıdaki kodu kullanın:

```csharp
// Belgeler dizinine giden yol.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

Aspose.Pdf.Text.Font originalFont = null;
try
{
     // Orijinal yazı tipini bulun
     originalFont = FontRepository.FindFont("AgencyFB");
}
catch(Exception)
{
     // Hedef makinede yazı tipi eksik
     // Basit yazı tipi değişikliği ekleyin
     FontRepository.Substitutions.Add(new SimpleFontSubstitution("AgencyFB", "Arial"));
}
```

 değiştirdiğinizden emin olun`"YOUR DOCUMENTS DIRECTORY"` PDF dosyanızın bulunduğu gerçek dizinle.

## 2. Adım: Eksik yazı tipini değiştirin
Ardından, eksik yazı tipini mevcut başka bir yazı tipiyle değiştireceğiz. Aşağıdaki kodu kullanın:

```csharp
var fileNew = new FileInfo(dataDir + "newfile_out.pdf");
var pdf = new Document(dataDir + "input.pdf");

// Hata giderme ile PDF dosyasını PDF/A formatına dönüştürün
pdf.Convert(dataDir + "log.xml", PdfFormat.PDF_A_1B, ConvertErrorAction.Delete);

// Ortaya çıkan PDF dosyasını kaydedin
pdf.Save(fileNew.FullName);
```

 değiştirdiğinizden emin olun`"input.pdf"` orijinal PDF dosyanıza giden gerçek yolla ve`"newfile_out.pdf"` ortaya çıkan PDF dosyası için istenen adla.

## 3. Adım: Ortaya çıkan PDF dosyasını kaydetme
Son olarak, ortaya çıkan PDF dosyasını değiştirilen yazı tipiyle kaydedeceğiz. Aşağıdaki kodu kullanın:

```csharp
// Ortaya çıkan PDF dosyasını kaydedin
pdf.Save(fileNew.FullName);
```

Ortaya çıkan PDF dosyası için doğru hedef yolu ayarladığınızdan emin olmanızı sağlar.

### Aspose.PDF for .NET kullanarak Eksik Yazı Tiplerini Değiştirme için örnek kaynak kodu

```csharp
// Belgeler dizininin yolu.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Aspose.Pdf.Text.Font originalFont = null;
try
{
	originalFont = FontRepository.FindFont("AgencyFB");
}
catch (Exception)
{
	// Hedef makinede yazı tipi eksik
	FontRepository.Substitutions.Add(new SimpleFontSubstitution("AgencyFB", "Arial"));
}
var fileNew = new FileInfo(dataDir + "newfile_out.pdf");
var pdf = new Document(dataDir + "input.pdf");
pdf.Convert( dataDir +  "log.xml", PdfFormat.PDF_A_1B, ConvertErrorAction.Delete);
pdf.Save(fileNew.FullName);
```

## Çözüm
Bu eğitimde, Aspose.PDF for .NET kullanarak bir PDF dosyasındaki eksik yazı tiplerini değiştirme sürecini adım adım ele aldık. Yukarıda özetlenen talimatları izleyerek, PDF dosyanızdaki eksik yazı tiplerini başarıyla değiştirebileceksiniz.

### SSS

#### S: Aspose.PDF for .NET nedir?

Y: Aspose.PDF for .NET, geliştiricilerin C# uygulamalarında PDF belgeleriyle çalışmasını sağlayan güçlü bir kitaplıktır. PDF dosyalarındaki eksik yazı tiplerini değiştirme yeteneği de dahil olmak üzere çeşitli işlevler sunar.

#### S: Bir PDF dosyasında neden eksik yazı tipleriyle karşılaşayım?

Y: Bir PDF dosyasında eksik yazı tipleri, dosya gerekli yazı tiplerinin yüklü olmadığı bir makinede açıldığında ortaya çıkabilir. Bu, belgenin görsel görünümünü etkileyen yazı tipi değişikliğine yol açabilir.

#### S: Aspose.PDF for .NET kullanarak bir PDF dosyasındaki eksik yazı tiplerini nasıl bulabilir ve değiştirebilirim?

 A: Eksik yazı tiplerini bulmak ve değiştirmek için`FontRepository.FindFont` gerekli yazı tipinin varlığını kontrol etme yöntemi. Yazı tipi eksikse, kullanarak bir yazı tipi değişikliği ekleyebilirsiniz.`FontRepository.Substitutions` mülk.

#### S: Yazı tipi değiştirme işlemini özelleştirebilir miyim?

C: Evet, değiştirme için farklı bir yazı tipi belirterek yazı tipi değiştirme işlemini özelleştirebilirsiniz. Sağlanan kodda, eksik olan "AgencyFB" yazı tipinin yerine Arial kullandık, ancak tercihlerinize göre farklı bir yazı tipi seçebilirsiniz.

#### S: Değiştirme işleminden sonra yazı tipi oluşturmanın doğruluğunu nasıl sağlayabilirim?

Y: Aspose.PDF for .NET, sağlam yazı tipi işleme yetenekleri sunarak değiştirmeden sonra doğru yazı tipi oluşturmayı garanti eder. Yazı tipi değişimini doğrulamak için ortaya çıkan PDF dosyasını önizleyebilirsiniz.