---
title: AnimationClip
second_title: Aspose.3D for .NET API 参考
description: 动画剪辑是动画的集合 场景可以有一个或多个动画剪辑
type: docs
weight: 30
url: /zh/net/aspose.threed.animation/animationclip/
---
## AnimationClip class

动画剪辑是动画的集合。 场景可以有一个或多个动画剪辑。

```csharp
public class AnimationClip : SceneObject
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [AnimationClip](animationclip#constructor)() | 初始化[`AnimationClip`](../animationclip)类. |
| [AnimationClip](animationclip#constructor_1)(string) | 初始化[`AnimationClip`](../animationclip)类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Animations](../../aspose.threed.animation/animationclip/animations) { get; } | 获取剪辑中包含的动画。 |
| [Description](../../aspose.threed.animation/animationclip/description) { get; set; } | 获取或设置此动画剪辑的描述 |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | 获取或设置名称。 |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | 获取所有属性的集合。 |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | 获取该对象所属的场景 |
| [Start](../../aspose.threed.animation/animationclip/start) { get; set; } | 获取或设置剪辑开始的秒数。 |
| [Stop](../../aspose.threed.animation/animationclip/stop) { get; set; } | 获取或设置剪辑结束的秒数。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [CreateAnimationNode](../../aspose.threed.animation/animationclip/createanimationnode)(string) | 在当前剪辑上创建和注册动画节点的简写函数。 |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | 查找属性。 可以是动态属性（由 CreateDynamicProperty/SetProperty 创建） 或原生属性（由其名称标识） |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | 获取指定属性的值 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | 删除动态属性。 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | 移除名称标识的指定属性 |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | 设置指定属性的值 |

### 也可以看看

* class [SceneObject](../../aspose.threed/sceneobject)
* 命名空间 [Aspose.ThreeD.Animation](../../aspose.threed.animation)
* 部件 [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
