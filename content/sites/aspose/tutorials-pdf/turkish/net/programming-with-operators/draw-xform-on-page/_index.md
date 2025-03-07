---
title: Sayfada XForm Çiz
linktitle: Sayfada XForm Çiz
second_title: Aspose.PDF for .NET API Referansı
description: Aspose.PDF for .NET kullanarak bir PDF sayfasında bir XForm formu çizmek için adım adım kılavuz. Formu sayfaya ekleyin ve konumlandırın.
type: docs
weight: 10
url: /tr/net/programming-with-operators/draw-xform-on-page/
---
Bu eğitimde, Aspose.PDF for .NET kullanarak bir sayfada bir XForm'un nasıl çizileceğine dair adım adım bir kılavuz sağlayacağız. Aspose.PDF, PDF belgelerini program aracılığıyla oluşturmanıza, değiştirmenize ve dönüştürmenize izin veren güçlü bir kitaplıktır. Aspose.PDF tarafından sağlanan operatörleri kullanarak bir XForm formu ekleyebilir ve mevcut bir PDF sayfasına konumlandırabilirsiniz.

## Önkoşullar

Başlamadan önce, aşağıdaki ön koşullara sahip olduğunuzdan emin olun:

1. .NET çerçevesiyle yüklenen Visual Studio.
2. .NET için Aspose.PDF kitaplığı.

## Adım 1: Proje Kurulumu

Başlamak için Visual Studio'da yeni bir proje oluşturun ve Aspose.PDF for .NET kitaplığına bir referans ekleyin. Kütüphaneyi Aspose resmi sitesinden indirebilir ve makinenize kurabilirsiniz.

## 2. Adım: Gerekli ad alanlarını içe aktarın

Aspose.PDF tarafından sağlanan sınıflara ve yöntemlere erişmek için gereken ad alanlarını C# kod dosyanıza aktarın:

```csharp
using System;
using System.IO;
using Aspose.Pdf;
using Aspose.Pdf.Operators;
```

## 3. Adım: Dosya yollarını ayarlama

Arka plan görüntüsü, giriş PDF dosyası ve çıkış PDF dosyası için dosya yollarını tanımlayın:

```csharp
string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";
string imageFile = dataDir + "aspose-logo.jpg";
string inFile = dataDir + "DrawXFormOnPage.pdf";
string outFile = dataDir + "blank-sample2_out.pdf";
```

Makinenizdeki gerçek dosya yollarını belirttiğinizden emin olun.

## 4. Adım: Giriş PDF dosyasını yükleme

Giriş PDF dosyasını yüklemek için aşağıdaki kodu kullanın:

```csharp
using (Document doc = new Document(inFile))
{
OperatorCollection pageContents = doc.Pages[1].Contents;
// Aşağıdaki kod, GSave/GRestore işleçlerini kullanır
// Kod, XForm'u konumlandırmak için ContatenateMatrix operatörünü kullanır.
// Kod, XForm'u sayfada çizmek için Do operatörünü kullanır.
// GSave/GRestore operatörleri mevcut içeriği kaydırır
// bu, mevcut içeriğin sonunda ilk grafik durumunu elde etmek için yapılır.
// aksi takdirde mevcut operatörler zincirinin sonunda istenmeyen dönüşümler olabilir.
pageContents. Insert(1, new GSave());
pageContents. Add(new GRestore());
// Yeni komutlardan sonra grafik durumunu düzgün bir şekilde sıfırlamak için GSave operatörü ekleyin
pageContents. Add(new GSave());

// XForm'u oluşturun
XForm form = XForm.CreateNewForm(doc.Pages[1], doc);
doc.Pages[1].Resources.Forms.Add(form);
form.Contents.Add(new GSave());
// Resmin genişliğini ve yüksekliğini ayarlayın
form.Contents.Add(new ConcatenateMatrix(200, 0, 0, 200, 0, 0));
// Görüntüyü bir akışa yükleyin
Stream imageStream = new FileStream(imageFile, FileMode.Open);
// Görüntüyü XForm kaynak görüntüleri koleksiyonuna ekleyin
form.Resources.Images.Add(imageStream);
XImage ximage = form.Resources.Images[form.Resources.Images.Count];
// Do işlecini kullanma: bu işleç görüntüyü çizer
form.Contents.Add(new Do(ximage.Name));
form.Contents.Add(new GRestore());

pageContents. Add(new GSave());
//XForm'u x=100 ve y=500 koordinatlarında konumlandırın
pageContents. Add(new ConcatenateMatrix(1, 0, 0, 1, 100, 500));
// XForm'u Do operatörüyle çizin
pageContents.Add(new Do(form.Name));
pageContents. Add(new GRestore());

pageContents. Add(new GSave());
// XForm'u x=100 ve y=300 koordinatlarında konumlandırın
pageContents. Add(new ConcatenateMatrix(1, 0, 0, 1, 100, 300));
// XForm'u Do operatörüyle çizin
pageContents.Add(new Do(form.Name));
pageContents. Add(new GRestore());

// GSave'den sonra GRestore ile grafik durumunu geri yükleyin
pageContents. Add(new GRestore());
doc.Save(outFile);
}
```

