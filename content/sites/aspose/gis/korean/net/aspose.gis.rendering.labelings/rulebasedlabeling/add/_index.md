---
title: RuleBasedLabeling.Add
second_title: .NET API 참조를 위한 Aspose.GIS
description: RuleBasedLabeling 방법. 새로 추가LabelingRule .
type: docs
weight: 40
url: /ko/net/aspose.gis.rendering.labelings/rulebasedlabeling/add/
---
## Add(Func&lt;Feature, bool&gt;, Labeling) {#add_1}

새로 추가[`LabelingRule`](../../labelingrule/) .

```csharp
public void Add(Func<Feature, bool> filter, Labeling labeling)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| filter | Func`2 | 기능에 레이블 지정을 적용해야 하는 시기를 결정합니다. |
| labeling | Labeling | 다음과 같은 경우 기능에 적용할 라벨 지정*filter* 참을 반환합니다. |

### 또한보십시오

* class [Feature](../../../aspose.gis/feature/)
* class [Labeling](../../labeling/)
* class [RuleBasedLabeling](../)
* 네임스페이스 [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* 집회 [Aspose.GIS](../../../)

---

## Add(LabelingRule) {#add}

규칙을 추가합니다.

```csharp
public void Add(LabelingRule rule)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| rule | LabelingRule | 추가할 규칙입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |

### 또한보십시오

* class [LabelingRule](../../labelingrule/)
* class [RuleBasedLabeling](../)
* 네임스페이스 [Aspose.Gis.Rendering.Labelings](../../rulebasedlabeling/)
* 집회 [Aspose.GIS](../../../)


