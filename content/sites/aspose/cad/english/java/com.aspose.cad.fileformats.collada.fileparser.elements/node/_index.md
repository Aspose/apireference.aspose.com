---
title: "Node"
linktitle: "Node"
second_title: "Aspose.CAD for Java"
description: "The node."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/node/
---

**Inheritance:** java.lang.Object, ColladaElement

The node. Nodes embody the hierarchical relationship of elements in the scene.

## Constructors

| Constructor | Description |
| --- | --- |
| [Node()](#Node) | Initializes a new instance of the Node class. |

## Methods

| Method | Description |
| --- | --- |
| [getAsset()](#getAsset) | Gets or sets the asset. The node element may contain an asset element. |
| [setAsset(Asset value)](#setAsset-com.aspose.cad.fileformats.collada.fileparser.elements.Asset) | Gets or sets the asset. The node element may contain an asset element. |
| [getTransformItems()](#getTransformItems) | Gets or sets the transformation items. |
| [setTransformItems(Object[] value)](#setTransformItems-java.lang.Object:A) | Gets or sets the transformation items. |
| [getInstanceCamera()](#getInstanceCamera) | Gets or sets the instance camera. The node element may instance any number of camera objects. |
| [setInstanceCamera(InstanceCamera[] value)](#setInstanceCamera-com.aspose.cad.fileformats.collada.fileparser.elements.InstanceCamera:A) | Gets or sets the instance camera. The node element may instance any number of camera objects. |
| [getInstanceGeometry()](#getInstanceGeometry) | Gets or sets the instance geometry. The node element may instance any number of geometry objects. |
| [setInstanceGeometry(InstanceGeometry[] value)](#setInstanceGeometry-com.aspose.cad.fileformats.collada.fileparser.elements.InstanceGeometry:A) | Gets or sets the instance geometry. The node element may instance any number of geometry objects. |
| [getInstanceLight()](#getInstanceLight) | Gets or sets the instance light. The node element may instance any number of light objects. |
| [setInstanceLight(InstanceLight[] value)](#setInstanceLight-com.aspose.cad.fileformats.collada.fileparser.elements.InstanceLight:A) | Gets or sets the instance light. The node element may instance any number of light objects. |
| [getInstanceNode()](#getInstanceNode) | Gets or sets the instance node. The node element may instance any number of node elements or hierarchies objects. |
| [setInstanceNode(InstanceNode[] value)](#setInstanceNode-com.aspose.cad.fileformats.collada.fileparser.elements.InstanceNode:A) | Gets or sets the instance node. The node element may instance any number of node elements or hierarchies objects. |
| [getNodes()](#getNodes) | Gets or sets the nodes. The node element may be hierarchical and be the parent of any number of other node elements. |
| [setNodes(Node[] value)](#setNodes-com.aspose.cad.fileformats.collada.fileparser.elements.Node:A) | Gets or sets the nodes. The node element may be hierarchical and be the parent of any number of other node elements. |
| [getExtra()](#getExtra) | Gets or sets the extra. The extra element may appear any number of times. |
| [setExtra(Extra[] value)](#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A) | Gets or sets the extra. The extra element may appear any number of times. |
| [getId()](#getId) | Gets or sets the id. The id attribute is a text string containing the unique identifier of this element. This value must be unique within the instance document. Optional attribute. |
| [setId(String value)](#setId-java.lang.String) | Gets or sets the id. The id attribute is a text string containing the unique identifier of this element. This value must be unique within the instance document. Optional attribute. |
| [getName()](#getName) | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [setName(String value)](#setName-java.lang.String) | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [getSid()](#getSid) | Gets or sets the sid. The sid attribute is a text string value containing the sub-identifier of this element. This value must be unique within the scope of the parent element.Optional attribute. |
| [setSid(String value)](#setSid-java.lang.String) | Gets or sets the sid. The sid attribute is a text string value containing the sub-identifier of this element. This value must be unique within the scope of the parent element.Optional attribute. |
| [getType()](#getType) | Gets or sets the node type. The type attribute indicates the type of the node element. The default value is "NODE". Optional attribute. |
| [setType(String value)](#setType-java.lang.String) | Gets or sets the node type. The type attribute indicates the type of the node element. The default value is "NODE". Optional attribute. |
| [getLayer()](#getLayer) | Gets or sets the layer. The layer attribute indicates the names of the layers to which this node belongs. For example, a value of "foreground glowing" indicates that this node belongs to both the 'foreground' layer and the 'glowing' layer. The default value is empty, indicating that the node doesn't belong to any layer. Optional attribute. |
| [setLayer(String[] value)](#setLayer-java.lang.String:A) | Gets or sets the layer. The layer attribute indicates the names of the layers to which this node belongs. For example, a value of "foreground glowing" indicates that this node belongs to both the 'foreground' layer and the 'glowing' layer. The default value is empty, indicating that the node doesn't belong to any layer. Optional attribute. |

### Node() {#Node}
```java
public Node()
```

Initializes a new instance of the Node class.

### getAsset() {#getAsset}
```java
public final Asset getAsset()
```

Gets or sets the asset. The node element may contain an asset element.

**Returns:** Asset

### setAsset(Asset value) {#setAsset-com.aspose.cad.fileformats.collada.fileparser.elements.Asset}
```java
public final void setAsset(Asset value)
```

Gets or sets the asset. The node element may contain an asset element.

### getTransformItems() {#getTransformItems}
```java
public final Object[] getTransformItems()
```

Gets or sets the transformation items.

**Returns:** Object[]

### setTransformItems(Object[] value) {#setTransformItems-java.lang.Object:A}
```java
public final void setTransformItems(Object[] value)
```

Gets or sets the transformation items.

### getInstanceCamera() {#getInstanceCamera}
```java
public final InstanceCamera[] getInstanceCamera()
```

Gets or sets the instance camera. The node element may instance any number of camera objects.

**Returns:** InstanceCamera[]

### setInstanceCamera(InstanceCamera[] value) {#setInstanceCamera-com.aspose.cad.fileformats.collada.fileparser.elements.InstanceCamera:A}
```java
public final void setInstanceCamera(InstanceCamera[] value)
```

Gets or sets the instance camera. The node element may instance any number of camera objects.

### getInstanceGeometry() {#getInstanceGeometry}
```java
public final InstanceGeometry[] getInstanceGeometry()
```

Gets or sets the instance geometry. The node element may instance any number of geometry objects.

**Returns:** InstanceGeometry[]

### setInstanceGeometry(InstanceGeometry[] value) {#setInstanceGeometry-com.aspose.cad.fileformats.collada.fileparser.elements.InstanceGeometry:A}
```java
public final void setInstanceGeometry(InstanceGeometry[] value)
```

Gets or sets the instance geometry. The node element may instance any number of geometry objects.

### getInstanceLight() {#getInstanceLight}
```java
public final InstanceLight[] getInstanceLight()
```

Gets or sets the instance light. The node element may instance any number of light objects.

**Returns:** InstanceLight[]

### setInstanceLight(InstanceLight[] value) {#setInstanceLight-com.aspose.cad.fileformats.collada.fileparser.elements.InstanceLight:A}
```java
public final void setInstanceLight(InstanceLight[] value)
```

Gets or sets the instance light. The node element may instance any number of light objects.

### getInstanceNode() {#getInstanceNode}
```java
public final InstanceNode[] getInstanceNode()
```

Gets or sets the instance node. The node element may instance any number of node elements or hierarchies objects.

**Returns:** InstanceNode[]

### setInstanceNode(InstanceNode[] value) {#setInstanceNode-com.aspose.cad.fileformats.collada.fileparser.elements.InstanceNode:A}
```java
public final void setInstanceNode(InstanceNode[] value)
```

Gets or sets the instance node. The node element may instance any number of node elements or hierarchies objects.

### getNodes() {#getNodes}
```java
public final Node[] getNodes()
```

Gets or sets the nodes. The node element may be hierarchical and be the parent of any number of other node elements.

**Returns:** Node[]

### setNodes(Node[] value) {#setNodes-com.aspose.cad.fileformats.collada.fileparser.elements.Node:A}
```java
public final void setNodes(Node[] value)
```

Gets or sets the nodes. The node element may be hierarchical and be the parent of any number of other node elements.

### getExtra() {#getExtra}
```java
public final Extra[] getExtra()
```

Gets or sets the extra. The extra element may appear any number of times.

**Returns:** Extra[]

### setExtra(Extra[] value) {#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A}
```java
public final void setExtra(Extra[] value)
```

Gets or sets the extra. The extra element may appear any number of times.

### getId() {#getId}
```java
public final String getId()
```

Gets or sets the id. The id attribute is a text string containing the unique identifier of this element. This value must be unique within the instance document. Optional attribute.

**Returns:** String

### setId(String value) {#setId-java.lang.String}
```java
public final void setId(String value)
```

Gets or sets the id. The id attribute is a text string containing the unique identifier of this element. This value must be unique within the instance document. Optional attribute.

### getName() {#getName}
```java
public final String getName()
```

Gets or sets the name. The name attribute is the text string name of this element. Optional attribute.

**Returns:** String

### setName(String value) {#setName-java.lang.String}
```java
public final void setName(String value)
```

Gets or sets the name. The name attribute is the text string name of this element. Optional attribute.

### getSid() {#getSid}
```java
public final String getSid()
```

Gets or sets the sid. The sid attribute is a text string value containing the sub-identifier of this element. This value must be unique within the scope of the parent element.Optional attribute.

**Returns:** String

### setSid(String value) {#setSid-java.lang.String}
```java
public final void setSid(String value)
```

Gets or sets the sid. The sid attribute is a text string value containing the sub-identifier of this element. This value must be unique within the scope of the parent element.Optional attribute.

### getType() {#getType}
```java
public final String getType()
```

Gets or sets the node type. The type attribute indicates the type of the node element. The default value is "NODE". Optional attribute.

**Returns:** String

### setType(String value) {#setType-java.lang.String}
```java
public final void setType(String value)
```

Gets or sets the node type. The type attribute indicates the type of the node element. The default value is "NODE". Optional attribute.

### getLayer() {#getLayer}
```java
public final String[] getLayer()
```

Gets or sets the layer. The layer attribute indicates the names of the layers to which this node belongs. For example, a value of "foreground glowing" indicates that this node belongs to both the 'foreground' layer and the 'glowing' layer. The default value is empty, indicating that the node doesn't belong to any layer. Optional attribute.

**Returns:** String[]

### setLayer(String[] value) {#setLayer-java.lang.String:A}
```java
public final void setLayer(String[] value)
```

Gets or sets the layer. The layer attribute indicates the names of the layers to which this node belongs. For example, a value of "foreground glowing" indicates that this node belongs to both the 'foreground' layer and the 'glowing' layer. The default value is empty, indicating that the node doesn't belong to any layer. Optional attribute.

