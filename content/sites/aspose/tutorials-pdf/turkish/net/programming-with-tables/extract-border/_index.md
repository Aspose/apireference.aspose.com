---
title: PDF Dosyasında Kenarlığı Çıkarın
linktitle: PDF Dosyasında Kenarlığı Çıkarın
second_title: Aspose.PDF for .NET API Referansı
description: Aspose.PDF for .NET kullanarak PDF dosyasındaki kenarlığı nasıl çıkaracağınızı öğrenin.
type: docs
weight: 80
url: /tr/net/programming-with-tables/extract-border/
---
Bu eğitimde, Aspose.PDF for .NET kullanarak PDF dosyasındaki kenarlığın nasıl çıkarılacağını öğreneceğiz. C#'ta kaynak kodunu adım adım anlatacağız. Bu eğitimin sonunda, bir PDF belgesinden kenarlığı nasıl çıkaracağınızı ve bunu bir görüntü olarak nasıl kaydedeceğinizi öğreneceksiniz. Hadi başlayalım!

## 1. Adım: Ortamı ayarlama
Öncelikle Aspose.PDF for .NET ile C# geliştirme ortamınızı kurduğunuzdan emin olun. Referansı kitaplığa ekleyin ve gerekli ad alanlarını içe aktarın.

## 2. Adım: PDF Belgesini Yükleme
Bu adımda belirtilen dosyadan PDF belgesini yüklüyoruz.

```csharp
Document doc = new Document(dataDir + "input.pdf");
```

"BELGE DİZİNİNİZİ", PDF dosyanızın bulunduğu gerçek dizinle değiştirdiğinizden emin olun.

## 3. Adım: Kenar Çıkarma
Belgede yer alan işlemleri yineleyerek PDF belgesinden kenarlığı çıkaracağız.

```csharp
Stack graphicsState = new Stack();
System.Drawing.Bitmap bitmap = new System.Drawing.Bitmap((int)doc.Pages[1].PageInfo.Width, (int)doc.Pages[1].PageInfo.Height);
System.Drawing.Drawing2D.GraphicsPath graphicsPath = new System.Drawing.Drawing2D.GraphicsPath();
System.Drawing.Drawing2D.Matrix lastCTM = new System.Drawing.Drawing2D.Matrix(1, 0, 0, -1, 0, 0);
System.Drawing.Drawing2D.Matrix inversionMatrix = new System.Drawing.Drawing2D.Matrix(1, 0, 0, -1, 0, (float)doc.Pages[1].PageInfo.Height);
System.Drawing.PointF lastPoint = new System.Drawing.PointF(0, 0);
System.Drawing.Color fillColor = System.Drawing.Color.FromArgb(0, 0, 0);
System.Drawing.Color strokeColor = System.Drawing.Color.FromArgb(0, 0, 0);

using (System.Drawing.Graphics gr = System.Drawing.Graphics.FromImage(bitmap))
{
     // Tüm içerik işlemlerini işle
     foreach(Operator op in doc.Pages[1].Contents)
     {
         // İşlem türünü kontrol edin
         // ...
         // Her işlemi işlemek için kod ekleyin
     }
}
```

 biz bir yaratırız`graphicsState` grafik durumlarını depolamak için yığın, çıkarılan sınırı yakalamak için bir bitmap görüntüsü,`GraphicsPath` çizim yollarını saklamak için nesne ve durumu ve renkleri izlemek için diğer değişkenler.

## 4. Adım: İşlem İşleme
Bu adımda, kenarlığı çıkarmak için belgenin her işlemini işliyoruz.

