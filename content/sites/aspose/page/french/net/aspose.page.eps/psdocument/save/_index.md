---
title: PsDocument.Save
second_title: Aspose.Page pour la référence de l'API .NET
description: PsDocument méthode. Enregistre le fichier PS/EPS sur un appareil.
type: docs
weight: 200
url: /fr/net/aspose.page.eps/psdocument/save/
---
## Save(Device, SaveOptions) {#save_1}

Enregistre le fichier PS/EPS sur un appareil.

```csharp
public override void Save(Device device, SaveOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| device | Device | Un périphérique de sortie. |
| options | SaveOptions | Contient des indicateurs qui spécifient la sortie des erreurs générées lors de la conversion. |

### Voir également

* class [Device](../../../aspose.page/device/)
* class [SaveOptions](../../../aspose.page/saveoptions/)
* class [PsDocument](../)
* espace de noms [Aspose.Page.EPS](../../psdocument/)
* Assemblée [Aspose.Page](../../../)

---

## Save(Stream) {#save_2}

Sauvegardes données[`PsDocument`](../) sous forme de fichier EPS. Cette méthode est utilisée uniquement après la mise à jour des métadonnées XMP. Elle enregistre le fichier EPS initial avec les métadonnées existantes mises à jour ou les nouvelles créées lors de l'appel de la méthode GetMetadata. Dans le dernier cas, tous les codes PostScript et commentaires EPS nécessaires sont ajoutés.

```csharp
public void Save(Stream epsStream)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| epsStream | Stream | Flux de fichier EPS de sortie. |

### Voir également

* class [PsDocument](../)
* espace de noms [Aspose.Page.EPS](../../psdocument/)
* Assemblée [Aspose.Page](../../../)

---

## Save() {#save}

Sauvegardes données[`PsDocument`](../) sous forme de fichier EPS. Cette méthode est utilisée uniquement lorsque PsDocument a été créé à partir de zéro.

```csharp
public void Save()
```

### Voir également

* class [PsDocument](../)
* espace de noms [Aspose.Page.EPS](../../psdocument/)
* Assemblée [Aspose.Page](../../../)


