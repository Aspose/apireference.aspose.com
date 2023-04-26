---
title: Class DocumentBinding
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentBinding 수업. 바인딩 방법을 설명합니다. 각 문서는 별도로 바인딩됩니다. DocumentBinding 및 JobBindAllDocuments는 상호 배타적입니다. 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https//docs.microsoft.com/enus/windows/win32/printdocs/documentbinding
type: docs
weight: 570
url: /ko/net/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class

바인딩 방법을 설명합니다. 각 문서는 별도로 바인딩됩니다. DocumentBinding 및 JobBindAllDocuments는 상호 배타적입니다. 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding

```csharp
public sealed class DocumentBinding : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [DocumentBinding](documentbinding/)(params BindingOption[]) | 새 인스턴스를 만듭니다. |

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
| class [BindingGutter](documentbinding.bindinggutter/) | 를 지정하는 방법을 설명합니다. 점수가 매겨진 속성 값, 정수 값 또는 매개변수. |
| class [BindingOption](documentbinding.bindingoption/) | 의 옵션을 나타냅니다.`DocumentBinding` 기능. |
| interface [IBindingOptionItem](documentbinding.ibindingoptionitem/) | 인터페이스[`BindingOption`](../documentbinding.bindingoption/) 항목. |

### 또한보십시오

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


