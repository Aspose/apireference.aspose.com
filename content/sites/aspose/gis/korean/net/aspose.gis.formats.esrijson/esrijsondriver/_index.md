---
title: Class EsriJsonDriver
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Formats.EsriJson.EsriJsonDriver 수업. EsriJson 형식용 드라이버입니다.
type: docs
weight: 230
url: /ko/net/aspose.gis.formats.esrijson/esrijsondriver/
---
## EsriJsonDriver class

EsriJson 형식용 드라이버입니다.

```csharp
public sealed class EsriJsonDriver : FileDriver
```

## 속성

| 이름 | 설명 |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.esrijson/esrijsondriver/cancreatedatasets/) { get; } | 이 드라이버가 데이터 세트를 생성할 수 있는지 여부를 나타내는 값을 가져옵니다. |
| override [CanCreateLayers](../../aspose.gis.formats.esrijson/esrijsondriver/cancreatelayers/) { get; } | 이 드라이버가 벡터 레이어를 생성할 수 있는지 여부를 나타내는 값을 가져옵니다. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | 이 드라이버가 데이터 세트를 열 수 있는지 여부를 나타내는 값을 가져옵니다. |
| override [CanOpenLayers](../../aspose.gis.formats.esrijson/esrijsondriver/canopenlayers/) { get; } | 이 드라이버가 벡터 레이어를 열 수 있는지 여부를 나타내는 값을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | 데이터 세트를 생성합니다. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | 데이터 세트를 생성합니다. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | 데이터 세트를 생성합니다. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | 데이터 세트를 생성합니다. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | 레이어를 생성하고 추가하기 위해 엽니다. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | 레이어를 생성하고 추가하기 위해 엽니다. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | 레이어를 생성하고 추가하기 위해 엽니다. |
| [CreateLayer](../../aspose.gis.formats.esrijson/esrijsondriver/createlayer/#createlayer_3)(AbstractPath, EsriJsonOptions) | 레이어를 생성하고 새 기능을 추가하기 위해 엽니다. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | 레이어를 생성하고 추가하기 위해 엽니다. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | 레이어를 생성하고 추가하기 위해 엽니다. |
| [CreateLayer](../../aspose.gis.formats.esrijson/esrijsondriver/createlayer/#createlayer_9)(string, EsriJsonOptions) | 레이어를 생성하고 새 기능을 추가하기 위해 엽니다. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | 레이어를 생성하고 추가하기 위해 엽니다. |
| override [CreateLayer](../../aspose.gis.formats.esrijson/esrijsondriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | 레이어를 생성하고 새 기능을 추가하기 위해 엽니다. |
| [CreateLayer](../../aspose.gis.formats.esrijson/esrijsondriver/createlayer/#createlayer_4)(AbstractPath, EsriJsonOptions, SpatialReferenceSystem) | 레이어를 생성하고 새 기능을 추가하기 위해 엽니다. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | 레이어를 생성하고 추가하기 위해 엽니다. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | 편집을 위해 레이어를 엽니다. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | 편집을 위해 레이어를 엽니다. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | 데이터 세트를 엽니다. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | 데이터 세트를 엽니다. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | 데이터 세트를 엽니다. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | 데이터 세트를 엽니다. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | 읽기용 레이어를 엽니다. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | 읽기용 레이어를 엽니다. |
| override [OpenLayer](../../aspose.gis.formats.esrijson/esrijsondriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | 읽기용 레이어를 엽니다. |
| [OpenLayer](../../aspose.gis.formats.esrijson/esrijsondriver/openlayer/#openlayer_2)(AbstractPath, EsriJsonOptions) | 읽기용 레이어를 엽니다. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | 읽기용 레이어를 엽니다. |
| [OpenLayer](../../aspose.gis.formats.esrijson/esrijsondriver/openlayer/#openlayer_5)(string, EsriJsonOptions) | 읽기용 레이어를 엽니다. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.esrijson/esrijsondriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | 지정된 공간 참조 시스템이 드라이버에서 지원되는지 여부를 결정합니다. |

### 또한보십시오

* class [FileDriver](../../aspose.gis/filedriver/)
* 네임스페이스 [Aspose.Gis.Formats.EsriJson](../../aspose.gis.formats.esrijson/)
* 집회 [Aspose.GIS](../../)


