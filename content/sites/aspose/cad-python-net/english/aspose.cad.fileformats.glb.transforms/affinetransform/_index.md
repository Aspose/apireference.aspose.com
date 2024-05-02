---
title: AffineTransform class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.cad.fileformats.glb.transforms/affinetransform/
is_root: false
---

## AffineTransform class

Represents an affine transform in 3D space, with two mutually exclusive representantions:
|
|
 |
 |



The AffineTransform type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/__init__/#) | Constructs a new instance of AffineTransform |


### Properties
| Property | Description |
| :- | :- |
| [is_valid](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/is_valid) |  |
| [is_matrix](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/is_matrix) | Gets a value indicating whether this [`AffineTransform`](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform) represents a Matrix4x4. |
| [is_srt](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/is_srt) | Gets a value indicating whether this [`AffineTransform`](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform) represents a SRT chain. |
| [is_lossless_decomposable](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/is_lossless_decomposable) | Gets a value indicating whether this transform can be decomposed to SRT without precission loss. |
| [is_identity](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/is_identity) |  |
| [IDENTITY](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/identity) |  |


### Methods
| Method | Description |
| :- | :- |
| [equals](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/equals/#aspose.cad.fileformats.glb.transforms.AffineTransform) |  |
| [are_geometrically_equivalent](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/are_geometrically_equivalent/#any-any-float) | Checks whether two transform represent the same geometric spatial transformation. |
| [get_decomposed](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/get_decomposed/#) | If this object represents a Matrix4x4, it returns a decomposed representation. |
| [try_decompose](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/try_decompose/#any) |  |
| [blend](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/blend/#list-list) |  |
| [multiply](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/multiply/#any-any) | Multiplies `a` by `b`. |
| [try_invert](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform/try_invert/#any-any) | Inverts the specified transform. The return value indicates whether the operation succeeded. |



### Remarks 


Depending on how [`AffineTransform`](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform) structures are created, the underlaying

fields must be interpreted as a Matrix4x3 or a Scale/Rotation/Translation chain.




This approach allows [`AffineTransform`](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform) preserving the source transform, avoiding loosing

precission when decomposing a matrix, or creating a matrix from a SRT chain.




Decomposing matrices is tricky because not all valid matrices can be decomposed; in particular

squewed matrices will fail to decompose.

### See Also
* module [`aspose.cad.fileformats.glb.transforms`](..)
* class [`AffineTransform`](/cad/python-net/aspose.cad.fileformats.glb.transforms/affinetransform)
