---
title: Class RuleBasedSymbolizer
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Rendering.Symbolizers.RuleBasedSymbolizer 수업. 사용자 정의 규칙에 따라 피처 지오메트리에 심볼라이저를 적용합니다.
type: docs
weight: 1930
url: /ko/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/
---
## RuleBasedSymbolizer class

사용자 정의 규칙에 따라 피처 지오메트리에 심볼라이저를 적용합니다.

```csharp
public class RuleBasedSymbolizer : VectorSymbolizer, IReadOnlyList<Rule>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [RuleBasedSymbolizer](rulebasedsymbolizer/)() | 기본 생성자입니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/count/) { get; } | 규칙 수를 가져옵니다. |
| [Item](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/item/) { get; } | 지정된 인덱스에서 규칙을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add)(Rule) | 규칙을 추가합니다. |
| [Add](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/#add_1)(Func&lt;Feature, bool&gt;, VectorSymbolizer) | 새로 추가[`Rule`](../rule/) . |
| [AddElseRule](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/addelserule/)(VectorSymbolizer) | 어떤 필터링 규칙과도 일치하지 않는 피처에 적용될 심볼라이저를 추가합니다. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/rulebasedsymbolizer/getenumerator/)() | 규칙을 반복하는 열거자를 반환합니다. |

### 또한보십시오

* class [VectorSymbolizer](../vectorsymbolizer/)
* class [Rule](../rule/)
* 네임스페이스 [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* 집회 [Aspose.GIS](../../)


