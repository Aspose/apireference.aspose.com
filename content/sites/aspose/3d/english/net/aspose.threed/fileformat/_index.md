---
title: Class FileFormat
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.FileFormat class. File format definition
type: docs
weight: 1030
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
| [CanExport](../../aspose.threed/fileformat/canexport/) { get; } | Gets whether Aspose.3D supports export scene to current file format. |
| [CanImport](../../aspose.threed/fileformat/canimport/) { get; } | Gets whether Aspose.3D supports import scene from current file format. |
| [ContentType](../../aspose.threed/fileformat/contenttype/) { get; } | Gets file format content type |
| [Extension](../../aspose.threed/fileformat/extension/) { get; } | Gets the extension name of this type. |
| [Extensions](../../aspose.threed/fileformat/extensions/) { get; } | Gets the extension names of this type. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype/) { get; } | Gets file format type |
| [Version](../../aspose.threed/fileformat/version/) { get; } | Gets file format version |
| static [Formats](../../aspose.threed/fileformat/formats/) { get; } | Access to all supported formats |

## Methods

| Name | Description |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect/#detect_1)(string) | Detect the file format from file name, file must be readable so Aspose.3D can detect the file format through file header. |
| static [Detect](../../aspose.threed/fileformat/detect/#detect)(Stream, string) | Detect the file format from data stream, file name is optional for guessing types that has no magic header. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension/)(string) | Gets the preferred file format from the file extension name The extension name should starts with a dot('.'). |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions/)() | Create a default load options for this file format |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions/)() | Create a default save options for this file format |
| override [ToString](../../aspose.threed/fileformat/tostring/)() | Formats to string |

## Fields

| Name | Description |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf/) | Additive manufacturing file format |
| static readonly [ASE](../../aspose.threed/fileformat/ase/) | 3D Studio Max's ASCII Scene Exporter format. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb/) | Aspose.3D Web format. |
| static readonly [Blender](../../aspose.threed/fileformat/blender/) | Blender's 3D file format |
| static readonly [Collada](../../aspose.threed/fileformat/collada/) | Collada file format |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds/) | 3D Studio's file format |
| static readonly [DXF](../../aspose.threed/fileformat/dxf/) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii/) | ASCII FBX file format, with 6.1.0 version |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary/) | Binary FBX file format, with 6.1.0 version |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii/) | ASCII FBX file format, with 7.2.0 version |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary/) | Binary FBX file format, with 7.2.0 version |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii/) | ASCII FBX file format, with 7.3.0 version |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary/) | Binary FBX file format, with 7.3.0 version |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii/) | ASCII FBX file format, with 7.4.0 version |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary/) | Binary FBX file format, with 7.4.0 version |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii/) | ASCII FBX file format, with 7.5.0 version |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary/) | Binary FBX file format, with 7.5.0 version |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii/) | ASCII FBX file format, with 7.6.0 version |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary/) | Binary FBX file format, with 7.6.0 version |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii/) | ASCII FBX file format, with 7.7.0 version |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary/) | Binary FBX file format, with 7.7.0 version |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf/) | Khronos Group's glTF |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2/) | Khronos Group's glTF version 2.0 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary/) | Khronos Group's glTF version 2.0 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary/) | Khronos Group's glTF in Binary format |
| static readonly [HTML5](../../aspose.threed/fileformat/html5/) | HTML5 File |
| static readonly [IFC](../../aspose.threed/fileformat/ifc/) | ISO 16739-1 Industry Foundation Classes data model. |
| static readonly [MayaASCII](../../aspose.threed/fileformat/mayaascii/) | Autodesk Maya in ASCII format |
| static readonly [MayaBinary](../../aspose.threed/fileformat/mayabinary/) | Autodesk Maya in Binary format |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd/) | PCL Point Cloud Data file in ASCII mode |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary/) | PCL Point Cloud Data file in Binary mode |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8/) | Siemens JT File Version 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9/) | Siemens JT File Version 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii/) | ASCII STL file format |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary/) | Binary STL file format |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d/) | Universal3D file format |
| static readonly [USD](../../aspose.threed/fileformat/usd/) | Universal Scene Description |
| static readonly [USDA](../../aspose.threed/fileformat/usda/) | Universal Scene Description in ASCII format. |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz/) | Compressed Universal Scene Description |
| static readonly [VRML](../../aspose.threed/fileformat/vrml/) | The Virtual Reality Modeling Language |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj/) | Wavefront's Obj file format |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary/) | DirectX X File in binary format |
| static readonly [XText](../../aspose.threed/fileformat/xtext/) | DirectX X File in binary format |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz/) | Xyz point cloud file |
| static readonly [Zip](../../aspose.threed/fileformat/zip/) | Zip archive that contains other 3d file format. |
| static readonly [Draco](../../aspose.threed/fileformat/draco/) | Google Draco Mesh |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf/) | Microsoft 3D Manufacturing Format |
| static readonly [PDF](../../aspose.threed/fileformat/pdf/) | Adobe's Portable Document Format |
| static readonly [PLY](../../aspose.threed/fileformat/ply/) | Polygon File Format or Stanford Triangle Format |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary/) | AVEVA Plant Design Management System Model in binary format |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext/) | AVEVA Plant Design Management System Model in text format |

### See Also

* namespace [Aspose.ThreeD](../../aspose.threed/)
* assembly [Aspose.3D](../../)


