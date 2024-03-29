---
title: Vurgular
linktitle: Vurgular
second_title: Aspose.Words for .NET API Referansı
description: Aspose.Words for .NET Adım adım kılavuz ile vurguları (kalın ve italik) nasıl kullanacağınızı öğrenin.
type: docs
weight: 10
url: /tr/net/working-with-markdown/emphases/
---

Bu örnekte vurguların Aspose.Words for .NET ile nasıl kullanılacağını açıklayacağız. vurgular, metnin kalın ve italik gibi belirli kısımlarını vurgulamak için kullanılır.

## 1. Adım: Belge başlatma

 İlk olarak, bir örneğini oluşturarak belgeyi başlatacağız.`Document` sınıf.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
Document doc = new Document();
```

## 2. Adım: Bir belge oluşturucu kullanma

Ardından, belgemize içerik eklemek için bir belge oluşturucu kullanacağız.

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
```

## 3. Adım: Vurgularla metin ekleyin

Belge oluşturucunun yazı tipi özelliklerini değiştirerek vurgu metni ekleyebiliriz. Bu örnekte, metnin farklı kısımlarını vurgulamak için kalın ve italik yazılar kullanıyoruz.

```csharp
builder.Writeln("Markdown treats asterisks (*) and underscores (_) as emphases indicators.");
builder.Write("You can write");

builder.Font.Bold = true;
builder.Write("bold");

builder.Font.Bold = false;
builder.Write(" or ");

builder.Font.Italic = true;
builder.Write("italic");

builder.Font.Italic = false;
builder.Writeln(".");

builder.Write("You can also write ");
builder.Font.Bold = true;

builder.Font.Italic = true;
builder.Write("bold and italic");

builder.Font.Bold = false;
builder.Font.Italic = false;
builder. Write(".");

```

## 4. Adım: Belgeyi kaydetme

 Son olarak belgeyi istediğimiz formatta kaydedebiliriz. Bu örnekte,`.md` Markdown formatı için uzantı.

```csharp
builder.Document.Save(dataDir + "WorkingWithMarkdown.Emphases.md");
```

Tebrikler! Artık Aspose.Words for .NET ile vurguları nasıl kullanacağınızı öğrendiniz.

### Aspose.Words for .NET kullanan Emphases için örnek kaynak kodu


```csharp
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);

	builder.Writeln("Markdown treats asterisks (*) and underscores (_) as indicators of emphases.");
	builder.Write("You can write ");

	builder.Font.Bold = true;
	builder.Write("bold");

	builder.Font.Bold = false;
	builder.Write(" or ");

	builder.Font.Italic = true;
	builder.Write("italic");

	builder.Font.Italic = false;
	builder.Writeln(" text. ");

	builder.Write("You can also write ");
	builder.Font.Bold = true;

	builder.Font.Italic = true;
	builder.Write("BoldItalic");

	builder.Font.Bold = false;
	builder.Font.Italic = false;
	builder.Write("text.");

	builder.Document.Save(dataDir + "WorkingWithMarkdown.Emphases.md");
            
```
