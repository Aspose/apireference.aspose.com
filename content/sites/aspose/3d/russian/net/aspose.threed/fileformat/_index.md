---
title: FileFormat
second_title: Справочник по Aspose.3D для .NET API
description: Определение формата файла
type: docs
weight: 1000
url: /ru/net/aspose.threed/fileformat/
---
## FileFormat class

Определение формата файла

```csharp
public class FileFormat
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport) { get; } | Получает, поддерживает ли Aspose.3D экспорт сцены в текущий формат файла. |
| [CanImport](../../aspose.threed/fileformat/canimport) { get; } | Получает, поддерживает ли Aspose.3D импорт сцены из текущего формата файла. |
| [ContentType](../../aspose.threed/fileformat/contenttype) { get; } | Получает тип содержимого формата файла |
| [Extension](../../aspose.threed/fileformat/extension) { get; } | Получает имя расширения этого типа. |
| [Extensions](../../aspose.threed/fileformat/extensions) { get; } | Получает имена расширений этого типа. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype) { get; } | Получает формат файла type |
| [Version](../../aspose.threed/fileformat/version) { get; } | Получает версию формата файла |

## Методы

| Имя | Описание |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect#detect_1)(string) | Определить формат файла по имени файла, файл должен быть доступен для чтения, чтобы Aspose.3D мог определить формат файла по заголовку файла. |
| static [Detect](../../aspose.threed/fileformat/detect#detect)(Stream, string) | Определить формат файла из потока данных, имя файла является необязательным для угадывания типов, которые не имеют магического заголовка. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension)(string) | Получает предпочтительный формат файла из файла с расширением name Имя расширения должно начинаться с точки ('.'). |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions)() | Создать параметры загрузки по умолчанию для этого файла формата |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions)() | Создать параметры сохранения по умолчанию для этого файла формата |
| override [ToString](../../aspose.threed/fileformat/tostring)() | Форматирует строку |

## Поля

| Имя | Описание |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf) | Формат файла аддитивного производства |
| static readonly [ASE](../../aspose.threed/fileformat/ase) | Формат экспортера сцен ASCII 3D Studio Max. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb) | Aspose.3D веб-формат. |
| static readonly [Collada](../../aspose.threed/fileformat/collada) | Формат файла Collada |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds) | Формат файла 3D Studio |
| static readonly [DXF](../../aspose.threed/fileformat/dxf) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii) | Формат файла ASCII FBX с версией 6.1.0 |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary) | Двоичный формат файла FBX с версией 6.1.0 |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii) | Формат файла ASCII FBX с версией 7.2.0 |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary) | Двоичный формат файла FBX с версией 7.2.0 |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii) | Формат файла ASCII FBX с версией 7.3.0 |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary) | Двоичный формат файла FBX с версией 7.3.0 |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii) | Формат файла ASCII FBX с версией 7.4.0 |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary) | Двоичный формат файла FBX с версией 7.4.0 |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii) | Формат файла ASCII FBX с версией 7.5.0 |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary) | Двоичный формат файла FBX с версией 7.5.0 |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii) | Формат файла ASCII FBX с версией 7.6.0 |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary) | Двоичный формат файла FBX с версией 7.6.0 |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii) | Формат файла ASCII FBX с версией 7.7.0 |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary) | Двоичный формат файла FBX с версией 7.7.0 |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf) | glTF группы Khronos |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2) | glTF Khronos Group версии 2.0 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary) | glTF Khronos Group версии 2.0 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary) | glTF Khronos Group в двоичном формате |
| static readonly [HTML5](../../aspose.threed/fileformat/html5) | Файл HTML5 |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf) | Производственный формат Microsoft 3D |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd) | Файл данных облака точек PCL в режиме ASCII |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary) | Файл данных облака точек PCL в двоичном режиме |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8) | Версия файла Siemens JT 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9) | Версия файла Siemens JT 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii) | Формат файла ASCII STL |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary) | Двоичный формат файла STL |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d) | Универсальный формат файла 3D |
| static readonly [USD](../../aspose.threed/fileformat/usd) | Описание универсальной сцены |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz) | Описание сжатой универсальной сцены |
| static readonly [VRML](../../aspose.threed/fileformat/vrml) | Язык моделирования виртуальной реальности |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj) | Формат файла Obj Wavefront |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary) | Файл DirectX X в двоичном формате |
| static readonly [XText](../../aspose.threed/fileformat/xtext) | Файл DirectX X в двоичном формате |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz) | Файл облака точек Xyz |
| static readonly [Zip](../../aspose.threed/fileformat/zip) | Zip-архив, содержащий 3D-файлы другого формата. |
| static readonly [Draco](../../aspose.threed/fileformat/draco) | Сетка Google Драко |
| static readonly [PDF](../../aspose.threed/fileformat/pdf) | Формат переносимых документов Adobe |
| static readonly [PLY](../../aspose.threed/fileformat/ply) | Формат файла многоугольника или формат Стэнфордского треугольника |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary) | Модель системы управления проектированием предприятия AVEVA в двоичном формате |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext) | Модель системы управления проектированием предприятия AVEVA в текстовом формате |

### Смотрите также

* пространство имен [Aspose.ThreeD](../../aspose.threed)
* сборка [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
