---
title: Class IfcImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Ifc.IfcImage class. Represents an image in IFC format. Contains information about all entities and header information
type: docs
weight: 33660
url: /net/aspose.cad.fileformats.ifc/ifcimage/
---
## IfcImage class

Represents an image in IFC format. Contains information about all entities and header information.

```csharp
public class IfcImage : Image, IDrawingLayout<IIfcEntity>, IHasEntities<IIfcEntity>, 
    IHasLayouts<IDrawingLayout<IIfcEntity>, IIfcEntity>
```

## Properties

| Name | Description |
| --- | --- |
| virtual [AnnotationService](../../aspose.cad/image/annotationservice/) { get; } | Gets the annotation service. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../../aspose.cad/image/) container. |
| virtual [CustomProperties](../../aspose.cad/image/customproperties/) { get; } | Gets or sets the custom properties. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| override [Depth](../../aspose.cad.fileformats.ifc/ifcimage/depth/) { get; } | Gets the depth. It is calculated from all the entities |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| [Entities](../../aspose.cad.fileformats.ifc/ifcimage/entities/) { get; } | Gets all entities that exists in the image. Could be useful for walwing through them and check its properties |
| [Header](../../aspose.cad.fileformats.ifc/ifcimage/header/) { get; } | Gets the header. |
| override [Height](../../aspose.cad.fileformats.ifc/ifcimage/height/) { get; } | Gets the image height. It is calculated from all the entities |
| override [IsCached](../../aspose.cad.fileformats.ifc/ifcimage/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data reading is required. At present time always returns true |
| [Layers](../../aspose.cad.fileformats.ifc/ifcimage/layers/) { get; } | Gets list of all the layers that are present in the image  Gets the layers from the image. |
| [LayoutName](../../aspose.cad.fileformats.ifc/ifcimage/layoutname/) { get; } |  |
| [Layouts](../../aspose.cad.fileformats.ifc/ifcimage/layouts/) { get; } |  |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| virtual [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| override [Width](../../aspose.cad.fileformats.ifc/ifcimage/width/) { get; } | Gets the image width. It is calculated from all the entities |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.cad.fileformats.ifc/ifcimage/add/)(IIfcEntity) |  |
| override [CacheData](../../aspose.cad.fileformats.ifc/ifcimage/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../../aspose.cad/datastreamsupporter/datastreamcontainer/). At present time is not implemented for IFC file format |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| override [GetStrings](../../aspose.cad.fileformats.ifc/ifcimage/getstrings/)() | Gets all string values from image. Can be useful to get some text from the image |
| [Save](../../aspose.cad/image/save/)() | Saves the image data to the underlying stream. |
| [Save](../../aspose.cad/datastreamsupporter/save/)(Stream) | Saves the object's data to the specified stream. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string) | Saves the object's data to the specified file location. |
| [Save](../../aspose.cad/image/save/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string, bool) | Saves the object's data to the specified file location. |
| virtual [Save](../../aspose.cad/image/save/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [SaveAsync](../../aspose.cad/image/saveasync/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [SaveAsync](../../aspose.cad/image/saveasync/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| virtual [ThrowIfCantExportToCad](../../aspose.cad/image/throwifcantexporttocad/)(ImageOptionsBase, Exception) | Throw exception if can`t export |

## Examples

Loading of the drawing in IFC format.

```csharp
using (IfcImage ifcImage = (IfcImage)Image.Load(fileName))
{
...
}
```

### See Also

* class [Image](../../aspose.cad/image/)
* interface [IDrawingLayout&lt;T&gt;](../../aspose.cad/idrawinglayout-1/)
* interface [IIfcEntity](../iifcentity/)
* interface [IHasEntities&lt;T&gt;](../../aspose.cad/ihasentities-1/)
* interface [IHasLayouts&lt;TLayout,TEntity&gt;](../../aspose.cad/ihaslayouts-2/)
* namespace [Aspose.CAD.FileFormats.Ifc](../../aspose.cad.fileformats.ifc/)
* assembly [Aspose.CAD](../../)


