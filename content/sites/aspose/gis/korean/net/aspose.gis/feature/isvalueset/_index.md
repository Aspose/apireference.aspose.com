---
title: Feature.IsValueSet
second_title: .NET API 참조를 위한 Aspose.GIS
description: Feature 방법. 이 기능에 속성 값이 설정되어 있는지 확인합니다.
type: docs
weight: 90
url: /ko/net/aspose.gis/feature/isvalueset/
---
## Feature.IsValueSet method

이 기능에 속성 값이 설정되어 있는지 확인합니다.

```csharp
public bool IsValueSet(string attributeName)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| attributeName | String | 속성의 이름입니다. |

### 반환 값

`true`지정된 속성에 대한 값이 설정된 경우; 그렇지 않으면,`false` .

### 예외

| 예외 | 상태 |
| --- | --- |
| InvalidOperationException | 속성이 잠겨 있지 않습니다. |
| ArgumentException | 이 이름을 가진 속성이 이 레이어에 없습니다. |
| ArgumentNullException | 속성 이름은`null`. |

### 또한보십시오

* class [Feature](../)
* 네임스페이스 [Aspose.Gis](../../feature/)
* 집회 [Aspose.GIS](../../../)


