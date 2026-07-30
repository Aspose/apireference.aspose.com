---
title: "classe Aspose::Font::Ttf::LicenseFlags"
linktitle: "LicenseFlags"
second_title: "Aspose.Font pour C++"
description: "classe Aspose::Font::Ttf::LicenseFlags. Représente un wrapper d'aide pour les drapeaux d'incorporation provenant de la table ''OS/2'' (champ fsType) en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.font.ttf/licenseflags/
---
## LicenseFlags class


Représente un wrapper d'aide pour les indicateurs d'intégration provenant de la table 'OS/2' (champ fsType).

```cpp
class LicenseFlags : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_FSType](./get_fstype/)() const | Obtient la valeur brute de fsType de la table OS/2 ou 0 si ce champ n'existe pas dans la table. |
| [get_FSTypeAbsent](./get_fstypeabsent/)() const | Renvoie vrai si le drapeau fsType est absent dans la table 'OS/2'. |
| [get_IsBitmapOnlyEmbedding](./get_isbitmaponlyembedding/)() | Détecte si fsType autorise l'incorporation BitmapOnly. |
| [get_IsEditableEmbedding](./get_iseditableembedding/)() | Détecte si le fsType autorise l’intégration modifiable. |
| [get_IsInstallableEmbedding](./get_isinstallableembedding/)() | Détecte si le fsType est une intégration installable. |
| [get_IsNoSubsettingEmbedding](./get_isnosubsettingembedding/)() | Détecte si le fsType autorise l’intégration sans sous-ensemble. |
| [get_IsPreviewAndPrintEmbedding](./get_ispreviewandprintembedding/)() | Détecte si le fsType autorise l’intégration d’aperçu et d’impression. |
| [get_IsReservedType](./get_isreservedtype/)() | Détecte si le bit réservé (bit 0) est défini pour le fsType. |
| [get_IsRestrictedLicenseEmbedding](./get_isrestrictedlicenseembedding/)() | Détecte si le fsType est une intégration restreinte [License](../../aspose.font/license/). |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
