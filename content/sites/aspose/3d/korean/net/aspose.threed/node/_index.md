---
title: Node
second_title: .NET API 참조용 Aspose.3D
description: 장면 그래프의 요소를 나타냅니다. 장면 그래프는 노드 개체의 트리입니다. 트리 관리 서비스는 이 클래스에 자체 포함되어 있습니다. Aspose.3D SDK는 구성된 장면 그래프의 유효성을 테스트하지 않습니다. 노드 계층 구조에서 순환 그래프를 생성하지 않도록 하는 것은 호출자의 책임입니다. 트리 관리 외에도 이 클래스는 장면에서 개체의 위치를 설명하는 데 필요한 모든 속성을 정의합니다. 이 정보에는 기본 변환 회전 및 크기 조정 속성과 피벗 제한 및 IK 관절 속성예 강성 및 감쇠에 대한 고급 옵션이 포함됩니다. 처음 생성될 때 노드 객체는 비어 있습니다즉 위치 정보만 포함하는 그래픽 표현이 없는 개체. 이 상태에서는 노드 트리 구조에서 부모를 나타내는 데 사용할 수 있지만 그 이상은 아닙니다. 이 유형의 객체의 일반적인 사용은 노드를 특수화할 엔티티를 추가하는 것입니다엔티티 참조. 엔티티는 그 자체로 객체이며 노드에 연결됩니다. 이것은 또한 동일한 엔터티가 여러 노드 간에 공유될 수 있음을 의미합니다. 카메라 조명 메시 등은 모두 엔터티이며 모두 기본 클래스 Entity. 에서 파생됩니다.
type: docs
weight: 1470
url: /ko/net/aspose.threed/node/
---
## Node class

장면 그래프의 요소를 나타냅니다. 장면 그래프는 노드 개체의 트리입니다. 트리 관리 서비스는 이 클래스에 자체 포함되어 있습니다. Aspose.3D SDK는 구성된 장면 그래프의 유효성을 테스트하지 않습니다. 노드 계층 구조에서 순환 그래프를 생성하지 않도록 하는 것은 호출자의 책임입니다. 트리 관리 외에도 이 클래스는 장면에서 개체의 위치를 설명하는 데 필요한 모든 속성을 정의합니다. 이 정보에는 기본 변환, 회전 및 크기 조정 속성과 피벗, 제한 및 IK 관절 속성(예: 강성 및 감쇠)에 대한 고급 옵션이 포함됩니다. 처음 생성될 때 노드 객체는 "비어 있습니다"(즉 위치 정보만 포함하는 그래픽 표현이 없는 개체). 이 상태에서는 노드 트리 구조에서 부모를 나타내는 데 사용할 수 있지만 그 이상은 아닙니다. 이 유형의 객체의 일반적인 사용은 노드를 특수화할 엔티티를 추가하는 것입니다("엔티티" 참조). 엔티티는 그 자체로 객체이며 노드에 연결됩니다. 이것은 또한 동일한 엔터티가 여러 노드 간에 공유될 수 있음을 의미합니다. 카메라, 조명, 메시 등은 모두 엔터티이며 모두 기본 클래스 Entity. 에서 파생됩니다.

