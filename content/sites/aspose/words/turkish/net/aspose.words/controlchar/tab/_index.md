---
title: ControlChar.Tab
linktitle: Tab
articleTitle: Tab
second_title: Aspose.Words for .NET
description: ControlChar Tab alan. Sekme karakteri x0009 veya t C#'da.
type: docs
weight: 270
url: /tr/net/aspose.words/controlchar/tab/
---
## ControlChar.Tab field

Sekme karakteri: "\x0009" veya "\t".

```csharp
public static readonly string Tab;
```

## Örnekler

Sekme durağı konumları için özel aralığın nasıl ayarlanacağını gösterir.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Sekme duraklarını her 72 noktada (1 inç) görünecek şekilde ayarlayın.
builder.Document.DefaultTabStop = 72;

// Her sekme karakteri, kendisinden sonraki metni bir sonraki en yakın sekme durağı konumuna yaslar.
builder.Writeln("Hello" + ControlChar.Tab + "World!");
builder.Writeln("Hello" + ControlChar.TabChar + "World!");
```

### Ayrıca bakınız

* class [ControlChar](../)
* ad alanı [Aspose.Words](../../../aspose.words/)
* toplantı [Aspose.Words](../../../)
