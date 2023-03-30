---
title: OmrEngine.GenerateTemplate
second_title: Référence de l'API Aspose.OMR pour .NET
description: OmrEngine méthode. Crée un modèle .omr et une image de modèle basés sur MemoryStream
type: docs
weight: 40
url: /fr/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

Crée un modèle (.omr) et une image de modèle basés sur MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Le flux qui contient les lignes de balisage |
| settings | GlobalPageSettings | Les paramètres globaux applicables à tous les éléments de la page |
| userImages | ImageCollection | Collection d'images pouvant être utilisées pour la génération d'un modèle. Autoriser l'utilisation d'images de MemoryStream au lieu du système de fichiers |
| encoding | Encoding | encodage des lignes de balisage, par défaut UTF-8 est utilisé |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* espace de noms [Aspose.OMR.Api](../../omrengine/)
* Assemblée [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

Crée un modèle (.omr) et une image de modèle basés sur MemoryStream

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | MemoryStream | Le flux qui contient les lignes de balisage |
| userImages | ImageCollection | Collection d'images pouvant être utilisées pour la génération d'un modèle. Autoriser l'utilisation d'images de MemoryStream au lieu du système de fichiers |
| encoding | Encoding | encodage des lignes de balisage, par défaut UTF-8 est utilisé |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* espace de noms [Aspose.OMR.Api](../../omrengine/)
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

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* espace de noms [Aspose.OMR.Api](../../omrengine/)
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

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* espace de noms [Aspose.OMR.Api](../../omrengine/)
* Assemblée [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

Crée un modèle (.omr) et une image de modèle basés sur le balisage de texte

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| markupPath | String | Chemin d'accès au fichier de balisage de texte |
| settings | GlobalPageSettings | Les paramètres globaux applicables à tous les éléments de la page |
| encoding | Encoding | encodage du fichier de balisage, par défaut UTF-8 est utilisé |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* espace de noms [Aspose.OMR.Api](../../omrengine/)
* Assemblée [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

Crée un modèle (.omr) et une image de modèle basés sur le balisage de texte

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| markupPath | String | Chemin d'accès au fichier de balisage de texte |
| encoding | Encoding | encodage du fichier de balisage, par défaut UTF-8 est utilisé |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* espace de noms [Aspose.OMR.Api](../../omrengine/)
* Assemblée [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

Crée un modèle (.omr) et une image de modèle basés sur le balisage de texte

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| markupPath | String | Chemin d'accès au fichier de balisage de texte |
| imagesPaths | String[] | Chemins complets vers les images utilisées dans la génération |
| encoding | Encoding | encodage du fichier de balisage, par défaut UTF-8 est utilisé |

### Return_Value

Résultat de la génération

### Voir également

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* espace de noms [Aspose.OMR.Api](../../omrengine/)
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

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* espace de noms [Aspose.OMR.Api](../../omrengine/)
* Assemblée [Aspose.OMR](../../../)


