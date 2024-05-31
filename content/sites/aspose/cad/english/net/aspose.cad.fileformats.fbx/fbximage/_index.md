---
title: Class FbxImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Fbx.FbxImage class. Fbx Image class
type: docs
weight: 10130
url: /net/aspose.cad.fileformats.fbx/fbximage/
---
## FbxImage class

Fbx Image class

```csharp
public class FbxImage : Image, IHasEntities<DrawingEntity3D>, 
    IHasLayouts<IDrawingLayout<DrawingEntity3D>, DrawingEntity3D>
```

## Properties

| Name | Description |
| --- | --- |
| virtual [AnnotationService](../../aspose.cad/image/annotationservice/) { get; } | Gets the annotation service. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../../aspose.cad/image/) container. |
| virtual [CustomProperties](../../aspose.cad/image/customproperties/) { get; } | Gets or sets the custom properties. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| override [Depth](../../aspose.cad.fileformats.fbx/fbximage/depth/) { get; } | Gets the image depth. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| [Entities](../../aspose.cad.fileformats.fbx/fbximage/entities/) { get; } |  |
| override [Height](../../aspose.cad.fileformats.fbx/fbximage/height/) { get; } | Gets the image height. |
| override [IsCached](../../aspose.cad.fileformats.fbx/fbximage/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data readig is required. |
| [Layouts](../../aspose.cad.fileformats.fbx/fbximage/layouts/) { get; } |  |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [Scene](../../aspose.cad.fileformats.fbx/fbximage/scene/) { get; } |  |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| virtual [UnitType](../../aspose.cad/image/unittype/) { get; } | Gets current unit type. |
| [Version](../../aspose.cad.fileformats.fbx/fbximage/version/) { get; } | Gets the image height. |
| virtual [WatermarkGuardService](../../aspose.cad/image/watermarkguardservice/) { get; } |  |
| override [Width](../../aspose.cad.fileformats.fbx/fbximage/width/) { get; } | Gets the image width. |

## Methods

| Name | Description |
| --- | --- |
| override [CacheData](../../aspose.cad.fileformats.fbx/fbximage/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../../aspose.cad/datastreamsupporter/datastreamcontainer/). |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| virtual [GetStrings](../../aspose.cad/image/getstrings/)() | Gets all string values from image. |
| [Save](../../aspose.cad/image/save/)() | Saves the image data to the underlying stream. |
| [Save](../../aspose.cad/datastreamsupporter/save/)(Stream) | Saves the object's data to the specified stream. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string) | Saves the object's data to the specified file location. |
| [Save](../../aspose.cad/image/save/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string, bool) | Saves the object's data to the specified file location. |
| virtual [Save](../../aspose.cad/image/save/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [SaveAsync](../../aspose.cad/image/saveasync/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [SaveAsync](../../aspose.cad/image/saveasync/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| virtual [ThrowIfCantExportToCad](../../aspose.cad/image/throwifcantexporttocad/)(ImageOptionsBase, Exception) | Throw exception if can`t export |
| [TryRemoveEntity](../../aspose.cad.fileformats.fbx/fbximage/tryremoveentity/)(DrawingEntity3D) |  |

### See Also

* class [Image](../../aspose.cad/image/)
* interface [IHasEntities&lt;T&gt;](../../aspose.cad/ihasentities-1/)
* class [DrawingEntity3D](../../aspose.cad/drawingentity3d/)
* interface [IHasLayouts&lt;TLayout,TEntity&gt;](../../aspose.cad/ihaslayouts-2/)
* interface [IDrawingLayout&lt;T&gt;](../../aspose.cad/idrawinglayout-1/)
* namespace [Aspose.CAD.FileFormats.Fbx](../../aspose.cad.fileformats.fbx/)
* assembly [Aspose.CAD](../../)


