---
title: "Aspose::Font::Ttf::LicenseFlags class"
linktitle: "LicenseFlags"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::Ttf::LicenseFlags class. Rappresenta un wrapper di supporto per i flag di incorporamento dalla tabella ''OS/2'' (campo fsType) in C++."
type: docs
weight: 100
url: /it/cpp/aspose.font.ttf/licenseflags/
---
## LicenseFlags class


Rappresenta un wrapper di supporto per i flag di incorporamento dalla tabella 'OS/2' (campo fsType).

```cpp
class LicenseFlags : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_FSType](./get_fstype/)() const | Restituisce il valore grezzo fsType dalla tabella OS/2 o 0 se questo campo non esiste nella tabella. |
| [get_FSTypeAbsent](./get_fstypeabsent/)() const | Restituisce true se il flag fsType è assente nella tabella 'OS/2'. |
| [get_IsBitmapOnlyEmbedding](./get_isbitmaponlyembedding/)() | Rileva se fsType consente l'incorporamento BitmapOnly. |
| [get_IsEditableEmbedding](./get_iseditableembedding/)() | Rileva se fsType consente l'incorporamento modificabile. |
| [get_IsInstallableEmbedding](./get_isinstallableembedding/)() | Rileva se fsType è un'incorporamento installabile. |
| [get_IsNoSubsettingEmbedding](./get_isnosubsettingembedding/)() | Rileva se fsType consente l'incorporamento NoSubsetting. |
| [get_IsPreviewAndPrintEmbedding](./get_ispreviewandprintembedding/)() | Rileva se fsType consente l'incorporamento di anteprima e stampa. |
| [get_IsReservedType](./get_isreservedtype/)() | Rileva se il bit riservato (bit 0) è impostato per fsType. |
| [get_IsRestrictedLicenseEmbedding](./get_isrestrictedlicenseembedding/)() | Rileva se fsType è un'incorporamento limitato [License](../../aspose.font/license/). |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
