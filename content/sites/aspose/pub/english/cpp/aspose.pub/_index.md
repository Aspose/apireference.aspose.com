---
title: Aspose::Pub namespace
linktitle: Aspose::Pub
second_title: Aspose.PUB for C++
description: 'How to use Aspose::Pub namespace in C++.'
type: docs
weight: 100
url: /cpp/aspose.pub/
---



## Classes

| Class | Description |
| --- | --- |
| [AssemblyConstants](./assemblyconstants/) | Defines the constants that participate in the license check for the component. These used to be defined directly as assembly attributes, but I moved them into separate class because in .NET Compact Framework I cannot access assembly attributes. Now the licensing code when compiled for the .NET Compact Framework uses these constants instead of the assembly attributes. |
| [BaseStyle](./basestyle/) | Declares base functionality for PUB styles. |
| [BuildVersionInfo](./buildversioninfo/) | This class provides information about current product build. |
| [DocSummaryInfo](./docsummaryinfo/) | [Document](./document/) summary info. |
| [Document](./document/) | Represents PUB document, holds all fields and relevant values. |
| [Fill](./fill/) |  |
| [FolderFontSource](./folderfontsource/) | Represents the folder that contains font files. |
| [FontSource](./fontsource/) | Represents a base class for font source. |
| [FontSubstitution](./fontsubstitution/) | Represents a class for a font substitution strategy based on font name. |
| [GradientFill](./gradientfill/) |  |
| [ImageFill](./imagefill/) |  |
| [IPdfConverter](./ipdfconverter/) | Declares functionality to convert PUB document into PDF document. |
| [IPubConverter](./ipubconverter/) | Declares functionality to convert PUB document into format specified. |
| [IPubPackageConverter](./ipubpackageconverter/) | Declares functionality for converting multiple Publisher documents to a specified format. |
| [IPubParser](./ipubparser/) | Declares functionality which parses publisher file and returns [Document](./document/) object as result of parsing. |
| [License](./license/) | Provides methods to license the component. |
| [MetaInfo](./metainfo/) | Base class for summary info objects. |
| [Metered](./metered/) | Provides methods to set metered key. |
| [MeteredBillingService](./meteredbillingservice/) | This internal class is used to handle customer's matered state. |
| [MeteredCountService](./meteredcountservice/) | This internal class is used to handle customer's consumption data, the unit is MB. |
| [PackageDocumentCollection](./packagedocumentcollection/) | Represents collection of Publisher documents for package conversion. |
| [PackageDocumentItem](./packagedocumentitem/) | Base class for Publisher document references for use in package conversions. Provides fields for specifying output source for the converted document - [OutputFileName](../) for a disk file and [OutputStream](../) for stream. Also provides conversion settings. |
| [PackageFileItem](./packagefileitem/) | Designed to reference a Publisher document via file in package conversions. |
| [PackageStreamItem](./packagestreamitem/) | Designed to reference a Publisher document via stream in package conversions. |
| [ParagraphStyle](./paragraphstyle/) | This class describes style of PUB paragraph. |
| [PatternFill](./patternfill/) |  |
| [PubEmbeddedFont](./pubembeddedfont/) |  |
| [PubFactory](./pubfactory/) | Factory for PUB objects. |
| [PubPackageConverter](./pubpackageconverter/) |  |
| [PubToPdfConversionOptions](./pubtopdfconversionoptions/) | Options for export to PDF format. |
| [SolidFill](./solidfill/) |  |
| [StopPoint](./stoppoint/) |  |
| [SummaryInfo](./summaryinfo/) | Summary info. |
| [TextGroup](./textgroup/) | Text group. |
| [TextParagraph](./textparagraph/) | Represents PUB text paragraph. |
| [TextPartDisplayParams](./textpartdisplayparams/) | Designed to hold text which sholud be displayed for end users. Cases like document 383.pub open a situation, when original text from Publisher document can't be displayed to end users without modifications. At current moment it's enough to simply hold modified version of original text, which differs from original only in unicode values, but next times could be cases when modified version will differ from original not only in unicodes but also in text length and something like this. If that cases come, this class should be modified to accomodate new requirements for displayed text. |
| [TextStyle](./textstyle/) | Describes PUB text style. |
## Enums

| Enum | Description |
| --- | --- |
| [AlignmentType](./alignmenttype/) | Type of alignment. |
| [FillTypes](./filltypes/) |  |
| [LineSpacingType](./linespacingtype/) | Type of line spacing. |
| [MeteredState](./meteredstate/) | Represents possible metered states. |
| [PubDocumentType](./pubdocumenttype/) | Represents storage type for document. |
| [PubExportFormats](./pubexportformats/) | Specifies format to export Publisher document. |
| [PubFormatVersion](./pubformatversion/) |  |
| [SuperscriptType](./superscripttype/) | Type of superscript. |
| [UnderlineType](./underlinetype/) | Underline type. |
