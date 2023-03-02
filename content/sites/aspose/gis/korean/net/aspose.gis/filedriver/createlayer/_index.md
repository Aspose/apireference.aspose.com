---
title: FileDriver.CreateLayer
second_title: .NET API 참조를 위한 Aspose.GIS
description: FileDriver 방법. 레이어를 생성하고 추가하기 위해 엽니다.
type: docs
weight: 60
url: /ko/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public VectorLayer CreateLayer(string path)
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
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 벡터 레이어를 생성할 수 없습니다(참조[`CanCreateLayers`](../cancreatelayers/)). |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
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
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 벡터 레이어를 생성할 수 없습니다(참조[`CanCreateLayers`](../cancreatelayers/)). |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
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
| ArgumentNullException | 경로는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 벡터 레이어를 생성할 수 없습니다(참조[`CanCreateLayers`](../cancreatelayers/)). |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
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
| ArgumentNullException | 경로는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 벡터 레이어를 생성할 수 없습니다(참조[`CanCreateLayers`](../cancreatelayers/)). |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 파일 경로. |
| spatialReferenceSystem | SpatialReferenceSystem | 공간 참조 시스템. |

### 반환 값

인스턴스[`VectorLayer`](../../vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버에서 공간 참조 시스템을 지원하지 않습니다. 사용[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) 공간 참조 시스템이 지원되는지 확인하기 위해. |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| spatialReferenceSystem | SpatialReferenceSystem | 공간 참조 시스템. |

### 반환 값

인스턴스[`VectorLayer`](../../vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버에서 공간 참조 시스템을 지원하지 않습니다. 사용[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) 공간 참조 시스템이 지원되는지 확인하기 위해. |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 파일 경로. |
| options | DriverOptions | 드라이버별 옵션. |
| spatialReferenceSystem | SpatialReferenceSystem | 공간 참조 시스템. |

### 반환 값

인스턴스[`VectorLayer`](../../vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버에서 공간 참조 시스템을 지원하지 않습니다. 사용[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) 공간 참조 시스템이 지원되는지 확인하기 위해. |
| NotSupportedException | 드라이버는 벡터 레이어를 생성할 수 없습니다(참조[`CanCreateLayers`](../cancreatelayers/)). |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| options | DriverOptions | 드라이버별 옵션. |
| spatialReferenceSystem | SpatialReferenceSystem | 공간 참조 시스템. |

### 반환 값

인스턴스[`VectorLayer`](../../vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버에서 공간 참조 시스템을 지원하지 않습니다. 사용[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) 공간 참조 시스템이 지원되는지 확인하기 위해. |
| NotSupportedException | 드라이버는 벡터 레이어를 생성할 수 없습니다(참조[`CanCreateLayers`](../cancreatelayers/)). |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)


