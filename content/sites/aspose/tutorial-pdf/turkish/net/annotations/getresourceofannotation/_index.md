---
title: Açıklama Kaynağını Alın
linktitle: Açıklama Kaynağını Alın
second_title: Aspose.PDF for .NET API Referansı
description: Bu adım adım kılavuz ile Aspose.PDF for .NET kullanarak bir ek açıklamanın kaynağını nasıl alacağınızı öğrenin.
type: docs
weight: 90
url: /tr/net/annotations/getresourceofannotation/
---

Örnek, Aspose.PDF for .NET ile açıklama kaynağının nasıl alınacağını gösterir. Aspose.PDF for .NET kullanarak bir ek açıklamanın kaynağını almak için şu adımları izleyin:

## Belgenin bulunduğu dizinin yolunu ayarlayın.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Kaynağını almak istediğiniz ek açıklamayı içeren PDF belgesini açın.

```csharp
Document doc = new Document(dataDir + "AddAnnotation.pdf");
```

## Bir ek açıklama oluşturun.

```csharp
ScreenAnnotation sa = new ScreenAnnotation(doc.Pages[1], new Rectangle(100, 400, 300, 600), dataDir + "AddSwfFileAsAnnotation.swf");
```

## Ek açıklamayı belgedeki bir sayfaya ekleyin.

```csharp
doc.Pages[1].Annotations.Add(sa);
```

## Belgeyi kaydedin.

```csharp
doc.Save(dataDir + "GetResourceOfAnnotation_Out.pdf");
```

## Değiştirilen belgeyi açın.

```csharp
Document doc1 = new Document(dataDir + "GetResourceOfAnnotation_Out.pdf");
```

## Ek açıklamanın eylemini alın.

```csharp
RenditionAction action = (doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction;
```

## Eylemin yorumunu alın.

```csharp
Rendition rendition = ((doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction).Rendition;
```

## Medya klibini alın.

```csharp
MediaClip clip = (rendition as MediaRendition).MediaClip;
```

## Dosya belirtimini alın.

```csharp
FileSpecification data = (clip as MediaClipData).Data;
```

## Medya verilerini okuyun.

```csharp
MemoryStream ms = new MemoryStream();
byte[] buffer = new byte[1024];
int read = 0;
Stream source = data.Contents;
while ((read = source.Read(buffer, 0, buffer.Length)) > 0)
{
   ms.Write(buffer, 0, read);
}
```

## Yorumlamanın ve yorumlama işleminin adını yazdırın.

```csharp
Console.WriteLine(rendition.Name);
Console.WriteLine(action.RenditionOperation);
```

Bu adımları izleyerek, Aspose.PDF for .NET kullanarak bir PDF belgesindeki notun kaynağını kolayca alabilirsiniz.

### Aspose.PDF for .NET kullanarak Get Resource Of Annotation için örnek kaynak kodu:

```csharp

	// Belgeler dizininin yolu.
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	// Belgeyi aç
	Document doc = new Document(dataDir + "AddAnnotation.pdf");
	//Ek açıklama oluştur
	ScreenAnnotation sa = new ScreenAnnotation(doc.Pages[1], new Rectangle(100, 400, 300, 600), dataDir + "AddSwfFileAsAnnotation.swf");
	doc.Pages[1].Annotations.Add(sa);
	// Dokümanı Kaydet
	doc.Save(dataDir + "GetResourceOfAnnotation_Out.pdf");
	// Belgeyi aç
	Document doc1 = new Document(dataDir + "GetResourceOfAnnotation_Out.pdf");
	//Ek açıklamanın eylemini alın
	RenditionAction action = (doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction;
	//yorumlama eyleminin yorumlamasını alın
	Rendition rendition = ((doc.Pages[1].Annotations[1] as ScreenAnnotation).Action as RenditionAction).Rendition;
	// Medya Klibi
	MediaClip clip = (rendition as MediaRendition).MediaClip;
	FileSpecification data = (clip as MediaClipData).Data;
	MemoryStream ms = new MemoryStream();
	byte[] buffer = new byte[1024];
	int read = 0;
	//Ortam verilerine FileSpecification.Contents'tan erişilebilir
	Stream source = data.Contents;
	while ((read = source.Read(buffer, 0, buffer.Length)) > 0)
	{
	ms.Write(buffer, 0, read);
	}
	Console.WriteLine(rendition.Name);
	Console.WriteLine(action.RenditionOperation);

```