```csharp
// İşlem türünü kontrol edin
if (opSaveState != null)
{
     // Önceki durumu kaydedin ve mevcut durumu yığının en üstüne itin
     graphicsState.Push(((System.Drawing.Drawing2D.Matrix)graphicsState.Peek()).Clone());
     lastCTM = (System.Drawing.Drawing2D.Matrix)graphicsState.Peek();
}
else if (opRestoreState != null)
{
     // Geçerli durumu silin ve önceki durumu geri yükleyin
     graphicsState. Pop();
     lastCTM = (System.Drawing.Drawing2D.Matrix)graphicsState.Peek();
}
else if (opCtm != null)
{
     // Mevcut dönüşüm matrisini al
     System.Drawing.Drawing2D.Matrix cm = new System.Drawing.Drawing2D.Matrix(
         (float)opCtm.Matrix.A,
         (float)opCtm.Matrix.B,
         (float)opCtm.Matrix.C,
         (float)opCtm.Matrix.D,
         (float)opCtm.Matrix.E,
         (float)opCtm.Matrix.F);

     // Geçerli matrisi durum matrisiyle çarpın
     ((System.Drawing.Drawing2D.Matrix)graphicsState.Peek()).Multiply(cm);
     lastCTM = (System.Drawing.Drawing2D.Matrix)graphicsState.Peek();
}
else if (opMoveTo != null)
{
     // Son çizim noktasını güncelle
     lastPoint = new System.Drawing.PointF((float)opMoveTo.X, (float)opMoveTo.Y);
}
else if (opLineTo != null)
{
     // Bir çizginin çizimini işleyin
     // ...
     // Çizgi çizmeyi işlemek için kod ekleyin
}
// ...
// Diğer işlemler için else if blokları ekleyin
```

Koşulları kullanarak işlem türünü kontrol ediyoruz ve her işlem için uygun kodu çalıştırıyoruz.

## Adım 5: Yedek İmaj
Son olarak, çıkarılan kenarlığı içeren bitmap görüntüsünü belirtilen bir dosyaya kaydediyoruz.

```csharp
dataDir = dataDir + "ExtractBorder_out.png";
bitmap.Save(dataDir, ImageFormat.Png);
```

Çıktı görüntüsünü kaydetmek için doğru dizini ve dosya adını belirttiğinizden emin olun.

### Aspose.PDF for .NET kullanarak Kenar Çıkarma için örnek kaynak kodu

