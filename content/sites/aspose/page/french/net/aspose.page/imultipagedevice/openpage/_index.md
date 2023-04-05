---
title: IMultiPageDevice.OpenPage
second_title: Aspose.Page pour la référence de l'API .NET
description: IMultiPageDevice méthode. Rend la préparation nécessaire de lappareil avant le rendu de la page.
type: docs
weight: 40
url: /fr/net/aspose.page/imultipagedevice/openpage/
---
## OpenPage(string) {#openpage_1}

Rend la préparation nécessaire de l'appareil avant le rendu de la page.

```csharp
public bool OpenPage(string title)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| title | String | Le titre de la page. |

### Return_Value

Vrai si la page est de la plage demandée, sinon faux. Utilisé dans les appareils qui peuvent rendre un tableau spécifié de numéros de page.

### Voir également

* interface [IMultiPageDevice](../)
* espace de noms [Aspose.Page](../../imultipagedevice/)
* Assemblée [Aspose.Page](../../../)

---

## OpenPage(float, float) {#openpage}

Effectue la préparation nécessaire de l'appareil avant chaque rendu de page.

```csharp
public bool OpenPage(float width, float height)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| width | Single | Une largeur de page. |
| height | Single | Une hauteur de page. |

### Return_Value

Renvoie vrai si la page ouverte a un numéro compris dans une plage de numéros de page sélectionnés et faux dans le cas contraire.

### Voir également

* interface [IMultiPageDevice](../)
* espace de noms [Aspose.Page](../../imultipagedevice/)
* Assemblée [Aspose.Page](../../../)


