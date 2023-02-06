---
title: Aspose.ThreeD.Entities
second_title: .NET API 참조용 Aspose.3D
description: 모든 지오메트리와 엔터티는 이 namespace 에서 정의됩니다.
type: docs
weight: 40
url: /ko/net/aspose.threed.entities/
---
모든 지오메트리와 엔터티는 이 namespace 에서 정의됩니다.

## 클래스

| 수업 | 설명 |
| --- | --- |
| [Box](./box/) | 상자. |
| [Camera](./camera/) | 카메라는 장면을 바라보는 시청자의 시점을 설명합니다. |
| [Circle](./circle/) | A[`Circle`](../aspose.threed.entities/circle/) 곡선은 원 모양의 가장자리에 있는 점 집합으로 구성됩니다. |
| [CompositeCurve](./compositecurve/) | A[`CompositeCurve`](../aspose.threed.entities/compositecurve/) 여러 커브 세그먼트로 구성되어 있습니다. |
| [Curve](./curve/) | 모든 곡선 구현의 기본 클래스입니다. |
| [Cylinder](./cylinder/) | Parameterized Cylinder. radiusTop/radiusBottom 중 하나가 0일 때 원뿔을 나타내는 데 사용할 수도 있습니다. |
| [Dish](./dish/) | 매개변수화된 접시. |
| [Ellipse](./ellipse/) | 안[`Ellipse`](../aspose.threed.entities/ellipse/)타원 모양을 형성하는 점 집합을 정의합니다. |
| [Frustum](./frustum/) | 의 기본 클래스[`Camera`](../aspose.threed.entities/camera/) 그리고[`Light`](../aspose.threed.entities/light/) |
| [Geometry](./geometry/) | 렌더링 가능한 모든 기하학적 개체의 기본 클래스(예:[`Mesh`](../aspose.threed.entities/mesh/) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) ,[`Patch`](../aspose.threed.entities/patch/) 등). |
| [Light](./light/) | 조명이 장면을 비춥니다. |
| [Line](./line/) | 폴리라인은 다음과 같은 점 집합으로 정의된 경로입니다.[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/) 에 의해 연결됨[`Segments`](../aspose.threed.entities/line/segments/) , 연결된 선분의 집합일 수도 있음을 의미합니다. 선은 일반적으로 선형 개체이므로 곡선을 나타내는 데 사용할 수 없습니다.[`NurbsCurve`](../aspose.threed.entities/nurbscurve/) . |
| [LinearExtrusion](./linearextrusion/) | 선형 돌출은 2D 형상을 입력으로 받아 3차원으로 형상을 확장합니다. |
| [Mesh](./mesh/) | 메쉬는 많은 n면 다각형으로 구성됩니다. |
| [NurbsCurve](./nurbscurve/) | [NURBS 곡선](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) 는 NURBS(Non-uniform rational basis spline)로 표현되는 곡선, NURBS 곡선은 다음과 같이 정의됩니다.[`Order`](../aspose.threed.entities/nurbscurve/order/) , 가중 세트[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/) 그리고[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors/) 제어점의 w 구성 요소는 그것이 무엇이든 제어점의 가중치로 사용됩니다.TwoDimensional 또는ThreeDimensional |
| [NurbsDirection](./nurbsdirection/) | 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) 두 가지 방향이 있습니다.[`U`](../aspose.threed.entities/nurbssurface/u/) 그리고[`V`](../aspose.threed.entities/nurbssurface/v/) ,[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/) 각 방향에 대한 데이터를 정의합니다. 방향은 실제로 NURBS 곡선입니다.[`Order`](../aspose.threed.entities/nurbsdirection/order/) , ㅏ[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors/) , 및 가중 제어점 세트(에서 정의됨)[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) ). |
| [NurbsSurface](./nurbssurface/) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface/) 로 표현되는 표면이다.[NURBS(비균일 유리 기저 스플라인)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) 두 가지로 정의된다[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/)[`U`](../aspose.threed.entities/nurbssurface/u/) 그리고[`V`](../aspose.threed.entities/nurbssurface/v/) . 제어점의 w 성분은 방향의 종류가 무엇이든 제어점의 가중치로 사용됩니다.TwoDimensional 또는ThreeDimensional |
| [Patch](./patch/) | A[`Patch`](../aspose.threed.entities/patch/) 다음과 유사한 파라메트릭 모델링 표면입니다.[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) , 또한 두 개의 로 정의됩니다.[`PatchDirection`](../aspose.threed.entities/patchdirection/) ,[`U`](../aspose.threed.entities/patch/u/) 그리고[`V`](../aspose.threed.entities/patch/v/) . 하지만 차이점은[`Patch`](../aspose.threed.entities/patch/) 그리고[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) 그게[`PatchDirection`](../aspose.threed.entities/patchdirection/) 곡선 는 다음 중 하나일 수 있습니다.Bezier ,QuadraticBezier ,BasisSpline ,CardinalSpline 그리고Linear |
| [PatchDirection](./patchdirection/) | 패치의 U 및 V 방향. |
| [Plane](./plane/) | 매개변수화된 평면. |
| [PointCloud](./pointcloud/) | 포인트 클라우드에는 토폴로지 정보가 없고 제어점과 정점 요소만 있습니다. |
| [PolygonBuilder](./polygonbuilder/) | 다각형을 만드는 도우미 클래스[`Mesh`](../aspose.threed.entities/mesh/) |
| [PolygonModifier](./polygonmodifier/) | 다각형을 수정하는 유틸리티 |
| [Primitive](./primitive/) | 모든 primitives 의 기본 클래스 |
| [Pyramid](./pyramid/) | 파라미터화된 피라미드. |
| [RectangularTorus](./rectangulartorus/) | 매개변수화된 직사각형 토러스. |
| [RevolvedAreaSolid](./revolvedareasolid/) | 이 클래스는 프로파일이 제공하는 단면을 축에 대해 회전시켜 솔리드 모델을 나타냅니다. |
| [Shape](./shape/) | 모양은 제어점 세트의 변형을 설명하며 Maya의 클러스터 디포머와 유사합니다. 예를 들어 생성된 형상에 모양을 추가할 수 있습니다. 그리고 형상과 기하학은 동일한 토폴로지 정보를 갖지만 제어점의 위치는 다릅니다. 다양한 영향력으로 지오메트리가 변형 효과를 냅니다. |
| [Skeleton](./skeleton/) | [`Skeleton`](../aspose.threed.entities/skeleton/)주로 CAD 소프트웨어에서 설계자가 골격 구조의 변형을 조작하는 데 도움을 주기 위해 사용되며 CAD 소프트웨어 외부에서는 일반적으로 쓸모가 없습니다. 골격 계층이 CAD 소프트웨어에서 하나의 개체처럼 작동하도록 하려면 상단[`Skeleton`](../aspose.threed.entities/skeleton/) 노드를 루트 노드로 설정하여[`Type`](../aspose.threed.entities/skeleton/type/) 에게Skeleton , 및 모든 자식은Bone |
| [Sphere](./sphere/) | 매개변수화된 구. |
| [SweptAreaSolid](./sweptareasolid/) | A[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid/) Directrix. 를 따라 프로필을 스윕하여 형상을 구성합니다. |
| [Torus](./torus/) | 매개변수화된 토러스. |
| [TransformedCurve](./transformedcurve/) | A[`TransformedCurve`](../aspose.threed.entities/transformedcurve/) 변환 행렬을 사용하여 곡선에 배치를 제공합니다. 이렇게 하면 내부에서 변환을 수행할 수 있습니다.[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve/) 또는[`CompositeCurve`](../aspose.threed.entities/compositecurve/) . |
| [TriMesh](./trimesh/) | TriMesh에는 GPU에서 직접 사용할 수 있는 원시 데이터가 포함되어 있습니다. 이 클래스는 정점별 데이터만 포함하는 메시를 구성하는 데 도움이 되는 유틸리티입니다. |
| [TriMesh&lt;T&gt;](./trimesh-1/) | 의 일반 버전[`TriMesh`](../aspose.threed.entities/trimesh/) 사용자의 정적 정의 정점 type |
| [TrimmedCurve](./trimmedcurve/) | 양쪽 끝에서 기준 곡선을 트리밍한 유계 곡선. |
| [VertexElement](./vertexelement/) | 정점 요소의 기본 클래스. 정점 요소 유형은 VertexElementType으로 식별됩니다. VertexElement는 정점 요소가 기하학 표면에 매핑되는 방식과 매핑 정보가 메모리에 배열되는 방식을 설명합니다. VertexElement에는 법선, UV 또는 기타 종류의 정보가 포함됩니다. |
| [VertexElementBinormal](./vertexelementbinormal/) | 지정된 구성 요소에 대한 종법선 벡터를 정의합니다. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate/) | 콘크리트 정의를 위한 도우미 클래스[`VertexElement`](../aspose.threed.entities/vertexelement/) 구현. |
| [VertexElementEdgeCrease](./vertexelementedgecrease/) | 지정된 구성 요소의 가장자리 주름을 정의합니다. |
| [VertexElementHole](./vertexelementhole/) | 지정된 다각형이 hole 인지 정의합니다. |
| [VertexElementIntsTemplate](./vertexelementintstemplate/) | 콘크리트 정의를 위한 도우미 클래스[`VertexElement`](../aspose.threed.entities/vertexelement/) 구현. |
| [VertexElementMaterial](./vertexelementmaterial/) | 지정된 구성 요소에 대한 재료 인덱스를 정의합니다. 노드는 여러 재료를 가질 수 있습니다.[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial/) 다른 재질의 형상의 다른 부분을 렌더링하는 데 사용됩니다. |
| [VertexElementNormal](./vertexelementnormal/) | 지정된 구성 요소에 대한 법선 벡터를 정의합니다. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup/) | 관련 폴리곤을 함께 그룹화하기 위해 지정된 구성 요소에 대한 폴리곤 그룹을 정의합니다. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup/) | 스무딩 그룹은 매끄러운 표면을 형성하는 것처럼 보이는 폴리곤 메쉬의 폴리곤 그룹입니다. DOS용 3D 스튜디오 맥스와 같은 일부 초기 3D 모델링 소프트웨어는 각 메쉬 정점에 대한 노멀 벡터 저장을 무효화하기 위해 스무딩 그룹을 사용했습니다. |
| [VertexElementSpecular](./vertexelementspecular/) | 지정된 구성 요소에 대한 반사광 색상을 정의합니다. |
| [VertexElementTangent](./vertexelementtangent/) | 지정된 구성 요소에 대한 탄젠트 벡터를 정의합니다. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1/) | 콘크리트 정의를 위한 도우미 클래스[`VertexElement`](../aspose.threed.entities/vertexelement/) 구현. |
| [VertexElementUserData](./vertexelementuserdata/) | 지정된 구성 요소에 대한 사용자 지정 사용자 데이터를 정의합니다. 일반적으로 특수 목적을 위한 응용 프로그램별 데이터입니다. |
| [VertexElementUV](./vertexelementuv/) | 지정된 구성 요소에 대한 UV 좌표를 정의합니다. 지오메트리는 여러 개를 가질 수 있습니다.[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/) 요소가 있으며 각각 다른[`TextureMapping`](../aspose.threed.entities/texturemapping/) s. |
| [VertexElementVector4](./vertexelementvector4/) | 콘크리트 정의를 위한 도우미 클래스[`VertexElement`](../aspose.threed.entities/vertexelement/) 구현. |
| [VertexElementVertexColor](./vertexelementvertexcolor/) | 지정된 구성요소 의 정점 색상을 정의합니다. |
| [VertexElementVertexCrease](./vertexelementvertexcrease/) | 지정된 구성요소 에 대한 꼭지점 주름을 정의합니다. |
| [VertexElementVisibility](./vertexelementvisibility/) | 지정된 구성 요소가 visible 인지 정의합니다. |
| [VertexElementWeight](./vertexelementweight/) | 지정된 구성 요소에 대한 혼합 가중치를 정의합니다. |
## 구조

