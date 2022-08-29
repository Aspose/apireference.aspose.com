---
title: GenerateTemplate
second_title: Référence de l'API Aspose.OMR pour .NET
description: Crée un modèle .omr et une image de modèle basés sur MemoryStream
type: docs
weight: 40
url: /fr/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection) {#generatetemplate_2}

Crée un modèle (.omr) et une image de modèle basés sur MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Le flux qui contient les lignes de balisage |
| settings | GlobalPageSettings | Les paramètres globaux applicables à tous les éléments de la page |
| userImages | ImageCollection | Collection d'images pouvant être utilisées pour la génération d'un modèle. Autoriser l'utilisation d'images de MemoryStream au lieu du système de fichiers |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* espace de noms [Aspose.OMR.Api](../../omrengine)
* Assemblée [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection) {#generatetemplate_1}

Crée un modèle (.omr) et une image de modèle basés sur MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Le flux qui contient les lignes de balisage |
| userImages | ImageCollection | Collection d'images pouvant être utilisées pour la génération d'un modèle. Autoriser l'utilisation d'images de MemoryStream au lieu du système de fichiers |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* espace de noms [Aspose.OMR.Api](../../omrengine)
* Assemblée [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Crée un modèle (.omr) et une image de modèle basés sur un tableau de lignes de balisage

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| markupLines | String[] | Tableau des lignes de balisage |
| settings | GlobalPageSettings | Les paramètres globaux applicables à tous les éléments de la page |
| userImages | ImageCollection | Collection d'images pouvant être utilisées pour la génération d'un modèle. Autoriser l'utilisation d'images de MemoryStream au lieu du système de fichiers |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* espace de noms [Aspose.OMR.Api](../../omrengine)
* Assemblée [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Crée un modèle (.omr) et une image de modèle basés sur un tableau de lignes de balisage

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| markupLines | String[] | Tableau des lignes de balisage |
| userImages | ImageCollection | Collection d'images pouvant être utilisées pour la génération d'un modèle. Autoriser l'utilisation d'images de MemoryStream au lieu du système de fichiers |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* espace de noms [Aspose.OMR.Api](../../omrengine)
* Assemblée [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings) {#generatetemplate_4}

Crée un modèle (.omr) et une image de modèle basés sur le balisage de texte

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| markupPath | String | Chemin d'accès au fichier de balisage de texte |
| settings | GlobalPageSettings | Les paramètres globaux applicables à tous les éléments de la page |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [OmrEngine](../../omrengine)
* espace de noms [Aspose.OMR.Api](../../omrengine)
* Assemblée [Aspose.OMR](../../../)

---

## GenerateTemplate(string) {#generatetemplate_3}

Crée un modèle (.omr) et une image de modèle basés sur le balisage de texte

```csharp
public GenerationResult GenerateTemplate(string markupPath)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| markupPath | String | Chemin d'accès au fichier de balisage de texte |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* espace de noms [Aspose.OMR.Api](../../omrengine)
* Assemblée [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[]) {#generatetemplate_5}

Crée un modèle (.omr) et une image de modèle basés sur le balisage de texte

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| markupPath | String | Chemin d'accès au fichier de balisage de texte |
| imagesPaths | String[] | Chemins complets vers les images utilisées dans la génération |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* espace de noms [Aspose.OMR.Api](../../omrengine)
* Assemblée [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Crée un modèle (.omr) et une image de modèle basés sur l'objet Modèle

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| config | TemplateConfig | Objet modèle qui représente tous les éléments |
| settings | GlobalPageSettings | paramètres globaux utilisés dans toutes les générations de modèles |
| userImages | ImageCollection | Collection d'images pouvant être utilisées pour la génération d'un modèle. Autoriser l'utilisation d'images de MemoryStream au lieu du système de fichiers |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* espace de noms [Aspose.OMR.Api](../../omrengine)
* Assemblée [Aspose.OMR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->
