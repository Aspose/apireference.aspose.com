---
title: Class Feature
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Feature 수업. 지오메트리와 사용자 정의 속성으로 구성된 지리적 기능입니다.
type: docs
weight: 130
url: /ko/net/aspose.gis/feature/
---
## Feature class

지오메트리와 사용자 정의 속성으로 구성된 지리적 기능입니다.

```csharp
public class Feature
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | 형상의 지오메트리를 가져오거나 설정합니다. `null` , 사용[`Null`](../../aspose.gis.geometries/geometry/null/) 누락된 형상을 나타냅니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | 다른 기능에서 속성 값을 복사합니다. |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | 속성 값을 가져옵니다. |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | 속성 값을 가져옵니다. |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | 속성 값을 가져오거나[`DefaultValue`](../featureattribute/defaultvalue/) 값이 설정되지 않았거나`없는` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | 속성 값을 가져오거나[`DefaultValue`](../featureattribute/defaultvalue/) 값이 설정되지 않았거나`없는` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | 속성 값을 가져오거나[`DefaultValue`](../featureattribute/defaultvalue/) 값이 설정되지 않았거나`없는` . |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | 배열의 모든 속성 값을 반환합니다. |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | 배열의 모든 속성에 대한 값을 반환합니다. 사용 고려[`GetValues`](./getvalues/) 추가 메모리 할당을 피하기 위한 방법. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | 속성 시퀀스의 값을 목록으로 가져옵니다. |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | 지정된 특성이 다음으로 명시적으로 설정되었는지 여부를 결정합니다.`없는` 값. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | 이 기능에 속성 값이 설정되어 있는지 확인합니다. |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | 속성의 새 값을 설정합니다. |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | 속성 값을 다음으로 설정합니다.`없는` . |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | 모든 속성에 대해 새 값을 설정합니다. 또한 사용을 고려하십시오.[`CopyValues`](./copyvalues/) 한 번의 호출로 값 설정을 간소화하는 방법. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | 이 기능에서 속성 값을 제거합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Gis](../../aspose.gis/)
* 집회 [Aspose.GIS](../../)


