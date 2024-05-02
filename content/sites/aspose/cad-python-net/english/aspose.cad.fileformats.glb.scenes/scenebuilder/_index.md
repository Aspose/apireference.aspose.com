---
title: SceneBuilder class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 80
url: /python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/
is_root: false
---

## SceneBuilder class

Represents the root scene for models, cameras and lights.



**Inheritance:** [`SceneBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder) → 
[`BaseBuilder`](/cad/python-net/aspose.cad.fileformats.glb.geometry/basebuilder)



The SceneBuilder type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/__init__/#str) | Constructs a new instance of SceneBuilder |


### Properties
| Property | Description |
| :- | :- |
| [name](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/name) | Gets or sets the display text name, or null.<br/><br/>**⚠️ DO NOT USE AS AN OBJECT ID ⚠️**  see remarks. |
| [extras](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/extras) | Gets or sets the custom data of this object. |
| [instances](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/instances) | Gets all the instances in this scene. |
| [materials](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/materials) | Gets all the unique material references shared by all the meshes in this scene. |


### Methods
| Method | Description |
| :- | :- |
| [add_camera](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/add_camera/#aspose.cad.fileformats.glb.scenes.CameraBuilder-aspose.cad.fileformats.glb.scenes.NodeBuilder) |  |
| [add_camera](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/add_camera/#aspose.cad.fileformats.glb.scenes.CameraBuilder-aspose.cad.fileformats.glb.transforms.AffineTransform) |  |
| [add_light](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/add_light/#aspose.cad.fileformats.glb.scenes.LightBuilder-aspose.cad.fileformats.glb.transforms.AffineTransform) |  |
| [add_light](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/add_light/#aspose.cad.fileformats.glb.scenes.LightBuilder-aspose.cad.fileformats.glb.scenes.NodeBuilder) |  |
| [to_gltf2](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/to_gltf2/#) | Converts this [`SceneBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder) instance into a [`GlbImage`](/cad/python-net/aspose.cad.fileformats.glb/glbimage) instance. |
| [to_gltf2](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/to_gltf2/#aspose.cad.fileformats.glb.scenes.SceneBuilderSchema2Settings) | Converts this [`SceneBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder) instance into a [`GlbImage`](/cad/python-net/aspose.cad.fileformats.glb/glbimage) instance. |
| [to_gltf2](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/to_gltf2/#list-aspose.cad.fileformats.glb.scenes.SceneBuilderSchema2Settings) |  |
| [create_from](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/create_from/#aspose.cad.fileformats.glb.GlbData) |  |
| [create_from](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/create_from/#aspose.cad.fileformats.collada.fileparser.elements.Scene) |  |
| [create_from](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/create_from/#list) |  |
| [deep_clone](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/deep_clone/#bool) |  |
| [load_default_scene](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/load_default_scene/#str-aspose.cad.fileformats.glb.ReadSettings) |  |
| [load_all_scenes](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/load_all_scenes/#str-aspose.cad.fileformats.glb.ReadSettings) |  |
| [add_node](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/add_node/#aspose.cad.fileformats.glb.scenes.NodeBuilder) |  |
| [find_armatures](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/find_armatures/#) | Gets all the unique armatures used by this [`SceneBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder). |



### See Also
* module [`aspose.cad.fileformats.glb.scenes`](..)
* class [`BaseBuilder`](/cad/python-net/aspose.cad.fileformats.glb.geometry/basebuilder)
* class [`GlbImage`](/cad/python-net/aspose.cad.fileformats.glb/glbimage)
* class [`SceneBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder)
