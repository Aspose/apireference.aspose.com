---
title: Spécifier le niveau de liste
linktitle: Spécifier le niveau de liste
second_title: API de traitement de documents Aspose.Words
description: Découvrez comment spécifier le niveau de liste dans un document Word avec Aspose.Words pour .NET.
type: docs
weight: 10
url: /fr/net/working-with-list/specify-list-level/
---

Dans ce didacticiel étape par étape, nous allons vous montrer comment spécifier le niveau de liste dans un document Word à l'aide d'Aspose.Words pour .NET. Nous expliquerons le code source C# fourni et vous montrerons comment l'implémenter dans vos propres projets.

 Pour commencer, assurez-vous que Aspose.Words for .NET est installé et configuré dans votre environnement de développement. Si vous ne l'avez pas déjà fait, téléchargez et installez la bibliothèque depuis[Aspose.Releases]https://releases.aspose.com/words/net/.

## Étape 1 : Création du document et du générateur de documents

Tout d'abord, créez un nouveau document et un générateur de document associé :

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Étape 2 : Création et application d'une liste numérotée

Ensuite, créez une liste numérotée basée sur l'un des modèles de liste de Microsoft Word et appliquez-la au paragraphe actuel dans le générateur de documents :

```csharp
builder.ListFormat.List = doc.Lists.Add(ListTemplate.NumberArabicDot);
```

## Étape 3 : Spécification au niveau de la liste

 Utilisez le générateur de documents`ListLevelNumber` propriété pour spécifier le niveau de liste et ajouter du texte au paragraphe :

```csharp
for (int i = 0; i < 9; i++)
{
     builder.ListFormat.ListLevelNumber = i;
     builder.Writeln("Level " + i);
}
```

Répétez ces étapes pour spécifier les niveaux de liste et ajouter du texte à chaque niveau.

## Étape 4 : Création et application d'une liste à puces

Vous pouvez également créer et appliquer une liste à puces à l'aide de l'un des modèles de liste de Microsoft Word :

```csharp
builder.ListFormat.List = doc.Lists.Add(ListTemplate.BulletDiamonds);
```

## Étape 5 : Ajout de texte aux niveaux de liste à puces

 Utilisez le`ListLevelNumber` propriété à nouveau pour spécifier le niveau de liste à puces et ajouter du texte :

```csharp
for (int i = 0; i < 9; i++)
{
     builder.ListFormat.ListLevelNumber = i;
     builder.Writeln("Level " + i);
}
```

## Étape 6 : Arrêter le formatage de la liste

 Pour arrêter le formatage de la liste, définissez`null` au`List` propriété du générateur de documents :

```csharp
builder. ListFormat. List = null;
```

## Étape 7 : Sauvegarde du document modifié

Enregistrez le document modifié :

```csharp
builder.Document.Save(dataDir + "SpecifyListLevel.docx");
```

Donc ! Vous avez correctement spécifié le niveau de liste dans un document Word à l'aide d'Aspose.Words pour .NET.

### Exemple de code source pour spécifier le niveau de liste

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

//Créez une liste numérotée basée sur l'un des modèles de liste Microsoft Word
// et appliquez-le au paragraphe actuel du générateur de documents.
builder.ListFormat.List = doc.Lists.Add(ListTemplate.NumberArabicDot);

// Il y a neuf niveaux dans cette liste, essayons-les tous.
for (int i = 0; i < 9; i++)
{
	builder.ListFormat.ListLevelNumber = i;
	builder.Writeln("Level " + i);
}

// Créez une liste à puces basée sur l'un des modèles de liste Microsoft Word
// et appliquez-le au paragraphe actuel du générateur de documents.
builder.ListFormat.List = doc.Lists.Add(ListTemplate.BulletDiamonds);

for (int i = 0; i < 9; i++)
{
	builder.ListFormat.ListLevelNumber = i;
	builder.Writeln("Level " + i);
}

// C'est un moyen d'arrêter le formatage de la liste.
builder.ListFormat.List = null;

builder.Document.Save(dataDir + "WorkingWithList.SpecifyListLevel.docx");
            
```

### FAQ

#### Q : Comment puis-je spécifier le niveau de liste dans Aspose.Words ?

 R : Pour spécifier le niveau de liste dans Aspose.Words, vous devez créer une instance du`List` classe et donnez-lui une liste numérotée. Ensuite, vous pouvez utiliser le`Paragraph.ListFormat.ListLevelNumber` propriété pour spécifier le niveau de chaque élément de la liste. Vous pouvez associer cette liste à une section de votre document afin que les éléments de la liste aient le niveau souhaité.

#### Q : Est-il possible de modifier le format de numérotation des éléments de liste dans Aspose.Words ?

 R : Oui, vous pouvez modifier le format de numérotation des éléments de liste dans Aspose.Words. Le`ListLevel` la classe offre plusieurs propriétés pour cela, telles que`ListLevel.NumberFormat`, `ListLevel.NumberStyle`, `ListLevel.NumberPosition`, etc. Vous pouvez utiliser ces propriétés pour définir le format de numérotation des éléments de liste, tels que les chiffres arabes, les chiffres romains, les lettres, etc.

#### Q : Puis-je ajouter des niveaux supplémentaires à une liste numérotée dans Aspose.Words ?

 R : Oui, il est possible d'ajouter des niveaux supplémentaires à une liste numérotée dans Aspose.Words. Le`ListLevel` La classe vous permet de définir les propriétés de formatage pour chaque niveau de la liste. Vous pouvez définir des options telles que le préfixe, le suffixe, l'alignement, le retrait, etc. Cela vous permet de créer des listes avec plusieurs niveaux de hiérarchie.


