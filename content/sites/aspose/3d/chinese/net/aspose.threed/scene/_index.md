---
title: Scene
second_title: Aspose.3D for .NET API 参考
description: 场景是包含节点几何材质纹理动画姿势子场景等的顶级对象 场景可以有子场景在 collada/blender/fbx 等文件中充当多文档支持 节点层次结构可以通过RootNode访问Library./scene/library用于在序列化过程中保持对未附加对象如元数据或自定义对象的引用因此它可以用作库
type: docs
weight: 2240
url: /zh/net/aspose.threed/scene/
---
## Scene class

场景是包含节点、几何、材质、纹理、动画、姿势、子场景等的顶级对象。 场景可以有子场景，在 collada/blender/fbx 等文件中充当多文档支持 节点层次结构可以通过RootNode访问[`Library`](./library)用于在序列化过程中保持对未附加对象（如元数据或自定义对象）的引用，因此它可以用作库。

```csharp
public class Scene : SceneObject
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Scene](scene#constructor)() | 初始化[`Scene`](../scene)类的新实例。 |
| [Scene](scene#constructor_1)(Entity) | 使用附加到新节点的实体初始化[`Scene`](../scene)类的新实例。 |
| [Scene](scene#constructor_2)(Scene, string) | 将[`Scene`](../scene)类的新实例初始化为子场景。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips) { get; } | 获取场景中定义的所有[`AnimationClip`](../../aspose.threed.animation/animationclip)。 |
| [AssetInfo](../../aspose.threed/scene/assetinfo) { get; set; } | 获取或设置顶级资产信息 |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip) { get; set; } | 获取或设置活动[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [Library](../../aspose.threed/scene/library) { get; } | 场景层次结构中不直接使用的对象可以在库中定义。 这在您使用子场景并将可重用组件放在子场景下时很有用。 |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | 获取或设置名称。 |
| [Poses](../../aspose.threed/scene/poses) { get; } | 获取该场景中使用的所有[`Pose`](../pose)。 |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | 获取所有属性的集合。 |
| [RootNode](../../aspose.threed/scene/rootnode) { get; } | 获取场景的根节点。 |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | 获取该对象所属的场景 |
| [SubScenes](../../aspose.threed/scene/subscenes) { get; } | 获取所有子场景 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile)(string) | 从给定路径打开场景 |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_3)(string, CancellationToken) | 从给定路径打开场景 |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_1)(string, FileFormat, CancellationToken) | 使用指定文件格式从给定路径打开场景。 |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_2)(string, LoadOptions, CancellationToken) | 使用指定文件格式从给定路径打开场景。 |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_2)(Stream, CancellationToken) | 从给定流打开场景 |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream)(Stream, FileFormat, CancellationToken) | 使用指定文件格式从给定流打开场景。 |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_1)(Stream, LoadOptions, CancellationToken) | 使用指定的 IO 配置从给定的流中打开场景。 |
| [Clear](../../aspose.threed/scene/clear)() | 清除场景内容并恢复默认设置。 |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip)(string) | 创建和注册[`AnimationClip`](../../aspose.threed.animation/animationclip) 第一个[`AnimationClip`](../../aspose.threed.animation/animationclip)将分配给[`CurrentAnimationClip`](./currentanimationclip) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | 查找属性。 可以是动态属性（由 CreateDynamicProperty/SetProperty 创建） 或本机属性（由其名称标识） |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip)(string) | 获取命名[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | 获取指定属性的值 |
| [Open](../../aspose.threed/scene/open#open)(Stream) | 从给定流打开场景 |
| [Open](../../aspose.threed/scene/open#open_4)(string) | 从给定路径打开场景 |
| [Open](../../aspose.threed/scene/open#open_3)(Stream, CancellationToken) | 从给定流打开场景 |
| [Open](../../aspose.threed/scene/open#open_7)(string, CancellationToken) | 从给定路径打开场景 |
| [Open](../../aspose.threed/scene/open#open_1)(Stream, FileFormat, CancellationToken) | 使用指定文件格式从给定流打开场景。 |
| [Open](../../aspose.threed/scene/open#open_2)(Stream, LoadOptions, CancellationToken) | 使用指定的 IO 配置从给定的流中打开场景。 |
| [Open](../../aspose.threed/scene/open#open_5)(string, FileFormat, CancellationToken) | 使用指定文件格式从给定路径打开场景。 |
| [Open](../../aspose.threed/scene/open#open_6)(string, LoadOptions, CancellationToken) | 使用指定文件格式从给定路径打开场景。 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | 删除动态属性。 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | 删除名称标识的指定属性 |
| [Render](../../aspose.threed/scene/render#render)(Camera, Bitmap) | 从给定相机的角度将场景渲染为位图。 |
| [Render](../../aspose.threed/scene/render#render_2)(Camera, string) | 从给定相机的角度将场景渲染到外部文件中。 默认输出大小为 1024x768，输出格式为 png |
| [Render](../../aspose.threed/scene/render#render_1)(Camera, Bitmap, ImageRenderOptions) | 从给定相机的角度将场景渲染为位图。 |
| [Render](../../aspose.threed/scene/render#render_3)(Camera, string, Size, ImageFormat) | 从给定相机的角度将场景渲染到外部文件中。 |
| [Render](../../aspose.threed/scene/render#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | 从给定相机的角度将场景渲染到外部文件中。 |
| [Save](../../aspose.threed/scene/save#save_3)(string) | 使用指定文件格式将场景保存到指定路径。 |
| [Save](../../aspose.threed/scene/save#save)(Stream, FileFormat) | 使用指定的文件格式将场景保存为流式传输。 |
| [Save](../../aspose.threed/scene/save#save_4)(string, FileFormat) | 使用指定文件格式将场景保存到指定路径。 |
| [Save](../../aspose.threed/scene/save#save_1)(Stream, FileFormat, CancellationToken) | 使用指定的文件格式将场景保存为流式传输。 |
| [Save](../../aspose.threed/scene/save#save_2)(Stream, SaveOptions, CancellationToken) | 使用指定的文件格式将场景保存为流式传输。 |
| [Save](../../aspose.threed/scene/save#save_5)(string, FileFormat, CancellationToken) | 使用指定文件格式将场景保存到指定路径。 |
| [Save](../../aspose.threed/scene/save#save_6)(string, SaveOptions, CancellationToken) | 使用指定文件格式将场景保存到指定路径。 |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | 设置指定属性的值 |

### 也可以看看

* class [SceneObject](../sceneobject)
* 命名空间 [Aspose.ThreeD](../../aspose.threed)
* 部件 [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
