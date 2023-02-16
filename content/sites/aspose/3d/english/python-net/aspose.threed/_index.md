---
title: aspose.threed
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed/
is_root: false
---

The base namespace of Aspose.3D

### Classes
| Class | Description |
| :- | :- |
| [`A3DObject`](/3d/python-net/aspose.threed/a3dobject) | The base class of all Aspose.ThreeD objects, all sub classes will support dynamic properties. |
| [`AssetInfo`](/3d/python-net/aspose.threed/assetinfo) | Information of asset.<br/>Asset information can be attached to a [`Scene`](/3d/python-net/aspose.threed/scene).<br/>Child [`Scene`](/3d/python-net/aspose.threed/scene) can have its own [`AssetInfo`](/3d/python-net/aspose.threed/assetinfo) to override parent's definition. |
| [`BonePose`](/3d/python-net/aspose.threed/bonepose) | The [`BonePose`](/3d/python-net/aspose.threed/bonepose) contains the transformation matrix for a bone node |
| [`CustomObject`](/3d/python-net/aspose.threed/customobject) | Meta data or custom objects used in 3D files are managed by this class.<br/>All custom properties are saved as dynamic properties. |
| [`Entity`](/3d/python-net/aspose.threed/entity) | The base class of all entities.<br/>Entity represents a concrete object that attached under a node like [`Light`](/3d/python-net/aspose.threed.entities/light)/[`Geometry`](/3d/python-net/aspose.threed.entities/geometry). |
| [`ExportException`](/3d/python-net/aspose.threed/exportexception) | Exceptions when Aspose.3D failed to export the scene to file |
| [`FileFormat`](/3d/python-net/aspose.threed/fileformat) | File format definition |
| [`FileFormatType`](/3d/python-net/aspose.threed/fileformattype) | File format type |
| [`GlobalTransform`](/3d/python-net/aspose.threed/globaltransform) | Global transform is similar to [`Transform`](/3d/python-net/aspose.threed/transform) but it's immutable while it represents the final evaluated transformation.<br/>Right-hand coordinate system is used while evaluating global transform |
| [`INamedObject`](/3d/python-net/aspose.threed/inamedobject) | Object that has a name |
| [`ImageRenderOptions`](/3d/python-net/aspose.threed/imagerenderoptions) | Options for [`Scene.render(camera, file_name)`](/3d/python-net/aspose.threed/scene/render) and  [`Scene.render(camera, file_name)`](/3d/python-net/aspose.threed/scene/render) |
| [`ImportException`](/3d/python-net/aspose.threed/importexception) | Exception when Aspose.3D failed to open the specified source |
| [`License`](/3d/python-net/aspose.threed/license) | Provides methods to license the component. |
| [`Metered`](/3d/python-net/aspose.threed/metered) | Provides methods to set metered key. |
| [`Node`](/3d/python-net/aspose.threed/node) | Represents an element in the scene graph.<br/>A scene graph is a tree of Node objects. The tree management services are self contained in this class.<br/>Note the Aspose.3D SDK does not test the validity of the constructed scene graph. It is the responsibility of the caller to make sure that it does not generate cyclic graphs in a node hierarchy.<br/>Besides the tree management, this class defines all the properties required to describe the position of the object in the scene. This information include the basic Translation, Rotation and Scaling properties and the more advanced options for pivots, limits, and IK joints attributes such the stiffness and dampening.<br/>When it is first created, the Node object is "empty" (i.e: it is an object without any graphical representation that only contains the position information). In this state, it can be used to represent parents in the node tree structure but not much more. The normal use of this type of objects is to add them an entity that will specialize the node (see the "Entity").<br/>The entity is an object in itself and is connected to the the Node. This also means that the same entity can be shared among multiple nodes. Camera, Light, Mesh, etc... are all entities and they all derived from the base class Entity. |
| [`Pose`](/3d/python-net/aspose.threed/pose) | The pose is used to store transformation matrix when the geometry is skinned.<br/>The pose is a set of [`BonePose`](/3d/python-net/aspose.threed/bonepose), each [`BonePose`](/3d/python-net/aspose.threed/bonepose) saves the concrete transformation information of the bone node. |
| [`Property`](/3d/python-net/aspose.threed/property) | Class to hold user-defined properties. |
| [`PropertyCollection`](/3d/python-net/aspose.threed/propertycollection) | The collection of properties |
| [`Scene`](/3d/python-net/aspose.threed/scene) | A scene is a top-level object that contains the nodes, geometries, materials, textures, animation, poses, sub-scenes and etc.<br/>Scene can have sub-scenes, acts as multiple-document support in files like collada/blender/fbx<br/>Node hierarchy can be accessed through [`Scene.root_node`](/3d/python-net/aspose.threed/scene#root_node)[`Scene.library`](/3d/python-net/aspose.threed/scene#library) is used to keep a reference of unattached objects during serialization(like meta data or custom objects) so it can be used as a library. |
| [`SceneObject`](/3d/python-net/aspose.threed/sceneobject) | The root class of objects that will be stored inside a scene. |
| [`Transform`](/3d/python-net/aspose.threed/transform) | A transform contains information that allow access to object's translate/scale/rotation or transform matrix at minimum cost<br/>This is used by local transform. |
| [`TrialException`](/3d/python-net/aspose.threed/trialexception) | This is raised in Scene.Open/Scene.Save when no licenses are applied.<br/>You can turn off this exception by setting SuppressTrialException to true. |


### Enumerations
| Enumeration | Description |
| :- | :- |
| [`Axis`](/3d/python-net/aspose.threed/axis) | The coordinate axis. |
| [`CoordinatedSystem`](/3d/python-net/aspose.threed/coordinatedsystem) | The left handed or right handed coordinate system. |
| [`FileContentType`](/3d/python-net/aspose.threed/filecontenttype) | File content type |
| [`PoseType`](/3d/python-net/aspose.threed/posetype) | Pose type. |
| [`PropertyFlags`](/3d/python-net/aspose.threed/propertyflags) | Property's flags |


