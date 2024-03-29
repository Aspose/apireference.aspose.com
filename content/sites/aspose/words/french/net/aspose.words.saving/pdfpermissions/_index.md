---
title: PdfPermissions Enum
linktitle: PdfPermissions
articleTitle: PdfPermissions
second_title: Aspose.Words pour .NET
description: Aspose.Words.Saving.PdfPermissions énumération. Spécifie les opérations autorisées à un utilisateur sur un document PDF crypté en C#.
type: docs
weight: 5510
url: /fr/net/aspose.words.saving/pdfpermissions/
---
## PdfPermissions enumeration

Spécifie les opérations autorisées à un utilisateur sur un document PDF crypté.

```csharp
[Flags]
public enum PdfPermissions
```

### Valeurs

| Nom | Évaluer | La description |
| --- | --- | --- |
| DisallowAll | `0` | Interdit toutes les opérations sur le document PDF. Il s'agit de la valeur par défaut. |
| AllowAll | `FFFF` | Permet toutes les opérations sur le document PDF. |
| ContentCopy | `10` | Copier ou extraire du texte et des graphiques du document par des opérations autres que celles contrôlées parContentCopyForAccessibility . |
| ContentCopyForAccessibility | `200` | Extraire du texte et des graphiques (pour faciliter l'accessibilité aux utilisateurs handicapés ou à d'autres fins). |
| ModifyContents | `8` | Modifier le contenu du document par des opérations autres que celles contrôlées par ModifyAnnotations ,FillIn , etDocumentAssembly . |
| ModifyAnnotations | `20` | Ajoutez ou modifiez des annotations de texte, remplissez les champs du formulaire interactif et, siModifyContents is définit, crée ou modifie également les champs de formulaire interactifs (y compris les champs de signature). |
| FillIn | `100` | Remplissez les champs du formulaire interactif existants (y compris les champs de signature), même siModifyContents est clair. |
| DocumentAssembly | `400` | Assemblez le document (insérez, faites pivoter ou supprimez des pages et créez des éléments de plan du document ou des images miniatures ), même siModifyContents est clair. |
| Printing | `4` | Imprimez le document (peut-être pas au niveau de qualité le plus élevé, selon que HighResolutionPrinting est également défini). |
| HighResolutionPrinting | `804` | Imprimez le document sur une représentation à partir de laquelle une copie numérique fidèle du contenu PDF pourrait être générée , sur la base d'un algorithme dépendant de l'implémentation. Lorsque ce flag est vide (and Printing est défini), l'impression doit être limitée à une représentation de bas niveau de l'apparence, éventuellement de qualité dégradée. |

## Exemples

Montre comment définir les autorisations sur un document PDF enregistré.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Hello world!");

// Étendre les autorisations pour permettre la modification des annotations.
PdfEncryptionDetails encryptionDetails =
    new PdfEncryptionDetails("password", string.Empty, PdfPermissions.ModifyAnnotations | PdfPermissions.DocumentAssembly);

// Crée un objet "PdfSaveOptions" que l'on peut passer à la méthode "Save" du document
// pour modifier la façon dont cette méthode convertit le document en .PDF.
PdfSaveOptions saveOptions = new PdfSaveOptions();
// Activer le chiffrement via la propriété "EncryptionDetails".
saveOptions.EncryptionDetails = encryptionDetails;

// Lorsque nous ouvrirons ce document, nous devrons fournir le mot de passe avant d'accéder à son contenu.
doc.Save(ArtifactsDir + "PdfSaveOptions.EncryptionPermissions.pdf", saveOptions);
```

### Voir également

* espace de noms [Aspose.Words.Saving](../../aspose.words.saving/)
* Assemblée [Aspose.Words](../../)
