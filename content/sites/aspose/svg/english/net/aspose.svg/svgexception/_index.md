---
title: SVGException Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.SVGException class. This exception is raised when a specific SVG operation is impossible to perform
type: docs
weight: 5290
url: /net/aspose.svg/svgexception/
---
## SVGException class

This exception is raised when a specific SVG operation is impossible to perform.

```csharp
public class SVGException : PlatformException
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGException](svgexception/)(*ushort*) | Initializes a new instance of the `SVGException` class. |

## Properties

| Name | Description |
| --- | --- |
| [Code](../../aspose.svg/svgexception/code/) { get; } | A code identifying the reason why the requested operation could not be performed. The value of this member will be one of the constants in the SVGException code group. |
| virtual [Data](../../system/exception/data/) { get; } |  |
| virtual [HelpLink](../../system/exception/helplink/) { get; set; } |  |
| [HResult](../../system/exception/hresult/) { get; set; } |  |
| [InnerException](../../system/exception/innerexception/) { get; } |  |
| virtual [Message](../../system/exception/message/) { get; } |  |
| virtual [Source](../../system/exception/source/) { get; set; } |  |
| virtual [StackTrace](../../system/exception/stacktrace/) { get; } |  |
| [TargetSite](../../system/exception/targetsite/) { get; } |  |

## Fields

| Name | Description |
| --- | --- |
| const [SVG_INVALID_VALUE_ERR](../../aspose.svg/svgexception/svg_invalid_value_err/) | Raised when an invalid value is passed to an operation or assigned to an attribute. |
| const [SVG_MATRIX_NOT_INVERTABLE](../../aspose.svg/svgexception/svg_matrix_not_invertable/) | Raised when an attempt is made to invert a matrix that is not invertible. |
| const [SVG_WRONG_TYPE_ERR](../../aspose.svg/svgexception/svg_wrong_type_err/) | Raised when an object of the wrong type is passed to an operation. |

### See Also

* class [PlatformException](../platformexception/)
* namespace [Aspose.Svg](../../aspose.svg/)
* assembly [Aspose.SVG](../../)