Gerçek dosya yollarını belirttiğinizden ve sayfa numarasını ve XForm konumlarını gerektiği gibi ayarladığınızdan emin olun.

### Aspose.PDF for .NET kullanarak Sayfada XForm Çizimi için örnek kaynak kodu
 
```csharp

// Belgeler dizininin yolu.
string dataDir = "YOUR DOCUMENT DIRECTORY";
string imageFile = dataDir+ "aspose-logo.jpg";
string inFile = dataDir + "DrawXFormOnPage.pdf";
string outFile = dataDir + "blank-sample2_out.pdf";
using (Document doc = new Document(inFile))
{
	OperatorCollection pageContents = doc.Pages[1].Contents;
	// örnek gösterir
	// GSave/GRestore operatörlerinin kullanımı
	// xForm'u konumlandırmak için ContatenateMatrix operatör kullanımı
	// Sayfada xForm çizmek için operatör kullanımı yapın
	// Mevcut içerikleri GSave/GRestore operatör çifti ile sarın
	// bu, mevcut içeriğin sonunda ilk grafik durumunu elde etmek içindir
	// aksi halde mevcut operatörler zincirinin sonunda bazı istenmeyen dönüşümler kalabilir.
	pageContents.Insert(1, new Aspose.Pdf.Operators.GSave());
	pageContents.Add(new Aspose.Pdf.Operators.GRestore());
	// Yeni komutlardan sonra grafik durumunu düzgün bir şekilde temizlemek için grafik durumunu kaydet operatörünü ekleyin
	pageContents.Add(new Aspose.Pdf.Operators.GSave());
	#region create xForm
	// xForm'u oluştur
	XForm form = XForm.CreateNewForm(doc.Pages[1], doc);
	doc.Pages[1].Resources.Forms.Add(form);
	form.Contents.Add(new Aspose.Pdf.Operators.GSave());
	// Görüntü genişliğini ve yüksekliğini tanımlayın
	form.Contents.Add(new Aspose.Pdf.Operators.ConcatenateMatrix(200, 0, 0, 200, 0, 0));
	// Görüntüyü akışa yükle
	Stream imageStream = new FileStream(imageFile, FileMode.Open);
	//XForm Resources'ın Görüntüler koleksiyonuna görüntü ekleyin
	form.Resources.Images.Add(imageStream);
	XImage ximage = form.Resources.Images[form.Resources.Images.Count];
	// Do işlecini kullanma: bu işleç görüntüyü çizer
	form.Contents.Add(new Aspose.Pdf.Operators.Do(ximage.Name));
	form.Contents.Add(new Aspose.Pdf.Operators.GRestore());
	#endregion
	pageContents.Add(new Aspose.Pdf.Operators.GSave());
	// Formu x=100 y=500 koordinatlarına yerleştirin
	pageContents.Add(new Aspose.Pdf.Operators.ConcatenateMatrix(1, 0, 0, 1, 100, 500));
	// Do operatörü ile form çizin
	pageContents.Add(new Aspose.Pdf.Operators.Do(form.Name));
	pageContents.Add(new Aspose.Pdf.Operators.GRestore());
	pageContents.Add(new Aspose.Pdf.Operators.GSave());
	// Formu x=100 y=300 koordinatlarına yerleştirin
	pageContents.Add(new Aspose.Pdf.Operators.ConcatenateMatrix(1, 0, 0, 1, 100, 300));
	// Do operatörü ile form çizin
	pageContents.Add(new Aspose.Pdf.Operators.Do(form.Name));
	pageContents.Add(new Aspose.Pdf.Operators.GRestore());
	// GSave'den sonra grafik durumunu GRestore ile geri yükleyin
	pageContents.Add(new Aspose.Pdf.Operators.GRestore());
	doc.Save(outFile);                
}

```

