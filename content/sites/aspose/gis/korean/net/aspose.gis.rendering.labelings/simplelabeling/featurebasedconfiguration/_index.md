---
title: SimpleLabeling.FeatureBasedConfiguration
second_title: .NET API 참조를 위한 Aspose.GIS
description: SimpleLabeling 재산. 기능을 처리하기 전에 이 레이블 지정을 구성하는 데 사용되는 콜백입니다.
type: docs
weight: 20
url: /ko/net/aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/
---
## SimpleLabeling.FeatureBasedConfiguration property

기능을 처리하기 전에 이 레이블 지정을 구성하는 데 사용되는 콜백입니다.

```csharp
public Action<Feature, SimpleLabeling> FeatureBasedConfiguration { get; set; }
```

### 비고

이 콜백은 모든 기능에 레이블을 지정하기 전에 호출됩니다. 레이블이 지정될 기능과 이 레이블 지정의 복제본을 허용합니다. 클론의 속성을 변경하면 피처의 속성에 따라 라벨링 동작을 업데이트할 수 있습니다.

### 또한보십시오

* class [Feature](../../../aspose.gis/feature/)
* class [SimpleLabeling](../)
* 네임스페이스 [Aspose.Gis.Rendering.Labelings](../../simplelabeling/)
* 집회 [Aspose.GIS](../../../)


