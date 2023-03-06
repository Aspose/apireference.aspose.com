---
title: GeoTiffDriver.OpenLayer
second_title: .NET API 참조를 위한 Aspose.GIS
description: GeoTiffDriver 방법. 읽기용 레이어를 엽니다.
type: docs
weight: 20
url: /ko/net/aspose.gis.formats.geotiff/geotiffdriver/openlayer/
---
## OpenLayer(AbstractPath, RasterDriverOptions) {#openlayer_2}

읽기용 레이어를 엽니다.

```csharp
public override RasterLayer OpenLayer(AbstractPath path, RasterDriverOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| options | RasterDriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버가 래스터 레이어를 열 수 없습니다(참조[`CanOpenLayers`](../canopenlayers/)). |

### 또한보십시오

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [RasterDriverOptions](../../../aspose.gis/rasterdriveroptions/)
* class [GeoTiffDriver](../)
* 네임스페이스 [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* 집회 [Aspose.GIS](../../../)

---

## OpenLayer(string, GeoTiffOptions) {#openlayer_4}

읽기용 레이어를 엽니다.

```csharp
public RasterLayer OpenLayer(string path, GeoTiffOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 파일 경로. |
| options | GeoTiffOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 또한보십시오

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [GeoTiffOptions](../../geotiffoptions/)
* class [GeoTiffDriver](../)
* 네임스페이스 [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* 집회 [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, GeoTiffOptions) {#openlayer_1}

읽기용 레이어를 엽니다.

```csharp
public RasterLayer OpenLayer(AbstractPath path, GeoTiffOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| options | GeoTiffOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### 또한보십시오

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [GeoTiffOptions](../../geotiffoptions/)
* class [GeoTiffDriver](../)
* 네임스페이스 [Aspose.Gis.Formats.GeoTiff](../../geotiffdriver/)
* 집회 [Aspose.GIS](../../../)


