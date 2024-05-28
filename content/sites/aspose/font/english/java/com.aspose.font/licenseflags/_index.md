---
title: LicenseFlags
second_title: Aspose.Font for Java API Reference
description: Represents a helper wrapper for an embedding flags from OS/2 table field fsType.
type: docs
weight: 48
url: /java/com.aspose.font/licenseflags/
---
**Inheritance:**
java.lang.Object
```
public class LicenseFlags
```

Represents a helper wrapper for an embedding flags from 'OS/2' table (field fsType).
## Methods

| Method | Description |
| --- | --- |
| [getFSType()](#getFSType--) | Gets raw fsType value from OS/2 table or 0 if this field doesn't exist in the table. |
| [isInstallableEmbedding()](#isInstallableEmbedding--) | Detects whether fsType is Installable embedding. |
| [isRestrictedLicenseEmbedding()](#isRestrictedLicenseEmbedding--) | Detects whether fsType is Restricted License embedding. |
| [isPreviewAndPrintEmbedding()](#isPreviewAndPrintEmbedding--) | Detects whether fsType permits Preview and Print embedding. |
| [isEditableEmbedding()](#isEditableEmbedding--) | Detects whether fsType permits Editable embedding. |
| [isNoSubsettingEmbedding()](#isNoSubsettingEmbedding--) | Detects whether fsType permits NoSubsetting embedding. |
| [isBitmapOnlyEmbedding()](#isBitmapOnlyEmbedding--) | Detects whether fsType permits BitmapOnly embedding. |
| [isReservedType()](#isReservedType--) | Detects whether reserved bit(bit 0) is set for fsType. |
| [isFSTypeAbsent()](#isFSTypeAbsent--) | Returns true if fsType flag is absent in 'OS/2' table. |
### getFSType() {#getFSType--}
```
public int getFSType()
```


Gets raw fsType value from OS/2 table or 0 if this field doesn't exist in the table.

**Returns:**
int - Raw fsType value from OS/2 table or 0 if this field doesn't exist in the table.
### isInstallableEmbedding() {#isInstallableEmbedding--}
```
public boolean isInstallableEmbedding()
```


Detects whether fsType is Installable embedding.

**Returns:**
boolean - Detects whether fsType is Installable embedding.
### isRestrictedLicenseEmbedding() {#isRestrictedLicenseEmbedding--}
```
public boolean isRestrictedLicenseEmbedding()
```


Detects whether fsType is Restricted License embedding.

**Returns:**
boolean - Detects whether fsType is Restricted License embedding.
### isPreviewAndPrintEmbedding() {#isPreviewAndPrintEmbedding--}
```
public boolean isPreviewAndPrintEmbedding()
```


Detects whether fsType permits Preview and Print embedding.

**Returns:**
boolean - Detects whether fsType permits Preview and Print embedding.
### isEditableEmbedding() {#isEditableEmbedding--}
```
public boolean isEditableEmbedding()
```


Detects whether fsType permits Editable embedding.

**Returns:**
boolean - Detects whether fsType permits Editable embedding.
### isNoSubsettingEmbedding() {#isNoSubsettingEmbedding--}
```
public boolean isNoSubsettingEmbedding()
```


Detects whether fsType permits NoSubsetting embedding.

**Returns:**
boolean - Detects whether fsType permits NoSubsetting embedding.
### isBitmapOnlyEmbedding() {#isBitmapOnlyEmbedding--}
```
public boolean isBitmapOnlyEmbedding()
```


Detects whether fsType permits BitmapOnly embedding.

**Returns:**
boolean - Detects whether fsType permits BitmapOnly embedding.
### isReservedType() {#isReservedType--}
```
public boolean isReservedType()
```


Detects whether reserved bit(bit 0) is set for fsType.

**Returns:**
boolean - Detects whether reserved bit(bit 0) is set for fsType.
### isFSTypeAbsent() {#isFSTypeAbsent--}
```
public boolean isFSTypeAbsent()
```


Returns true if fsType flag is absent in 'OS/2' table.

**Returns:**
boolean - True if fsType flag is absent in 'OS/2' table.
