---
title: "PdfSaveOptions"
second_title: "Référence API Aspose.Page pour Java"
description: "Classe pour les options d'enregistrement XPS-as-PDF."
type: docs
weight: 14
url: /fr/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

Classe pour les options d'enregistrement XPS-as-PDF.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Crée une nouvelle instance d'options. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Renvoie les dossiers de polices supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. |
| [getBatchSize()](#getBatchSize--) | Renvoie la taille d'une portion de pages à transmettre d'un nœud à l'autre. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Renvoie la collection de gestionnaires d'événements qui effectuent des modifications d'une page XPS juste avant son enregistrement. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Obtient l'indicateur montrant s'il est nécessaire d'enregistrer les polices non TrueType en TTF. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Renvoie les détails du chiffrement. |
| [getExceptions()](#getExceptions--) | Renvoie une liste d'erreurs non critiques. |
| [getImageCompression()](#getImageCompression--) | Renvoie le type de compression à utiliser pour toutes les images du document. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Renvoie la valeur spécifiant le niveau de compression d'une image. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Obtient jusqu'à quel niveau le plan du document doit être développé lorsque le fichier PDF est ouvert dans un visualiseur. 1 - seuls les éléments du premier niveau sont affichés, 2 - seuls les éléments du premier et du deuxième niveau sont affichés, et ainsi de suite. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Obtient la hauteur de l'arbre du plan du document à enregistrer. 0 - l'arbre du plan ne sera pas converti, 1 - seuls les éléments du premier niveau seront convertis, et ainsi de suite. |
| [getPageNumbers()](#getPageNumbers--) | Obtient le tableau des numéros de pages à rendre. |
| [getSize()](#getSize--) | Obtient une taille de la page ou de l'image. |
| [getTextCompression()](#getTextCompression--) | Renvoie le type de compression à utiliser pour tous les flux de contenu sauf les images. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Obtient l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion. |
| [isSupressErrors()](#isSupressErrors--) | Renvoie une valeur indiquant si les erreurs seront supprimées pendant la conversion. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | Dans XPS, certains éléments de texte peuvent contenir des références à des formes de glyphes alternatives qui ne correspondent à aucun code de caractère dans la police. |
| [preserveText(boolean value)](#preserveText-boolean-) | Dans XPS, certains éléments de texte peuvent contenir des références à des formes de glyphes alternatives qui ne correspondent à aucun code de caractère dans la police. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Spécifie les dossiers de polices supplémentaires où le convertisseur doit trouver les polices pour le document d'entrée. |
| [setBatchSize(int value)](#setBatchSize-int-) | Définit la taille d'une portion de pages à transmettre d'un nœud à l'autre. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Spécifie s'il faut enregistrer les polices non TrueType en TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Spécifie l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Définit les détails du chiffrement. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Définit le type de compression à utiliser pour toutes les images du document. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Définit la valeur spécifiant le niveau de compression d'une image. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Définit jusqu'à quel niveau le plan du document doit être développé lorsque le fichier PDF est ouvert dans un visualiseur. 1 - seuls les éléments du premier niveau sont affichés, 2 - seuls les éléments du premier et du deuxième niveau sont affichés, et ainsi de suite. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Définit la hauteur de l'arbre du plan du document à enregistrer. 0 - l'arbre du plan ne sera pas converti, 1 - seuls les éléments du premier niveau seront convertis, et ainsi de suite. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Définit le tableau des numéros de pages à rendre. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Spécifie une taille de la page ou de l'image. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Spécifie le drapeau qui indique si les erreurs seront supprimées pendant la conversion. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Définit le type de compression à utiliser pour tous les flux de contenu sauf les images. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Crée une nouvelle instance d'options.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Renvoie les dossiers de polices supplémentaires où le convertisseur doit rechercher les polices pour le document d'entrée. Le dossier par défaut est le dossier de polices standard où le système d'exploitation trouve les polices pour les besoins internes.

**Returns:**
java.lang.String[] - Un tableau de dossiers de polices.
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Renvoie la taille d'une portion de pages à transmettre d'un nœud à l'autre.

**Returns:**
int - La taille d'une portion de pages à transmettre d'un nœud à l'autre.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Renvoie la collection de gestionnaires d'événements qui effectuent des modifications d'une page XPS juste avant son enregistrement.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - La collection de gestionnaires d'événements qui effectuent des modifications sur une page XPS juste avant qu'elle ne soit enregistrée.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


Obtient l'indicateur montrant s'il est nécessaire d'enregistrer les polices non TrueType en TTF.

**Returns:**
boolean - La valeur du drapeau.
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Renvoie les détails du chiffrement. Si non défini, aucun chiffrement ne sera effectué.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Renvoie une liste d'erreurs non critiques.

**Returns:**
java.util.List<java.lang.Exception> - Liste des exceptions
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Renvoie le type de compression à utiliser pour toutes les images du document. La valeur par défaut est PdfImageCompression.Auto.

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Renvoie la valeur spécifiant le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est bas, plus la compression est élevée et donc la qualité de l'image est moindre. Une valeur de 0 donne l'image de la plus basse qualité, tandis qu'une valeur de 100 donne la meilleure.

**Returns:**
int - La valeur spécifiant le niveau de compression d'une image.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Obtient jusqu'à quel niveau le plan du document doit être développé lorsque le fichier PDF est ouvert dans un visualiseur. 1 - seuls les éléments du premier niveau sont affichés, 2 - seuls les éléments du premier et du deuxième niveau sont affichés, et ainsi de suite.

**Returns:**
int - Le niveau d'expansion de l'arborescence du plan.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Obtient la hauteur de l'arborescence du plan du document à enregistrer. 0 - l'arborescence du plan ne sera pas convertie, 1 - seuls les éléments du premier niveau du plan seront convertis, etc. La valeur par défaut est 10.

**Returns:**
int - La hauteur de l'arborescence du plan.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Obtient le tableau des numéros de pages à rendre.

**Returns:**
int[] - Numéros de pages.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Obtient une taille de la page ou de l'image.

**Returns:**
java.awt.Dimension - Une taille de la page ou de l'image.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Renvoie le type de compression à utiliser pour tous les flux de contenu sauf les images. La valeur par défaut est PdfTextCompression.Flate.

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


Obtient l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion.

**Returns:**
boolean - valeur de débogage.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Renvoie une valeur indiquant si les erreurs seront supprimées pendant la conversion.

**Returns:**
booléen - valeur booléenne
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


Dans XPS, certains éléments de texte peuvent contenir des références à des formes de glyphes alternatives qui ne correspondent à aucun code de caractère dans la police. Si ce drapeau est défini sur true, le texte de ces éléments XPS est converti en formes graphiques. Le texte lui‑-même apparaît alors transparent au-dessus. Cela rend le texte de ces éléments sélectionnable. Mais l'effet secondaire est que le fichier de sortie peut être beaucoup plus volumineux que l'original. Si ce drapeau est défini sur false, les caractères qui devraient être affichés sous forme de glyphes alternatifs sont remplacés par d'autres caractères qui sont mappés aux formes de glyphes alternatives. Ainsi, le texte, bien qu'encore sélectionnable, sera modifié et deviendra probablement illisible.

**Returns:**
boolean - La valeur du drapeau.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


Dans XPS, certains éléments de texte peuvent contenir des références à des formes de glyphes alternatives qui ne correspondent à aucun code de caractère dans la police. Si ce drapeau est défini sur true, le texte de ces éléments XPS est converti en formes graphiques. Le texte lui‑-même apparaît alors transparent au-dessus. Cela rend le texte de ces éléments sélectionnable. Mais l'effet secondaire est que le fichier de sortie peut être beaucoup plus volumineux que l'original. Si ce drapeau est défini sur false, les caractères qui devraient être affichés sous forme de glyphes alternatifs sont remplacés par d'autres caractères qui sont mappés aux formes de glyphes alternatives. Ainsi, le texte, bien qu'encore sélectionnable, sera modifié et deviendra probablement illisible.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | boolean | La valeur du drapeau. |

### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


Spécifie les dossiers de polices supplémentaires où le convertisseur doit rechercher les polices pour le document d'entrée. Le dossier par défaut est le dossier de polices standard où le système d'exploitation trouve les polices pour les besoins internes.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Un tableau de dossiers de polices. |

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Définit la taille d'une portion de pages à transmettre d'un nœud à l'autre.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int | La taille d'une portion de pages à transmettre d'un nœud à l'autre. |

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Spécifie s'il faut enregistrer les polices non-TrueType au format TTF. Cela réduit considérablement le volume du document résultant lors de la conversion PS en PDF et augmente la vitesse de conversion des fichiers PS contenant une grande quantité de texte en polices non-TrueType vers n'importe quel format de sortie. Cependant, il y a un léger décalage vertical du texte lors de la conversion d'un fichier PostSctipt en image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | boolean | La valeur du drapeau. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Spécifie l'indicateur qui permet la sortie des avertissements et des messages pendant la conversion.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| debug | boolean | Valeur booléenne. |

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Définit les détails du chiffrement. S'ils ne sont pas définis, aucun chiffrement ne sera effectué.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | Les détails du chiffrement. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Définit le type de compression à utiliser pour toutes les images du document. La valeur par défaut est PdfImageCompression.Auto.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | Le type de compression. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Définit la valeur spécifiant le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre spécifié est bas, plus la compression est élevée et donc la qualité de l'image est moindre. Une valeur de 0 donne l'image de la plus basse qualité, tandis qu'une valeur de 100 donne la meilleure.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int | La valeur spécifiant le niveau de compression d'une image. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Définit jusqu'à quel niveau le plan du document doit être développé lorsque le fichier PDF est ouvert dans un visualiseur. 1 - seuls les éléments du premier niveau sont affichés, 2 - seuls les éléments du premier et du deuxième niveau sont affichés, et ainsi de suite.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int | Le niveau d'expansion de l'arborescence du plan. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Définit la hauteur de l'arbre du plan du document à enregistrer. 0 - l'arbre du plan ne sera pas converti, 1 - seuls les éléments du premier niveau seront convertis, et ainsi de suite.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int | La hauteur de l'arborescence du plan. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Définit le tableau des numéros de pages à rendre.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int[] | Nombre de pages. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Spécifie une taille de la page ou de l'image.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| taille | java.awt.Dimension | Taille de la page ou de l'image. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Spécifie le drapeau qui indique si les erreurs seront supprimées pendant la conversion.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| supressErrors | boolean | Valeur booléenne. |

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Définit le type de compression à utiliser pour tous les flux de contenu sauf les images. La valeur par défaut est PdfTextCompression.Flate.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | Le type de compression. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

