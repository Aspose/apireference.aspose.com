---
title: NameId
second_title: Aspose.Font for Java API Reference
description: Represents NameId enumeration.
type: docs
weight: 55
url: /java/com.aspose.font/nameid/
---
**Inheritance:**
java.lang.Object
```
public final class NameId
```

Represents NameId enumeration.
## Fields

| Field | Description |
| --- | --- |
| [CopyrightNotice](#CopyrightNotice) | 0 Copyright notice. |
| [FontFamily](#FontFamily) | 1 Font Family. |
| [FontSubfamily](#FontSubfamily) | 2 Font Subfamily. |
| [UniqueFontId](#UniqueFontId) | 3 Apple spec: Unique subfamily identification. 3 MS spec: Unique font identifier |
| [FullName](#FullName) | 4 Full name of the Font. |
| [Version](#Version) | 5 Version of the name table. |
| [PostScriptName](#PostScriptName) | 6 PostScript name of the Font. |
| [TrademarkNotice](#TrademarkNotice) | 7 Trademark notice. |
| [ManufacturerName](#ManufacturerName) | 8 Manufacturer name. |
| [DesignerName](#DesignerName) | 9 Designer; name of the designer of the typeface. |
| [Description](#Description) | 10 Description; description of the typeface. |
| [UrlVendor](#UrlVendor) | 11 URL of the Font vendor (with procotol, e.g., http://, ftp://). |
| [UrlDesigner](#UrlDesigner) | 12 URL of the Font designer (with protocol, e.g., http://, ftp://) |
| [LicenseDescription](#LicenseDescription) | 13 License description; description of how the Font may be legally used, or different example scenarios for licensed use. |
| [LicenseInfoUrl](#LicenseInfoUrl) | 14 License information URL, where additional licensing information can be found. |
| [PreferredFamily](#PreferredFamily) | 15 Reserved 16 Preferred Family (Windows only); In Windows, the Family name is displayed in the Font menu; the Subfamily name is presented as the Style name. |
| [PreferredSubfamily](#PreferredSubfamily) | 17 Preferred Subfamily (Windows only); In Windows, the Family name is displayed in the Font menu; the Subfamily name is presented as the Style name. |
| [CompatibleFull](#CompatibleFull) | 18 Compatible Full (Macintosh only); On the Macintosh, the menu name is constructed using the Font resource. |
| [SampleText](#SampleText) | 19 Sample text. |
| [PostScriptCID](#PostScriptCID) | Its presence in a font means that the nameID 6 holds a PostScript font name that is meant to be used with the \\u0432\\u0402\\u045acomposefont\\u0432\\u0402\\u045c invocation in order to invoke the font in a PostScript interpreter |
| [WwsFamilyName](#WwsFamilyName) | Used to provide a WWS-conformant family name in case the entries for IDs 16 and 17 do not conform to the WWS model |
| [WwsSubfamilyName](#WwsSubfamilyName) | Used in conjunction with ID 21, this ID provides a WWS-conformant subfamily name (reflecting only weight, width and slope attributes) in case the entries for IDs 16 and 17 do not conform to the WWS model |
| [LightBackground](#LightBackground) | This ID, if used in the CPAL table\\u0432\\u0402\\u2122s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a light background such as white |
| [DarkBackground](#DarkBackground) | This ID, if used in the CPAL table\\u0432\\u0402\\u2122s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a dark background such as black |
| [VariationsPostScriptNamePrefix](#VariationsPostScriptNamePrefix) | If present in a variable font, it may be used as the family prefix in the PostScript Name Generation for Variation Fonts algorithm |
## Methods

| Method | Description |
| --- | --- |
| [getId()](#getId--) |  |
| [fromId(int id)](#fromId-int-) |  |
| [toString()](#toString--) |  |
### CopyrightNotice {#CopyrightNotice}
```
public static final NameId CopyrightNotice
```


0 Copyright notice.

### FontFamily {#FontFamily}
```
public static final NameId FontFamily
```


1 Font Family. This string is the Font family name the user sees on Macintosh platforms.

### FontSubfamily {#FontSubfamily}
```
public static final NameId FontSubfamily
```


2 Font Subfamily. This string is the Font family the user sees on Macintosh platforms.

### UniqueFontId {#UniqueFontId}
```
public static final NameId UniqueFontId
```


3 Apple spec: Unique subfamily identification. 3 MS spec: Unique font identifier

### FullName {#FullName}
```
public static final NameId FullName
```


4 Full name of the Font.

### Version {#Version}
```
public static final NameId Version
```


5 Version of the name table.

### PostScriptName {#PostScriptName}
```
public static final NameId PostScriptName
```


6 PostScript name of the Font. Note: A Font may have only one PostScript name and that name must be ASCII.

### TrademarkNotice {#TrademarkNotice}
```
public static final NameId TrademarkNotice
```


7 Trademark notice.

### ManufacturerName {#ManufacturerName}
```
public static final NameId ManufacturerName
```


8 Manufacturer name.

### DesignerName {#DesignerName}
```
public static final NameId DesignerName
```


9 Designer; name of the designer of the typeface.

### Description {#Description}
```
public static final NameId Description
```


10 Description; description of the typeface. Can contain revision information, usage recommendations, history, features, and so on.

### UrlVendor {#UrlVendor}
```
public static final NameId UrlVendor
```


11 URL of the Font vendor (with procotol, e.g., http://, ftp://). If a unique serial number is embedded in the URL, it can be used to register the Font.

### UrlDesigner {#UrlDesigner}
```
public static final NameId UrlDesigner
```


12 URL of the Font designer (with protocol, e.g., http://, ftp://)

### LicenseDescription {#LicenseDescription}
```
public static final NameId LicenseDescription
```


13 License description; description of how the Font may be legally used, or different example scenarios for licensed use. This field should be written in plain language, not legalese.

### LicenseInfoUrl {#LicenseInfoUrl}
```
public static final NameId LicenseInfoUrl
```


14 License information URL, where additional licensing information can be found.

### PreferredFamily {#PreferredFamily}
```
public static final NameId PreferredFamily
```


15 Reserved 16 Preferred Family (Windows only); In Windows, the Family name is displayed in the Font menu; the Subfamily name is presented as the Style name. For historical reasons, Font families have contained a maximum of four styles, but font designers may group more than four fonts to a single family. The Preferred Family and Preferred Subfamily IDs allow Font designers to include the preferred family/subfamily groupings. These IDs are only present if they are different from IDs 1 and 2.

### PreferredSubfamily {#PreferredSubfamily}
```
public static final NameId PreferredSubfamily
```


17 Preferred Subfamily (Windows only); In Windows, the Family name is displayed in the Font menu; the Subfamily name is presented as the Style name. For historical reasons, Font families have contained a maximum of four styles, but font designers may group more than four fonts to a single family. The Preferred Family and Preferred Subfamily IDs allow Font designers to include the preferred family/subfamily groupings. These IDs are only present if they are different from IDs 1 and 2.

### CompatibleFull {#CompatibleFull}
```
public static final NameId CompatibleFull
```


18 Compatible Full (Macintosh only); On the Macintosh, the menu name is constructed using the Font resource. This usually matches the Full Name. If you want the name of the Font to appear differently than the Full Name, you can insert the Compatible Full Name in ID 18. This name is not used by the Mac OS itself, but may be used by application developers (e.g., Adobe).

### SampleText {#SampleText}
```
public static final NameId SampleText
```


19 Sample text. This can be the Font name, or any other text that the designer thinks is the best sample text to show what the font looks like.

### PostScriptCID {#PostScriptCID}
```
public static final NameId PostScriptCID
```


Its presence in a font means that the nameID 6 holds a PostScript font name that is meant to be used with the \\u0432\\u0402\\u045acomposefont\\u0432\\u0402\\u045c invocation in order to invoke the font in a PostScript interpreter

### WwsFamilyName {#WwsFamilyName}
```
public static final NameId WwsFamilyName
```


Used to provide a WWS-conformant family name in case the entries for IDs 16 and 17 do not conform to the WWS model

### WwsSubfamilyName {#WwsSubfamilyName}
```
public static final NameId WwsSubfamilyName
```


Used in conjunction with ID 21, this ID provides a WWS-conformant subfamily name (reflecting only weight, width and slope attributes) in case the entries for IDs 16 and 17 do not conform to the WWS model

### LightBackground {#LightBackground}
```
public static final NameId LightBackground
```


This ID, if used in the CPAL table\\u0432\\u0402\\u2122s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a light background such as white

### DarkBackground {#DarkBackground}
```
public static final NameId DarkBackground
```


This ID, if used in the CPAL table\\u0432\\u0402\\u2122s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a dark background such as black

### VariationsPostScriptNamePrefix {#VariationsPostScriptNamePrefix}
```
public static final NameId VariationsPostScriptNamePrefix
```


If present in a variable font, it may be used as the family prefix in the PostScript Name Generation for Variation Fonts algorithm

### getId() {#getId--}
```
public int getId()
```




**Returns:**
int
### fromId(int id) {#fromId-int-}
```
public static NameId fromId(int id)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | int |  |

**Returns:**
[NameId](../../com.aspose.font/nameid)
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
