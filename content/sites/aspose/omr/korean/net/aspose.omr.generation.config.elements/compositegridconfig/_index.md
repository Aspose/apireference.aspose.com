---
title: Class CompositeGridConfig
second_title: .NET API 참조용 Aspose.OMR
description: Aspose.OMR.Generation.Config.Elements.CompositeGridConfig 수업. 그리드 요소. 거품 배열을 생성합니다. 채워진 각 거품은 복합 value 에서 하나의 기호를 나타냅니다. 표시된 모든 기호는 단일 value 로 연결됩니다.
type: docs
weight: 120
url: /ko/net/aspose.omr.generation.config.elements/compositegridconfig/
---
## CompositeGridConfig class

그리드 요소. 거품 배열을 생성합니다. 채워진 각 거품은 복합 value 에서 하나의 기호를 나타냅니다. 표시된 모든 기호는 단일 value 로 연결됩니다.

```csharp
public class CompositeGridConfig : BaseConfig
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [CompositeGridConfig](compositegridconfig/)() | 기본 생성자입니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [BubbleType](../../aspose.omr.generation.config.elements/compositegridconfig/bubbletype/) { get; set; } | 거품의 유형 |
| [Column](../../aspose.omr.generation.config.elements/compositegridconfig/column/) { get; set; } | 다중 열 부모에서 요소를 그릴 때 - 위치를 나타냅니다. |
| [ColumnsCount](../../aspose.omr.generation.config.elements/compositegridconfig/columnscount/) { get; set; } | 그리드 내부의 열 수. 각 열은 결과 value 의 단일 기호를 나타냅니다. 금액은 다음과 같아야 합니다.[`ExtraRow`](./extrarow/) 열의 양 |
| [DisplayHint](../../aspose.omr.generation.config.elements/compositegridconfig/displayhint/) { get; set; } | 이 그리드의 이름을 표시해야 합니다 |
| [ExtraRow](../../aspose.omr.generation.config.elements/compositegridconfig/extrarow/) { get; set; } | 기본 값 위에 배치될 열별 값 -[`Values`](./values/) . 2차원 배열로 표시됩니다. 첫 번째 - 행. 두 번째 - column. 각 문자열은 거품 안에 있는 텍스트를 나타냅니다. 문자열이 null이면 거품이 배치되지 않습니다. 열의 양은 다음과 같아야 합니다.[`ColumnsCount`](./columnscount/) |
| [GridAlignment](../../aspose.omr.generation.config.elements/compositegridconfig/gridalignment/) { get; set; } | 그리드 정렬, page 에서 그리드를 그려야 하는 위치를 나타냅니다. |
| [GridOrientation](../../aspose.omr.generation.config.elements/compositegridconfig/gridorientation/) { get; set; } | 그리드 방향: 수평 또는 수직. 자식 요소가 어떻게 배치되어야 하는지 나타냅니다 |
| [HeaderBorderColor](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordercolor/) { get; set; } | 정사각형 테두리 color |
| [HeaderBorderSize](../../aspose.omr.generation.config.elements/compositegridconfig/headerbordersize/) { get; set; } | 정사각형 테두리 크기 |
| [HeaderType](../../aspose.omr.generation.config.elements/compositegridconfig/headertype/) { get; set; } | grid 시작 부분에 그릴 요소 유형을 나타냅니다. |
| override [Name](../../aspose.omr.generation.config.elements/compositegridconfig/name/) { get; set; } | 그리드 이름. recognition 에서 식별자로 사용 |
| [RotationAngle](../../aspose.omr.generation.config.elements/compositegridconfig/rotationangle/) { get; set; } | 자체 축을 중심으로 그리드 요소의 회전을 설명합니다. "90" - CompositeGrid를 90도 회전 "-90" - ComopositeGrid를 -90도로 회전 |
| override [Type](../../aspose.omr.generation.config.elements/compositegridconfig/type/) { get; set; } | omr 요소의 유형. JSON 직렬화를 위한 필수 필드. |
| [Values](../../aspose.omr.generation.config.elements/compositegridconfig/values/) { get; set; } | 각 열에서 가능한 기호를 설명하는 문자열 모음입니다. 열별 값은 다음 위치에 있습니다.[`ExtraRow`](./extrarow/) |
| [XPosition](../../aspose.omr.generation.config.elements/compositegridconfig/xposition/) { get; set; } | 페이지의 그리드 X 위치는 alignment 를 재정의합니다. |
| [YPosition](../../aspose.omr.generation.config.elements/compositegridconfig/yposition/) { get; set; } | 페이지의 그리드 Y 위치는 alignment 를 재정의합니다. |

## 필드

| 이름 | 설명 |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/compositegridconfig/bubblesize/) | 거품의 크기 |
| [VerticalMargin](../../aspose.omr.generation.config.elements/compositegridconfig/verticalmargin/) | 줄 사이의 여백 |

### 또한보십시오

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* 네임스페이스 [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* 집회 [Aspose.OMR](../../)


