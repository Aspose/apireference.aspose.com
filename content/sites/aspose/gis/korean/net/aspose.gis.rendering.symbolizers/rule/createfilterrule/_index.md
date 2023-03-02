---
title: Rule.CreateFilterRule
second_title: .NET API 참조를 위한 Aspose.GIS
description: Rule 방법. 필터를 통과할 때마다 피처에 심볼라이저를 적용하는 새 규칙을 생성합니다.
type: docs
weight: 20
url: /ko/net/aspose.gis.rendering.symbolizers/rule/createfilterrule/
---
## Rule.CreateFilterRule method

필터를 통과할 때마다 피처에 심볼라이저를 적용하는 새 규칙을 생성합니다.

```csharp
public static Rule CreateFilterRule(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| filter | Func`2 | 심볼라이저를 사용해야 하는 경우를 결정합니다. |
| symbolizer | VectorSymbolizer | 적용할 심볼라이저입니다. |

### 반환 값

새 규칙 객체.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 필터는`null`. |

### 또한보십시오

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [Rule](../)
* 네임스페이스 [Aspose.Gis.Rendering.Symbolizers](../../rule/)
* 집회 [Aspose.GIS](../../../)


