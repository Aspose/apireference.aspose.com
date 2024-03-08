---
title: PolygonModifier class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 270
url: /aspose.threed.entities/polygonmodifier/
is_root: false
---

## PolygonModifier class

Utilities to modify polygons



The PolygonModifier type exposes the following members:

### Methods
| Method | Description |
| :- | :- |
| [triangulate](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#aspose.threed.Scene) | Convert all polygon-based meshes into full triangle mesh |
| [triangulate](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#aspose.threed.entities.Mesh) | Convert a polygon-based mesh into full triangle mesh |
| [triangulate](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#list-list-bool-any) |  |
| [triangulate](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#list-list) |  |
| [triangulate](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#list-list) |  |
| [triangulate](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#list) |  |
| [merge_mesh](/3d/python-net/aspose.threed.entities/polygonmodifier/merge_mesh/#aspose.threed.Scene) | Convert a whole scene to a single transformed mesh<br/>Vertex elements like normal/texture coordinates are not supported yet |
| [merge_mesh](/3d/python-net/aspose.threed.entities/polygonmodifier/merge_mesh/#list) |  |
| [merge_mesh](/3d/python-net/aspose.threed.entities/polygonmodifier/merge_mesh/#aspose.threed.Node) | Convert a whole node to a single transformed mesh<br/>Vertex elements like normal/texture coordinates are not supported yet |
| [scale](/3d/python-net/aspose.threed.entities/polygonmodifier/scale/#aspose.threed.Scene-aspose.threed.utilities.Vector3) | Scale all geometries(Scale the control points not the transformation matrix) in this scene |
| [scale](/3d/python-net/aspose.threed.entities/polygonmodifier/scale/#aspose.threed.Node-aspose.threed.utilities.Vector3) | Scale all geometries(Scale the control points not the transformation matrix) in this node |
| [generate_uv](/3d/python-net/aspose.threed.entities/polygonmodifier/generate_uv/#aspose.threed.entities.Mesh-aspose.threed.entities.VertexElementNormal) | Generate UV data from the given input mesh and specified normal data. |
| [generate_uv](/3d/python-net/aspose.threed.entities/polygonmodifier/generate_uv/#aspose.threed.entities.Mesh) | Generate UV data from the given input mesh |
| [split_mesh](/3d/python-net/aspose.threed.entities/polygonmodifier/split_mesh/#aspose.threed.Node-aspose.threed.entities.SplitMeshPolicy-bool-bool) | Split mesh into sub-meshes by [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial).<br/>Each sub-mesh will use only one material.<br/>Perform mesh splitting on a node |
| [split_mesh](/3d/python-net/aspose.threed.entities/polygonmodifier/split_mesh/#aspose.threed.Scene-aspose.threed.entities.SplitMeshPolicy-bool) | Split mesh into sub-meshes by [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial).<br/>Each sub-mesh will use only one material.<br/>Perform mesh splitting on all nodes of the scene. |
| [split_mesh](/3d/python-net/aspose.threed.entities/polygonmodifier/split_mesh/#aspose.threed.entities.Mesh-aspose.threed.entities.SplitMeshPolicy) | Split mesh into sub-meshes by [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial).<br/>Each sub-mesh will use only one material.<br/>The original mesh will not get changed. |
| [build_tangent_binormal](/3d/python-net/aspose.threed.entities/polygonmodifier/build_tangent_binormal/#aspose.threed.Scene) | This will create tangent and binormal on all meshes of the scene<br/>Normal is required, if normal is not existing on the mesh, it will also create the normal data from position.<br/>UV is also required, the mesh will be ignored if no UV is defined. |
| [build_tangent_binormal](/3d/python-net/aspose.threed.entities/polygonmodifier/build_tangent_binormal/#aspose.threed.entities.Mesh) | This will create tangent and binormal on the mesh<br/>Normal is required, if normal is not existing on the mesh, it will also create the normal data from position.<br/>UV is also required, an exception will be raised if no UV found. |
| [generate_normal](/3d/python-net/aspose.threed.entities/polygonmodifier/generate_normal/#aspose.threed.entities.Mesh) | Generate normal data from Mesh definition |



### See Also
* module [`aspose.threed.entities`](..)
* class [`VertexElementMaterial`](/3d/python-net/aspose.threed.entities/vertexelementmaterial)
