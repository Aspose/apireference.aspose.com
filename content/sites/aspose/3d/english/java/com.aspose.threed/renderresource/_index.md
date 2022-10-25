---
title: RenderResource
second_title: Aspose.3D for Java API Reference
description: The abstract class of all render resources
 All render resources will be disposed when the renderer is released.
type: docs
weight: 135
url: /java/com.aspose.threed/renderresource/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable
```
public abstract class RenderResource implements Closeable
```

The abstract class of all render resources All render resources will be disposed when the renderer is released. Classes like com.aspose.threed.Mesh/com.aspose.threed.Texture will have a corresponding RenderResource
## Constructors

| Constructor | Description |
| --- | --- |
| [RenderResource()](#RenderResource--) |  |
## Methods

| Method | Description |
| --- | --- |
| [close()](#close--) | Dispose internal resources used by com.aspose.threed.RenderResource |
### RenderResource() {#RenderResource--}
```
public RenderResource()
```


### close() {#close--}
```
public void close()
```


Dispose internal resources used by com.aspose.threed.RenderResource