```csharp
public class Node : SceneObject
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Node](node/#constructor)() | 의 새 인스턴스를 초기화합니다.`Node` 클래스. |
| [Node](node/#constructor_1)(string) | 의 새 인스턴스를 초기화합니다.`Node` 클래스. |
| [Node](node/#constructor_2)(string, Entity) | 의 새 인스턴스를 초기화합니다.`Node` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo/) { get; set; } | 노드별 자산 info |
| [ChildNodes](../../aspose.threed/node/childnodes/) { get; } | 하위 노드를 가져옵니다. |
| [Entities](../../aspose.threed/node/entities/) { get; } | 모든 노드 엔티티를 가져옵니다. |
| [Entity](../../aspose.threed/node/entity/) { get; set; } | 이 노드에 연결된 첫 번째 엔터티를 가져오거나 설정합니다. 설정하면 다른 엔터티가 지워집니다. |
| [Excluded](../../aspose.threed/node/excluded/) { get; set; } | 내보내는 동안 이 노드와 모든 하위 노드/엔티티를 제외할지 여부를 가져오거나 설정합니다. |
| [GlobalTransform](../../aspose.threed/node/globaltransform/) { get; } | 전역 변환을 가져옵니다. |
| [Material](../../aspose.threed/node/material/) { get; set; } | 이 노드와 관련된 첫 번째 재질을 가져오거나 설정합니다. 설정되면 다른 materials 를 지웁니다. |
| [Materials](../../aspose.threed/node/materials/) { get; } | 이 노드와 관련된 재료를 가져옵니다. |
| [MetaDatas](../../aspose.threed/node/metadatas/) { get; } | 이 노드에 정의된 메타 데이터를 가져옵니다. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | 이름을 가져오거나 설정합니다. |
| [ParentNode](../../aspose.threed/node/parentnode/) { get; set; } | 부모 노드를 가져오거나 설정합니다. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | 모든 속성의 컬렉션을 가져옵니다. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | 이 개체가 속한 장면을 가져옵니다 |
| [Transform](../../aspose.threed/node/transform/) { get; } | 로컬 변환을 가져옵니다. |
| [Visible](../../aspose.threed/node/visible/) { get; set; } | node 를 표시하도록 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Accept](../../aspose.threed/node/accept/)(NodeVisitor) | 모든 하위 노드(현재 노드 포함)를 탐색하고 해당 노드로 방문자를 호출합니다. 방문자는 false 를 반환하여 탐색을 중단할 수 있습니다. |
| [AddChildNode](../../aspose.threed/node/addchildnode/)(Node) | 이 node 에 하위 노드 추가 |
| [AddEntity](../../aspose.threed/node/addentity/)(Entity) | 노드에 엔터티를 추가합니다. |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode)() | 자식 node 를 만듭니다. |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_1)(Entity) | 주어진 엔터티가 연결되어 있는 새 자식 노드를 만듭니다 |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_2)(string) | 지정된 노드 이름 로 새 자식 노드를 만듭니다. |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_3)(string, Entity) | 지정된 노드 이름 로 새 자식 노드를 만듭니다. |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_4)(string, Entity, Material) | 지정된 노드 이름으로 새 자식 노드를 만들고 지정된 엔터티와 material 를 연결합니다. |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform/)(bool) | 전역 변환 평가, 기하학적 변환 포함 여부. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | 속성을 찾습니다. 동적 속성(CreateDynamicProperty/SetProperty에 의해 생성됨) 또는 고유 속성(이름으로 식별됨) 일 수 있습니다. |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox/)() | node 의 경계 상자를 계산합니다. |
| [GetChild](../../aspose.threed/node/getchild/#getchild)(int) | 지정된 인덱스에서 하위 노드를 가져옵니다. |
| [GetChild](../../aspose.threed/node/getchild/#getchild_1)(string) | 지정된 name 를 가진 하위 노드를 가져옵니다. |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity/)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | 지정된 property 의 값을 가져옵니다. |
| [Merge](../../aspose.threed/node/merge/)(Node) | 노드 아래의 모든 것을 분리하고 현재 노드에 연결합니다. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | 동적 속성을 제거합니다. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | name 로 식별되는 지정된 속성을 제거합니다. |
| [SelectObjects](../../aspose.threed/node/selectobjects/)(string) | XPath와 유사한 쿼리 구문을 사용하여 현재 노드에서 여러 개체를 선택합니다. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject/)(string) | XPath와 유사한 쿼리 구문을 사용하여 현재 노드에서 단일 개체를 선택합니다. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | 지정된 property 의 값을 설정합니다. |
| override [ToString](../../aspose.threed/node/tostring/)() | 이 노드의 문자열 표현을 가져옵니다. |

### 또한보십시오

* class [SceneObject](../sceneobject/)
* 네임스페이스 [Aspose.ThreeD](../../aspose.threed/)
* 집회 [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
