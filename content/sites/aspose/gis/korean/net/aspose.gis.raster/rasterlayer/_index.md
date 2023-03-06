---
title: Class RasterLayer
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Raster.RasterLayer 수업. 래스터 레이어를 나타냅니다.
type: docs
weight: 1390
url: /ko/net/aspose.gis.raster/rasterlayer/
---
## RasterLayer class

래스터 레이어를 나타냅니다.

```csharp
public abstract class RasterLayer : IDisposable
```

## 속성

| 이름 | 설명 |
| --- | --- |
| abstract [BandCount](../../aspose.gis.raster/rasterlayer/bandcount/) { get; } | 래스터 레이어의 밴드 수를 가져옵니다. |
| [Bounds](../../aspose.gis.raster/rasterlayer/bounds/) { get; } | 래스터 경계를 가져옵니다. |
| abstract [CellSize](../../aspose.gis.raster/rasterlayer/cellsize/) { get; } | 래스터의 셀 또는 픽셀 크기를 가져옵니다. |
| abstract [Driver](../../aspose.gis.raster/rasterlayer/driver/) { get; } | 가져오기[`Driver`](./driver/) 이 레이어를 인스턴스화했습니다. |
| abstract [Height](../../aspose.gis.raster/rasterlayer/height/) { get; } | 래스터의 높이를 픽셀 단위로 가져옵니다. 행 수라고도 합니다. |
| abstract [NoDataValues](../../aspose.gis.raster/rasterlayer/nodatavalues/) { get; } | 래스터의 배경 또는 '데이터 없음'을 나타내는 값을 가져옵니다. |
| abstract [SpatialReferenceSystem](../../aspose.gis.raster/rasterlayer/spatialreferencesystem/) { get; } | 래스터의 공간 참조 시스템을 가져옵니다. Can be`null` 알 수 없는 경우. |
| abstract [UpperLeftX](../../aspose.gis.raster/rasterlayer/upperleftx/) { get; } | 래스터 왼쪽 위 모서리의 x 좌표를 가져옵니다. |
| abstract [UpperLeftY](../../aspose.gis.raster/rasterlayer/upperlefty/) { get; } | 래스터 왼쪽 위 모서리의 y 좌표를 가져옵니다. |
| abstract [Width](../../aspose.gis.raster/rasterlayer/width/) { get; } | 래스터의 너비를 픽셀 단위로 가져옵니다. 열 수라고도 합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop_1)(double[]) | 밴드 마스크를 사용하여 래스터 레이어를 자릅니다). |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop)(IGeometry, double[]) | 모양 형태(및 밴드 마스크)를 사용하여 래스터 레이어를 자릅니다. |
| [Dispose](../../aspose.gis.raster/rasterlayer/dispose/)() | 에서 사용하는 리소스를 해제합니다.`RasterLayer` . |
| abstract [GetBand](../../aspose.gis.raster/rasterlayer/getband/)(int) | 지정된 인덱스로 밴드를 가져옵니다. |
| virtual [GetExtent](../../aspose.gis.raster/rasterlayer/getextent/)() | 이 레이어의 공간 범위를 계산합니다. |
| [GetSpatialPoint](../../aspose.gis.raster/rasterlayer/getspatialpoint/)(int, int) | 지정된 열과 행을 공간 좌표로 변환합니다. |
| [GetStatistics](../../aspose.gis.raster/rasterlayer/getstatistics/)(int, bool) | 개수, 합계, 평균, 최소값, 최대값으로 구성된 요약 통계를 계산합니다. |
| [GetValues](../../aspose.gis.raster/rasterlayer/getvalues/)(int, int) | 지정된 셀의 값을 읽습니다. |
| [GetValuesDump](../../aspose.gis.raster/rasterlayer/getvaluesdump/)(RasterRect) | 지정된 블록의 값을 1차원 배열로 읽습니다. |
| [GetValuesOnExpression](../../aspose.gis.raster/rasterlayer/getvaluesonexpression/)(RasterRect, RasterReadExpression) | 표현식에서 밴드 값을 읽고 처리합니다. |
| override [ToString](../../aspose.gis.raster/rasterlayer/tostring/)() | 현재 개체를 나타내는 문자열을 반환합니다. |
| [Warp](../../aspose.gis.raster/rasterlayer/warp/)(WarpOptions) | 래스터 레이어를 다른 레이어로 워프합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Gis.Raster](../../aspose.gis.raster/)
* 집회 [Aspose.GIS](../../)


