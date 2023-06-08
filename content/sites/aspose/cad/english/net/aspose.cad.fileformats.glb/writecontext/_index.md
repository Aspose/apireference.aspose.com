---
title: Class WriteContext
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.WriteContext class. Configuration settings for writing model files
type: docs
weight: 11500
url: /net/aspose.cad.fileformats.glb/writecontext/
---
## WriteContext class

Configuration settings for writing model files.

```csharp
public class WriteContext : WriteSettings
```

## Properties

| Name | Description |
| --- | --- |
| [BuffersMaxSize](../../aspose.cad.fileformats.glb/writesettings/buffersmaxsize/) { get; set; } | Gets or sets the size used to split all the resources into individual buffers. |
| [CurrentDirectory](../../aspose.cad.fileformats.glb/writecontext/currentdirectory/) { get; } |  |
| [ImageWriteCallback](../../aspose.cad.fileformats.glb/writesettings/imagewritecallback/) { get; set; } | Gets or sets a callback hook that controls the image writing behavior. |
| [ImageWriting](../../aspose.cad.fileformats.glb/writesettings/imagewriting/) { get; set; } | Gets or sets a value indicating how to write the images of the model. |
| [JsonIndented](../../aspose.cad.fileformats.glb/writesettings/jsonindented/) { get; set; } | Gets or sets a value indicating whether the JSON formatting will include indentation. |
| [JsonOptions](../../aspose.cad.fileformats.glb/writesettings/jsonoptions/) { get; set; } | Gets or sets a value indicating the Json options to be used for writing. |
| [JsonPostprocessor](../../aspose.cad.fileformats.glb/writesettings/jsonpostprocessor/) { get; set; } | Gets or sets the callback used to postprocess the json text before parsing it. |
| [MergeBuffers](../../aspose.cad.fileformats.glb/writesettings/mergebuffers/) { get; set; } | Gets or sets a value indicating whether to merge all the buffers in !:GlbImage.LogicalBuffers into a single buffer. |
| [Validation](../../aspose.cad.fileformats.glb/writesettings/validation/) { get; set; } | Gets or sets a value indicating the level of validation applied when loading a file. |

## Methods

| Name | Description |
| --- | --- |
| static [Create](../../aspose.cad.fileformats.glb/writecontext/create/)(FileWriterCallback) |  |
| static [CreateFromDictionary](../../aspose.cad.fileformats.glb/writecontext/createfromdictionary/)(IDictionary&lt;string, ArraySegment&lt;byte&gt;&gt;) |  |
| static [CreateFromDirectory](../../aspose.cad.fileformats.glb/writecontext/createfromdirectory/)(DirectoryInfo) |  |
| static [CreateFromFile](../../aspose.cad.fileformats.glb/writecontext/createfromfile/)(string) |  |
| static [CreateFromStream](../../aspose.cad.fileformats.glb/writecontext/createfromstream/)(Stream) |  |
| [CopyTo](../../aspose.cad.fileformats.glb/writesettings/copyto/)(WriteSettings) |  |
| [WithBinarySettings](../../aspose.cad.fileformats.glb/writecontext/withbinarysettings/)() |  |
| [WithSettingsFrom](../../aspose.cad.fileformats.glb/writecontext/withsettingsfrom/)(WriteSettings) |  |
| [WithTextSettings](../../aspose.cad.fileformats.glb/writecontext/withtextsettings/)() |  |
| [WriteAllBytesToEnd](../../aspose.cad.fileformats.glb/writecontext/writeallbytestoend/)(string, ArraySegment&lt;byte&gt;) |  |
| [WriteBinarySchema2](../../aspose.cad.fileformats.glb/writecontext/writebinaryschema2/#writebinaryschema2)(Stream, GlbData) |  |
| [WriteBinarySchema2](../../aspose.cad.fileformats.glb/writecontext/writebinaryschema2/#writebinaryschema2_1)(string, GlbData) | Writes *model* to this context using the GLB binary container. |
| [WriteImage](../../aspose.cad.fileformats.glb/writecontext/writeimage/)(string, MemoryImage) |  |
| [WriteTextSchema2](../../aspose.cad.fileformats.glb/writecontext/writetextschema2/#writetextschema2_1)(string, GlbData) | Writes *model* to this context using the glTF json container. |
| [WriteTextSchema2](../../aspose.cad.fileformats.glb/writecontext/writetextschema2/#writetextschema2)(Stream, Stream, string, GlbData) | Writes *model* to this context using the glTF json container. |

### See Also

* class [WriteSettings](../writesettings/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


