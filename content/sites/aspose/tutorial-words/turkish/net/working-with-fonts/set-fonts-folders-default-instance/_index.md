---
title: Font Klasörleri Varsayılan Örneği Ayarla
linktitle: Font Klasörleri Varsayılan Örneği Ayarla
second_title: Aspose.Words for .NET API Referansı
description: Aspose.Words for .NET kullanarak bir belgeyi işlerken varsayılan yazı tipi klasörünü ayarlamak için adım adım kılavuz.
type: docs
weight: 10
url: /tr/net/working-with-fonts/set-fonts-folders-default-instance/
---

Bu öğreticide, Aspose.Words for .NET kullanarak bir belgeyi işlerken varsayılan yazı tipi klasörünü ayarlamak için size adım adım yol göstereceğiz. Birlikte verilen C# kaynak kodunu açıklayacağız ve bu özelliği anlamanıza ve kendi projelerinizde uygulamanıza yardımcı olacak kapsamlı bir kılavuz sağlayacağız. Bu eğitimin sonunda, belgelerinizi Aspose.Words for .NET kullanarak işlerken kullanılacak varsayılan yazı tipi klasörünü nasıl ayarlayacağınızı öğreneceksiniz.

## 1. Adım: Belge dizinini tanımlayın
Öncelikle, belgeler dizininize giden yolu ayarlamanız gerekir. Bu, düzenlenen işlenmiş belgenizi kaydetmek istediğiniz konumdur. "BELGELER DİZİNİNİZİ" uygun yolla değiştirin.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## 2. Adım: Varsayılan yazı tipi klasörünü ayarlayın
 Ardından, varsayılan yazı tipi klasörünü kullanarak ayarlayabilirsiniz.`FontSettings.DefaultInstance` sınıf ve`SetFontsFolder()` yöntem. Varsayılan klasör olarak kullanmak istediğiniz fontlar klasörünün yolunu belirtin.

```csharp
FontSettings.DefaultInstance.SetFontsFolder("C:\\MyFonts\\", true);
```

## 3. Adım: Oluşturulacak belgeyi yükleyin
 Artık belgeyi kullanarak işlenecek belgeyi yükleyebilirsiniz.`Document` sınıf. Doğru belge yolunu belirttiğinizden emin olun.

```csharp
Document doc = new Document(dataDir + "Rendering.docx");
```

## 4. Adım: Oluşturulan belgeyi kaydedin
 Son olarak, işlenen belgeyi kullanarak bir dosyaya kaydedebilirsiniz.`Save()` yöntemi`Document` sınıf. Doğru yolu ve dosya adını belirttiğinizden emin olun.

```csharp
doc.Save(dataDir + "WorkingWithFonts.SetFontsFoldersDefaultInstance.pdf");
```

### Aspose.Words for .NET kullanan Set Fonts Folders Default Instance için örnek kaynak kodu 

```csharp
	// Belge dizininizin yolu
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	FontSettings.DefaultInstance.SetFontsFolder("C:\\MyFonts\\", true);
	Document doc = new Document(dataDir + "Rendering.docx");
	doc.Save(dataDir + "WorkingWithFonts.SetFontsFoldersDefaultInstance.pdf");
```

## Çözüm
Bu öğreticide, Aspose.Words for .NET kullanarak bir belgeyi işlerken varsayılan yazı tipi klasörünün nasıl ayarlanacağını öğrendik. Bu adım adım kılavuzu izleyerek, belgelerinizi işlerken hangi yazı tipi klasörünün varsayılan klasör olarak kullanılacağını kolayca belirleyebilirsiniz. Aspose.Words, belgelerinizdeki yazı tipleriyle çalışmak için güçlü ve esnek bir API sunar. Bu bilgiyle, belgelerinizi özel ihtiyaçlarınıza göre işlerken kullanılan yazı tipi kaynaklarını kontrol edebilir ve özelleştirebilirsiniz.