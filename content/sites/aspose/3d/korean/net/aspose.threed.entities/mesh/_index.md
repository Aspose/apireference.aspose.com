---
title: Mesh
second_title: .NET API 참조용 Aspose.3D
description: 메쉬는 많은 n면 다각형으로 구성됩니다.
type: docs
weight: 450
url: /ko/net/aspose.threed.entities/mesh/
---
## Mesh class

메쉬는 많은 n면 다각형으로 구성됩니다.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Mesh](mesh/#constructor)() | 의 새 인스턴스를 초기화합니다.`Mesh` 클래스. |
| [Mesh](mesh/#constructor_1)(Bitmap) | 지정된 높이 맵을 사용하여 메쉬를 구성합니다. 높이 맵의 픽셀 형식에 여러 구성 요소가 포함된 경우 첫 번째(일반적으로 빨간색) 구성 요소가 높이 값으로 사용됩니다(z) 제어점의 x 및 y 구성 요소는 정규화된 픽셀 좌표입니다. . |
| [Mesh](mesh/#constructor_4)(string) | 의 새 인스턴스를 초기화합니다.`Mesh` 클래스. |
| [Mesh](mesh/#constructor_2)(Bitmap, Matrix4) | 지정된 높이 맵을 사용하여 메쉬를 구성합니다. 높이 맵의 픽셀 형식에 여러 구성 요소가 포함된 경우 첫 번째(일반적으로 빨간색) 구성 요소가 높이 값으로 사용됩니다(z) 제어점의 x 및 y 구성 요소는 정규화된 픽셀 좌표입니다. . |
| [Mesh](mesh/#constructor_3)(Bitmap, bool, Matrix4) | 지정된 높이 맵을 사용하여 메쉬를 구성합니다. 높이 맵의 픽셀 형식에 여러 구성 요소가 포함된 경우 첫 번째(일반적으로 빨간색) 구성 요소가 높이 값으로 사용됩니다(z) 제어점의 x 및 y 구성 요소는 정규화된 픽셀 좌표입니다. . |

## 속성

| 이름 | 설명 |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | 이 지오메트리가 shadow 를 투사할 수 있는지 여부를 가져오거나 설정합니다. |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | 모든 제어점 가져오기 |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | 이 지오메트리와 관련된 모든 디포머를 가져옵니다. |
| [Edges](../../aspose.threed.entities/mesh/edges/) { get; } | 메쉬의 가장자리를 가져옵니다. Edge는 메쉬에서 선택 사항이므로 비워 둘 수 있습니다. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | 내보내는 동안 이 엔터티를 제외할지 여부를 가져오거나 설정합니다. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | 이름을 가져오거나 설정합니다. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | 첫 번째 부모 노드를 가져오거나 설정합니다. 첫 번째 부모 노드를 설정하면 이 엔터티는 다른 부모 노드에서 분리됩니다. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | 모든 부모 노드 가져오기 |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount/) { get; } | 다각형 수를 가져옵니다 |
| [Polygons](../../aspose.threed.entities/mesh/polygons/) { get; } | 메시 의 폴리곤 정의를 가져옵니다. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | 모든 속성의 컬렉션을 가져옵니다. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | 이 지오메트리가 그림자를 받을 수 있는지 여부를 가져오거나 설정합니다. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | 이 개체가 속한 장면을 가져옵니다 |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | 모든 정점 요소를 가져옵니다 |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | 지오메트리가 표시되는지 여부를 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement/)(VertexElement) | 기존 정점 요소를 현재 geometry 에 추가합니다. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType) | 지정된 유형의 꼭지점 요소를 생성하고 기하학에 추가합니다. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType, MappingMode, ReferenceMode) | 지정된 유형의 꼭지점 요소를 생성하고 기하학에 추가합니다. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping) | 생성[`VertexElementUV`](../vertexelementuv/) 주어진 텍스처 매핑 type. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping, MappingMode, ReferenceMode) | 생성[`VertexElementUV`](../vertexelementuv/) 주어진 텍스처 매핑 type. |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_2)(int[]) | 정의된 모든 꼭지점으로 새 다각형을 만듭니다.*indices* . 꼭지점별로 다각형 꼭지점을 만들려면 다음을 사용하십시오.[`PolygonBuilder`](../polygonbuilder/) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon)(int, int, int) | 꼭짓점이 3개인 폴리곤 생성(삼각형) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_3)(int[], int, int) | 정의된 모든 꼭지점으로 새 다각형을 만듭니다.*indices* . 꼭지점별로 다각형 꼭지점을 만들려면 다음을 사용하십시오.[`PolygonBuilder`](../polygonbuilder/) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_1)(int, int, int, int) | 꼭지점이 4개인 폴리곤 생성(쿼드) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | 속성을 찾습니다. 동적 속성(CreateDynamicProperty/SetProperty에 의해 생성됨) 또는 고유 속성(이름으로 식별됨) 일 수 있습니다. |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | 오브젝트 공간 좌표계에서 현재 엔티티의 경계 상자를 가져옵니다. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | 지정된 type 로 정점 요소를 가져옵니다. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | 렌더러 에 등록된 엔티티 렌더러의 키를 가져옵니다. |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator/)() | 각 내부 폴리곤에 대한 열거자를 가져옵니다. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize/)(int) | 지정된 다각형의 정점 수를 가져옵니다. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | 지정된 property 의 값을 가져옵니다. |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | 가져오기[`VertexElementUV`](../vertexelementuv/) 주어진 텍스처 매핑 type 가 있는 인스턴스 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | 동적 속성을 제거합니다. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | name 로 식별되는 지정된 속성을 제거합니다. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | 지정된 property 의 값을 설정합니다. |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh/)() | 현재 엔티티에서 메시 인스턴스를 가져옵니다. |

### 예

메쉬에 다각형을 추가하려면: mesh: 의 모든 폴리곤을 통해 이동합니다.

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    //폴리곤 다루기
}
```

### 또한보십시오

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* 네임스페이스 [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* 집회 [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
