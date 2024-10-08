---
title: Recevoir des notifications de polices
linktitle: Recevoir des notifications de polices
second_title: Référence de l'API Aspose.Words pour .NET
description: Découvrez comment recevoir des notifications de polices manquantes ou remplacées lors de l'utilisation d'Aspose.Words pour .NET.
type: docs
weight: 10
url: /fr/net/working-with-fonts/receive-notifications-of-fonts/
---

Dans ce didacticiel, nous vous expliquerons comment recevoir des notifications de polices lors de l'utilisation d'Aspose.Words pour .NET. Les notifications de police vous permettent de détecter et de gérer les polices manquantes ou remplacées dans vos documents. Nous vous guiderons étape par étape pour vous aider à comprendre et à implémenter le code dans votre projet .NET.

## Conditions préalables
Avant de commencer, assurez-vous d'avoir les éléments suivants :
- Une connaissance pratique du langage de programmation C#
- La bibliothèque Aspose.Words pour .NET installée dans votre projet

## Étape 1 : Définir le répertoire des documents
 Tout d'abord, vous devez définir le chemin du répertoire vers l'emplacement de votre document Word. Remplacer`"YOUR DOCUMENT DIRECTORY"` dans le code avec le chemin approprié.

```csharp
// Chemin d'accès à votre répertoire de documents
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Étape 2 : chargez le document et configurez les paramètres de police
 Ensuite, nous allons charger le document en utilisant le`Document` classe et configurez les paramètres de police à l'aide de la`FontSettings` classe. Nous définirons la police par défaut à utiliser en cas de polices manquantes.

```csharp
//Charger le document et configurer les paramètres de police
Document doc = new Document(dataDir + "Rendering.docx");
FontSettings fontSettings = new FontSettings();
fontSettings.SubstitutionSettings.DefaultFontSubstitution.DefaultFontName = "Arial";
```

## Étape 3 : Définir le gestionnaire de notification
 Ensuite, nous allons définir un gestionnaire de notification en implémentant le`IWarningCallback` interface. Cela nous permettra de collecter les avertissements de police lors de l'enregistrement du document.

```csharp
// Définir le gestionnaire de notification
HandleDocumentWarnings callback = new HandleDocumentWarnings();
doc. WarningCallback = callback;
```

## Étape 4 : Appliquer les paramètres de police et enregistrer le document
Enfin, nous appliquerons les paramètres de police au document et l'enregistrerons. Tous les avertissements de police seront capturés par le gestionnaire de notification que nous avons défini précédemment.

```csharp
// Appliquer les paramètres de police et enregistrer le document
doc.FontSettings = fontSettings;
doc.Save(dataDir + "WorkingWithFonts.ReceiveNotificationsOfFonts.pdf");
```

### Exemple de code source pour recevoir des notifications de polices à l'aide d'Aspose.Words pour .NET 
```csharp

// Chemin d'accès à votre répertoire de documents
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document(dataDir + "Rendering.docx");
FontSettings fontSettings = new FontSettings();
// Nous pouvons choisir la police par défaut à utiliser dans le cas de polices manquantes.
fontSettings.SubstitutionSettings.DefaultFontSubstitution.DefaultFontName = "Arial";
// Pour les tests, nous allons configurer Aspose.Words pour rechercher les polices uniquement dans un dossier qui n'existe pas. Depuis Aspose.Words ne sera pas
// trouver toutes les polices dans le répertoire spécifié, puis lors du rendu, les polices du document seront sous-adaptées à la valeur par défaut
//police spécifiée sous FontSettings.DefaultFontName. Nous pouvons reprendre cette sous-suite en utilisant notre rappel.
fontSettings.SetFontsFolder(string.Empty, false);
// Créez une nouvelle classe implémentant IWarningCallback qui collecte tous les avertissements générés lors de l'enregistrement du document.
HandleDocumentWarnings callback = new HandleDocumentWarnings();
doc.WarningCallback = callback;
doc.FontSettings = fontSettings;
doc.Save(dataDir + "WorkingWithFonts.ReceiveNotificationsOfFonts.pdf");

```

## Conclusion
Dans ce didacticiel, nous avons vu comment recevoir des notifications de police lors de l'utilisation d'Aspose.Words pour .NET. Les notifications de police vous permettent de détecter et de gérer les polices manquantes ou remplacées dans vos documents. Utilisez cette fonctionnalité pour assurer la cohérence des polices dans vos documents et prendre les mesures appropriées en cas de polices manquantes.
