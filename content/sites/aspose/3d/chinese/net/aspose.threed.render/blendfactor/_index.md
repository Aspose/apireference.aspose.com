---
title: BlendFactor
second_title: Aspose.3D for .NET API 参考
description: 混合因子指定像素算术
type: docs
weight: 1700
url: /zh/net/aspose.threed.render/blendfactor/
---
## BlendFactor enumeration

混合因子指定像素算术。

```csharp
public enum BlendFactor
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| Zero | `0` | 混合因子为 vec4(0) |
| One | `1` | 混合因子为 vec4(1) |
| SrcColor | `2` | 混合因子是 src.rgba |
| OneMinusSrcColor | `3` | 混合因子为 vec4(1) - src.rgba |
| DstColor | `4` | 混合因子为 dst.rgba |
| OneMinusDstColor | `5` | 混合因子为 vec4(1) - dst.rgba |
| SrcAlpha | `6` | 混合因子为 vec4(src.a) |
| OneMinusSrcAlpha | `7` | 混合因子为 vec4(1 - src.a) |
| DstAlpha | `8` | 混合因子为 vec4(dst.a) |
| OneMinusDstAlpha | `9` | 混合因子为 vec4(1 - dst.a) |
| ConstantColor | `10` | 混合因子是 c，其中 c 在[`BlendColor`](../renderstate/blendcolor) |
| OneMinusConstantColor | `11` | 混合因子是 vec4(1) - c 其中 c 在[`BlendColor`](../renderstate/blendcolor) |
| ConstantAlpha | `12` | 混合因子是 vec4(ca)，其中 c 在[`BlendColor`](../renderstate/blendcolor) |
| OneMinusConstantAlpha | `13` | 混合因子是 vec4(1 - ca)，其中 c 在[`BlendColor`](../renderstate/blendcolor) |
| SrcAlphaSaturate | `14` | 混合因子为 min(src.a, 1 - dst.a) |

### 也可以看看

* 命名空间 [Aspose.ThreeD.Render](../../aspose.threed.render)
* 部件 [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
