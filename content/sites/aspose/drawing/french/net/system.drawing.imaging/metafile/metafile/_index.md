---
title: Metafile
second_title: Référence de l'API Aspose.Drawing pour .NET
description: Initialise une nouvelle instance duMetafilesystem.drawing.imaging/metafile classe à partir du handle spécifié.
type: docs
weight: 10
url: /fr/net/system.drawing.imaging/metafile/metafile/
---
## Metafile(IntPtr, bool) {#constructor}

Initialise une nouvelle instance du[`Metafile`](../../metafile) classe à partir du handle spécifié.

```csharp
public Metafile(IntPtr henhmetafile, bool deleteEmf)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| henhmetafile | IntPtr | Descripteur d'un métafichier amélioré. |
| deleteEmf | Boolean | true pour supprimer le descripteur de métafichier amélioré when theMetafile est supprimé; sinon, faux. |

### Voir également

* class [Metafile](../../metafile)
* espace de noms [System.Drawing.Imaging](../../metafile)
* Assemblée [Aspose.Drawing](../../../)

---

## Metafile(IntPtr, EmfType) {#constructor_1}

Initialise une nouvelle instance du[`Metafile`](../../metafile) classe du handle spécifié vers un contexte de périphérique et unEmfTypeénumération qui spécifie le format de laMetafile .

```csharp
public Metafile(IntPtr referenceHdc, EmfType emfType)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| referenceHdc | IntPtr | Descripteur d'un contexte de périphérique. |
| emfType | EmfType | UnEmfType qui spécifie le format duMetafile. |

### Voir également

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* espace de noms [System.Drawing.Imaging](../../metafile)
* Assemblée [Aspose.Drawing](../../../)

---

## Metafile(string) {#constructor_6}

Initialise une nouvelle instance du[`Metafile`](../../metafile) class à partir du nom de fichier spécifié.

```csharp
public Metafile(string filename)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| filename | String | UNString qui représente le nom de fichier à partir duquel créer le nouveauMetafile. |

### Voir également

* class [Metafile](../../metafile)
* espace de noms [System.Drawing.Imaging](../../metafile)
* Assemblée [Aspose.Drawing](../../../)

---

## Metafile(string, IntPtr) {#constructor_7}

Initialise une nouvelle instance du[`Metafile`](../../metafile) class à partir du nom de fichier spécifié.

```csharp
public Metafile(string filename, IntPtr referenceHdc)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| filename | String | UNString qui représente le nom de fichier à partir duquel créer le nouveauMetafile. |
| referenceHdc | IntPtr | Un handle Windows vers un contexte de périphérique. |

### Voir également

* class [Metafile](../../metafile)
* espace de noms [System.Drawing.Imaging](../../metafile)
* Assemblée [Aspose.Drawing](../../../)

---

## Metafile(Stream) {#constructor_2}

Initialise une nouvelle instance du[`Metafile`](../../metafile) classe du flux de données spécifié.

```csharp
public Metafile(Stream stream)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | Stream | LaStream à partir duquel créer le nouveauMetafile. |

### Voir également

* class [Metafile](../../metafile)
* espace de noms [System.Drawing.Imaging](../../metafile)
* Assemblée [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr) {#constructor_3}

Initialise une nouvelle instance du[`Metafile`](../../metafile) classe du flux de données specified et un handle Windows vers un contexte de périphérique. /&gt;.

```csharp
public Metafile(Stream stream, IntPtr referenceHdc)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | Stream | UNStream qui contient les données pour ceMetafile. |
| referenceHdc | IntPtr | Un handle Windows vers un contexte de périphérique duMetafile objet. |

### Voir également

* class [Metafile](../../metafile)
* espace de noms [System.Drawing.Imaging](../../metafile)
* Assemblée [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, EmfType) {#constructor_4}

Initialise une nouvelle instance du[`Metafile`](../../metafile) classe du flux de données spécifié , un handle Windows vers un contexte de périphérique et unEmfType enumeration qui spécifie le format duMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, EmfType type)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | Stream | UNStream qui contient les données pour ceMetafile. |
| referenceHdc | IntPtr | Un handle Windows vers un contexte de périphérique. |
| type | EmfType | UnEmfType qui spécifie le format duMetafile. |

### Voir également

* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* espace de noms [System.Drawing.Imaging](../../metafile)
* Assemblée [Aspose.Drawing](../../../)

---

## Metafile(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) {#constructor_5}

Initialise une nouvelle instance du[`Metafile`](../../metafile) classe du flux de données spécifié , un handle Windows vers un contexte de périphérique et unEmfType enumeration qui spécifie le format duMetafile .

```csharp
public Metafile(Stream stream, IntPtr referenceHdc, RectangleF frameRect, 
    MetafileFrameUnit frameUnit, EmfType type)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| stream | Stream | UNStream qui contient les données pour ceMetafile. |
| referenceHdc | IntPtr | Un handle Windows vers un contexte de périphérique. |
| frameRect | RectangleF | UNRectangle qui représente le rectangle qui délimite le nouveauMetafile . |
| frameUnit | MetafileFrameUnit | UNMetafileFrameUnit qui spécifie l'unité de mesure pour frameRect. |
| type | EmfType | UnEmfType qui spécifie le format duMetafile. |

### Voir également

* struct [RectangleF](../../../system.drawing/rectanglef)
* enum [MetafileFrameUnit](../../metafileframeunit)
* enum [EmfType](../../emftype)
* class [Metafile](../../metafile)
* espace de noms [System.Drawing.Imaging](../../metafile)
* Assemblée [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
