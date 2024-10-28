---
title: Aspose::Font namespace
linktitle: Aspose::Font
second_title: Aspose.Font for C++
description: 'How to use Aspose::Font namespace in C++.'
type: docs
weight: 100
url: /cpp/aspose.font/
---



## Classes

| Class | Description |
| --- | --- |
| [AssemblyConstants](./assemblyconstants/) | Defines the constants that participate in the license check for the component. These used to be defined directly as assembly attributes, but I moved them into separate class because in .NET Compact Framework I cannot access assembly attributes. Now the licensing code when compiled for the .NET Compact Framework uses these constants instead of the assembly attributes. |
| [BuildVersionInfo](./buildversioninfo/) | Provides information about the current product name and version. |
| [CryptoProvider](./cryptoprovider/) |  |
| [Font](./font/) | Represents base [Font](./font/) class. |
| [FontBBox](./fontbbox/) | Represents [Font](./font/) bounding box (BBox). |
| [FontEnvironment](./fontenvironment/) | Provides information about the current environment and platform. |
| [FontFactory](./fontfactory/) | Contains functionality for opening fonts of different types and other methods for creating various objects. |
| [FontMetrics](./fontmetrics/) | Represents [Font](./font/) metrics. |
| [ICallbackOperationParams](./icallbackoperationparams/) | Designed to hold different parameters for scenarios when [ICallbackStartEndOperations](./icallbackstartendoperations/) interface is used. |
| [ICallbackStartEndOperations](./icallbackstartendoperations/) | Designed to be used in scenarios when some logic must be executed before start of method and after end of method. Parameters for [StartCallbackOperation(ICallbackOperationParams)](../) and [EndCallbackOperation(ICallbackOperationParams)](../) needed to be defined by classes which must inherit [ICallbackOperationParams](./icallbackoperationparams/) interface. |
| [IEncodingParameters](./iencodingparameters/) | [Common](../aspose.font.common/) interface to support encoding parameters. Some [Font](./font/) types can have multiple encoding algorithms/maps. So, this interface should be used to create concrete font encoding parameters. |
| [IFont](./ifont/) | Declares common functionality for all font formats. Implemented by [Font](./font/) classes. |
| [IFontDefinitionParser](./ifontdefinitionparser/) | [Common](../aspose.font.common/) interface for font file parsers. |
| [IFontEncoding](./ifontencoding/) | Defines an interface for [Font](./font/) encoding. |
| [IFontEnvironmentSettings](./ifontenvironmentsettings/) | Represents functionality related to settings which are common for all the Fonts, created by [Aspose.Font](./) library at current session. |
| [IFontMetrics](./ifontmetrics/) | Defines an interface for [Font](./font/) metrics tools. |
| [IFontRendering](./ifontrendering/) | Represents a [Font](./font/). |
| [IFontSaver](./ifontsaver/) | Defines an interface for [Font](./font/) save functionality. |
| [IFontSource](./ifontsource/) | represents a font source often it is a font collection example: ttc files, folders etc. |
| [IFontSubset](./ifontsubset/) | Represents font subset interface. |
| [IStreamFontParser](./istreamfontparser/) | Designed to parse fonts basing on stream bytes, which are provided by Stream object. |
| [ISupportsNameAddressing](./isupportsnameaddressing/) | Defines members that are specific to encodings that support glyph name addressing. |
| [IUnicodeList](./iunicodelist/) | Represents unicode list. |
| [License](./license/) | Provides methods to license the component. |
| [Metered](./metered/) | Provides methods to set metered key. |
| [MeteredBillingService](./meteredbillingservice/) | This internal class is used to handle customer's matered state. |
| [MeteredCountService](./meteredcountservice/) | This internal class is used to handle customer's consumption data, the unit is MB. |
| [MultiLanguageString](./multilanguagestring/) | Represents multi language string. |
| [NameToCodeMap](./nametocodemap/) | Represents name to code map. |
| [TransformationMatrix](./transformationmatrix/) | Represents 3x3 transformation matrix | A B 0 | | C D 0 | | TX TY 1 |. |
## Enums

| Enum | Description |
| --- | --- |
| [EditionType](./editiontype/) | Specifies the edition type of the license. |
| [FontSavingFormats](./fontsavingformats/) | Specifies [Font](./font/) type. |
| [FontStyle](./fontstyle/) | Specifies [Font](./font/) style. |
| [FontType](./fonttype/) | Specifies [Font](./font/) type. |
| [LicenseState](./licensestate/) | Represents possible license states. |
| [MeteredState](./meteredstate/) | Represents possible metered states. |
## Functions

| Function | Description |
| --- | --- |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
