---
title: Class Rule
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Rendering.Symbolizers.Rule 수업. 에 대한 사용자 정의 규칙RuleBasedSymbolizer .
type: docs
weight: 1920
url: /ko/net/aspose.gis.rendering.symbolizers/rule/
---
## Rule class

에 대한 사용자 정의 규칙[`RuleBasedSymbolizer`](../rulebasedsymbolizer/) .

```csharp
public class Rule
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Filter](../../aspose.gis.rendering.symbolizers/rule/filter/) { get; } | "filter-rule"이 기능에 심볼라이저를 적용해야 하는지 여부를 결정합니다. 반환되는 경우`true` 심볼라이저가 사용됩니다. 그렇지 않으면 기능을 건너뜁니다. |
| [IsElseRule](../../aspose.gis.rendering.symbolizers/rule/iselserule/) { get; } | 이 규칙이 "else-rule"인지 여부를 나타내는 값을 가져옵니다. |
| [IsFilterRule](../../aspose.gis.rendering.symbolizers/rule/isfilterrule/) { get; } | 이 규칙이 "filter-rule"인지 여부를 나타내는 값을 가져옵니다. |
| [Symbolizer](../../aspose.gis.rendering.symbolizers/rule/symbolizer/) { get; } | 피처에 적용할 심볼라이저입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [CreateElseRule](../../aspose.gis.rendering.symbolizers/rule/createelserule/)(VectorSymbolizer) | 필터 규칙과 일치하지 않을 때마다 피처에 심볼라이저를 적용하는 새 규칙을 생성합니다. |
| static [CreateFilterRule](../../aspose.gis.rendering.symbolizers/rule/createfilterrule/)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | 필터를 통과할 때마다 피처에 심볼라이저를 적용하는 새 규칙을 생성합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* 집회 [Aspose.GIS](../../)


