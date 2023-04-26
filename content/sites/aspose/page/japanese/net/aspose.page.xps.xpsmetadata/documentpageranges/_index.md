---
title: Class DocumentPageRanges
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges クラス. 文書の出力範囲をページ単位で記述しますパラメータ値は次の構造に準拠する必要があります  PageRangeText PageRange または PageRangePageRange  PageRange PageNumber または PageNumberPageNumber  PageNumber 1 から N N はページの数 If PageNumber  N then PageNumber  N. 文字列内の空白は無視する必要があります. https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 780
url: /ja/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

文書の出力範囲をページ単位で記述します。パラメータ値は次の構造に準拠する必要があります: - PageRangeText: "PageRange" または "PageRange,PageRange" - PageRange: "PageNumber" または "PageNumber-PageNumber" - PageNumber: 1 から N (N はページの数) If PageNumber &gt; N, then PageNumber = N. 文字列内の空白は無視する必要があります. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | 文字列値の場合、許容される最長の文字列を定義します。 |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | 文字列値の場合、許可される最短の文字列を定義します。 |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

### 関連項目

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


