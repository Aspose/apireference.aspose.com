---
title: Class LabelingRule
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Rendering.Labelings.LabelingRule 수업. 에 대한 사용자 정의 규칙RuleBasedLabeling .
type: docs
weight: 1630
url: /ko/net/aspose.gis.rendering.labelings/labelingrule/
---
## LabelingRule class

에 대한 사용자 정의 규칙[`RuleBasedLabeling`](../rulebasedlabeling/) .

```csharp
public class LabelingRule
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Filter](../../aspose.gis.rendering.labelings/labelingrule/filter/) { get; } | "filter-rule"이 기능에 레이블 지정을 적용해야 하는지 결정합니다. 반환하는 경우`true` 라벨링이 사용됩니다. 그렇지 않으면 기능을 건너뜁니다. |
| [IsElseRule](../../aspose.gis.rendering.labelings/labelingrule/iselserule/) { get; } | 이 규칙이 "else-rule"인지 여부를 나타내는 값을 가져옵니다. |
| [IsFilterRule](../../aspose.gis.rendering.labelings/labelingrule/isfilterrule/) { get; } | 이 규칙이 "filter-rule"인지 여부를 나타내는 값을 가져옵니다. |
| [Labeling](../../aspose.gis.rendering.labelings/labelingrule/labeling/) { get; } | 기능에 적용할 레이블입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.labelings/labelingrule/createelserule/)(Labeling) | 필터 규칙과 일치하지 않을 때마다 기능에 레이블을 적용하는 새 규칙을 생성합니다. |
| static [CreateFilterRule](../../aspose.gis.rendering.labelings/labelingrule/createfilterrule/)(Func&lt;Feature, bool&gt;, Labeling) | 필터를 통과할 때마다 기능에 레이블을 적용하는 새 규칙을 생성합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* 집회 [Aspose.GIS](../../)


