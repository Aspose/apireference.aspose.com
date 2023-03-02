---
title: RasterLayer.Crop
second_title: .NET API 참조를 위한 Aspose.GIS
description: RasterLayer 방법. 모양 형태및 밴드 마스크를 사용하여 래스터 레이어를 자릅니다.
type: docs
weight: 110
url: /ko/net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

모양 형태(및 밴드 마스크)를 사용하여 래스터 레이어를 자릅니다.

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| geometry | IGeometry | 기하학은 모양 형태를 나타냅니다. |
| masks | Double[] | 자르기 레이어 마스크 |

### 반환 값

자른 래스터 레이어. 교차점을 찾지 못한 경우 반환`null`.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는 null일 수 없습니다. 매개변수 이름: 기하학. |
| NotSupportedException | 인수는 다각형 또는 표면과 다를 수 없습니다. 매개변수 이름: 기하학. |
| InvalidOperationException | 원본 레이어는 다른 CropRasterLayer가 될 수 없습니다. |
| [GisException](../../../aspose.gis/gisexception/) | 레이어를 자르는 동안 오류가 발생했습니다. |

### 또한보십시오

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* 네임스페이스 [Aspose.Gis.Raster](../../rasterlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

밴드 마스크를 사용하여 래스터 레이어를 자릅니다).

```csharp
public RasterLayer Crop(double[] masks)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| masks | Double[] | 자르기 레이어 마스크 |

### 반환 값

자른 래스터 레이어. 교차점을 찾지 못한 경우 반환`null`.

### 예외

| 예외 | 상태 |
| --- | --- |
| InvalidOperationException |  |

### 또한보십시오

* class [RasterLayer](../)
* 네임스페이스 [Aspose.Gis.Raster](../../rasterlayer/)
* 집회 [Aspose.GIS](../../../)