## Çözüm

Bu öğreticide, Aspose.PDF for .NET kullanarak bir PDF sayfasında bir XForm formunun nasıl çizileceğini öğrendiniz. Açıklanan adımları izleyerek, bir XForm formunu mevcut bir sayfaya ekleyip konumlandırabilecek ve böylece PDF belgelerinize daha fazla esneklik kazandırabileceksiniz.

### Sayfada XForm çizmek için SSS

#### S: Aspose.PDF'de XForm nedir?

Y: Bir XForm, bir PDF belgesindeki yeniden kullanılabilir bir grafik nesnedir. Farklı sayfalarda birden çok kez yeniden kullanılabilen karmaşık grafikler, resimler veya metinler tanımlamanıza ve çizmenize olanak tanır.

#### S: Aspose.PDF için gerekli ad alanlarını nasıl içe aktarırım?

 A: C# kod dosyanızda,`using` Aspose.PDF tarafından sağlanan sınıflara ve yöntemlere erişim için gerekli ad alanlarını içe aktarma yönergesi:
```csharp
using System;
using System.IO;
using Aspose.Pdf;
using Aspose.Pdf.Operators;
```

#### S: GSave ve GRestore operatörlerinin amacı nedir?

 C:`GSave` Ve`GRestore`Aspose.PDF'deki operatörler, grafik durumunu kaydetmek ve geri yüklemek için kullanılır. İçeriğin bir bölümüne uygulanan dönüşümlerin ve ayarların sonraki bölümleri etkilememesini sağlamaya yardımcı olurlar.

#### S: Aspose.PDF kullanarak bir XForm'u nasıl tanımlarım?

 C: Bir XForm oluşturmak için`XForm.CreateNewForm` yöntemine ekleyin ve`Resources.Forms` Belirli bir sayfanın toplanması. Daha sonra XForm'lara içerik ekleyebilirsiniz.`Contents` mülk.

#### S: Bir XForm içinde nasıl resim çizebilirim?

 A: Görüntüyü bir akışa yükleyin ve`Resources.Images` XForm koleksiyonu. Kullan`Do` XForm içindeki operatör`Contents` görüntüyü çizmek için

#### S: Bir XForm'u bir PDF sayfasında nasıl konumlandırırım?

 C: XForm'u bir sayfada konumlandırmak için`ConcatenateMatrix` sayfanın içindeki operatör`Contents`. XForm'un çevirisini (konumunu) ve ölçeklendirmesini belirtmek için matris parametrelerini ayarlayın.

#### S: Aynı sayfada birden çok XForm çizebilir miyim?

 C: Evet, aynı sayfada birden fazla XForm çizebilirsiniz.`ConcatenateMatrix`her bir XForm'u farklı koordinatlarda konumlandırmak için parametreler.

#### S: Oluşturulduktan sonra bir XForm'un içeriğini değiştirebilir miyim?

 C: Evet, bir XForm'un içeriğini oluşturduktan sonra, içeriğine ek işleçler ekleyerek değiştirebilirsiniz.`Contents` mülk.

#### S: GSave ve GRestore operatörlerini atlarsam ne olur?

Y: GSave ve GRestore işleçlerinin atlanması, sonraki içeriğe istenmeyen dönüşümlerin veya ayarların uygulanmasına yol açabilir. Bunları kullanmak, temiz bir grafik durumunun korunmasına yardımcı olur.

#### S: XForms'u PDF belgesinin farklı sayfalarında yeniden kullanabilir miyim?

 C: Evet, XForm'u birden çok sayfada yeniden kullanabilirsiniz.`Resources.Forms` farklı sayfaların toplanması.

#### S: Oluşturabileceğim XForms sayısında bir sınır var mı?

C: Oluşturabileceğiniz XForm sayısıyla ilgili kesin bir sınır olmamakla birlikte, çok fazla XForm'un performansı ve bellek kullanımını etkileyebileceğini unutmayın. Bunları akıllıca kullanın.

#### S: Bir XForm'u döndürebilir miyim veya başka dönüşümler uygulayabilir miyim?

 C: Evet, kullanabilirsiniz`ConcatenateMatrix`XForm'a döndürme, ölçekleme ve öteleme gibi dönüşümleri uygulamak için işleç.
