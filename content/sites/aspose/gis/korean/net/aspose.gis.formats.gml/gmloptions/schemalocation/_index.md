---
title: GmlOptions.SchemaLocation
second_title: .NET API 참조를 위한 Aspose.GIS
description: GmlOptions 재산. 공백으로 구분된 URI 쌍 목록입니다. 모든 쌍의 첫 번째 URI는 네임스페이스의 URI이고 두 번째 URI는 네임스페이스의 XML 스키마에 대한 경로입니다. null GmlDriver 문서의 루트 요소에서 schemaLocation 읽기를 시도합니다. 기본값은null .
type: docs
weight: 50
url: /ko/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

공백으로 구분된 URI 쌍 목록입니다. 모든 쌍의 첫 번째 URI는 네임스페이스의 URI이고, 두 번째 URI는 네임스페이스의 XML 스키마에 대한 경로입니다. `null` ,[`GmlDriver`](../../gmldriver/) 문서의 루트 요소에서 schemaLocation 읽기를 시도합니다. 기본값은`null` .

```csharp
public string SchemaLocation { get; set; }
```

### 비고

Aspose.GIS는 생성을 위해 GML 파일의 XML 스키마를 사용합니다.[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) 기본적으로 스키마 위치는 schemaLocation 속성에서 추출된 입니다. 해당 속성이 없거나 잘못된 위치를 가리키는 경우 Aspose.GIS는 GML 파일을 읽지 못합니다. 이 경우 Aspose.GIS가 schema. 를 로드할 수 있도록 이 옵션을 설정합니다.

### 예

"http://site.com/네임스페이스 http://site.com/schema.xsd"

### 또한보십시오

* class [GmlOptions](../)
* 네임스페이스 [Aspose.Gis.Formats.Gml](../../gmloptions/)
* 집회 [Aspose.GIS](../../../)


