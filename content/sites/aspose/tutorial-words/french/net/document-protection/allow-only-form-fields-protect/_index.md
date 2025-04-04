---
title: Autoriser uniquement la protection des champs de formulaire
linktitle: Autoriser uniquement la protection des champs de formulaire
second_title: Référence de l'API Aspose.Words pour .NET
description: Apprenez à utiliser Aspose.Words pour .NET pour protéger les documents et autoriser uniquement la modification des champs de formulaire.
type: docs
weight: 10
url: /fr/net/document-protection/allow-only-form-fields-protect/
---

La protection des documents est une fonctionnalité essentielle lorsque vous travaillez avec des fichiers dans votre application C#. Avec la bibliothèque Aspose.Words pour .NET, vous pouvez facilement protéger vos documents et autoriser uniquement la modification des champs de formulaire. Dans ce guide étape par étape, nous vous expliquerons comment utiliser le code source C# pour autoriser uniquement la modification des champs de formulaire à l'aide de la fonctionnalité Autoriser uniquement la protection des champs de formulaire d'Aspose.Words pour .NET.

## Étape 1 : Définition du répertoire de documents

La première étape consiste à définir le répertoire de votre document. Vous devez spécifier le chemin où vous souhaitez enregistrer le document protégé. Par exemple :

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

Assurez-vous de remplacer "VOTRE RÉPERTOIRE DE DOCUMENTS" par le chemin d'accès réel à votre répertoire de documents.

## Étape 2 : Insertion de sections et de texte

Ensuite, vous devez insérer des sections et du texte dans votre document. Utilisez la classe DocumentBuilder fournie par Aspose.Words pour créer le contenu de votre document. Voici un exemple simple :

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Text added to a document.");
```

Dans cet exemple, nous créons un nouveau document vierge, puis utilisons DocumentBuilder pour ajouter une ligne de texte.

## Étape 3 : Activer la protection des documents

 La protection de document ne fonctionne que lorsque la protection de document est activée. Vous pouvez activer la protection des documents à l'aide de la`Protect` méthode de la classe Document. Voici comment:

```csharp
doc.Protect(ProtectionType.AllowOnlyFormFields, "password");
```

Dans cet exemple, nous activons la protection de document en spécifiant le type de protection `

AllowOnlyFormFields` et en définissant un mot de passe.

## Étape 4 : Autoriser uniquement les champs de formulaire

Maintenant que la protection des documents est activée, nous devons spécifier que seule la modification des champs de formulaire est autorisée. Cela garantit que les utilisateurs ne peuvent modifier que les parties du document qui sont des champs de formulaire. Voici comment:

```csharp
doc.Protect(ProtectionType.AllowOnlyFormFields, "password");
```

Assurez-vous de remplacer "mot de passe" par le mot de passe que vous avez défini précédemment.

## Étape 5 : Enregistrer le document protégé

Enfin, vous pouvez enregistrer le document protégé à l'aide de la`Save` méthode de la classe Document. Spécifiez le chemin d'accès complet au fichier et le nom de fichier souhaité. Par exemple :

```csharp
doc.Save(dataDir + "DocumentProtection.AllowOnlyFormFieldsProtect.docx");
```

Assurez-vous de remplacer "dataDir" par le chemin d'accès à votre répertoire de documents.

### Exemple de code source pour la fonction Autoriser uniquement les champs de formulaire à l'aide de Aspose.Words pour .NET

```csharp
// Chemin d'accès à votre répertoire de documents
string dataDir = "YOUR DOCUMENT DIRECTORY";

// Insérez deux sections avec du texte.
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Text added to a document.");

// Une protection de document ne fonctionne que lorsque la protection de document est activée et que seules les modifications dans les champs de formulaire sont autorisées.
doc.Protect(ProtectionType.AllowOnlyFormFields, "password");

// Enregistrez le document protégé.
doc.Save(dataDir + "DocumentProtection.AllowOnlyFormFieldsProtect.docx");
```

## Conclusion

Dans ce guide, nous avons exploré comment utiliser la bibliothèque Aspose.Words pour .NET pour protéger un document et autoriser uniquement la modification des champs de formulaire. En suivant les étapes fournies, vous pouvez facilement implémenter cette fonctionnalité dans votre application C#. La protection des documents est essentielle pour assurer la sécurité et la confidentialité de vos documents.
