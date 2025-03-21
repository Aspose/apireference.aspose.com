---
title: Code de champ
linktitle: Code de champ
second_title: Référence de l'API Aspose.Words pour .NET
description: Guide étape par étape pour obtenir le code de champ et le résultat de champ dans vos documents Word avec Aspose.Words pour .NET.
type: docs
weight: 10
url: /fr/net/working-with-fields/field-code/
---

Voici un guide étape par étape pour expliquer le code source C# ci-dessous, qui utilise la fonctionnalité "Obtenir le code de champ" d'Aspose.Words pour .NET. Assurez-vous de suivre attentivement chaque étape pour obtenir les résultats souhaités.

## Étape 1 : configuration du répertoire de documents

Dans le code fourni, vous devez spécifier le répertoire de vos documents. Remplacez la valeur "VOTRE RÉPERTOIRE DE DOCUMENTS" par le chemin approprié vers votre répertoire de documents.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Étape 2 : Chargement du document

La première étape consiste à télécharger le document où vous souhaitez obtenir les codes de champ.

```csharp
Document doc = new Document(dataDir + "Hyperlinks.docx");
```

Assurez-vous de remplacer "Hyperlinks.docx" par le nom de votre propre fichier.

## Étape 3 : parcourir les champs du document

 Nous utilisons un`foreach` loop pour parcourir tous les champs présents dans le document.

```csharp
foreach(Field field in doc.Range.Fields)
{
     string fieldCode = field.GetFieldCode();
     string fieldResult = field.Result;
}
```

 A chaque itération de la boucle, on récupère le code du champ à l'aide de la`GetFieldCode()` méthode. Nous stockons également le résultat du champ dans une variable.

### Exemple de code source pour obtenir le code de champ avec Aspose.Words pour .NET

```csharp
// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Chargez le document.
Document doc = new Document(dataDir + "Hyperlinks.docx");

// Parcourez les champs du document.
foreach(Field field in doc.Range.Fields)
{
     string fieldCode = field.GetFieldCode();
     string fieldResult = field.Result;

     // Faites quelque chose avec le code et le résultat du champ.
}
```

Dans cet exemple, nous avons chargé un document, puis parcouru tous les champs présents dans le document. A chaque itération, on récupère le code et le résultat du champ. Vous pouvez ajouter votre propre logique pour traiter le code et les champs de résultat selon vos besoins.

Ceci conclut notre guide sur l'utilisation de la fonctionnalité "Obtenir le code de champ" avec Aspose.Words pour .NET.