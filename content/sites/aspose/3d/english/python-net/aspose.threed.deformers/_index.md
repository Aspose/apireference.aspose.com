---
title: aspose.threed.deformers
second_title: Aspose.3D for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.threed.deformers/
is_root: false
---

All deformer classes are defined in this namespace

### Classes
| Class | Description |
| :- | :- |
| [`Bone`](/3d/python-net/aspose.threed.deformers/bone) | A bone defines the subset of the geometry's control point, and defined blend weight for each control point.<br/>The [`Bone`](/3d/python-net/aspose.threed.deformers/bone) object cannot be used directly, a [`SkinDeformer`](/3d/python-net/aspose.threed.deformers/skindeformer) instance is used to deform the geometry, and [`SkinDeformer`](/3d/python-net/aspose.threed.deformers/skindeformer) comes with a set of bones, each bone linked to a node.<br/>NOTE: A control point of a geometry can be bounded to more than one Bones. |
| [`Deformer`](/3d/python-net/aspose.threed.deformers/deformer) | Base class for [`SkinDeformer`](/3d/python-net/aspose.threed.deformers/skindeformer) and [`MorphTargetDeformer`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer) |
| [`MorphTargetChannel`](/3d/python-net/aspose.threed.deformers/morphtargetchannel) | A MorphTargetChannel is used by [`MorphTargetDeformer`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer) to organize the target geometries.<br/>Some file formats like FBX support multiple channels in parallel. |
| [`MorphTargetDeformer`](/3d/python-net/aspose.threed.deformers/morphtargetdeformer) | MorphTargetDeformer provides per-vertex animation.<br/>MorphTargetDeformer organize all targets via [`MorphTargetChannel`](/3d/python-net/aspose.threed.deformers/morphtargetchannel), each channel can organize multiple targets.<br/>A common use of morph target deformer is to apply facial expression to a character.<br/>More details can be found at https://en.wikipedia.org/wiki/Morph_target_animation |
| [`SkinDeformer`](/3d/python-net/aspose.threed.deformers/skindeformer) | A skin deformer contains multiple bones to work, each bone blends a part of the geometry by control point's weights. |


