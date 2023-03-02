---
title: SpatialReferenceSystem.CreateLocal
second_title: .NET API 참조를 위한 Aspose.GIS
description: SpatialReferenceSystem 방법. 로컬 SRS를 만듭니다.
type: docs
weight: 370
url: /ko/net/aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/
---
## SpatialReferenceSystem.CreateLocal method

로컬 SRS를 만듭니다.

```csharp
public static LocalSpatialReferenceSystem CreateLocal(string name, LocalDatum datum, Unit unit, 
    ICollection<Axis> axises, Identifier identifier = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| name | String | SRS의 이름입니다. |
| datum | LocalDatum | SRS에서 사용할 데이텀입니다. |
| unit | Unit | SRS에서 사용할 단위입니다. |
| axises | ICollection`1 | SRS에서 사용할 축. 비어 있지 않아야 합니다. |
| identifier | Identifier | SRS에 첨부될 식별자. 식별자를 첨부해도 다른 SRS 매개변수는 수정되지 않습니다. 식별자와 SRS 매개변수의 일관성을 유지하는 것은 사용자의 책임입니다. |

### 반환 값

새로운 로컬 SRS.

### 예외

| 예외 | 상태 |
| --- | --- |
| InvalidOperationException | *axises* 비었다. |
| ArgumentNullException | 다음을 제외한 모든 인수*identifier* null입니다. |

### 또한보십시오

* class [LocalSpatialReferenceSystem](../../localspatialreferencesystem/)
* class [LocalDatum](../../localdatum/)
* class [Unit](../../unit/)
* class [Axis](../../axis/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* 네임스페이스 [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* 집회 [Aspose.GIS](../../../)


