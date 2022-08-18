---
title: FileFormat
second_title: Referencia de API de Aspose.3D para .NET
description: Definición de formato de archivo
type: docs
weight: 1000
url: /es/net/aspose.threed/fileformat/
---
## FileFormat class

Definición de formato de archivo

```csharp
public class FileFormat
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport) { get; } | Obtiene si Aspose.3D admite la exportación de escenas al formato de archivo actual. |
| [CanImport](../../aspose.threed/fileformat/canimport) { get; } | Obtiene si Aspose.3D admite la importación de escenas desde el formato de archivo actual. |
| [ContentType](../../aspose.threed/fileformat/contenttype) { get; } | Obtiene el contenido del formato de archivo type |
| [Extension](../../aspose.threed/fileformat/extension) { get; } | Obtiene el nombre de la extensión de este tipo. |
| [Extensions](../../aspose.threed/fileformat/extensions) { get; } | Obtiene los nombres de extensión de este tipo. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype) { get; } | Obtiene el formato de archivo type |
| [Version](../../aspose.threed/fileformat/version) { get; } | Obtiene el formato de archivo version |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect#detect_1)(string) | Detecte el formato de archivo a partir del nombre del archivo, el archivo debe ser legible para que Aspose.3D pueda detectar el formato de archivo a través del encabezado del archivo. |
| static [Detect](../../aspose.threed/fileformat/detect#detect)(Stream, string) | Detecta el formato de archivo del flujo de datos, el nombre del archivo es opcional para adivinar tipos que no tienen encabezado mágico. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension)(string) | Obtiene el formato de archivo preferido de la extensión de archivo nombre El nombre de la extensión debe comenzar con un punto ('.'). |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions)() | Crear opciones de carga predeterminadas para este formato de archivo |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions)() | Crear opciones de guardado predeterminadas para este formato de archivo |
| override [ToString](../../aspose.threed/fileformat/tostring)() | Formatea a cadena |

## Campos

| Nombre | Descripción |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf) | formato de archivo de fabricación aditiva |
| static readonly [ASE](../../aspose.threed/fileformat/ase) | formato ASCII Scene Exporter de 3D Studio Max. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb) | Formato Web Aspose.3D. |
| static readonly [Collada](../../aspose.threed/fileformat/collada) | formato de archivo Collada |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds) | Formato de archivo de 3D Studio |
| static readonly [DXF](../../aspose.threed/fileformat/dxf) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii) | Formato de archivo ASCII FBX, con versión 6.1.0 |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary) | Formato de archivo FBX binario, con versión 6.1.0 |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii) | Formato de archivo ASCII FBX, con versión 7.2.0 |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary) | Formato de archivo FBX binario, con versión 7.2.0 |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii) | Formato de archivo ASCII FBX, con versión 7.3.0 |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary) | Formato de archivo FBX binario, con versión 7.3.0 |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii) | Formato de archivo ASCII FBX, con versión 7.4.0 |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary) | Formato de archivo FBX binario, con versión 7.4.0 |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii) | Formato de archivo ASCII FBX, con versión 7.5.0 |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary) | Formato de archivo FBX binario, con versión 7.5.0 |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii) | Formato de archivo ASCII FBX, con versión 7.6.0 |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary) | Formato de archivo FBX binario, con versión 7.6.0 |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii) | Formato de archivo ASCII FBX, con versión 7.7.0 |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary) | Formato de archivo FBX binario, con versión 7.7.0 |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf) | glTF del Grupo Khronos |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2) | GlTF de Khronos Group versión 2.0 |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary) | GlTF de Khronos Group versión 2.0 |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary) | glTF de Khronos Group en formato binario |
| static readonly [HTML5](../../aspose.threed/fileformat/html5) | Archivo HTML5 |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf) | Formato de fabricación 3D de Microsoft |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd) | Archivo de datos de nube de puntos PCL en modo ASCII |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary) | Archivo de datos de nube de puntos PCL en modo binario |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8) | Archivo Siemens JT versión 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9) | Archivo Siemens JT Versión 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii) | Formato de archivo ASCII STL |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary) | Formato de archivo STL binario |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d) | formato de archivo Universal3D |
| static readonly [USD](../../aspose.threed/fileformat/usd) | Descripción de escena universal |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz) | Descripción de escena universal comprimida |
| static readonly [VRML](../../aspose.threed/fileformat/vrml) | El lenguaje de modelado de realidad virtual |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj) | Formato de archivo Obj de frente de onda |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary) | Archivo DirectX X en formato binario |
| static readonly [XText](../../aspose.threed/fileformat/xtext) | Archivo DirectX X en formato binario |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz) | Archivo de nube de puntos Xyz |
| static readonly [Zip](../../aspose.threed/fileformat/zip) | Archivo zip que contiene otro formato de archivo 3d. |
| static readonly [Draco](../../aspose.threed/fileformat/draco) | Malla Draco de Google |
| static readonly [PDF](../../aspose.threed/fileformat/pdf) | Formato de documento portátil de Adobe |
| static readonly [PLY](../../aspose.threed/fileformat/ply) | Formato de archivo de polígono o formato de triángulo de Stanford |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary) | Modelo de sistema de gestión de diseño de plantas de AVEVA en formato binario |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext) | Modelo de sistema de gestión de diseño de plantas de AVEVA en formato de texto |

### Ver también

* espacio de nombres [Aspose.ThreeD](../../aspose.threed)
* asamblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
