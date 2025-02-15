---
title: Form Alanı Yazı Tipi 14
linktitle: Form Alanı Yazı Tipi 14
second_title: Aspose.PDF for .NET API Referansı
description: Aspose.PDF for .NET ile PDF belgelerinizdeki form alanlarının yazı tipini kolayca yapılandırın.
type: docs
weight: 110
url: /tr/net/programming-with-forms/form-field-font-14/
---
Bu eğitimde, Aspose.PDF for .NET kullanarak bir form alanının yazı tipini nasıl yapılandıracağınızı göstereceğiz. Bu süreçte size yol göstermesi için C# kaynak kodunu adım adım açıklayacağız.

## Adım 1: Hazırlık

İlk olarak, gerekli kitaplıkları içe aktardığınızdan ve belgeler dizinine giden yolu ayarladığınızdan emin olun:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## 2. Adım: Belgeyi açın

Mevcut PDF belgesini açın:

```csharp
Document pdfDocument = new Document(dataDir + "FormFieldFont14.pdf");
```

## 3. Adım: Belirli bir form alanı edinin

İstediğiniz form alanını alın (bu örnekte "textbox1" alanını kullanıyoruz):

```csharp
Aspose.Pdf.Forms.Field field = pdfDocument.Form["textbox1"] as Aspose.Pdf.Forms.Field;
```

## 4. Adım: Bir yazı tipi nesnesi oluşturun

Kullanmak istediğiniz yeni yazı tipi için bir yazı tipi nesnesi oluşturun (örneğin, "ComicSansMS"):

```csharp
Aspose.Pdf.Text.Font font = FontRepository.FindFont("ComicSansMS");
```

## 5. Adım: Form alanı için yazı tipi bilgilerini yapılandırın

Daha önce oluşturulan yazı tipini kullanarak form alanı için yazı tipi bilgilerini yapılandırın:

```csharp
field.DefaultAppearance = new Aspose.Pdf.Forms.DefaultAppearance(font, 14, System.Drawing.Color.Black);
```

## 6. Adım: Güncellenen belgeyi kaydedin

Güncellenmiş PDF belgesini kaydedin:

```csharp
dataDir = dataDir + "FormFieldFont14_out.pdf";
pdfDocument.Save(dataDir);
```


### Aspose.PDF for .NET kullanan Form Field Font 14 için örnek kaynak kodu 
```csharp
// Belgeler dizininin yolu.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Belgeyi aç
Document pdfDocument = new Document(dataDir + "FormFieldFont14.pdf");
// Belgeden belirli form alanını alın
Aspose.Pdf.Forms.Field field = pdfDocument.Form["textbox1"] as Aspose.Pdf.Forms.Field;
// Yazı tipi nesnesi oluştur
Aspose.Pdf.Text.Font font = FontRepository.FindFont("ComicSansMS");
// Form alanı için yazı tipi bilgilerini ayarlayın
// Field.DefaultAppearance = yeni Aspose.Pdf.Forms.in.DefaultAppearance(yazı tipi, 10, System.Drawing.Color.Black);
dataDir = dataDir + "FormFieldFont14_out.pdf";
// Güncellenen belgeyi kaydet
pdfDocument.Save(dataDir);
Console.WriteLine("\nForm field font setup successfully.\nFile saved at " + dataDir);
```

## Çözüm

Bu öğreticide, Aspose.PDF for .NET kullanarak bir form alanının yazı tipini nasıl yapılandıracağımızı öğrendik. Bu adımları izleyerek Aspose.PDF kullanarak PDF belgelerinizdeki form alanları için yazı tipini ve yazı tipi boyutunu kolayca belirleyebilirsiniz.

### SSS

#### S: Aspose.PDF for .NET'te form alanları için herhangi bir yazı tipini kullanabilir miyim?

C: Evet, Aspose.PDF for .NET'teki form alanları için herhangi bir TrueType veya OpenType yazı tipini kullanabilirsiniz. Yazı tipi mevcut olduğu ve sistemde yüklü olduğu veya FontRepository aracılığıyla erişilebildiği sürece, form alanı metninin görünümünü özelleştirmek için kullanabilirsiniz.

#### S: Aspose.PDF for .NET'te mevcut yazı tiplerini nasıl bulabilirim?

 C: Aspose.PDF for .NET'te mevcut yazı tiplerini bulmak için`FontRepository.GetAvailableFonts()`yöntem. Bu yöntem, PDF belgenizdeki form alanları veya diğer metinle ilgili işlemler için kullanabileceğiniz bir dizi kullanılabilir yazı tipi döndürür.

#### S: Form alanlarının yazı tipi boyutunu herhangi bir değerle değiştirebilir miyim?

C: Evet, Aspose.PDF for .NET'i kullanarak form alanlarının yazı tipi boyutunu herhangi bir pozitif sayısal değere değiştirebilirsiniz. Bununla birlikte, yazı tipi boyutunun belirli bir form alanı için uygun olması ve metnin kesilmesine veya belgedeki diğer öğelerle çakışmasına neden olmaması önemlidir.

#### S: Form alanları için yazı tipi rengini değiştirebilir miyim?

C: Evet, form alanlarının yazı tipi rengini Aspose.PDF for .NET kullanarak değiştirebilirsiniz. Sağlanan C# kaynak kodunda, yazı tipi rengi siyah olarak ayarlanmıştır (`System.Drawing.Color.Black`), ancak herhangi bir geçerli renk değerine göre özelleştirebilirsiniz.

#### S: Form alanındaki metni nasıl hizalayabilirim?

 C: Form alanındaki metni hizalamak için`Multiline`form alanının özelliğini ve bunu true olarak ayarlayın. Bu özellik, form alanı içinde çok satırlı metni etkinleştirerek satır sonları ve satır başlarıyla metin hizalamasını kontrol etmenize olanak tanır.