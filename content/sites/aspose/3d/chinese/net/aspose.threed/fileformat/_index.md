---
title: FileFormat
second_title: Aspose.3D for .NET API 参考
description: 文件格式定义
type: docs
weight: 1000
url: /zh/net/aspose.threed/fileformat/
---
## FileFormat class

文件格式定义

```csharp
public class FileFormat
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport) { get; } | 获取 Aspose.3D 是否支持将场景导出为当前文件格式。 |
| [CanImport](../../aspose.threed/fileformat/canimport) { get; } | 获取 Aspose.3D 是否支持从当前文件格式导入场景。 |
| [ContentType](../../aspose.threed/fileformat/contenttype) { get; } | 获取文件格式内容类型 |
| [Extension](../../aspose.threed/fileformat/extension) { get; } | 获取该类型的扩展名。 |
| [Extensions](../../aspose.threed/fileformat/extensions) { get; } | 获取该类型的扩展名。 |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype) { get; } | 获取文件格式类型 |
| [Version](../../aspose.threed/fileformat/version) { get; } | 获取文件格式版本 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect#detect_1)(string) | 从文件名检测文件格式，文件必须是可读的，这样Aspose.3D才能通过文件头检测文件格式。 |
| static [Detect](../../aspose.threed/fileformat/detect#detect)(Stream, string) | 从数据流中检测文件格式，文件名是可选的，用于猜测没有魔术头的类型。 |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension)(string) | 从文件扩展名 获取首选文件格式:扩展名应以点（'.'）开头。 |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions)() | 为此文件格式创建默认加载选项 |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions)() | 为此文件格式创建默认保存选项 |
| override [ToString](../../aspose.threed/fileformat/tostring)() | 格式化为字符串 |

## 字段

| 姓名 | 描述 |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf) | 增材制造文件格式 |
| static readonly [ASE](../../aspose.threed/fileformat/ase) | 3D Studio Max 的 ASCII 场景导出器格式。 |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb) | Aspose.3D Web 格式。 |
| static readonly [Collada](../../aspose.threed/fileformat/collada) | Collada 文件格式 |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds) | 3D Studio 的文件格式 |
| static readonly [DXF](../../aspose.threed/fileformat/dxf) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii) | ASCII FBX 文件格式，6.1.0 版本 |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary) | 二进制 FBX 文件格式，6.1.0 版本 |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii) | ASCII FBX 文件格式，7.2.0 版本 |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary) | 二进制 FBX 文件格式，7.2.0 版本 |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii) | ASCII FBX 文件格式，7.3.0 版本 |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary) | 二进制 FBX 文件格式，7.3.0 版本 |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii) | ASCII FBX 文件格式，7.4.0 版本 |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary) | 二进制 FBX 文件格式，7.4.0 版本 |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii) | ASCII FBX 文件格式，7.5.0 版本 |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary) | 二进制 FBX 文件格式，7.5.0 版本 |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii) | ASCII FBX 文件格式，7.6.0 版本 |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary) | 二进制 FBX 文件格式，7.6.0 版本 |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii) | ASCII FBX 文件格式，7.7.0 版本 |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary) | 二进制 FBX 文件格式，7.7.0 版本 |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf) | Khronos 集团的 glTF |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2) | Khronos Group 的 glTF 2.0 版 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary) | Khronos Group 的 glTF 2.0 版 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary) | Khronos Group 二进制格式的 glTF |
| static readonly [HTML5](../../aspose.threed/fileformat/html5) | HTML5 文件 |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf) | Microsoft 3D 制造格式 |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd) | ASCII 模式的 PCL 点云数据文件 |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary) | 二进制模式下的 PCL 点云数据文件 |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8) | Siemens JT 文件版本 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9) | Siemens JT 文件版本 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii) | ASCII STL 文件格式 |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary) | 二进制 STL 文件格式 |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d) | Universal3D 文件格式 |
| static readonly [USD](../../aspose.threed/fileformat/usd) | 通用场景描述 |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz) | 压缩通用场景描述 |
| static readonly [VRML](../../aspose.threed/fileformat/vrml) | 虚拟现实建模语言 |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj) | Wavefront 的 Obj 文件格式 |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary) | DirectX X 二进制格式文件 |
| static readonly [XText](../../aspose.threed/fileformat/xtext) | DirectX X 二进制格式文件 |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz) | Xyz 点云文件 |
| static readonly [Zip](../../aspose.threed/fileformat/zip) | 包含其他 3d 文件格式的 Zip 存档。 |
| static readonly [Draco](../../aspose.threed/fileformat/draco) | Google Draco Mesh |
| static readonly [PDF](../../aspose.threed/fileformat/pdf) | Adobe 的可移植文档格式 |
| static readonly [PLY](../../aspose.threed/fileformat/ply) | 多边形文件格式或斯坦福三角格式 |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary) | AVEVA Plant Design Management System Model 二进制格式 |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext) | AVEVA Plant Design Management System Model in text format |

### 也可以看看

* 命名空间 [Aspose.ThreeD](../../aspose.threed)
* 部件 [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
