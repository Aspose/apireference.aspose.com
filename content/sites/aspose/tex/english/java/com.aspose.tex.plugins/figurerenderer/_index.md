---
title: FigureRenderer
second_title: Aspose.TeX for Java API Reference
description: FigureRenderer plugin class.
type: docs
weight: 10
url: /java/com.aspose.tex.plugins/figurerenderer/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.tex.plugins.IPlugin](../../com.aspose.tex.plugins/iplugin)
```
public class FigureRenderer implements IPlugin
```

FigureRenderer plugin class.

--------------------

The example shows how to render a LaTeX fragment in PNG.

```
// Create FigureRenderer.
 FigureRenderer renderer = new FigureRenderer();
 // Create the PngFigureRendererOptions instance and set up options.
 PngFigureRendererOptions options = new PngFigureRendererOptions();
 options.setBackgroundColor(Color.YELLOW);
 options.setResolution(150);
 options.setPreamble("\\usepackage[a6paper]{geometry} \\usepackage{pict2e} \\setlength{\\unitlength}{0.8cm}");
 
 // Add an input LaTeX fragment.
 options.addInputDataSource(new StringDataSource("\\begin{picture}(6,5)\r\n" +
 		"\\thicklines \\put(1,0.5){\\line(2,1){3}} \\put(4,2){\\line(-2,1){2}} \\put(2,3){\\line(-2,-5){1}}\r\n" +
 		"\\put(0.7,0.3){$A$} \\put(4.05,1.9){$B$} \\put(1.7,2.95){$C$}\r\n"+
 		"\\put(3.1,2.5){$a$} \\put(1.3,1.7){$b$} \\put(2.5,1.05){$c$}\r\n" +
 		"\\put(0.3,4){$F=\\sqrt{s(s-a)(s-b)(s-c)}$} \\put(3.5,0.4){$\\displaystyle s:=\\frac{a+b+c}{2}$}\r\n" +
 		"\\end{picture}"));
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
| [FigureRenderer()](#FigureRenderer--) |  |
## Methods

| Method | Description |
| --- | --- |
| [process(IPluginOptions options)](#process-com.aspose.tex.plugins.IPluginOptions-) | Starts the FigureRenderer processing with the specified parameters. |
### FigureRenderer() {#FigureRenderer--}
```
public FigureRenderer()
```


### process(IPluginOptions options) {#process-com.aspose.tex.plugins.IPluginOptions-}
```
public ResultContainer process(IPluginOptions options)
```


Starts the FigureRenderer processing with the specified parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.tex.plugins/ipluginoptions) | An options object containing instructions for the FigureRenderer. |

**Returns:**
[ResultContainer](../../com.aspose.tex.plugins/resultcontainer) - An  ResultContainer  object containing the result of the operation.
