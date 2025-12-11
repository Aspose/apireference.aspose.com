---
title: Aspose::Font::TtfTables::TtfNameTable::NameId enum
linktitle: NameId
second_title: Aspose.Font for C++
description: 'Aspose::Font::TtfTables::TtfNameTable::NameId enum. Represents NameId in C++.'
type: docs
weight: 1600
url: /cpp/aspose.font.ttftables/ttfnametable/nameid/
---
## NameId enum


Represents [NameId](./).

```cpp
enum class NameId : uint16_t
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| CopyrightNotice | 0 | 0 Copyright notice. |
| FontFamily | 1 | 1 [Font](../../../aspose.font/font/) Family. This string is the [Font](../../../aspose.font/font/) family name the user sees on Macintosh platforms. |
| FontSubfamily | 2 | 2 [Font](../../../aspose.font/font/) Subfamily. This string is the [Font](../../../aspose.font/font/) family the user sees on Macintosh platforms. |
| UniqueFontId | 3 | 3 Unique subfamily identification (Apple spec). 3 Unique [Font](../../../aspose.font/font/) identifier (MS spec). |
| FullName | 4 | 4 Full name of the [Font](../../../aspose.font/font/). |
| Version | 5 | 5 Version of the name table. |
| PostScriptName | 6 | 6 PostScript name of the [Font](../../../aspose.font/font/). Note: A [Font](../../../aspose.font/font/) may have only one PostScript name and that name must be ASCII. |
| TrademarkNotice | 7 | 7 Trademark notice. |
| ManufacturerName | 8 | 8 Manufacturer name. |
| DesignerName | 9 | 9 Designer; name of the designer of the typeface. |
| Description | 10 | 10 Description; description of the typeface. Can contain revision information, usage recommendations, history, features, and so on. |
| UrlVendor | 11 | 11 URL of the [Font](../../../aspose.font/font/) vendor (with procotol, e.g., [http://](http://), [ftp://](ftp://)). If a unique serial number is embedded in the URL, it can be used to register the [Font](../../../aspose.font/font/). |
| UrlDesigner | 12 | 12 URL of the [Font](../../../aspose.font/font/) designer (with protocol, e.g., [http://](http://), [ftp://](ftp://)) |
| LicenseDescription | 13 | 13 [License](../../../aspose.font/license/) description; description of how the [Font](../../../aspose.font/font/) may be legally used, or different example scenarios for licensed use. This field should be written in plain language, not legalese. |
| LicenseInfoUrl | 14 | 14 [License](../../../aspose.font/license/) information URL, where additional licensing information can be found. |
| PreferredFamily | 16 | 15 Reserved 16 Preferred Family (Windows only); In Windows, the Family name is displayed in the [Font](../../../aspose.font/font/) menu; the Subfamily name is presented as the Style name. For historical reasons, [Font](../../../aspose.font/font/) families have contained a maximum of four styles, but [Font](../../../aspose.font/font/) designers may group more than four fonts to a single family. The Preferred Family and Preferred Subfamily IDs allow [Font](../../../aspose.font/font/) designers to include the preferred family/subfamily groupings. These IDs are only present if they are different from IDs 1 and 2. |
| PreferredSubfamily | 17 | 17 Preferred Subfamily (Windows only); In Windows, the Family name is displayed in the [Font](../../../aspose.font/font/) menu; the Subfamily name is presented as the Style name. For historical reasons, [Font](../../../aspose.font/font/) families have contained a maximum of four styles, but [Font](../../../aspose.font/font/) designers may group more than four fonts to a single family. The Preferred Family and Preferred Subfamily IDs allow [Font](../../../aspose.font/font/) designers to include the preferred family/subfamily groupings. These IDs are only present if they are different from IDs 1 and 2. |
| CompatibleFull | 18 | 18 Compatible Full (Macintosh only); On the Macintosh, the menu name is constructed using the [Font](../../../aspose.font/font/) resource. This usually matches the Full Name. If you want the name of the [Font](../../../aspose.font/font/) to appear differently than the Full Name, you can insert the Compatible Full Name in ID 18. This name is not used by the Mac OS itself, but may be used by application developers (e.g., Adobe). |
| SampleText | 19 | 19 Sample text. This can be the [Font](../../../aspose.font/font/) name, or any other text that the designer thinks is the best sample text to show what the [Font](../../../aspose.font/font/) looks like. |
| PostScriptCID | 20 | Its presence in a font means that the nameID 6 holds a PostScript font name that is meant to be used with the “composefont” invocation in order to invoke the font in a PostScript interpreter. |
| WwsFamilyName | 21 | Used to provide a WWS-conformant family name in case the entries for IDs 16 and 17 do not conform to the WWS model. |
| WwsSubfamilyName | 22 | Used in conjunction with ID 21, this ID provides a WWS-conformant subfamily name (reflecting only weight, width and slope attributes) in case the entries for IDs 16 and 17 do not conform to the WWS model. |
| LightBackground | 23 | This ID, if used in the CPAL table’s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a light background such as white. |
| DarkBackground | 24 | This ID, if used in the CPAL table’s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a dark background such as black. |
| VariationsPostScriptNamePrefix | 25 | If present in a variable font, it may be used as the family prefix in the PostScript Name Generation for Variation Fonts algorithm. |

## See Also

* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
