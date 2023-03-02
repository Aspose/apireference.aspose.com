---
title: ShapefileDriver.EditLayer
second_title: .NET API 참조를 위한 Aspose.GIS
description: ShapefileDriver 방법. 편집을 위해 레이어를 엽니다.
type: docs
weight: 50
url: /ko/net/aspose.gis.formats.shapefile/shapefiledriver/editlayer/
---
## EditLayer(AbstractPath, DriverOptions) {#editlayer}

편집을 위해 레이어를 엽니다.

```csharp
public override VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../../aspose.gis/gisexception/) | 파일에서 기능을 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [ShapefileDriver](../)
* 네임스페이스 [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* 집회 [Aspose.GIS](../../../)

---

## EditLayer(string, ShapefileOptions) {#editlayer_3}

편집을 위해 레이어를 엽니다.

```csharp
public VectorLayer EditLayer(string path, ShapefileOptions options = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 파일 경로. |
| options | ShapefileOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 또한보십시오

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* 네임스페이스 [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* 집회 [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, ShapefileOptions) {#editlayer_1}

편집을 위해 레이어를 엽니다.

```csharp
public VectorLayer EditLayer(AbstractPath path, ShapefileOptions options = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| options | ShapefileOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 또한보십시오

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* 네임스페이스 [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* 집회 [Aspose.GIS](../../../)


