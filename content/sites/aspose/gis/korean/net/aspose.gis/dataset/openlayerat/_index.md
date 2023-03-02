---
title: Dataset.OpenLayerAt
second_title: .NET API 참조를 위한 Aspose.GIS
description: Dataset 방법. 읽기를 위해 지정된 인덱스에서 레이어를 엽니다.
type: docs
weight: 120
url: /ko/net/aspose.gis/dataset/openlayerat/
---
## Dataset.OpenLayerAt method

읽기를 위해 지정된 인덱스에서 레이어를 엽니다.

```csharp
public abstract VectorLayer OpenLayerAt(int index, DriverOptions options = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| index | Int32 | 열려는 레이어의 인덱스입니다. |
| options | DriverOptions | 옵션을 엽니다. |

### 반환 값

레이어가 읽기용으로 열렸습니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 데이터 세트에 대한 잘못된 유형이 있습니다. |
| ArgumentOutOfRangeException | 인덱스가 범위를 벗어났습니다. |
| ArgumentException | 옵션 개체에 이 데이터 세트에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 레이어에서 피처를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* 네임스페이스 [Aspose.Gis](../../dataset/)
* 집회 [Aspose.GIS](../../../)


