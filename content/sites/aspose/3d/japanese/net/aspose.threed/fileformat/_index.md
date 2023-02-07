---
title: FileFormat
second_title: Aspose.3D for.NETAPIリファレンス
description: ファイルフォーマット定義
type: docs
weight: 1000
url: /ja/net/aspose.threed/fileformat/
---
## FileFormat class

ファイルフォーマット定義

```csharp
public class FileFormat
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport/) { get; } | Aspose.3D が現在のファイル形式へのシーンのエクスポートをサポートしているかどうかを取得します。 |
| [CanImport](../../aspose.threed/fileformat/canimport/) { get; } | Aspose.3D が現在のファイル フォーマットからのシーンのインポートをサポートしているかどうかを取得します。 |
| [ContentType](../../aspose.threed/fileformat/contenttype/) { get; } | ファイル形式のコンテンツを取得 type |
| [Extension](../../aspose.threed/fileformat/extension/) { get; } | このタイプの拡張名を取得します。 |
| [Extensions](../../aspose.threed/fileformat/extensions/) { get; } | このタイプの拡張名を取得します。 |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype/) { get; } | ファイル形式の取得 type |
| [Version](../../aspose.threed/fileformat/version/) { get; } | ファイル形式を取得 version |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect/#detect_1)(string) | ファイル名からファイル フォーマットを検出します。Aspose.3D がファイル ヘッダーからファイル フォーマットを検出できるように、ファイルは読み取り可能である必要があります。 |
| static [Detect](../../aspose.threed/fileformat/detect/#detect)(Stream, string) | データ ストリームからファイル形式を検出します。ファイル名は、マジック ヘッダーのないタイプを推測するためのオプションです。 |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension/)(string) | ファイル拡張子から優先ファイル形式を取得します name 拡張子名はドット ('.') で始まる必要があります。 |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions/)() | このファイル形式のデフォルトの読み込みオプションを作成します |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions/)() | このファイル形式のデフォルトの保存オプションを作成します |
| override [ToString](../../aspose.threed/fileformat/tostring/)() | string にフォーマット |

## 田畑

| 名前 | 説明 |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf/) | アディティブ マニュファクチャリング ファイル形式 |
| static readonly [ASE](../../aspose.threed/fileformat/ase/) | 3D Studio Max の ASCII シーン エクスポーター形式。 |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb/) | Aspose.3D Web フォーマット. |
| static readonly [Collada](../../aspose.threed/fileformat/collada/) | Collada ファイル形式 |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds/) | 3D Studio のファイル形式 |
| static readonly [DXF](../../aspose.threed/fileformat/dxf/) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii/) | バージョン 6.1.0 の ASCII FBX ファイル形式 |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary/) | バージョン 6.1.0 のバイナリ FBX ファイル形式 |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii/) | バージョン 7.2.0 の ASCII FBX ファイル形式 |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary/) | 7.2.0 バージョンのバイナリ FBX ファイル形式 |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii/) | バージョン 7.3.0 の ASCII FBX ファイル形式 |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary/) | 7.3.0 バージョンのバイナリ FBX ファイル形式 |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii/) | バージョン 7.4.0 の ASCII FBX ファイル形式 |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary/) | 7.4.0 バージョンのバイナリ FBX ファイル形式 |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii/) | バージョン 7.5.0 の ASCII FBX ファイル形式 |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary/) | 7.5.0 バージョンのバイナリ FBX ファイル形式 |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii/) | バージョン 7.6.0 の ASCII FBX ファイル形式 |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary/) | 7.6.0 バージョンのバイナリ FBX ファイル形式 |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii/) | バージョン 7.7.0 の ASCII FBX ファイル形式 |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary/) | 7.7.0 バージョンのバイナリ FBX ファイル形式 |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf/) | クロノスグループの glTF |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2/) | Khronos Group の glTF バージョン 2.0 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary/) | Khronos Group の glTF バージョン 2.0 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary/) | Khronos Group のバイナリ形式の glTF |
| static readonly [HTML5](../../aspose.threed/fileformat/html5/) | HTML5 ファイル |
| static readonly [MayaASCII](../../aspose.threed/fileformat/mayaascii/) | ASCII 形式の Autodesk Maya |
| static readonly [MayaBinary](../../aspose.threed/fileformat/mayabinary/) | バイナリ形式の Autodesk Maya |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf/) | Microsoft 3D Manufacturing Format |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd/) | ASCII モードの PCL ポイント クラウド データ ファイル |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary/) | バイナリ モードの PCL ポイント クラウド データ ファイル |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8/) | シーメンス JT ファイル バージョン 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9/) | シーメンス JT ファイル バージョン 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii/) | ASCII STL ファイル形式 |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary/) | バイナリ STL ファイル形式 |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d/) | Universal3D ファイル形式 |
| static readonly [USD](../../aspose.threed/fileformat/usd/) | ユニバーサル シーンの説明 |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz/) | 圧縮されたユニバーサル シーンの説明 |
| static readonly [VRML](../../aspose.threed/fileformat/vrml/) | 仮想現実モデリング言語 |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj/) | Wavefront の Obj ファイル形式 |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary/) | バイナリ形式の DirectX X ファイル |
| static readonly [XText](../../aspose.threed/fileformat/xtext/) | バイナリ形式の DirectX X ファイル |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz/) | Xyz点群ファイル |
| static readonly [Zip](../../aspose.threed/fileformat/zip/) | 他の 3D ファイル形式を含む zip アーカイブ。 |
| static readonly [Draco](../../aspose.threed/fileformat/draco/) | Google ドラコ メッシュ |
| static readonly [PDF](../../aspose.threed/fileformat/pdf/) | Adobe の Portable Document Format |
| static readonly [PLY](../../aspose.threed/fileformat/ply/) | ポリゴン ファイル形式またはスタンフォード三角形形式 |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary/) | バイナリ形式の AVEVA プラント設計管理システム モデル |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext/) | テキスト形式の AVEVA プラント設計管理システム モデル |

### 関連項目

* 名前空間 [Aspose.ThreeD](../../aspose.threed/)
* 組み立て [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
