---
title: FileDriver.CreateDataset
second_title: .NET API 참조를 위한 Aspose.GIS
description: FileDriver 방법. 데이터 세트를 생성합니다.
type: docs
weight: 50
url: /ko/net/aspose.gis/filedriver/createdataset/
---
## CreateDataset(string) {#createdataset_2}

데이터 세트를 생성합니다.

```csharp
public Dataset CreateDataset(string path)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 데이터세트의 경로입니다. |

### 반환 값

인스턴스[`Dataset`](../../dataset/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 만드는 중에 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 데이터 세트를 열 수 없습니다(참조[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | 데이터세트가 이미 존재합니다. |

### 또한보십시오

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath) {#createdataset}

데이터 세트를 생성합니다.

```csharp
public Dataset CreateDataset(AbstractPath path)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 데이터세트의 경로입니다. |

### 반환 값

인스턴스[`Dataset`](../../dataset/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 만드는 중에 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 데이터 세트를 열 수 없습니다(참조[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | 데이터세트가 이미 존재합니다. |

### 또한보십시오

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## CreateDataset(string, DriverOptions) {#createdataset_3}

데이터 세트를 생성합니다.

```csharp
public Dataset CreateDataset(string path, DriverOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 데이터세트의 경로입니다. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`Dataset`](../../dataset/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 만드는 중에 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 데이터 세트를 열 수 없습니다(참조[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | 데이터세트가 이미 존재합니다. |

### 또한보십시오

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

데이터 세트를 생성합니다.

```csharp
public virtual Dataset CreateDataset(AbstractPath path, DriverOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 데이터세트의 경로입니다. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`Dataset`](../../dataset/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 만드는 중에 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 데이터 세트를 열 수 없습니다(참조[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | 데이터세트가 이미 존재합니다. |

### 또한보십시오

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)


