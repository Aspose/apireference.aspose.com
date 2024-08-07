---
title: ILayoutSlide
second_title: Aspose.Slides for .NET API 参考
description: 表示布局幻灯片
type: docs
weight: 5660
url: /zh/net/aspose.slides/ilayoutslide/
---
## ILayoutSlide interface

表示布局幻灯片。

```csharp
public interface ILayoutSlide : IBaseSlide, IOverrideThemeable
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AsIBaseSlide](../../aspose.slides/ilayoutslide/asibaseslide) { get; } | 允许获取基本 IBaseSlide 接口。 只读[`IBaseSlide`](../ibaseslide)。 |
| [AsIOverrideThemeable](../../aspose.slides/ilayoutslide/asioverridethemeable) { get; } | 返回 IOverrideThemeable 接口。 只读[`IOverrideThemeable`](../../aspose.slides.theme/ioverridethemeable)。 |
| [HasDependingSlides](../../aspose.slides/ilayoutslide/hasdependingslides) { get; } | 如果存在至少一张依赖于此布局幻灯片的幻灯片，则返回 true。 只读Boolean。 |
| [HeaderFooterManager](../../aspose.slides/ilayoutslide/headerfootermanager) { get; } | 返回布局幻灯片的 HeaderFooter 管理器。 只读[`ILayoutSlideHeaderFooterManager`](../ilayoutslideheaderfootermanager)。 |
| [LayoutType](../../aspose.slides/ilayoutslide/layouttype) { get; } | 返回此布局幻灯片的布局类型。 只读[`SlideLayoutType`](../slidelayouttype)。 |
| [MasterSlide](../../aspose.slides/ilayoutslide/masterslide) { get; set; } | 返回或设置布局的母版幻灯片。 读/写[`IMasterSlide`](../imasterslide)。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [GetDependingSlides](../../aspose.slides/ilayoutslide/getdependingslides)() | 返回一个包含所有幻灯片的数组，这些幻灯片取决于此布局幻灯片。 |
| [Remove](../../aspose.slides/ilayoutslide/remove)() | 从演示文稿中删除布局。 |

### 也可以看看

* interface [IBaseSlide](../ibaseslide)
* interface [IOverrideThemeable](../../aspose.slides.theme/ioverridethemeable)
* 命名空间 [Aspose.Slides](../../aspose.slides)
* 部件 [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
