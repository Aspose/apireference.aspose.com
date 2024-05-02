---
title: ContentTransformer class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.cad.fileformats.glb.scenes/contenttransformer/
is_root: false
---

## ContentTransformer class

Represents the transform of a [`InstanceBuilder.content`](/cad/python-net/aspose.cad.fileformats.glb.scenes/instancebuilder#content).

Applies a transform to the underlaying content object (usually a Mesh, a Camera or a light)



The ContentTransformer type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer/name) | Gets or sets the display text name, or null.<br/><br/>**⚠️ DO NOT USE AS AN OBJECT ID ⚠️**  see remarks. |
| [extras](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer/extras) | Gets or sets the custom data of this object. |
| [has_renderable_content](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer/has_renderable_content) | Gets a value indicating whether [`ContentTransformer.Content`](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer) implements IRenderableContent |


### Methods
| Method | Description |
| :- | :- |
| [deep_clone](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer/deep_clone/#ContentTransformer.DeepCloneContext) |  |
| [get_camera_asset](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer/get_camera_asset/#) | It this [`ContentTransformer`](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer) contains a [`CameraBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/camerabuilder) |
| [get_light_asset](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer/get_light_asset/#) | It this [`ContentTransformer`](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer) contains a [`LightBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/lightbuilder) |
| [get_armature_root](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer/get_armature_root/#) | If this [`ContentTransformer`](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer) uses a [`NodeBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/nodebuilder) armature, it returns the root of the armature. |



### Remarks 


Base class of:
[`FixedTransformer`](/cad/python-net/aspose.cad.fileformats.glb.scenes/fixedtransformer)
[`RigidTransformer`](/cad/python-net/aspose.cad.fileformats.glb.scenes/rigidtransformer)
[`SkinnedTransformer`](/cad/python-net/aspose.cad.fileformats.glb.scenes/skinnedtransformer)

### See Also
* module [`aspose.cad.fileformats.glb.scenes`](..)
* class [`CameraBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/camerabuilder)
* class [`ContentTransformer`](/cad/python-net/aspose.cad.fileformats.glb.scenes/contenttransformer)
* class [`FixedTransformer`](/cad/python-net/aspose.cad.fileformats.glb.scenes/fixedtransformer)
* class [`LightBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/lightbuilder)
* class [`NodeBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/nodebuilder)
* class [`RigidTransformer`](/cad/python-net/aspose.cad.fileformats.glb.scenes/rigidtransformer)
* class [`SkinnedTransformer`](/cad/python-net/aspose.cad.fileformats.glb.scenes/skinnedtransformer)
