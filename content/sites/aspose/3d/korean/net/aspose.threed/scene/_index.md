---
title: Scene
second_title: .NET API 참조용 Aspose.3D
description: 장면은 노드 형상 재료 텍스처 애니메이션 포즈 하위 장면 등을 포함하는 최상위 개체입니다. 장면은 하위 장면을 가질 수 있으며 collada/blender와 같은 파일에서 다중 문서 지원 역할을 합니다. /fbx 노드 계층은 다음을 통해 액세스할 수 있습니다.RootNode./scene/rootnode/Library./scene/library/ 라이브러리로 사용할 수 있도록 직렬화예 메타 데이터 또는 사용자 정의 개체 중에 연결되지 않은 개체의 참조를 유지하는 데 사용됩니다.
type: docs
weight: 2250
url: /ko/net/aspose.threed/scene/
---
## Scene class

장면은 노드, 형상, 재료, 텍스처, 애니메이션, 포즈, 하위 장면 등을 포함하는 최상위 개체입니다. 장면은 하위 장면을 가질 수 있으며 collada/blender와 같은 파일에서 다중 문서 지원 역할을 합니다. /fbx 노드 계층은 다음을 통해 액세스할 수 있습니다.[`RootNode`](./rootnode/)[`Library`](./library/) 라이브러리로 사용할 수 있도록 직렬화(예: 메타 데이터 또는 사용자 정의 개체) 중에 연결되지 않은 개체의 참조를 유지하는 데 사용됩니다.

