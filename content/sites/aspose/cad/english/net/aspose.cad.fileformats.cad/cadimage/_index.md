---
title: Class CadImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Cad.CadImage class. Cad image class
type: docs
weight: 1600
url: /net/aspose.cad.fileformats.cad/cadimage/
---
## CadImage class

Cad image class

```csharp
public class CadImage : Image
```

## Constructors

| Name | Description |
| --- | --- |
| [CadImage](cadimage/)() | Initializes a new instance of the `CadImage` class. |

## Properties

| Name | Description |
| --- | --- |
| [ActivePage](../../aspose.cad.fileformats.cad/cadimage/activepage/) { get; } | Gets the active page. |
| [AppIdTables](../../aspose.cad.fileformats.cad/cadimage/appidtables/) { get; set; } | Gets or sets the application identifier tables. |
| [ApplicationVersion](../../aspose.cad.fileformats.cad/cadimage/applicationversion/) { get; set; } | Gets or sets the application version. |
| virtual [BackgroundColor](../../aspose.cad/image/backgroundcolor/) { get; set; } | Gets or sets a value for the background color. |
| [BlockEntities](../../aspose.cad.fileformats.cad/cadimage/blockentities/) { get; set; } | Gets or sets the block entities. |
| [BlocksTables](../../aspose.cad.fileformats.cad/cadimage/blockstables/) { get; set; } | Gets or sets the blocks tables. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [CadAcds](../../aspose.cad.fileformats.cad/cadimage/cadacds/) { get; set; } | Gets or sets the CadAcds list |
| [ClassEntities](../../aspose.cad.fileformats.cad/cadimage/classentities/) { get; set; } | Gets or sets the class entities. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../../aspose.cad/image/) container. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| [DefaultFont](../../aspose.cad.fileformats.cad/cadimage/defaultfont/) { get; set; } | Gets or sets the default font. |
| [DefaultLineWeight](../../aspose.cad.fileformats.cad/cadimage/defaultlineweight/) { get; set; } | Gets or sets the default line weight. |
| [DimensionStyles](../../aspose.cad.fileformats.cad/cadimage/dimensionstyles/) { get; set; } | Gets or sets the dimension styles. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| [Entities](../../aspose.cad.fileformats.cad/cadimage/entities/) { get; set; } | Gets or sets the entities. |
| [FileEncoding](../../aspose.cad.fileformats.cad/cadimage/fileencoding/) { get; set; } | Gets file's encoding |
| virtual [HasBackgroundColor](../../aspose.cad/image/hasbackgroundcolor/) { get; set; } | Gets or sets a value indicating whether image has background color. |
| [Header](../../aspose.cad.fileformats.cad/cadimage/header/) { get; set; } | Gets or sets the header. |
| override [Height](../../aspose.cad.fileformats.cad/cadimage/height/) { get; } | Gets the image height. |
| [IsCached](../../aspose.cad.fileformats.cad/cadimage/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data reading is required. |
| [Layers](../../aspose.cad.fileformats.cad/cadimage/layers/) { get; set; } | Gets or sets the layers. |
| [Layouts](../../aspose.cad.fileformats.cad/cadimage/layouts/) { get; } | Gets the layouts. |
| [LineTypes](../../aspose.cad.fileformats.cad/cadimage/linetypes/) { get; set; } | Gets or sets the dimension styles. |
| [MaintenanceVersion](../../aspose.cad.fileformats.cad/cadimage/maintenanceversion/) { get; set; } | Gets or sets the maintenance version. |
| [MaxPoint](../../aspose.cad.fileformats.cad/cadimage/maxpoint/) { get; } | Gets the max point. |
| [MinPoint](../../aspose.cad.fileformats.cad/cadimage/minpoint/) { get; } | Gets the min point. |
| [Objects](../../aspose.cad.fileformats.cad/cadimage/objects/) { get; set; } | Gets or sets the objects. |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [SectionsData](../../aspose.cad.fileformats.cad/cadimage/sectionsdata/) { get; set; } | Get or sets the sectionsData |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| [SpecifiedEncoding](../../aspose.cad.fileformats.cad/cadimage/specifiedencoding/) { get; set; } | Gets or sets the specified encoding. |
| [SpecifiedMifEncoding](../../aspose.cad.fileformats.cad/cadimage/specifiedmifencoding/) { get; set; } | Gets or sets the specified MIF character encoding |
| [Styles](../../aspose.cad.fileformats.cad/cadimage/styles/) { get; set; } | Gets or sets the styles. |
| [ThumbnailImage](../../aspose.cad.fileformats.cad/cadimage/thumbnailimage/) { get; set; } | Gets or sets the thumbnail image. |
| [UCSs](../../aspose.cad.fileformats.cad/cadimage/ucss/) { get; set; } | Gets or sets the uc ss. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| [ViewPorts](../../aspose.cad.fileformats.cad/cadimage/viewports/) { get; set; } | Gets or sets the view ports. |
| [Views](../../aspose.cad.fileformats.cad/cadimage/views/) { get; set; } | Gets or sets the views. |
| override [Width](../../aspose.cad.fileformats.cad/cadimage/width/) { get; } | Gets the image width. |

## Methods

| Name | Description |
| --- | --- |
| [CacheData](../../aspose.cad.fileformats.cad/cadimage/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../../aspose.cad/datastreamsupporter/datastreamcontainer/). |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| [GetBounds](../../aspose.cad.fileformats.cad/cadimage/getbounds/#getbounds)() | Fills Bounds property (contain minimum and maximum point of entity) for all entities. |
| [GetBounds](../../aspose.cad.fileformats.cad/cadimage/getbounds/#getbounds_1)(CadBaseEntity) | Fills Bounds property (contains minimum and maximum point) for entity. |
| override [GetStrings](../../aspose.cad.fileformats.cad/cadimage/getstrings/)() | Gets all string values from image. |
| virtual [RemoveEntity](../../aspose.cad.fileformats.cad/cadimage/removeentity/)(CadBaseEntity) | Removes enity. |
| [RemoveEntityAt](../../aspose.cad.fileformats.cad/cadimage/removeentityat/)(int) | Removes entity by its position. |
| [Save](../../aspose.cad/image/save/)() | Saves the image data to the underlying stream. |
| [Save](../../aspose.cad/datastreamsupporter/save/)(Stream) | Saves the object's data to the specified stream. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string) | Saves the object's data to the specified file location. |
| [Save](../../aspose.cad/image/save/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string, bool) | Saves the object's data to the specified file location. |
| virtual [Save](../../aspose.cad/image/save/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [SaveAsync](../../aspose.cad/image/saveasync/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [SaveAsync](../../aspose.cad/image/saveasync/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [UpdateSize](../../aspose.cad.fileformats.cad/cadimage/updatesize/)(bool) | Updates size of an image after changes, that may affect initial size, e.g. removing of entities. MinPoint, MaxPoint, Width and Height properties of image are updated. |

### See Also

* class [Image](../../aspose.cad/image/)
* namespace [Aspose.CAD.FileFormats.Cad](../../aspose.cad.fileformats.cad/)
* assembly [Aspose.CAD](../../)


