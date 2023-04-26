---
title: Class DocumentDuplex
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentDuplex 수업. 출력의 이중 특성을 설명합니다. 양면 인쇄 기능을 사용하면 용지 양면에 for 인쇄가 가능합니다. 각 문서는 별도로 이중화됩니다. DocumentDuplex 및 JobDuplexAllDocumentsContiguously는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https//docs.microsoft.com/enus/windows/win32/printdocs/ documentduplex
type: docs
weight: 700
url: /ko/net/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class

출력의 이중 특성을 설명합니다. 양면 인쇄 기능을 사용하면 용지 양면에 for 인쇄가 가능합니다. 각 문서는 별도로 이중화됩니다. DocumentDuplex 및 JobDuplexAllDocumentsContiguously는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/ documentduplex

```csharp
public sealed class DocumentDuplex : Duplex, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [DocumentDuplex](documentduplex/)(params DuplexOption[]) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`Feature`](../feature/) ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |

### 또한보십시오

* class [Duplex](../duplex/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


