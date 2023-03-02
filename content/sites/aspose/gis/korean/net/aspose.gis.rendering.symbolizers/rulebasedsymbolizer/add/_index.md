---
title: RuleBasedSymbolizer.Add
second_title: .NET API 참조를 위한 Aspose.GIS
description: RuleBasedSymbolizer 방법. 새로 추가Rule .
type: docs
weight: 40
url: /ko/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

새로 추가[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| filter | Func`2 | 피처에 심볼라이저를 적용해야 하는 시기를 결정합니다. |
| symbolizer | VectorSymbolizer | 다음과 같은 경우 기능에 적용할 심볼라이저*filter* 참을 반환합니다. |

### 또한보십시오

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* 네임스페이스 [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* 집회 [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

규칙을 추가합니다.

```csharp
public void Add(Rule rule)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rule | Rule | 추가할 규칙입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |

### 또한보십시오

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* 네임스페이스 [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* 집회 [Aspose.GIS](../../../)


