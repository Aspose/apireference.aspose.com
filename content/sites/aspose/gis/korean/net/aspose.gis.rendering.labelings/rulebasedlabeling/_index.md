---
title: Class RuleBasedLabeling
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Rendering.Labelings.RuleBasedLabeling 수업. 사용자 정의 규칙에 따라 기능에 레이블을 적용합니다.
type: docs
weight: 1690
url: /ko/net/aspose.gis.rendering.labelings/rulebasedlabeling/
---
## RuleBasedLabeling class

사용자 정의 규칙에 따라 기능에 레이블을 적용합니다.

```csharp
public class RuleBasedLabeling : Labeling, IReadOnlyList<LabelingRule>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [RuleBasedLabeling](rulebasedlabeling/)() | 기본 생성자입니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Count](../../aspose.gis.rendering.labelings/rulebasedlabeling/count/) { get; } | 규칙 수를 가져옵니다. |
| [Item](../../aspose.gis.rendering.labelings/rulebasedlabeling/item/) { get; } | 지정된 인덱스에서 규칙을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.gis.rendering.labelings/rulebasedlabeling/add/#add)(LabelingRule) | 규칙을 추가합니다. |
| [Add](../../aspose.gis.rendering.labelings/rulebasedlabeling/add/#add_1)(Func&lt;Feature, bool&gt;, Labeling) | 새로 추가[`LabelingRule`](../labelingrule/) . |
| [AddElseRule](../../aspose.gis.rendering.labelings/rulebasedlabeling/addelserule/)(Labeling) | 필터링 규칙과 일치하지 않는 기능에 적용할 레이블을 추가합니다. |
| [GetEnumerator](../../aspose.gis.rendering.labelings/rulebasedlabeling/getenumerator/)() | 규칙을 반복하는 열거자를 반환합니다. |

### 또한보십시오

* class [Labeling](../labeling/)
* class [LabelingRule](../labelingrule/)
* 네임스페이스 [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* 집회 [Aspose.GIS](../../)


