---
title: LoadingStreamBehavior
second_title: Référence de l'API Aspose.Slides pour .NET
description: LeStream passé à une méthode est considéré comme un grand objet binaire BLOB voir IBlobManagementOptions./iblobmanagementoptions la description. Les valeurs de cette énumération identifient comment leStream doit être traité lorsquil est passé à la méthode. En fonction des exigences  différentes décisions peuvent être prises pour fournir le comportement le plus efficace.
type: docs
weight: 7180
url: /fr/net/aspose.slides/loadingstreambehavior/
---
## LoadingStreamBehavior enumeration

LeStream passé à une méthode est considéré comme un grand objet binaire (BLOB) (voir [`IBlobManagementOptions`](../iblobmanagementoptions) la description). Les valeurs de cette énumération identifient comment leStream doit être traité lorsqu'il est passé à la méthode. En fonction des exigences , différentes décisions peuvent être prises pour fournir le comportement le plus efficace.

```csharp
public enum LoadingStreamBehavior
```

### Valeurs

| Nom | Évaluer | La description |
| --- | --- | --- |
| ReadStreamAndRelease | `0` | Le flux sera lu jusqu'au bout puis libéré - c'est-à-dire qu'il sera garanti que ce flux ne sera pas utilisé par[`IPresentation`](../ipresentation)exemple à l'avenir. Il peut être fermé par le code client ou utilisé de toute autre manière. |
| KeepLocked | `1` | Le flux sera verrouillé à l'intérieur du[`IPresentation`](../ipresentation) objet, c'est-à-dire que la propriété de le flux sera transférée. La[`IPresentation`](../ipresentation) l'objet sera responsable de disposer correctement le flux lorsque cet objet sera lui-même disposé. Ce comportement est extrêmement utile lorsque vous avez besoin de sérialiser un gros fichier BLOB (comme un gros fichier vidéo ou audio - voir[`IBlobManagementOptions`](../iblobmanagementoptions) description) et que vous souhaitez empêcher le chargement de ce fichier dans la mémoire ou d'autres problèmes de performances. Vous pouvez simplement ouvrir leFileStream pour ce fichier et passez à une méthode en choisissantKeepLocked LoadingStreamBehavior. |

### Voir également

* espace de noms [Aspose.Slides](../../aspose.slides)
* Assemblée [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
