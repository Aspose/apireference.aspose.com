---
title: TopoJsonOptions.DefaultObjectName
second_title: .NET API 참조를 위한 Aspose.GIS
description: TopoJsonOptions 재산. 기본적으로 기능이 배치되는 개체의 이름입니다.
type: docs
weight: 20
url: /ko/net/aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/
---
## TopoJsonOptions.DefaultObjectName property

기본적으로 기능이 배치되는 개체의 이름입니다.

```csharp
public string DefaultObjectName { get; set; }
```

### 비고

이것은 쓰기 옵션입니다. 읽기에는 영향을 주지 않습니다. TopoJSON에는 명명된 개체가 얼마든지 포함될 수 있습니다. 그러한 모든 개체는 여러 기능을 포함할 수 있습니다 . 기능을 넣을 개체를 지정하려면 use [`ObjectNameAttribute`](../objectnameattribute/) property. 이름이 있는 속성인 경우[`ObjectNameAttribute`](../objectnameattribute/) ~이다`null`또는 설정 해제 for 일부 기능, 이 기능은 이름이 있는 개체에 추가됩니다.`DefaultObjectName` . 이름이 있는 속성인 경우[`ObjectNameAttribute`](../objectnameattribute/) 에 존재하지 않는다[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) 컬렉션, 모든 기능은 이름이 있는 객체에 넣습니다.[`ObjectNameAttribute`](../objectnameattribute/) . 기본값은 "이름 없음"입니다.

### 또한보십시오

* class [TopoJsonOptions](../)
* 네임스페이스 [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* 집회 [Aspose.GIS](../../../)


