---
title: Tablo Satır İçeriği İçin Metin Hizalama
linktitle: Tablo Satır İçeriği İçin Metin Hizalama
second_title: Aspose.PDF for .NET API Referansı
description: Aspose.PDF for .NET kullanarak bir PDF tablosundaki satır içeriğini nasıl hizalayacağınızı öğrenin.
type: docs
weight: 210
url: /tr/net/programming-with-tables/text-alignment-for-table-row-content/
---
Bu öğreticide, Aspose.PDF for .NET kullanarak bir PDF belgesinin tablosundaki bir satırın içeriğini hizalamanız için size adım adım rehberlik edeceğiz. Sağlanan C# kaynak kodunu açıklayacağız ve nasıl uygulayacağınızı göstereceğiz.

## 1. Adım: PDF belgesini oluşturma
İlk olarak, PDF belgesini oluşturacağız:

```csharp
var dataDir = "YOUR DOCUMENTS DIRECTORY";
Aspose.Pdf.Document doc = new Aspose.Pdf.Document();
```

## Adım 2: Tablo başlatma
Ardından, tabloyu başlatacağız:

```csharp
Aspose.Pdf.Table table = new Aspose.Pdf.Table();
```

## 3. Adım: Tablo kenarlık rengini ayarlama
Tablo sınır rengini yapılandıracağız:

```csharp
table.Border = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, .5f, Aspose.Pdf.Color.FromRgb(System.Drawing.Color.LightGray));
```

## 4. Adım: Tablo hücresi kenarlığını yapılandırma
Tablo hücre sınırını yapılandıracağız:

```csharp
table.DefaultCellBorder = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, .5f, Aspose.Pdf.Color.FromRgb(System.Drawing.Color.LightGray));
```

## Adım 5: Tabloya 10 satır eklemek için döngü yapın
Şimdi tabloya 10 satır eklemek için bir döngü kullanacağız:

```csharp
for (int row_count = 0; row_count < 10; row_count++)
{
     Aspose.Pdf.Row row = table.Rows.Add();
     row.VerticalAlignment = VerticalAlignment.Center;

     row.Cells.Add("Column("+row_count+",1)"+DateTime.Now.Ticks);
     row.Cells.Add("Column("+row_count+",2)");
     row.Cells.Add("Column("+row_count+",3)");
}
```

## 6. Adım: Dikey çizgi hizalamasını yapılandırma
Tablonun satırlarının dikey hizalamasını yapılandıracağız:

```csharp
row.VerticalAlignment = VerticalAlignment.Center;
```

## Adım 7: Satır hücrelerine içerik ekleme
Satır hücrelerine içerik ekleyeceğiz:

```csharp
row.Cells.Add("Column("+row_count+",1)"+DateTime.Now.Ticks);
row.Cells.Add("Column("+row_count+",2)");
row.Cells.Add("Column("+row_count+",3)");
```

## Adım 8: Tabloyu belge sayfasına ekleme
Şimdi tabloyu belge sayfasına ekleyelim:

```csharp
Page tocPage = doc.Pages.Add();
tocPage.Paragraphs.Add(table);
```

## 9. Adım: PDF belgesini kaydetme
Son olarak, PDF belgesini kaydedeceğiz:

```csharp
doc.Save(dataDir + "43620_ByWords_out.pdf");
```

### Aspose.PDF for .NET kullanan Tablo Satır İçeriği İçin Metin Hizalama için örnek kaynak kodu

