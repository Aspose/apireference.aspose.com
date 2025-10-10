---
title: BooleanOperand.Of
second_title: Aspose.3D for .NET API Reference
description: BooleanOperand method. Construct a BooleanOperand instance from a node a valid entity implemented IMeshConvertible is required
type: docs
weight: 10
url: /net/aspose.threed.entities/booleanoperand/of/
---
## Of(Node) {#of_2}

Construct a [`BooleanOperand`](../) instance from a node, a valid entity implemented [`IMeshConvertible`](../../imeshconvertible/) is required

```csharp
public static BooleanOperand Of(Node node)
```

| Parameter | Type | Description |
| --- | --- | --- |
| node | Node | A [`Node`](../../../aspose.threed/node/) instance with a valid entity implemented [`IMeshConvertible`](../../imeshconvertible/) |

### Return Value

An instance of [`BooleanOperand`](../)

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Raised when *node* is null. |
| InvalidOperationException | Raised when no entity implemented [`IMeshConvertible`](../../imeshconvertible/) found under this node |

### See Also

* class [Node](../../../aspose.threed/node/)
* class [BooleanOperand](../)
* namespace [Aspose.ThreeD.Entities](../../booleanoperand/)
* assembly [Aspose.3D](../../../)

---

## Of(Entity) {#of}

Construct a [`BooleanOperand`](../) instance from a bare [`IMeshConvertible`](../../imeshconvertible/) instance.

```csharp
public static BooleanOperand Of(Entity mesh)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mesh | Entity | The mesh used as Boolean operation's operand, it can bean instance of [`IMeshConvertible`](../../imeshconvertible/) or [`HalfSpace`](../../halfspace/) |

### Return Value

An instance of [`BooleanOperand`](../)

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Raised when *mesh* is null. |

### See Also

* class [Entity](../../../aspose.threed/entity/)
* class [BooleanOperand](../)
* namespace [Aspose.ThreeD.Entities](../../booleanoperand/)
* assembly [Aspose.3D](../../../)

---

## Of(Entity, Matrix4?) {#of_1}

```csharp
public static BooleanOperand Of(Entity mesh, Matrix4? transform)
```

### See Also

* class [Entity](../../../aspose.threed/entity/)
* struct [Matrix4](../../../aspose.threed.utilities/matrix4/)
* class [BooleanOperand](../)
* namespace [Aspose.ThreeD.Entities](../../booleanoperand/)
* assembly [Aspose.3D](../../../)


