---
title: ArmatureInstance.SetAnimationFrame
second_title: Aspose.CAD for .NET API Reference
description: ArmatureInstance method. Sets the bone transforms from an animation frame
type: docs
weight: 40
url: /net/aspose.cad.fileformats.glb.runtime/armatureinstance/setanimationframe/
---
## SetAnimationFrame(int, float, bool) {#setanimationframe}

Sets the bone transforms from an animation frame.

```csharp
public void SetAnimationFrame(int trackLogicalIndex, float time, bool looped = true)
```

| Parameter | Type | Description |
| --- | --- | --- |
| trackLogicalIndex | Int32 | The animation track index. |
| time | Single | The animation time frame. |
| looped | Boolean | True to use the animation as a looped animation. |

### See Also

* class [ArmatureInstance](../)
* namespace [Aspose.CAD.FileFormats.GLB.Runtime](../../armatureinstance/)
* assembly [Aspose.CAD](../../../)

---

## SetAnimationFrame(params (int TrackIdx, float Time, float Weight)[]) {#setanimationframe_1}

```csharp
public void SetAnimationFrame(params (int TrackIdx, float Time, float Weight)[] blended)
```

### See Also

* class [ArmatureInstance](../)
* namespace [Aspose.CAD.FileFormats.GLB.Runtime](../../armatureinstance/)
* assembly [Aspose.CAD](../../../)

---

## SetAnimationFrame(IEnumerable&lt;NodeInstance&gt;, params (int TrackIdx, float Time, float Weight)[])

```csharp
public static void SetAnimationFrame(IEnumerable<NodeInstance> nodes, 
    params (int TrackIdx, float Time, float Weight)[] blended)
```

### See Also

* class [NodeInstance](../../nodeinstance/)
* class [ArmatureInstance](../)
* namespace [Aspose.CAD.FileFormats.GLB.Runtime](../../armatureinstance/)
* assembly [Aspose.CAD](../../../)


