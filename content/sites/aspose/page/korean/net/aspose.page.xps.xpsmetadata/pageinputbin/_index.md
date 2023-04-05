---
title: Class PageInputBin
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.PageInputBin 수업. 장치에 설치된 입력함 또는 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. 페이지별로 입력함을 지정할 수 있습니다. 그만큼JobInputBin DocumentInputBin and PageInputBin 키워드는 상호 배타적입니다. 둘 다 PrintTicket 또는 인쇄 기능 문서에서 동시에 지정하면 안 됩니다. https//docs.microsoft.com/enus/windows/win32/printdocs/pageinputbin
type: docs
weight: 2020
url: /ko/net/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class

장치에 설치된 입력함 또는 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. 페이지별로 입력함을 지정할 수 있습니다. 그만큼[`JobInputBin`](../jobinputbin/) ,[`DocumentInputBin`](../documentinputbin/) and `PageInputBin` 키워드는 상호 배타적입니다. 둘 다 PrintTicket 또는 인쇄 기능 문서에서 동시에 지정하면 안 됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin

```csharp
public sealed class PageInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PageInputBin](pageinputbin/)(params IInputBinItem[]) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`Feature`](../feature/) ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |

### 또한보십시오

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


