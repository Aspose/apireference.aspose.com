---
title: NameId
second_title: Aspose.Font for Java API Reference
description: Represents NameId enumeration.
type: docs
weight: 66
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
| [CompatibleFull](#CompatibleFull) | 18 Compatible Full (Macintosh only); On the Macintosh, the menu name is constructed using the Font resource. |
| [CopyrightNotice](#CopyrightNotice) | 0 Copyright notice. |
| [DarkBackground](#DarkBackground) | This ID, if used in the CPAL table\\u2019s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a dark background such as black |
| [Description](#Description) | 10 Description; description of the typeface. |
| [DesignerName](#DesignerName) | 9 Designer; name of the designer of the typeface. |
| [FontFamily](#FontFamily) | 1 Font Family. |
| [FontSubfamily](#FontSubfamily) | 2 Font Subfamily. |
| [FullName](#FullName) | 4 Full name of the Font. |
| [LicenseDescription](#LicenseDescription) | 13 License description; description of how the Font may be legally used, or different example scenarios for licensed use. |
| [LicenseInfoUrl](#LicenseInfoUrl) | 14 License information URL, where additional licensing information can be found. |
| [LightBackground](#LightBackground) | This ID, if used in the CPAL table\\u2019s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a light background such as white |
| [ManufacturerName](#ManufacturerName) | 8 Manufacturer name. |
| [PostScriptCID](#PostScriptCID) | Its presence in a font means that the nameID 6 holds a PostScript font name that is meant to be used with the \\u201ccomposefont\\u201d invocation in order to invoke the font in a PostScript interpreter |
| [PostScriptName](#PostScriptName) | 6 PostScript name of the Font. |
| [PreferredFamily](#PreferredFamily) | 15 Reserved 16 Preferred Family (Windows only); In Windows, the Family name is displayed in the Font menu; the Subfamily name is presented as the Style name. |
| [PreferredSubfamily](#PreferredSubfamily) | 17 Preferred Subfamily (Windows only); In Windows, the Family name is displayed in the Font menu; the Subfamily name is presented as the Style name. |
| [SampleText](#SampleText) | 19 Sample text. |
| [TrademarkNotice](#TrademarkNotice) | 7 Trademark notice. |
| [UniqueFontId](#UniqueFontId) | 3 Apple spec: Unique subfamily identification. 3 MS spec: Unique font identifier |
| [UrlDesigner](#UrlDesigner) | 12 URL of the Font designer (with protocol, e.g., http://, ftp://) |
| [UrlVendor](#UrlVendor) | 11 URL of the Font vendor (with procotol, e.g., http://, ftp://). |
| [VariationsPostScriptNamePrefix](#VariationsPostScriptNamePrefix) | If present in a variable font, it may be used as the family prefix in the PostScript Name Generation for Variation Fonts algorithm |
| [Version](#Version) | 5 Version of the name table. |
| [WwsFamilyName](#WwsFamilyName) | Used to provide a WWS-conformant family name in case the entries for IDs 16 and 17 do not conform to the WWS model |
| [WwsSubfamilyName](#WwsSubfamilyName) | Used in conjunction with ID 21, this ID provides a WWS-conformant subfamily name (reflecting only weight, width and slope attributes) in case the entries for IDs 16 and 17 do not conform to the WWS model |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromId(int id)](#fromId-int-) | Creates a name id out of an integer value. |
| [getClass()](#getClass--) |  |
| [getId()](#getId--) | Get the integer value. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompatibleFull {#CompatibleFull}
```
public static final NameId CompatibleFull
```


18 Compatible Full (Macintosh only); On the Macintosh, the menu name is constructed using the Font resource. This usually matches the Full Name. If you want the name of the Font to appear differently than the Full Name, you can insert the Compatible Full Name in ID 18. This name is not used by the Mac OS itself, but may be used by application developers (e.g., Adobe).

### CopyrightNotice {#CopyrightNotice}
```
public static final NameId CopyrightNotice
```


0 Copyright notice.

### DarkBackground {#DarkBackground}
```
public static final NameId DarkBackground
```


This ID, if used in the CPAL table\\u2019s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a dark background such as black

### Description {#Description}
```
public static final NameId Description
```


10 Description; description of the typeface. Can contain revision information, usage recommendations, history, features, and so on.

### DesignerName {#DesignerName}
```
public static final NameId DesignerName
```


9 Designer; name of the designer of the typeface.

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

### FullName {#FullName}
```
public static final NameId FullName
```


4 Full name of the Font.

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

### LightBackground {#LightBackground}
```
public static final NameId LightBackground
```


This ID, if used in the CPAL table\\u2019s Palette Labels Array, specifies that the corresponding color palette in the CPAL table is appropriate to use with the font when displaying it on a light background such as white

### ManufacturerName {#ManufacturerName}
```
public static final NameId ManufacturerName
```


8 Manufacturer name.

### PostScriptCID {#PostScriptCID}
```
public static final NameId PostScriptCID
```


Its presence in a font means that the nameID 6 holds a PostScript font name that is meant to be used with the \\u201ccomposefont\\u201d invocation in order to invoke the font in a PostScript interpreter

### PostScriptName {#PostScriptName}
```
public static final NameId PostScriptName
```


6 PostScript name of the Font. Note: A Font may have only one PostScript name and that name must be ASCII.

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

### SampleText {#SampleText}
```
public static final NameId SampleText
```


19 Sample text. This can be the Font name, or any other text that the designer thinks is the best sample text to show what the font looks like.

### TrademarkNotice {#TrademarkNotice}
```
public static final NameId TrademarkNotice
```


7 Trademark notice.

### UniqueFontId {#UniqueFontId}
```
public static final NameId UniqueFontId
```


3 Apple spec: Unique subfamily identification. 3 MS spec: Unique font identifier

### UrlDesigner {#UrlDesigner}
```
public static final NameId UrlDesigner
```


12 URL of the Font designer (with protocol, e.g., http://, ftp://)

### UrlVendor {#UrlVendor}
```
public static final NameId UrlVendor
```


11 URL of the Font vendor (with procotol, e.g., http://, ftp://). If a unique serial number is embedded in the URL, it can be used to register the Font.

### VariationsPostScriptNamePrefix {#VariationsPostScriptNamePrefix}
```
public static final NameId VariationsPostScriptNamePrefix
```


If present in a variable font, it may be used as the family prefix in the PostScript Name Generation for Variation Fonts algorithm

### Version {#Version}
```
public static final NameId Version
```


5 Version of the name table.

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

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fromId(int id) {#fromId-int-}
```
public static NameId fromId(int id)
```


Creates a name id out of an integer value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | int | An integer value. |

**Returns:**
[NameId](../../com.aspose.font/nameid) - The name id.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getId() {#getId--}
```
public int getId()
```


Get the integer value.

**Returns:**
int - The integer value.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

