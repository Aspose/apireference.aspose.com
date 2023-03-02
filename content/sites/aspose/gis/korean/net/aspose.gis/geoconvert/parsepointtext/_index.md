---
title: GeoConvert.ParsePointText
second_title: .NET API 참조를 위한 Aspose.GIS
description: GeoConvert 방법. 좌표를 포함하는 문자열을 IPoint 개체로 변환합니다.
type: docs
weight: 20
url: /ko/net/aspose.gis/geoconvert/parsepointtext/
---
## GeoConvert.ParsePointText method

좌표를 포함하는 문자열을 IPoint 개체로 변환합니다.

```csharp
public static IPoint ParsePointText(string text)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| text | String | 변환할 좌표가 포함된 문자열입니다. 문자열에는 좌표 위도와 경도가 모두 포함되어야 합니다. 좌표는 공백, 쉼표 또는 세미콜론으로 구분되어야 합니다. |

### 반환 값

입력 문자열과 동일한 좌표를 가진 IPoint 개체입니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| [GisException](../../gisexception/) |  |

### 비고

예: "80° 151°", "74°50.82', 172°08.21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### 또한보십시오

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* 네임스페이스 [Aspose.Gis](../../geoconvert/)
* 집회 [Aspose.GIS](../../../)


