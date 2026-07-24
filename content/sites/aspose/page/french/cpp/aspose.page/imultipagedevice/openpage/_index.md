---
title: "Méthode Aspose::Page::IMultiPageDevice::OpenPage"
linktitle: "OpenPage"
second_title: "Aspose.Page pour C++"
description: "Méthode Aspose::Page::IMultiPageDevice::OpenPage. Effectue les préparations nécessaires de l'appareil avant le rendu de chaque page en C++."
type: docs
weight: 400
url: /fr/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


Effectue les préparations nécessaires du dispositif avant le rendu de chaque page.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| width | float | Une largeur de la page. |
| height | float | Une hauteur de la page. |

### ReturnValue

Renvoie true si la page ouverte possède un numéro qui se situe dans la plage des numéros de pages sélectionnés, sinon false.

## Voir aussi

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


Effectue les préparations nécessaires du dispositif avant le rendu de la page.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| titre | System::String | Le titre de la page. |

### ReturnValue

True si la page provient de la plage demandée, sinon false. Utilisé dans les appareils qui peuvent rendre un tableau spécifié de numéros de pages.

## Voir aussi

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
