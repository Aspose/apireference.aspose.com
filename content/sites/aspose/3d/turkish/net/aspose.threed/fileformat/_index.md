---
title: FileFormat
second_title: Aspose.3D for .NET API Referansı
description: Dosya biçimi tanımı
type: docs
weight: 1000
url: /tr/net/aspose.threed/fileformat/
---
## FileFormat class

Dosya biçimi tanımı

```csharp
public class FileFormat
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport) { get; } | Aspose.3D'nin sahneyi mevcut dosya formatına aktarmayı destekleyip desteklemediğini alır. |
| [CanImport](../../aspose.threed/fileformat/canimport) { get; } | Aspose.3D'nin mevcut dosya formatından içe aktarma sahnesini destekleyip desteklemediğini alır. |
| [ContentType](../../aspose.threed/fileformat/contenttype) { get; } | Dosya biçimi içerik türünü alır |
| [Extension](../../aspose.threed/fileformat/extension) { get; } | Bu türün uzantı adını alır. |
| [Extensions](../../aspose.threed/fileformat/extensions) { get; } | Bu türün uzantı adlarını alır. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype) { get; } | type dosya biçimini alır |
| [Version](../../aspose.threed/fileformat/version) { get; } | version dosya biçimini alır |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect#detect_1)(string) | Dosya adından dosya biçimini tespit edin, dosyanın okunabilir olması gerekir, böylece Aspose.3D dosya başlığı aracılığıyla dosya biçimini algılayabilir. |
| static [Detect](../../aspose.threed/fileformat/detect#detect)(Stream, string) | Veri akışından dosya biçimini algılayın, dosya adı sihirli başlığı olmayan tahmin türleri için isteğe bağlıdır. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension)(string) | Dosya uzantısı adından tercih edilen dosya biçimini alır Uzantı adı bir nokta('.') ile başlamalıdır. |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions)() | Bu dosya formatı için bir varsayılan yükleme seçeneği oluşturun |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions)() | Bu dosya formatı için bir varsayılan kaydetme seçeneği oluşturun |
| override [ToString](../../aspose.threed/fileformat/tostring)() | Formatlar string |

## Alanlar

| İsim | Tanım |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf) | Eklemeli üretim dosyası formatı |
| static readonly [ASE](../../aspose.threed/fileformat/ase) | 3D Studio Max'in ASCII Scene Exporter formatı. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb) | Aspose.3D Web formatı. |
| static readonly [Collada](../../aspose.threed/fileformat/collada) | Collada dosya formatı |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds) | 3D Studio'nun dosya formatı |
| static readonly [DXF](../../aspose.threed/fileformat/dxf) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii) | ASCII FBX dosya biçimi, 6.1.0 sürümüyle |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary) | 6.1.0 sürümü ile İkili FBX dosya biçimi |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii) | ASCII FBX dosya biçimi, 7.2.0 sürümüyle |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary) | 7.2.0 sürümü ile İkili FBX dosya biçimi |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii) | ASCII FBX dosya biçimi, 7.3.0 sürümüyle |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary) | 7.3.0 sürümü ile İkili FBX dosya biçimi |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii) | ASCII FBX dosya biçimi, 7.4.0 sürümüyle |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary) | İkili FBX dosya biçimi, 7.4.0 sürümüyle |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii) | ASCII FBX dosya biçimi, 7.5.0 sürümüyle |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary) | 7.5.0 sürümü ile İkili FBX dosya biçimi |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii) | ASCII FBX dosya biçimi, 7.6.0 sürümüyle |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary) | 7.6.0 sürümü ile İkili FBX dosya biçimi |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii) | ASCII FBX dosya biçimi, 7.7.0 sürümüyle |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary) | 7.7.0 sürümü ile İkili FBX dosya biçimi |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf) | Khronos Grubu'nun glTF |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2) | Khronos Group'un glTF sürümü 2.0 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary) | Khronos Group'un glTF sürümü 2.0 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary) | Khronos Group'un İkili formattaki glTF'si |
| static readonly [HTML5](../../aspose.threed/fileformat/html5) | HTML5 Dosyası |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf) | Microsoft 3D Üretim Formatı |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd) | ASCII modunda PCL Nokta Bulutu Veri dosyası |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary) | İkili modda PCL Nokta Bulutu Veri dosyası |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8) | Siemens JT Dosya Sürümü 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9) | Siemens JT Dosya Sürümü 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii) | ASCII STL dosya biçimi |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary) | İkili STL dosya formatı |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d) | Evrensel3D dosya biçimi |
| static readonly [USD](../../aspose.threed/fileformat/usd) | Evrensel Sahne Açıklaması |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz) | Sıkıştırılmış Evrensel Sahne Açıklaması |
| static readonly [VRML](../../aspose.threed/fileformat/vrml) | Sanal Gerçeklik Modelleme Dili |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj) | Wavefront'un Obj dosya formatı |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary) | DirectX X Dosyası ikili biçimde |
| static readonly [XText](../../aspose.threed/fileformat/xtext) | DirectX X Dosyası ikili biçimde |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz) | Xyz nokta bulutu dosyası |
| static readonly [Zip](../../aspose.threed/fileformat/zip) | Diğer 3B dosya biçimini içeren zip arşivi. |
| static readonly [Draco](../../aspose.threed/fileformat/draco) | Google Draco Mesh |
| static readonly [PDF](../../aspose.threed/fileformat/pdf) | Adobe'nin Taşınabilir Belge Formatı |
| static readonly [PLY](../../aspose.threed/fileformat/ply) | Çokgen Dosya Biçimi veya Stanford Üçgen Biçimi |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary) | İkili formatta AVEVA Tesis Tasarım Yönetim Sistemi Modeli |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext) | Metin biçiminde AVEVA Tesis Tasarım Yönetim Sistemi Modeli |

### Ayrıca bakınız

* ad alanı [Aspose.ThreeD](../../aspose.threed)
* toplantı [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
