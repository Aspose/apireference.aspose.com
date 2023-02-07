---
title: TriMeshT
second_title: .NET API 참조용 Aspose.3D
description: 의 일반 버전TriMesh./trimesh/ 사용자의 정적 정의 정점 type
type: docs
weight: 740
url: /ko/net/aspose.threed.entities/trimesh-1/
---
## TriMesh&lt;T&gt; class

의 일반 버전[`TriMesh`](../trimesh/) 사용자의 정적 정의 정점 type

```csharp
public class TriMesh<T> : TriMesh
    where T : struct
```

| 모수 | 설명 |
| --- | --- |
| T |  |

## 생성자

| 이름 | 설명 |
| --- | --- |
| [TriMesh](trimesh/)(string) | 인스턴스 초기화[`TriMesh`](../trimesh/) |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity/) { get; } | 미리 할당된 정점의 용량입니다. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | 내보내는 동안 이 엔터티를 제외할지 여부를 가져오거나 설정합니다. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount/) { get; } | 이 인덱스의 수[`TriMesh`](../trimesh/) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | 이름을 가져오거나 설정합니다. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | 첫 번째 부모 노드를 가져오거나 설정합니다. 첫 번째 부모 노드를 설정하면 이 엔터티는 다른 부모 노드에서 분리됩니다. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | 모든 부모 노드 가져오기 |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | 모든 속성의 컬렉션을 가져옵니다. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | 이 개체가 속한 장면을 가져옵니다 |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount/) { get; } | 에 의해 전달된 병합되지 않은 꼭짓점 수[`BeginVertex`](../trimesh/beginvertex/) 그리고[`EndVertex`](../trimesh/endvertex/) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration/) { get; } | 의 정점 레이아웃[`TriMesh`](../trimesh/) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount/) { get; } | 이 정점의 개수[`TriMesh`](../trimesh/) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes/) { get; } | bytes 에 있는 모든 정점의 총 크기 |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [FromMesh](../../aspose.threed.entities/trimesh-1/frommesh/)(Mesh) | 자동으로 생성된 정점 레이아웃을 사용하여 지정된 메시 개체에서 TriMesh를 만듭니다. |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex/)() | vertex 추가 시작 |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex/)() | vertex 추가 종료 |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | 속성을 찾습니다. 동적 속성(CreateDynamicProperty/SetProperty에 의해 생성됨) 또는 고유 속성(이름으로 식별됨) 일 수 있습니다. |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | 오브젝트 공간 좌표계에서 현재 엔티티의 경계 상자를 가져옵니다. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | 렌더러 에 등록된 엔티티 렌더러의 키를 가져옵니다. |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator/)() | 열거할 열거자를 가져옵니다.[`Vertex`](../../aspose.threed.utilities/vertex/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | 지정된 property 의 값을 가져옵니다. |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes/)(byte[]) | 바이트에서 정점 로드, 바이트 길이는 정점 크기의 정수배여야 합니다. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble/)(int, VertexField) | 이중 field 읽기 |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat/)(int, VertexField) | 플로트 필드 읽기 |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2/)(int, VertexField) | vector2 field 읽기 |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3/)(int, VertexField) | vector3 field 읽기 |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4/)(int, VertexField) | vector4 field 읽기 |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2/)(int, VertexField) | vector2 field 읽기 |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3/)(int, VertexField) | vector3 field 읽기 |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4/)(int, VertexField) | vector4 field 읽기 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | 동적 속성을 제거합니다. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | name 로 식별되는 지정된 속성을 제거합니다. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | 지정된 property 의 값을 설정합니다. |
| override [ToString](../../aspose.threed.entities/trimesh/tostring/)() | 의 문자열 표현을 가져옵니다.[`TriMesh`](../trimesh/) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray/)() | 정점 데이터를 바이트 배열로 변환 |
| [VerticesToTypedArray](../../aspose.threed.entities/trimesh-1/verticestotypedarray/)() | 정점 데이터를 입력된 array 로 변환합니다. |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto/)(Stream) | 인덱스 데이터를 16비트 정수로 stream 에 씁니다. |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto/)(Stream) | 인덱스 데이터를 32비트 정수로 stream 에 씁니다. |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto/)(Stream) | 지정된 stream 에 정점 데이터 쓰기 |

### 또한보십시오

* class [TriMesh](../trimesh/)
* 네임스페이스 [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* 집회 [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
