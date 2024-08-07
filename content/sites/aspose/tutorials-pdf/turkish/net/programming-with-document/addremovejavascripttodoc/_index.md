---
title: Javascript'i PDF Belgesine Ekle Kaldır
linktitle: Javascript'i Dokümana Ekle Kaldır
second_title: Aspose.PDF for .NET API Referansı
description: Aspose.PDF for .NET kullanarak JavaScript'i PDF belgesine nasıl ekleyeceğinizi ve kaldıracağınızı öğrenin. Belge düzeyinde komut dosyası oluşturmaya yönelik kod eğitimlerini içeren adım adım kılavuz.
type: docs
weight: 30
url: /tr/net/programming-with-document/addremovejavascripttodoc/
---
JavaScript'i PDF belgesine eklemek ve kaldırmak için Aspose.PDF for .NET kitaplığını kullanacağız. Bu güçlü kitaplık, .NET uygulamalarında PDF dosyalarını değiştirmemize olanak tanır. Aspose.PDF for .NET kullanarak JavaScript eklemek ve kaldırmak için aşağıdaki adım adım talimatları izleyin.

## 1. Adım: Yeni bir PDF Belgesi Oluşturun

 Yeni bir örneğini oluşturarak başlayın.`Document` Aspose.PDF for .NET tarafından sağlanan sınıf. Bu, JavaScript'i ekleyeceğimiz PDF belgesi olarak hizmet edecek.

```csharp
// Belgeler dizininin yolu.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document();
doc.Pages.Add();
```

## 2. Adım: Belge Düzeyinde JavaScript Ekleyin

 JavaScript'i belge düzeyinde eklemek için şunu kullanın:`JavaScript` mülkiyeti`Document` sınıf. JavaScript sözlüğündeki tuşlara JavaScript işlevleri atayın.

```csharp
doc.JavaScript["func1"] = "function func1() { hello(); }";
doc.JavaScript["func2"] = "function func2() { hello(); }";
doc.Save(dataDir + "AddJavascript.pdf");
```

 Bu eğitimde, iki JavaScript işlevi ekledik,`func1` Ve`func2`, PDF belgesine.

## 3. Adım: Belge Düzeyinde JavaScript'i Kaldırın

JavaScript'i belge düzeyinde kaldırmak için PDF belgesini yükleyin ve`JavaScript` sözlük. Tuşlar üzerinde yineleme yapın ve istenen JavaScript işlevini kaldırın.

```csharp
Document doc1 = new Document(dataDir + "AddJavascript.pdf");
IList keys = (System.Collections.IList)doc1.JavaScript.Keys;

foreach (string key in keys)
{
    Console.WriteLine(key + " ==> " + doc1.JavaScript[key]);
}

doc1.JavaScript.Remove("func1");
Console.WriteLine("Key 'func1' removed");
```

 Bu eğitimde,`func1` PDF belgesinden JavaScript işlevi.

## 4. Adım: Değişiklikleri Kaydet ve Doğrula

Değiştirilen PDF belgesini kaydedin ve değişiklikleri doğrulayın.

```csharp
Console.WriteLine("\nJavascript added/removed successfully to a document.");
```

Bu kod, değiştirilen PDF belgesini kaydedecek ve başarı mesajını gösterecektir.

### Aspose.PDF for .NET kullanarak PDF belgelerinden Javascript Ekle ve Kaldır için örnek kaynak kodu

```csharp
// Belgeler dizininin yolu.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document();
doc.Pages.Add();
doc.JavaScript["func1"] = "function func1() { hello(); }";
doc.JavaScript["func2"] = "function func2() { hello(); }";
doc.Save(dataDir + "AddJavascript.pdf");

// Belge düzeyinde JavaScript'i kaldır
Document doc1 = new Document(dataDir + "AddJavascript.pdf");
IList keys = (System.Collections.IList)doc1.JavaScript.Keys;
Console.WriteLine("=============================== ");
foreach (string key in keys)
{
	Console.WriteLine(key + " ==> " + doc1.JavaScript[key]);
}

doc1.JavaScript.Remove("func1");
Console.WriteLine("Key 'func1' removed ");
Console.WriteLine("=============================== ");

Console.WriteLine("\nJavascript added/removed successfully to a document.");
```

## Çözüm

Bu makalede, Aspose.PDF for .NET kullanarak PDF belgelerine JavaScript eklemek ve belgelerinden kaldırmak için adım adım bir kılavuz sağladık. Talimatları izleyerek ve sağlanan kod eğitimlerini kullanarak, JavaScript'i PDF belgelerinize kolayca dahil edebilir ve gerektiğinde kaldırabilirsiniz. JavaScript, PDF dosyalarınızda dinamik işlevsellik ve etkileşim sağlayarak kullanıcı deneyimini geliştirir.


### PDF belgesine javascript eklemek ve kaldırmak için SSS

#### S: Aspose.PDF for .NET nedir?

Y: Aspose.PDF for .NET, geliştiricilerin .NET uygulamalarındaki PDF dosyalarını verimli bir şekilde değiştirmelerine olanak sağlayan güçlü bir kitaplıktır. PDF belgeleriyle programlı olarak çalışmak için kapsamlı özellikler sağlar.

#### S: Aspose.PDF for .NET kullanarak bir PDF belgesine nasıl JavaScript ekleyebilirim?

 Y: JavaScript'i belge düzeyinde ekleyebilirsiniz.`JavaScript` mülkiyeti`Document` sınıf. JavaScript işlevlerini JavaScript sözlüğündeki tuşlara atamanız yeterlidir.

#### S: Aspose.PDF for .NET kullanarak bir PDF belgesinden JavaScript'i kaldırabilir miyim?

 C: Evet, şu adrese erişerek bir PDF belgesinden JavaScript'i kaldırabilirsiniz:`JavaScript` sözlük ve istenen JavaScript işlevini kaldırma.

#### S: Aspose.PDF for .NET profesyonel projeler için uygun mu?

C: Kesinlikle, Aspose.PDF for .NET, profesyonel projelerde PDF işleme ve oluşturma görevleri için yaygın olarak kullanılmaktadır. Yüksek performans ve güvenilir işlevsellik sunar.

#### S: Bir PDF belgesine JavaScript eklemek ne gibi avantajlar sağlar?

Y: Bir PDF belgesine JavaScript eklemek, etkileşimli ve dinamik PDF dosyaları oluşturmanıza olanak tanır. Kullanıcı deneyimini geliştirmek için form doğrulama uygulayabilir, hesaplamalar yapabilir ve çeşitli etkileşim özellikleri ekleyebilirsiniz.