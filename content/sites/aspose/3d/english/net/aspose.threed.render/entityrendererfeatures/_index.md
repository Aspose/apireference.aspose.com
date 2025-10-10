---
title: Enum EntityRendererFeatures
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Render.EntityRendererFeatures enum. The extra features that the entity renderer will provide
type: docs
weight: 1980
url: /net/aspose.threed.render/entityrendererfeatures/
---
## EntityRendererFeatures enumeration

The extra features that the entity renderer will provide

```csharp
[Flags]
public enum EntityRendererFeatures : byte
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Default | `0` | No extra features |
| FrameBegin | `1` | The [`EntityRenderer`](../entityrenderer/) will watch for FrameBegin callback before rendering each scene frame |
| FrameEnd | `2` | The [`EntityRenderer`](../entityrenderer/) will watch for FrameBegin callback after rendering each scene frame |
| Shadowmap | `4` | This renderer can work in shadowmap mode |

### See Also

* namespace [Aspose.ThreeD.Render](../../aspose.threed.render/)
* assembly [Aspose.3D](../../)


