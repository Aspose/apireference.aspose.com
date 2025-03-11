---
title: Node.CreateChildNode
second_title: Aspose.3D for .NET API Reference
description: Node method. Creates a child node
type: docs
weight: 170
url: /net/aspose.threed/node/createchildnode/
---
## CreateChildNode() {#createchildnode}

Creates a child node

```csharp
public Node CreateChildNode()
```

### Return Value

The new child node.

## Examples

The following code shows how to create a new child node under root node

```csharp
Scene scene = new Scene();
Node node = scene.RootNode.CreateChildNode();
node.Entity = new Box();
scene.Save("output.fbx");
```

### See Also

* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)

---

## CreateChildNode(string) {#createchildnode_2}

Create a new child node with given node name

```csharp
public Node CreateChildNode(string nodeName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| nodeName | String | The new child node's name |

### Return Value

The new child node.

## Examples

The following code shows how to create a new child node under root node

```csharp
Scene scene = new Scene();
Node node = scene.RootNode.CreateChildNode("new node");
node.Entity = new Box();
scene.Save("output.fbx");
```

### See Also

* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)

---

## CreateChildNode(Entity) {#createchildnode_1}

Create a new child node with given entity attached

```csharp
public Node CreateChildNode(Entity entity)
```

| Parameter | Type | Description |
| --- | --- | --- |
| entity | Entity | Default entity attached to the node |

### Return Value

The new child node.

## Examples

The following code shows how to create a new child node under root node

```csharp
Scene scene = new Scene();
Node node = scene.RootNode.CreateChildNode(new Box());
scene.Save("output.fbx");
```

### See Also

* class [Entity](../../entity/)
* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)

---

## CreateChildNode(string, Entity) {#createchildnode_3}

Create a new child node with given node name

```csharp
public Node CreateChildNode(string nodeName, Entity entity)
```

| Parameter | Type | Description |
| --- | --- | --- |
| nodeName | String | The new child node's name |
| entity | Entity | Default entity attached to the node |

### Return Value

The new child node.

### See Also

* class [Entity](../../entity/)
* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)

---

## CreateChildNode(string, Entity, Material) {#createchildnode_4}

Create a new child node with given node name, and attach specified entity and a material

```csharp
public Node CreateChildNode(string nodeName, Entity entity, Material material)
```

| Parameter | Type | Description |
| --- | --- | --- |
| nodeName | String | The new child node's name |
| entity | Entity | Default entity attached to the node |
| material | Material | The material attached to the node |

### Return Value

The new child node.

### See Also

* class [Entity](../../entity/)
* class [Material](../../../aspose.threed.shading/material/)
* class [Node](../)
* namespace [Aspose.ThreeD](../../node/)
* assembly [Aspose.3D](../../../)


