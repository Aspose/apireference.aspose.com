---
title: Class DwfImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfImage class. DWF image class. Provides reading of DWF/DWFX format files their processing and their export to other formats
type: docs
weight: 9050
url: /net/aspose.cad.fileformats.dwf/dwfimage/
---
## DwfImage class

DWF image class. Provides reading of DWF/DWFX format files, their processing and their export to other formats.

```csharp
public sealed class DwfImage : Image
```

## Properties

| Name | Description |
| --- | --- |
| virtual [AnnotationService](../../aspose.cad/image/annotationservice/) { get; } | Gets the annotation service. |
| [Bounds](../../aspose.cad/image/bounds/) { get; } | Gets the image bounds. |
| [Container](../../aspose.cad/image/container/) { get; } | Gets the [`Image`](../../aspose.cad/image/) container. |
| virtual [CustomProperties](../../aspose.cad/image/customproperties/) { get; } | Gets or sets the custom properties. |
| [DataStreamContainer](../../aspose.cad/datastreamsupporter/datastreamcontainer/) { get; } | Gets the object's data stream. |
| virtual [Depth](../../aspose.cad/image/depth/) { get; } | Gets the image depth. |
| [Disposed](../../aspose.cad/disposableobject/disposed/) { get; } | Gets a value indicating whether this instance is disposed. |
| override [Height](../../aspose.cad.fileformats.dwf/dwfimage/height/) { get; } | Gets the image height. Defines the Y-axis distance between the bottommost point of all graphical objects in the image and their topmost point. The distance is measured in units corresponding to the value of the property [`UnitType`](../../aspose.cad/image/unittype/) |
| override [IsCached](../../aspose.cad.fileformats.dwf/dwfimage/iscached/) { get; } | Gets a value indicating whether object's data is cached currently and no data reading is required. Depending on the loading options only the necessary part of the data can be loaded into the cache from the image data. In this case, we can use this property to determine that only part of the image data is loaded into the cache. |
| [Layers](../../aspose.cad.fileformats.dwf/dwfimage/layers/) { get; } | Gets DWF pages layers. Returns the enumerable collection of DWF layers. The DWF data can be assigned to a specific DWF layer, which is a grouping drawing objects. |
| [Pages](../../aspose.cad.fileformats.dwf/dwfimage/pages/) { get; } | Gets the DWF pages. Returns an array of all DWF pages that are contained in the DWF image. Each DWF page defines all its available graphical parameters and all the objects that are drawn on it. |
| [Palette](../../aspose.cad/image/palette/) { get; set; } | Gets or sets the color palette. |
| [Size](../../aspose.cad/image/size/) { get; } | Gets the image size. |
| virtual [UnitlessDefaultUnitType](../../aspose.cad/image/unitlessdefaultunittype/) { get; } | Assumed unit type when UnitType is set to Unitless |
| override [UnitType](../../aspose.cad.fileformats.dwf/dwfimage/unittype/) { get; } |  |
| override [Width](../../aspose.cad.fileformats.dwf/dwfimage/width/) { get; } | Gets the image width. Defines the X-axis distance between the leftmost point of all graphic objects in the image and their rightmost point. The distance is measured in units corresponding to the value of the property [`UnitType`](../../aspose.cad/image/unittype/) |

## Methods

