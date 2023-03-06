---
title: FileDriver.OpenLayer
second_title: .NET API 참조를 위한 Aspose.GIS
description: FileDriver 방법. 읽기용 레이어를 엽니다.
type: docs
weight: 90
url: /ko/net/aspose.gis/filedriver/openlayer/
---
## OpenLayer(string) {#openlayer_2}

읽기용 레이어를 엽니다.

```csharp
public VectorLayer OpenLayer(string path)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 파일 경로. |

### 반환 값

인스턴스[`VectorLayer`](../../vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 벡터 레이어를 열 수 없습니다(참조[`CanOpenLayers`](../canopenlayers/)). |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

읽기용 레이어를 엽니다.

```csharp
public VectorLayer OpenLayer(AbstractPath path)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |

### 반환 값

인스턴스[`VectorLayer`](../../vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 벡터 레이어를 열 수 없습니다(참조[`CanOpenLayers`](../canopenlayers/)). |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## OpenLayer(string, DriverOptions) {#openlayer_3}

읽기용 레이어를 엽니다.

```csharp
public VectorLayer OpenLayer(string path, DriverOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 파일 경로. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`VectorLayer`](../../vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 벡터 레이어를 열 수 없습니다(참조[`CanOpenLayers`](../canopenlayers/)). |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, DriverOptions) {#openlayer_1}

읽기용 레이어를 엽니다.

```csharp
public abstract VectorLayer OpenLayer(AbstractPath path, DriverOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`VectorLayer`](../../vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 벡터 레이어를 열 수 없습니다(참조[`CanOpenLayers`](../canopenlayers/)). |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)