```csharp
// Belgeler dizininin yolu.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document(dataDir + "input.pdf");

Stack graphicsState = new Stack();
System.Drawing.Bitmap bitmap = new System.Drawing.Bitmap((int)doc.Pages[1].PageInfo.Width, (int)doc.Pages[1].PageInfo.Height);
System.Drawing.Drawing2D.GraphicsPath graphicsPath = new System.Drawing.Drawing2D.GraphicsPath();
// Varsayılan ctm matris değeri 1,0,0,1,0,0'dır.
System.Drawing.Drawing2D.Matrix lastCTM = new System.Drawing.Drawing2D.Matrix(1, 0, 0, -1, 0, 0);
//System.Drawing koordinat sistemi sol üst tabanlı, pdf koordinat sistemi ise sol alt tabanlıdır, bu nedenle inversiyon matrisini uygulamamız gerekir
System.Drawing.Drawing2D.Matrix inversionMatrix = new System.Drawing.Drawing2D.Matrix(1, 0, 0, -1, 0, (float)doc.Pages[1].PageInfo.Height);
System.Drawing.PointF lastPoint = new System.Drawing.PointF(0, 0);
System.Drawing.Color fillColor = System.Drawing.Color.FromArgb(0, 0, 0);
System.Drawing.Color strokeColor = System.Drawing.Color.FromArgb(0, 0, 0);

using (System.Drawing.Graphics gr = System.Drawing.Graphics.FromImage(bitmap))
{
	gr.SmoothingMode = SmoothingMode.HighQuality;
	graphicsState.Push(new System.Drawing.Drawing2D.Matrix(1, 0, 0, 1, 0, 0));

	// Tüm içerik komutlarını işle
	foreach (Operator op in doc.Pages[1].Contents)
	{
		Aspose.Pdf.Operators.GSave opSaveState = op as Aspose.Pdf.Operators.GSave;
		Aspose.Pdf.Operators.GRestore opRestoreState = op as Aspose.Pdf.Operators.GRestore;
		Aspose.Pdf.Operators.ConcatenateMatrix opCtm = op as Aspose.Pdf.Operators.ConcatenateMatrix;
		Aspose.Pdf.Operators.MoveTo opMoveTo = op as Aspose.Pdf.Operators.MoveTo;
		Aspose.Pdf.Operators.LineTo opLineTo = op as Aspose.Pdf.Operators.LineTo;
		Aspose.Pdf.Operators.Re opRe = op as Aspose.Pdf.Operators.Re;
		Aspose.Pdf.Operators.EndPath opEndPath = op as Aspose.Pdf.Operators.EndPath;
		Aspose.Pdf.Operators.Stroke opStroke = op as Aspose.Pdf.Operators.Stroke;
		Aspose.Pdf.Operators.Fill opFill = op as Aspose.Pdf.Operators.Fill;
		Aspose.Pdf.Operators.EOFill opEOFill = op as Aspose.Pdf.Operators.EOFill;
		Aspose.Pdf.Operators.SetRGBColor opRGBFillColor = op as Aspose.Pdf.Operators.SetRGBColor;
		Aspose.Pdf.Operators.SetRGBColorStroke opRGBStrokeColor = op as Aspose.Pdf.Operators.SetRGBColorStroke;

		if (opSaveState != null)
		{
			//Önceki durumu kaydedin ve mevcut durumu yığının en üstüne itin
			graphicsState.Push(((System.Drawing.Drawing2D.Matrix)graphicsState.Peek()).Clone());
			lastCTM = (System.Drawing.Drawing2D.Matrix)graphicsState.Peek();
		}
		else if (opRestoreState != null)
		{
			// Mevcut durumu atın ve bir öncekini geri yükleyin
			graphicsState.Pop();
			lastCTM = (System.Drawing.Drawing2D.Matrix)graphicsState.Peek();
		}
		else if (opCtm != null)
		{
			System.Drawing.Drawing2D.Matrix cm = new System.Drawing.Drawing2D.Matrix(
				(float)opCtm.Matrix.A,
				(float)opCtm.Matrix.B,
				(float)opCtm.Matrix.C,
				(float)opCtm.Matrix.D,
				(float)opCtm.Matrix.E,
				(float)opCtm.Matrix.F);

			// Mevcut matrisi durum matrisiyle çarpın
			((System.Drawing.Drawing2D.Matrix)graphicsState.Peek()).Multiply(cm);
			lastCTM = (System.Drawing.Drawing2D.Matrix)graphicsState.Peek();
		}
		else if (opMoveTo != null)
		{
			lastPoint = new System.Drawing.PointF((float)opMoveTo.X, (float)opMoveTo.Y);
		}
		else if (opLineTo != null)
		{
			System.Drawing.PointF linePoint = new System.Drawing.PointF((float)opLineTo.X, (float)opLineTo.Y);
			graphicsPath.AddLine(lastPoint, linePoint);

			lastPoint = linePoint;
		}
		else if (opRe != null)
		{
			System.Drawing.RectangleF re = new System.Drawing.RectangleF((float)opRe.X, (float)opRe.Y, (float)opRe.Width, (float)opRe.Height);
			graphicsPath.AddRectangle(re);
		}
		else if (opEndPath != null)
		{
			graphicsPath = new System.Drawing.Drawing2D.GraphicsPath();
		}
		else if (opRGBFillColor != null)
		{
			fillColor = opRGBFillColor.getColor();
		}
		else if (opRGBStrokeColor != null)
		{
			strokeColor = opRGBStrokeColor.getColor();
		}
		else if (opStroke != null)
		{
			graphicsPath.Transform(lastCTM);
			graphicsPath.Transform(inversionMatrix);
			gr.DrawPath(new System.Drawing.Pen(strokeColor), graphicsPath);
			graphicsPath = new System.Drawing.Drawing2D.GraphicsPath();
		}
		else if (opFill != null)
		{
			graphicsPath.FillMode = FillMode.Winding;
			graphicsPath.Transform(lastCTM);
			graphicsPath.Transform(inversionMatrix);
			gr.FillPath(new System.Drawing.SolidBrush(fillColor), graphicsPath);
			graphicsPath = new System.Drawing.Drawing2D.GraphicsPath();
		}
		else if (opEOFill != null)
		{
			graphicsPath.FillMode = FillMode.Alternate;
			graphicsPath.Transform(lastCTM);
			graphicsPath.Transform(inversionMatrix);
			gr.FillPath(new System.Drawing.SolidBrush(fillColor), graphicsPath);
			graphicsPath = new System.Drawing.Drawing2D.GraphicsPath();
		}
	}
}
dataDir = dataDir + "ExtractBorder_out.png";
bitmap.Save(dataDir, ImageFormat.Png);

Console.WriteLine("\nBorder extracted successfully as image.\nFile saved at " + dataDir);
```

