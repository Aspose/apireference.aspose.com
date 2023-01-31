---
title: PolygonModifier class
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 270
url: /python-net/aspose.threed.entities/polygonmodifier/
is_root: false
---

## PolygonModifier class

Utilities to modify polygons



The PolygonModifier type exposes the following members:

### Methods
| Method | Description |
| :- | :- |
| [triangulate(scene)](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#Scene) | Convert all polygon-based meshes into full triangle mesh |
| [triangulate(mesh)](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#Mesh) | Convert a polygon-based mesh into full triangle mesh |
| [triangulate(control_points, polygons, generate_normals, nor_out)](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#list-list-bool-any) |  |
| [triangulate(control_points, polygons)](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#list-list) |  |
| [triangulate(control_points, polygon)](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#list-list) |  |
| [triangulate(control_points)](/3d/python-net/aspose.threed.entities/polygonmodifier/triangulate/#list) |  |
| [merge_mesh(scene)](/3d/python-net/aspose.threed.entities/polygonmodifier/merge_mesh/#Scene) | Convert a whole scene to a single transformed mesh<br/>Vertex elements like normal/texture coordinates are not supported yet |
| [merge_mesh(nodes)](/3d/python-net/aspose.threed.entities/polygonmodifier/merge_mesh/#list) |  |
| [merge_mesh(node)](/3d/python-net/aspose.threed.entities/polygonmodifier/merge_mesh/#Node) | Convert a whole node to a single transformed mesh<br/>Vertex elements like normal/texture coordinates are not supported yet |
| [scale(scene, scale)](/3d/python-net/aspose.threed.entities/polygonmodifier/scale/#Scene-aspose.threed.utilities.Vector3) | Scale all geometries(Scale the control points not the transformation matrix) in this scene |
| [scale(node, scale)](/3d/python-net/aspose.threed.entities/polygonmodifier/scale/#Node-aspose.threed.utilities.Vector3) | Scale all geometries(Scale the control points not the transformation matrix) in this node |
| [generate_uv(mesh, normals)](/3d/python-net/aspose.threed.entities/polygonmodifier/generate_uv/#Mesh-VertexElementNormal) | Generate UV data from the given input mesh and specified normal data. |
| [generate_uv(mesh)](/3d/python-net/aspose.threed.entities/polygonmodifier/generate_uv/#Mesh) | Generate UV data from the given input mesh |
| [split_mesh(node, policy, create_child_nodes, remove_old_mesh)](/3d/python-net/aspose.threed.entities/polygonmodifier/split_mesh/#Node-SplitMeshPolicy-bool-bool) | Split mesh into sub-meshes by [VertexElementMaterial](/3d/python-net/aspose.threed.entities/vertexelementmaterial).<br/>Each sub-mesh will use only one material.<br/>Perform mesh splitting on a node |
| [split_mesh(scene, policy, remove_old_mesh)](/3d/python-net/aspose.threed.entities/polygonmodifier/split_mesh/#Scene-SplitMeshPolicy-bool) | Split mesh into sub-meshes by [VertexElementMaterial](/3d/python-net/aspose.threed.entities/vertexelementmaterial).<br/>Each sub-mesh will use only one material.<br/>Perform mesh splitting on all nodes of the scene. |
| [split_mesh(mesh, policy)](/3d/python-net/aspose.threed.entities/polygonmodifier/split_mesh/#Mesh-SplitMeshPolicy) | Split mesh into sub-meshes by [VertexElementMaterial](/3d/python-net/aspose.threed.entities/vertexelementmaterial).<br/>Each sub-mesh will use only one material.<br/>The original mesh will not get changed. |
| [build_tangent_binormal(scene)](/3d/python-net/aspose.threed.entities/polygonmodifier/build_tangent_binormal/#Scene) | This will create tangent and binormal on all meshes of the scene<br/>Normal is required, if normal is not existing on the mesh, it will also create the normal data from position.<br/>UV is also required, the mesh will be ignored if no UV is defined. |
| [build_tangent_binormal(mesh)](/3d/python-net/aspose.threed.entities/polygonmodifier/build_tangent_binormal/#Mesh) | This will create tangent and binormal on the mesh<br/>Normal is required, if normal is not existing on the mesh, it will also create the normal data from position.<br/>UV is also required, an exception will be raised if no UV found. |
| [generate_normal(mesh)](/3d/python-net/aspose.threed.entities/polygonmodifier/generate_normal/#Mesh) | Generate normal data from Mesh definition |


### See Also

* module [aspose.threed.entities](../)
