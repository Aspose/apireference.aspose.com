---
title: Class AnswerSheetConfig
second_title: .NET API 참조용 Aspose.OMR
description: Aspose.OMR.Generation.Config.Elements.AnswerSheetConfig 수업. AnswerSheet 요소를 나타냅니다. 열과 행으로 그룹화된 선택 상자를 추가할 수 있습니다. 문제가 서로 가까이 있기 때문에 한 페이지에 많은 문제를 맞추려면 답안지를 사용하세요.
type: docs
weight: 90
url: /ko/net/aspose.omr.generation.config.elements/answersheetconfig/
---
## AnswerSheetConfig class

AnswerSheet 요소를 나타냅니다. 열과 행으로 그룹화된 선택 상자를 추가할 수 있습니다. 문제가 서로 가까이 있기 때문에 한 페이지에 많은 문제를 맞추려면 답안지를 사용하세요.

```csharp
public class AnswerSheetConfig : BaseConfig
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [AnswerSheetConfig](answersheetconfig/)() | 기본 생성자입니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [AnswersCount](../../aspose.omr.generation.config.elements/answersheetconfig/answerscount/) { get; set; } | 답안지의 각 질문에 대한 답변 옵션 수. |
| [AnswersValues](../../aspose.omr.generation.config.elements/answersheetconfig/answersvalues/) { get; set; } | 각 값은 거품 내부의 기호를 나타냅니다. 카운트가 같아야 함[`AnswersCount`](./answerscount/) 예: 새 문자열[] {"A", "B", "C", "D"} 예: 새 문자열[] {"1", "2", "3", "4"} |
| [BubbleType](../../aspose.omr.generation.config.elements/answersheetconfig/bubbletype/) { get; set; } | 거품의 유형 |
| [Column](../../aspose.omr.generation.config.elements/answersheetconfig/column/) { get; set; } | 시트를 그릴 열을 나타냅니다 |
| [ColumnsCount](../../aspose.omr.generation.config.elements/answersheetconfig/columnscount/) { get; set; } | 그릴 열 수를 설정합니다. |
| [ElementsCount](../../aspose.omr.generation.config.elements/answersheetconfig/elementscount/) { get; set; } | 답안지의 총 질문 수를 결정합니다. |
| override [Name](../../aspose.omr.generation.config.elements/answersheetconfig/name/) { get; set; } | 답안지 이름 |
| [StartId](../../aspose.omr.generation.config.elements/answersheetconfig/startid/) { get; set; } | 질문 numbering 의 시작 색인 |
| override [Type](../../aspose.omr.generation.config.elements/answersheetconfig/type/) { get; set; } | omr 요소의 유형. JSON 직렬화를 위한 필수 필드. |
| [VerticalMargin](../../aspose.omr.generation.config.elements/answersheetconfig/verticalmargin/) { get; set; } | 답안지 세로 여백. 픽셀 단위로 설정합니다. |

## 필드

| 이름 | 설명 |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/answersheetconfig/bubblesize/) | 거품의 크기 |

### 또한보십시오

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* 네임스페이스 [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* 집회 [Aspose.OMR](../../)