## Çözüm
Bu eğitimde, Aspose.PDF for .NET kullanarak bir PDF belgesinden kenarlığın nasıl çıkarılacağını öğrendik. Diğer PDF belgelerinden kenarlık çıkarmak için bu adım adım kılavuzu kullanabilirsiniz.

### PDF dosyasındaki kenarlığı ayıklamak için SSS

#### S: Bir PDF dosyasından kenarlığı çıkarmanın amacı nedir?

Y: Bir PDF dosyasından kenarlığın çıkarılması çeşitli amaçlar için yararlı olabilir. Tablolar, diyagramlar veya grafik öğeler gibi belgenin yapısal öğelerini ayırmanıza ve analiz etmenize olanak tanır. PDF belgesindeki içeriğin düzenini, boyutlarını ve konumunu belirlemek için ayıklanan kenarlığı kullanabilirsiniz.

#### S: PDF belgesindeki belirli sayfalardan veya alanlardan kenarlığı çıkarabilir miyim?

C: Evet, sağlanan C# kaynak kodunu, PDF belgesindeki belirli sayfalardan veya bölgelerden kenarlığı çıkarmak için değiştirebilirsiniz. Manipüle ederek`doc.Pages` toplama ve özel ölçütler belirleme, belirli sayfalardan veya ilgi alanlarından kenarlığı çıkarmayı seçebilirsiniz.

#### S: Çıktı görüntü biçimini ve kalitesini nasıl özelleştirebilirim?

 A: Sağlanan C# kodunda, çıkarılan kenarlık bir PNG görüntüsü olarak kaydedilir. Çıktı görüntü formatını değiştirmek isterseniz,`ImageFormat.Png` içindeki parametre`bitmap.Save` yöntemini JPEG, BMP veya GIF gibi desteklenen diğer görüntü biçimlerine dönüştürün. Ek olarak, görüntü kalitesini veya sıkıştırma ayarlarını gereksinimlerinize göre ayarlayabilirsiniz.

#### S: Çıkartılan sınırda başka hangi işlemleri yapabilirim?

C: Kenarlığı bir görüntü olarak çıkardıktan sonra, görüntü işleme kitaplıkları veya algoritmaları kullanarak daha fazla işleyebilirsiniz. Gerekirse görüntüyü analiz edebilir, görüntü filtreleri uygulayabilir, kalıpları algılayabilir veya görüntüden metin çıkarmak için OCR (Optik Karakter Tanıma) gerçekleştirebilirsiniz.

#### S: Karmaşık PDF belgelerinden kenarlıklar ayıklanırken herhangi bir sınırlama veya dikkat edilmesi gereken nokta var mı?

Y: Çıkarma işlemi, PDF belgesinin karmaşıklığına bağlı olarak değişebilir. Birden çok katmana, şeffaflığa veya gelişmiş grafiklere sahip karmaşık PDF'ler, kenarlığın doğru bir şekilde çıkarılması için ek işlemler veya ayarlamalar gerektirebilir. Güvenilir sonuçlar elde etmek için ayıklama sürecini çeşitli PDF belgelerinde kapsamlı bir şekilde test etmek çok önemlidir.