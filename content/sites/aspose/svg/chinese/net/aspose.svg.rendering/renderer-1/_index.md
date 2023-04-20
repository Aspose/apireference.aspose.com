---
title: Class RendererTDocument
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.Rendering.Renderer1TDocument 班级. 表示所有渲染器的抽象类
type: docs
weight: 3000
url: /zh/net/aspose.svg.rendering/renderer-1/
---
## Renderer&lt;TDocument&gt; class

表示所有渲染器的抽象类。

```csharp
public abstract class Renderer<TDocument> : Renderer
```

| 范围 | 描述 |
| --- | --- |
| TDocument | 文档的类型。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Dispose](../../aspose.svg.rendering/renderer/dispose/)() | 释放非托管和 - 可选 - 托管资源。 |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_3)(IDevice, TDocument) | 定义渲染方法!:TDocument进入指定[`IDevice`](../idevice/) . |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_6)(IDevice, params TDocument[]) | 定义渲染多个的方法!:TDocuments具体化[`IDevice`](../idevice/) . |
| abstract [Render](../../aspose.svg.rendering/renderer-1/render/#render_1)(IDevice, CancellationToken, params TDocument[]) | 定义了渲染多个的方法!:TDocument进入特定的[`IDevice`](../idevice/)，使用取消令牌请求取消操作。 |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render)(IDevice, int, params TDocument[]) | 定义渲染多个的方法!:TDocuments具体化[`IDevice`](../idevice/) . |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_4)(IDevice, TDocument, int) | 定义渲染方法!:TDocument进入指定[`IDevice`](../idevice/) . |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_5)(IDevice, TDocument, TimeSpan) | 定义渲染方法!:TDocument进入指定[`IDevice`](../idevice/) . |
| abstract [Render](../../aspose.svg.rendering/renderer-1/render/#render_2)(IDevice, TimeSpan, params TDocument[]) | 定义渲染多个的方法!:TDocuments具体化[`IDevice`](../idevice/) . |

### 也可以看看

* class [Renderer](../renderer/)
* 命名空间 [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* 部件 [Aspose.SVG](../../)


