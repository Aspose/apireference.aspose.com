---
title: TtfNameTable
second_title: Referencia de la API de Aspose.Font para .NET
description: Representa la tabla nombre del archivo de fuentes TTF.
type: docs
weight: 900
url: /es/net/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class

Representa la tabla "nombre" del archivo de fuentes TTF.

```csharp
public class TtfNameTable : TtfTableBase
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset) { get; } | Obtiene el desplazamiento desde el comienzo de sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables) { get; } | Referencia al repositorio de tablas TTF. |
| static [Tag](../../aspose.font.ttftables/ttfnametable/tag) { get; } | Obtiene la etiqueta de la tabla. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [AddMultiLanguageNames](../../aspose.font.ttftables/ttfnametable/addmultilanguagenames)(MultiLanguageString, PlatformId, ushort, NameId) | Extrae todas las cadenas multilingües de pasadas*mlNames* object and crea la estructura NameRecord correspondiente para cada cadena extraída utilizando los parámetros pasados*platformId* ,*platformSpecificId* y*nameId* . El valor del campo languageID se extrae de*mlNames* objeto. El nuevo registro recién creado se agrega a la tabla. Si se encuentra un registro que coincide con el recién creado por los campos ID de plataforma, ID específico de plataforma, ID de nombre y ID de idioma , el nuevo registro creado no se agregará y solo se actualizarán los datos de cadena para el registro existente. |
| [AddName](../../aspose.font.ttftables/ttfnametable/addname)(NameId, PlatformId, int, int, string) | Agrega entrada en la tabla. La categoría de datos de cadena para agregar está especificada por*name* parámetro. |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords)(PlatformId, ushort) | Elimina todos los registros relacionados con la plataforma especificada |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_1)(PlatformId, ushort, NameId) | Elimina todos los registros relacionados con los parámetros pasados |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_2)(PlatformId, ushort, NameId, ushort) | Elimina registros relacionados con los parámetros especificados |
| [DeleteRecordsByNameId](../../aspose.font.ttftables/ttfnametable/deleterecordsbynameid)(NameId) | Elimina todos los registros relacionados con el parámetro nameId pasado |
| [GetAllNameRecords](../../aspose.font.ttftables/ttfnametable/getallnamerecords)() | Devuelve todo[`NameRecord`](../ttfnametable.namerecord) estructuras de table |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid)(NameId) | Devuelve un nombre por nameId. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_1)(NameId, PlatformId) | Devuelve un nombre por nameId usando el identificador de plataforma pasado. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_2)(NameId, PlatformId, ushort) | Devuelve un nombre como objeto de tipo[`MultiLanguageString`](../../aspose.font/multilanguagestring) . El método recopila todas las estructuras NameRecord que coinciden con los parámetros pasados nameId, platformId y platformSpecificId y luego construye el objeto resultante basado en esta lista de estructuras. |
| [GetNameById](../../aspose.font.ttftables/ttfnametable/getnamebyid)(NameId) | Devuelve un nombre por nameId si lo encuentra, nulo de lo contrario |
| [GetNameRecordsByNameId](../../aspose.font.ttftables/ttfnametable/getnamerecordsbynameid)(NameId) | Devuelve todo[`NameRecord`](../ttfnametable.namerecord) estructuras cuyo campo NameId es igual a pasado*nameId* valor. Si no se encuentran registros, se devolverá una matriz vacía. |
| [UpdateName](../../aspose.font.ttftables/ttfnametable/updatename)(PlatformId, ushort, NameId, ushort, string) | Actualiza el nombre en los registros relacionados con la plataforma especificada (combinación de platformId y platformSpecificId), categoría (nameId) e idioma (languageId). |
| [UpdateNamesByNameId](../../aspose.font.ttftables/ttfnametable/updatenamesbynameid)(NameId, string) | Selecciona todos los registros relacionados con la categoría de cadena lógica, especificada por el parámetro nameId y actualiza el campo de nombre (datos de cadena) en estos registros. Los campos relacionados con la plataforma (ID de plataforma, ID de codificación específica de la plataforma) y el idioma (Id. de idioma) no se ven afectados por este método. Solo los datos de cadena de nombre se reemplazan con un nuevo nombre. Use este método con precaución, ya que reemplazará los nombres originales para todas las plataformas e idiomas, relacionados con a nameId. Puede generar conflictos en los casos en que los nombres originales tenían valores diferentes, porque la operación de reemplazo cambia todos estos valores por uno nuevo. Y este nuevo valor puede tener una inconsistencia lógica con algunas plataformas e idiomas. Este método es útil para los casos en que el nombre original tiene una representación única para todas las plataformas e idiomas, por ejemplo, cuando los datos de la cadena del nombre están en inglés. |

## Otros miembros

| Nombre | Descripción |
| --- | --- |
| enum [MacLanguageId](ttfnametable.maclanguageid) | Enumeración de ID de idioma de la plataforma Macintosh. |
| enum [MacPlatformSpecificId](ttfnametable.macplatformspecificid) | Representa la enumeración PlatformSpecificId de la plataforma Macintosh. |
| enum [MSLanguageId](ttfnametable.mslanguageid) | Enumeración de id. de idioma de la plataforma de Microsoft. |
| enum [MSPlatformSpecificId](ttfnametable.msplatformspecificid) | Representa la enumeración PlatformSpecificId de la plataforma de Microsoft. |
| enum [NameId](ttfnametable.nameid) | Representa el Id. de nombre. |
| class [NameRecord](ttfnametable.namerecord) | Representa la estructura NameRecord de la tabla 'name' |
| enum [PlatformId](ttfnametable.platformid) | Representa la enumeración PlatformId. |
| enum [UnicodePlatformSpecificId](ttfnametable.unicodeplatformspecificid) | Representa la enumeración específica de la plataforma Unicode. |

### Ver también

* class [TtfTableBase](../ttftablebase)
* espacio de nombres [Aspose.Font.TtfTables](../../aspose.font.ttftables)
* asamblea [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
