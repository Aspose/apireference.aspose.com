---
title: MathRendererPlugin
second_title: Aspose.TeX for Java API Reference
description: MathRenderer plugin class.
type: docs
weight: 13
url: /java/com.aspose.tex.plugins/mathrendererplugin/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.plugins.IPlugin](../../com.aspose.tex.plugins/iplugin)
```
public class MathRendererPlugin implements IPlugin
```

MathRenderer plugin class.

--------------------

The example shows how to render a LaTeX formula in PNG.

```
// Create the Math Renderer plugin.
 MathRendererPlugin renderer = new MathRendererPlugin();
 // Create the PngMathRendererPLuginOptions instance and set up options.
 PngMathRendererPluginOptions options = new PngMathRendererPluginOptions();
 options.setBackgroundColor(Color.YELLOW);
 options.setTextColor(Color.BLUE);
 options.setResolution(150);
 options.setPreamble("");
 
 // Add a source formula.
 options.addInputDataSource(new StringDataSource("\\lim_{N \\to \\infty} \\sum_{k=1}^N f(t_k) \\Delta t"));
 // Create a stream to write the image to.
 final OutputStream stream = new FileOutputStream("d:\\output.png");
 try
 {
     // Add an output stream.
     options.addOutputDataTarget(new StreamDataSource(stream));
     // Run the process.
     ResultContainer result = renderer.process(options);
 }
 finally
 {
     stream.close();
 }
```
## Constructors

| Constructor | Description |
| --- | --- |
| [MathRendererPlugin()](#MathRendererPlugin--) |  |
## Methods

| Method | Description |
| --- | --- |
| [process(IPluginOptions options)](#process-com.aspose.tex.plugins.IPluginOptions-) | Runs Math Renderer processing with the specified parameters. |
### MathRendererPlugin() {#MathRendererPlugin--}
```
public MathRendererPlugin()
```


### process(IPluginOptions options) {#process-com.aspose.tex.plugins.IPluginOptions-}
```
public ResultContainer process(IPluginOptions options)
```


Runs Math Renderer processing with the specified parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.tex.plugins/ipluginoptions) | An options object containing instructions for the MathRenderer. |

**Returns:**
[ResultContainer](../../com.aspose.tex.plugins/resultcontainer) - An  ResultContainer  object containing the result of the operation.
