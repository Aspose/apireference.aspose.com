---
title: GeoConvert.TryParsePointText
second_title: .NET API 참조를 위한 Aspose.GIS
description: GeoConvert 방법. 좌표를 포함하는 문자열을 IPoint 개체로 변환합니다. 반환 값은 변환 성공 또는 실패 여부를 나타냅니다.
type: docs
weight: 30
url: /ko/net/aspose.gis/geoconvert/tryparsepointtext/
---
## GeoConvert.TryParsePointText method

좌표를 포함하는 문자열을 IPoint 개체로 변환합니다. 반환 값은 변환 성공 또는 실패 여부를 나타냅니다.

```csharp
public static bool TryParsePointText(string text, out IPoint point)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| text | String | 변환할 좌표가 포함된 문자열입니다. 문자열에는 좌표 위도와 경도가 모두 포함되어야 합니다. 좌표는 공백, 쉼표 또는 세미콜론으로 구분되어야 합니다. |
| point | IPoint& | 이 메서드가 반환될 때 변환에 성공한 경우 구문 분석된 좌표가 있는 IPoint 개체를 포함하고 변환에 실패한 경우 null을 포함합니다. |

### 반환 값

텍스트가 성공적으로 구문 분석되면 True이고, 그렇지 않으면 False입니다.

### 비고

예: "80° 151°", "74°50.82', 172°08.21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### 또한보십시오

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* 네임스페이스 [Aspose.Gis](../../geoconvert/)
* 집회 [Aspose.GIS](../../../)


