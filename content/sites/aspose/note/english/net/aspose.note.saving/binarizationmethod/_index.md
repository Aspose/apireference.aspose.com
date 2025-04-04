---
title: Enum BinarizationMethod
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.Saving.BinarizationMethod enum. Specifies binarization method for an image
type: docs
weight: 640
url: /net/aspose.note.saving/binarizationmethod/
---
## BinarizationMethod enumeration

Specifies binarization method for an image.

```csharp
public enum BinarizationMethod
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| FixedThreshold | `0` | The image's binarization is performed using specified fixed threshold. |
| Otsu | `1` | The image's binarization is performed adaptively using Otsu's method to evaluate threshold. |

## Examples

Shows how to save a document as binary image using Otsu's method.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_LoadingAndSaving();

// Load the document into Aspose.Note.
Document oneFile = new Document(dataDir + "Aspose.one");

dataDir = dataDir + "SaveToBinaryImageUsingOtsuMethod_out.png";

// Save the document as gif.
oneFile.Save(dataDir, new ImageSaveOptions(SaveFormat.Png)
                        {
                            ColorMode = ColorMode.BlackAndWhite,
                            BinarizationOptions = new ImageBinarizationOptions()
                                                  {
                                                      BinarizationMethod = BinarizationMethod.Otsu,
                                                  }
                        });
```

Shows how to save a document as binary image using fixed threshold.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_LoadingAndSaving();

// Load the document into Aspose.Note.
Document oneFile = new Document(dataDir + "Aspose.one");

dataDir = dataDir + "SaveToBinaryImageUsingFixedThreshold_out.png";

// Save the document as gif.
oneFile.Save(dataDir, new ImageSaveOptions(SaveFormat.Png)
                          {
                              ColorMode = ColorMode.BlackAndWhite,
                              BinarizationOptions = new ImageBinarizationOptions()
                                                        {
                                                            BinarizationMethod = BinarizationMethod.FixedThreshold,
                                                            BinarizationThreshold = 123
                                                        }
                          });
```

### See Also

* namespace [Aspose.Note.Saving](../../aspose.note.saving/)
* assembly [Aspose.Note](../../)


