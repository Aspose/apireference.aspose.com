---
title: Aplatir les formulaires dans un document PDF
linktitle: Aplatir les formulaires dans un document PDF
second_title: Référence de l'API Aspose.PDF pour .NET
description: Aplatissez facilement les formulaires dans un document PDF à l'aide d'Aspose.PDF pour .NET.
type: docs
weight: 100
url: /fr/net/programming-with-forms/flatten-forms/
---
Dans ce didacticiel, nous allons vous montrer comment aplatir des formulaires à l'aide d'Aspose.PDF pour .NET. Nous expliquerons étape par étape le code source C # pour vous guider tout au long de ce processus.

## Étape 1 : Préparation

Assurez-vous d'abord d'avoir importé les bibliothèques nécessaires et de définir le chemin d'accès au répertoire des documents :

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Étape 2 : Charger le formulaire PDF source

Chargez le formulaire PDF source :

```csharp
Document doc = new Document(dataDir + "input.pdf");
```

## Étape 3 : Aplatir les formulaires

Vérifiez d'abord s'il y a des champs de formulaire dans le document. Si tel est le cas, parcourez chaque champ et appliquez l'aplatissement :

```csharp
if (doc.Form.Fields.Count() > 0)
{
foreach (var item in doc.Form.Fields)
{
item. Flatten();
}
}
```

## Étape 4 : Enregistrer le document mis à jour

Enregistrez le document PDF mis à jour :

```csharp
dataDir = dataDir + "FlattenForms_out.pdf";
doc.Save(dataDir);
```

### Exemple de code source pour Flatten Forms à l'aide d'Aspose.PDF pour .NET 
```csharp
// Chemin d'accès au répertoire des documents.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Charger le formulaire PDF source
Document doc = new Document(dataDir + "input.pdf");
// Aplatir les formulaires
if (doc.Form.Fields.Count() > 0)
{
	foreach (var item in doc.Form.Fields)
	{
		item.Flatten();
	}
}
dataDir = dataDir + "FlattenForms_out.pdf";
// Enregistrer le document mis à jour
doc.Save(dataDir);
Console.WriteLine("\nForms flattened successfully.\nFile saved at " + dataDir);
```

## Conclusion

Dans ce didacticiel, nous avons appris à aplatir des formulaires à l'aide d'Aspose.PDF pour .NET. En suivant ces étapes, vous pouvez facilement aplatir les formulaires de vos documents PDF, rendre les champs non modifiables et fusionner les annotations avec le contenu du document.

### FAQ

#### Q : Que signifie « aplatir les formulaires » dans Aspose.PDF pour .NET ?

R : L'aplatissement des formulaires dans Aspose.PDF pour .NET fait référence au processus consistant à rendre les champs de formulaire d'un document PDF non modifiables et à fusionner les annotations (telles que les champs de formulaire, les annotations et les signatures numériques) avec le contenu du document. Une fois les formulaires aplatis, les utilisateurs ne peuvent pas modifier les champs de formulaire et l'apparence visuelle des champs de formulaire devient une partie du contenu statique du document PDF.

#### Q : Puis-je inverser le processus d'aplatissement et rendre à nouveau les champs de formulaire modifiables ?

: Non, une fois les champs du formulaire aplatis, le processus est irréversible avec Aspose.PDF pour .NET. L'aplatissement fusionne de manière permanente l'apparence des champs de formulaire avec le contenu du PDF, et les éléments de champ de formulaire individuels ne sont plus accessibles ou modifiables.

#### Q : Quand dois-je aplatir les formulaires dans un document PDF ?

R : L'aplatissement des formulaires est utile lorsque vous souhaitez conserver l'aspect visuel des champs de formulaire et des annotations dans un document PDF tout en empêchant les utilisateurs de modifier les données. Cela se fait généralement lorsque vous souhaitez partager un document PDF avec des données de formulaire préremplies ou des annotations qui ne doivent pas être modifiées par les destinataires.

#### Q : L'aplatissement des formulaires affectera-t-il d'autres annotations, telles que les signatures numériques ?

R : Oui, les formulaires d'aplatissement fusionneront toutes les annotations, y compris les signatures numériques, avec le contenu du PDF. Une fois les formulaires aplatis, toutes les signatures numériques existantes deviendront une partie permanente du document et les utilisateurs ne pourront ni les modifier ni les supprimer.

#### Q : Puis-je aplatir de manière sélective des champs de formulaire spécifiques et laisser les autres modifiables ?

R : Oui, vous pouvez aplatir de manière sélective des champs de formulaire spécifiques dans un document PDF tout en laissant les autres modifiables. Au lieu d'utiliser le code pour aplatir tous les champs de formulaire, vous pouvez choisir d'aplatir uniquement les champs de formulaire souhaités en fonction de leurs noms ou d'autres critères.