---
title: PageInfo.Colored
linktitle: Colored
articleTitle: Colored
second_title: Aspose.Words for .NET
description: PageInfo Colored mülk. İadelerdoğru sayfa renkli içerik içeriyorsa C#'da.
type: docs
weight: 10
url: /tr/net/aspose.words.rendering/pageinfo/colored/
---
## PageInfo.Colored property

İadeler`doğru` sayfa renkli içerik içeriyorsa.

```csharp
public bool Colored { get; }
```

## Örnekler

Sayfanın renkli olup olmadığının nasıl kontrol edileceğini gösterir.

```csharp
Document doc = new Document(MyDir + "Document.docx");

// Belgenin ilk sayfasının renkli olmadığını kontrol edin.
Assert.IsFalse(doc.GetPageInfo(0).Colored);
```

### Ayrıca bakınız

* class [PageInfo](../)
* ad alanı [Aspose.Words.Rendering](../../../aspose.words.rendering/)
* toplantı [Aspose.Words](../../../)
