---
title: SvgRenderer.Render
second_title: Aspose.SVG for .NET API 参考
description: SvgRenderer 方法. 定义渲染多个的方法SVGDocuments具体化IDevice .
type: docs
weight: 20
url: /zh/net/aspose.svg.rendering/svgrenderer/render/
---
## Render(IDevice, TimeSpan, params SVGDocument[]) {#render_6}

定义渲染多个的方法[`SVGDocument`](../../../aspose.svg/svgdocument/)s具体化[`IDevice`](../../idevice/) .

```csharp
public override void Render(IDevice device, TimeSpan timeout, params SVGDocument[] documents)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| device | IDevice | 输出设备。 |
| timeout | TimeSpan | ATimeSpan表示要等待的毫秒数，或者TimeSpan表示 -1 毫秒无限期等待。 |
| documents | SVGDocument[] | 要呈现的文档。 |

### 也可以看看

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* 命名空间 [Aspose.Svg.Rendering](../../svgrenderer/)
* 部件 [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params SVGDocument[]) {#render_5}

定义了渲染多个的方法[`SVGDocument`](../../../aspose.svg/svgdocument/)进入特定的[`IDevice`](../../idevice/)，使用取消令牌请求取消操作。

```csharp
public override void Render(IDevice device, CancellationToken cancellationToken, 
    params SVGDocument[] documents)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| device | IDevice | 输出设备。 |
| cancellationToken | CancellationToken | 等待任务完成时要观察的取消令牌。 |
| documents | SVGDocument[] | 要呈现的文档。 |

### 也可以看看

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* 命名空间 [Aspose.Svg.Rendering](../../svgrenderer/)
* 部件 [Aspose.SVG](../../../)


