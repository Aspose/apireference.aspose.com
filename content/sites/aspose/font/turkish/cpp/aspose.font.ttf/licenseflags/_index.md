---
title: "Aspose::Font::Ttf::LicenseFlags sınıfı"
linktitle: "LicenseFlags"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Ttf::LicenseFlags sınıfı. C++'da ''OS/2'' tablosundan (fsType alanı) gömme bayrakları için yardımcı bir sarmalayıcı temsil eder."
type: docs
weight: 100
url: /tr/cpp/aspose.font.ttf/licenseflags/
---
## LicenseFlags class


‘OS/2’ tablosundaki gömme bayrakları (fsType alanı) için bir yardımcı sarmalayıcı temsil eder.

```cpp
class LicenseFlags : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_FSType](./get_fstype/)() const | OS/2 tablosundan ham fsType değerini alır veya bu alan tablo içinde yoksa 0 döndürür. |
| [get_FSTypeAbsent](./get_fstypeabsent/)() const | 'OS/2' tablosunda fsType bayrağı yoksa true döndürür. |
| [get_IsBitmapOnlyEmbedding](./get_isbitmaponlyembedding/)() | fsType'ın BitmapOnly gömmeye izin verip vermediğini algılar. |
| [get_IsEditableEmbedding](./get_iseditableembedding/)() | fsType'ın Düzenlenebilir gömmeye izin verip vermediğini algılar. |
| [get_IsInstallableEmbedding](./get_isinstallableembedding/)() | fsType'ın Yüklenebilir gömme olup olmadığını algılar. |
| [get_IsNoSubsettingEmbedding](./get_isnosubsettingembedding/)() | fsType'ın Alt Kümeleme Olmadan gömme izin verip vermediğini algılar. |
| [get_IsPreviewAndPrintEmbedding](./get_ispreviewandprintembedding/)() | fsType'ın Önizleme ve Yazdırma gömmesine izin verip vermediğini algılar. |
| [get_IsReservedType](./get_isreservedtype/)() | fsType için ayrılmış bit (bit 0)'ın ayarlanıp ayarlanmadığını algılar. |
| [get_IsRestrictedLicenseEmbedding](./get_isrestrictedlicenseembedding/)() | fsType'ın Kısıtlı [Lisans](../../aspose.font/license/) gömme olup olmadığını algılar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
