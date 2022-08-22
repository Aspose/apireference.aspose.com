---
title: Aspose.ThreeD
second_title: Aspose.3D for .NET API Reference
description: The base namespace of Aspose.3D
type: docs
weight: 10
url: /net/aspose.threed/
---
The base namespace of Aspose.3D

## Classes

| Class | Description |
| --- | --- |
| [A3DObject](./a3dobject) | The base class of all Aspose.ThreeD objects, all sub classes will support dynamic properties. |
| [AssetInfo](./assetinfo) | Information of asset. Asset information can be attached to a [`Scene`](../aspose.threed/scene). Child [`Scene`](../aspose.threed/scene) can have its own [`AssetInfo`](../aspose.threed/assetinfo) to override parent's definition. |
| [BonePose](./bonepose) | The [`BonePose`](../aspose.threed/bonepose) contains the transformation matrix for a bone node |
| [CustomObject](./customobject) | Meta data or custom objects used in 3D files are managed by this class. All custom properties are saved as dynamic properties. |
| [Entity](./entity) | The base class of all entities. Entity represents a concrete object that attached under a node like [`Light`](../aspose.threed.entities/light)/[`Geometry`](../aspose.threed.entities/geometry). |
| [ExportException](./exportexception) | Exceptions when Aspose.3D failed to export the scene to file |
| [FileFormat](./fileformat) | File format definition |
| [FileFormatType](./fileformattype) | File format type |
| [GlobalTransform](./globaltransform) | Global transform is similar to [`Transform`](../aspose.threed/transform) but it's immutable while it represents the final evaluated transformation. Right-hand coordinate system is used while evaluating global transform |
| [ImageRenderOptions](./imagerenderoptions) | Options for [`Render`](../aspose.threed/scene/render) and [`Render`](../aspose.threed/scene/render) |
| [ImportException](./importexception) | Exception when Aspose.3D failed to open the specified source |
| [License](./license) | Provides methods to license the component. |
| [Metered](./metered) | Provides methods to set metered key. |
| [Node](./node) | Represents an element in the scene graph. A scene graph is a tree of Node objects. The tree management services are self contained in this class. Note the Aspose.3D SDK does not test the validity of the constructed scene graph. It is the responsibility of the caller to make sure that it does not generate cyclic graphs in a node hierarchy. Besides the tree management, this class defines all the properties required to describe the position of the object in the scene. This information include the basic Translation, Rotation and Scaling properties and the more advanced options for pivots, limits, and IK joints attributes such the stiffness and dampening. When it is first created, the Node object is "empty" (i.e: it is an object without any graphical representation that only contains the position information). In this state, it can be used to represent parents in the node tree structure but not much more. The normal use of this type of objects is to add them an entity that will specialize the node (see the "Entity"). The entity is an object in itself and is connected to the the Node. This also means that the same entity can be shared among multiple nodes. Camera, Light, Mesh, etc... are all entities and they all derived from the base class Entity. |
| [NodeVisitor](./nodevisitor) | A callback to travel through the whole node hierarchy. |
| [Pose](./pose) | The pose is used to store transformation matrix when the geometry is skinned. The pose is a set of [`BonePose`](../aspose.threed/bonepose), each [`BonePose`](../aspose.threed/bonepose) saves the concrete transformation information of the bone node. |
| [Property](./property) | Class to hold user-defined properties. |
| [PropertyCollection](./propertycollection) | The collection of properties |
| [Scene](./scene) | A scene is a top-level object that contains the nodes, geometries, materials, textures, animation, poses, sub-scenes and etc. Scene can have sub-scenes, acts as multiple-document support in files like collada/blender/fbx Node hierarchy can be accessed through [`RootNode`](../aspose.threed/scene/rootnode)[`Library`](../aspose.threed/scene/library) is used to keep a reference of unattached objects during serialization(like meta data or custom objects) so it can be used as a library. |
| [SceneObject](./sceneobject) | The root class of objects that will be stored inside a scene. |
| [Transform](./transform) | A transform contains information that allow access to object's translate/scale/rotation or transform matrix at minimum cost This is used by local transform. |
| [TrialException](./trialexception) | This is raised in Scene.Open/Scene.Save when no licenses are applied. You can turn off this exception by setting SuppressTrialException to true. |
## Interfaces

| Interface | Description |
| --- | --- |
| [INamedObject](./inamedobject) | Object that has a name |
## Enumeration

| Enumeration | Description |
| --- | --- |
| [Axis](./axis) | The coordinate axis. |
| [CoordinatedSystem](./coordinatedsystem) | The left handed or right handed coordinate system. |
| [FileContentType](./filecontenttype) | File content type |
| [PoseType](./posetype) | Pose type. |
| [PropertyFlags](./propertyflags) | Property's flags |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