| Name | Description |
| --- | --- |
| [AddElement](../../aspose.cad.fileformats.dwf/dwfimage/addelement/)(int, DwfWhipDrawable) | Adds graphic element to specified page. Provides an opportunity to add a new graphic element to the existing ones in the image. To add it, you need to create a new graphic element and specify the index of the page in [`Pages`](./pages/) array to which the element should be added. |
| override [CacheData](../../aspose.cad.fileformats.dwf/dwfimage/cachedata/)() | Caches the data and ensures no additional data loading will be performed from the underlying [`DataStreamContainer`](../../aspose.cad/datastreamsupporter/datastreamcontainer/). Depending on the loading options only the necessary part of the data can be loaded into the cache from the image data. In this case, we can use this method to load all image data into the cache. |
| [CanSave](../../aspose.cad/image/cansave/)(ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. |
| [Dispose](../../aspose.cad/disposableobject/dispose/)() | Disposes the current instance. |
| [GetElementCount](../../aspose.cad.fileformats.dwf/dwfimage/getelementcount/)(int) | Gets count of graphic elements from specified page. Provides the ability to determine the number of graphic elements on a specific image page. To get this value, you need to specify the page index in the array [`Pages`](./pages/), the number of elements of which you want to get. |
| override [GetStrings](../../aspose.cad.fileformats.dwf/dwfimage/getstrings/)() | Gets all string values from image. Provides an opportunity to get the values of all text graphic elements present in the image in the form of an array of strings. |
| [RemoveElement](../../aspose.cad.fileformats.dwf/dwfimage/removeelement/)(int, int) | Removes graphic element from specified page. Provides the ability to remove a graphic element from the image. To remove it, you need to specify the page index in [`Pages`](./pages/) array from which the element should be removed and the index of the element in [`Entities`](../dwfpage/entities/) array. |
| [Save](../../aspose.cad/image/save/)() | Saves the image data to the underlying stream. |
| [Save](../../aspose.cad/datastreamsupporter/save/)(Stream) | Saves the object's data to the specified stream. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string) | Saves the object's data to the specified file location. |
| [Save](../../aspose.cad/image/save/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [Save](../../aspose.cad/datastreamsupporter/save/)(string, bool) | Saves the object's data to the specified file location. |
| virtual [Save](../../aspose.cad/image/save/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| [SaveAsync](../../aspose.cad/image/saveasync/)(Stream, ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |
| virtual [SaveAsync](../../aspose.cad/image/saveasync/)(string, ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. |
| virtual [ThrowIfCantExportToCad](../../aspose.cad/image/throwifcantexporttocad/)(ImageOptionsBase, Exception) | Throw exception if can`t export |
| [UpdateSize](../../aspose.cad.fileformats.dwf/dwfimage/updatesize/)() | Updates the image size. Provides forced calculation of image size parameters. This calculation must be performed before using the image size parameters after changing the graphic content of the image that affects the image size parameters. |

## Examples

Reads an image file in DWG format, changes its contents and saves the image in PNG format.

```csharp
string fileName = "exampleFile";
string file = string.Format("{0}.dwf", fileName);
string outFile = string.Format("{0}.png", fileName);
using (FileStream inStream = new FileStream(file, FileMode.Open))
using (DwfImage image = (DwfImage) Image.Load(inStream))
using (FileStream stream = new FileStream(outFile, FileMode.Create))
{
    DwfWhipDrawable[] entities = image.Pages[0].Entities;
    foreach(DwfWhipDrawable drawable in entities)
    {
        if(drawable is DwfWhipPolyline)
        {
            ((DwfWhipPolyline) drawable).Points[0].X = -50;
            ((DwfWhipPolyline) drawable).Points[0].Y = -50;
            break;
        }
    }  

    image.UpdateSize();

    foreach (DwfWhipDrawable drawable in entities)
    {
        if (drawable is DwfWhipText)
        {
            ((DwfWhipText)drawable).Font.Name.Value.AsciiString = "Arial";
        }
    }

    ImageOptionsBase options = new PngOptions();
    options.VectorRasterizationOptions = new CadRasterizationOptions
                                             {
                                                 PageWidth = (float)image.Pages[0].PaperWidth,
                                                 PageHeight = (float)image.Pages[0].PaperHeight,
                                                 DrawType = CadDrawTypeMode.UseObjectColor,
                                             };

    image.Save(stream, options);
}
```

### See Also

* class [Image](../../aspose.cad/image/)
* namespace [Aspose.CAD.FileFormats.Dwf](../../aspose.cad.fileformats.dwf/)
* assembly [Aspose.CAD](../../)


