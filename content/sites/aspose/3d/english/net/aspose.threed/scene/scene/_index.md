---
title: Scene.Scene
second_title: Aspose.3D for .NET API Reference
description: Scene constructor. Initializes a new instance of the Scene class
type: docs
weight: 10
url: /net/aspose.threed/scene/scene/
---
## Scene() {#constructor}

Initializes a new instance of the [`Scene`](../) class.

```csharp
public Scene()
```

### See Also

* class [Scene](../)
* namespace [Aspose.ThreeD](../../scene/)
* assembly [Aspose.3D](../../../)

---

## Scene(Entity) {#constructor_1}

Initializes a new instance of the [`Scene`](../) class with an entity attached to a new node.

```csharp
public Scene(Entity entity)
```

| Parameter | Type | Description |
| --- | --- | --- |
| entity | Entity | The initial entity that attached to the scene |

## Examples

The following code shows how to create a [`Scene`](../) directly from an [`Entity`](../../entity/):

```csharp
var scene = new Scene(new Box());
```

### See Also

* class [Entity](../../entity/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../scene/)
* assembly [Aspose.3D](../../../)

---

## Scene(Scene, string) {#constructor_2}

Initializes a new instance of the [`Scene`](../) class as a sub-scene.

```csharp
public Scene(Scene parentScene, string name)
```

| Parameter | Type | Description |
| --- | --- | --- |
| parentScene | Scene | The parent scene. |
| name | String | Scene's name. |

### See Also

* class [Scene](../)
* namespace [Aspose.ThreeD](../../scene/)
* assembly [Aspose.3D](../../../)


