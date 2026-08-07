---
title: "CadRasterizationOptions"
linktitle: "CadRasterizationOptions"
second_title: "Aspose.CAD for Java"
description: "The Cad rasterization options."
type: docs
weight: 10
url: /java/com.aspose.cad.imageoptions/cadrasterizationoptions/
---

**Inheritance:** java.lang.Object, VectorRasterizationOptions

**All Implemented Interfaces:** com.aspose.cad_internal.imageoptions.IRasterRenderingOptions

The Cad rasterization options.

## Constructors

| Constructor | Description |
| --- | --- |
| [CadRasterizationOptions()](#CadRasterizationOptions) |  |

## Fields

| Field | Description |
| --- | --- |
| [RenderResult](#RenderResult) | Rendering result handler. Sets up error handler to catch all export errors and prints them to STDOUT using (var image = Aspose.CAD.Image.Load("fileName.dwg")) { image.Save("targetFile.bmp", new BmpOptions() { VectorRasterizationOptions = new CadRasterizationOptions() { RenderResult = result => { if (!result.IsRenderComplete) { foreach (var resultFailure in result.Failures) { Console.WriteLine($"Error: {resultFailure.Message} (error code {resultFailure.RenderCode})"); } } } } }); } |

## Methods

| Method | Description |
| --- | --- |
| [getZoom()](#getZoom) | Gets or sets zoom factor. Allows to zoom drawing relatively to canvas size. Value of 1 corresponds to exact fit, value below 1 allows to preserve margins, value above 1 allows to scale drawing up. Sets up zoom to keep whole drawing borders visible using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.Zoom = 0.9f; options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); } |
| [setZoom(float value)](#setZoom-float) | Gets or sets zoom factor. Allows to zoom drawing relatively to canvas size. Value of 1 corresponds to exact fit, value below 1 allows to preserve margins, value above 1 allows to scale drawing up. Sets up zoom to keep whole drawing borders visible using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.Zoom = 0.9f; options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); } |
| [getPenOptions()](#getPenOptions) | Gets or sets the pen options. Sets up "squared" pen using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.PenOptions = new PenOptions() { StartCap = LineCap.Square, EndCap = LineCap.Square }; options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); } |
| [setPenOptions(PenOptions value)](#setPenOptions-com.aspose.cad.imageoptions.PenOptions) | Gets or sets the pen options. Sets up "squared" pen using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.PenOptions = new PenOptions() { StartCap = LineCap.Square, EndCap = LineCap.Square }; options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); } |
| [getObserverPoint()](#getObserverPoint) | Gets or sets the observer point. Sets up observation point to perform export of custom view of a drawing using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.PageWidth = 1500; rasterizationOptions.PageHeight = 1500; float xAngle = 10; //Angle of rotation along the X axis float yAngle = 20; //Angle of rotation along the Y axis float zAngle = 30; //Angle of rotation along the Z axis rasterizationOptions.ObserverPoint = new ObserverPoint(xAngle, yAngle, zAngle); options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); } |
| [setObserverPoint(ObserverPoint value)](#setObserverPoint-com.aspose.cad.fileformats.ObserverPoint) | Gets or sets the observer point. Sets up observation point to perform export of custom view of a drawing using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.PageWidth = 1500; rasterizationOptions.PageHeight = 1500; float xAngle = 10; //Angle of rotation along the X axis float yAngle = 20; //Angle of rotation along the Y axis float zAngle = 30; //Angle of rotation along the Z axis rasterizationOptions.ObserverPoint = new ObserverPoint(xAngle, yAngle, zAngle); options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); } |
| [getAutomaticLayoutsScaling()](#getAutomaticLayoutsScaling) | Gets or sets a value indicating whether layouts should be automatically scaled. |
| [setAutomaticLayoutsScaling(boolean value)](#setAutomaticLayoutsScaling-boolean) | Gets or sets a value indicating whether layouts should be automatically scaled. |
| [getLayers()](#getLayers) | Gets or sets layers of DXF file to export. |
| [setLayers(List<String> value)](#setLayers-java.util.List) | Gets or sets layers of DXF file to export. |
| [getLayouts()](#getLayouts) | Gets or sets the layoutName. |
| [setLayouts(String[] value)](#setLayouts-java.lang.String:A) | Gets or sets the layoutName. |
| [getDrawType()](#getDrawType) | Gets or sets type of drawing. |
| [setDrawType(int value)](#setDrawType-int) | Gets or sets type of drawing. |
| [getScaleMethod()](#getScaleMethod) | Gets or sets scale method for automatic adjust of image size. |
| [setScaleMethod(int value)](#setScaleMethod-int) | Gets or sets scale method for automatic adjust of image size. |
| [isNoScaling()](#isNoScaling) | Gets or sets no scaling during export. |
| [setNoScaling(boolean value)](#setNoScaling-boolean) | Gets or sets no scaling during export. |
| [getPdfProductLocation()](#getPdfProductLocation) | The PDF product location |
| [setPdfProductLocation(String value)](#setPdfProductLocation-java.lang.String) | The PDF product location |
| [getQuality()](#getQuality) | Gets or sets the quality. |
| [setQuality(RasterizationQuality value)](#setQuality-com.aspose.cad.imageoptions.RasterizationQuality) | Gets or sets the quality. |
| [getExportAllLayoutContent()](#getExportAllLayoutContent) | Gets or sets whether to export entities on layouts, which are outside plot area. |
| [setExportAllLayoutContent(boolean value)](#setExportAllLayoutContent-boolean) | Gets or sets whether to export entities on layouts, which are outside plot area. |
| [getShxFonts()](#getShxFonts) | Gets or sets paths to SHX fonts to be used at export. |
| [setShxFonts(String[] value)](#setShxFonts-java.lang.String:A) | Gets or sets paths to SHX fonts to be used at export. |
| [getCtbSources()](#getCtbSources) | Gets or sets the CTB sources. Value: The CTB sources. |
| [setCtbSources(Map<String,InputStream> map)](#setCtbSources-java.util.Map) | Gets or sets the CTB sources. Value: The CTB sources. |

### CadRasterizationOptions() {#CadRasterizationOptions}
```java
public CadRasterizationOptions()
```

### RenderResult {#RenderResult}
```java
public CadRasterizationOptions.CadRenderHandler RenderResult
```

Rendering result handler. Sets up error handler to catch all export errors and prints them to STDOUT using (var image = Aspose.CAD.Image.Load("fileName.dwg")) { image.Save("targetFile.bmp", new BmpOptions() { VectorRasterizationOptions = new CadRasterizationOptions() { RenderResult = result => { if (!result.IsRenderComplete) { foreach (var resultFailure in result.Failures) { Console.WriteLine($"Error: {resultFailure.Message} (error code {resultFailure.RenderCode})"); } } } } }); }

**Returns:** CadRasterizationOptions.CadRenderHandler

### getZoom() {#getZoom}
```java
public float getZoom()
```

Gets or sets zoom factor. Allows to zoom drawing relatively to canvas size. Value of 1 corresponds to exact fit, value below 1 allows to preserve margins, value above 1 allows to scale drawing up. Sets up zoom to keep whole drawing borders visible using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.Zoom = 0.9f; options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); }

**Returns:** float

### setZoom(float value) {#setZoom-float}
```java
public void setZoom(float value)
```

Gets or sets zoom factor. Allows to zoom drawing relatively to canvas size. Value of 1 corresponds to exact fit, value below 1 allows to preserve margins, value above 1 allows to scale drawing up. Sets up zoom to keep whole drawing borders visible using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.Zoom = 0.9f; options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); }

### getPenOptions() {#getPenOptions}
```java
public PenOptions getPenOptions()
```

Gets or sets the pen options. Sets up "squared" pen using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.PenOptions = new PenOptions() { StartCap = LineCap.Square, EndCap = LineCap.Square }; options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); }

**Returns:** PenOptions - The pen options.

### setPenOptions(PenOptions value) {#setPenOptions-com.aspose.cad.imageoptions.PenOptions}
```java
public void setPenOptions(PenOptions value)
```

Gets or sets the pen options. Sets up "squared" pen using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.PenOptions = new PenOptions() { StartCap = LineCap.Square, EndCap = LineCap.Square }; options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | PenOptions | The pen options. |

### getObserverPoint() {#getObserverPoint}
```java
public ObserverPoint getObserverPoint()
```

Gets or sets the observer point. Sets up observation point to perform export of custom view of a drawing using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.PageWidth = 1500; rasterizationOptions.PageHeight = 1500; float xAngle = 10; //Angle of rotation along the X axis float yAngle = 20; //Angle of rotation along the Y axis float zAngle = 30; //Angle of rotation along the Z axis rasterizationOptions.ObserverPoint = new ObserverPoint(xAngle, yAngle, zAngle); options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); }

**Returns:** ObserverPoint - The observer point.

### setObserverPoint(ObserverPoint value) {#setObserverPoint-com.aspose.cad.fileformats.ObserverPoint}
```java
public void setObserverPoint(ObserverPoint value)
```

Gets or sets the observer point. Sets up observation point to perform export of custom view of a drawing using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName))) { JpegOptions options = new JpegOptions(); var rasterizationOptions = new CadRasterizationOptions(); rasterizationOptions.PageWidth = 1500; rasterizationOptions.PageHeight = 1500; float xAngle = 10; //Angle of rotation along the X axis float yAngle = 20; //Angle of rotation along the Y axis float zAngle = 30; //Angle of rotation along the Z axis rasterizationOptions.ObserverPoint = new ObserverPoint(xAngle, yAngle, zAngle); options.VectorRasterizationOptions = rasterizationOptions; cadImage.Save(outFile, options); }

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | ObserverPoint | The observer point. |

### getAutomaticLayoutsScaling() {#getAutomaticLayoutsScaling}
```java
public boolean getAutomaticLayoutsScaling()
```

Gets or sets a value indicating whether layouts should be automatically scaled.

**Returns:** boolean

### setAutomaticLayoutsScaling(boolean value) {#setAutomaticLayoutsScaling-boolean}
```java
public void setAutomaticLayoutsScaling(boolean value)
```

Gets or sets a value indicating whether layouts should be automatically scaled.

### getLayers() {#getLayers}
```java
public List<String> getLayers()
```

Gets or sets layers of DXF file to export.

**Returns:** List<String>

### setLayers(List<String> value) {#setLayers-java.util.List}
```java
public void setLayers(List<String> value)
```

Gets or sets layers of DXF file to export.

### getLayouts() {#getLayouts}
```java
public String[] getLayouts()
```

Gets or sets the layoutName.

**Returns:** String[] - The specific layout name or null for use Model. Model is also a layout.

### setLayouts(String[] value) {#setLayouts-java.lang.String:A}
```java
public void setLayouts(String[] value)
```

Gets or sets the layoutName.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String[] | The specific layout name or null for use Model. Model is also a layout. |

### getDrawType() {#getDrawType}
```java
public int getDrawType()
```

Gets or sets type of drawing.

**Returns:** int

### setDrawType(int value) {#setDrawType-int}
```java
public void setDrawType(int value)
```

Gets or sets type of drawing.

### getScaleMethod() {#getScaleMethod}
```java
public int getScaleMethod()
```

Gets or sets scale method for automatic adjust of image size.

**Returns:** int

### setScaleMethod(int value) {#setScaleMethod-int}
```java
public void setScaleMethod(int value)
```

Gets or sets scale method for automatic adjust of image size.

### isNoScaling() {#isNoScaling}
```java
public boolean isNoScaling()
```

Gets or sets no scaling during export.

**Returns:** boolean

### setNoScaling(boolean value) {#setNoScaling-boolean}
```java
public void setNoScaling(boolean value)
```

Gets or sets no scaling during export.

### getPdfProductLocation() {#getPdfProductLocation}
```java
public String getPdfProductLocation()
```

The PDF product location

**Returns:** String

### setPdfProductLocation(String value) {#setPdfProductLocation-java.lang.String}
```java
public void setPdfProductLocation(String value)
```

The PDF product location

### getQuality() {#getQuality}
```java
public final RasterizationQuality getQuality()
```

Gets or sets the quality.

**Returns:** RasterizationQuality - The quality.

### setQuality(RasterizationQuality value) {#setQuality-com.aspose.cad.imageoptions.RasterizationQuality}
```java
public final void setQuality(RasterizationQuality value)
```

Gets or sets the quality.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | RasterizationQuality | The quality. |

### getExportAllLayoutContent() {#getExportAllLayoutContent}
```java
public final boolean getExportAllLayoutContent()
```

Gets or sets whether to export entities on layouts, which are outside plot area.

**Returns:** boolean

### setExportAllLayoutContent(boolean value) {#setExportAllLayoutContent-boolean}
```java
public final void setExportAllLayoutContent(boolean value)
```

Gets or sets whether to export entities on layouts, which are outside plot area.

### getShxFonts() {#getShxFonts}
```java
public final String[] getShxFonts()
```

Gets or sets paths to SHX fonts to be used at export.

**Returns:** String[]

### setShxFonts(String[] value) {#setShxFonts-java.lang.String:A}
```java
public final void setShxFonts(String[] value)
```

Gets or sets paths to SHX fonts to be used at export.

### getCtbSources() {#getCtbSources}
```java
public final Map<String,InputStream> getCtbSources()
```

Gets or sets the CTB sources. Value: The CTB sources.

**Returns:** Map<String,InputStream>

### setCtbSources(Map<String,InputStream> map) {#setCtbSources-java.util.Map}
```java
public final void setCtbSources(Map<String,InputStream> map)
```

Gets or sets the CTB sources. Value: The CTB sources.

