---
title: Aspose.CAD.FileFormats.Collada.FileParser.Elements
second_title: Aspose.CAD for .NET API 参考
description: 
type: docs
weight: 470
url: /zh/net/aspose.cad.fileformats.collada.fileparser.elements/
---


## 课程

| 班级 | 描述 |
| --- | --- |
| [Accessor](./accessor) | 访问器。 访问器元素声明对数组元素之一的访问模式: FLOAT_ARRAY、INT_ARRAY、NAME_ARRAY、BOOL_ARRAY、TOKEN_ARRAY 和 IDREF_ARRAY。 访问器元素描述了对以交错或非交错方式组织的数组的访问， 取决于偏移量和步幅属性。 |
| [Altitude](./altitude) | 海拔高度。 高度总是以米为单位。 如果模式为“绝对”，则该值被解释为距离平均海平面的米。 如果模式为“relativeToGround”，则该值被解释为高于该特定位置的实际地面高度的米。 |
| [Asset](./asset) | COLLADA 资产。 资产元素定义关于其父元素的资产管理信息。 |
| [AssetUnit](./assetunit) | 资产单位。 unit 元素包含有关计量单位的描述性信息。 它具有单位名称和相对于仪表的测量值的属性。 单位元素可能出现零次或一次。 |
| [Bind](./bind) | 绑定。 bind元素在实例化时将值绑定到效果参数。 |
| [BindMaterial](./bindmaterial) | 绑定材质。 将特定材质绑定到一个几何体，同时绑定可变参数和统一参数。 |
| [BindVertexInput](./bindvertexinput) | 绑定顶点输入。 bind_vertex_input 元素在实例化时将顶点输入绑定到效果参数。 |
| [BoolArray](./boolarray) | 布尔数组。 BOOL_ARRAY 元素声明存储布尔值的同构数组。 |
| [Brep](./brep) | BREP。 描述边界表示 (BREP) 结构。 |
| [Camera](./camera) | 相机。 声明视觉场景层次或场景图的视图。 |
| [CameraOptics](./cameraoptics) | 相机光学元件。 表示照相机上将图像投射到图像传感器上的装置。 |
| [CameraOpticsTechniqueCommon](./cameraopticstechniquecommon) | 常用的相机光学技术。 |
| [CameraOpticsTechniqueCommonOrthographic](./cameraopticstechniquecommonorthographic) | 相机光学技术常用的正交法。 描述正交相机的视野。 |
| [CameraOpticsTechniqueCommonPerspective](./cameraopticstechniquecommonperspective) | 相机光学技术常用视角。 描述透视相机的视野。 |
| [Circle](./circle) | 圆圈。 |
| [Collada](./collada) | COLLADA 元素声明包含 COLLADA 模式中的某些内容的文档的根。 |
| [ColladaElement](./colladaelement) | 基本 COLLADA 元素。 |
| [Cone](./cone) | 圆锥。 描述圆锥面。 |
| [Contributor](./contributor) | 贡献者。 贡献者元素定义资产管理的创作信息。 |
| [ControlVertices](./controlvertices) | 控制顶点。 用于描述样条的CV。 |
| [ConvexMesh](./convexmesh) | 凸网格。 凸网格元素的定义与网格元素相同，除了 不是完整的描述（源、顶点、多边形等），它可以简单地指向另一个几何来推导出它的形状。 后一种情况意味着应该计算该几何图形的凸包，并由可选的“convex_hull_of”属性指示。 |
| [Coverage](./coverage) | 覆盖范围。 使用 WGS84 坐标系指定资产的位置。 |
| [Curve](./curve) | 曲线。 |
| [Curves](./curves) | 曲线。 该元素包含拓扑实体边缘的几何描述所需的所有曲线。 |
| [Cylinder](./cylinder) | 圆柱体。 描述无限的圆柱面。 |
| [Edges](./edges) | 边缘。 边由两个顶点限制，并具有用于几何表示的曲线。 曲线段也受其起始和结束参数的限制。 |
| [Effect](./effect) | 效果。 对 SHADER 效果的自包含描述。 |
| [Ellipse](./ellipse) | 椭圆。 |
| [EvaluateScene](./evaluatescene) | 评估场景。 evaluate_scene 元素声明指定如何评估此visual_scene 的信息。 可以有任意数量的evaluate_scene 元素。 它们按顺序进行评估，并且可以通过设置 enabled = false 禁用特定的一个。 |
| [Extra](./extra) | 额外的 COLLADA 资产。 额外元素声明有关其父元素的附加信息。 |
| [Faces](./faces) | 面孔。 面由一根或多根线限制。 |
| [FloatArray](./floatarray) | 浮点数组。 float_array 元素声明存储浮点值的同构数组。 |
| [FxCommonColorOrTexture](./fxcommoncolorortexture) | FX常用颜色或纹理。 描述固定功能SHADER元素颜色属性的类型。 |
| [FxCommonColorOrTextureColor](./fxcommoncolorortexturecolor) | FX常用颜色或纹理颜色。 包含描述RGBA颜色的四个浮点值。 |
| [FxCommonColorOrTextureParam](./fxcommoncolorortextureparam) | FX 常用颜色或纹理参数。 引用一个预定义的参数。 |
| [FxCommonColorOrTextureTexture](./fxcommoncolorortexturetexture) | FX常用颜色或纹理纹理。 |
| [FxCommonFloatOrParameter](./fxcommonfloatorparameter) | FX 常用浮点数或参数。 描述固定功能 SHADER 元素的标量属性。 |
| [FxCommonFloatOrParameterFloat](./fxcommonfloatorparameterfloat) | FX常用浮点数或参数浮点数。 该值由文字浮点标量表示。 |
| [FxCommonFloatOrParameterParameter](./fxcommonfloatorparameterparameter) | FX常用浮点数或参数参数。 该值由对先前定义的参数的引用表示，该参数可以直接转换为浮点标量。 |
| [FxCommonTransparent](./fxcommontransparent) | FX通用透明。 |
| [GeographicLocation](./geographiclocation) | 地理位置。 使用 WGS84 坐标系指定资产的位置。 |
| [Geometry](./geometry) | 几何。 几何描述场景中物体的视觉形状和外观。 几何元素对几何信息的声明进行分类。几何是数学的一个分支 处理点、线、角、面和固体。 |
| [Hyperbola](./hyperbola) | 双曲线。 |
| [IdRefArray](./idrefarray) | id ref 数组。 IDREF_array 元素声明了 ID 参考值的同构数组的存储。 |
| [InputLocal](./inputlocal) | 输入本地。 input_local_type 元素用于表示只能引用同一文档中声明的资源的输入。 |
| [InputLocalOffset](./inputlocaloffset) | 输入本地偏移量。 input_local_offset_type 元素用于表示只能引用同一文档中声明的资源的索引输入。 |
| [InstanceCamera](./instancecamera) | 实例摄像机。 Instance Camera 元素实例化一个由相机元素描述的对象，以在视觉场景中激活它。 |
| [InstanceEffect](./instanceeffect) | 实例效果。 |
| [InstanceGeometry](./instancegeometry) | 实例几何体。 instance_geometry 元素声明了 COLLADA 几何资源的实例化。 |
| [InstanceImage](./instanceimage) | 实例图像。 |
| [InstanceJoint](./instancejoint) | 实例关节。 |
| [InstanceLight](./instancelight) | 实例灯。 instance_light 元素声明了 COLLADA 灯光资源的实例化。 |
| [InstanceMaterialGeometry](./instancematerialgeometry) | 实例材质。 instance_material 元素声明了 COLLADA 材质资源的实例化。 |
| [InstanceMaterialRendering](./instancematerialrendering) | 实例材质渲染。 实例化 COLLADA 材质资源以获得屏幕效果。 |
| [InstanceNode](./instancenode) | 实例节点。 instance_node 元素声明了 COLLADA 节点资源的实例化。 |
| [InstancePhysicsMaterial](./instancephysicsmaterial) | 实例物理材质。 |
| [InstanceVisualScene](./instancevisualscene) | 实例视觉场景。 |
| [InstanceWithExtra](./instancewithextra) | 有额外的实例。 instance_with_extra_type 元素用于所有通用实例元素。 通用实例元素是没有声明任何特定子元素的实例元素。 |
| [IntArray](./intarray) | 整数数组。 INT_ARRAY 元素声明了整数值的同构数组的存储。 |
| [LibraryCameras](./librarycameras) | 库摄像机。 提供放置相机元素的库。 |
| [LibraryEffects](./libraryeffects) | 库效果。 library_effects 元素声明了一个效果元素模块。 |
| [LibraryGeometries](./librarygeometries) | 库几何。 library_geometries 元素声明了一个几何元素模块。 |
| [LibraryMaterials](./librarymaterials) | 图书馆资料。 library_materials 元素声明了一个材料元素模块。 |
| [LibraryVisualScenes](./libraryvisualscenes) | 视觉场景库。 library_visual_scenes 元素声明了一个由 visual_scene 元素组成的模块。 |
| [Line](./line) | 行。 |
| [Lines](./lines) | 行。 lines 元素提供了将顶点属性绑定在一起所需的信息，然后将这些顶点组织成单独的线。 网格描述的每条线都有两个顶点。 第一行由第一个和第二个顶点组成。 第二行由第三个和第四个顶点组成，以此类推。 |
| [Linestrips](./linestrips) | LINESTRIPS。 linEStrips 元素提供了将顶点属性绑定在一起所需的信息，然后将这些顶点组织成连接的线条。 网格描述的每个线带都有任意数量的顶点。 线带内的每条线段由当前顶点和前一个顶点组成。 |
| [Lookat](./lookat) | 看看。 观察元素包含适合瞄准相机的位置和方向变换。 查看元素包含三个数学向量，描述: 1. 对象的位置； 2.兴趣点的位置； 3. 向上的方向。 |
| [Material](./material) | 材质。 材质描述几何对象的视觉外观。 |
| [Matrix](./matrix) | 矩阵。 矩阵变换体现了坐标系内的点或坐标系本身的数学变化。 矩阵元素包含一个 4×4 浮点值矩阵。 |
| [Mesh](./mesh) | 网格。 网格元素包含足以描述基本几何网格的顶点和图元信息。 |
| [NameArray](./namearray) | 名称数组。 Name_array 元素声明存储名称字符串值的同构数组。 |
| [Node](./node) | 节点。 节点体现了场景中元素的层次关系。 |
| [Nurbs](./nurbs) | NURBS。 描述 3D 空间中的 NURBS 曲线。 |
| [NurbsSurface](./nurbssurface) | NURBS 曲面。 描述 3D 空间中的 NURBS 曲面。 |
| [Orient](./orient) | 东方。 描述对象框的方向。 方向由任意轴和角度给出。 |
| [Origin](./origin) | 原点。 描述对象框架的来源。 原点由 3D 空间中的位置给出。 |
| [Parabola](./parabola) | 抛物线。 |
| [Parameter](./parameter) | 参数。 参数元素声明有关其父元素的参数信息。 |
| [ParametricCurves](./parametriccurves) | 参数曲线。 指定边在面的参数空间中的表示方式。 |
| [Plane](./plane) | 飞机。 定义一个无限平面。 |
| [Polygons](./polygons) | 多边形。 多边形元素提供了绑定顶点属性 所需的信息，然后将这些顶点组织成单独的多边形。 所描述的多边形可以包含任意数量的顶点。 这些多边形可能是自相交的，也可能包含孔。 |
| [Polylist](./polylist) | POLYLIST。 POLYLIST 元素提供了将顶点属性绑定在一起所需的信息，然后将这些顶点组织成单独的多边形。 POLYLIST 中描述的多边形可以包含任意数量的顶点。 与多边形元素不同，POLYLIST 元素不能包含带孔的多边形。 |
| [Primitives](./primitives) | 原语。 原始元素表示原始类型的原始数据。 基元元素包含引用输入元素引用的父源元素的索引。 |
| [PrimitivesWithHoles](./primitiveswithholes) | 带孔的基元。 描述包含一个或多个孔的基元。 |
| [ProfileBridge](./profilebridge) | 配置文件桥。 将 COLLADA FX 桥接到外部 FX 框架，例如 NVIDIA 的 CgFX 或 Microsoft 的 Direct3D FX |
| [ProfileCommon](./profilecommon) | 通用配置文件。 打开一个 COMMON 平台特定的数据类型和技术声明块。 |
| [ProfileCommonTechnique](./profilecommontechnique) | 配置文件常用技术。 保存使用一种方法渲染此效果所需的纹理、采样器、SHADERS、参数和通道的描述。 |
| [Render](./render) | 评估场景渲染。 描述评估场景的一个效果通道。 |
| [Rotate](./rotate) | 旋转。 旋转元素包含一个角度和一个表示旋转轴的数学向量。 |
| [Scale](./scale) | 比例。 比例元素包含一个数学向量，表示坐标系统的 X、Y 和 Z 轴的相对比例。 |
| [Scene](./scene) | 场景。 场景体现了可以从 COLLADA 资源的内容中可视化的整个信息集。 场景元素声明场景层次或场景图的基础。 场景包含的元素构成了创作工具创建的大部分视觉和转换信息内容。 |
| [Shells](./shells) | 贝壳。 描述 B-rep 结构的壳。 壳是一个或多个面的联合。 封闭壳可以限制实体。 |
| [SidRefArray](./sidrefarray) | sid ref 数组。 SIDREF_array 元素声明 SID 参考值的同构数组的存储。 |
| [Skew](./skew) | 偏斜。 倾斜元素包含一个角度和两个数学向量，分别代表旋转轴和平移轴。 |
| [Solids](./solids) | 固体。 该元素定义了 BREP 结构中使用的所有实体 |
| [Source](./source) | 源。 源元素声明一个数据存储库，该数据存储库根据引用它的输入元素的语义提供值。 |
| [Sphere](./sphere) | 球体。 描述以局部原点为中心的球体。 |
| [Spline](./spline) | 样条线。 样条元素包含足以描述基本样条的控制顶点信息。 |
| [Surface](./surface) | 表面。 表面定义了表面元素的属性。 通过旋转和平移可以将曲面定位到正确的位置。 |
| [SurfaceCurves](./surfacecurves) | 曲面曲线。 曲线所在曲面的参数空间中的曲线。 |
| [Surfaces](./surfaces) | 曲面。 包含在 B-rep 结构中使用的所有表面。 |
| [SweptSurface](./sweptsurface) | 扫过的表面。 通过拉伸或旋转曲线来描述曲面。 |
| [TargetableFloat](./targetablefloat) | 可定位的浮点数。 targetable_float_type 元素用于表示包含单个浮点值的元素，该浮点值可以作为动画的目标。 |
| [TargetableFloat3](./targetablefloat3) | 目标可以浮动 3. |
| [TargetableFloat4](./targetablefloat4) | 目标可以浮动 4. |
| [Technique](./technique) | 技术。 技术元素声明用于处理部分内容的信息。 每种技术都符合相关的配置文件。技术通常充当“开关”。 如果内容的特定部分存在多个，则在导入时，会选择一个或另一个，但通常不会同时选择两者。 选择应基于导入应用程序可以支持的配置文件。 技术包含应用程序数据和程序，使它们成为可以作为一个单元进行管理的资产。 |
| [TechniqueBlinn](./techniqueblinn) | BLINN 技术。 使用 BLINN BRDF 近似生成阴影表面。 |
| [TechniqueCommon](./techniquecommon) | 常用技术。 通用技术指定访问此源元素数据的通用方法。 |
| [TechniqueConstant](./techniqueconstant) | 技术常数。 生成不受光照影响的恒定阴影表面。 |
| [TechniqueHint](./techniquehint) | 技巧提示。 为在此效果中使用哪种技术的平台添加提示。 |
| [TechniqueLambert](./techniquelambert) | 朗伯技术。 生成独立于光照的漫反射阴影表面。 |
| [TechniqueOverride](./techniqueoverride) | 技术覆盖。 针对特定技术并在材质内部传递，而不必将效果技术拆分为多个效果。 |
| [TechniquePhong](./techniquephong) | 技术 PHONG。 生成一个阴影表面，其中镜面反射根据 PHONG BRDF 近似值进行阴影处理。 |
| [TokenArray](./tokenarray) | 令牌数组。 token_array_type 元素声明了用于存储令牌字符串值的同构数组。 |
| [Torus](./torus) | 圆环。 描述 3D 空间中的圆环。 |
| [Translate](./translate) | 翻译。 translate 元素包含一个数学向量，表示沿 X、Y 和 Z 轴的距离。 |
| [Triangles](./triangles) | 三角形。 triangles 元素提供了绑定顶点属性 所需的信息，然后将这些顶点组织成单独的三角形。 网格描述的每个三角形都有三个顶点。 第一个三角形由第一个、第二个和第三个顶点组成。 第二个三角形由第四个、第五个和第六个顶点组成，以此类推。 |
| [Trifans](./trifans) | TRIFANS。 TRIFANS 元素提供了将顶点属性绑定在一起所需的信息，然后将这些顶点组织成相连的三角形。 网格描述的每个三角形都有三个顶点。 第一个三角形由第一个、第二个和第三个顶点组成。 每个后续三角形都是从当前顶点形成的，重复使用第一个和之前的顶点。 |
| [Tristrips](./tristrips) | TRISTRIPS。 TRISTRIPS 元素提供了将顶点属性绑定在一起所需的信息，然后将这些顶点组织成相连的三角形。 网格描述的每个三角形都有三个顶点。 第一个三角形由第一个、第二个和第三个顶点组成。每个后续三角形都由当前顶点组成，重复使用前两个顶点。 |
| [Vertices](./vertices) | 顶点。 vertices 元素声明了网格顶点的属性和身份。 顶点元素描述网格几何中的网格顶点。 网格顶点表示构成网格的顶点的位置（身份）和其他对镶嵌不变的顶点属性。 |
| [VisualScene](./visualscene) | 视觉场景。 visual_scene 元素声明了visual_scene 层次结构或场景图的基础。 场景包含的元素构成了创作工具创建的大部分视觉和转换信息内容。 |
| [Wires](./wires) | 电线。 连线是一条或多条边的组合。 闭合线可以限制人脸。 |
## 枚举

