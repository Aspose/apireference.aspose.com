---
title: Class DocumentStaple
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentStaple 수업. 출력의 스테이플링 특성을 설명합니다. 각 문서는 별도로 스테이플됩니다. TheJobStapleAllDocuments 그리고DocumentStaple키워드는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https//docs.microsoft.com/enus/windows/win32/printdocs/documentstaple
type: docs
weight: 830
url: /ko/net/aspose.page.xps.xpsmetadata/documentstaple/
---
## DocumentStaple class

출력의 스테이플링 특성을 설명합니다. 각 문서는 별도로 스테이플됩니다. The[`JobStapleAllDocuments`](../jobstaplealldocuments/) 그리고`DocumentStaple`키워드는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple

```csharp
public sealed class DocumentStaple : Staple, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [DocumentStaple](documentstaple/)(params StapleOption[]) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`Feature`](../feature/) ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |

### 또한보십시오

* class [Staple](../staple/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


