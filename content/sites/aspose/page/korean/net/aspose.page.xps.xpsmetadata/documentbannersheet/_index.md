---
title: Class DocumentBannerSheet
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet 수업. 특정 문서에 대해 출력할 배너 시트를 설명합니다. 배너 시트는 default 에 출력되어야 합니다.PageMediaSize 그리고 기본값을 사용하여PageMediaType . 배너 시트는 작업의 나머지 부분과도 분리되어야 합니다. 이는 마무리 또는 처리 옵션예 DocumentDuplex DocumentStaple  또는DocumentBinding 는 배너 시트를 포함하지 않아야 합니다. 배너 시트는 작업의 나머지 부분과 분리될 수도 있고 분리되지 않을 수도 있습니다. 이는 모든 작업 완료 또는 처리 옵션에 문서 배너 시트가 포함될 수 있음을 의미합니다. 배너 시트는 문서의 첫 번째 시트로 나타나야 합니다. https //docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 530
url: /ko/net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

특정 문서에 대해 출력할 배너 시트를 설명합니다. 배너 시트는 default 에 출력되어야 합니다.[`PageMediaSize`](../pagemediasize/) 그리고 기본값을 사용하여[`PageMediaType`](../pagemediatype/) . 배너 시트는 작업의 나머지 부분과도 분리되어야 합니다. 이는 마무리 또는 처리 옵션(예: [`DocumentDuplex`](../documentduplex/) ,[`DocumentStaple`](../documentstaple/) , 또는[`DocumentBinding`](../documentbinding/)) 는 배너 시트를 포함하지 않아야 합니다. 배너 시트는 작업의 나머지 부분과 분리될 수도 있고 분리되지 않을 수도 있습니다. 이는 모든 작업 완료 또는 처리 옵션에 문서 배너 시트가 포함될 수 있음을 의미합니다. 배너 시트는 문서의 첫 번째 시트로 나타나야 합니다. https ://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`Feature`](../feature/) ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |

## 다른 멤버들

| 이름 | 설명 |
| --- | --- |
| class [BannerSheetOption](documentbannersheet.bannersheetoption/) | 의 옵션을 나타냅니다.`DocumentBannerSheet` 기능. |

### 또한보십시오

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


