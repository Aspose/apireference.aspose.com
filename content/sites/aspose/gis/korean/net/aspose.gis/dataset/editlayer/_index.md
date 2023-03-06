---
title: Dataset.EditLayer
second_title: .NET API 참조를 위한 Aspose.GIS
description: Dataset 방법. 편집을 위해 지정된 이름의 레이어를 엽니다.
type: docs
weight: 90
url: /ko/net/aspose.gis/dataset/editlayer/
---
## Dataset.EditLayer method

편집을 위해 지정된 이름의 레이어를 엽니다.

```csharp
public abstract VectorLayer EditLayer(string name, DriverOptions options = null, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| name | String | 편집할 레이어의 이름입니다. |
| options | DriverOptions | 옵션을 엽니다. |
| spatialReferenceSystem | SpatialReferenceSystem | 새로운 기하학을 위한 공간 참조 시스템. |

### 반환 값

편집을 위해 열린 레이어입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 지정된 이름의 레이어가 존재하지 않습니다. 옵션 개체에 이 데이터 세트에 대한 잘못된 유형이 있습니다. |
| ArgumentException | 옵션 개체에 이 데이터 세트에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 그 이름은`null`. |
| [GisException](../../gisexception/) | 레이어에서 피처를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* 네임스페이스 [Aspose.Gis](../../dataset/)
* 집회 [Aspose.GIS](../../../)


