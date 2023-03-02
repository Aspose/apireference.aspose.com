---
title: Geometry.AsImage
second_title: .NET API 참조를 위한 Aspose.GIS
description: Geometry 방법. 이 형상을 이미지 표현으로 내보냅니다.
type: docs
weight: 120
url: /ko/net/aspose.gis.geometries/geometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

이 형상을 이미지 표현으로 내보냅니다.

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| outputPath | AbstractPath | 출력 이미지의 경로입니다. |
| width | Measurement | 지도의 너비. |
| height | Measurement | 지도의 높이. |
| renderer | Renderer | 사용할 렌더러. |
| symbolizer | VectorSymbolizer | 렌더링에 사용할 심볼라이저입니다. 만약에`null`, 기본 심볼라이저가 사용됩니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 모든 인수`null`. |
| IOException | I/O 오류가 발생했습니다. |
| [GisException](../../../aspose.gis/gisexception/) | GIS 데이터를 처리하거나 읽는 동안 오류가 발생했습니다. |
| ArgumentException | 너비 또는 높이의 단위는!:Unit.MapUnits . |
| ArgumentOutOfRangeException | 너비 또는 높이는 음수이거나 0입니다. |

### 또한보십시오

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

이 형상을 이미지 표현으로 내보냅니다.

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| outputPath | String | 출력 이미지의 경로입니다. |
| width | Measurement | 지도의 너비. |
| height | Measurement | 지도의 높이. |
| renderer | Renderer | 사용할 렌더러. |
| symbolizer | VectorSymbolizer | 렌더링에 사용할 심볼라이저입니다. 만약에`null`, 기본 심볼라이저가 사용됩니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 모든 인수`null`. |
| IOException | I/O 오류가 발생했습니다. |
| [GisException](../../../aspose.gis/gisexception/) | GIS 데이터를 처리하거나 읽는 동안 오류가 발생했습니다. |
| ArgumentException | 너비 또는 높이의 단위는!:Unit.MapUnits . |
| ArgumentOutOfRangeException | 너비 또는 높이는 음수이거나 0입니다. |

### 또한보십시오

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

이 형상을 이미지 표현으로 내보냅니다.

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| width | Measurement | 지도의 너비. |
| height | Measurement | 지도의 높이. |
| renderer | Renderer | 사용할 렌더러. |
| symbolizer | VectorSymbolizer | 렌더링에 사용할 심볼라이저입니다. 만약에`null`, 기본 심볼라이저가 사용됩니다. |

### 반환 값

이미지를 스트림으로

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 모든 인수`null`. |
| IOException | I/O 오류가 발생했습니다. |
| [GisException](../../../aspose.gis/gisexception/) | GIS 데이터를 처리하거나 읽는 동안 오류가 발생했습니다. |
| ArgumentException | 너비 또는 높이의 단위는!:Unit.MapUnits . |
| ArgumentOutOfRangeException | 너비 또는 높이는 음수이거나 0입니다. |

### 또한보십시오

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* 네임스페이스 [Aspose.Gis.Geometries](../../geometry/)
* 집회 [Aspose.GIS](../../../)


