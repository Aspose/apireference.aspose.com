---
title: Class DocumentCollate
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentCollate 수업. 출력의 조합 특성을 설명합니다. 각 개별 문서의 모든 페이지가 정렬됩니다. DocumentCollate 및 JobCollateAlldocuments는 상호 배타적입니다. 이 두 키워드 중 하나만 구현되는지 여부의 동작 및 구현은 드라이버에 맡겨져 있습니다.
type: docs
weight: 610
url: /ko/net/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class

출력의 조합 특성을 설명합니다. 각 개별 문서의 모든 페이지가 정렬됩니다. DocumentCollate 및 JobCollateAlldocuments는 상호 배타적입니다. 이 두 키워드 중 하나만 구현되는지 여부의 동작 및 구현은 드라이버에 맡겨져 있습니다.

```csharp
public sealed class DocumentCollate : Collate, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [DocumentCollate](documentcollate/)(params CollateOption[]) |  |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`Feature`](../feature/) ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |

### 또한보십시오

* class [Collate](../collate/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