| 구조 | 설명 |
| --- | --- |
| [EndPoint](./endpoint/) | 곡선을 자르기 위한 끝점은 매개변수 값 또는 데카르트 점일 수 있습니다. |
## 인터페이스

| 상호 작용 | 설명 |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement/) | 인덱스 데이터가 있는 VertexElement. |
| [IMeshConvertible](./imeshconvertible/) | 이 인터페이스를 구현한 엔터티는 다음으로 변환할 수 있습니다.[`Mesh`](../aspose.threed.entities/mesh/) |
| [IOrientable](./iorientable/) | Orientable 엔티티는 이 인터페이스를 구현해야 합니다. |
## 열거

| 열거 | 설명 |
| --- | --- |
| [ApertureMode](./aperturemode/) | 카메라 조리개 모드. 조리개 모드는 카메라 조리개를 제어하는 값을 결정합니다. 조리개 모드가 HorizAndVert, Horizontal 또는 Vertical이면 시야각이 사용됩니다. 조리개 모드가 FocalLength이면 초점 거리가 사용됩니다. |
| [CurveDimension](./curvedimension/) | 곡선의 치수. |
| [LightType](./lighttype/) | 조명 유형. |
| [MappingMode](./mappingmode/) | 요소가 표면에 매핑되는 방식을 결정합니다. [`MappingMode`](../aspose.threed.entities/mappingmode/) 방법을 정의[`VertexElement`](../aspose.threed.entities/vertexelement/) 지오메트리 표면에 매핑됩니다. |
| [NurbsType](./nurbstype/) | NURBS 유형. |
| [PatchDirectionType](./patchdirectiontype/) | 패치 방향의 유형. |
| [ProjectionType](./projectiontype/) | 카메라의 프로젝션 유형. |
| [ReferenceMode](./referencemode/) | [`ReferenceMode`](../aspose.threed.entities/referencemode/) . 에서 매핑 정보를 저장하고 참조하는 방법을 정의합니다. |
| [RotationMode](./rotationmode/) | 절두체의 회전 mode |
| [SkeletonType](./skeletontype/) | [`Skeleton`](../aspose.threed.entities/skeleton/) 유형. |
| [SplitMeshPolicy](./splitmeshpolicy/) | 하위 메시 간에 정점/제어점 데이터를 공유하거나 각 하위 메시에 자체 압축 데이터가 있습니다. |
| [TextureMapping](./texturemapping/) | 텍스처 매핑 유형[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/) 어떤 종류의 텍스처 매핑이 사용되는지 설명합니다. |
| [VertexElementType](./vertexelementtype/) | 모델링에서 사용되는 방법을 정의한 정점 요소의 유형입니다. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
