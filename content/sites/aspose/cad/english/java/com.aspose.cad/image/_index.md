---
title: "Image"
linktitle: "Image"
second_title: "Aspose.CAD for Java"
description: "The image is the base class for all type of drawings."
type: docs
weight: 10
url: /java/com.aspose.cad/image/
---

**Inheritance:** java.lang.Object, com.aspose.cad.DataStreamSupporter

**All Implemented Interfaces:** IObjectWithBounds

The image is the base class for all type of drawings.

## Methods

| Method | Description |
| --- | --- |
| [getBounds()](#getBounds) | Gets the image bounds. Custom processing of a drawing depending on its bounds var fileName = @"C:\path\drawing.dwg"; using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName)) { if (drawing.Bounds.Width > 500) { // ... } } |
| [getContainer()](#getContainer) | Gets the Image container. Gets root (top-level) drawing where current drawing is nested in Image drawing = ... while (drawing.Container != null) { drawing = drawing.Container; } |
| [getHeight()](#getHeight) | Gets the image height. Prints drawing's height Image drawing = ... System.Console.WriteLine("Drawing's height: " + drawing.Height); |
| [getPalette()](#getPalette) | Gets or sets the color palette. Asserts DGN drawing contains palette var fileName = @"C:\path\drawing.dgn"; using (DgnImage drawing = (DgnImage)Image.Load(fileName)) { Assert.IsNotNull(drawing.Palette); } |
| [setPalette(com.aspose.cad.IColorPalette value)](#setPalette-com.aspose.cad.IColorPalette) | Gets or sets the color palette. Asserts DGN drawing contains palette var fileName = @"C:\path\drawing.dgn"; using (DgnImage drawing = (DgnImage)Image.Load(fileName)) { Assert.IsNotNull(drawing.Palette); } |
| [getSize()](#getSize) | Gets the image size. Processes a drawing if it is not empty var fileName = @"C:\path\drawing.dwg"; using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName)) { if (!drawing.Size.IsEmpty) { // ... } } |
| [getWidth()](#getWidth) | Gets the image width. Prints drawing's width Image drawing = ... System.Console.WriteLine("Drawing's width: " + drawing.Width); |
| [hasBackgroundColor()](#hasBackgroundColor) | Deprecated. |
| [setBackgroundColor(boolean value)](#setBackgroundColor-boolean) | Deprecated. |
| [getBackgroundColor()](#getBackgroundColor) | Deprecated. |
| [setBackgroundColor(com.aspose.cad.Color value)](#setBackgroundColor-com.aspose.cad.Color) | Deprecated. |
| [getUnitType()](#getUnitType) | Gets current unit type. Normalize export page size despite of unit type defined on drawing public static void ExportPageSizeNormalizationExample() { using (CadImage cadImage = (CadImage)Image.Load("fileName.dwg")) { CadVportList viewPorts = cadImage.ViewPorts; CadVportTableObject table = (CadVportTableObject)viewPorts[0]; Console.WriteLine(table.ViewTwistAngle.Value); bool currentUnitIsMetric = false; double currentUnitCoefficient = 1.0; var values = DefineUnitSystem(cadImage.UnitType); currentUnitIsMetric = values.Item1; currentUnitCoefficient = values.Item2; PngOptions pngOptions = new PngOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.Layouts = new string[] { "Model" }; if (currentUnitIsMetric) { double metersCoeff = 1 / 1000.0; double scaleFactor = metersCoeff / currentUnitCoefficient; rasterizationOptions.PageWidth = (float)(210 * scaleFactor); rasterizationOptions.PageHeight = (float)(297 * scaleFactor); rasterizationOptions.UnitType = UnitType.Millimeter; } else { rasterizationOptions.PageWidth = (float)(8.27f / currentUnitCoefficient); rasterizationOptions.PageHeight = (float)(11.69f / currentUnitCoefficient); rasterizationOptions.UnitType = UnitType.Inch; } pngOptions.VectorRasterizationOptions = rasterizationOptions; cadImage.Save("fileName.png", pngOptions); } } protected static Tuple<bool, double> DefineUnitSystem(UnitType unitType) { var isMetric = false; var coefficient = 1.0; switch (unitType) { case UnitType.Parsec: coefficient = 3.0857 * 10000000000000000.0; isMetric = true; break; case UnitType.LightYear: coefficient = 9.4607 * 1000000000000000.0; isMetric = true; break; case UnitType.AstronomicalUnit: coefficient = 1.4960 * 100000000000.0; isMetric = true; break; case UnitType.Gigameter: coefficient = 1000000000.0; isMetric = true; break; case UnitType.Kilometer: coefficient = 1000.0; isMetric = true; break; case UnitType.Decameter: isMetric = true; coefficient = 10.0; break; case UnitType.Hectometer: isMetric = true; coefficient = 100.0; break; case UnitType.Meter: isMetric = true; coefficient = 1.0; break; case UnitType.Centimenter: isMetric = true; coefficient = 0.01; break; case UnitType.Decimeter: isMetric = true; coefficient = 0.1; break; case UnitType.Millimeter: isMetric = true; coefficient = 0.001; break; case UnitType.Micrometer: isMetric = true; coefficient = 0.000001; break; case UnitType.Nanometer: isMetric = true; coefficient = 0.000000001; break; case UnitType.Angstrom: isMetric = true; coefficient = 0.0000000001; break; case UnitType.Inch: coefficient = 1.0; break; case UnitType.MicroInch: coefficient = 0.000001; break; case UnitType.Mil: coefficient = 0.001; break; case UnitType.Foot: coefficient = 12.0; break; case UnitType.Yard: coefficient = 36.0; break; case UnitType.Mile: coefficient = 63360.0; break; } return new Tuple<bool, double>(isMetric, coefficient); } |
| [getUnitlessDefaultUnitType()](#getUnitlessDefaultUnitType) | Assumed unit type when UnitType is set to Unitless |
| [canLoad(String filePath)](#canLoad-java.lang.String) | Determines whether image can be loaded from the specified file path. Checks whether loading of a drawing is possible var fileName = @"C:\path\drawing.dwg"; if (Aspose.CAD.Image.CanLoad(fileName)) { using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName)) { // process the drawing } } |
| [canLoad(String filePath, LoadOptions loadOptions)](#canLoad-java.lang.String-com.aspose.cad.LoadOptions) | Determines whether an image can be loaded from the specified file path and optionally using the specified open options Checks whether loading of a drawing is possible with specified encoding var fileName = @"C:\path\drawing.dwg"; if (Aspose.CAD.Image.CanLoad(fileName, new LoadOptions { SpecifiedEncoding = CodePages.Japanese })) { using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName)) { // process the drawing } } |
| [canLoad(InputStream stream)](#canLoad-java.io.InputStream) | Determines whether image can be loaded from the specified stream. Checks whether loading of a drawing is possible from the stream specified using (var f = File.OpenRead("file.dxf")) { var currentPosition = f.Position; if (Image.CanLoad(f)) { Assert.AreEqual(currentPosition, f.Position); // process the drawing... } } |
| [canLoad(InputStream stream, LoadOptions loadOptions)](#canLoad-java.io.InputStream-com.aspose.cad.LoadOptions) | Determines whether image can be loaded from the specified stream and optionally using the specified loadOptions . Checks whether loading of a drawing is possible from the stream specified with a corresponding encoding using (var f = File.OpenRead("file.dwg", new LoadOptions { SpecifiedEncoding = CodePages.Japanese })) { var currentPosition = f.Position; if (Image.CanLoad(f)) { Assert.AreEqual(currentPosition, f.Position); // process the drawing... } } |
| [getFileFormat(String filePath)](#getFileFormat-java.lang.String) | Gets the file format. Determines whether file is a DWG drawing var fileFormat = Image.GetFileFormat("file.dwg"); if (fileFormat >= FileFormat.CadR010 && fileFormat <= FileFormat.CadR2010) { Console.WriteLine("This is a DWG drawing"); } |
| [getStrings()](#getStrings) | Gets all string values from image. |
| [getFileFormat(InputStream stream)](#getFileFormat-java.io.InputStream) | Gets the file format. Determines whether a stream contains a DXF drawing using (var f = File.OpenRead("file.dxf")) { var fileFormat = Image.GetFileFormat(f); if (fileFormat >= FileFormat.DXFCadR010 && fileFormat <= FileFormat.DXFCadR2010) { Console.WriteLine("This is a DXF drawing"); } } |
| [load(String filePath, LoadOptions loadOptions)](#load-java.lang.String-com.aspose.cad.LoadOptions) | Loads a new image from the specified file. Loads a drawing to process and unloads all related resources when dispose is called using (var image = Aspose.CAD.Image.Load("fileName.dwg", new LoadOptions { UnloadOnDispose = true })) { // process the drawing } |
| [load(String filePath)](#load-java.lang.String) | Loads a new image from the specified file. Loads a drawing to process using (var image = Aspose.CAD.Image.Load("fileName.dwg")) { // process the drawing } |
| [load(InputStream stream, LoadOptions loadOptions)](#load-java.io.InputStream-com.aspose.cad.LoadOptions) | Loads a new image from the specified stream. Loads a drawing to process from corresponding stream and unloads all related resources when dispose is called using (var image = Aspose.CAD.Image.Load(File.OpenRead("fileName.dwg"), new LoadOptions { UnloadOnDispose = true })) { // process the drawing } |
| [load(InputStream stream)](#load-java.io.InputStream) | Loads a new image from the specified stream. Loads a drawing to process from corresponding stream using (var image = Aspose.CAD.Image.Load(File.OpenRead("fileName.dwg")) { // process the drawing } |
| [canSave(ImageOptionsBase options)](#canSave-com.aspose.cad.ImageOptionsBase) | Determines whether image can be saved to the specified file format represented by the passed save options. Checks whether export is possible to BMP with default options using (var image = Aspose.CAD.Image.Load("fileName.dwg")) { if (image.CanSave(new BmpOptions())) { // export to BMP format is possible with this options } } |
| [save()](#save) | Saves the image data to the underlying stream. Saves all changes made to drawing. Note: Only DXF is currently supported using (var image = Aspose.CAD.Image.Load("fileName.dwg")) { image.Save(); } |
| [save(String filePath, ImageOptionsBase options)](#save-java.lang.String-com.aspose.cad.ImageOptionsBase) | Saves the object's data to the specified file location in the specified file format according to save options. Exports drawing to BMP with specified size using (var image = Aspose.CAD.Image.Load("fileName.dwg")) { image.Save("targetFile.bmp", new BmpOptions() { VectorRasterizationOptions = new CadRasterizationOptions() { PageWidth = 640, PageHeight = 480 } }); } |
| [save(OutputStream stream, ImageOptionsBase optionsBase)](#save-java.io.OutputStream-com.aspose.cad.ImageOptionsBase) | Saves the image's data to the specified stream in the specified file format according to save options. |

### getBounds() {#getBounds}
```java
public com.aspose.cad.Rectangle getBounds()
```

Gets the image bounds. Custom processing of a drawing depending on its bounds var fileName = @"C:\path\drawing.dwg"; using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName)) { if (drawing.Bounds.Width > 500) { // ... } }

**Returns:** com.aspose.cad.Rectangle - The image bounds.

### getContainer() {#getContainer}
```java
public Image getContainer()
```

Gets the Image container. Gets root (top-level) drawing where current drawing is nested in Image drawing = ... while (drawing.Container != null) { drawing = drawing.Container; }

**Returns:** Image - The Image container. If this property is not null it indicates the image is contained whithin another image.

### getHeight() {#getHeight}
```java
public abstract int getHeight()
```

Gets the image height. Prints drawing's height Image drawing = ... System.Console.WriteLine("Drawing's height: " + drawing.Height);

**Returns:** int - The image height.

### getPalette() {#getPalette}
```java
public com.aspose.cad.IColorPalette getPalette()
```

Gets or sets the color palette. Asserts DGN drawing contains palette var fileName = @"C:\path\drawing.dgn"; using (DgnImage drawing = (DgnImage)Image.Load(fileName)) { Assert.IsNotNull(drawing.Palette); }

**Returns:** com.aspose.cad.IColorPalette - The color palette.

### setPalette(com.aspose.cad.IColorPalette value) {#setPalette-com.aspose.cad.IColorPalette}
```java
public void setPalette(com.aspose.cad.IColorPalette value)
```

Gets or sets the color palette. Asserts DGN drawing contains palette var fileName = @"C:\path\drawing.dgn"; using (DgnImage drawing = (DgnImage)Image.Load(fileName)) { Assert.IsNotNull(drawing.Palette); }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.IColorPalette | The color palette. |

### getSize() {#getSize}
```java
public com.aspose.cad.Size getSize()
```

Gets the image size. Processes a drawing if it is not empty var fileName = @"C:\path\drawing.dwg"; using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName)) { if (!drawing.Size.IsEmpty) { // ... } }

**Returns:** com.aspose.cad.Size - The image size.

### getWidth() {#getWidth}
```java
public abstract int getWidth()
```

Gets the image width. Prints drawing's width Image drawing = ... System.Console.WriteLine("Drawing's width: " + drawing.Width);

**Returns:** int - The image width.

### hasBackgroundColor() {#hasBackgroundColor}
```java
@Deprecated public boolean hasBackgroundColor()
```

Deprecated.

**Returns:** boolean

### setBackgroundColor(boolean value) {#setBackgroundColor-boolean}
```java
@Deprecated public void setBackgroundColor(boolean value)
```

Deprecated.

### getBackgroundColor() {#getBackgroundColor}
```java
@Deprecated public com.aspose.cad.Color getBackgroundColor()
```

Deprecated.

**Returns:** com.aspose.cad.Color

### setBackgroundColor(com.aspose.cad.Color value) {#setBackgroundColor-com.aspose.cad.Color}
```java
@Deprecated public void setBackgroundColor(com.aspose.cad.Color value)
```

Deprecated.

### getUnitType() {#getUnitType}
```java
public int getUnitType()
```

Gets current unit type. Normalize export page size despite of unit type defined on drawing public static void ExportPageSizeNormalizationExample() { using (CadImage cadImage = (CadImage)Image.Load("fileName.dwg")) { CadVportList viewPorts = cadImage.ViewPorts; CadVportTableObject table = (CadVportTableObject)viewPorts[0]; Console.WriteLine(table.ViewTwistAngle.Value); bool currentUnitIsMetric = false; double currentUnitCoefficient = 1.0; var values = DefineUnitSystem(cadImage.UnitType); currentUnitIsMetric = values.Item1; currentUnitCoefficient = values.Item2; PngOptions pngOptions = new PngOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.Layouts = new string[] { "Model" }; if (currentUnitIsMetric) { double metersCoeff = 1 / 1000.0; double scaleFactor = metersCoeff / currentUnitCoefficient; rasterizationOptions.PageWidth = (float)(210 * scaleFactor); rasterizationOptions.PageHeight = (float)(297 * scaleFactor); rasterizationOptions.UnitType = UnitType.Millimeter; } else { rasterizationOptions.PageWidth = (float)(8.27f / currentUnitCoefficient); rasterizationOptions.PageHeight = (float)(11.69f / currentUnitCoefficient); rasterizationOptions.UnitType = UnitType.Inch; } pngOptions.VectorRasterizationOptions = rasterizationOptions; cadImage.Save("fileName.png", pngOptions); } } protected static Tuple<bool, double> DefineUnitSystem(UnitType unitType) { var isMetric = false; var coefficient = 1.0; switch (unitType) { case UnitType.Parsec: coefficient = 3.0857 * 10000000000000000.0; isMetric = true; break; case UnitType.LightYear: coefficient = 9.4607 * 1000000000000000.0; isMetric = true; break; case UnitType.AstronomicalUnit: coefficient = 1.4960 * 100000000000.0; isMetric = true; break; case UnitType.Gigameter: coefficient = 1000000000.0; isMetric = true; break; case UnitType.Kilometer: coefficient = 1000.0; isMetric = true; break; case UnitType.Decameter: isMetric = true; coefficient = 10.0; break; case UnitType.Hectometer: isMetric = true; coefficient = 100.0; break; case UnitType.Meter: isMetric = true; coefficient = 1.0; break; case UnitType.Centimenter: isMetric = true; coefficient = 0.01; break; case UnitType.Decimeter: isMetric = true; coefficient = 0.1; break; case UnitType.Millimeter: isMetric = true; coefficient = 0.001; break; case UnitType.Micrometer: isMetric = true; coefficient = 0.000001; break; case UnitType.Nanometer: isMetric = true; coefficient = 0.000000001; break; case UnitType.Angstrom: isMetric = true; coefficient = 0.0000000001; break; case UnitType.Inch: coefficient = 1.0; break; case UnitType.MicroInch: coefficient = 0.000001; break; case UnitType.Mil: coefficient = 0.001; break; case UnitType.Foot: coefficient = 12.0; break; case UnitType.Yard: coefficient = 36.0; break; case UnitType.Mile: coefficient = 63360.0; break; } return new Tuple<bool, double>(isMetric, coefficient); }

**Returns:** int

### getUnitlessDefaultUnitType() {#getUnitlessDefaultUnitType}
```java
public int getUnitlessDefaultUnitType()
```

Assumed unit type when UnitType is set to Unitless

**Returns:** int

### canLoad(String filePath) {#canLoad-java.lang.String}
```java
public static boolean canLoad(String filePath)
```

Determines whether image can be loaded from the specified file path. Checks whether loading of a drawing is possible var fileName = @"C:\path\drawing.dwg"; if (Aspose.CAD.Image.CanLoad(fileName)) { using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName)) { // process the drawing } }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path. |

**Returns:** boolean - true if image can be loaded from the specified file; otherwise, false .

### canLoad(String filePath, LoadOptions loadOptions) {#canLoad-java.lang.String-com.aspose.cad.LoadOptions}
```java
public static boolean canLoad(String filePath, LoadOptions loadOptions)
```

Determines whether an image can be loaded from the specified file path and optionally using the specified open options Checks whether loading of a drawing is possible with specified encoding var fileName = @"C:\path\drawing.dwg"; if (Aspose.CAD.Image.CanLoad(fileName, new LoadOptions { SpecifiedEncoding = CodePages.Japanese })) { using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName)) { // process the drawing } }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path. |
| loadOptions | LoadOptions | The load options. |

**Returns:** boolean - true if an image can be loaded from the specified file; otherwise, false .

### canLoad(InputStream stream) {#canLoad-java.io.InputStream}
```java
public static boolean canLoad(InputStream stream)
```

Determines whether image can be loaded from the specified stream. Checks whether loading of a drawing is possible from the stream specified using (var f = File.OpenRead("file.dxf")) { var currentPosition = f.Position; if (Image.CanLoad(f)) { Assert.AreEqual(currentPosition, f.Position); // process the drawing... } }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| stream | InputStream | The stream to load from. |

**Returns:** boolean - true if image can be loaded from the specified stream; otherwise, false .

### canLoad(InputStream stream, LoadOptions loadOptions) {#canLoad-java.io.InputStream-com.aspose.cad.LoadOptions}
```java
public static boolean canLoad(InputStream stream, LoadOptions loadOptions)
```

Determines whether image can be loaded from the specified stream and optionally using the specified loadOptions . Checks whether loading of a drawing is possible from the stream specified with a corresponding encoding using (var f = File.OpenRead("file.dwg", new LoadOptions { SpecifiedEncoding = CodePages.Japanese })) { var currentPosition = f.Position; if (Image.CanLoad(f)) { Assert.AreEqual(currentPosition, f.Position); // process the drawing... } }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| stream | InputStream | The stream to load from. |
| loadOptions | LoadOptions | The load options. |

**Returns:** boolean - true if image can be loaded from the specified stream; otherwise, false .

### getFileFormat(String filePath) {#getFileFormat-java.lang.String}
```java
public static long getFileFormat(String filePath)
```

Gets the file format. Determines whether file is a DWG drawing var fileFormat = Image.GetFileFormat("file.dwg"); if (fileFormat >= FileFormat.CadR010 && fileFormat <= FileFormat.CadR2010) { Console.WriteLine("This is a DWG drawing"); }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path. The file format determined does not mean that the specified image may be loaded. Use one of the CanLoad method overloads to determine whether file may be loaded. |

**Returns:** long - The determined file format.

### getStrings() {#getStrings}
```java
public String[] getStrings()
```

Gets all string values from image.

**Returns:** String[] - The array with string values.

### getFileFormat(InputStream stream) {#getFileFormat-java.io.InputStream}
```java
public static long getFileFormat(InputStream stream)
```

Gets the file format. Determines whether a stream contains a DXF drawing using (var f = File.OpenRead("file.dxf")) { var fileFormat = Image.GetFileFormat(f); if (fileFormat >= FileFormat.DXFCadR010 && fileFormat <= FileFormat.DXFCadR2010) { Console.WriteLine("This is a DXF drawing"); } }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| stream | InputStream | The stream. The file format determined does not mean that the specified image may be loaded. Use one of the CanLoad method overloads to determine whether stream may be loaded. |

**Returns:** long - The determined file format.

### load(String filePath, LoadOptions loadOptions) {#load-java.lang.String-com.aspose.cad.LoadOptions}
```java
public static Image load(String filePath, LoadOptions loadOptions)
```

Loads a new image from the specified file. Loads a drawing to process and unloads all related resources when dispose is called using (var image = Aspose.CAD.Image.Load("fileName.dwg", new LoadOptions { UnloadOnDispose = true })) { // process the drawing }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path to load image from. |
| loadOptions | LoadOptions | The load options. |

**Returns:** Image - The loaded drawing.

### load(String filePath) {#load-java.lang.String}
```java
public static Image load(String filePath)
```

Loads a new image from the specified file. Loads a drawing to process using (var image = Aspose.CAD.Image.Load("fileName.dwg")) { // process the drawing }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path to load image from. |

**Returns:** Image - The loaded drawing.

### load(InputStream stream, LoadOptions loadOptions) {#load-java.io.InputStream-com.aspose.cad.LoadOptions}
```java
public static Image load(InputStream stream, LoadOptions loadOptions)
```

Loads a new image from the specified stream. Loads a drawing to process from corresponding stream and unloads all related resources when dispose is called using (var image = Aspose.CAD.Image.Load(File.OpenRead("fileName.dwg"), new LoadOptions { UnloadOnDispose = true })) { // process the drawing }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| stream | InputStream | The stream to load image from. |
| loadOptions | LoadOptions | The load options. |

**Returns:** Image - The loaded drawing.

### load(InputStream stream) {#load-java.io.InputStream}
```java
public static Image load(InputStream stream)
```

Loads a new image from the specified stream. Loads a drawing to process from corresponding stream using (var image = Aspose.CAD.Image.Load(File.OpenRead("fileName.dwg")) { // process the drawing }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| stream | InputStream | The stream to load image from. |

**Returns:** Image - The loaded drawing.

### canSave(ImageOptionsBase options) {#canSave-com.aspose.cad.ImageOptionsBase}
```java
public boolean canSave(ImageOptionsBase options)
```

Determines whether image can be saved to the specified file format represented by the passed save options. Checks whether export is possible to BMP with default options using (var image = Aspose.CAD.Image.Load("fileName.dwg")) { if (image.CanSave(new BmpOptions())) { // export to BMP format is possible with this options } }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| options | ImageOptionsBase | The save options to use. |

**Returns:** boolean - true if image can be saved to the specified file format represented by the passed save options; otherwise, false .

### save() {#save}
```java
public final void save()
```

Saves the image data to the underlying stream. Saves all changes made to drawing. Note: Only DXF is currently supported using (var image = Aspose.CAD.Image.Load("fileName.dwg")) { image.Save(); }

### save(String filePath, ImageOptionsBase options) {#save-java.lang.String-com.aspose.cad.ImageOptionsBase}
```java
public void save(String filePath, ImageOptionsBase options)
```

Saves the object's data to the specified file location in the specified file format according to save options. Exports drawing to BMP with specified size using (var image = Aspose.CAD.Image.Load("fileName.dwg")) { image.Save("targetFile.bmp", new BmpOptions() { VectorRasterizationOptions = new CadRasterizationOptions() { PageWidth = 640, PageHeight = 480 } }); }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path. |
| options | ImageOptionsBase | The options. |

### save(OutputStream stream, ImageOptionsBase optionsBase) {#save-java.io.OutputStream-com.aspose.cad.ImageOptionsBase}
```java
public void save(OutputStream stream, ImageOptionsBase optionsBase)
```

Saves the image's data to the specified stream in the specified file format according to save options.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| stream | OutputStream | The stream to save the image's data to. |
| optionsBase | ImageOptionsBase | The save options. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - optionsBase
- `com.aspose.ms.System.ArgumentException` - Cannot save to the specified format as it is not supported at the moment.;optionsBase
- `com.aspose.cad.cadexceptions.ImageSaveException` - Image export failed.