```csharp
public class Scene : SceneObject
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Scene](scene/#constructor)() | 의 새 인스턴스를 초기화합니다.`Scene` 클래스. |
| [Scene](scene/#constructor_1)(Entity) | 의 새 인스턴스를 초기화합니다.`Scene` 새 노드에 연결된 엔터티가 있는 클래스. |
| [Scene](scene/#constructor_2)(Scene, string) | 의 새 인스턴스를 초기화합니다.`Scene`하위 장면으로 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips/) { get; } | 모두 가져오기[`AnimationClip`](../../aspose.threed.animation/animationclip/) scene. 에 정의됨 |
| [AssetInfo](../../aspose.threed/scene/assetinfo/) { get; set; } | 최상위 자산 정보를 가져오거나 설정합니다. |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip/) { get; set; } | 활성을 가져오거나 설정합니다.[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [Library](../../aspose.threed/scene/library/) { get; } | 장면 계층 구조에서 직접 사용되지 않는 개체는 라이브러리에서 정의할 수 있습니다. 하위 장면을 사용하고 하위 장면 아래에 재사용 가능한 구성 요소를 넣을 때 유용합니다. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | 이름을 가져오거나 설정합니다. |
| [Poses](../../aspose.threed/scene/poses/) { get; } | 모두 가져오기[`Pose`](../pose/) 이 장면에서 사용. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | 모든 속성의 컬렉션을 가져옵니다. |
| [RootNode](../../aspose.threed/scene/rootnode/) { get; } | 장면의 루트 노드를 가져옵니다. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | 이 개체가 속한 장면을 가져옵니다 |
| [SubScenes](../../aspose.threed/scene/subscenes/) { get; } | 모든 하위 장면 가져오기 |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile)(string) | 지정된 path 에서 장면을 엽니다. |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_3)(string, CancellationToken) | 지정된 path 에서 장면을 엽니다. |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_1)(string, FileFormat, CancellationToken) | 지정된 파일 형식을 사용하여 주어진 경로에서 장면을 엽니다. |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_2)(string, LoadOptions, CancellationToken) | 지정된 파일 형식을 사용하여 주어진 경로에서 장면을 엽니다. |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_2)(Stream, CancellationToken) | 주어진 stream 에서 장면을 엽니다. |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream)(Stream, FileFormat, CancellationToken) | 지정된 파일 형식을 사용하여 주어진 스트림에서 장면을 엽니다. |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_1)(Stream, LoadOptions, CancellationToken) | 지정된 IO 구성을 사용하여 주어진 스트림에서 장면을 엽니다. |
| [Clear](../../aspose.threed/scene/clear/)() | 장면 내용을 지우고 기본 설정을 복원합니다. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip/)(string) | 생성 및 등록을 위한 속기 함수[`AnimationClip`](../../aspose.threed.animation/animationclip/) 첫 번째[`AnimationClip`](../../aspose.threed.animation/animationclip/) 에 할당됩니다.[`CurrentAnimationClip`](./currentanimationclip/) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | 속성을 찾습니다. 동적 속성(CreateDynamicProperty/SetProperty에 의해 생성됨) 또는 고유 속성(이름으로 식별됨) 일 수 있습니다. |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip/)(string) | 명명된 항목 가져오기[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | 지정된 property 의 값을 가져옵니다. |
| [Open](../../aspose.threed/scene/open/#open)(Stream) | 주어진 stream 에서 장면을 엽니다. |
| [Open](../../aspose.threed/scene/open/#open_4)(string) | 지정된 path 에서 장면을 엽니다. |
| [Open](../../aspose.threed/scene/open/#open_3)(Stream, CancellationToken) | 주어진 stream 에서 장면을 엽니다. |
| [Open](../../aspose.threed/scene/open/#open_8)(string, CancellationToken) | 지정된 path 에서 장면을 엽니다. |
| [Open](../../aspose.threed/scene/open/#open_6)(string, LoadOptions) | 지정된 파일 형식을 사용하여 주어진 경로에서 장면을 엽니다. |
| [Open](../../aspose.threed/scene/open/#open_1)(Stream, FileFormat, CancellationToken) | 지정된 파일 형식을 사용하여 주어진 스트림에서 장면을 엽니다. |
| [Open](../../aspose.threed/scene/open/#open_2)(Stream, LoadOptions, CancellationToken) | 지정된 IO 구성을 사용하여 주어진 스트림에서 장면을 엽니다. |
| [Open](../../aspose.threed/scene/open/#open_5)(string, FileFormat, CancellationToken) | 지정된 파일 형식을 사용하여 주어진 경로에서 장면을 엽니다. |
| [Open](../../aspose.threed/scene/open/#open_7)(string, LoadOptions, CancellationToken) | 지정된 파일 형식을 사용하여 주어진 경로에서 장면을 엽니다. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | 동적 속성을 제거합니다. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | name 로 식별되는 지정된 속성을 제거합니다. |
| [Render](../../aspose.threed/scene/render/#render)(Camera, Bitmap) | 주어진 카메라의 관점에서 장면을 비트맵으로 렌더링합니다. |
| [Render](../../aspose.threed/scene/render/#render_2)(Camera, string) | 주어진 카메라의 관점에서 장면을 외부 파일로 렌더링합니다. 기본 출력 크기는 1024x768이고 출력 형식은 png 입니다. |
| [Render](../../aspose.threed/scene/render/#render_1)(Camera, Bitmap, ImageRenderOptions) | 주어진 카메라의 관점에서 장면을 비트맵으로 렌더링합니다. |
| [Render](../../aspose.threed/scene/render/#render_3)(Camera, string, Size, ImageFormat) | 지정된 카메라의 관점에서 장면을 외부 파일로 렌더링합니다. |
| [Render](../../aspose.threed/scene/render/#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | 지정된 카메라의 관점에서 장면을 외부 파일로 렌더링합니다. |
| [Save](../../aspose.threed/scene/save/#save_4)(string) | 지정된 파일 형식을 사용하여 지정된 경로에 장면을 저장합니다. |
| [Save](../../aspose.threed/scene/save/#save)(Stream, FileFormat) | 지정된 파일 형식을 사용하여 스트리밍할 장면을 저장합니다. |
| [Save](../../aspose.threed/scene/save/#save_2)(Stream, SaveOptions) | 지정된 파일 형식을 사용하여 스트리밍할 장면을 저장합니다. |
| [Save](../../aspose.threed/scene/save/#save_5)(string, FileFormat) | 지정된 파일 형식을 사용하여 지정된 경로에 장면을 저장합니다. |
| [Save](../../aspose.threed/scene/save/#save_7)(string, SaveOptions) | 지정된 파일 형식을 사용하여 지정된 경로에 장면을 저장합니다. |
| [Save](../../aspose.threed/scene/save/#save_1)(Stream, FileFormat, CancellationToken) | 지정된 파일 형식을 사용하여 스트리밍할 장면을 저장합니다. |
| [Save](../../aspose.threed/scene/save/#save_3)(Stream, SaveOptions, CancellationToken) | 지정된 파일 형식을 사용하여 스트리밍할 장면을 저장합니다. |
| [Save](../../aspose.threed/scene/save/#save_6)(string, FileFormat, CancellationToken) | 지정된 파일 형식을 사용하여 지정된 경로에 장면을 저장합니다. |
| [Save](../../aspose.threed/scene/save/#save_8)(string, SaveOptions, CancellationToken) | 지정된 파일 형식을 사용하여 지정된 경로에 장면을 저장합니다. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | 지정된 property 의 값을 설정합니다. |

### 또한보십시오

* class [SceneObject](../sceneobject/)
* 네임스페이스 [Aspose.ThreeD](../../aspose.threed/)
* 집회 [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
