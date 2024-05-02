---
title: SceneBuilderSchema2Settings class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 90
url: /python-net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/
is_root: false
---

## SceneBuilderSchema2Settings class

Defines configurable options for converting [`SceneBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder) to [`GlbImage`](/cad/python-net/aspose.cad.fileformats.glb/glbimage)



The SceneBuilderSchema2Settings type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/__init__/#) | Constructs a new instance of SceneBuilderSchema2Settings |


### Properties
| Property | Description |
| :- | :- |
| [default](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/default) |  |
| [with_gpu_instancing](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/with_gpu_instancing) |  |
| [use_strided_buffers](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/use_strided_buffers) | When true, meshes will be created using strided vertices when possible. |
| [compact_vertex_weights](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/compact_vertex_weights) | if meshes have Skin Weights, defines the output vertex element format:<br/><br/>- True: Short<br/><br/>- False: Float |
| [gpu_mesh_instancing_min_count](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/gpu_mesh_instancing_min_count) | determines the mínimum number mesh instances required to enable Gpu mesh instancing. |
| [merge_buffers](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilderschema2settings/merge_buffers) | Merges all the Buffer objects into a single big buffer.<br/><br/>Default value is TRUE. |



### Remarks 


Used by [`SceneBuilder.to_gltf2`](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder/to_gltf2)

### See Also
* module [`aspose.cad.fileformats.glb.scenes`](..)
* class [`GlbImage`](/cad/python-net/aspose.cad.fileformats.glb/glbimage)
* class [`SceneBuilder`](/cad/python-net/aspose.cad.fileformats.glb.scenes/scenebuilder)
