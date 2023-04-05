---
title: Enum XpsFillRule
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsModel.XpsFillRule 열거형. 유효한 PathGeometry 요소의 FillRule 속성 값입니다.
type: docs
weight: 3070
url: /ko/net/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enumeration

유효한 PathGeometry 요소의 FillRule 속성 값입니다.

```csharp
public enum XpsFillRule
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| EvenOdd | `0` | 이 규칙은 ray 를 점에서 임의의 방향으로 무한대로 그리고 주어진 모양에서 교차하는 세그먼트 의 수를 세어 캔버스에 있는 점의 "내부"를 결정합니다. 이 숫자가 홀수이면 점은 내부 입니다. 짝수이면 포인트가 외부에 있습니다. |
| NonZero | `1` | 이 규칙은 어떤 방향에서든 점에서 무한대까지 ray 를 그린 다음 모양의 세그먼트가 광선과 교차하는 위치 를 조사하여 캔버스에 있는 점의 "내부"를 결정합니다. 카운트 0부터 시작하여 세그먼트가 광선을 왼쪽에서 오른쪽으로 교차할 때마다 one 를 더하고 경로 세그먼트가 광선을 오른쪽에서 왼쪽으로 교차할 때마다 씩 뺍니다. 교차점을 계산한 후 결과가 0이면 점이 경로 외부에 있는 것입니다. 그렇지 않으면 내부에 있습니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 집회 [Aspose.Page](../../)


