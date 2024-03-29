---
title: FileCreateSource.FileCreateSource
second_title: Aspose.PSD for .NET API Reference
description: FileCreateSource constructor. Initializes a new instance of the FileCreateSource class
type: docs
weight: 10
url: /net/aspose.psd.sources/filecreatesource/filecreatesource/
---
{{< psd/tize >}}
## FileCreateSource(string) {#constructor}

Initializes a new instance of the [`FileCreateSource`](../) class.

```csharp
public FileCreateSource(string filePath)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path to create. |

## Examples

This example creates a new Image file at some disk location as specified by Source property of the BmpOptions instance. If second parameter is not passed to the constructor of FileCreateSource, then by default the file to be created has property IsTemporal set to True. With IsTemporal set to True, no file will be saved on disk at the end of execution.

```csharp
[C#]

string path = "C:\\temp\\image.psd";
    
//Creates an instance of PsdOptions and set its various properties
Aspose.PSD.ImageOptions.PsdOptions psdOptions = new Aspose.PSD.ImageOptions.PsdOptions();

//Create an instance of FileCreateSource and assign it as Source for the instance of PsdOptions
//If second parameter is not passed, then by default the file has IsTemporal set to True
psdOptions.Source = new Aspose.PSD.Sources.FileCreateSource(@"C:\temp\output.bmp");

//Creates an instance of Image 
using (Aspose.PSD.Image image = Aspose.PSD.Image.Create(psdOptions, 500, 500))
{
    //do some image processing
}
```

### See Also

* class [FileCreateSource](../)
* namespace [Aspose.PSD.Sources](../../../aspose.psd.sources/)
* assembly [Aspose.PSD](../../../)

---

## FileCreateSource(string, bool) {#constructor_1}

Initializes a new instance of the [`FileCreateSource`](../) class.

```csharp
public FileCreateSource(string filePath, bool isTemporal)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | The file path to create. |
| isTemporal | Boolean | If set to `true` the created file will be temporal. |

## Examples

This example creates a new Image file at some disk location as specified by Source property of the PsdOptions instance. Several properties for PsdOptions instance are set before creating the actual image. Especially the Source property, that refers to the actual disk location in this case.

```csharp
[C#]

//Create an instance of PsdOptions and set its various properties
Aspose.PSD.ImageOptions.PsdOptions psdOptions = new Aspose.PSD.ImageOptions.PsdOptions();

//Create an instance of FileCreateSource and assign it as Source for the instance of PsdOptions
//Second Boolean parameter determines if the file to be created IsTemporal or not
psdOptions.Source = new Aspose.PSD.Sources.FileCreateSource(@"C:\temp\sample.psd", false);

//Create an instance of Image and initialize it with instance of PsdOptions by calling Create method
using (Aspose.PSD.Image image = Aspose.PSD.Image.Create(psdOptions, 500, 500))
{
    //do some image processing

    // save all changes
    image.Save();
}
```

### See Also

* class [FileCreateSource](../)
* namespace [Aspose.PSD.Sources](../../../aspose.psd.sources/)
* assembly [Aspose.PSD](../../../)


