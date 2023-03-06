---
title: SpatialReferenceSystem.CreateVertical
second_title: .NET API 참조를 위한 Aspose.GIS
description: SpatialReferenceSystem 방법. 수직 SRS를 생성합니다.
type: docs
weight: 390
url: /ko/net/aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/
---
## SpatialReferenceSystem.CreateVertical method

수직 SRS를 생성합니다.

```csharp
public static VerticalSpatialReferenceSystem CreateVertical(string name, 
    VerticalDatum verticalDatum, Unit verticalUnit = null, Axis verticalAxis = null, 
    Identifier identifier = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| name | String | SRS의 이름입니다. 만약에`null` . |
| verticalDatum | VerticalDatum | SRS에서 사용할 데이텀입니다. |
| verticalUnit | Unit | SRS에서 사용할 단위. 만약에`null` ,[`Meter`](../../unit/meter/) 사용됩니다. |
| verticalAxis | Axis | SRS에서 사용되는 "위" 또는 "아래" 방향의 축. 만약에`null` , 위쪽 방향의 축이 사용됩니다. |
| identifier | Identifier | SRS에 첨부될 식별자. 식별자를 첨부해도 다른 SRS 매개변수는 수정되지 않습니다. 식별자와 SRS 매개변수의 일관성을 유지하는 것은 사용자의 책임입니다. |

### 반환 값

새로운 수직 SRS.

### 예외

| 예외 | 상태 |
| --- | --- |
| InvalidOperationException | *verticalAxis* 방향이 위아래가 아닙니다. |
| ArgumentNullException | 일부 필수 매개변수는 null입니다. |

### 또한보십시오

* class [VerticalSpatialReferenceSystem](../../verticalspatialreferencesystem/)
* class [VerticalDatum](../../verticaldatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 집회 [Aspose.GIS](../../../)


