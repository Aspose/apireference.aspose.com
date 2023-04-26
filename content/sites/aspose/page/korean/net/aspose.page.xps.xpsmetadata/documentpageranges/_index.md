---
title: Class DocumentPageRanges
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges 수업. 문서의 출력 범위를 페이지 단위로 설명합니다. 매개변수 값은 다음 구조를 따라야 합니다.  PageRangeText PageRange 또는 PageRangePageRange  PageRange PageNumber 또는 PageNumberPageNumber  PageNumber 1N 여기서 N은 PageNumber  N이면 PageNumber  N입니다. 문자열의 공백은 무시해야 합니다. https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 780
url: /ko/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

문서의 출력 범위를 페이지 단위로 설명합니다. 매개변수 값은 다음 구조를 따라야 합니다. - PageRangeText: "PageRange" 또는 "PageRange,PageRange" - PageRange: "PageNumber" 또는 "PageNumber-PageNumber" - PageNumber: 1~N, 여기서 N은 PageNumber &gt; N이면 PageNumber = N입니다. 문자열의 공백은 무시해야 합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | 문자열 값의 경우 허용되는 가장 긴 문자열을 정의합니다. |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | 문자열 값의 경우 허용되는 가장 짧은 문자열을 정의합니다. |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

### 또한보십시오

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


