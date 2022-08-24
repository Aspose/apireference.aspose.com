---
title: Convert
second_title: Aspose.GIS für .NET-API-Referenz
description: Konvertieren Sie eine Ebene in ein anderes Format.
type: docs
weight: 180
url: /de/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Konvertieren Sie eine Ebene in ein anderes Format.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| sourcePath | String | Pfad zur Ebene, die konvertiert wird. |
| sourceDriver | FileDriver | Der Formattreiber für die Quellebene. |
| destinationPath | String | Pfad zu der Ebene, die als Ergebnis der Konvertierung erstellt wird. |
| destinationDriver | FileDriver | Der Formattreiber für die Zielebene. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Einer der Wege ist`null`. |

### Siehe auch

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Konvertieren Sie eine Ebene in ein anderes Format.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| sourcePath | AbstractPath | Pfad zur Ebene, die konvertiert wird. |
| sourceDriver | FileDriver | Der Formattreiber für die Quellebene. |
| destinationPath | AbstractPath | Pfad zu der Ebene, die als Ergebnis der Konvertierung erstellt wird. |
| destinationDriver | FileDriver | Der Formattreiber für die Zielebene. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Einer der Wege ist`null`. |

### Siehe auch

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Konvertieren Sie eine Ebene in ein anderes Format.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| sourcePath | String | Pfad zur Ebene, die konvertiert wird. |
| sourceDriver | FileDriver | Der Formattreiber für die Quellebene. |
| destinationPath | String | Pfad zu der Ebene, die als Ergebnis der Konvertierung erstellt wird. |
| destinationDriver | FileDriver | Der Formattreiber für die Zielebene. |
| options | ConversionOptions | Optionen für das Konvertierungsverfahren. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Einer der Wege ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Lesen oder Schreiben des Features in/aus der Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Räumliches Bezugssystem angegeben in*options*wird nicht unterstützt von*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Transformation der Feature-Geometrie vom Raumbezugssystem der Quelle zum Raumbezugssystem des Ziels fehlgeschlagen. |

### Siehe auch

* class [FileDriver](../../filedriver)
* class [ConversionOptions](../../conversionoptions)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Konvertieren Sie eine Ebene in ein anderes Format.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| sourcePath | AbstractPath | Pfad zur Ebene, die konvertiert wird. |
| sourceDriver | FileDriver | Der Formattreiber für die Quellebene. |
| destinationPath | AbstractPath | Pfad zu der Ebene, die als Ergebnis der Konvertierung erstellt wird. |
| destinationDriver | FileDriver | Der Formattreiber für die Zielebene. |
| options | ConversionOptions | Optionen für das Konvertierungsverfahren. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Einer der Wege ist`null`. |
| ArgumentException | Das Optionsobjekt hat einen falschen Typ für diesen Treiber. |
| [GisException](../../gisexception) | Fehler beim Lesen oder Schreiben des Features in/aus der Datei. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| NotSupportedException | Räumliches Bezugssystem angegeben in*options*wird nicht unterstützt von*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Transformation der Feature-Geometrie vom Raumbezugssystem der Quelle zum Raumbezugssystem des Ziels fehlgeschlagen. |

### Siehe auch

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [ConversionOptions](../../conversionoptions)
* class [VectorLayer](../../vectorlayer)
* namensraum [Aspose.Gis](../../vectorlayer)
* Montage [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
