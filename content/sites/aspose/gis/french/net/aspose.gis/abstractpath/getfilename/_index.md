---
title: AbstractPath.GetFileName
second_title: Référence de l'API Aspose.GIS pour .NET
description: AbstractPath méthode. Renvoie le nom de fichier et lextension de ceAbstractPath .
type: docs
weight: 80
url: /fr/net/aspose.gis/abstractpath/getfilename/
---
## AbstractPath.GetFileName method

Renvoie le nom de fichier et l'extension de ce[`AbstractPath`](../) .

```csharp
public string GetFileName()
```

### Return_Value

Les caractères après le dernier[`Separator`](../separator/) personnage dans le[`Location`](../location/) . Si le dernier caractère est le[`Separator`](../separator/) caractère, une chaîne vide est renvoyée. S'il n'y a pas [`Separator`](../separator/) personnages dans le[`Location`](../location/) , le[`Location`](../location/) lui-même est renvoyé.

### Exemples

Pour un`RésuméChemin` avec[`Location`](../location/) égal à`"/répertoire/fichier.txt"` et[`Separator`](../separator/) égal à`/'` , cette méthode retourne`"fichier.txt"` .

### Voir également

* class [AbstractPath](../)
* espace de noms [Aspose.Gis](../../abstractpath/)
* Assemblée [Aspose.GIS](../../../)


