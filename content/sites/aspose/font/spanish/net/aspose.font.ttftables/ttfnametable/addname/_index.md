---
title: AddName
second_title: Referencia de la API de Aspose.Font para .NET
description: Agrega entrada en la tabla. La categoría de datos de cadena para agregar está especificada porname parámetro.
type: docs
weight: 20
url: /es/net/aspose.font.ttftables/ttfnametable/addname/
---
## TtfNameTable.AddName method

Agrega entrada en la tabla. La categoría de datos de cadena para agregar está especificada por*name* parámetro.

```csharp
public void AddName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, 
    string name)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| nameId | NameId | Identificador de nombre, categoría de cadena lógica, especificado por[`NameId`](../../ttfnametable.nameid) enumeración |
| platformId | PlatformId | Identificador de plataforma |
| platformSpecificId | Int32 | Identificador de codificación específico de la plataforma. Por favor, use el valor de una de tales enumeraciones -[`UnicodePlatformSpecificId`](../../ttfnametable.unicodeplatformspecificid) ,[`MacPlatformSpecificId`](../../ttfnametable.macplatformspecificid) , [`MSPlatformSpecificId`](../../ttfnametable.msplatformspecificid). Qué enumeración usar está definida por el contexto (*platformId* parámetro) |
| languageId | Int32 | Identificador de idioma. Por favor, utilice el valor de[`MSLanguageId`](../../ttfnametable.mslanguageid) o [`MacLanguageId`](../../ttfnametable.maclanguageid) las enumeraciones dependen del contexto, definido por*platformId* parámetro. |
| name | String | Datos de cadena reales |

### Ver también

* enum [NameId](../../ttfnametable.nameid)
* enum [PlatformId](../../ttfnametable.platformid)
* class [TtfNameTable](../../ttfnametable)
* espacio de nombres [Aspose.Font.TtfTables](../../ttfnametable)
* asamblea [Aspose.Font](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
