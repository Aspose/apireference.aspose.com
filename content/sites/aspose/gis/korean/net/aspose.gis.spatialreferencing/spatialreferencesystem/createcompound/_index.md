---
title: SpatialReferenceSystem.CreateCompound
second_title: .NET API 참조를 위한 Aspose.GIS
description: SpatialReferenceSystem 방법. 복합 SRS를 만듭니다.
type: docs
weight: 340
url: /ko/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

복합 SRS를 만듭니다.

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| name | String | 새 SRS의 이름입니다. |
| head | SpatialReferenceSystem | 새로운 SRS의 헤드 SRS. |
| tail | SpatialReferenceSystem | 새로운 SRS의 꼬리 SRS. |
| identifier | Identifier | SRS에 첨부될 식별자. 식별자를 첨부해도 다른 SRS 매개변수는 수정되지 않습니다. 식별자와 SRS 매개변수의 일관성을 유지하는 것은 사용자의 책임입니다. |

### 반환 값

새로운 화합물 SRS.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 다음을 제외한 모든 인수*identifier* ~이다`null` . |
| InvalidOperationException | *head* 또는*tail* 복합 SRS 자체입니다. |

### 또한보십시오

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 집회 [Aspose.GIS](../../../)


