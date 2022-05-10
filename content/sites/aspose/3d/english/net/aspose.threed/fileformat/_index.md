---
title: FileFormat
second_title: Aspose.3D for .NET API Reference
description: 
type: docs
weight: 1000
url: /net/aspose.threed/fileformat/
---
## FileFormat class

File format definition

```csharp
public class FileFormat
```

## Properties

| Name | Description |
| --- | --- |
| [CanExport](canexport) { get; } | Gets whether Aspose.3D supports export scene to current file format. |
| [CanImport](canimport) { get; } | Gets whether Aspose.3D supports import scene from current file format. |
| [ContentType](contenttype) { get; } | Gets file format content type |
| [Extension](extension) { get; } | Gets the extension name of this type. |
| [Extensions](extensions) { get; } | Gets the extension names of this type. |
| [FileFormatType](fileformattype) { get; } | Gets file format type |
| [Version](version) { get; } | Gets file format version |

## Methods

| Name | Description |
| --- | --- |
| static [Detect](detect)(string) | Detect the file format from file name, file must be readable so Aspose.3D can detect the file format through file header. |
| static [Detect](detect)(Stream, string) | Detect the file format from data stream, file name is optional for guessing types that has no magic header. |
| [CreateLoadOptions](createloadoptions)() | Create a default load options for this file format |
| [CreateSaveOptions](createsaveoptions)() | Create a default save options for this file format |
| override [ToString](tostring)() | Formats to string |

## Other Members

| Name | Description |
| --- | --- |
| static readonly [AMF](amf) | Additive manufacturing file format |
| static readonly [ASE](ase) | 3D Studio Max's ASCII Scene Exporter format. |
| static readonly [Aspose3DWeb](aspose3dweb) | Aspose.3D Web format. |
| static readonly [Collada](collada) | Collada file format |
| static readonly [Discreet3DS](discreet3ds) | 3D Studio's file format |
| static readonly [DXF](dxf) | AutoCAD DXF |
| static readonly [FBX6100ASCII](fbx6100ascii) | ASCII FBX file format, with 6.1.0 version |
| static readonly [FBX6100Binary](fbx6100binary) | Binary FBX file format, with 6.1.0 version |
| static readonly [FBX7200ASCII](fbx7200ascii) | ASCII FBX file format, with 7.2.0 version |
| static readonly [FBX7200Binary](fbx7200binary) | Binary FBX file format, with 7.2.0 version |
| static readonly [FBX7300ASCII](fbx7300ascii) | ASCII FBX file format, with 7.3.0 version |
| static readonly [FBX7300Binary](fbx7300binary) | Binary FBX file format, with 7.3.0 version |
| static readonly [FBX7400ASCII](fbx7400ascii) | ASCII FBX file format, with 7.4.0 version |
| static readonly [FBX7400Binary](fbx7400binary) | Binary FBX file format, with 7.4.0 version |
| static readonly [FBX7500ASCII](fbx7500ascii) | ASCII FBX file format, with 7.5.0 version |
| static readonly [FBX7500Binary](fbx7500binary) | Binary FBX file format, with 7.5.0 version |
| static readonly [FBX7600ASCII](fbx7600ascii) | ASCII FBX file format, with 7.6.0 version |
| static readonly [FBX7600Binary](fbx7600binary) | Binary FBX file format, with 7.6.0 version |
| static readonly [FBX7700ASCII](fbx7700ascii) | ASCII FBX file format, with 7.7.0 version |
| static readonly [FBX7700Binary](fbx7700binary) | Binary FBX file format, with 7.7.0 version |
| static readonly [GLTF](gltf) | Khronos Group's glTF |
| static readonly [GLTF2](gltf2) | Khronos Group's glTF version 2.0 |
| static readonly [GLTF2_Binary](gltf2_binary) | Khronos Group's glTF version 2.0 |
| static readonly [GLTF_Binary](gltf_binary) | Khronos Group's glTF in Binary format |
| static readonly [HTML5](html5) | HTML5 File |
| static readonly [Microsoft3MF](microsoft3mf) | Microsoft 3D Manufacturing Format |
| static readonly [Pcd](pcd) | PCL Point Cloud Data file in ASCII mode |
| static readonly [PcdBinary](pcdbinary) | PCL Point Cloud Data file in Binary mode |
| static readonly [SiemensJT8](siemensjt8) | Siemens JT File Version 8 |
| static readonly [SiemensJT9](siemensjt9) | Siemens JT File Version 9 |
| static readonly [STLASCII](stlascii) | ASCII STL file format |
| static readonly [STLBinary](stlbinary) | Binary STL file format |
| static readonly [Universal3D](universal3d) | Universal3D file format |
| static readonly [USD](usd) | Universal Scene Description |
| static readonly [USDZ](usdz) | Compressed Universal Scene Description |
| static readonly [VRML](vrml) | The Virtual Reality Modeling Language |
| static readonly [WavefrontOBJ](wavefrontobj) | Wavefront's Obj file format |
| static readonly [XBinary](xbinary) | DirectX X File in binary format |
| static readonly [XText](xtext) | DirectX X File in binary format |
| static readonly [Xyz](xyz) | Xyz point cloud file |
| static readonly [Zip](zip) | Zip archive that contains other 3d file format. |
| static readonly [Draco](draco) | Google Draco Mesh |
| static readonly [PDF](pdf) | Adobe's Portable Document Format |
| static readonly [PLY](ply) | Polygon File Format or Stanford Triangle Format |
| static readonly [RvmBinary](rvmbinary) | AVEVA Plant Design Management System Model in binary format |
| static readonly [RvmText](rvmtext) | AVEVA Plant Design Management System Model in text format |

### See Also

* namespace [Aspose.ThreeD](../../aspose.threed)
* assembly [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
