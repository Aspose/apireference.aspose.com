---
title: Class FileGdbCoordinatePrecisionGrid
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid 수업. FileGDB 레이어 내부의 좌표 정밀 그리드.
type: docs
weight: 250
url: /ko/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

FileGDB 레이어 내부의 좌표 정밀 그리드.

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | 기본 생성자입니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | M 좌표의 원점을 가져오거나 설정합니다. 로 설정한 경우`null` 기본값이 사용됩니다. |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | M 좌표의 스케일을 가져오거나 설정합니다. 로 설정한 경우`null` 기본값이 사용됩니다. |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | X 좌표의 원점을 가져오거나 설정합니다. 로 설정한 경우`null` 기본값이 사용됩니다. |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | X 및 Y 좌표의 배율을 가져오거나 설정합니다. 로 설정한 경우`null` 기본값이 사용됩니다. |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | Y 좌표의 원점을 가져오거나 설정합니다. 로 설정한 경우`null` 기본값이 사용됩니다. |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Z 좌표의 원점을 가져오거나 설정합니다. 로 설정한 경우`null` 기본값이 사용됩니다. |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Z 좌표의 스케일을 가져오거나 설정합니다. 로 설정한 경우`null` 기본값이 사용됩니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | 새로 만들기`FileGdbCoordinatePrecisionGrid` 사각형 내의 모든 값을 표현할 수 있습니다. |

### 비고

좌표 정밀도 그리드는 FileGDB 레이어에서 좌표의 유효한 도메인과 해상도를 정의합니다. Origin은 공간에서 좌표 정밀도 그리드에 대한 경로를 정의합니다. 스케일은 해상도를 정의합니다(더 큰 스케일이 더 정확한 값이 기록됨). 정밀도 그리드는 좌표에 대한 유효한 값 범위를 지정합니다. 모든 좌표는[`VectorLayer`](../../aspose.gis/vectorlayer/)이 범위 내에 있어야 합니다. 좌표가 범위를 벗어나면 나중에 읽기 오류가 발생할 수 있으며 ArcGIS에서 잘못 처리됩니다. 속성을 지정하지 않으면(속성을 유지하십시오.`null` ) 기본값이 사용됩니다. 기본값은 다음에 따라 다릅니다.[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) 의[`VectorLayer`](../../aspose.gis/vectorlayer/) . 지리적인 경우[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) 기본값은 입니다. 투영된 경우[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) 기본값은 입니다. 여기서`XY 공차` ,`ZTolerance` 그리고`MT 공차` 값은[`FileGdbOptions`](../filegdboptions/) .

```csharp
XMin = XOrigin
YMin = YOrigin
ZMin = ZOrigin
MMin = MOrigin
XMax = XOrigin + 9e+15 / XYScale
YMax = YOrigin + 9e+15 / XYScale
ZMax = ZOrigin + 9e+15 / ZScale
MMax = MOrigin + 9e+15 / MScale
```

```csharp
XOrigin = -400
YOrigin = -400
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1e9
ZScale  = 1 / ZTolerance * 10
MScale  = 1 / MTolerance * 10
```

```csharp
XOrigin = -2147483647
YOrigin = -2147483647
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1 / XYTolerance * 10
ZScale  = 1 / ZTolerance  * 10
MScale  = 1 / MTolerance  * 10
```

### 또한보십시오

* 네임스페이스 [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* 집회 [Aspose.GIS](../../)


