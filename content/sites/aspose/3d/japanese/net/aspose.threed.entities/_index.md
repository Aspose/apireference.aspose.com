---
title: Aspose.ThreeD.Entities
second_title: Aspose.3D for.NETAPIリファレンス
description: すべてのジオメトリとエンティティはこの名前空間で定義されています
type: docs
weight: 40
url: /ja/net/aspose.threed.entities/
---
すべてのジオメトリとエンティティは、この名前空間で定義されています

## クラス

| クラス | 説明 |
| --- | --- |
| [Box](./box/) | ボックス. |
| [Camera](./camera/) | カメラは、シーンを見ている視聴者の視点を表します. |
| [Circle](./circle/) | A[`Circle`](../aspose.threed.entities/circle/)曲線は、円形状のエッジにある点のセットで構成されます. |
| [CompositeCurve](./compositecurve/) | A[`CompositeCurve`](../aspose.threed.entities/compositecurve/)複数の曲線セグメントで構成されています. |
| [Curve](./curve/) | すべての曲線の実装の基本クラス。 |
| [Cylinder](./cylinder/) | Parameterized Cylinder. radiusTop/radiusBottom のいずれかがゼロの場合、円錐を表すためにも使用できます。 |
| [Dish](./dish/) | パラメータ化した料理. |
| [Ellipse](./ellipse/) | アン[`Ellipse`](../aspose.threed.entities/ellipse/)楕円の形状を形成する点のセットを定義します. |
| [Frustum](./frustum/) | の基本クラス[`Camera`](../aspose.threed.entities/camera/)と[`Light`](../aspose.threed.entities/light/) |
| [Geometry](./geometry/) | すべてのレンダリング可能なジオメトリ オブジェクトの基本クラス ([`Mesh`](../aspose.threed.entities/mesh/) 、[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) 、[`Patch`](../aspose.threed.entities/patch/)など). |
| [Light](./light/) | 光がシーンを照らします. |
| [Line](./line/) | ポリラインは、一連のポイントによって定義されるパスです。[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/) 、およびによって接続されています[`Segments`](../aspose.threed.entities/line/segments/), これは、接続された線分のセットにもなり得ることを意味します。[`NurbsCurve`](../aspose.threed.entities/nurbscurve/). |
| [LinearExtrusion](./linearextrusion/) | 線形押し出しは、入力として 2D 形状を取り、その形状を 3 次元に拡張します。 |
| [Mesh](./mesh/) | メッシュは多数の n 辺のポリゴンで構成されています。 |
| [NurbsCurve](./nurbscurve/) | [NURBS カーブ](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) NURBS(非一様有理基底スプライン)で表される曲線です, NURBS曲線はそのによって定義されます[`Order`](../aspose.threed.entities/nurbscurve/order/)、加重のセット[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/)そして[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors/) コントロール ポイントの w コンポーネントは、それが何であれ、コントロール ポイントの重みとして使用されます。TwoDimensionalまたThreeDimensional |
| [NurbsDirection](./nurbsdirection/) | 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) 2 つの方向があります。[`U`](../aspose.threed.entities/nurbssurface/u/)と[`V`](../aspose.threed.entities/nurbssurface/v/) 、[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/)各方向のデータを定義します。 方向は実際には NURBS カーブです。つまり、方向によっても定義されます。[`Order`](../aspose.threed.entities/nurbsdirection/order/)、[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors/) 、および一連の加重制御点 (で定義)[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) ). |
| [NurbsSurface](./nurbssurface/) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface/)で表される曲面です。[NURBS(非一様有理基底スプライン)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A[`NurbsSurface`](../aspose.threed.entities/nurbssurface/)によって定義されます[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/)[`U`](../aspose.threed.entities/nurbssurface/u/)と[`V`](../aspose.threed.entities/nurbssurface/v/). コントロール ポイントの w コンポーネントは、方向のタイプが何であれ、コントロール ポイントの重みとして使用されます。TwoDimensionalまたThreeDimensional |
| [Patch](./patch/) | A[`Patch`](../aspose.threed.entities/patch/)に似たパラメトリック モデリング サーフェスです。[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) 、2 つの によっても定義されます[`PatchDirection`](../aspose.threed.entities/patchdirection/) 、[`U`](../aspose.threed.entities/patch/u/)と[`V`](../aspose.threed.entities/patch/v/). しかし違い[`Patch`](../aspose.threed.entities/patch/)と[`NurbsSurface`](../aspose.threed.entities/nurbssurface/)それは[`PatchDirection`](../aspose.threed.entities/patchdirection/)曲線 は次のいずれかになりますBezier 、QuadraticBezier 、BasisSpline 、CardinalSplineとLinear |
| [PatchDirection](./patchdirection/) | パッチの U および V 方向。 |
| [Plane](./plane/) | パラメータ化された平面. |
| [PointCloud](./pointcloud/) | ポイント クラウドにはトポロジ情報は含まれず、コントロール ポイントと頂点要素のみが含まれます。 |
| [PolygonBuilder](./polygonbuilder/) | ポリゴンを構築するためのヘルパー クラス[`Mesh`](../aspose.threed.entities/mesh/) |
| [PolygonModifier](./polygonmodifier/) | polygons を変更するユーティリティ |
| [Primitive](./primitive/) | すべてのプリミティブの基本クラス |
| [Pyramid](./pyramid/) | パラメータ化されたピラミッド. |
| [RectangularTorus](./rectangulartorus/) | パラメータ化された長方形のトーラス. |
| [RevolvedAreaSolid](./revolvedareasolid/) | このクラスは、軸を中心にプロファイルによって提供される断面を回転させることにより、ソリッド モデルを表します. |
| [Shape](./shape/) | シェイプは、Maya のクラスタ デフォーマに似た一連のコントロール ポイントの変形を表します。 たとえば、作成したジオメトリにシェイプを追加できます。 また、形状とジオメトリは同じトポロジ情報を持ちますが、制御点の位置が異なります。 さまざまな量の影響で、ジオメトリはデフォメーション エフェクトを実行します。 |
| [Skeleton](./skeleton/) | [`Skeleton`](../aspose.threed.entities/skeleton/)主に CAD ソフトウェアで使用され、設計者が骨格構造の変換を操作できるようにします。通常、CAD ソフトウェア以外では役に立ちません。 骨格階層を CAD ソフトウェアの 1 つのオブジェクトのように機能させるには、トップ[`Skeleton`](../aspose.threed.entities/skeleton/)設定によるルートノードとしてのノード[`Type`](../aspose.threed.entities/skeleton/type/)にSkeleton, およびすべての子をに設定Bone |
| [Sphere](./sphere/) | パラメータ化された球体. |
| [SweptAreaSolid](./sweptareasolid/) | A[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid/)準線に沿ってプロファイルをスイープしてジオメトリを構築します. |
| [Torus](./torus/) | パラメータ化されたトーラス. |
| [TransformedCurve](./transformedcurve/) | A[`TransformedCurve`](../aspose.threed.entities/transformedcurve/)変換行列を使用して曲線に配置を与えます。 これにより、内部で変換を実行できます。[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve/)また[`CompositeCurve`](../aspose.threed.entities/compositecurve/). |
| [TriMesh](./trimesh/) | TriMesh には、GPU で直接使用できる生データが含まれています。 このクラスは、頂点ごとのデータのみを含むメッシュの構築を支援するユーティリティです。 |
| [TriMesh&lt;T&gt;](./trimesh-1/) | の汎用バージョン[`TriMesh`](../aspose.threed.entities/trimesh/)ユーザーの静的定義頂点 type |
| [TrimmedCurve](./trimmedcurve/) | ベース カーブの両端をトリムした境界付きカーブ。 |
| [VertexElement](./vertexelement/) | 頂点要素の基本クラス。 頂点要素タイプは、VertexElementType によって識別されます。 VertexElement は、頂点要素がジオメトリ サーフェスにどのようにマップされるか、およびマッピング情報がメモリ内でどのように配置されるかを記述します。 VertexElement には、法線、UV、またはその他の種類の情報が含まれています。 |
| [VertexElementBinormal](./vertexelementbinormal/) | 指定されたコンポーネントの従法線ベクトルを定義します。 |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate/) | コンクリートを定義するためのヘルパー クラス[`VertexElement`](../aspose.threed.entities/vertexelement/)実装. |
| [VertexElementEdgeCrease](./vertexelementedgecrease/) | 指定したコンポーネントのエッジの折り目を定義します |
| [VertexElementHole](./vertexelementhole/) | 指定されたポリゴンが hole かどうかを定義します |
| [VertexElementIntsTemplate](./vertexelementintstemplate/) | コンクリートを定義するためのヘルパー クラス[`VertexElement`](../aspose.threed.entities/vertexelement/)実装. |
| [VertexElementMaterial](./vertexelementmaterial/) | 指定されたコンポーネントのマテリアル インデックスを定義します。 ノードは複数のマテリアルを持つことができます。[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial/)さまざまなマテリアルでジオメトリのさまざまな部分をレンダリングするために使用されます. |
| [VertexElementNormal](./vertexelementnormal/) | 指定されたコンポーネントの法線ベクトルを定義します。 |
| [VertexElementPolygonGroup](./vertexelementpolygongroup/) | 指定されたコンポーネントのポリゴン グループを定義して、関連するポリゴンをグループ化します。 |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup/) | スムージング グループは、滑らかな表面を形成するように見えるポリゴン メッシュ内のポリゴンのグループです. DOS 用の 3D Studio max などの初期の 3D モデリング ソフトウェアでは、スムージング グループを使用して、各メッシュ頂点の法線ベクトルの保存を無効にしていました. |
| [VertexElementSpecular](./vertexelementspecular/) | 指定されたコンポーネントのスペキュラ カラーを定義します。 |
| [VertexElementTangent](./vertexelementtangent/) | 指定されたコンポーネントの接線ベクトルを定義します。 |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1/) | コンクリートを定義するためのヘルパー クラス[`VertexElement`](../aspose.threed.entities/vertexelement/)実装. |
| [VertexElementUserData](./vertexelementuserdata/) | 指定されたコンポーネントのカスタム ユーザー データを定義します。 通常は、特別な目的のためのアプリケーション固有のデータです。 |
| [VertexElementUV](./vertexelementuv/) | 指定されたコンポーネントの UV 座標を定義します。 ジオメトリは複数持つことができます[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/)要素があり、それぞれに異なる[`TextureMapping`](../aspose.threed.entities/texturemapping/)s. |
| [VertexElementVector4](./vertexelementvector4/) | コンクリートを定義するためのヘルパー クラス[`VertexElement`](../aspose.threed.entities/vertexelement/)実装. |
| [VertexElementVertexColor](./vertexelementvertexcolor/) | 指定したコンポーネントの頂点カラーを定義します |
| [VertexElementVertexCrease](./vertexelementvertexcrease/) | 指定したコンポーネントの頂点の折り目を定義します |
| [VertexElementVisibility](./vertexelementvisibility/) | 指定されたコンポーネントが表示されているかどうかを定義します |
| [VertexElementWeight](./vertexelementweight/) | 指定されたコンポーネントのブレンド重量を定義します。 |
## 構造物

