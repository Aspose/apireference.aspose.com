---
title: FileFormat
second_title: .NET API 참조용 Aspose.3D
description: 파일 형식 정의
type: docs
weight: 1000
url: /ko/net/aspose.threed/fileformat/
---
## FileFormat class

파일 형식 정의

```csharp
public class FileFormat
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport/) { get; } | Aspose.3D가 현재 파일 형식으로 장면 내보내기를 지원하는지 여부를 가져옵니다. |
| [CanImport](../../aspose.threed/fileformat/canimport/) { get; } | Aspose.3D가 현재 파일 형식에서 장면 가져오기를 지원하는지 여부를 가져옵니다. |
| [ContentType](../../aspose.threed/fileformat/contenttype/) { get; } | 파일 형식 콘텐츠 가져오기 type |
| [Extension](../../aspose.threed/fileformat/extension/) { get; } | 이 유형의 확장 이름을 가져옵니다. |
| [Extensions](../../aspose.threed/fileformat/extensions/) { get; } | 이 유형의 확장 이름을 가져옵니다. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype/) { get; } | 파일 형식 가져오기 type |
| [Version](../../aspose.threed/fileformat/version/) { get; } | 파일 형식 version 가져오기 |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect/#detect_1)(string) | 파일 이름에서 파일 형식 감지, Aspose.3D가 파일 헤더를 통해 파일 형식을 감지할 수 있도록 파일을 읽을 수 있어야 합니다. |
| static [Detect](../../aspose.threed/fileformat/detect/#detect)(Stream, string) | 데이터 스트림에서 파일 형식을 감지합니다. 매직 헤더가 없는 유형을 추측하기 위한 파일 이름은 선택 사항입니다. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension/)(string) | 파일 확장자 name 에서 기본 파일 형식을 가져옵니다. 확장자 이름은 점('.')으로 시작해야 합니다. |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions/)() | 이 파일 format 에 대한 기본 로드 옵션을 만듭니다. |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions/)() | 이 파일 format 에 대한 기본 저장 옵션을 만듭니다. |
| override [ToString](../../aspose.threed/fileformat/tostring/)() | string 로 포맷 |

## 필드

| 이름 | 설명 |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf/) | 적층 제조 파일 형식 |
| static readonly [ASE](../../aspose.threed/fileformat/ase/) | 3D Studio Max의 ASCII 장면 내보내기 형식. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb/) | Aspose.3D 웹 형식. |
| static readonly [Collada](../../aspose.threed/fileformat/collada/) | 콜라다 파일 형식 |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds/) | 3D Studio의 파일 형식 |
| static readonly [DXF](../../aspose.threed/fileformat/dxf/) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii/) | ASCII FBX 파일 형식, 6.1.0 version |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary/) | 바이너리 FBX 파일 형식(6.1.0 버전 포함) |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii/) | ASCII FBX 파일 형식, 7.2.0 version |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary/) | 바이너리 FBX 파일 형식, 7.2.0 version |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii/) | ASCII FBX 파일 형식, 7.3.0 version |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary/) | 바이너리 FBX 파일 형식, 7.3.0 version |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii/) | ASCII FBX 파일 형식, 7.4.0 version |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary/) | 바이너리 FBX 파일 형식, 7.4.0 version |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii/) | ASCII FBX 파일 형식, 7.5.0 version |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary/) | 바이너리 FBX 파일 형식, 7.5.0 version |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii/) | ASCII FBX 파일 형식, 7.6.0 version |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary/) | 바이너리 FBX 파일 형식, 7.6.0 version |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii/) | ASCII FBX 파일 형식, 7.7.0 version |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary/) | 바이너리 FBX 파일 형식, 7.7.0 version |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf/) | Khronos 그룹의 glTF |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2/) | Khronos Group의 glTF 버전 2.0 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary/) | Khronos Group의 glTF 버전 2.0 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary/) | 바이너리 형식의 Khronos Group의 glTF |
| static readonly [HTML5](../../aspose.threed/fileformat/html5/) | HTML5 파일 |
| static readonly [MayaASCII](../../aspose.threed/fileformat/mayaascii/) | ASCII 형식의 Autodesk Maya |
| static readonly [MayaBinary](../../aspose.threed/fileformat/mayabinary/) | 바이너리 형식의 Autodesk Maya |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf/) | Microsoft 3D 제조 형식 |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd/) | ASCII 모드의 PCL 포인트 클라우드 데이터 파일 |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary/) | 바이너리 모드의 PCL 포인트 클라우드 데이터 파일 |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8/) | Siemens JT 파일 버전 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9/) | Siemens JT 파일 버전 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii/) | ASCII STL 파일 형식 |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary/) | 이진 STL 파일 형식 |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d/) | Universal3D 파일 형식 |
| static readonly [USD](../../aspose.threed/fileformat/usd/) | 범용 장면 설명 |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz/) | 압축된 범용 장면 Description |
| static readonly [VRML](../../aspose.threed/fileformat/vrml/) | 가상 현실 모델링 언어 |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj/) | Wavefront의 Obj 파일 형식 |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary/) | 바이너리 형식의 DirectX X 파일 |
| static readonly [XText](../../aspose.threed/fileformat/xtext/) | 바이너리 형식의 DirectX X 파일 |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz/) | Xyz 포인트 클라우드 file |
| static readonly [Zip](../../aspose.threed/fileformat/zip/) | 다른 3D 파일 형식을 포함하는 Zip 아카이브. |
| static readonly [Draco](../../aspose.threed/fileformat/draco/) | 구글 드라코 메쉬 |
| static readonly [PDF](../../aspose.threed/fileformat/pdf/) | Adobe의 휴대용 문서 형식 |
| static readonly [PLY](../../aspose.threed/fileformat/ply/) | 다각형 파일 형식 또는 Stanford Triangle Format |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary/) | 바이너리 형식의 AVEVA Plant Design Management System 모델 |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext/) | 텍스트 형식의 AVEVA Plant Design Management System 모델 |

### 또한보십시오

* 네임스페이스 [Aspose.ThreeD](../../aspose.threed/)
* 집회 [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
