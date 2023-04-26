---
title: Class DocumentOutputBin
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin 수업. 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. 문서별로 output bin을 지정할 수 있습니다. 그만큼JobOutputBin DocumentOutputBin and PageOutputBin 키워드는 상호 배타적이며 오직 하나만 PrintTicket 또는 인쇄 기능 문서에 지정되어야 합니다. https//docs.microsoft.com/enus/windows/win32/printdocs/documentoutputbin
type: docs
weight: 770
url: /ko/net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

장치에 대해 지원되는 빈의 전체 목록을 설명합니다. 문서별로 output bin을 지정할 수 있습니다. 그만큼[`JobOutputBin`](../joboutputbin/) ,`DocumentOutputBin` and [`PageOutputBin`](../pageoutputbin/) 키워드는 상호 배타적이며 오직 하나만 PrintTicket 또는 인쇄 기능 문서에 지정되어야 합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`Feature`](../feature/) ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |

### 또한보십시오

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