```csharp
var dataDir = "YOUR DOCUMENT DIRECTORY";

// PDF belgesi oluştur
Aspose.Pdf.Document doc = new Aspose.Pdf.Document();
// Tablonun yeni bir örneğini başlatır
Aspose.Pdf.Table table = new Aspose.Pdf.Table();
// Tablo kenarlık rengini LightGray olarak ayarlayın
table.Border = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, .5f, Aspose.Pdf.Color.FromRgb(System.Drawing.Color.LightGray));
// tablo hücreleri için kenarlığı ayarla
table.DefaultCellBorder = new Aspose.Pdf.BorderInfo(Aspose.Pdf.BorderSide.All, .5f, Aspose.Pdf.Color.FromRgb(System.Drawing.Color.LightGray));
// 10 satır eklemek için bir döngü oluşturun
for (int row_count = 0; row_count < 10; row_count++)
{
	// tabloya satır ekle
	Aspose.Pdf.Row row = table.Rows.Add();
	row.VerticalAlignment = VerticalAlignment.Center;

	row.Cells.Add("Column (" + row_count + ", 1)" + DateTime.Now.Ticks);
	row.Cells.Add("Column (" + row_count + ", 2)");
	row.Cells.Add("Column (" + row_count + ", 3)");
}
Page tocPage = doc.Pages.Add();
// Giriş belgesinin ilk sayfasına tablo nesnesi ekleyin
tocPage.Paragraphs.Add(table);
// Tablo nesnesini içeren güncellenmiş belgeyi kaydet
doc.Save(dataDir + "43620_ByWords_out.pdf");
```

## Çözüm
Tebrikler! Aspose.PDF for .NET kullanarak bir PDF belgesindeki bir tablodaki bir satırın içeriğini nasıl hizalayacağınızı artık öğrendiniz. Bu adım adım kılavuz size belge oluşturmayı, tablo başlatmayı, kenarlığı ve hizalamayı yapılandırmayı, içerik eklemeyi ve PDF belgesini kaydetmeyi gösterdi. Artık bu bilgiyi kendi projelerinize uygulayabilirsiniz.

### SSS

#### S: Tablo hücrelerinin içeriğini yatay olarak nasıl hizalayabilirim?

 A: Tablo hücrelerinin içeriğini ayarlayarak yatay olarak hizalayabilirsiniz.`HorizontalAlign` hücrenin özelliği`TextState` nesne. Örneğin, metni ortaya hizalamak için şunu kullanın:`cell.TextState.HorizontalAlignment = HorizontalAlignment.Center` . olarak da ayarlayabilirsiniz.`HorizontalAlignment.Left` veya`HorizontalAlignment.Right` sırasıyla sol ve sağ hizalama için.

#### S: Tablodaki tek tek hücrelere farklı kenarlık stilleri ve renkleri uygulayabilir miyim?

 C: Evet, tablodaki tek tek hücrelere farklı kenarlık stilleri ve renkleri uygulayabilirsiniz. Belirli bir hücrenin kenarlığını özelleştirmek için,`cell.Border` mülkiyet yeni`BorderInfo`Kenarlık kenarları, genişlik ve renk gibi istenen ayarlarla nesne.

#### S: Hücrelerdeki tablo içeriğinin dikey hizalamasını nasıl ayarlayabilirim?

 C: Hücrelerdeki tablo içeriğinin dikey hizalamasını ayarlayarak ayarlayabilirsiniz.`VerticalAlignment` satırın özelliği`VerticalAlignment.Center`, `VerticalAlignment.Top` , veya`VerticalAlignment.Bottom`. Bu özellik, o satırdaki tüm hücrelerin dikey hizalamasını kontrol eder.

#### S: Tabloya dinamik olarak daha fazla sütun veya satır eklemek mümkün müdür?

 C: Evet, kullanarak tabloya dinamik olarak daha fazla sütun ve satır ekleyebilirsiniz.`table.Rows.Add()` yeni satırlar ekleme yöntemi ve`row.Cells.Add()` satırlara yeni hücreler ekleme yöntemi. Bunu döngülerin içinde veya özel gereksinimlerinize göre yapabilirsiniz.

#### S: Belirli hücreler veya tüm tablo için arka plan rengini nasıl ayarlayabilirim?

 C: Belirli hücreler veya tüm tablo için bir arka plan rengi ayarlamak üzere`BackgroundColor` mülkiyeti`Cell` veya`Table` nesne. Örneğin, bir hücrenin arka plan rengini ayarlamak için şunu kullanın:`cell.BackgroundColor = Aspose.Pdf.Color.LightBlue`.