| 構造 | 説明 |
| --- | --- |
| [EndPoint](./endpoint/) | 曲線をトリムする終点。パラメーター値またはデカルト ポイントを指定できます。 |
## インターフェース

| インターフェース | 説明 |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement/) | インデックス付き VertexElement data. |
| [IMeshConvertible](./imeshconvertible/) | このインターフェースを実装したエンティティは、[`Mesh`](../aspose.threed.entities/mesh/) |
| [IOrientable](./iorientable/) | 方向付け可能なエンティティは、このインターフェイスを実装する必要があります. |
## 列挙

| 列挙 | 説明 |
| --- | --- |
| [ApertureMode](./aperturemode/) | カメラ絞りモード. 絞りモードは、カメラの絞りを制御する値を決定します。 絞りモードが HorizAndVert、Horizontal、または Vertical の場合、視野が使用されます。 絞りモードが FocalLength の場合、焦点距離が使用されます。 |
| [CurveDimension](./curvedimension/) | 曲線の寸法。 |
| [LightType](./lighttype/) | ライトの種類. |
| [MappingMode](./mappingmode/) | 要素をサーフェスにマップする方法を決定します。 [`MappingMode`](../aspose.threed.entities/mappingmode/)定義方法[`VertexElement`](../aspose.threed.entities/vertexelement/)ジオメトリのサーフェスにマッピングされます. |
| [NurbsType](./nurbstype/) | NURBS タイプ。 |
| [PatchDirectionType](./patchdirectiontype/) | パッチの方向の種類. |
| [ProjectionType](./projectiontype/) | カメラの投影タイプ. |
| [ReferenceMode](./referencemode/) | [`ReferenceMode`](../aspose.threed.entities/referencemode/) . によってマッピング情報が保存および参照される方法を定義します。 |
| [RotationMode](./rotationmode/) | 錐台の回転モード |
| [SkeletonType](./skeletontype/) | [`Skeleton`](../aspose.threed.entities/skeleton/) s types. |
| [SplitMeshPolicy](./splitmeshpolicy/) | サブメッシュ間で頂点/制御点データを共有するか、各サブメッシュに独自の圧縮データがあります. |
| [TextureMapping](./texturemapping/) | のテクスチャ マッピング タイプ[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/) 使用されるテクスチャ マッピングの種類について説明します。 |
| [VertexElementType](./vertexelementtype/) | モデリングでの使用方法を定義した頂点要素のタイプ. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
