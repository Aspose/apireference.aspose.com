---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule enum"
linktitle: "XpsFillRule"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule enum. C++에서 PathGeometry 요소의 FillRule 속성에 대한 유효한 값입니다."
type: docs
weight: 4900
url: /ko/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


PathGeometry 요소의 FillRule 속성에 대한 유효한 값.

```cpp
enum class XpsFillRule
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| EvenOdd | 0 | 이 규칙은 캔버스상의 점에 대해 임의 방향으로 점에서 무한대까지 광선을 그려 해당 형태의 선분이 광선을 교차하는 횟수를 셈으로써 점의 “insideness”를 결정합니다. 이 횟수가 홀수이면 점은 내부에 있고, 짝수이면 외부에 있습니다. |
| NonZero | 1 | 이 규칙은 캔버스상의 점에서 임의의 방향으로 무한대까지 광선을 그린 다음, 도형의 세그먼트가 광선을 교차하는 위치를 검사하여 점의 “내부 여부”를 결정합니다. 교차 횟수를 0부터 시작하여, 세그먼트가 왼쪽에서 오른쪽으로 광선을 통과할 때마다 1을 더하고, 오른쪽에서 왼쪽으로 통과할 때마다 1을 뺍니다. 교차 횟수를 계산한 후 결과가 0이면 점은 경로 밖에 있으며, 그렇지 않으면 내부에 있습니다. |

## 또 보기

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
