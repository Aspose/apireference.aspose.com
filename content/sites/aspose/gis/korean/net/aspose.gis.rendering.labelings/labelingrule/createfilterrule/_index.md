---
title: LabelingRule.CreateFilterRule
second_title: .NET API 참조를 위한 Aspose.GIS
description: LabelingRule 방법. 필터를 통과할 때마다 기능에 레이블을 적용하는 새 규칙을 생성합니다.
type: docs
weight: 20
url: /ko/net/aspose.gis.rendering.labelings/labelingrule/createfilterrule/
---
## LabelingRule.CreateFilterRule method

필터를 통과할 때마다 기능에 레이블을 적용하는 새 규칙을 생성합니다.

```csharp
public static LabelingRule CreateFilterRule(Func<Feature, bool> filter, Labeling labeling)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| filter | Func`2 | 레이블 지정을 사용해야 하는 경우를 결정합니다. |
| labeling | Labeling | 적용할 라벨링. |

### 반환 값

새 LabelingRule 객체.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 필터는`null`. |

### 또한보십시오

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [LabelingRule](../)
* 네임스페이스 [Aspose.Gis.Rendering.Labelings](../../labelingrule/)
* 집회 [Aspose.GIS](../../../)


