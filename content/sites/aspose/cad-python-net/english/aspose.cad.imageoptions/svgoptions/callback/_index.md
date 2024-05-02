---
title: callback property
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 30
url: /python-net/aspose.cad.imageoptions/svgoptions/callback/
is_root: false
---

## callback property


Gets or sets the callback that can be used to store image and font binary data as user needs

### Example 


//An example of a simple callback that could only save one font and one image
internal class SvgCallback : ISvgResourceKeeperCallback
{
bool fontStoreExternal;
Stream streamForFont;
string fontFileName;
string imageFileName;
Stream streamForImage;
bool imageStoreExternal;
Stream streamForSvg;
string nameForSvg;

public SvgCallback(bool fontStoreExternal, Stream streamForFont, string fontFileName, string imageFileName, Stream streamForImage, bool imageStoreExternal, Stream streamForSvg, string nameForSvg)
{
this.fontFileName = fontFileName;
this.fontStoreExternal = fontStoreExternal;
this.streamForFont = streamForFont;
this.streamForImage = streamForImage;
this.imageFileName = imageFileName;
this.imageStoreExternal = imageStoreExternal;
this.streamForSvg = streamForSvg;
this.nameForSvg = nameForSvg;
}

public void OnFontResourceReady(FontStoringArgs args)
{
if (!fontStoreExternal)
args.FontStoreType = FontStoreType.Embedded;
else
{
args.FontStoreType = FontStoreType.Stream;
args.FontFileUri = fontFileName;
args.DestFontStream = streamForFont;
args.DisposeStream = true;
}
}

public string OnImageResourceReady(byte[] imageData, SvgImageType imageType, string suggestedFileName, ref bool useEmbeddedImage)
{
if (!imageStoreExternal)
{
useEmbeddedImage = true;
return suggestedFileName;
}
else
{
useEmbeddedImage = false;
if (streamForImage != null)
{
streamForImage.Write(imageData, 0, imageData.Length);
streamForImage.Dispose();
}
return imageFileName;
}
}
public string OnSvgDocumentReady(byte[] htmlData, string suggestedFileName)
{
if (streamForSvg != null)
{
streamForSvg.Write(htmlData, 0, htmlData.Length);
streamForSvg.Dispose();
}
return nameForSvg;
}
}
//using the callback to store rendered SVG
using (Stream content = File.Open(outCallback, FileMode.Create))
{
SvgCallback callback = new SvgCallback(false, null, "font.ttf", "", null, false, content, outCallback);
using (var img = Image.Load(file))
{
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
SvgOptions opt = new SvgOptions() { TextAsShapes = false };
opt.VectorRasterizationOptions = cadRasterizationOptions;
cadRasterizationOptions.DrawType = CadDrawTypeMode.UseObjectColor;
opt.Callback = callback;
img.Save(outFile, opt);
}
}

//using callback to store font
using (Stream font = File.Open(outFont, FileMode.Create))
{
SvgCallback callback = new SvgCallback(true, font, "font.ttf", "", null, false, content, outCallback);
using (var img = Image.Load(file))
{
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
SvgOptions opt = new SvgOptions() { TextAsShapes = false };
opt.VectorRasterizationOptions = cadRasterizationOptions;
cadRasterizationOptions.DrawType = CadDrawTypeMode.UseObjectColor;
opt.Callback = callback;
img.Save(outFile, opt);
}
}

//using callback to store raster content
using (Stream image = File.Open(outRaster, FileMode.Create))
{
SvgCallback callback = new SvgCallback(false, null, "", "raster.png", image, true, content, outCallback);
using (var img = Image.Load(file))
{
CadRasterizationOptions cadRasterizationOptions = new CadRasterizationOptions();
SvgOptions opt = new SvgOptions();
opt.VectorRasterizationOptions = cadRasterizationOptions;
cadRasterizationOptions.DrawType = CadDrawTypeMode.UseObjectColor;
opt.Callback = callback;
img.Save(outFile, opt);
}
}
### Definition:
```python
@property
def callback(self):
    ...
@callback.setter
def callback(self, value):
    ...
```

### See Also
* module [`aspose.cad.imageoptions`](../../)
* class [`ISvgResourceKeeperCallback`](/cad/python-net/aspose.cad.imageoptions.svgoptionsparameters/isvgresourcekeepercallback)
* class [`SvgOptions`](/cad/python-net/aspose.cad.imageoptions/svgoptions)
