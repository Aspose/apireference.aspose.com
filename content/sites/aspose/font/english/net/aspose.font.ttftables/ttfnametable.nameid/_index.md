---
title: Enum TtfNameTable.NameId
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.TtfTables.TtfNameTableNameId enum. Represents NameId
type: docs
weight: 1130
url: /net/aspose.font.ttftables/ttfnametable.nameid/
---
## TtfNameTable.NameId enumeration

Represents NameId.

```csharp
public enum NameId : ushort
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| CopyrightNotice | `0` | 0 Copyright notice. |
| FontFamily | `1` | 1 Font Family. This string is the Font family name the user sees on Macintosh platforms. |
| FontSubfamily | `2` | 2 Font Subfamily. This string is the Font family the user sees on Macintosh platforms. |
| UniqueFontId | `3` | 3 Unique subfamily identification (Apple spec). 3 Unique Font identifier (MS spec). |
| FullName | `4` | 4 Full name of the Font. |
| Version | `5` | 5 Version of the name table. |
| PostScriptName | `6` | 6 PostScript name of the Font. Note: A Font may have only one PostScript name and that name must be ASCII. |
| TrademarkNotice | `7` | 7 Trademark notice. |
| ManufacturerName | `8` | 8 Manufacturer name. |
| DesignerName | `9` | 9 Designer; name of the designer of the typeface. |
| Description | `10` | 10 Description; description of the typeface. Can contain revision information, usage recommendations, history, features, and so on. |
| UrlVendor | `11` | 11 URL of the Font vendor (with procotol, e.g., http://, ftp://). If a unique serial number is embedded in the URL, it can be used to register the Font. |
| UrlDesigner | `12` | 12 URL of the Font designer (with protocol, e.g., http://, ftp://) |
| LicenseDescription | `13` | 13 License description; description of how the Font may be legally used, or different example scenarios for licensed use. This field should be written in plain language, not legalese. |
| LicenseInfoUrl | `14` | 14 License information URL, where additional licensing information can be found. |
| PreferredFamily | `16` | 15 Reserved 16 Preferred Family (Windows only); In Windows, the Family name is displayed in the Font menu; the Subfamily name is presented as the Style name. For historical reasons, Font families have contained a maximum of four styles, but Font designers may group more than four fonts to a single family. The Preferred Family and Preferred Subfamily IDs allow Font designers to include the preferred family/subfamily groupings. These IDs are only present if they are different from IDs 1 and 2. |
| PreferredSubfamily | `17` | 17 Preferred Subfamily (Windows only); In Windows, the Family name is displayed in the Font menu; the Subfamily name is presented as the Style name. For historical reasons, Font families have contained a maximum of four styles, but Font designers may group more than four fonts to a single family. The Preferred Family and Preferred Subfamily IDs allow Font designers to include the preferred family/subfamily groupings. These IDs are only present if they are different from IDs 1 and 2. |
| CompatibleFull | `18` | 18 Compatible Full (Macintosh only); On the Macintosh, the menu name is constructed using the Font resource. This usually matches the Full Name. If you want the name of the Font to appear differently than the Full Name, you can insert the Compatible Full Name in ID 18. This name is not used by the Mac OS itself, but may be used by application developers (e.g., Adobe). |
| SampleText | `19` | 19 Sample text. This can be the Font name, or any other text that the designer thinks is the best sample text to show what the Font looks like. |
| PostScriptCID | `20` | Its presence in a font means that the nameID 6 holds a PostScript font name that is meant to be used with the “composefont” invocation in order to invoke the font in a PostScript interpreter |
| WwsFamilyName | `21` | Used to provide a WWS-conformant family name in case the entries for IDs 16 and 17 do not conform to the WWS model |
| WwsSubfamilyName | `22` | Used in conjunction with ID 21, this ID provides a WWS-conformant subfamily name (reflecting only weight, width and slope attributes) in case the entries for IDs 16 and 17 do not conform to the WWS model |
| LightBackground | `23` | This ID, if used in the CPAL table’s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a light background such as white |
| DarkBackground | `24` | This ID, if used in the CPAL table’s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a dark background such as black |
| VariationsPostScriptNamePrefix | `25` | If present in a variable font, it may be used as the family prefix in the PostScript Name Generation for Variation Fonts algorithm |

### See Also

* class [TtfNameTable](../ttfnametable/)
* namespace [Aspose.Font.TtfTables](../../aspose.font.ttftables/)
* assembly [Aspose.Font](../../)


