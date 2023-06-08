---
title: Class TextCommand
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Cgm.Commands.TextCommand class. 
type: docs
weight: 6500
url: /net/aspose.cad.fileformats.cgm.commands/textcommand/
---
## TextCommand class

```csharp
public abstract class TextCommand : Command
```

## Properties

| Name | Description |
| --- | --- |
| [ElementClass](../../aspose.cad.fileformats.cgm.commands/command/elementclass/) { get; } |  |
| [ElementId](../../aspose.cad.fileformats.cgm.commands/command/elementid/) { get; } |  |
| [Position](../../aspose.cad.fileformats.cgm.commands/textcommand/position/) { get; } | The position at which the string should be displayed |
| [Text](../../aspose.cad.fileformats.cgm.commands/textcommand/text/) { get; } | The string to display |

## Methods

| Name | Description |
| --- | --- |
| abstract [ReadFromBinary](../../aspose.cad.fileformats.cgm.commands/command/readfrombinary/)(IBinaryReader) | Reads the binary data from the reader |
| override [ToString](../../aspose.cad.fileformats.cgm.commands/textcommand/tostring/)() |  |
| abstract [WriteAsBinary](../../aspose.cad.fileformats.cgm.commands/command/writeasbinary/)(IBinaryWriter) | Writes/exports the command as binary mode |
| abstract [WriteAsClearText](../../aspose.cad.fileformats.cgm.commands/command/writeascleartext/)(IClearTextWriter) | Writes/exports the command as clear text mode |

### See Also

* class [Command](../command/)
* namespace [Aspose.CAD.FileFormats.Cgm.Commands](../../aspose.cad.fileformats.cgm.commands/)
* assembly [Aspose.CAD](../../)


