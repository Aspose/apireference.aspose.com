---
title: "VisualScene"
linktitle: "VisualScene"
second_title: "Aspose.CAD for Java"
description: "The visual scene."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/visualscene/
---

**Inheritance:** java.lang.Object, ColladaElement

The visual scene. The visual_scene element declares the base of the visual_scene hierarchy or scene graph. The scene contains elements that comprise much of the visual and transformational information content as created by the authoring tools.

## Constructors

| Constructor | Description |
| --- | --- |
| [VisualScene()](#VisualScene) |  |

## Methods

| Method | Description |
| --- | --- |
| [getAsset()](#getAsset) | Gets or sets the asset. The visual_scene element may contain an asset element. |
| [setAsset(Asset value)](#setAsset-com.aspose.cad.fileformats.collada.fileparser.elements.Asset) | Gets or sets the asset. The visual_scene element may contain an asset element. |
| [getNode()](#getNode) | Gets or sets the node. The visual_scene element must have at least one node element. |
| [setNode(Node[] value)](#setNode-com.aspose.cad.fileformats.collada.fileparser.elements.Node:A) | Gets or sets the node. The visual_scene element must have at least one node element. |
| [getEvaluateScene()](#getEvaluateScene) | Gets or sets the evaluate scene. The evaluate_scene element declares information specifying how to evaluate this visual_scene. There may be any number of evaluate_scene elements. They are evaluated in order and particular one may be disabled via setting enabled=false. |
| [setEvaluateScene(EvaluateScene[] value)](#setEvaluateScene-com.aspose.cad.fileformats.collada.fileparser.elements.EvaluateScene:A) | Gets or sets the evaluate scene. The evaluate_scene element declares information specifying how to evaluate this visual_scene. There may be any number of evaluate_scene elements. They are evaluated in order and particular one may be disabled via setting enabled=false. |
| [getExtra()](#getExtra) | Gets or sets the extra. The extra element may appear any number of times. |
| [setExtra(Extra[] value)](#setExtra-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A) | Gets or sets the extra. The extra element may appear any number of times. |
| [getId()](#getId) | Gets or sets the id. The id attribute is a text string containing the unique identifier of this element. This value must be unique within the instance document. Optional attribute. |
| [setId(String value)](#setId-java.lang.String) | Gets or sets the id. The id attribute is a text string containing the unique identifier of this element. This value must be unique within the instance document. Optional attribute. |
| [getName()](#getName) | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [setName(String value)](#setName-java.lang.String) | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |

### VisualScene() {#VisualScene}
```java
public VisualScene()
```

### getAsset() {#getAsset}
```java
public final Asset getAsset()
```

Gets or sets the asset. The visual_scene element may contain an asset element.

**Returns:** Asset

### setAsset(Asset value) {#setAsset-com.aspose.cad.fileformats.collada.fileparser.elements.Asset}
```java
public final void setAsset(Asset value)
```

Gets or sets the asset. The visual_scene element may contain an asset element.

### getNode() {#getNode}
```java
public final Node[] getNode()
```

Gets or sets the node. The visual_scene element must have at least one node element.

**Returns:** Node[]

### setNode(Node[] value) {#setNode-com.aspose.cad.fileformats.collada.fileparser.elements.Node:A}
```java
public final void setNode(Node[] value)
```

Gets or sets the node. The visual_scene element must have at least one node element.

### getEvaluateScene() {#getEvaluateScene}
```java
public final EvaluateScene[] getEvaluateScene()
```

Gets or sets the evaluate scene. The evaluate_scene element declares information specifying how to evaluate this visual_scene. There may be any number of evaluate_scene elements. They are evaluated in order and particular one may be disabled via setting enabled=false.

**Returns:** EvaluateScene[]

### setEvaluateScene(EvaluateScene[] value) {#setEvaluateScene-com.aspose.cad.fileformats.collada.fileparser.elements.EvaluateScene:A}
```java
public final void setEvaluateScene(EvaluateScene[] value)
```

Gets or sets the evaluate scene. The evaluate_scene element declares information specifying how to evaluate this visual_scene. There may be any number of evaluate_scene elements. They are evaluated in order and particular one may be disabled via setting enabled=false.

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

