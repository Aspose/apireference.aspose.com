---
title: Aspose::Font::Ttf::LicenseFlags class
linktitle: LicenseFlags
second_title: Aspose.Font for C++
description: 'Aspose::Font::Ttf::LicenseFlags class. Represents a helper wrapper for an embedding flags from ''OS/2'' table (field fsType) in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.ttf/licenseflags/
---
## LicenseFlags class


Represents a helper wrapper for an embedding flags from 'OS/2' table (field fsType).

```cpp
class LicenseFlags : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_FSType](./get_fstype/)() const | Gets raw fsType value from OS/2 table or 0 if this field doesn't exist in the table. |
| [get_FSTypeAbsent](./get_fstypeabsent/)() const | Returns true if fsType flag is absent in 'OS/2' table. |
| [get_IsBitmapOnlyEmbedding](./get_isbitmaponlyembedding/)() | Detects whether fsType permits BitmapOnly embedding. |
| [get_IsEditableEmbedding](./get_iseditableembedding/)() | Detects whether fsType permits Editable embedding. |
| [get_IsInstallableEmbedding](./get_isinstallableembedding/)() | Detects whether fsType is Installable embedding. |
| [get_IsNoSubsettingEmbedding](./get_isnosubsettingembedding/)() | Detects whether fsType permits NoSubsetting embedding. |
| [get_IsPreviewAndPrintEmbedding](./get_ispreviewandprintembedding/)() | Detects whether fsType permits Preview and Print embedding. |
| [get_IsReservedType](./get_isreservedtype/)() | Detects whether reserved bit(bit 0) is set for fsType. |
| [get_IsRestrictedLicenseEmbedding](./get_isrestrictedlicenseembedding/)() | Detects whether fsType is Restricted [License](../../aspose.font/license/) embedding. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
