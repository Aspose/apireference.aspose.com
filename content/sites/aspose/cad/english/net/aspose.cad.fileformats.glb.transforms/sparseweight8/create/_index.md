---
title: SparseWeight8.Create
second_title: Aspose.CAD for .NET API Reference
description: SparseWeight8 method. Creates a new SparseWeight8 from a weights collection. If theres more than 8 non zero values the 8 most representative values are taken
type: docs
weight: 30
url: /net/aspose.cad.fileformats.glb.transforms/sparseweight8/create/
---
## Create(params float[]) {#create}

Creates a new [`SparseWeight8`](../) from a weights collection. If there's more than 8 non zero values, the 8 most representative values are taken.

```csharp
public static SparseWeight8 Create(params float[] weights)
```

| Parameter | Type | Description |
| --- | --- | --- |
| weights | Single[] | A sequence of weight values. |

### Return Value

A [`SparseWeight8`](../) instance.

### See Also

* struct [SparseWeight8](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../sparseweight8/)
* assembly [Aspose.CAD](../../../)

---

## Create(IEnumerable&lt;float&gt;) {#create_1}

Creates a new [`SparseWeight8`](../) from a weights collection. If there's more than 8 weighted values, the 8 heaviest values are taken.

```csharp
public static SparseWeight8 Create(IEnumerable<float> weights)
```

| Parameter | Type | Description |
| --- | --- | --- |
| weights | IEnumerable`1 | A sequence of weight values. |

### Return Value

A [`SparseWeight8`](../) instance.

### See Also

* struct [SparseWeight8](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../sparseweight8/)
* assembly [Aspose.CAD](../../../)

---

## Create(params (int Index, float Weight)[]) {#create_5}

Creates a new [`SparseWeight8`](../) from an indexed weight collection. If there's more than 8 weighted values, the 8 heaviest values are taken.

```csharp
public static SparseWeight8 Create(params (int Index, float Weight)[] indexedWeights)
```

| Parameter | Type | Description |
| --- | --- | --- |
| indexedWeights | ValueTuple`2[] | A sequence of indexed weight pairs. |

### Return Value

A [`SparseWeight8`](../) instance.

### See Also

* struct [SparseWeight8](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../sparseweight8/)
* assembly [Aspose.CAD](../../../)

---

## Create(IEnumerable&lt;(int Index, float Weight)&gt;) {#create_2}

Creates a new [`SparseWeight8`](../) from an indexed weight collection. If there's more than 8 weighted values, the 8 heaviest values are taken.

```csharp
public static SparseWeight8 Create(IEnumerable<(int Index, float Weight)> indexedWeights)
```

| Parameter | Type | Description |
| --- | --- | --- |
| indexedWeights | IEnumerable`1 | A sequence of indexed weight pairs. |

### Return Value

A [`SparseWeight8`](../) instance.

### See Also

* struct [SparseWeight8](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../sparseweight8/)
* assembly [Aspose.CAD](../../../)

---

## Create(ref Vector4, ref Vector4) {#create_3}

Creates a new [`SparseWeight8`](../) struct.

```csharp
public static SparseWeight8 Create(ref Vector4 idx0123, ref Vector4 wgt0123)
```

| Parameter | Type | Description |
| --- | --- | --- |
| idx0123 | Vector4& | The indices of weights 0 to 3. |
| wgt0123 | Vector4& | The weights of indices 0 to 3. |

### Return Value

A [`SparseWeight8`](../) instance.

## Remarks

Repeating indices will have their weights merged.

### See Also

* struct [SparseWeight8](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../sparseweight8/)
* assembly [Aspose.CAD](../../../)

---

## Create(ref Vector4, ref Vector4, ref Vector4, ref Vector4) {#create_4}

Creates a new [`SparseWeight8`](../) struct.

```csharp
public static SparseWeight8 Create(ref Vector4 idx0123, ref Vector4 idx4567, ref Vector4 wgt0123, 
    ref Vector4 wgt4567)
```

| Parameter | Type | Description |
| --- | --- | --- |
| idx0123 | Vector4& | The first 4 indices. |
| idx4567 | Vector4& | The next 4 indices. |
| wgt0123 | Vector4& | The first 4 weights. |
| wgt4567 | Vector4& | The next 4 weights. |

### Return Value

A [`SparseWeight8`](../) instance.

## Remarks

Repeating indices will have their weights merged.

### See Also

* struct [SparseWeight8](../)
* namespace [Aspose.CAD.FileFormats.GLB.Transforms](../../sparseweight8/)
* assembly [Aspose.CAD](../../../)


