---
title: Class DocumentHolePunch
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentHolePunch 수업. 출력의 홀 펀칭 특성을 설명합니다. 각 문서는 별도로 펀칭됩니다. TheJobHolePunch 그리고DocumentHolePunch 키워드는 상호 배타적입니다. PrintTicket 또는 인쇄 기능 문서에서 둘 다 동시에 지정하면 안 됩니다. https//docs.microsoft.com/enus/windows/win32/printdocs/documentholepunch
type: docs
weight: 710
url: /ko/net/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class

출력의 홀 펀칭 특성을 설명합니다. 각 문서는 별도로 펀칭됩니다. The[`JobHolePunch`](../jobholepunch/) 그리고`DocumentHolePunch` 키워드는 상호 배타적입니다. PrintTicket 또는 인쇄 기능 문서에서 둘 다 동시에 지정하면 안 됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch

```csharp
public sealed class DocumentHolePunch : HolePunch, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [DocumentHolePunch](documentholepunch/)(params HolePunchOption[]) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`Feature`](../feature/) ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |

### 또한보십시오

* class [HolePunch](../holepunch/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