| 枚举 | 描述 |
| --- | --- |
| [EnumAltitudeMode](./enumaltitudemode) | 海拔模式。 geographic_location元素中altitude元素上mode属性的合法值。 |
| [EnumChoiceSweptType](./enumchoiceswepttype) | 选择扫描类型的枚举。 |
| [EnumFxOpaque](./enumfxopaque) | 枚举器 FX 不透明。 |
| [EnumFxSamplerMagFilter](./enumfxsamplermagfilter) | 枚举FX采样器mag过滤器。 |
| [EnumFxSamplerMinFilter](./enumfxsamplerminfilter) | 枚举FX采样器最小过滤器。 |
| [EnumFxSamplerMipFilter](./enumfxsamplermipfilter) | 枚举 FX 采样器 MIP 过滤器。 |
| [EnumFxSamplerWrap](./enumfxsamplerwrap) | 枚举FX采样器换行。 |
| [EnumNode](./enumnode) | 节点类型枚举。 |
| [EnumOrthograthicItems](./enumorthograthicitems) | 枚举 ORTHOGRATHIC 项。 |
| [EnumPerspectiveItems](./enumperspectiveitems) | 枚举透视项目。 |
| [EnumUpAxis](./enumupaxis) | 向上轴枚举。 枚举类型，指定可接受的上轴值。 |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.CAD.dll -->
