---
title: Animation.CreateMorphChannel
second_title: Aspose.CAD for .NET API Reference
description: Animation method. 
type: docs
weight: 30
url: /net/aspose.cad.fileformats.glb/animation/createmorphchannel/
---
## CreateMorphChannel&lt;TWeights&gt;(Node, IReadOnlyDictionary&lt;float, TWeights&gt;, int, bool) {#createmorphchannel_3}

```csharp
public void CreateMorphChannel<TWeights>(Node node, IReadOnlyDictionary<float, TWeights> keyframes, 
    int morphCount, bool linear = true)
    where TWeights : IReadOnlyList<float>
```

### See Also

* class [Node](../../node/)
* class [Animation](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../animation/)
* assembly [Aspose.CAD](../../../)

---

## CreateMorphChannel&lt;TWeights&gt;(Node, IReadOnlyDictionary&lt;float, (TWeights TangentIn, TWeights Value, TWeights TangentOut)&gt;, int) {#createmorphchannel_2}

```csharp
public void CreateMorphChannel<TWeights>(Node node, 
    IReadOnlyDictionary<float, (TWeights TangentIn, TWeights Value, TWeights TangentOut)> keyframes, 
    int morphCount)
    where TWeights : IReadOnlyList<float>
```

### See Also

* class [Node](../../node/)
* class [Animation](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../animation/)
* assembly [Aspose.CAD](../../../)

---

## CreateMorphChannel(Node, IReadOnlyDictionary&lt;float, SparseWeight8&gt;, int, bool) {#createmorphchannel}

```csharp
public void CreateMorphChannel(Node node, IReadOnlyDictionary<float, SparseWeight8> keyframes, 
    int morphCount, bool linear = true)
```

### See Also

* class [Node](../../node/)
* struct [SparseWeight8](../../../aspose.cad.fileformats.glb.transforms/sparseweight8/)
* class [Animation](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../animation/)
* assembly [Aspose.CAD](../../../)

---

## CreateMorphChannel(Node, IReadOnlyDictionary&lt;float, (SparseWeight8 TangentIn, SparseWeight8 Value, SparseWeight8 TangentOut)&gt;, int) {#createmorphchannel_1}

```csharp
public void CreateMorphChannel(Node node, 
    IReadOnlyDictionary<float, (SparseWeight8 TangentIn, SparseWeight8 Value, SparseWeight8 TangentOut)> keyframes, 
    int morphCount)
```

### See Also

* class [Node](../../node/)
* struct [SparseWeight8](../../../aspose.cad.fileformats.glb.transforms/sparseweight8/)
* class [Animation](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../animation/)
* assembly [Aspose.CAD](../../../)


