---
title: Class DocumentInputBin
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin 수업. 장치에 설치된 입력 빈 또는 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. TheJobInputBin DocumentInputBin  그리고PageInputBin 키워드는 상호 배타적입니다. 둘 다 PrintTicket 또는 인쇄 기능 문서에서 동시에 지정하면 안 됩니다. https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 730
url: /ko/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

장치에 설치된 입력 빈 또는 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. The[`JobInputBin`](../jobinputbin/) ,`DocumentInputBin` , 그리고[`PageInputBin`](../pageinputbin/) 키워드는 상호 배타적입니다. 둘 다 PrintTicket 또는 인쇄 기능 문서에서 동시에 지정하면 안 됩니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | 새 인스턴스를 만듭니다. |

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
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


