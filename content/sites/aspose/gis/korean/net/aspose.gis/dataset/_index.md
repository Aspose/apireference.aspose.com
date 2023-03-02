---
title: Class Dataset
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Dataset 수업. 데이터 집합은VectorLayer 인스턴스.
type: docs
weight: 80
url: /ko/net/aspose.gis/dataset/
---
## Dataset class

데이터 집합은[`VectorLayer`](../vectorlayer/) 인스턴스.

```csharp
public abstract class Dataset : IDisposable
```

## 속성

| 이름 | 설명 |
| --- | --- |
| virtual [CanCreateLayers](../../aspose.gis/dataset/cancreatelayers/) { get; } | 이 데이터셋이 벡터 레이어를 생성할 수 있는지 여부를 나타내는 값을 가져옵니다. |
| virtual [CanRemoveLayers](../../aspose.gis/dataset/canremovelayers/) { get; } | 이 데이터셋이 벡터 레이어를 제거할 수 있는지 여부를 나타내는 값을 가져옵니다. |
| abstract [Driver](../../aspose.gis/dataset/driver/) { get; } | 가져오기[`Driver`](./driver/) 이 데이터 세트를 인스턴스화한 것입니다. |
| abstract [LayersCount](../../aspose.gis/dataset/layerscount/) { get; } | 이 데이터 세트의 레이어 수를 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [Create](../../aspose.gis/dataset/create/#create)(AbstractPath, FileDriver) | 데이터 세트를 생성합니다. |
| static [Create](../../aspose.gis/dataset/create/#create_2)(string, FileDriver) | 데이터 세트를 생성합니다. |
| static [Create](../../aspose.gis/dataset/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | 데이터 세트를 생성합니다. |
| static [Create](../../aspose.gis/dataset/create/#create_3)(string, FileDriver, DriverOptions) | 데이터 세트를 생성합니다. |
| static [Open](../../aspose.gis/dataset/open/#open)(AbstractPath, FileDriver) | 데이터 세트를 엽니다. |
| static [Open](../../aspose.gis/dataset/open/#open_2)(IDbConnection, DatabaseDriver) | 데이터 세트를 엽니다. |
| static [Open](../../aspose.gis/dataset/open/#open_3)(string, FileDriver) | 데이터 세트를 엽니다. |
| static [Open](../../aspose.gis/dataset/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | 데이터 세트를 엽니다. |
| static [Open](../../aspose.gis/dataset/open/#open_4)(string, FileDriver, DriverOptions) | 데이터 세트를 엽니다. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer)() | 새 벡터 레이어를 만들고 추가하기 위해 엽니다. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_2)(SpatialReferenceSystem) | 새 벡터 레이어를 만들고 추가하기 위해 엽니다. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_1)(DriverOptions, SpatialReferenceSystem) | 새 벡터 레이어를 만들고 추가하기 위해 엽니다. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_4)(string, SpatialReferenceSystem) | 지정된 이름으로 새 벡터 레이어를 만들고 추가하기 위해 엽니다. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_3)(string, DriverOptions, SpatialReferenceSystem) | 지정된 이름으로 새 벡터 레이어를 만들고 추가하기 위해 엽니다. |
| [Dispose](../../aspose.gis/dataset/dispose/)() | 에서 사용하는 리소스를 해제합니다.`Dataset` . |
| abstract [EditLayer](../../aspose.gis/dataset/editlayer/)(string, DriverOptions, SpatialReferenceSystem) | 편집을 위해 지정된 이름의 레이어를 엽니다. |
| abstract [GetLayerName](../../aspose.gis/dataset/getlayername/)(int) | 지정된 인덱스에서 레이어의 이름을 가져옵니다. |
| abstract [OpenLayer](../../aspose.gis/dataset/openlayer/)(string, DriverOptions) | 읽기용으로 지정된 이름의 레이어를 엽니다. |
| abstract [OpenLayerAt](../../aspose.gis/dataset/openlayerat/)(int, DriverOptions) | 읽기를 위해 지정된 인덱스에서 레이어를 엽니다. |
| virtual [RemoveLayer](../../aspose.gis/dataset/removelayer/)(string) | 지정된 이름의 벡터 레이어를 제거합니다. |
| virtual [RemoveLayerAt](../../aspose.gis/dataset/removelayerat/)(int) | 지정된 인덱스에서 벡터 레이어를 제거합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Gis](../../aspose.gis/)
* 집회 [Aspose.GIS](../../)


