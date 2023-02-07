---
title: FileFormat
second_title: Aspose.3D untuk .NET API Referensi
description: Definisi format file
type: docs
weight: 1000
url: /id/net/aspose.threed/fileformat/
---
## FileFormat class

Definisi format file

```csharp
public class FileFormat
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport/) { get; } | Mendapat apakah Aspose.3D mendukung adegan ekspor ke format file saat ini. |
| [CanImport](../../aspose.threed/fileformat/canimport/) { get; } | Mengetahui apakah Aspose.3D mendukung adegan impor dari format file saat ini. |
| [ContentType](../../aspose.threed/fileformat/contenttype/) { get; } | Mendapat jenis konten format file |
| [Extension](../../aspose.threed/fileformat/extension/) { get; } | Mendapatkan nama ekstensi dari tipe ini. |
| [Extensions](../../aspose.threed/fileformat/extensions/) { get; } | Mendapatkan nama ekstensi jenis ini. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype/) { get; } | Mendapat tipe format file |
| [Version](../../aspose.threed/fileformat/version/) { get; } | Mendapat versi format file |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect/#detect_1)(string) | Mendeteksi format file dari nama file, file harus dapat dibaca agar Aspose.3D dapat mendeteksi format file melalui file header. |
| static [Detect](../../aspose.threed/fileformat/detect/#detect)(Stream, string) | Mendeteksi format file dari aliran data, nama file bersifat opsional untuk jenis tebakan yang tidak memiliki header ajaib. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension/)(string) | Mendapatkan format file pilihan dari nama ekstensi file Nama ekstensi harus diawali dengan titik('.'). |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions/)() | Buat opsi pemuatan default untuk format file ini |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions/)() | Buat opsi penyimpanan default untuk format file ini |
| override [ToString](../../aspose.threed/fileformat/tostring/)() | Format ke string |

## Bidang

| Nama | Keterangan |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf/) | Format file pembuatan aditif |
| static readonly [ASE](../../aspose.threed/fileformat/ase/) | Format Eksportir Adegan ASCII 3D Studio Max. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb/) | Aspose.3D Web format. |
| static readonly [Collada](../../aspose.threed/fileformat/collada/) | Format file collada |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds/) | format file 3D Studio |
| static readonly [DXF](../../aspose.threed/fileformat/dxf/) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii/) | format file ASCII FBX, dengan versi 6.1.0 |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary/) | Format file Binary FBX, dengan versi 6.1.0 |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii/) | format file ASCII FBX, dengan versi 7.2.0 |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary/) | Format file Binary FBX, dengan versi 7.2.0 |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii/) | format file ASCII FBX, dengan versi 7.3.0 |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary/) | Format file Binary FBX, dengan versi 7.3.0 |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii/) | format file ASCII FBX, dengan versi 7.4.0 |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary/) | Format file Binary FBX, dengan versi 7.4.0 |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii/) | format file ASCII FBX, dengan versi 7.5.0 |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary/) | Format file Binary FBX, dengan versi 7.5.0 |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii/) | format file ASCII FBX, dengan versi 7.6.0 |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary/) | Format file Binary FBX, dengan versi 7.6.0 |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii/) | format file ASCII FBX, dengan versi 7.7.0 |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary/) | Format file Binary FBX, dengan versi 7.7.0 |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf/) | glTF Grup Khronos |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2/) | glTF Grup Khronos versi 2.0 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary/) | glTF Grup Khronos versi 2.0 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary/) | glTF Grup Khronos dalam format Biner |
| static readonly [HTML5](../../aspose.threed/fileformat/html5/) | File HTML5 |
| static readonly [MayaASCII](../../aspose.threed/fileformat/mayaascii/) | Autodesk Maya dalam format ASCII |
| static readonly [MayaBinary](../../aspose.threed/fileformat/mayabinary/) | Autodesk Maya dalam format Biner |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf/) | Format Manufaktur 3D Microsoft |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd/) | File PCL Point Cloud Data dalam mode ASCII |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary/) | File PCL Point Cloud Data dalam mode Biner |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8/) | Versi File JT Siemens 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9/) | File Siemens JT Versi 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii/) | format file ASCII STL |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary/) | Format file STL biner |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d/) | Format file 3D universal |
| static readonly [USD](../../aspose.threed/fileformat/usd/) | Deskripsi Adegan Universal |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz/) | Deskripsi Adegan Universal Terkompresi |
| static readonly [VRML](../../aspose.threed/fileformat/vrml/) | Bahasa Pemodelan Realitas Virtual |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj/) | Format file Obj Wavefront |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary/) | File DirectX X dalam format biner |
| static readonly [XText](../../aspose.threed/fileformat/xtext/) | File DirectX X dalam format biner |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz/) | File cloud titik Xyz |
| static readonly [Zip](../../aspose.threed/fileformat/zip/) | Arsip zip yang berisi format file 3d lainnya. |
| static readonly [Draco](../../aspose.threed/fileformat/draco/) | Google Draco Mesh |
| static readonly [PDF](../../aspose.threed/fileformat/pdf/) | Format Dokumen Portabel Adobe |
| static readonly [PLY](../../aspose.threed/fileformat/ply/) | Format File Poligon atau Format Segitiga Stanford |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary/) | Model Sistem Manajemen Desain Pabrik AVEVA dalam format biner |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext/) | Model Sistem Manajemen Desain Pabrik AVEVA dalam format teks |

### Lihat juga

* ruang nama [Aspose.ThreeD](../../aspose.threed/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
