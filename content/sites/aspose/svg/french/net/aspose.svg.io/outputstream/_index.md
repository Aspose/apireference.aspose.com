---
title: Class OutputStream
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.IO.OutputStream classe. Un flux de substitution enveloppe le flux de sortie réel et en contrôle laccès. OutputStream contient des données URI décrivant lemplacement du flux de sortie.
type: docs
weight: 1980
url: /fr/net/aspose.svg.io/outputstream/
---
## OutputStream class

Un flux de substitution enveloppe le flux de sortie réel et en contrôle l'accès. `OutputStream` contient des données URI décrivant l'emplacement du flux de sortie.

```csharp
public class OutputStream : Stream
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [OutputStream](outputstream/)(Stream, string) | Initialise une nouvelle instance du`OutputStream` classe. |

## Propriétés

| Nom | La description |
| --- | --- |
| override [CanRead](../../aspose.svg.io/outputstream/canread/) { get; } | Obtient une valeur indiquant si le flux de sortie encapsulé prend en charge la lecture. |
| override [CanSeek](../../aspose.svg.io/outputstream/canseek/) { get; } | Obtient une valeur indiquant si le flux de sortie encapsulé prend en charge la recherche. |
| override [CanWrite](../../aspose.svg.io/outputstream/canwrite/) { get; } | Obtient une valeur indiquant si le flux de sortie encapsulé prend en charge l'écriture. |
| override [Length](../../aspose.svg.io/outputstream/length/) { get; } | Obtient la longueur en octets du flux de sortie enveloppé. |
| override [Position](../../aspose.svg.io/outputstream/position/) { get; set; } | Obtient ou définit la position dans le flux de sortie encapsulé. |
| [Uri](../../aspose.svg.io/outputstream/uri/) { get; } | Obtient l'URI de l'emplacement du flux. |

## Méthodes

| Nom | La description |
| --- | --- |
| override [Close](../../aspose.svg.io/outputstream/close/)() | Ferme le flux de sortie encapsulé et le flux actuel. |
| override [Flush](../../aspose.svg.io/outputstream/flush/)() | Efface tous les tampons pour le flux de sortie enveloppé et provoque l'écriture de toutes les données mises en tampon sur le périphérique sous-jacent. |
| override [Read](../../aspose.svg.io/outputstream/read/)(byte[], int, int) | Lit une séquence d'octets à partir du flux de sortie encapsulé et avance la position dans le flux du nombre d'octets lus. |
| override [Seek](../../aspose.svg.io/outputstream/seek/)(long, SeekOrigin) | Définit la position dans le flux de sortie encapsulé. |
| override [SetLength](../../aspose.svg.io/outputstream/setlength/)(long) | Définit la longueur du flux de sortie encapsulé. |
| override [Write](../../aspose.svg.io/outputstream/write/)(byte[], int, int) | Écrit une séquence d'octets dans le flux de sortie encapsulé et avance la position actuelle dans ce flux du nombre de octets écrits. |

### Voir également

* espace de noms [Aspose.Svg.IO](../../aspose.svg.io/)
* Assemblée [Aspose.SVG](../../)


