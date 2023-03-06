---
title: Class AbstractPath
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.AbstractPath classe. UnRésuméChemin est une classe de base pour les classes qui spécifient un emplacement unique dans un environnement similaire à un système de fichiers comme un système de fichiers local un stockage de fichiers distant ou une archive ZIP entre autres.
type: docs
weight: 10
url: /fr/net/aspose.gis/abstractpath/
---
## AbstractPath class

Un`RésuméChemin` est une classe de base pour les classes qui spécifient un emplacement unique dans un environnement similaire à un système de fichiers, comme un système de fichiers local, un stockage de fichiers distant ou une archive ZIP, entre autres.

```csharp
public abstract class AbstractPath
```

## Propriétés

| Nom | La description |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | Obtient une représentation sous forme de chaîne de l'emplacement de ce`RésuméChemin` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | Obtient un caractère de séparation utilisé pour séparer les niveaux de répertoire du[`Location`](./location/) chaîne. |

## Méthodes

| Nom | La description |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | Crée un`AbstractPath` qui représente un emplacement sur le système de fichiers local. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | Crée un`AbstractPath` deStream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | Combine ceci`AbstractPath` avec les composants de chemin spécifiés. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | Supprime un fichier pointé par ce chemin. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | Renvoie l'extension de ce`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | Renvoie le nom de fichier et l'extension de ce`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | Renvoie le nom de fichier de ce`AbstractPath` sans l'extension. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | Obtient une valeur indiquant si ce chemin pointe vers un fichier existant qui peut être ouvert en lecture. |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | Renvoie les chemins situés à l'intérieur de ce`RésuméChemin` , si c'est un répertoire. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | Ouvre ceci`RésuméChemin`sous forme de fichier. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | Renvoie un nouveau`AbstractPath` avec l'extension de fichier remplacée par la valeur spécifiée. |

### Remarques

Un`RésuméChemin` peut spécifier un emplacement sur un système de fichiers local, un emplacement sur un système de fichiers distant ou un stockage externe comme le stockage Azure Blob, etc. L'emplacement peut pointer vers des objets de type fichier existants ou non existants , des objets de type répertoire, ou avoir toute autre signification raisonnable pour l'environnement auquel il appartient. Par exemple, un`RésuméChemin` L'héritier qui représente un emplacement sur le système de fichiers local peut pointer vers un fichier, un répertoire ou un emplacement du système de fichiers qui n'a pas encore été créé. Afin de mettre un nouveau stockage de type système de fichiers à la disposition de`Aspose.GIS` il faut hériter de cette classe et implémenter ses méthodes abstraites.

### Voir également

* espace de noms [Aspose.Gis](../../aspose.gis/)
* Assemblée [Aspose.GIS](../../)


