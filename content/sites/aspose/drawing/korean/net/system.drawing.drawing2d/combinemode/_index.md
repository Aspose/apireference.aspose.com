---
title: Enum CombineMode
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Drawing2D.CombineMode 열거형. 서로 다른 클리핑 영역을 결합할 수 있는 방법을 지정합니다.
type: docs
weight: 160
url: /ko/net/system.drawing.drawing2d/combinemode/
---
## CombineMode enumeration

서로 다른 클리핑 영역을 결합할 수 있는 방법을 지정합니다.

```csharp
public enum CombineMode
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Replace | `0` | 하나의 클리핑 영역이 다른 영역으로 대체됩니다. |
| Intersect | `1` | 두 개의 클리핑 영역이 교차하여 결합됩니다. |
| Union | `2` | 두 개의 클리핑 영역은 둘 다 합집합하여 결합됩니다. |
| Xor | `3` | 두 개의 클리핑 영역은 둘 다 아닌 하나의 영역으로 둘러싸인 영역만 취하여 결합됩니다. |
| Exclude | `4` | 기존 지역이 기존 지역에서 제거되는 새 지역의 결과로 대체되도록 지정합니다. 다르게 말하면 새 지역은 기존 지역에서 제외됩니다. |
| Complement | `5` | 기존 영역이 새 영역에서 제거된 결과로 대체되도록 지정합니다. 다르게 말하면 기존 영역은 새 영역에서 제외됩니다. |

### 또한보십시오

* 네임스페이스 [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* 집회 [Aspose.Drawing](../../)


